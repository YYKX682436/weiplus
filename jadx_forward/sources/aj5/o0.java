package aj5;

/* loaded from: classes.dex */
public final class o0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f87020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f87021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wi5.z f87022f;

    public o0(java.util.HashMap hashMap, aj5.r0 r0Var, wi5.z zVar) {
        this.f87020d = hashMap;
        this.f87021e = r0Var;
        this.f87022f = zVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p13.v vVar = (p13.v) obj;
        java.lang.Integer num = new java.lang.Integer(0);
        java.util.HashMap hashMap = this.f87020d;
        hashMap.put(num, vVar);
        aj5.r0 r0Var = this.f87021e;
        j75.f Q6 = r0Var.Q6();
        if (Q6 != null) {
            Q6.B3(new wi5.v(this.f87022f, hashMap, aj5.r0.T6(r0Var, 0, ((java.lang.Boolean) ((jz5.n) r0Var.f87036d).mo141623x754a37bb()).booleanValue(), vVar)));
        }
        return jz5.f0.f384359a;
    }
}
