package xt2;

/* loaded from: classes3.dex */
public final class r5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f538525h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f538526i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f538527m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f538528n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f538529o;

    /* renamed from: p, reason: collision with root package name */
    public cm2.m0 f538530p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f538531q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f538532r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f538533s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(android.content.Context context, gk2.e buContext, int i17) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f538525h = buContext;
        this.f538529o = new java.util.ArrayList();
    }

    public static final java.lang.Object y(xt2.r5 r5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.content.Context context = r5Var.f199914d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            dk2.q4 q4Var = dk2.q4.f315471a;
            gk2.e eVar = r5Var.f538525h;
            java.lang.Object g17 = q4Var.g(abstractActivityC21394xb3d2c0cf, eVar, false, ((mm2.f6) eVar.a(mm2.f6.class)).f410566g, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.e1) eVar.a(mm2.e1.class)).f410517n, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o, ((mm2.e1) eVar.a(mm2.e1.class)).f410518o, ((mm2.c1) eVar.a(mm2.c1.class)).P3, null, 3, ((mm2.c1) eVar.a(mm2.c1.class)).f410377m5, java.lang.Boolean.FALSE, interfaceC29045xdcb5ca57);
            if (g17 == pz5.a.f440719d) {
                return g17;
            }
        }
        return jz5.f0.f384359a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570518dt2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.aa8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f538526i = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rcc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f538527m = findViewById2;
        android.view.View view = this.f538526i;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backBtn");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.f6b);
        android.content.Context context = this.f199914d;
        c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560249f7));
        android.view.View view2 = this.f538526i;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backBtn");
            throw null;
        }
        android.graphics.drawable.Drawable background = view2.getBackground();
        android.graphics.drawable.GradientDrawable gradientDrawable = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77906xd1a78a03));
        }
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.ilp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f538533s = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.s1_);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById4;
        c1163xf1deaba4.mo7960x6cab2c8d(new xt2.l5(this));
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "also(...)");
        this.f538528n = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById4;
        android.view.View view3 = this.f538526i;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("backBtn");
            throw null;
        }
        view3.setOnClickListener(new xt2.n5(this));
        android.view.View view4 = this.f538527m;
        if (view4 != null) {
            view4.setOnClickListener(new xt2.o5(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noProductBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        yz5.a aVar = this.f538532r;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    public final void z() {
        java.util.List list = this.f538529o;
        ((java.util.ArrayList) list).clear();
        java.util.List b17 = ((mm2.f6) this.f538525h.a(mm2.f6.class)).f410572o.b(xt2.m5.f538426d);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem");
            arrayList.add((cm2.m0) j5Var);
        }
        ((java.util.ArrayList) list).addAll(arrayList);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f538528n;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("productList");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
    }
}
