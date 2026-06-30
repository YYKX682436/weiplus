package bz3;

/* loaded from: classes4.dex */
public final class l implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final bz3.l f36802d = new bz3.l();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f36803e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f36804f = new java.util.HashMap();

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanServerConfigManager", "onSceneEnd errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ((ku5.t0) ku5.t0.f312615d).h(new bz3.j(m1Var, i17, i18, str), "ScanConfigSync");
    }
}
