package androidx.loader.content;

/* loaded from: classes13.dex */
public abstract class e {
    android.content.Context mContext;
    int mId;
    androidx.loader.content.d mListener;
    androidx.loader.content.c mOnLoadCanceledListener;
    boolean mStarted = false;
    boolean mAbandoned = false;
    boolean mReset = true;
    boolean mContentChanged = false;
    boolean mProcessingChange = false;

    public e(android.content.Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public java.lang.String dataToString(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(64);
        m3.b.a(obj, sb6);
        sb6.append("}");
        return sb6.toString();
    }

    public void deliverCancellation() {
    }

    public void deliverResult(java.lang.Object obj) {
        androidx.loader.content.d dVar = this.mListener;
        if (dVar != null) {
            a4.c cVar = (a4.c) dVar;
            cVar.getClass();
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                cVar.setValue(obj);
            } else {
                cVar.postValue(obj);
            }
        }
    }

    public abstract void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

    public void forceLoad() {
        onForceLoad();
    }

    public android.content.Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public void onAbandon() {
    }

    public abstract boolean onCancelLoad();

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public abstract void onForceLoad();

    public void onReset() {
    }

    public abstract void onStartLoading();

    public void onStopLoading() {
    }

    public void registerListener(int i17, androidx.loader.content.d dVar) {
        if (this.mListener != null) {
            throw new java.lang.IllegalStateException("There is already a listener registered");
        }
        this.mListener = dVar;
        this.mId = i17;
    }

    public void registerOnLoadCanceledListener(androidx.loader.content.c cVar) {
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z17 = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z17;
        return z17;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(64);
        m3.b.a(this, sb6);
        sb6.append(" id=");
        sb6.append(this.mId);
        sb6.append("}");
        return sb6.toString();
    }

    public void unregisterListener(androidx.loader.content.d dVar) {
        androidx.loader.content.d dVar2 = this.mListener;
        if (dVar2 == null) {
            throw new java.lang.IllegalStateException("No listener register");
        }
        if (dVar2 != dVar) {
            throw new java.lang.IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mListener = null;
    }

    public void unregisterOnLoadCanceledListener(androidx.loader.content.c cVar) {
        throw new java.lang.IllegalStateException("No listener register");
    }
}
