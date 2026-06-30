package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.h f246389a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.h();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addShowThirdJump", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).gl()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordConfigProviderHelper", "[addShowThirdJump] return 1");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addShowThirdJump", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
            return;
        }
        w40.e eVar = (w40.e) i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        if (!w40.e.ef(eVar, false, 1, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordConfigProviderHelper", "[addShowThirdJump] return 2");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addShowThirdJump", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.A8).mo141623x754a37bb()).r()).intValue() == 1) {
            c16993xacc19624.M.putBoolean("KEY_SHOW_THIRD_JUMP", true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addShowThirdJump", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordConfigProviderHelper", "[addShowThirdJump] return 3");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addShowThirdJump", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 b(java.lang.String filePath, java.lang.String thumbPath, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoParams, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsRecordVideoConfigProvider", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoParams, "videoParams");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.g(filePath, thumbPath, videoParams, i17, 2);
        videoParams.f152737t = 288;
        g17.F = 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.a.f246359a;
        g17.f237216u = java.lang.Boolean.valueOf(!aVar.h());
        g17.M.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", i18);
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (w40.e.ef((w40.e) c17, false, 1, null)) {
            g17.M.putBoolean("key_save_composition_info", true);
        }
        g17.M.putBoolean("key_edit_enable_emoji_search", true);
        g17.M.putBoolean("key_use_music_panel_v2", aVar.b());
        a(g17);
        aVar.d(g17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsRecordVideoConfigProvider", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
        return g17;
    }
}
