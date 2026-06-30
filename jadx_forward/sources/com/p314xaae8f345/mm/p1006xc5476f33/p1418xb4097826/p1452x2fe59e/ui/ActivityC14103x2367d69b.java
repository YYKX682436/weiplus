package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTopicFeedUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/plugin/finder/feed/a10;", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/xm", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI */
/* loaded from: classes2.dex */
public final class ActivityC14103x2367d69b extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a10 {
    public static final java.util.concurrent.ConcurrentHashMap I = new java.util.concurrent.ConcurrentHashMap();
    public android.widget.RelativeLayout A;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 B;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 C;
    public android.widget.TextView D;
    public long E;
    public long F;
    public float H;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 f191108u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 f191109v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13918xdafe8cba f191110w;

    /* renamed from: x, reason: collision with root package name */
    public r45.xu2 f191111x;

    /* renamed from: y, reason: collision with root package name */
    public r45.oa1 f191112y;

    /* renamed from: z, reason: collision with root package name */
    public int f191113z;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f191107t = "Finder.FinderTopicFeedUI";
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.cn G = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.cn();

    public static final java.lang.String c7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b activityC14103x2367d69b) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = activityC14103x2367d69b.f191108u;
        if (r10Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        r45.o03 o03Var = r10Var.f190406t;
        if (o03Var == null) {
            return r10Var.f190401o;
        }
        if (((r45.zi2) o03Var.m75936x14adae67(1)) != null) {
            r45.zi2 zi2Var = (r45.zi2) o03Var.m75936x14adae67(1);
            return java.lang.String.valueOf(zi2Var != null ? zi2Var.m75945x2fec8307(2) : null);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14103x2367d69b.mo55332x76847179();
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) o03Var.m75936x14adae67(0);
        objArr[0] = c19782x23db1cfa != null ? c19782x23db1cfa.m76184x8010e5e4() : null;
        java.lang.String string = mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cxs, objArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b r5) {
        /*
            com.tencent.mm.plugin.finder.feed.r10 r0 = r5.f191108u
            r1 = 0
            java.lang.String r2 = "presenter"
            if (r0 == 0) goto L4f
            java.lang.String r0 = r0.f190401o
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r0 != 0) goto L24
            com.tencent.mm.plugin.finder.feed.r10 r0 = r5.f191108u
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.y()
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r0 == 0) goto L1e
            goto L24
        L1e:
            r0 = 0
            goto L25
        L20:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r2)
            throw r1
        L24:
            r0 = 1
        L25:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "notShare "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = ", "
            r3.append(r4)
            com.tencent.mm.plugin.finder.feed.r10 r4 = r5.f191108u
            if (r4 == 0) goto L4b
            java.lang.String r1 = r4.f190401o
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r5 = r5.f191107t
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r1)
            return r0
        L4b:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r2)
            throw r1
        L4f:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b.d7(com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        int intExtra = getIntent().getIntExtra("key_topic_type", 1);
        if (intExtra == 1) {
            return 22;
        }
        if (intExtra != 4) {
            return intExtra != 5 ? 26 : 64;
        }
        return 49;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    public int Y6() {
        return 3;
    }

    public void e7(r45.r03 r03Var) {
        java.lang.String str;
        if (r03Var == null || (str = r03Var.m75945x2fec8307(18)) == null) {
            str = "";
        }
        if (str.length() > 0) {
            f7();
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) findViewById(com.p314xaae8f345.mm.R.id.f564769a25);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.xm xmVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.xm(this);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c2678xa407981c);
            xmVar.a(c2678xa407981c, 0);
            c2678xa407981c.a(xmVar);
            android.widget.ImageView imageView = (android.widget.ImageView) mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.cl7);
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.m6e);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.cje);
            c22801x87cbdc00.m82565x6107557d(true);
            float dimension = mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            c22646x1e9ca55.b(dimension, dimension, 0.0f, 0.0f);
            android.view.ViewGroup.LayoutParams layoutParams = c22646x1e9ca55.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) layoutParams)).topMargin = -((int) dimension);
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            layoutParams2.height = mo55332x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562030zj);
            imageView.setLayoutParams(layoutParams2);
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.f().b(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.f411486d)).c(imageView);
        }
    }

    public final void f7() {
        android.widget.RelativeLayout relativeLayout = this.A;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.C;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.B;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.m82040x7541828(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621));
        }
        android.widget.TextView textView = this.D;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621));
        }
    }

    public final void g7() {
        mo78514x143f1b92().O0(com.p314xaae8f345.mm.ui.bk.C());
        mo78514x143f1b92().W0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b_m;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r43) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = this.f191108u;
        if (r10Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        r10Var.mo979x3f5eee52();
        I.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.x10 x10Var = this.f191109v;
        if (x10Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        x10Var.m56022x4905e9fa().V0(this.G);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.Kh((zy2.zb) c17, null, ml2.x1.f409735f, "26", ml2.y.f409774f, 0, 0L, 0, 112, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.Kh((zy2.zb) c17, null, ml2.x1.f409735f, "26", ml2.y.f409773e, 0, 0L, 0, 112, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.r10 r10Var = this.f191108u;
        if (r10Var != null) {
            r10Var.s();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
    }
}
