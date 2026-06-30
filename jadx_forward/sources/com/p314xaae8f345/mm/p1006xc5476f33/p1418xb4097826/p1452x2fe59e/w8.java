package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public class w8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj {

    /* renamed from: r, reason: collision with root package name */
    public final boolean f192492r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f192493s;

    /* renamed from: t, reason: collision with root package name */
    public final ym5.q1 f192494t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8 presenter, int i17, int i18, boolean z17, boolean z18) {
        super(context, presenter, i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f192492r = z17;
        this.f192493s = z18;
        this.f192494t = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.u8(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0
    public android.view.View j() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0
    public void q(java.util.ArrayList data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.q(data);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 o17 = o();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f188501d;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dxa, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        o17.m82697xe136b7d8(inflate);
        android.view.View findViewById = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.f567991la3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        if (c1163xf1deaba4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) c1163xf1deaba4;
            if (c13728x20aad6ea.getLayoutManager() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c13728x20aad6ea.getLayoutManager();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea.i1(c13728x20aad6ea, (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager, null, 2, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0
    public boolean s() {
        return this.f192493s;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0
    public void t(int i17) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f188501d;
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((qt2.u) pf5.z.f435481a.a(activity).a(qt2.u.class)).R6("onItemChange");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0
    public void u() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa = m56068x4905e9fa();
        m56068x4905e9fa.m7964x8d4ad49c(new uw2.n0());
        boolean z17 = true;
        m56068x4905e9fa.m7963x830bc99d(true);
        java.lang.String stringExtra = this.f188501d.getIntent().getStringExtra("FLOAT_BALL_KEY");
        if (stringExtra != null && stringExtra.length() != 0) {
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0 c0Var = this.f188502e;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8 t8Var = c0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8) c0Var : null;
            if (((t8Var == null || (abstractC13919x46aff122 = t8Var.f188103t) == null) ? null : abstractC13919x46aff122.m56353x743e55cc()) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8 t8Var2 = c0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8) c0Var : null;
                if (t8Var2 != null) {
                    t8Var2.V();
                    return;
                }
                return;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderFeedDetailRelUIContract.Presenter");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8 t8Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t8) c0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = t8Var3.K;
        if (abstractC14490x69736cb5 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cache exit!,show cache first size:");
            java.util.ArrayList f17 = t8Var3.f();
            sb6.append(f17 != null ? java.lang.Integer.valueOf(f17.size()) : null);
            sb6.append(" feed:");
            sb6.append(abstractC14490x69736cb5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedDetailRelUIContract.ViewCallback", sb6.toString());
            java.util.ArrayList f18 = t8Var3.f();
            if (f18 != null) {
                f18.clear();
            }
            java.util.ArrayList f19 = t8Var3.f();
            if (f19 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = t8Var3.K;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC14490x69736cb52);
                f19.add(abstractC14490x69736cb52);
            }
            a().m8146xced61ae5();
        }
        super.u();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj
    public ym5.q1 w() {
        return this.f192494t;
    }

    public final void y(boolean z17, boolean z18, java.lang.String finderMemberUsername, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        android.view.View findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderMemberUsername, "finderMemberUsername");
        if (finderMemberUsername.length() == 0) {
            if (!((abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || !feedObject.m59315x31740422()) ? false : true)) {
                return;
            }
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f188501d;
        android.view.View findViewById2 = activity.findViewById(com.p314xaae8f345.mm.R.id.g2i);
        if (findViewById2 == null || (findViewById = findViewById2.findViewById(com.p314xaae8f345.mm.R.id.f567409jf3)) == null) {
            return;
        }
        if (!z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) a17).W6(true, false);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2 f2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2.class);
        if (f2Var != null) {
            pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.w1(f2Var));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!z18 || abstractC14490x69736cb5 == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a18 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) a18).W6(false, false);
        ya2.b2 contact = abstractC14490x69736cb5.getContact();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById.findViewById(com.p314xaae8f345.mm.R.id.kqg);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.jew);
        android.widget.TextView textView = (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.jfb);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById.findViewById(com.p314xaae8f345.mm.R.id.jex);
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.jeu);
        viewGroup.setPadding(0, com.p314xaae8f345.mm.ui.bl.h(activity), 0, 0);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f542044a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
        zy2.tb.a(m1Var, imageView2, contact != null ? contact.f69300x731cac1b : null, 0, 4, null);
        if (contact != null) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d a19 = g1Var.a();
            java.lang.String m176700xe5e0d2a0 = contact.m176700xe5e0d2a0();
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            mn2.n nVar = new mn2.n(m176700xe5e0d2a0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.X);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            a19.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String w07 = contact.w0();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(activity, w07));
        }
        linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v8(abstractC14490x69736cb5, this, finderMemberUsername));
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFeedDetailRelUIContract$ViewCallback", "refreshMemberView", "(ZZLjava/lang/String;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
