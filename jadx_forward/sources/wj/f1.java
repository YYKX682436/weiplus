package wj;

/* loaded from: classes3.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final wj.f1 f527937d = new wj.f1();

    public f1() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        e42.c0 c0Var = e42.c0.clicfg_miniprogram_reward_ad_mb_convert_opt_0225;
        h62.d dVar = (h62.d) e0Var;
        if (dVar.mj(c0Var, c19767x257d7f, c19767x257d7f2)) {
            int Ni = dVar.Ni(c0Var, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdvertiseFeatureService", "[MBAd] preloadOpt value: " + Ni + ", groupId: " + c19767x257d7f2.f38864x6ac9171 + ", hit:true, source:0225");
            return new jz5.o(java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(c19767x257d7f2.f38864x6ac9171), java.lang.Boolean.TRUE);
        }
        e42.c0 c0Var2 = e42.c0.clicfg_miniprogram_reward_ad_mb_preload_switch_0407;
        boolean mj6 = dVar.mj(c0Var2, c19767x257d7f, c19767x257d7f2);
        int Ni2 = dVar.Ni(c0Var2, 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[MBAd] preloadOpt value: ");
        sb6.append(Ni2);
        sb6.append(", groupId: ");
        sb6.append(c19767x257d7f2.f38864x6ac9171);
        sb6.append(", hit:");
        sb6.append(mj6);
        sb6.append(", source:");
        sb6.append(mj6 ? "preload_0407" : com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdvertiseFeatureService", sb6.toString());
        return new jz5.o(java.lang.Integer.valueOf(Ni2), java.lang.Integer.valueOf(mj6 ? c19767x257d7f2.f38864x6ac9171 : 0), java.lang.Boolean.valueOf(mj6));
    }
}
