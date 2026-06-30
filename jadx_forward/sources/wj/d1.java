package wj;

/* loaded from: classes3.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final wj.d1 f527928d = new wj.d1();

    public d1() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long j17;
        try {
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            e42.c0 c0Var = e42.c0.clicfg_miniprogram_reward_ad_mb_preload_cache_time_0507;
            h62.d dVar = (h62.d) e0Var;
            boolean mj6 = dVar.mj(c0Var, c19767x257d7f, c19767x257d7f2);
            j17 = dVar.Ni(c0Var, 600);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdvertiseFeatureService", "[MBAd] preloadAutoDestroySeconds0507 value:" + j17 + ", groupId:" + c19767x257d7f2.f38864x6ac9171 + ", hit:" + mj6);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MagicAdvertiseFeatureService", "[MBAd] preloadAutoDestroySeconds expt read failed: " + e17);
            j17 = 600;
        }
        return java.lang.Long.valueOf(j17);
    }
}
