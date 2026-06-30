package va4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final va4.b f515934a = new va4.b();

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            return false;
        }
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
        if (r17 == 1) {
            z17 = true;
        } else if (r17 != 2) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        return z17;
    }

    public final void b(android.content.Context context, xc4.p pVar, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRouter", "jumpToFoldPage v3:" + z17);
        if (pVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsRouter", "jumpToFoldPage fail with null info");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            return;
        }
        if (pVar.j1() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsRouter", "jumpToFoldPage fail with null wsGroupStruct");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            return;
        }
        if (pVar.i1() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsRouter", "jumpToFoldPage fail with null wsFoldDetail");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            return;
        }
        r45.qb6 j17 = pVar.j1();
        if (j17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s2 i17 = pVar.i1();
        if (i17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            return;
        }
        java.util.LinkedList<java.lang.Long> snsIds = j17.f465343d;
        if (snsIds.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsRouter", "jumpToFoldPage fail with empty snsIds");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snsIds, "snsIds");
        for (java.lang.Long l17 : snsIds) {
            yc4.b0 b0Var = yc4.b0.f542372a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            b0Var.d(ca4.z0.t0(l17.longValue()));
        }
        android.content.Intent intent = new android.content.Intent();
        if (z17) {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.ActivityC18439x36286657.class);
            intent.putExtra("key_ws_include_feed_id", z18);
            intent.putExtra("key_ws_feed_id", pVar.y0());
            intent.putExtra("key_ws_detail_username", pVar.h1().f39018xf3f56116);
            java.util.ArrayList arrayList = new java.util.ArrayList(snsIds);
            pm0.v.b0(arrayList, new va4.a(pVar));
            intent.putExtra("key_ws_feed_count", arrayList.size());
        } else {
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18144x3e20023a.class);
            intent.putExtra("key_ws_group_id", i17.f69422x861009b5);
            java.lang.Object obj = snsIds.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            intent.putExtra("key_ws_detail_max_id", ((java.lang.Number) obj).longValue());
            java.lang.Object obj2 = snsIds.get(snsIds.size() - 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            intent.putExtra("key_ws_detail_min_id", ((java.lang.Number) obj2).longValue());
            intent.putExtra("key_ws_detail_username", pVar.h1().f39018xf3f56116);
        }
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        java.util.Iterator it = snsIds.iterator();
        while (it.hasNext()) {
            java.lang.Long l18 = (java.lang.Long) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l18);
            arrayList2.add(ca4.z0.s0(l18.longValue()));
        }
        intent.putStringArrayListExtra("key_ws_str_sns_id_list", arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/plugin/sns/router/SnsRouter", "jumpToFoldPage", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ui/improve/model/ImproveSnsInfo;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/router/SnsRouter", "jumpToFoldPage", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ui/improve/model/ImproveSnsInfo;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
        s0Var.i(snsIds, i17.f69422x861009b5, pVar.h1().f39018xf3f56116);
        s0Var.V(i17.f69422x861009b5, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
    }

    public final void c(android.content.Context context, java.lang.String username, int i17, java.lang.String str, java.lang.String source) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToUserPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToUserPage$default", "com.tencent.mm.plugin.sns.router.SnsRouter");
        d(context, username, i17, str, source, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToUserPage$default", "com.tencent.mm.plugin.sns.router.SnsRouter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToUserPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
    }

    public final void d(android.content.Context context, java.lang.String username, int i17, java.lang.String str, java.lang.String source, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToUserPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRouter", "jumpToUserPage use flutter");
            java.lang.String str3 = str2 == null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true).V : str2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new oi0.d(username, str3, source, context, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRouter", "jumpToUserPage use native");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17.class);
            intent.putExtra("sns_userName", username);
            intent.putExtra("sns_rpt_scene", i17);
            if (str != null) {
                intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", str);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/router/SnsRouter", "jumpToUserPage", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/sns/router/SnsRouter", "jumpToUserPage", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToUserPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
    }
}
