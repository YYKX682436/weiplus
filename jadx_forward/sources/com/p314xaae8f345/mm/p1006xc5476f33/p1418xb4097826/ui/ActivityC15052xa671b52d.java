package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderPostAtUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "com/tencent/mm/plugin/finder/ui/qb", "com/tencent/mm/plugin/finder/ui/rb", "com/tencent/mm/plugin/finder/ui/sb", "com/tencent/mm/plugin/finder/ui/ac", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderPostAtUI */
/* loaded from: classes2.dex */
public final class ActivityC15052xa671b52d extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int D = 0;
    public int A;
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 B;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 C;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f210180w;

    /* renamed from: y, reason: collision with root package name */
    public int f210182y;

    /* renamed from: z, reason: collision with root package name */
    public long f210183z;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f210177t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f210178u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final bu2.o f210179v = new bu2.o("followList.fp");

    /* renamed from: x, reason: collision with root package name */
    public boolean f210181x = true;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b5k;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 20000 && intent != null && i18 == -1) {
            getIntent().putExtra("key_select_contact", intent.getByteArrayExtra("at_select_contact"));
            getIntent().putExtra("key_source", intent.getBooleanExtra("is_follow", false) ? 3 : 4);
            setResult(-1, getIntent());
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ya2.b2 b2Var;
        super.onCreate(bundle);
        gm0.j1.d().a(713, this);
        this.f210182y = getIntent().getIntExtra("KEY_ENTER_SCENE", 0);
        this.f210183z = getIntent().getLongExtra("key_finder_object_id", 0L);
        this.A = getIntent().getIntExtra("key_remind_finder_half_screen_source", 0);
        java.util.LinkedList Xk = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Xk();
        if (Xk != null) {
            java.util.Collections.sort(Xk, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ec.f210633d);
            java.util.Iterator it = Xk.iterator();
            while (it.hasNext()) {
                r45.gb4 gb4Var = (r45.gb4) it.next();
                if (gb4Var == null) {
                    b2Var = null;
                } else {
                    b2Var = new ya2.b2();
                    b2Var.f69347xdec927b = gb4Var.m75945x2fec8307(0);
                    b2Var.f69328x21f9b213 = gb4Var.m75945x2fec8307(2);
                    java.lang.String m75945x2fec8307 = gb4Var.m75945x2fec8307(1);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    b2Var.f69301x81118c51 = m75945x2fec8307;
                    b2Var.f69300x731cac1b = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc) gb4Var.m75936x14adae67(3);
                    b2Var.f69345xaed49e5b = gb4Var.m75939xb282bd08(7);
                }
                if (b2Var != null) {
                    this.f210178u.add(b2Var);
                }
            }
        }
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        pm0.v.T(pm0.v.J(km5.u.d(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fc(this)), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.gc(this));
        gm0.j1.d().g(new db2.o5(this.f210180w));
        setResult(0, getIntent());
        if (this.f210182y == 1) {
            mo54450xbf7c1df6(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573522ev3));
        } else {
            mo54450xbf7c1df6(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573521ev2));
        }
        if (lk5.s.b(this)) {
            m78531x8f8cf1fb();
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.qkl);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderPostAtUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qkm);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            com.p314xaae8f345.mm.ui.fk.a(textView);
            findViewById(com.p314xaae8f345.mm.R.id.lth).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.bc(this));
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.r0b);
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(findViewById2, "remind_finder_half_screen");
            dy1.r ik6 = aVar.ik(findViewById2, 32, 25496);
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
            lVarArr[1] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f216919r : null);
            lVarArr[2] = new jz5.l("remind_finder_half_screen_source", java.lang.Integer.valueOf(this.A));
            lVarArr[3] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f216915p : null);
            ((cy1.a) ik6).gk(findViewById2, kz5.c1.k(lVarArr));
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.cc(this));
        android.view.View findViewById3 = mo55332x76847179().findViewById(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById3;
        this.B = c22801x87cbdc00;
        this.C = c22801x87cbdc00.m82555x4905e9fa();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.C;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba4.mo7967x900dcbe1(c15415x74224fd8);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.C;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba42.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ac(this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.C;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba43.m7963x830bc99d(true);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.C;
        if (c1163xf1deaba44 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba44.m7965x440a0e9(5);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba45 = this.C;
        if (c1163xf1deaba45 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba45.mo7946xf939df19();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ac) mo7946xf939df19).m8146xced61ae5();
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.B;
        if (c22801x87cbdc002 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        c22801x87cbdc002.m82689x3c9625d9(false);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = this.B;
        if (c22801x87cbdc003 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        c22801x87cbdc003.m82697xe136b7d8(inflate);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc004 = this.B;
        if (c22801x87cbdc004 != null) {
            c22801x87cbdc004.m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.dc(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(713, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.C;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ac) mo7946xf939df19).f210390d) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.C;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c1163xf1deaba42.mo7946xf939df19();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df192, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ac) mo7946xf939df192).f210390d = true;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.C;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df193 = c1163xf1deaba43.mo7946xf939df19();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df193, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ac) mo7946xf939df193).m8149x8b456734(0);
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.hc hcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.hc(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(hcVar, 300L, false);
        if (lk5.s.b(this)) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.C;
            if (c1163xf1deaba44 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba44, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderPostAtUI", "onResume", "()V", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba44.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba44, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI", "onResume", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(" scene type ");
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostAtUI", sb6.toString());
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null;
        if (valueOf != null && valueOf.intValue() == 713 && i17 == 0 && i18 == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderGetFollowList");
            db2.o5 o5Var = (db2.o5) m1Var;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = o5Var.f309639g.f152243a.f152217a;
            r45.k61 k61Var = fVar instanceof r45.k61 ? (r45.k61) fVar : null;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f210180w, k61Var != null ? k61Var.m75934xbce7f2f(1) : null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostAtUI", "not my buf, ignore!");
                return;
            }
            if (this.f210180w == null) {
                java.util.regex.Pattern pattern = pm0.v.f438335a;
                pm0.v.J(km5.u.d(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ic(this, m1Var));
                z17 = true;
            } else {
                z17 = false;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = o5Var.f309639g.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
            this.f210181x = ((r45.l61) fVar2).m75939xb282bd08(3) != 0;
            this.f210180w = o5Var.L();
            java.util.LinkedList K = o5Var.K();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostAtUI", "firstPage " + z17 + ", get follow contact " + K.size());
            java.util.ArrayList arrayList = this.f210177t;
            if (z17) {
                arrayList.clear();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(K, 10));
            java.util.Iterator it = K.iterator();
            while (it.hasNext()) {
                arrayList2.add(ya2.d.h((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it.next(), null, false, 3, null));
            }
            arrayList.addAll(arrayList2);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.C;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderPostAtUI.SelectAtContactAdapter");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ac) mo7946xf939df19).m8146xced61ae5();
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.B;
            if (c22801x87cbdc00 != null) {
                c22801x87cbdc00.N(K.size());
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
        }
    }
}
