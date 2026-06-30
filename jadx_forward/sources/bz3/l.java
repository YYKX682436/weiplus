package bz3;

/* loaded from: classes4.dex */
public final class l implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final bz3.l f118335d = new bz3.l();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f118336e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f118337f = new java.util.HashMap();

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanServerConfigManager", "onSceneEnd errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ((ku5.t0) ku5.t0.f394148d).h(new bz3.j(m1Var, i17, i18, str), "ScanConfigSync");
    }
}
