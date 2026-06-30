package p012xc85e97e9.p094xbe953013.p095x38b73479;

/* loaded from: classes13.dex */
public abstract class e {

    /* renamed from: mContext */
    android.content.Context f3576xd6cfe882;
    int mId;

    /* renamed from: mListener */
    p012xc85e97e9.p094xbe953013.p095x38b73479.d f3577x753a6c41;

    /* renamed from: mOnLoadCanceledListener */
    p012xc85e97e9.p094xbe953013.p095x38b73479.c f3578x4b500abf;

    /* renamed from: mStarted */
    boolean f3581x2d03f354 = false;

    /* renamed from: mAbandoned */
    boolean f3574x397f5be7 = false;

    /* renamed from: mReset */
    boolean f3580xbeb368e2 = true;

    /* renamed from: mContentChanged */
    boolean f3575x47eb85c8 = false;

    /* renamed from: mProcessingChange */
    boolean f3579xe1f51f30 = false;

    public e(android.content.Context context) {
        this.f3576xd6cfe882 = context.getApplicationContext();
    }

    /* renamed from: abandon */
    public void m7838xb801ce75() {
        this.f3574x397f5be7 = true;
        m7850x7a7cf96();
    }

    /* renamed from: cancelLoad */
    public boolean m7839x708e9a80() {
        return mo7832x37abf9bf();
    }

    /* renamed from: commitContentChanged */
    public void m7840xca68512() {
        this.f3579xe1f51f30 = false;
    }

    /* renamed from: dataToString */
    public java.lang.String m7841xe5325c36(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(64);
        m3.b.a(obj, sb6);
        sb6.append("}");
        return sb6.toString();
    }

    /* renamed from: deliverCancellation */
    public void m7842xf59256c8() {
    }

    /* renamed from: deliverResult */
    public void m7843xaa7a8da2(java.lang.Object obj) {
        p012xc85e97e9.p094xbe953013.p095x38b73479.d dVar = this.f3577x753a6c41;
        if (dVar != null) {
            a4.c cVar = (a4.c) dVar;
            cVar.getClass();
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                cVar.mo523x53d8522f(obj);
            } else {
                cVar.mo7808x76db6cb1(obj);
            }
        }
    }

    /* renamed from: dump */
    public abstract void mo7828x2f39f4(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr);

    /* renamed from: forceLoad */
    public void m7844x5b105671() {
        mo7834x593a9352();
    }

    /* renamed from: getContext */
    public android.content.Context m7845x76847179() {
        return this.f3576xd6cfe882;
    }

    /* renamed from: getId */
    public int m7846x5db1b11() {
        return this.mId;
    }

    /* renamed from: isAbandoned */
    public boolean m7847x50553ca() {
        return this.f3574x397f5be7;
    }

    /* renamed from: isReset */
    public boolean m7848x7b5eca45() {
        return this.f3580xbeb368e2;
    }

    /* renamed from: isStarted */
    public boolean m7849x6c5c87f7() {
        return this.f3581x2d03f354;
    }

    /* renamed from: onAbandon */
    public void m7850x7a7cf96() {
    }

    /* renamed from: onCancelLoad */
    public abstract boolean mo7832x37abf9bf();

    /* renamed from: onContentChanged */
    public void m7851x700623ba() {
        if (this.f3581x2d03f354) {
            m7844x5b105671();
        } else {
            this.f3575x47eb85c8 = true;
        }
    }

    /* renamed from: onForceLoad */
    public abstract void mo7834x593a9352();

    /* renamed from: onReset */
    public void m7852xb03bf2b0() {
    }

    /* renamed from: onStartLoading */
    public abstract void mo7853x814fedf9();

    /* renamed from: onStopLoading */
    public void m7854xe40b537b() {
    }

    /* renamed from: registerListener */
    public void m7855x42780477(int i17, p012xc85e97e9.p094xbe953013.p095x38b73479.d dVar) {
        if (this.f3577x753a6c41 != null) {
            throw new java.lang.IllegalStateException("There is already a listener registered");
        }
        this.f3577x753a6c41 = dVar;
        this.mId = i17;
    }

    /* renamed from: registerOnLoadCanceledListener */
    public void m7856xe52c0c75(p012xc85e97e9.p094xbe953013.p095x38b73479.c cVar) {
    }

    /* renamed from: reset */
    public void m7857x6761d4f() {
        m7852xb03bf2b0();
        this.f3580xbeb368e2 = true;
        this.f3581x2d03f354 = false;
        this.f3574x397f5be7 = false;
        this.f3575x47eb85c8 = false;
        this.f3579xe1f51f30 = false;
    }

    /* renamed from: rollbackContentChanged */
    public void m7858x79da67ff() {
        if (this.f3579xe1f51f30) {
            m7851x700623ba();
        }
    }

    /* renamed from: startLoading */
    public final void m7859xc0d627a() {
        this.f3581x2d03f354 = true;
        this.f3580xbeb368e2 = false;
        this.f3574x397f5be7 = false;
        mo7853x814fedf9();
    }

    /* renamed from: stopLoading */
    public void m7860xc77ccada() {
        this.f3581x2d03f354 = false;
        m7854xe40b537b();
    }

    /* renamed from: takeContentChanged */
    public boolean m7861x637f8462() {
        boolean z17 = this.f3575x47eb85c8;
        this.f3575x47eb85c8 = false;
        this.f3579xe1f51f30 |= z17;
        return z17;
    }

    /* renamed from: toString */
    public java.lang.String m7862x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(64);
        m3.b.a(this, sb6);
        sb6.append(" id=");
        sb6.append(this.mId);
        sb6.append("}");
        return sb6.toString();
    }

    /* renamed from: unregisterListener */
    public void m7863xc221c110(p012xc85e97e9.p094xbe953013.p095x38b73479.d dVar) {
        p012xc85e97e9.p094xbe953013.p095x38b73479.d dVar2 = this.f3577x753a6c41;
        if (dVar2 == null) {
            throw new java.lang.IllegalStateException("No listener register");
        }
        if (dVar2 != dVar) {
            throw new java.lang.IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f3577x753a6c41 = null;
    }

    /* renamed from: unregisterOnLoadCanceledListener */
    public void m7864x1f3f494e(p012xc85e97e9.p094xbe953013.p095x38b73479.c cVar) {
        throw new java.lang.IllegalStateException("No listener register");
    }
}
