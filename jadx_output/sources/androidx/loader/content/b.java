package androidx.loader.content;

/* loaded from: classes13.dex */
public abstract class b extends androidx.loader.content.e {
    static final boolean DEBUG = false;
    static final java.lang.String TAG = "AsyncTaskLoader";
    volatile androidx.loader.content.a mCancellingTask;
    private final java.util.concurrent.Executor mExecutor;
    android.os.Handler mHandler;
    long mLastLoadCompleteTime;
    volatile androidx.loader.content.a mTask;
    long mUpdateThrottle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context) {
        super(context);
        java.util.concurrent.Executor executor = androidx.loader.content.m.f11686i;
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = executor;
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(androidx.loader.content.a aVar, java.lang.Object obj) {
        onCanceled(obj);
        if (this.mCancellingTask == aVar) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = android.os.SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(androidx.loader.content.a aVar, java.lang.Object obj) {
        if (this.mTask != aVar) {
            dispatchOnCancelled(aVar, obj);
            return;
        }
        if (isAbandoned()) {
            onCanceled(obj);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = android.os.SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(obj);
    }

    @Override // androidx.loader.content.e
    @java.lang.Deprecated
    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f11674o);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f11674o);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            long j17 = this.mUpdateThrottle;
            java.lang.Object obj = m3.j.f323097a;
            synchronized (obj) {
                printWriter.print(new java.lang.String(m3.j.f323098b, 0, m3.j.b(j17, 0)));
            }
            printWriter.print(" mLastLoadCompleteTime=");
            long j18 = this.mLastLoadCompleteTime;
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            if (j18 == 0) {
                printWriter.print("--");
            } else {
                long j19 = j18 - uptimeMillis;
                synchronized (obj) {
                    printWriter.print(new java.lang.String(m3.j.f323098b, 0, m3.j.b(j19, 0)));
                }
            }
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f11674o) {
            this.mTask.f11674o = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && android.os.SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.f11674o = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            return;
        }
        androidx.loader.content.a aVar = this.mTask;
        java.util.concurrent.Executor executor = this.mExecutor;
        if (aVar.f11690f == androidx.loader.content.k.PENDING) {
            aVar.f11690f = androidx.loader.content.k.RUNNING;
            aVar.f11688d.f11685d = null;
            executor.execute(aVar.f11689e);
        } else {
            int ordinal = aVar.f11690f.ordinal();
            if (ordinal == 1) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (ordinal == 2) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new java.lang.IllegalStateException("We should never reach this state");
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract java.lang.Object loadInBackground();

    @Override // androidx.loader.content.e
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f11674o) {
                this.mTask.f11674o = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.f11674o) {
            this.mTask.f11674o = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        androidx.loader.content.a aVar = this.mTask;
        aVar.f11691g.set(true);
        boolean cancel = aVar.f11689e.cancel(false);
        if (cancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return cancel;
    }

    public void onCanceled(java.lang.Object obj) {
    }

    @Override // androidx.loader.content.e
    public void onForceLoad() {
        cancelLoad();
        this.mTask = new androidx.loader.content.a(this);
        executePendingTask();
    }

    public java.lang.Object onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j17) {
        this.mUpdateThrottle = j17;
        if (j17 != 0) {
            this.mHandler = new android.os.Handler();
        }
    }

    public void waitForLoader() {
        androidx.loader.content.a aVar = this.mTask;
        if (aVar != null) {
            try {
                aVar.f11673n.await();
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }
}
