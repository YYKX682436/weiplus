package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v3/VipCardListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "com/tencent/mm/plugin/card/ui/v3/t0", "com/tencent/mm/plugin/card/ui/v3/c1", "com/tencent/mm/plugin/card/ui/v3/f1", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.card.ui.v3.VipCardListUI */
/* loaded from: classes9.dex */
public final class ActivityC13074xfcf8fabf extends com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595 {
    public static final /* synthetic */ int S = 0;
    public boolean A;
    public r45.iu C;
    public java.lang.String D;
    public r45.ru E;
    public r45.iu F;
    public java.lang.String G;
    public java.lang.String H;
    public java.util.List I;
    public int K;
    public int L;
    public boolean M;
    public int N;
    public int P;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 R;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f176803m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f176804n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f176805o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f176806p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f176807q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f176808r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f176809s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f176810t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f176811u;

    /* renamed from: w, reason: collision with root package name */
    public int f176813w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f176815y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f176816z;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f176802i = "MicroMsg.VipCardListUI";

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f176812v = new java.util.ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public int f176814x = 10;
    public int B = 1;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f176801J = "";
    public boolean Q = true;

    public static final void X6(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13074xfcf8fabf.f176802i, "go to card detail ui");
        android.content.Intent intent = new android.content.Intent(activityC13074xfcf8fabf.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.class);
        intent.putExtra("key_card_id", str);
        intent.addFlags(131072);
        intent.putExtra("key_from_scene", 3);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13074xfcf8fabf.mo55332x76847179();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v3/VipCardListUI", "gotoCardDetailUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI", "gotoCardDetailUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static final void Y6(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf, android.view.MenuItem menuItem) {
        activityC13074xfcf8fabf.L = activityC13074xfcf8fabf.K;
        activityC13074xfcf8fabf.K = 1;
        activityC13074xfcf8fabf.f176801J = java.lang.String.valueOf(menuItem.getTitle());
        activityC13074xfcf8fabf.c7();
        activityC13074xfcf8fabf.Z6(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19747, 1, 5);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595
    public void T6(int i17, boolean z17) {
        if (this.Q && this.K == 1) {
            Z6(true);
        } else {
            if (z17) {
                return;
            }
            W6();
        }
    }

    public final void Z6(boolean z17) {
        int i17;
        java.lang.String str = "do load vip card list: " + this.M + ", " + this.f176813w + ", " + this.K;
        java.lang.String str2 = this.f176802i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (this.f176815y && !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "already load complete");
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f176804n;
            if (c22801x87cbdc00 != null) {
                c22801x87cbdc00.N(0);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
                throw null;
            }
        }
        if (this.M) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "is loading");
            return;
        }
        this.M = true;
        int i18 = this.f176813w;
        if (z17) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f176804n;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
                throw null;
            }
            c22801x87cbdc002.m82693x1501d518(true);
            i17 = 0;
        } else {
            i17 = i18;
        }
        bu1.b bVar = new bu1.b(i17, this.f176814x, this.f176745d, this.f176746e, this.K);
        bVar.f152182i = true;
        pq5.g l17 = bVar.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        pm0.v.T(l17, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.h1(this, z17)).f(this);
    }

    public final void a7(java.lang.Boolean bool) {
        if (bool == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = null;
        if (bool.booleanValue()) {
            u3Var = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 3, null);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.R;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        this.R = u3Var;
    }

    public final void b7() {
        java.util.List list = this.I;
        if (!(list == null || list.isEmpty())) {
            java.util.List list2 = this.I;
            if (list2 != null) {
                m78548x39037dd1();
                m78478x84f07bce(0, 0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.u1(this, list2, list2));
                return;
            }
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        if (this.F != null) {
            java.lang.String str = this.H;
            if (!(str == null || str.length() == 0)) {
                c0Var.f391645d = true;
            }
        }
        if (this.C != null) {
            c0Var2.f391645d = true;
        }
        if (c0Var.f391645d || c0Var2.f391645d) {
            m78548x39037dd1();
            m78478x84f07bce(0, 0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.r1(this, c0Var, c0Var2));
        }
    }

    public final void c7() {
        boolean z17;
        boolean z18 = true;
        if (this.K <= 0 || !(!this.f176812v.isEmpty()) || this.E == null) {
            android.view.ViewGroup viewGroup = this.f176807q;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSortLayout");
                throw null;
            }
            viewGroup.setVisibility(8);
            z17 = false;
        } else {
            android.widget.TextView textView = this.f176808r;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSortTv");
                throw null;
            }
            textView.setText(this.f176801J);
            android.view.ViewGroup viewGroup2 = this.f176807q;
            if (viewGroup2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSortLayout");
                throw null;
            }
            viewGroup2.setVisibility(0);
            android.view.ViewGroup viewGroup3 = this.f176807q;
            if (viewGroup3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSortLayout");
                throw null;
            }
            viewGroup3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.v1(this));
            z17 = true;
        }
        java.lang.String str = this.G;
        if ((str == null || str.length() == 0) || this.F == null) {
            android.view.ViewGroup viewGroup4 = this.f176809s;
            if (viewGroup4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTopPhoneVipCardLayout");
                throw null;
            }
            viewGroup4.setVisibility(8);
            z18 = z17;
        } else {
            android.view.ViewGroup viewGroup5 = this.f176809s;
            if (viewGroup5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTopPhoneVipCardLayout");
                throw null;
            }
            viewGroup5.setVisibility(0);
            android.widget.TextView textView2 = this.f176810t;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTopPhoneVipCardTv");
                throw null;
            }
            textView2.setText(this.G);
            android.view.ViewGroup viewGroup6 = this.f176809s;
            if (viewGroup6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTopPhoneVipCardLayout");
                throw null;
            }
            viewGroup6.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w1(this));
        }
        if (z18) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f176811u;
            if (c22848x6ddd90cf == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVipCardListAdapter");
                throw null;
            }
            android.view.ViewGroup viewGroup7 = this.f176806p;
            if (viewGroup7 != null) {
                c22848x6ddd90cf.T(viewGroup7, 2, false);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderView");
                throw null;
            }
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f176811u;
        if (c22848x6ddd90cf2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVipCardListAdapter");
            throw null;
        }
        if (this.f176806p != null) {
            c22848x6ddd90cf2.i0(r1.hashCode(), false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderView");
            throw null;
        }
    }

    public final void d7(r45.ni3 ni3Var) {
        java.util.ArrayList arrayList;
        this.E = ni3Var.f462956i;
        java.util.Iterator it = ni3Var.f462955h.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.f176812v;
            if (!hasNext) {
                break;
            }
            r45.tt ttVar = (r45.tt) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ttVar);
            t0Var.f176909d = ttVar;
            arrayList.add(t0Var);
        }
        if (arrayList.isEmpty()) {
            android.view.ViewGroup viewGroup = this.f176805o;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mEmptyView");
                throw null;
            }
            viewGroup.setVisibility(0);
        } else {
            android.view.ViewGroup viewGroup2 = this.f176805o;
            if (viewGroup2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mEmptyView");
                throw null;
            }
            viewGroup2.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f176811u;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.m8146xced61ae5();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVipCardListAdapter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569860q9;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.bw_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f176803m = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.bw8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f176804n = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.bw6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f176805o = (android.view.ViewGroup) findViewById3;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f176803m;
        if (c22849x81a93d25 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVipCardListRv");
            throw null;
        }
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179(), 1, false));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.card.ui.v3.VipCardListUI$initView$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.c1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf.this);
            }
        }, this.f176812v, false);
        this.f176811u = c22848x6ddd90cf;
        c22848x6ddd90cf.mo8164xbbdced85(true);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f176803m;
        if (c22849x81a93d252 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVipCardListRv");
            throw null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f176811u;
        if (c22848x6ddd90cf2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVipCardListAdapter");
            throw null;
        }
        c22849x81a93d252.mo7960x6cab2c8d(c22848x6ddd90cf2);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.i0 i0Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.i0(mo55332x76847179(), 1);
        i0Var.d(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562649l6));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f176803m;
        if (c22849x81a93d253 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVipCardListRv");
            throw null;
        }
        c22849x81a93d253.N(i0Var);
        android.view.LayoutInflater layoutInflater = getLayoutInflater();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d254 = this.f176803m;
        if (c22849x81a93d254 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVipCardListRv");
            throw null;
        }
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569858q7, (android.view.ViewGroup) c22849x81a93d254, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f176806p = viewGroup;
        android.view.View findViewById4 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.bwb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f176808r = (android.widget.TextView) findViewById4;
        android.view.ViewGroup viewGroup2 = this.f176806p;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderView");
            throw null;
        }
        android.view.View findViewById5 = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.bwa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f176807q = (android.view.ViewGroup) findViewById5;
        android.view.ViewGroup viewGroup3 = this.f176806p;
        if (viewGroup3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderView");
            throw null;
        }
        android.view.View findViewById6 = viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.bwd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f176809s = (android.view.ViewGroup) findViewById6;
        android.view.ViewGroup viewGroup4 = this.f176806p;
        if (viewGroup4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderView");
            throw null;
        }
        android.view.View findViewById7 = viewGroup4.findViewById(com.p314xaae8f345.mm.R.id.bwe);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f176810t = (android.widget.TextView) findViewById7;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = this.f176811u;
        if (c22848x6ddd90cf3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVipCardListAdapter");
            throw null;
        }
        android.view.ViewGroup viewGroup5 = this.f176806p;
        if (viewGroup5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderView");
            throw null;
        }
        c22848x6ddd90cf3.T(viewGroup5, 2, false);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f176804n;
        if (c22801x87cbdc00 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
            throw null;
        }
        c22801x87cbdc00.m82690xd3a27e96(false);
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = this.f176804n;
        if (c22801x87cbdc002 != null) {
            c22801x87cbdc002.m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.j1(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.AbstractActivityC13067x4704c595, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.f176816z) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f176802i, "no data to save snapshot");
            return;
        }
        r45.ni3 ni3Var = new r45.ni3();
        r45.ie ieVar = new r45.ie();
        ni3Var.f76492x92037252 = ieVar;
        ieVar.f458493e = new r45.du5();
        java.util.Iterator it = this.f176812v.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0 t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0) it.next();
            t0Var.a();
            ni3Var.f462955h.add(t0Var.a());
        }
        ni3Var.f462956i = this.E;
        ni3Var.f462953f = this.f176813w;
        ni3Var.f462960p = this.D;
        ni3Var.f462959o = this.C;
        ni3Var.f462964t = (java.util.LinkedList) this.I;
        ni3Var.f462961q = this.F;
        ni3Var.f462962r = this.H;
        ni3Var.f462963s = this.G;
        pm0.v.K(null, new au1.g(ni3Var));
        r45.qu quVar = new r45.qu();
        quVar.f465792d = this.K;
        quVar.f465794f = this.f176801J;
        quVar.f465793e = this.f176814x;
        pm0.v.K(null, new au1.h(quVar));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        if (this.A) {
            Z6(true);
            this.A = false;
        }
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.f1.class);
    }
}
