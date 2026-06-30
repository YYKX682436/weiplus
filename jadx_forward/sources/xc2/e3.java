package xc2;

/* loaded from: classes2.dex */
public final class e3 extends p012xc85e97e9.p093xedfae76a.j0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f534657d = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f534658e;

    @Override // p012xc85e97e9.p093xedfae76a.g0
    /* renamed from: getValue */
    public java.lang.Object mo3195x754a37bb() {
        java.lang.Object obj = this.f534658e;
        return obj == null ? super.mo3195x754a37bb() : obj;
    }

    @Override // p012xc85e97e9.p093xedfae76a.j0, p012xc85e97e9.p093xedfae76a.g0
    /* renamed from: postValue */
    public void mo7808x76db6cb1(java.lang.Object obj) {
        super.mo7808x76db6cb1(obj);
        synchronized (this.f534657d) {
            this.f534658e = obj;
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.j0, p012xc85e97e9.p093xedfae76a.g0
    /* renamed from: setValue */
    public void mo523x53d8522f(java.lang.Object obj) {
        super.mo523x53d8522f(obj);
        synchronized (this.f534657d) {
            this.f534658e = null;
        }
    }
}
