package yi2;

/* loaded from: classes10.dex */
public final class l0 implements yi2.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f544076a;

    /* renamed from: b, reason: collision with root package name */
    public final xi2.e f544077b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.Space f544078c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f544079d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f544080e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f544081f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f544082g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f544083h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f544084i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f544085j;

    public l0(android.view.View root, xi2.e server) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(server, "server");
        this.f544076a = root;
        this.f544077b = server;
        qo0.c cVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) server).f200903a.f201125c.f194858g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
        this.f544078c = k0Var != null ? (android.widget.Space) k0Var.findViewById(com.p314xaae8f345.mm.R.id.qxq) : null;
        this.f544079d = "VisitorSingleBattleBarWidget_" + hashCode();
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f566101ep2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f544080e = findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.epf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f544081f = findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.q9p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f544082g = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.epg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f544083h = textView;
        android.view.View findViewById5 = root.findViewById(com.p314xaae8f345.mm.R.id.qva);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f544084i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById5;
        this.f544085j = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new yi2.j0(this), true);
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        textView.setTextSize(1, (12.6f * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
    }

    @Override // yi2.o0
    public void a(int i17, boolean z17) {
        this.f544084i.setVisibility(8);
        android.view.View view = this.f544080e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleFinishPublicityCountDown", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleFinishPublicityCountDown", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f544081f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleFinishPublicityCountDown", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleFinishPublicityCountDown", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f544076a;
        android.widget.TextView textView = this.f544083h;
        if (i17 < 10) {
            textView.setText(view3.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzu) + " 0" + i17);
        } else {
            textView.setText(view3.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzu) + ' ' + i17);
        }
        if (z17) {
            h();
        }
    }

    @Override // yi2.o0
    public void b() {
        g();
        this.f544084i.setVisibility(0);
        android.view.View view = this.f544081f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f544080e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yi2.o0
    public void c(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("battleEnd curBattle:");
        xi2.e eVar = this.f544077b;
        sb6.append(((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) eVar).a().a(mm2.o4.class)).Z);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544079d, sb6.toString());
        this.f544083h.setText(no0.m.f420263a.b(0, ":"));
        this.f544085j.d();
        if (((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) eVar).a().a(mm2.o4.class)).Z == null || z17) {
            return;
        }
        g();
    }

    @Override // yi2.o0
    public void d() {
        pm0.v.X(new yi2.k0(this));
    }

    @Override // yi2.o0
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f544079d, "onAnimationStart status:");
    }

    @Override // yi2.o0
    public android.view.View f() {
        return this.f544076a;
    }

    public final void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8 p8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544077b;
        dk2.u4 u4Var = ((mm2.o4) p8Var.a().a(mm2.o4.class)).Z;
        if (u4Var != null) {
            ce2.i e17 = dk2.u7.f315714a.e(u4Var.f315695i);
            int i17 = u4Var.f315694h;
            android.widget.ImageView imageView = this.f544082g;
            if (i17 != 1) {
                imageView.setVisibility(8);
                return;
            }
            if (((mm2.o4) p8Var.a().a(mm2.o4.class)).f410857s.size() != 1) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
            java.lang.String str = e17 != null ? e17.f67819x7194d06c : null;
            if (str == null) {
                str = "";
            }
            ((wo0.b) d1Var.a(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f))).c(imageView);
        }
    }

    public final void h() {
        this.f544085j.d();
        android.view.View view = this.f544081f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleCreated", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleCreated", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f544080e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleCreated", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleCreated", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f544084i.setVisibility(8);
        this.f544083h.setText("PK" + this.f544076a.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzt));
        g();
        mo177186xcd1079b0(0);
    }

    @Override // yi2.o0
    public void i(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f544085j;
        b4Var.d();
        b4Var.c(1000L, 1000L);
        no0.l lVar = no0.m.f420263a;
        dk2.u4 u4Var = ((mm2.o4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p8) this.f544077b).a().a(mm2.o4.class)).Z;
        this.f544083h.setText(lVar.b(u4Var != null ? u4Var.f315689c : 0, ":"));
        this.f544084i.setVisibility(0);
        g();
        if (!z17) {
            android.view.View view = this.f544081f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f544080e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo177186xcd1079b0(0);
    }

    @Override // yi2.o0
    /* renamed from: reset */
    public void mo177185x6761d4f() {
        this.f544085j.d();
        android.view.View view = this.f544081f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f544080e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f544084i.setVisibility(8);
        this.f544083h.setText("PK" + this.f544076a.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzt));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    @Override // yi2.o0
    /* renamed from: setVisible */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo177186xcd1079b0(int r12) {
        /*
            r11 = this;
            android.view.View r0 = r11.f544076a
            android.content.Context r1 = r0.getContext()
            boolean r1 = r1 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r1 == 0) goto L3a
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            pf5.z r1 = pf5.z.f435481a
            boolean r2 = r0 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r2 == 0) goto L2e
            androidx.appcompat.app.AppCompatActivity r0 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r0
            pf5.v r0 = r1.a(r0)
            java.lang.Class<pl2.x> r1 = pl2.x.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            pl2.x r0 = (pl2.x) r0
            boolean r0 = r0.f438216f
            if (r0 == 0) goto L3a
            r0 = 8
            goto L3b
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L3a:
            r0 = r12
        L3b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "battle setVisible: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r11.f544079d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            android.view.View r1 = r11.f544076a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f554818a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r4 = r2.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget"
            java.lang.String r6 = "setVisible"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r1
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget"
            java.lang.String r5 = "setVisible"
            java.lang.String r6 = "(I)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r1
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
            android.widget.Space r1 = r11.f544078c
            if (r1 == 0) goto La0
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            goto La1
        La0:
            r1 = 0
        La1:
            if (r1 != 0) goto La4
            goto Lb0
        La4:
            if (r12 != 0) goto Lae
            android.content.Context r12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r0 = 20
            int r0 = i65.a.b(r12, r0)
        Lae:
            r1.height = r0
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yi2.l0.mo177186xcd1079b0(int):void");
    }
}
