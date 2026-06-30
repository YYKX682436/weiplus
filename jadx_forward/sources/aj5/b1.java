package aj5;

/* loaded from: classes.dex */
public final class b1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f86931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.z f86932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f86933f;

    public b1(aj5.g1 g1Var, wi5.z zVar, java.util.HashMap hashMap) {
        this.f86931d = g1Var;
        this.f86932e = zVar;
        this.f86933f = hashMap;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.util.List list = (java.util.List) obj;
        j75.f Q6 = this.f86931d.Q6();
        if (Q6 != null) {
            Q6.B3(new wi5.v(this.f86932e, this.f86933f, list));
        }
        return jz5.f0.f384359a;
    }
}
