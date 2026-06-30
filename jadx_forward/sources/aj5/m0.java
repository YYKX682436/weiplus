package aj5;

/* loaded from: classes.dex */
public final class m0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f87008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.z f87009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f87010f;

    public m0(aj5.r0 r0Var, wi5.z zVar, java.util.HashMap hashMap) {
        this.f87008d = r0Var;
        this.f87009e = zVar;
        this.f87010f = hashMap;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.List list = (java.util.List) obj;
        j75.f Q6 = this.f87008d.Q6();
        if (Q6 != null) {
            Q6.B3(new wi5.v(this.f87009e, this.f87010f, list));
        }
        return jz5.f0.f384359a;
    }
}
