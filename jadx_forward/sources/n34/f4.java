package n34;

/* loaded from: classes4.dex */
public final class f4 extends sb4.v {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 f416130j;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7) {
        this.f416130j = c17694x1b4b7a7;
    }

    @Override // sb4.v
    public void a(int i17, java.lang.String snsId, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetailsMaskClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        pb4.e eVar = pb4.e.f434729a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 g17 = eVar.g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(snsId));
        if (g17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetailsMaskClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListUIC", "click desc_count, localId = %d, position = %d, snsId = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), snsId);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7 = this.f416130j;
        sb4.w Q6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(c17694x1b4b7a7);
        if (Q6 != null) {
            Q6.F(i17);
        }
        android.content.Intent intent = new android.content.Intent(c17694x1b4b7a7.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac.class);
        intent.putExtra("INTENT_TALKER", com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.R6(c17694x1b4b7a7));
        intent.putExtra("INTENT_SNS_LOCAL_ID", eVar.j(g17));
        intent.putExtra("INTENT_FROMGALLERY", false);
        intent.putExtra("INTENT_NEED_RPT_FEED", true);
        intent.putExtra("INTENT_STAR_LIST", true);
        intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.O6(c17694x1b4b7a7));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c17694x1b4b7a7.m158354x19263085();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$1", "onDetailsMaskClick", "(ILjava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$1", "onDetailsMaskClick", "(ILjava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.S6(c17694x1b4b7a7, g17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetailsMaskClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
    }

    @Override // sb4.v
    public void b(int i17, java.lang.String snsId, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFailLongClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFailLongClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
    }

    @Override // sb4.v
    public void c(int i17, java.lang.String snsId, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onHBClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        pb4.e eVar = pb4.e.f434729a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 g17 = eVar.g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(snsId));
        if (g17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHBClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7 = this.f416130j;
        sb4.w Q6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(c17694x1b4b7a7);
        if (Q6 != null) {
            Q6.F(i17);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c17694x1b4b7a7.m158354x19263085(), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac.class);
        intent.putExtra("INTENT_TALKER", g17.m70374x6bf53a6c());
        intent.putExtra("INTENT_NEED_RPT_FEED", true);
        intent.putExtra("INTENT_STAR_LIST", true);
        intent.putExtra("INTENT_SNS_LOCAL_ID", eVar.j(g17));
        intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.O6(c17694x1b4b7a7));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c17694x1b4b7a7.m158354x19263085();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$1", "onHBClick", "(ILjava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$1", "onHBClick", "(ILjava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.S6(c17694x1b4b7a7, g17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onHBClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
    }

    @Override // sb4.v
    public void d(int i17, java.lang.String snsId, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPhotoClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isSelf$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7 = this.f416130j;
        boolean z17 = c17694x1b4b7a7.f244080m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isSelf$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListUIC", "showImg snsinfo snslocalId:%d, pos:%d，mIsSelf:%b, ", valueOf, valueOf2, java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 g17 = pb4.e.f434729a.g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(snsId));
        if (g17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPhotoClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
            return;
        }
        sb4.w Q6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(c17694x1b4b7a7);
        if (Q6 != null) {
            Q6.F(i17);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(c17694x1b4b7a7) != null) {
            android.content.Intent intent = new android.content.Intent(c17694x1b4b7a7.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.class);
            intent.putExtra("sns_gallery_userName", com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.R6(c17694x1b4b7a7));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isSelf$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            boolean z18 = c17694x1b4b7a7.f244080m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isSelf$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            intent.putExtra("sns_gallery_is_self", z18);
            intent.putExtra("sns_gallery_localId", snsId);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSnsSource$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            int i19 = c17694x1b4b7a7.f244081n;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSnsSource$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            intent.putExtra("sns_source", i19);
            sb4.w Q62 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(c17694x1b4b7a7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q62);
            intent.putExtra("sns_gallery_st_time", Q62.w());
            sb4.w Q63 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(c17694x1b4b7a7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q63);
            intent.putExtra("sns_gallery_ed_time", Q63.s());
            intent.putExtra("key_from_scene", 4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSnsServer$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6 d6Var = c17694x1b4b7a7.f244083p;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSnsServer$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            if (d6Var != null) {
                java.lang.String R6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.R6(c17694x1b4b7a7);
                sb4.w Q64 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(c17694x1b4b7a7);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q64);
                d6Var.s(R6, Q64.H(snsId, i18));
            }
            sb4.w Q65 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(c17694x1b4b7a7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q65);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFixPosition", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
            int i27 = Q65.D;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFixPosition", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
            intent.putExtra("sns_gallery_position", i27);
            intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.O6(c17694x1b4b7a7));
            intent.putExtra("INTENT_STAR_LIST", true);
            intent.putExtra("INTENT_ALBUM_SCENE", 9);
            c17694x1b4b7a7.m158354x19263085().startActivityForResult(intent, 1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.S6(c17694x1b4b7a7, g17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPhotoClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
    }

    @Override // sb4.v
    public void e(int i17, java.lang.String snsId, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSignClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        pb4.e eVar = pb4.e.f434729a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 g17 = eVar.g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(snsId));
        if (g17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSignClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7 = this.f416130j;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(c17694x1b4b7a7) != null) {
            sb4.w Q6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(c17694x1b4b7a7);
            if (Q6 != null) {
                Q6.F(i17);
            }
            if (g17.f68895x2262335f == 15) {
                android.content.Intent intent = new android.content.Intent(c17694x1b4b7a7.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee.class);
                intent.putExtra("sns_gallery_userName", com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.R6(c17694x1b4b7a7));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isSelf$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                boolean z17 = c17694x1b4b7a7.f244080m;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isSelf$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                intent.putExtra("sns_gallery_is_self", z17);
                intent.putExtra("sns_gallery_localId", snsId);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSnsSource$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                int i19 = c17694x1b4b7a7.f244081n;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSnsSource$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                intent.putExtra("sns_source", i19);
                sb4.w Q62 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(c17694x1b4b7a7);
                intent.putExtra("sns_gallery_st_time", Q62 != null ? java.lang.Integer.valueOf(Q62.w()) : null);
                sb4.w Q63 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(c17694x1b4b7a7);
                intent.putExtra("sns_gallery_ed_time", Q63 != null ? java.lang.Integer.valueOf(Q63.s()) : null);
                intent.putExtra("sns_video_scene", 4);
                intent.putExtra("key_from_scene", 4);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSnsServer$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6 d6Var = c17694x1b4b7a7.f244083p;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSnsServer$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                if (d6Var != null) {
                    java.lang.String R6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.R6(c17694x1b4b7a7);
                    sb4.w Q64 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(c17694x1b4b7a7);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q64);
                    d6Var.s(R6, Q64.H(snsId, i18));
                }
                sb4.w Q65 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(c17694x1b4b7a7);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q65);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFixPosition", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                int i27 = Q65.D;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFixPosition", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                intent.putExtra("sns_gallery_position", i27);
                intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.O6(c17694x1b4b7a7));
                intent.putExtra("INTENT_STAR_LIST", true);
                intent.putExtra("INTENT_ALBUM_SCENE", 9);
                c17694x1b4b7a7.m158354x19263085().startActivityForResult(intent, 1);
            } else {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClass(c17694x1b4b7a7.m158354x19263085(), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac.class);
                intent2.putExtra("INTENT_TALKER", g17.m70374x6bf53a6c());
                intent2.putExtra("INTENT_NEED_RPT_FEED", true);
                intent2.putExtra("INTENT_SNS_LOCAL_ID", eVar.j(g17));
                intent2.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.O6(c17694x1b4b7a7));
                intent2.putExtra("INTENT_STAR_LIST", true);
                intent2.putExtra("INTENT_ALBUM_SCENE", 9);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c17694x1b4b7a7.m158354x19263085();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$1", "onSignClick", "(ILjava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$1", "onSignClick", "(ILjava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.S6(c17694x1b4b7a7, g17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSignClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
    }
}
