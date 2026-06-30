package aj5;

/* loaded from: classes.dex */
public final class d1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f86946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.g1 f86947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.z f86948f;

    public d1(java.util.HashMap hashMap, aj5.g1 g1Var, wi5.z zVar) {
        this.f86946d = hashMap;
        this.f86947e = g1Var;
        this.f86948f = zVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p13.v vVar = (p13.v) obj;
        java.lang.Integer num = new java.lang.Integer(0);
        java.util.HashMap hashMap = this.f86946d;
        hashMap.put(num, vVar);
        aj5.g1 g1Var = this.f86947e;
        j75.f Q6 = g1Var.Q6();
        if (Q6 != null) {
            Q6.B3(new wi5.v(this.f86948f, hashMap, aj5.g1.T6(g1Var, 0, ((java.lang.Boolean) ((jz5.n) g1Var.f86964d).mo141623x754a37bb()).booleanValue(), vVar)));
        }
        return jz5.f0.f384359a;
    }
}
