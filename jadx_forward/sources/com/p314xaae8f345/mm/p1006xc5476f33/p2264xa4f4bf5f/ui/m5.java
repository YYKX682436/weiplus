package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes10.dex */
public final class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f255623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18628xf43ab4a1 f255624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255625f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255626g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f255627h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f255628i;

    public m5(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18628xf43ab4a1 activityC18628xf43ab4a1, java.lang.String str, java.lang.String str2, boolean z17, long j17) {
        this.f255623d = i17;
        this.f255624e = activityC18628xf43ab4a1;
        this.f255625f = str;
        this.f255626g = str2;
        this.f255627h = z17;
        this.f255628i = j17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    @Override // java.lang.Runnable
    public final void run() {
        c61.z6 z6Var;
        long j17;
        boolean z17;
        java.lang.String str;
        ?? r37;
        java.lang.String textStatusId = this.f255626g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18628xf43ab4a1 context = this.f255624e;
        int i17 = this.f255623d;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.bc bcVar = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18646xfde55447.f255159i;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = context.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            bcVar.a(mo55332x76847179, textStatusId);
            return;
        }
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.l5 l5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.l5(textStatusId, context);
        ((c61.l7) b6Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String userName = this.f255625f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textStatusId, "textStatusId");
        ci4.b bVar = (ci4.b) pf5.z.f435481a.a(context).a(ci4.b.class);
        c61.z6 z6Var2 = new c61.z6(l5Var);
        bVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTextStatusCommentClick() called with: refCommentId = ");
        long j18 = this.f255628i;
        sb6.append(j18);
        sb6.append(", userName = ");
        sb6.append(userName);
        sb6.append(", textStatusId = ");
        sb6.append(textStatusId);
        sb6.append(", isExpired = ");
        boolean z18 = this.f255627h;
        sb6.append(z18);
        sb6.append(", closeCallback = ");
        sb6.append(z6Var2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentUIC", sb6.toString());
        if (bVar.f123247d == null) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.b.f211734b;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = bVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
            android.view.View decorView = bVar.m158354x19263085().getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
            abstractActivityC21394xb3d2c0cf.getWindow().setSoftInputMode(50);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.b bVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.b(2, false, null, 4, null);
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1.S;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0(abstractActivityC21394xb3d2c0cf));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 c15144x165092d1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1(abstractActivityC21394xb3d2c0cf);
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i27 = b17.x;
            int i28 = b17.y;
            java.lang.System.nanoTime();
            boolean z19 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!z19) {
                if (i28 >= i27) {
                    i27 = i28;
                }
                i28 = i27;
            }
            j17 = j18;
            c15144x165092d1.m82850x46bc3006((int) (i28 * 0.25d));
            android.content.Context context2 = c15144x165092d1.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            a2Var.f211714u = context2;
            a2Var.f211708o = c15144x165092d1;
            c15144x165092d1.m82849x50955ab0(com.p314xaae8f345.mm.R.C30861xcebc809e.f563713b66);
            c15144x165092d1.m82845x59f38d7d(true);
            c15144x165092d1.f295092s.add(a2Var);
            a2Var.e().m61009x53aed94a(2);
            a2Var.e().m61011xf54f7efb(a2Var.e().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String() == 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d dVar = a2Var.f211700d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var = dVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) dVar : null;
            if (o0Var != null) {
                o0Var.f211858g = 70;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(dVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawerPresenter");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) dVar).f211873y = false;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawer", "[initView] bottomMargin= " + com.p314xaae8f345.mm.ui.bl.g(abstractActivityC21394xb3d2c0cf));
            ((android.widget.FrameLayout) decorView).addView(c15144x165092d1, layoutParams);
            android.widget.FrameLayout headerLayout = c15144x165092d1.m82836xcb847e8d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLayout, "headerLayout");
            a2Var.f211709p = headerLayout;
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cyr, headerLayout);
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.d4v);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            a2Var.f211704h = (android.widget.TextView) findViewById;
            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.d4u);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            a2Var.f211705i = (android.widget.TextView) findViewById2;
            android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ear);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            a2Var.f211715v = findViewById3;
            android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.eap);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
            a2Var.f211703g = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.iiy);
            android.widget.TextView textView = a2Var.f211704h;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleTv");
                throw null;
            }
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.byz);
            if (findViewById5 != null) {
                findViewById5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.x1(a2Var));
            }
            if (findViewById5 != null) {
                com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22824x40bb30c2 c22824x40bb30c2 = a2Var.e().f295084h;
                if (!c22824x40bb30c2.m82855x640befdd().contains(findViewById5)) {
                    c22824x40bb30c2.m82855x640befdd().add(findViewById5);
                }
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 rlLayout = c15144x165092d1.m82833x510df255();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rlLayout, "rlLayout");
            a2Var.f211706m = rlLayout;
            android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.czr, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            rlLayout.m82697xe136b7d8(inflate2);
            rlLayout.setBackgroundColor(i65.a.d(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = rlLayout.m82555x4905e9fa();
            m82555x4905e9fa.m7964x8d4ad49c(null);
            m82555x4905e9fa.m7963x830bc99d(true);
            m82555x4905e9fa.m7965x440a0e9(4);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = m82555x4905e9fa.m7949x5701d990();
            if (m7949x5701d990 == null) {
                z17 = z18;
            } else {
                z17 = z18;
                m7949x5701d990.f93704f = 0L;
            }
            m82555x4905e9fa.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(abstractActivityC21394xb3d2c0cf));
            m82555x4905e9fa.mo7960x6cab2c8d(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) dVar).e(abstractActivityC21394xb3d2c0cf));
            int dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            m82555x4905e9fa.setPadding(dimensionPixelSize, m82555x4905e9fa.getPaddingTop(), dimensionPixelSize, m82555x4905e9fa.getPaddingBottom());
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                m82555x4905e9fa.m7971xa810ec34(a2Var.f211702f);
            } else {
                m82555x4905e9fa.m7971xa810ec34(a2Var.f211701e);
            }
            m82555x4905e9fa.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.t1(a2Var, abstractActivityC21394xb3d2c0cf));
            int[] iArr = new int[4];
            iArr[0] = (int) abstractActivityC21394xb3d2c0cf.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
            str = "MicroMsg.TextStatus.TextStatusCommentDrawer";
            z6Var = z6Var2;
            m82555x4905e9fa.N(new dx2.a(new android.graphics.drawable.ColorDrawable(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77696x3cb0741)), (int) abstractActivityC21394xb3d2c0cf.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561947x9), iArr, (int) abstractActivityC21394xb3d2c0cf.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.x_)));
            java.lang.Object parent = rlLayout.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
            a2Var.e().m82835x2d5b4f1b().addOnLayoutChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.u1(a2Var, (android.view.View) parent));
            android.widget.FrameLayout footerLayout = c15144x165092d1.m82835x2d5b4f1b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(footerLayout, "footerLayout");
            android.view.View findViewById6 = com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cyq, footerLayout).findViewById(com.p314xaae8f345.mm.R.id.eat);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
            a2Var.f211707n = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b) findViewById6;
            a2Var.f().m61046x31c61473(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.v1(a2Var));
            a2Var.f().m61069xe955eca(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.w1(a2Var));
            a2Var.f().m61064xf54f7efb(a2Var.e().isSelfProfile);
            a2Var.f().m61063x53aed94a(a2Var.e().getSceneForReply());
            a2Var.f().m61047xbd14632b(a2Var.e().getBanSwitch());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusTimelineDrawerBuilder", "drawerFooter.scene " + a2Var.f().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String());
            a2Var.f().l(false);
            a2Var.f().k(false);
            a2Var.e().m82847x92bd23e6(a2Var.f());
            a2Var.e().m61001xcab0c9d(a2Var.f());
            android.widget.FrameLayout loadingLayout = c15144x165092d1.m82838xccb9a7d0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadingLayout, "loadingLayout");
            a2Var.f211710q = loadingLayout;
            android.view.View inflate3 = android.view.LayoutInflater.from(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cyx, (android.view.ViewGroup) loadingLayout, true);
            android.view.View findViewById7 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.c7i);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
            a2Var.f211711r = findViewById7;
            android.view.View findViewById8 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.f567674kc0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
            a2Var.f211712s = findViewById8;
            android.view.View findViewById9 = inflate3.findViewById(com.p314xaae8f345.mm.R.id.m2a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
            a2Var.f211713t = findViewById9;
            android.view.View view = a2Var.f211711r;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View i29 = a2Var.i();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(i29, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i29.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(i29, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View j19 = a2Var.j();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(j19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            j19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(j19, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bVar2.f211735a = c15144x165092d1;
            bVar.f123247d = bVar2;
        } else {
            z6Var = z6Var2;
            j17 = j18;
            z17 = z18;
            str = "MicroMsg.TextStatus.TextStatusCommentDrawer";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.b bVar3 = bVar.f123247d;
        if (bVar3 != null) {
            iv2.a aVar = new iv2.a("", textStatusId, userName, z17);
            int i37 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.b.f211734b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 c15144x165092d12 = bVar3.f211735a;
            if (c15144x165092d12 != null) {
                c15144x165092d12.m61004x1367b0cd(z6Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 c15144x165092d13 = bVar3.f211735a;
            if (c15144x165092d13 != 0) {
                int i38 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1.S;
                c15144x165092d13.isOnlyShowDesc = false;
                c15144x165092d13.showFooter = true;
                if (aVar.f376653c) {
                    c15144x165092d13.showFooter = false;
                }
                c15144x165092d13.closeComment = false;
                c15144x165092d13.oldVersion = false;
                c15144x165092d13.banSwitch = false;
                c15144x165092d13.com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String = 0;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b c15147x19964f7b = c15144x165092d13.footer;
                if (c15147x19964f7b != null) {
                    c15147x19964f7b.m61047xbd14632b(false);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b c15147x19964f7b2 = c15144x165092d13.footer;
                if (c15147x19964f7b2 != null) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b.N;
                    r37 = 1;
                    c15147x19964f7b2.l(true);
                } else {
                    r37 = 1;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                if (t70Var.C2() > 0) {
                    t70Var.c3(t70Var.C2() - r37);
                }
                c15144x165092d13.k(r37);
                if (c15144x165092d13.getVisibility() == 0) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "openDrawer: username=" + aVar.f376652b + ", statusId=" + aVar.f376651a);
                c15144x165092d13.feedObj = aVar;
                long j27 = j17;
                c15144x165092d13.refCommentId = j27;
                c15144x165092d13.isSingleMode = false;
                c15144x165092d13.replyCommentObj = null;
                c15144x165092d13.blinkRefComment = true;
                boolean z27 = j27 == 0;
                com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22824x40bb30c2 c22824x40bb30c22 = c15144x165092d13.f295084h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DrawerSquares", "[openDrawer] isOpening=" + c22824x40bb30c22.isOpening + ", canCloseDrawerWhenStop=" + z27);
                if (c22824x40bb30c22.isOpening) {
                    return;
                }
                c22824x40bb30c22.m82860xad1bd797(z27);
                com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = c22824x40bb30c22.f295107o;
                if (f5Var != null) {
                    f5Var.f291933e = c22824x40bb30c22;
                }
                cn5.k kVar = c22824x40bb30c22.onOpenDrawerListener;
                if (kVar != null) {
                    kVar.c(true, true, 0);
                }
                c22824x40bb30c22.isOpening = true;
                if (c22824x40bb30c22.getHeight() <= 0.0f) {
                    c22824x40bb30c22.f295109q = new cn5.u(c22824x40bb30c22, 0);
                } else {
                    c22824x40bb30c22.setTranslationY(c22824x40bb30c22.getHeight());
                    ((cn5.r) c22824x40bb30c22.f295110r).mo146xb9724478(new cn5.v(c22824x40bb30c22));
                }
                c22824x40bb30c22.setVisibility(0);
            }
        }
    }
}
