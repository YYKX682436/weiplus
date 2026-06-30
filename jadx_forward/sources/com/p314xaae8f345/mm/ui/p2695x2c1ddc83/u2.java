package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u2 f289625a = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u2();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f289626b;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0965 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0966  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(android.app.Activity r33, android.view.View r34, com.p314xaae8f345.mm.p2621x8fb0427b.l4 r35, int r36, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2 r37) {
        /*
            Method dump skipped, instructions count: 2410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u2.b(android.app.Activity, android.view.View, com.tencent.mm.storage.l4, int, com.tencent.mm.ui.conversation.p2):boolean");
    }

    public static final void c(android.app.Activity activity, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.l4 user, int i17, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2 p2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(user, "user");
        if ((com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(user.h1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(user.h1())) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.GlobalWeCom.k(view.getContext(), null)) {
            return;
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.D4(user.h1()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.HomePluginSports.k(view.getContext(), null)) {
            if (p2Var != null) {
                java.lang.String h17 = user.h1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getKey(...)");
                p2Var.b(view, i17, h17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.a(9);
            ((java.util.HashMap) ((lp3.r) i95.n0.c(lp3.r.class)).f401837d).clear();
            android.os.Bundle bundle = new android.os.Bundle();
            if (!android.text.TextUtils.isEmpty(f289626b)) {
                bundle.putString("service_notify_session_id", f289626b);
            }
            bundle.putInt("specific_chat_from_scene", 7);
            bundle.putInt("KOpenArticleSceneFromScene", 93);
            bundle.putInt("chat_from_scene_for_group_chats", 3);
            bundle.putInt("Main_IndexInSessionList", i17);
            bundle.putInt("Main_UnreadCount", user.d1());
            bundle.putInt("chat_from_scene", 0);
            if ((!c01.e2.G(user.h1()) || ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).q() || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(user.h1(), "weixin") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(user.h1(), "gh_b4af18eac3d5")) ? false : true) {
                if (p2Var != null) {
                    p2Var.a(0);
                }
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).B(activity, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t2(p2Var, user, bundle));
                return;
            }
            if (p2Var != null) {
                java.lang.String h18 = user.h1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h18, "getUsername(...)");
                p2Var.c(h18, bundle);
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(user.h1())) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6800x63c0d5b8 c6800x63c0d5b8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6800x63c0d5b8();
                c6800x63c0d5b8.p(user.h1());
                c6800x63c0d5b8.f141319e = 1L;
                c6800x63c0d5b8.k();
            }
        }
    }

    public final void a(android.app.Activity activity, android.content.Intent intent) {
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeReport", "markStartOpen");
        boolean z17 = z40.e.l4() && ((y40.i0) z40.e.get()).Di();
        ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6339x8959f72f c6339x8959f72f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6339x8959f72f();
        c6339x8959f72f.f136924d = z17 ? 2L : 1L;
        c6339x8959f72f.k();
        if (z17) {
            z40.e eVar = z40.e.get();
            if (eVar != null) {
                ((y40.i0) eVar).Bi(activity, intent);
                return;
            }
            return;
        }
        if (((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Zi()) {
            ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Vi(activity, intent);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/conversation/ConversationClickHelper", "gotoBizTimeLine", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/conversation/ConversationClickHelper", "gotoBizTimeLine", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
