package p012xc85e97e9.p094xbe953013.p095x38b73479;

/* loaded from: classes13.dex */
public abstract class b extends p012xc85e97e9.p094xbe953013.p095x38b73479.e {

    /* renamed from: DEBUG */
    static final boolean f3567x3de9e33 = false;
    static final java.lang.String TAG = "AsyncTaskLoader";

    /* renamed from: mCancellingTask */
    volatile p012xc85e97e9.p094xbe953013.p095x38b73479.a f3568xd6b18ce2;

    /* renamed from: mExecutor */
    private final java.util.concurrent.Executor f3569x9ec3a060;

    /* renamed from: mHandler */
    android.os.Handler f3570xc7640a1d;

    /* renamed from: mLastLoadCompleteTime */
    long f3571x88404a6f;

    /* renamed from: mTask */
    volatile p012xc85e97e9.p094xbe953013.p095x38b73479.a f3572x627ab92;

    /* renamed from: mUpdateThrottle */
    long f3573x92fc58e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context) {
        super(context);
        java.util.concurrent.Executor executor = p012xc85e97e9.p094xbe953013.p095x38b73479.m.f93219i;
        this.f3571x88404a6f = -10000L;
        this.f3569x9ec3a060 = executor;
    }

    /* renamed from: cancelLoadInBackground */
    public void m7825x725202d3() {
    }

    /* renamed from: dispatchOnCancelled */
    public void m7826x21f91958(p012xc85e97e9.p094xbe953013.p095x38b73479.a aVar, java.lang.Object obj) {
        m7833x9dc2a798(obj);
        if (this.f3568xd6b18ce2 == aVar) {
            m7858x79da67ff();
            this.f3571x88404a6f = android.os.SystemClock.uptimeMillis();
            this.f3568xd6b18ce2 = null;
            m7842xf59256c8();
            m7829x182c7507();
        }
    }

    /* renamed from: dispatchOnLoadComplete */
    public void m7827xe65652d8(p012xc85e97e9.p094xbe953013.p095x38b73479.a aVar, java.lang.Object obj) {
        if (this.f3572x627ab92 != aVar) {
            m7826x21f91958(aVar, obj);
            return;
        }
        if (m7847x50553ca()) {
            m7833x9dc2a798(obj);
            return;
        }
        m7840xca68512();
        this.f3571x88404a6f = android.os.SystemClock.uptimeMillis();
        this.f3572x627ab92 = null;
        m7843xaa7a8da2(obj);
    }

    @Override // p012xc85e97e9.p094xbe953013.p095x38b73479.e
    @java.lang.Deprecated
    /* renamed from: dump */
    public void mo7828x2f39f4(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.f3577x753a6c41);
        if (this.f3581x2d03f354 || this.f3575x47eb85c8 || this.f3579xe1f51f30) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f3581x2d03f354);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f3575x47eb85c8);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f3579xe1f51f30);
        }
        if (this.f3574x397f5be7 || this.f3580xbeb368e2) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f3574x397f5be7);
            printWriter.print(" mReset=");
            printWriter.println(this.f3580xbeb368e2);
        }
        if (this.f3572x627ab92 != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f3572x627ab92);
            printWriter.print(" waiting=");
            printWriter.println(this.f3572x627ab92.f93207o);
        }
        if (this.f3568xd6b18ce2 != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f3568xd6b18ce2);
            printWriter.print(" waiting=");
            printWriter.println(this.f3568xd6b18ce2.f93207o);
        }
        if (this.f3573x92fc58e0 != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            long j17 = this.f3573x92fc58e0;
            java.lang.Object obj = m3.j.f404630a;
            synchronized (obj) {
                printWriter.print(new java.lang.String(m3.j.f404631b, 0, m3.j.b(j17, 0)));
            }
            printWriter.print(" mLastLoadCompleteTime=");
            long j18 = this.f3571x88404a6f;
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            if (j18 == 0) {
                printWriter.print("--");
            } else {
                long j19 = j18 - uptimeMillis;
                synchronized (obj) {
                    printWriter.print(new java.lang.String(m3.j.f404631b, 0, m3.j.b(j19, 0)));
                }
            }
            printWriter.println();
        }
    }

    /* renamed from: executePendingTask */
    public void m7829x182c7507() {
        if (this.f3568xd6b18ce2 != null || this.f3572x627ab92 == null) {
            return;
        }
        if (this.f3572x627ab92.f93207o) {
            this.f3572x627ab92.f93207o = false;
            this.f3570xc7640a1d.removeCallbacks(this.f3572x627ab92);
        }
        if (this.f3573x92fc58e0 > 0 && android.os.SystemClock.uptimeMillis() < this.f3571x88404a6f + this.f3573x92fc58e0) {
            this.f3572x627ab92.f93207o = true;
            this.f3570xc7640a1d.postAtTime(this.f3572x627ab92, this.f3571x88404a6f + this.f3573x92fc58e0);
            return;
        }
        p012xc85e97e9.p094xbe953013.p095x38b73479.a aVar = this.f3572x627ab92;
        java.util.concurrent.Executor executor = this.f3569x9ec3a060;
        if (aVar.f93223f == p012xc85e97e9.p094xbe953013.p095x38b73479.k.PENDING) {
            aVar.f93223f = p012xc85e97e9.p094xbe953013.p095x38b73479.k.RUNNING;
            aVar.f93221d.f93218d = null;
            executor.execute(aVar.f93222e);
        } else {
            int ordinal = aVar.f93223f.ordinal();
            if (ordinal == 1) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (ordinal == 2) {
                throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new java.lang.IllegalStateException("We should never reach this state");
        }
    }

    /* renamed from: isLoadInBackgroundCanceled */
    public boolean m7830xd09b373c() {
        return this.f3568xd6b18ce2 != null;
    }

    /* renamed from: loadInBackground */
    public abstract java.lang.Object mo7831x333bc439();

    @Override // p012xc85e97e9.p094xbe953013.p095x38b73479.e
    /* renamed from: onCancelLoad */
    public boolean mo7832x37abf9bf() {
        if (this.f3572x627ab92 == null) {
            return false;
        }
        if (!this.f3581x2d03f354) {
            this.f3575x47eb85c8 = true;
        }
        if (this.f3568xd6b18ce2 != null) {
            if (this.f3572x627ab92.f93207o) {
                this.f3572x627ab92.f93207o = false;
                this.f3570xc7640a1d.removeCallbacks(this.f3572x627ab92);
            }
            this.f3572x627ab92 = null;
            return false;
        }
        if (this.f3572x627ab92.f93207o) {
            this.f3572x627ab92.f93207o = false;
            this.f3570xc7640a1d.removeCallbacks(this.f3572x627ab92);
            this.f3572x627ab92 = null;
            return false;
        }
        p012xc85e97e9.p094xbe953013.p095x38b73479.a aVar = this.f3572x627ab92;
        aVar.f93224g.set(true);
        boolean cancel = aVar.f93222e.cancel(false);
        if (cancel) {
            this.f3568xd6b18ce2 = this.f3572x627ab92;
            m7825x725202d3();
        }
        this.f3572x627ab92 = null;
        return cancel;
    }

    /* renamed from: onCanceled */
    public void m7833x9dc2a798(java.lang.Object obj) {
    }

    @Override // p012xc85e97e9.p094xbe953013.p095x38b73479.e
    /* renamed from: onForceLoad */
    public void mo7834x593a9352() {
        m7839x708e9a80();
        this.f3572x627ab92 = new p012xc85e97e9.p094xbe953013.p095x38b73479.a(this);
        m7829x182c7507();
    }

    /* renamed from: onLoadInBackground */
    public java.lang.Object m7835xe53e7838() {
        return mo7831x333bc439();
    }

    /* renamed from: setUpdateThrottle */
    public void m7836x42d78415(long j17) {
        this.f3573x92fc58e0 = j17;
        if (j17 != 0) {
            this.f3570xc7640a1d = new android.os.Handler();
        }
    }

    /* renamed from: waitForLoader */
    public void m7837x38259047() {
        p012xc85e97e9.p094xbe953013.p095x38b73479.a aVar = this.f3572x627ab92;
        if (aVar != null) {
            try {
                aVar.f93206n.await();
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }
}
