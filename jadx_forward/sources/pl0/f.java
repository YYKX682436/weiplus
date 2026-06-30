package pl0;

@j95.b
/* loaded from: classes13.dex */
public class f extends i95.w implements xs.b1 {
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        boolean z17 = false;
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k || kl0.a.a()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(j62.e.g().j("clicfg_plugin_kara_feature_open", "1", false, true), 0) != 0) {
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KaraBusinessFeatureService", "expt 0");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KaraBusinessFeatureService", "PluginKara execute");
        d95.b0 b0Var = nl0.e.f419697a;
        java.lang.String str = gm0.j1.u().h() + "KaraMM.db";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KaraBusinessFeatureService", "pluginKara cacheDbPath = %s", str);
        d95.b0 a17 = nl0.e.a();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(-1137075586, new pl0.C29985x2ee9bb());
        hashMap.put(-512314412, new pl0.C29986x2ee9bc());
        hashMap.put(-174884489, new pl0.C29987x2ee9bd());
        hashMap.put(1180022710, new pl0.C29988x2ee9be());
        if (!a17.S(str, hashMap, true, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KaraBusinessFeatureService", "dataDB.initDb fail, cacheDbPath = %s", str);
            return;
        }
        tl0.b.f501727a = new ul0.a(nl0.e.a());
        tl0.b.f501728b = new ul0.d(nl0.e.a());
        tl0.b.f501729c = new ul0.c(nl0.e.a());
        tl0.b.f501730d = new ul0.b(nl0.e.a());
        ((ku5.t0) ku5.t0.f394148d).r(new tl0.a(), "KaraEvent");
        wl0.r rVar = wl0.r.f528565d;
        rVar.getClass();
        el0.i.f335253a = new wl0.o(rVar);
        el0.i.f335254b = new wl0.q(rVar);
        wl0.m mVar = wl0.m.f528550b;
        el0.i.f335255c = new wl0.b(mVar);
        el0.i.f335256d = new wl0.d(mVar);
        el0.i.f335257e = new wl0.f(mVar);
        el0.i.f335258f = new wl0.h(mVar);
        el0.i.f335259g = new wl0.j(mVar);
        el0.i.f335260h = new wl0.l(mVar);
        com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p806xadb2a389.a.a();
        ka4.m mVar2 = ka4.m.f387669a;
        rl0.a aVar = new rl0.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsInfoToFeatureGroupCallback", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToFeatureGroupCallback");
        ka4.m.f387670b = aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsInfoToFeatureGroupCallback", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
    }
}
