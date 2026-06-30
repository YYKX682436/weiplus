package jr;

/* loaded from: classes4.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final jr.k f382842d = new jr.k();

    public k() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_personal_words_interval, 0);
        gr.v vVar = gr.v.f356229a;
        vVar.a(false);
        int i17 = vVar.b().getInt("word_list_update_time", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSuggestCache", "checkWordListUpdate: config " + Ni + ", last " + i17 + ", running " + jr.m.f382844a);
        if (Ni > 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(i17) >= Ni * 3600 && !jr.m.f382844a) {
            jr.m.f382844a = true;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6949xa773ed99 c6949xa773ed99 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6949xa773ed99();
            c6949xa773ed99.f142547d = java.lang.System.currentTimeMillis();
            new gr.d().l().K(new jr.l(c6949xa773ed99));
        }
        return jz5.f0.f384359a;
    }
}
