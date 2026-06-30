package gc4;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final gc4.k f351992a = new gc4.k();

    public final void a(android.content.Context context, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enterSnsVisibilitySettingPage", "com.tencent.mm.plugin.sns.ui.helper.SnsVisibilityEntranceManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean m17 = pc4.d.f434943a.m();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(i17);
        if (i19 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVisibilityEntranceManager", "enterSnsVisibilitySettingPage >> snsInfo == null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterSnsVisibilitySettingPage", "com.tencent.mm.plugin.sns.ui.helper.SnsVisibilityEntranceManager");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f(i19);
        boolean h17 = ca4.f1.f121430a.h(f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVisibilityEntranceManager", "showSnsGroupDialog >> useFlutterDialog = " + m17 + " mLocalId = " + i17 + " snsId: " + ca4.z0.t0(i19.f68891x29d1292e) + " useComplexVisibility = " + h17);
        if ((m17 || h17) && f17.f39000xe139598c != 0) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new oi0.b(i19, cj0.a.f123386a.l(i19), 4, "", java.lang.Long.valueOf(i19.f68891x29d1292e), context, null, null), 3, null);
        } else {
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90.P;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewSnsLabelUI", "jumpToSnsLabelUI snsLocalId:%d scene:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i17 <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_from_sns_feed_id", i17);
                intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17981xde240d90.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/NewSnsLabelUI", "jumpToSnsLabelUI", "(Landroid/content/Context;II)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/NewSnsLabelUI", "jumpToSnsLabelUI", "(Landroid/content/Context;II)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.B().D = i18;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUI");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterSnsVisibilitySettingPage", "com.tencent.mm.plugin.sns.ui.helper.SnsVisibilityEntranceManager");
    }

    public final void b(android.content.Context uiContext, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showSnsGroupDialog", "com.tencent.mm.plugin.sns.ui.helper.SnsVisibilityEntranceManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiContext, "uiContext");
        boolean n17 = pc4.d.f434943a.n();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i110 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(i17);
        if (i110 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVisibilityEntranceManager", "showSnsGroupDialog >> snsInfo == null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showSnsGroupDialog", "com.tencent.mm.plugin.sns.ui.helper.SnsVisibilityEntranceManager");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f(i110);
        boolean h17 = ca4.f1.f121430a.h(f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVisibilityEntranceManager", "showSnsGroupDialog >> useFlutterDialog = " + n17 + " mLocalId = " + i17 + " snsId: " + ca4.z0.t0(i110.f68891x29d1292e) + " useComplexVisibility = " + h17);
        if ((n17 || h17) && f17.f39000xe139598c != 0) {
            cj0.a aVar = cj0.a.f123386a;
            bw5.nk0 l17 = aVar.l(i110);
            aVar.l("MicroMsg.SnsVisibilityEntranceManager", l17);
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new n.n(i110, l17, i110.f68891x29d1292e, 2, uiContext, null, null), 3, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f dialogC18384xa272e02f = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f(uiContext, i17, i18, i19);
            dialogC18384xa272e02f.show();
            dialogC18384xa272e02f.f362939o = gc4.j.f351991d;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showSnsGroupDialog", "com.tencent.mm.plugin.sns.ui.helper.SnsVisibilityEntranceManager");
    }
}
