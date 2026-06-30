package go2;

/* loaded from: classes2.dex */
public final class z extends x92.r {
    public android.view.View A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 B;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 C;
    public java.lang.String D;
    public boolean E;
    public final java.util.HashMap F;
    public final jz5.g G;
    public final kk.l H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f355619J;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f355620g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f355621h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f355622i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 f355623m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f355624n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f355625o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f355626p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f355627q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f355628r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f355629s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f355630t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f355631u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f355632v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f355633w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f355634x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f355635y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f355636z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f355631u = new java.util.ArrayList();
        this.D = "";
        this.F = new java.util.HashMap();
        this.G = jz5.h.b(new go2.h(activity));
        this.H = new kk.l(1);
        this.f355619J = jz5.h.b(new go2.q(activity));
    }

    @Override // x92.r
    public void R6() {
        super.R6();
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_author_finder_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.D = stringExtra;
        this.E = m158359x1e885992().getBooleanExtra("key_self_flag", false);
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f567408jf1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        this.f355620g = mo144222x4ff8c0f0;
        android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.jet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f02, "findViewById(...)");
        this.f355621h = (android.widget.TextView) mo144222x4ff8c0f02;
        android.view.View mo144222x4ff8c0f03 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.raa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f03, "findViewById(...)");
        this.f355622i = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo144222x4ff8c0f03;
        android.widget.TextView textView = this.f355621h;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberTitle");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 1.0f);
        android.view.View mo144222x4ff8c0f04 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.jer);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f04, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) mo144222x4ff8c0f04;
        this.f355623m = c15258xcd50c176;
        c15258xcd50c176.m61742x56ba452e(com.p314xaae8f345.mm.R.C30867xcad56011.f572809cl4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c1762 = this.f355623m;
        if (c15258xcd50c1762 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberDesc");
            throw null;
        }
        c15258xcd50c1762.m61738x5cc3d915(com.p314xaae8f345.mm.R.C30867xcad56011.f572809cl4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c1763 = this.f355623m;
        if (c15258xcd50c1763 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberDesc");
            throw null;
        }
        c15258xcd50c1763.m61741xc3b64c0d(4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c1764 = this.f355623m;
        if (c15258xcd50c1764 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberDesc");
            throw null;
        }
        c15258xcd50c1764.m61722x390676d5().k(0.0f, 1.4f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c1765 = this.f355623m;
        if (c15258xcd50c1765 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberDesc");
            throw null;
        }
        c15258xcd50c1765.f(true, false);
        android.view.View mo144222x4ff8c0f05 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.rwx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f05, "findViewById(...)");
        this.f355624n = (android.view.ViewGroup) mo144222x4ff8c0f05;
        android.view.View mo144222x4ff8c0f06 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.jfp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f06, "findViewById(...)");
        this.f355632v = mo144222x4ff8c0f06;
        android.view.View findViewById = mo144222x4ff8c0f06.findViewById(com.p314xaae8f345.mm.R.id.i6m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f355633w = (android.widget.ImageView) findViewById;
        android.view.View view = this.f355632v;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveLayout");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.cnv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f355634x = (android.widget.TextView) findViewById2;
        android.view.View view2 = this.f355632v;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveLayout");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.cnw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f355635y = (android.widget.TextView) findViewById3;
        android.view.View view3 = this.f355632v;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveLayout");
            throw null;
        }
        android.view.View findViewById4 = view3.findViewById(com.p314xaae8f345.mm.R.id.cnt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f355636z = (android.widget.ImageView) findViewById4;
        android.view.View mo144222x4ff8c0f07 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.jev);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f07, "findViewById(...)");
        this.f355625o = mo144222x4ff8c0f07;
        android.view.View mo144222x4ff8c0f08 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.q8f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f08, "findViewById(...)");
        this.f355626p = (android.widget.TextView) mo144222x4ff8c0f08;
        android.view.View mo144222x4ff8c0f09 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.pyx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f09, "findViewById(...)");
        this.f355627q = (android.widget.TextView) mo144222x4ff8c0f09;
        android.view.View mo144222x4ff8c0f010 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.jfl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f010, "findViewById(...)");
        this.f355628r = (android.widget.TextView) mo144222x4ff8c0f010;
        android.view.View mo144222x4ff8c0f011 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.jfj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f011, "findViewById(...)");
        this.f355629s = (android.widget.TextView) mo144222x4ff8c0f011;
        android.view.View mo144222x4ff8c0f012 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.l_a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f012, "findViewById(...)");
        this.A = mo144222x4ff8c0f012;
        android.widget.TextView textView2 = this.f355627q;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postDynamicBtn");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.widget.TextView textView3 = this.f355628r;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postVideoBtn");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        android.widget.TextView textView4 = this.f355629s;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postLiveBtn");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
        android.view.View mo144222x4ff8c0f013 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.jfr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f013, "findViewById(...)");
        this.f355630t = mo144222x4ff8c0f013;
        mo144222x4ff8c0f013.setOnClickListener(new go2.k(this));
        android.widget.TextView textView5 = this.f355627q;
        if (textView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postDynamicBtn");
            throw null;
        }
        textView5.setOnClickListener(new go2.l(this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f355622i;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberStatRecycleView");
            throw null;
        }
        final android.app.Activity m80379x76847179 = m80379x76847179();
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(m80379x76847179) { // from class: com.tencent.mm.plugin.finder.member.area.uic.FinderMemberAreaHeaderUIC$initStatList$1
            @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
            /* renamed from: canScrollVertically */
            public boolean getF204840r() {
                return false;
            }
        });
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f355622i;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberStatRecycleView");
            throw null;
        }
        c1163xf1deaba42.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.member.area.uic.FinderMemberAreaHeaderUIC$initStatList$2
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oo();
            }
        }, this.f355631u, false));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.D, xy2.c.e(m80379x76847179()))) {
            android.view.View view4 = this.f355625o;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authorLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView6 = this.f355628r;
            if (textView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postVideoBtn");
                throw null;
            }
            textView6.setOnClickListener(new go2.m(this));
            android.widget.TextView textView7 = this.f355629s;
            if (textView7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postLiveBtn");
                throw null;
            }
            textView7.setOnClickListener(new go2.n(this));
            if (((java.lang.Number) ae2.in.G5.r()).intValue() != 1 && com.p314xaae8f345.mm.ui.bk.A()) {
                android.widget.TextView textView8 = this.f355629s;
                if (textView8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postLiveBtn");
                    throw null;
                }
                textView8.setVisibility(8);
            }
        }
        java.lang.String str = this.D;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.D, xy2.c.e(m80379x76847179()));
        jz5.g gVar = this.G;
        r45.qt2 qt2Var = (r45.qt2) ((jz5.n) gVar).mo141623x754a37bb();
        kk.l lVar = this.H;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4(str, m158354x19263085, b17, qt2Var, 101, false, true, lVar, "204", null, 512, null);
        s4Var.f206303x = new go2.i(s4Var, this);
        this.C = s4Var;
        android.view.View view5 = this.f355620g;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberContainer");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1(view5, m158354x19263085(), (r45.qt2) ((jz5.n) gVar).mo141623x754a37bb(), false, lVar, "204", null, 64, null);
        s1Var.f206257h = new go2.j(this);
        s1Var.D = true;
        this.B = s1Var;
        s1Var.k(this.D);
        pf5.u uVar = pf5.u.f435469a;
        ((im2.p4) ((zy2.m8) uVar.c(m158354x19263085()).c(zy2.m8.class))).f374028o = new go2.o(this);
        ((im2.p4) ((zy2.m8) uVar.c(m158354x19263085()).c(zy2.m8.class))).f374029p = new go2.p();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.D, xy2.c.e(m158354x19263085()))) {
            if (this.E) {
                r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("AuthorProfileMemberShipZone");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("AuthorProfileMemberShipZone");
                if (I0 != null && L0 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a.e("3", L0, I0, 2, (r20 & 16) != 0 ? "" : null, (r20 & 32) != 0 ? 0 : 0, (r20 & 64) != 0 ? 0 : 0, (r20 & 128) != 0 ? 0 : 0);
                }
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("AuthorProfileMemberShipZone");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("FinderMyTab", new int[]{32});
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("ProfileEntrance", new int[]{32});
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(m158354x19263085(), iy1.c.FinderMemberAreaUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(m158354x19263085(), 12, 27010);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("finder_username", this.D);
        lVarArr[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
        lVarArr[2] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f216919r : null);
        eo2.b bVar = (eo2.b) uVar.b(m80379x76847179()).e(eo2.b.class);
        lVarArr[3] = new jz5.l("member_inlet_source", java.lang.Integer.valueOf(bVar != null ? bVar.f337091d : 0));
        lVarArr[4] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f216915p : null);
        lVarArr[5] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f216918q : null);
        ((cy1.a) rVar).gk(m158354x192630852, kz5.c1.k(lVarArr));
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view6 = this.A;
        if (view6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveNoticeLayout");
            throw null;
        }
        ((cy1.a) rVar2).pk(view6, "appointment_live");
        dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view7 = this.A;
        if (view7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveNoticeLayout");
            throw null;
        }
        ((cy1.a) rVar3).ik(view7, 40, 25496);
        dy1.r rVar4 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view8 = this.A;
        if (view8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveNoticeLayout");
            throw null;
        }
        jz5.l[] lVarArr2 = new jz5.l[6];
        eo2.b bVar2 = (eo2.b) uVar.b(m80379x76847179()).e(eo2.b.class);
        lVarArr2[0] = new jz5.l("member_inlet_source", java.lang.Integer.valueOf(bVar2 != null ? bVar2.f337091d : 0));
        lVarArr2[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
        lVarArr2[2] = new jz5.l("finder_username", this.D);
        lVarArr2[3] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f216919r : null);
        lVarArr2[4] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f216915p : null);
        lVarArr2[5] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f216918q : null);
        ((cy1.a) rVar4).gk(view8, kz5.c1.k(lVarArr2));
        dy1.r rVar5 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view9 = this.f355630t;
        if (view9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberRightLayout");
            throw null;
        }
        ((cy1.a) rVar5).pk(view9, "member_rights");
        dy1.r rVar6 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view10 = this.f355630t;
        if (view10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberRightLayout");
            throw null;
        }
        ((cy1.a) rVar6).ik(view10, 40, 25496);
        dy1.r rVar7 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view11 = this.f355630t;
        if (view11 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberRightLayout");
            throw null;
        }
        jz5.l[] lVarArr3 = new jz5.l[6];
        eo2.b bVar3 = (eo2.b) uVar.b(m80379x76847179()).e(eo2.b.class);
        lVarArr3[0] = new jz5.l("member_inlet_source", java.lang.Integer.valueOf(bVar3 != null ? bVar3.f337091d : 0));
        lVarArr3[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
        lVarArr3[2] = new jz5.l("finder_username", this.D);
        lVarArr3[3] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f216919r : null);
        lVarArr3[4] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f216915p : null);
        lVarArr3[5] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f216918q : null);
        ((cy1.a) rVar7).gk(view11, kz5.c1.k(lVarArr3));
    }

    @Override // x92.r
    public void U6() {
        r45.j32 j32Var;
        r45.cc ccVar;
        z5();
        ya2.g gVar = ya2.h.f542017a;
        if (gVar.b(this.D) == null) {
            r45.tr0 tr0Var = (r45.tr0) this.f534252d;
            ya2.g.m(gVar, tr0Var != null ? tr0Var.f468265p : null, false, 2, null);
        }
        android.widget.TextView textView = this.f355621h;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberTitle");
            throw null;
        }
        r45.tr0 tr0Var2 = (r45.tr0) this.f534252d;
        textView.setText(tr0Var2 != null ? tr0Var2.f468257e : null);
        r45.tr0 tr0Var3 = (r45.tr0) this.f534252d;
        java.lang.String str = tr0Var3 != null ? tr0Var3.f468258f : null;
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = this.f355623m;
            if (c15258xcd50c176 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberDesc");
                throw null;
            }
            c15258xcd50c176.setVisibility(8);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c1762 = this.f355623m;
            if (c15258xcd50c1762 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberDesc");
                throw null;
            }
            c15258xcd50c1762.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c1763 = this.f355623m;
            if (c15258xcd50c1763 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberDesc");
                throw null;
            }
            r45.tr0 tr0Var4 = (r45.tr0) this.f534252d;
            c15258xcd50c1763.m61745x765074af(tr0Var4 != null ? tr0Var4.f468258f : null);
        }
        r45.tr0 tr0Var5 = (r45.tr0) this.f534252d;
        if (tr0Var5 != null && eo2.a.a(java.lang.Long.valueOf(tr0Var5.f468270u))) {
            android.widget.TextView textView2 = this.f355627q;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postDynamicBtn");
                throw null;
            }
            textView2.setVisibility(0);
        }
        r45.tr0 tr0Var6 = (r45.tr0) this.f534252d;
        if (tr0Var6 != null) {
            if (tr0Var6.f468256d == 2) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Hk(m158354x19263085(), new android.content.Intent(), this.D, tr0Var6.f468256d, tr0Var6.f468259g);
                m158354x19263085().finish();
                return;
            }
            if (tr0Var6.A == 1) {
                android.view.ViewGroup viewGroup = this.f355624n;
                if (viewGroup == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blackListBlockLayout");
                    throw null;
                }
                viewGroup.setVisibility(0);
                android.widget.TextView textView3 = this.f355627q;
                if (textView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postDynamicBtn");
                    throw null;
                }
                textView3.setVisibility(8);
                android.view.View view = this.A;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveNoticeLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            int i17 = tr0Var6.f468259g;
            if (i17 == 0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Kk(m80379x76847179(), new android.content.Intent(), this.D);
                m158354x19263085().finish();
                return;
            }
            if (i17 == 1) {
                W6(tr0Var6 != null ? tr0Var6.f468272w : null);
                android.view.View view2 = this.f355630t;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberRightLayout");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView4 = this.f355626p;
                if (textView4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberStatistic");
                    throw null;
                }
                textView4.setVisibility(8);
                r45.g07 g07Var = tr0Var6.f468260h;
                V6(g07Var != null ? g07Var.f456323e : null, tr0Var6.f468259g == 2);
            } else if (i17 == 2) {
                r45.cc ccVar2 = tr0Var6.f468262m;
                android.view.View view3 = this.f355630t;
                if (view3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberRightLayout");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateAuthorInfo", "(Lcom/tencent/mm/protocal/protobuf/AuthorMemberInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateAuthorInfo", "(Lcom/tencent/mm/protocal/protobuf/AuthorMemberInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView5 = this.f355626p;
                if (textView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberStatistic");
                    throw null;
                }
                textView5.setVisibility(0);
                android.view.View view4 = this.f355625o;
                if (view4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authorLayout");
                    throw null;
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateAuthorInfo", "(Lcom/tencent/mm/protocal/protobuf/AuthorMemberInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateAuthorInfo", "(Lcom/tencent/mm/protocal/protobuf/AuthorMemberInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r45.tr0 tr0Var7 = (r45.tr0) this.f534252d;
                java.lang.String str2 = (tr0Var7 == null || (ccVar = tr0Var7.f468262m) == null) ? null : ccVar.f452975f;
                if (str2 == null || str2.length() == 0) {
                    android.widget.TextView textView6 = this.f355626p;
                    if (textView6 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberStatistic");
                        throw null;
                    }
                    android.content.res.Resources m158361x893a2f6f = m158361x893a2f6f();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = java.lang.Long.valueOf(ccVar2 != null ? ccVar2.f452973d : 0L);
                    textView6.setText(m158361x893a2f6f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.elj, objArr));
                    android.widget.TextView textView7 = this.f355626p;
                    if (textView7 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberStatistic");
                        throw null;
                    }
                    textView7.setOnClickListener(new go2.w(this));
                } else {
                    android.widget.TextView textView8 = this.f355626p;
                    if (textView8 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberStatistic");
                        throw null;
                    }
                    textView8.setText(m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573456lk1));
                    android.widget.TextView textView9 = this.f355626p;
                    if (textView9 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberStatistic");
                        throw null;
                    }
                    textView9.setOnClickListener(new go2.x(str2, this));
                }
                r45.tr0 tr0Var8 = (r45.tr0) this.f534252d;
                W6(tr0Var8 != null ? tr0Var8.f468272w : null);
                r45.cc ccVar3 = tr0Var6.f468262m;
                V6(ccVar3 != null ? ccVar3.f452974e : null, tr0Var6.f468259g == 2);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = tr0Var6.f468266q;
            int i18 = tr0Var6.f468263n;
            int i19 = tr0Var6.f468269t;
            if (c19792x256d2725 == null) {
                return;
            }
            android.view.View view5 = this.f355632v;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveLayout");
                throw null;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateCurLive", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateCurLive", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 1);
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d a18 = g1Var.a();
            mn2.n nVar = new mn2.n(a17.m59210xe5e0d2a0(), null, 2, null);
            android.widget.ImageView imageView = this.f355633w;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveAvatar");
                throw null;
            }
            a18.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
            android.view.View view6 = this.f355632v;
            if (view6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveLayout");
                throw null;
            }
            view6.setOnClickListener(new go2.y(this, i19, i18, a17));
            android.text.SpannableString descriptionSpan = a17.getDescriptionSpan();
            if (descriptionSpan == null || descriptionSpan.length() == 0) {
                android.widget.TextView textView10 = this.f355634x;
                if (textView10 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveDesc");
                    throw null;
                }
                textView10.setVisibility(8);
                android.widget.TextView textView11 = this.f355635y;
                if (textView11 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveTime");
                    throw null;
                }
                com.p314xaae8f345.mm.ui.bk.s0(textView11.getPaint());
            } else {
                android.widget.TextView textView12 = this.f355634x;
                if (textView12 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveDesc");
                    throw null;
                }
                textView12.setText(a17.getDescriptionSpan());
                android.widget.TextView textView13 = this.f355634x;
                if (textView13 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveDesc");
                    throw null;
                }
                com.p314xaae8f345.mm.ui.bk.s0(textView13.getPaint());
                android.widget.TextView textView14 = this.f355635y;
                if (textView14 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveTime");
                    throw null;
                }
                com.p314xaae8f345.mm.ui.bk.t0(textView14.getPaint());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) this.H.get(this.D);
            java.util.LinkedList m75941xfb821914 = (l2Var == null || (j32Var = l2Var.f205456l) == null) ? null : j32Var.m75941xfb821914(0);
            android.view.View view7 = this.f355632v;
            if (view7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveLayout");
                throw null;
            }
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view7.getLayoutParams();
            if (m75941xfb821914 != null && !m75941xfb821914.isEmpty()) {
                z17 = false;
            }
            if (z17) {
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = m158354x19263085().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
                }
            } else if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = 0;
            }
            android.view.View view8 = this.f355632v;
            if (view8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveLayout");
                throw null;
            }
            view8.setLayoutParams(marginLayoutParams);
            android.widget.TextView textView15 = this.f355634x;
            if (textView15 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveDesc");
                throw null;
            }
            com.p314xaae8f345.mm.ui.fk.a(textView15);
            android.widget.TextView textView16 = this.f355635y;
            if (textView16 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveTime");
                throw null;
            }
            textView16.setText(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.elx, zl2.q4.r(zl2.q4.f555466a, a17.m59220x3fdd41df() * 1000, java.lang.Boolean.FALSE, false, false, 12, null)));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = this.B;
            if (s1Var != null) {
                s1Var.j(this.D);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLiveWidget");
                throw null;
            }
        }
    }

    public final void V6(r45.j32 j32Var, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.util.LinkedList<r45.h32> m75941xfb8219143;
        int i17 = 0;
        java.util.LinkedList m75941xfb8219144 = j32Var != null ? j32Var.m75941xfb821914(0) : null;
        boolean z18 = m75941xfb8219144 == null || m75941xfb8219144.isEmpty();
        kk.l lVar = this.H;
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
            l2Var.f205456l = null;
            lVar.put(this.D, l2Var);
            android.view.View view = this.A;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveNoticeLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateLiveNotice", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeListInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberAreaHeaderUIC", "updateLiveNotice", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeListInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
            l2Var2.f205456l = j32Var;
            lVar.put(this.D, l2Var2);
            if (j32Var != null && (m75941xfb8219143 = j32Var.m75941xfb821914(0)) != null) {
                for (r45.h32 h32Var : m75941xfb8219143) {
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    java.lang.String str3 = this.D;
                    java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    if (((b92.d1) zbVar).bj(str3, m75945x2fec8307) == null) {
                        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
                        java.lang.String str4 = this.D;
                        java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(4);
                        ((b92.d1) zbVar2).Ai(str4, m75945x2fec83072 != null ? m75945x2fec83072 : "", h32Var);
                    } else {
                        c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
                        java.lang.String str5 = this.D;
                        java.lang.String m75945x2fec83073 = h32Var.m75945x2fec8307(4);
                        r45.h32 bj6 = ((b92.d1) zbVar3).bj(str5, m75945x2fec83073 != null ? m75945x2fec83073 : "");
                        if (bj6 != null) {
                            bj6.set(1, java.lang.Integer.valueOf(h32Var.m75939xb282bd08(1)));
                        }
                    }
                }
            }
            if ((j32Var == null || (m75941xfb8219142 = j32Var.m75941xfb821914(0)) == null || !(m75941xfb8219142.isEmpty() ^ true)) ? false : true) {
                android.widget.ImageView imageView = this.f355636z;
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("curLiveBottomLive");
                    throw null;
                }
                imageView.setVisibility(8);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar.get(this.D);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = this.B;
                if (s1Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLiveWidget");
                    throw null;
                }
                java.util.LinkedList m75941xfb8219145 = j32Var.m75941xfb821914(0);
                r45.h32 h32Var2 = m75941xfb8219145 != null ? (r45.h32) m75941xfb8219145.get(0) : null;
                s1Var.b(h32Var2);
                l2Var3.f205449e = h32Var2;
            }
        }
        this.I = m158359x1e885992().getBooleanExtra("KEY_FINDER_PROFILE_UI_AFTER_SHOW_NOTICE_LIST", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var2 = this.B;
        if (s1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLiveWidget");
            throw null;
        }
        java.lang.String str6 = this.D;
        ya2.b2 b17 = ya2.h.f542017a.b(str6);
        if (j32Var == null || (str = j32Var.m75945x2fec8307(5)) == null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            str = ((go2.c0) pf5.z.f435481a.a(activity).a(go2.c0.class)).f355492z;
        }
        java.lang.String str7 = str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str7);
        s1Var2.a("onSceneEnd:FinderFetchMemberShipDetailInfoCgi", str6, false, z17, z17, b17, str7);
        if (!this.I) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var3 = this.B;
            if (s1Var3 != null) {
                s1Var3.c();
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLiveWidget");
                throw null;
            }
        }
        this.I = false;
        if (j32Var != null && (m75941xfb821914 = j32Var.m75941xfb821914(0)) != null) {
            i17 = m75941xfb821914.size();
        }
        if (i17 <= 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var4 = this.B;
            if (s1Var4 != null) {
                s1Var4.c();
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLiveWidget");
                throw null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = this.C;
        if (s4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreLiveListWidget");
            throw null;
        }
        if (j32Var == null || (str2 = j32Var.m75945x2fec8307(5)) == null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            str2 = ((go2.c0) pf5.z.f435481a.a(activity2).a(go2.c0.class)).f355492z;
        }
        zy2.ic.a(s4Var, j32Var, str2, false, null, 0, 0, null, 124, null);
    }

    public final void W6(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209432qc).mo141623x754a37bb()).r()).intValue() == 1) {
            linkedList.clear();
            int random = (int) (10 * java.lang.Math.random());
            if (random >= 0) {
                int i17 = 0;
                while (true) {
                    r45.mk4 mk4Var = new r45.mk4();
                    mk4Var.f462136d = "测试标题" + i17;
                    mk4Var.f462137e = "内容" + i17;
                    linkedList.add(mk4Var);
                    if (i17 == random) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        java.util.ArrayList arrayList = this.f355631u;
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new jo2.f((r45.mk4) it.next()));
        }
        arrayList.addAll(arrayList2);
        if (linkedList.isEmpty()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f355622i;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberStatRecycleView");
                throw null;
            }
            c1163xf1deaba4.setVisibility(8);
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f355622i;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberStatRecycleView");
                throw null;
            }
            c1163xf1deaba42.setVisibility(0);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f355622i;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("memberStatRecycleView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba43.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        super.mo2273x9d4787cb(i17, i18, intent);
        if (intent == null) {
            return;
        }
        if (i17 != 100) {
            if (i17 == 10011 && i18 == 1000 && (stringExtra = intent.getStringExtra("ACTIVITY_RESULT_REMOVE_NOTICE_KEY")) != null) {
                if (!(stringExtra.length() > 0)) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s4 s4Var = this.C;
                    if (s4Var == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreLiveListWidget");
                        throw null;
                    }
                    s4Var.f(stringExtra);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    ((go2.c0) pf5.z.f435481a.a(activity).a(go2.c0.class)).G7();
                    return;
                }
                return;
            }
            return;
        }
        kk.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r;
        kk.l lVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar2.get(this.D);
        if (l2Var == null) {
            l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("KEY_FINDER_LIVE_NOTICE_INFO");
        if (byteArrayExtra != null) {
            r45.h32 h32Var = new r45.h32();
            h32Var.mo11468x92b714fd(byteArrayExtra);
            if (h32Var.m75939xb282bd08(14) == 1) {
                r45.h32 h32Var2 = l2Var.f205449e;
                if ((h32Var2 != null ? h32Var2.m75939xb282bd08(0) : Integer.MAX_VALUE) > h32Var.m75939xb282bd08(0)) {
                    l2Var.f205449e = h32Var;
                }
            }
        }
        lVar2.put(this.D, l2Var);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        ((go2.c0) pf5.z.f435481a.a(activity2).a(go2.c0.class)).G7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = this.B;
        if (s1Var != null) {
            gm0.j1.d().q(6276, s1Var.f206249J);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLiveWidget");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        java.lang.String str;
        r45.j32 j32Var;
        r45.j32 j32Var2;
        java.util.LinkedList<r45.h32> m75941xfb821914;
        r45.j32 j32Var3;
        java.util.LinkedList m75941xfb8219142;
        kk.l lVar = this.H;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar.get(this.D);
        if ((l2Var == null || (j32Var3 = l2Var.f205456l) == null || (m75941xfb8219142 = j32Var3.m75941xfb821914(0)) == null || !(m75941xfb8219142.isEmpty() ^ true)) ? false : true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar.get(this.D);
            if (l2Var2 != null && (j32Var2 = l2Var2.f205456l) != null && (m75941xfb821914 = j32Var2.m75941xfb821914(0)) != null) {
                for (r45.h32 h32Var : m75941xfb821914) {
                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                    java.lang.String str2 = this.D;
                    java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    r45.h32 bj6 = ((b92.d1) zbVar).bj(str2, m75945x2fec8307);
                    java.lang.Integer valueOf = bj6 != null ? java.lang.Integer.valueOf(bj6.m75939xb282bd08(1)) : null;
                    if (valueOf != null) {
                        h32Var.set(1, java.lang.Integer.valueOf(valueOf.intValue()));
                    }
                }
            }
            r45.tr0 tr0Var = (r45.tr0) this.f534252d;
            boolean z17 = tr0Var != null && tr0Var.f468259g == 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var = this.B;
            if (s1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLiveWidget");
                throw null;
            }
            java.lang.String str3 = this.D;
            ya2.b2 b17 = ya2.h.f542017a.b(str3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) lVar.get(this.D);
            if (l2Var3 == null || (j32Var = l2Var3.f205456l) == null || (str = j32Var.m75945x2fec8307(5)) == null) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                str = ((go2.c0) pf5.z.f435481a.a(activity).a(go2.c0.class)).f355492z;
            }
            java.lang.String str4 = str;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
            s1Var.a("onSceneEnd:MemberOnResume", str3, false, z17, z17, b17, str4);
        }
    }
}
