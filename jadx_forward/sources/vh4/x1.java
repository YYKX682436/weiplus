package vh4;

/* loaded from: classes9.dex */
public class x1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public int f518705d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f518706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f518707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f518708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vh4.y1 f518709h;

    public x1(vh4.y1 y1Var, long j17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, boolean z17) {
        this.f518709h = y1Var;
        this.f518706e = j17;
        this.f518707f = u3Var;
        this.f518708g = z17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        java.util.Map d17;
        int i17;
        vh4.y1 y1Var = this.f518709h;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(y1Var.f518724f.d1(), this.f518706e);
        if (Li.I0() <= 0 && (i17 = this.f518705d) < 10) {
            this.f518705d = i17 + 1;
            return true;
        }
        this.f518707f.dismiss();
        if (Li.I0() > 0) {
            y1Var.f518728j.rh(y1Var.f518726h, y1Var.f518724f.d1(), c01.z1.r(), Li.mo78012x3fdd41df(), Li.I0(), Li.j(), Li.z0(), java.lang.Boolean.FALSE);
        }
        y1Var.f518728j.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k kVar = y1Var.f518727i;
        if (kVar != null) {
            kVar.a(this.f518708g);
        }
        int i18 = y1Var.f518721c;
        if (i18 != 3 || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(y1Var.f518723e, "content", null)) == null || d17.get(".content") == null) {
            return false;
        }
        ot0.q v17 = ot0.q.v((java.lang.String) d17.get(".content"));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6954xf592e33a c6954xf592e33a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6954xf592e33a();
        c6954xf592e33a.f142606d = 1L;
        c6954xf592e33a.f142607e = 1L;
        c6954xf592e33a.f142608f = i18;
        c6954xf592e33a.f142609g = c6954xf592e33a.b("requestID", Li.I0() + "", true);
        c6954xf592e33a.f142610h = c6954xf592e33a.b("requestResource", v17.f430207k, true);
        c6954xf592e33a.k();
        return false;
    }
}
