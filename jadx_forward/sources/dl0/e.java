package dl0;

@j95.b
/* loaded from: classes13.dex */
public class e extends i95.w implements xs.c1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Runnable f316699d = new dl0.g();

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        boolean z17 = false;
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k || kl0.a.a()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().a("clicfg_plugin_kara_open", "1", false, true), 0) != 0) {
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KaraFeatureService", "expt 0");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KaraFeatureService", "PluginKara execute");
        d95.b0 b0Var = nl0.e.f419697a;
        java.lang.String str = gm0.j1.u().h() + "KaraCore.db";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KaraFeatureService", "pluginKara cacheDbPath = %s", str);
        d95.b0 b17 = nl0.e.b();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(1528336687, new dl0.C28232x2e755c());
        hashMap.put(91360208, new dl0.C28233x2e755d());
        hashMap.put(275963628, new dl0.C28234x2e755e());
        if (b17.S(str, hashMap, true, true)) {
            nl0.c.b();
            ((ku5.t0) ku5.t0.f394148d).q(ml0.e.f408721b.f408718a);
            ((ku5.t0) ku5.t0.f394148d).q(ml0.c.f408719b.f408718a);
            ((ku5.t0) ku5.t0.f394148d).q(ml0.d.f408720b.f408718a);
            ((s85.a) xl0.a.f536634e).b(xl0.a.f536633d);
            ku5.u0 u0Var = ku5.t0.f394148d;
            java.lang.Runnable runnable = f316699d;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.t(runnable, 15000L, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KaraFeatureService", "dataDB.initDb fail, cacheDbPath = %s", str);
        }
        gl0.c.f354327a = new dl0.f(this);
    }
}
