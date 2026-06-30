package cu2;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final cu2.m f303953a = new cu2.m();

    public static final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, zy2.gc gcVar) {
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        hb2.b0.f361558e.q(abstractC14490x69736cb5.getFeedObject().m59251x5db1b11(), abstractC14490x69736cb5.getFeedObject().getFeedObject(), abstractC14490x69736cb5.getFeedObject().m59276x6c285d75(), true, gcVar);
    }

    public final void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentLogic", "anchorModifyFeedComment feed:" + java.lang.System.identityHashCode(feed) + " FinderItem:" + java.lang.System.identityHashCode(feed.getFeedObject()) + " FinderObject:" + java.lang.System.identityHashCode(feed.getFeedObject().getFeedObject()) + ",id:" + pm0.v.u(feed.mo2128x1ed62e84()) + ",commentClose=" + feed.getFeedObject().getFeedObject().m76757x8ed0b54f() + ",isClose=" + feed.getFeedObject().m59303x7d1523() + ",funcFlag:" + feed.getFeedObject().getFeedObject().m76781xf5e32151() + ",isChoose:" + feed.getFeedObject().m59302xe7dcf583());
        e3Var.a();
        e3Var.f(com.p314xaae8f345.mm.R.C30864xbddafb2a.e6y);
        android.widget.TextView textView = (android.widget.TextView) e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.obc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.view.View findViewById = e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.lcp);
        android.view.View findViewById2 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.uve);
        android.view.View findViewById3 = e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.v2k);
        android.view.View findViewById4 = findViewById3.findViewById(com.p314xaae8f345.mm.R.id.f568339v26);
        android.view.View findViewById5 = e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.q3w);
        android.view.View findViewById6 = findViewById5.findViewById(com.p314xaae8f345.mm.R.id.f565296st4);
        findViewById.setOnClickListener(new cu2.c(feed, findViewById2, findViewById4, findViewById6, e3Var, context));
        findViewById3.setOnClickListener(new cu2.e(feed, findViewById2, findViewById4, findViewById6, e3Var, context));
        findViewById5.setOnClickListener(new cu2.g(feed, findViewById2, findViewById4, findViewById6, e3Var, context));
        if (feed.getFeedObject().m59303x7d1523()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById6, arrayList.toArray(), "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic", "anchorModifyFeedComment", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/findersdk/api/IModifyUserResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic", "anchorModifyFeedComment", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/findersdk/api/IModifyUserResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (feed.getFeedObject().m59302xe7dcf583()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic", "anchorModifyFeedComment", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/findersdk/api/IModifyUserResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic", "anchorModifyFeedComment", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/findersdk/api/IModifyUserResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic", "anchorModifyFeedComment", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/findersdk/api/IModifyUserResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic", "anchorModifyFeedComment", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/findersdk/api/IModifyUserResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        e3Var.i();
    }

    public final void b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, boolean z17, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (z17) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.b0.f361558e.o(feed.getFeedObject().m59251x5db1b11(), feed.getFeedObject().getFeedObject(), feed.getFeedObject().m59276x6c285d75(), r45.uh2.OpenComment, gcVar);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        k0Var.Z1 = true;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570326ag3, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568867ob5)).setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cnw));
        k0Var.s(inflate, false);
        k0Var.f293405n = new cu2.h(context);
        k0Var.f293414s = new cu2.i(feed, gcVar);
        k0Var.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x020d, code lost:
    
        if ((r0 != null && r0.m75939xb282bd08(3) == 1) != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 c(long r18, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.Long r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, int r29, long r30, boolean r32, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 r33, r45.qt2 r34, int r35, java.util.List r36, java.util.LinkedList r37, int r38, cu2.a r39, r45.e60 r40) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu2.m.c(long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, boolean, com.tencent.mm.protocal.protobuf.FinderCommentInfo, r45.qt2, int, java.util.List, java.util.LinkedList, int, cu2.a, r45.e60):com.tencent.mm.plugin.finder.storage.yj0");
    }

    public final void d(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, boolean z17, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (!z17) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.b0.f361558e.q(feed.getFeedObject().m59251x5db1b11(), feed.getFeedObject().getFeedObject(), feed.getFeedObject().m59276x6c285d75(), false, gcVar);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ACCOUNT_FINDER_ANCHOR_HIDE_NOTICE_GUIDE_SHOWN_BOOLEAN_SYNC;
        java.lang.Object m17 = c17.m(u3Var, java.lang.Boolean.FALSE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) m17).booleanValue()) {
            e(feed, gcVar);
            return;
        }
        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c(context);
        cVar.f213274h = new cu2.j(feed, gcVar);
        cVar.w();
    }
}
