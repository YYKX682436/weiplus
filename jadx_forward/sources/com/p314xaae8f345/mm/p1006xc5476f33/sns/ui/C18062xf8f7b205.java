package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsHeader */
/* loaded from: classes4.dex */
public class C18062xf8f7b205 extends android.widget.LinearLayout {
    public int A;
    public final android.view.View.OnClickListener B;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj f248698d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bj f248699e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f248700f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 f248701g;

    /* renamed from: h, reason: collision with root package name */
    public long f248702h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.Context f248703i;

    /* renamed from: m, reason: collision with root package name */
    public int f248704m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f248705n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f248706o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f248707p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f248708q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f248709r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f248710s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.animation.Animation f248711t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f248712u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c3 f248713v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ListView f248714w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f248715x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Boolean f248716y;

    /* renamed from: z, reason: collision with root package name */
    public int f248717z;

    public C18062xf8f7b205(android.content.Context context) {
        super(context);
        this.f248702h = 0L;
        this.f248705n = false;
        this.f248706o = false;
        this.f248707p = false;
        this.f248708q = true;
        new java.util.HashMap();
        this.f248711t = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f248712u = false;
        this.f248716y = java.lang.Boolean.FALSE;
        this.B = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ti(this);
        g(context);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 c18062xf8f7b205, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        c18062xf8f7b205.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCoverOpening", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        c18062xf8f7b205.f248698d.f249719c.setVisibility(0);
        c18062xf8f7b205.f248698d.f249717a.setVisibility(0);
        android.view.View view = c18062xf8f7b205.f248698d.f249729m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsHeader", "onCoverOpening", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsHeader", "onCoverOpening", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (c18062xf8f7b205.f248704m == 1) {
            c18062xf8f7b205.f248698d.f249718b.setVisibility(8);
        } else {
            c18062xf8f7b205.f248698d.f249718b.setVisibility(0);
        }
        if (c18062xf8f7b205.f248707p) {
            c18062xf8f7b205.f248698d.f249720d.setVisibility(0);
        }
        if (c18062xf8f7b205.f248705n) {
            c18062xf8f7b205.f248698d.f249726j.setVisibility(0);
        } else if (c18062xf8f7b205.h()) {
            c18062xf8f7b205.f248698d.f249727k.setVisibility(0);
        } else {
            c18062xf8f7b205.f248698d.f249727k.setVisibility(8);
        }
        double d17 = f17;
        if (d17 <= 0.01d) {
            if (c18062xf8f7b205.f248705n) {
                c18062xf8f7b205.f248698d.f249726j.setVisibility(4);
            } else if (c18062xf8f7b205.h()) {
                c18062xf8f7b205.f248698d.f249727k.setVisibility(4);
            } else {
                c18062xf8f7b205.f248698d.f249727k.setVisibility(8);
            }
        } else if (d17 >= 0.99d) {
            c18062xf8f7b205.f248698d.f249719c.setVisibility(4);
            c18062xf8f7b205.f248698d.f249717a.setVisibility(4);
            android.view.View view2 = c18062xf8f7b205.f248698d.f249729m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsHeader", "onCoverOpening", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsHeader", "onCoverOpening", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (c18062xf8f7b205.f248704m == 1) {
                c18062xf8f7b205.f248698d.f249718b.setVisibility(8);
            } else {
                c18062xf8f7b205.f248698d.f249718b.setVisibility(4);
            }
            if (c18062xf8f7b205.f248707p) {
                c18062xf8f7b205.f248698d.f249720d.setVisibility(4);
            }
        }
        float f18 = 1.0f - f17;
        c18062xf8f7b205.f248698d.f249719c.setAlpha(f18);
        c18062xf8f7b205.f248698d.f249717a.setAlpha(f18);
        c18062xf8f7b205.f248698d.f249718b.setAlpha(f18);
        c18062xf8f7b205.f248698d.f249720d.setAlpha(f18);
        if (c18062xf8f7b205.f248705n) {
            c18062xf8f7b205.f248698d.f249726j.setAlpha(f17);
        } else {
            c18062xf8f7b205.f248698d.f249727k.setAlpha(f17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCoverOpening", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c3 b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 c18062xf8f7b205) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c3 c3Var = c18062xf8f7b205.f248713v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return c3Var;
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 c18062xf8f7b205) {
        android.content.Context context;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        c18062xf8f7b205.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCoverClick", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        int m69714x8ce009ec = c18062xf8f7b205.f248698d.f249725i.m69714x8ce009ec();
        if (!w94.a.f525608a.b()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("legacyClick", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            java.lang.String[] strArr = c18062xf8f7b205.f248705n ? new java.lang.String[]{c18062xf8f7b205.f248703i.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jgq)} : c18062xf8f7b205.f248701g.f67721xff78bac6 ? new java.lang.String[0] : new java.lang.String[]{c18062xf8f7b205.f248703i.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jch)};
            java.lang.String string = (c18062xf8f7b205.f248705n || !c18062xf8f7b205.f248701g.f67721xff78bac6) ? "" : c18062xf8f7b205.f248703i.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jed);
            if (c18062xf8f7b205.f248705n || !c18062xf8f7b205.f248701g.f67721xff78bac6) {
                context = c18062xf8f7b205.f248703i;
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg;
            } else {
                context = c18062xf8f7b205.f248703i;
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1;
            }
            db5.e1.f(c18062xf8f7b205.getContext(), string, strArr, null, context.getString(i17), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.si(c18062xf8f7b205));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("legacyClick", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        } else if (c18062xf8f7b205.f248708q || m69714x8ce009ec == 0) {
            c18062xf8f7b205.f();
        } else {
            android.widget.ListView listView = c18062xf8f7b205.f248714w;
            if (listView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(listView, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsHeader", "onCoverClick", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                listView.smoothScrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(listView, "com/tencent/mm/plugin/sns/ui/SnsHeader", "onCoverClick", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
            if (c18062xf8f7b205.f248713v.k()) {
                c18062xf8f7b205.f248713v.h();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c3 c3Var = c18062xf8f7b205.f248713v;
                c3Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("open", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                c3Var.f252636g = false;
                db5.y4.b(c3Var.f252630a, -c3Var.f252632c, 0, 2, null);
                c3Var.g(false);
                c3Var.f252637h = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("open", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.f(2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCoverClick", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 d(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 c18062xf8f7b205) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 x1Var = c18062xf8f7b205.f248701g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return x1Var;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bj e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 c18062xf8f7b205) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bj bjVar = c18062xf8f7b205.f248699e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return bjVar;
    }

    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeCover", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        if (!this.f248705n) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeCover", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bj bjVar = this.f248699e;
        if (bjVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onChangeCover", "com.tencent.mm.plugin.sns.ui.SnsUIAction$2");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342 c18127xe071a342 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lt) bjVar).f251409a;
            boolean z17 = c18127xe071a342.P;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            if (z17) {
                c18127xe071a342.o(2, 4);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.iv) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342.c(c18127xe071a342)).a();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onChangeCover", "com.tencent.mm.plugin.sns.ui.SnsUIAction$2");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeCover", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public final void g(android.content.Context context) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f248703i = context;
        this.f248717z = ca4.z0.l0(context) ? 1 : 2;
        this.A = com.p314xaae8f345.mm.ui.bh.a(context).f278668a;
        ((ze4.f) i95.n0.c(ze4.f.class)).getClass();
        this.f248712u = bf4.f.f101248b.f();
        android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHeaderLayoutRes", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        pc4.d dVar = pc4.d.f434943a;
        if (dVar.y()) {
            i17 = ca4.z0.l0(context) ? com.p314xaae8f345.mm.R.C30864xbddafb2a.f571042ep2 : com.p314xaae8f345.mm.R.C30864xbddafb2a.f571041ep1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeaderLayoutRes", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeaderLayoutRes", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            i17 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f571040cs4;
        }
        android.view.View inflate = b17.inflate(i17, (android.view.ViewGroup) this, true);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.nb7);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj djVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj(this);
        this.f248698d = djVar;
        djVar.f249719c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        this.f248698d.f249717a = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        this.f248698d.f249720d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kjp);
        this.f248698d.f249718b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.mwr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj djVar2 = this.f248698d;
        djVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj djVar3 = this.f248698d;
        djVar3.getClass();
        this.f248698d.f249722f = (android.widget.RelativeLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.n8w);
        this.f248698d.f249723g = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.n8x);
        this.f248698d.f249724h = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n8y);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj djVar4 = this.f248698d;
        djVar4.getClass();
        this.f248698d.f249725i = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17856x1e30bcc) inflate.findViewById(com.p314xaae8f345.mm.R.id.n6n);
        if (dVar.y()) {
            this.f248698d.f249725i.m69722x764d6925(this.f248717z);
            this.f248698d.f249725i.m69720xb8dfca8a((int) (this.A * (this.f248717z == 1 ? 0.9f : 0.45f)));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17856x1e30bcc c17856x1e30bcc = this.f248698d.f249725i;
            c17856x1e30bcc.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverContainerLayout", "reset: ");
            c17856x1e30bcc.m69721xf84e829(c17856x1e30bcc.f245542r);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        }
        this.f248698d.f249726j = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.n6v);
        this.f248698d.f249729m = inflate.findViewById(com.p314xaae8f345.mm.R.id.qko);
        inflate.findViewById(com.p314xaae8f345.mm.R.id.n6v).setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j9i));
        inflate.findViewById(com.p314xaae8f345.mm.R.id.n6v).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vi(this));
        this.f248698d.f249725i.m69718x2c4ca7e7(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wi(this));
        this.f248698d.f249725i.m69723x420eef6d(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xi(this));
        this.f248698d.f249727k = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.n7o);
        this.f248698d.f249728l = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.n7n);
        this.f248698d.f249727k.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yi(this));
        android.view.animation.Animation animation = this.f248711t;
        animation.setDuration(1000L);
        animation.setRepeatCount(-1);
        animation.setInterpolator(new android.view.animation.LinearInterpolator());
        if (!bi4.v1.g()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj djVar5 = this.f248698d;
            ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
            e51.f fVar = ef4.j0.f333985a;
            djVar5.getClass();
            this.f248698d.f249721e = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18395x5828812f(context, null);
            if (this.f248712u) {
                this.f248698d.getClass();
            } else {
                frameLayout.addView(this.f248698d.f249721e);
                this.f248698d.f249721e.m71203x7ffb700f(this.f248709r);
                this.f248698d.f249721e.m71202xa0900e70(this.f248710s);
            }
        }
        android.widget.TextView textView = this.f248698d.f249719c;
        android.view.View.OnClickListener onClickListener = this.B;
        textView.setOnClickListener(onClickListener);
        this.f248698d.f249717a.setOnClickListener(onClickListener);
        if (((android.app.Activity) context).getIntent().getBooleanExtra("sns_timeline_NeedShowChangeAlbumDialog", false)) {
            postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zi(this), 150L);
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.aj(this));
        getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qi(this, context));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    /* renamed from: getFinderSnsRecyclerView */
    public android.view.View m70740xc654f660() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderSnsRecyclerView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj djVar = this.f248698d;
        if (djVar != null) {
            djVar.getClass();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderSnsRecyclerView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return null;
    }

    /* renamed from: getLoadingGroupHeight */
    public int m70741x4256a3a0() {
        android.widget.LinearLayout linearLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLoadingGroupHeight", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj djVar = this.f248698d;
        int height = (djVar == null || (linearLayout = djVar.f249723g) == null) ? 0 : linearLayout.getHeight() + com.p314xaae8f345.mm.ui.zk.a(getContext(), 32);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLoadingGroupHeight", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return height;
    }

    /* renamed from: getViewHeader */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj m70742x6ba27188() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewHeader", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj djVar = this.f248698d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewHeader", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return djVar;
    }

    public final boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCoverShowLike", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        boolean z17 = (this.f248706o || this.f248708q || this.f248701g.m70535xfb85f7b0() == 5 || !c01.e2.J(this.f248700f)) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCoverShowLike", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return z17;
    }

    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshAvatar", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj djVar = this.f248698d;
        if (djVar == null || djVar.f249717a == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshAvatar", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(this.f248698d.f249717a, this.f248700f, pc4.d.f434943a.l());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshAvatar", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void j(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        if (str == null || str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsHeader", "userName or selfName is null ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            return;
        }
        this.f248700f = str.trim();
        this.f248705n = str2.equals(str);
        this.f248698d.f249725i.m69724x9e476d06(this.f248716y.booleanValue());
        this.f248698d.f249725i.c(this.f248705n, str);
        i();
        if (str.length() > 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            java.lang.String v07 = (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.g2())) ? ca4.z0.v0(str3) : n17.g2();
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = this.f248703i;
            ((ke0.e) xVar).getClass();
            android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, v07);
            xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
            this.f248698d.f249719c.setText(((we0.j1) l0Var).Ai(this.f248698d.f249719c, str, i17, bi4.c.SNS_TIMELINE_NICK, (int) (r2.getTextSize() * 1.15d)));
            android.widget.TextView textView = this.f248698d.f249718b;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = this.f248703i;
            float textSize = this.f248698d.f249718b.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str4, textSize));
            boolean m47 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str);
            this.f248707p = m47;
            if (m47) {
                this.f248698d.f249720d.setVisibility(0);
                this.f248698d.f249720d.setText(t41.g.a(n17));
            } else {
                this.f248698d.f249720d.setVisibility(8);
            }
            this.f248706o = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().J0(str);
            if (this.f248707p && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J0.f67939x28ddff65) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J0.f67946x3fed1e1b) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J0.f67945x345a71a5))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsHeader", "openim bg error, do not show like btn");
                this.f248706o = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj djVar = this.f248698d;
        djVar.f249717a.setContentDescription(this.f248703i.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j9d, djVar.f249719c.getText()));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public final void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLikeInfo", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsHeader", "updateLikeInfo: ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 x1Var = this.f248701g;
        if (x1Var == null || !x1Var.f67721xff78bac6) {
            this.f248698d.f249728l.setImageResource(com.p314xaae8f345.mm.R.raw.f80143xebd704ef);
            this.f248698d.f249728l.m82040x7541828(this.f248703i.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        } else {
            this.f248698d.f249728l.setImageResource(com.p314xaae8f345.mm.R.raw.f79774xc850a2af);
            this.f248698d.f249728l.m82040x7541828(this.f248703i.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLikeInfo", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        if (!this.f248698d.f249725i.mo69717x2fe4f2e8().f515700a) {
            this.f248698d.f249725i.b();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCoverPreClose", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            android.view.View view = this.f248715x;
            if (view != null) {
                view.animate().translationY(0.0f).start();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCoverPreClose", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            this.f248698d.f249725i.a();
        }
        boolean onKeyDown = super.onKeyDown(i17, keyEvent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return onKeyDown;
    }

    /* renamed from: setActionBarView */
    public void m70743x8f0cdd00(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActionBarView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f248715x = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActionBarView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    /* renamed from: setAvatarOnClickListener */
    public void m70744xb36c48e2(android.view.View.OnClickListener onClickListener) {
        android.widget.ImageView imageView;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAvatarOnClickListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj djVar = this.f248698d;
        if (djVar != null && (imageView = djVar.f249717a) != null) {
            imageView.setOnClickListener(onClickListener);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAvatarOnClickListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    /* renamed from: setBackClickListener */
    public void m70745x31c61473(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bj bjVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBackClickListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f248699e = bjVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBackClickListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    /* renamed from: setEnterObjectId */
    public void m70746xa0900e70(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18395x5828812f c18395x5828812f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEnterObjectId", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f248710s = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj djVar = this.f248698d;
        if (djVar != null && (c18395x5828812f = djVar.f249721e) != null && !this.f248712u) {
            c18395x5828812f.m71202xa0900e70(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEnterObjectId", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    /* renamed from: setHeadBgListener */
    public void m70747x9c8e271b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.cj cjVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHeadBgListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHeadBgListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    /* renamed from: setIsCoverPreview */
    public void m70748xbd6b035d(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsCoverPreview", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f248716y = java.lang.Boolean.valueOf(z17);
        this.f248698d.f249725i.m69724x9e476d06(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsCoverPreview", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    /* renamed from: setSessionId */
    public void m70749x7ffb700f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18395x5828812f c18395x5828812f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSessionId", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f248709r = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj djVar = this.f248698d;
        if (djVar != null && (c18395x5828812f = djVar.f249721e) != null && !this.f248712u) {
            c18395x5828812f.m71203x7ffb700f(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSessionId", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    /* renamed from: setStoryAction */
    public void m70750x597d1c9(yd4.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18395x5828812f c18395x5828812f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStoryAction", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dj djVar = this.f248698d;
        if (djVar != null && (c18395x5828812f = djVar.f249721e) != null && !this.f248712u) {
            c18395x5828812f.m71205x597d1c9(cVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStoryAction", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public C18062xf8f7b205(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f248702h = 0L;
        this.f248705n = false;
        this.f248706o = false;
        this.f248707p = false;
        this.f248708q = true;
        new java.util.HashMap();
        this.f248711t = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f248712u = false;
        this.f248716y = java.lang.Boolean.FALSE;
        this.B = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ti(this);
        g(context);
    }
}
