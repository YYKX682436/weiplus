package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class zd0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 f196861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.t12 f196862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f196863f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f196864g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f196865h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f196866i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 de0Var, r45.t12 t12Var, boolean z17, boolean z18, boolean z19, boolean z27) {
        super(0);
        this.f196861d = de0Var;
        this.f196862e = t12Var;
        this.f196863f = z17;
        this.f196864g = z18;
        this.f196865h = z19;
        this.f196866i = z27;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.text.style.ImageSpan imageSpan;
        android.text.SpannableString i17;
        int i18;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.lang.String m76184x8010e5e4;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        java.lang.String m76197x6c03c64c;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0 de0Var = this.f196861d;
        android.view.View view = de0Var.f193816x;
        if (view != null) {
            de0Var.x1(view);
        }
        de0Var.K0(0);
        android.view.ViewGroup viewGroup = de0Var.f446856d;
        viewGroup.setAlpha(0.01f);
        com.p314xaae8f345.mm.ui.bk.r0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0.t1(de0Var).getPaint(), 0.8f);
        java.lang.String str = ((mm2.c1) de0Var.S0().a(mm2.c1.class)).f410385o;
        r45.t12 t12Var = this.f196862e;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, t12Var.m75945x2fec8307(4));
        boolean z17 = this.f196865h;
        boolean z18 = this.f196864g;
        boolean z19 = this.f196863f;
        boolean z27 = this.f196866i;
        java.lang.String y17 = (b17 || z19 || z18 || z17 || z27) ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0.y1(z19, z18, z17, z27) : "";
        java.lang.String str2 = null;
        if (y17.length() == 0) {
            gm2.c1 c1Var = gm2.c1.f354853a;
            r45.xn1 xn1Var = (r45.xn1) t12Var.m75936x14adae67(8);
            java.util.LinkedList m75941xfb821914 = xn1Var != null ? xn1Var.m75941xfb821914(11) : null;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put(9, gm2.c2.f354882h);
            imageSpan = (android.text.style.ImageSpan) kz5.n0.Z(gm2.c1.r(c1Var, m75941xfb821914, new int[]{9}, null, null, 0, null, null, 0, 0, null, linkedHashMap, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s6.f34739x366c91de, null));
        } else {
            imageSpan = null;
        }
        r45.xn1 xn1Var2 = (r45.xn1) t12Var.m75936x14adae67(11);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4 = xn1Var2 != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0) : null;
        java.lang.String str3 = de0Var.f193808p;
        if (c19782x23db1cfa4 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#initTopComment reply text span. reply to ");
            r45.xn1 xn1Var3 = (r45.xn1) t12Var.m75936x14adae67(11);
            if (xn1Var3 != null && (c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var3.m75936x14adae67(0)) != null) {
                str2 = c19782x23db1cfa3.m76197x6c03c64c();
            }
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb6.toString());
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.text.TextPaint paint = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0.t1(de0Var).getPaint();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
            zl2.r4 r4Var = zl2.r4.f555483a;
            java.lang.CharSequence nf6 = c61.yb.nf(ybVar, context, paint, zl2.r4.D0(r4Var, t12Var.m75945x2fec8307(4), t12Var.m75945x2fec8307(0), false, 4, null), 0, 8, null);
            i95.m c18 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            c61.yb ybVar2 = (c61.yb) c18;
            android.content.Context context2 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            android.text.TextPaint paint2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0.t1(de0Var).getPaint();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint2, "getPaint(...)");
            r45.xn1 xn1Var4 = (r45.xn1) t12Var.m75936x14adae67(11);
            java.lang.String str4 = (xn1Var4 == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var4.m75936x14adae67(0)) == null || (m76197x6c03c64c = c19782x23db1cfa2.m76197x6c03c64c()) == null) ? "" : m76197x6c03c64c;
            r45.xn1 xn1Var5 = (r45.xn1) t12Var.m75936x14adae67(11);
            java.lang.CharSequence nf7 = c61.yb.nf(ybVar2, context2, paint2, zl2.r4.D0(r4Var, str4, (xn1Var5 == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var5.m75936x14adae67(0)) == null || (m76184x8010e5e4 = c19782x23db1cfa.m76184x8010e5e4()) == null) ? "" : m76184x8010e5e4, false, 4, null), 0, 8, null);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context3 = viewGroup.getContext();
            java.lang.String u17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0.u1(de0Var, y17, imageSpan, viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.efk, nf6, nf7));
            ((ke0.e) xVar).getClass();
            i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context3, u17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "#initTopComment normal span.");
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context4 = viewGroup.getContext();
            java.lang.String concat = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0.u1(de0Var, y17, imageSpan, zl2.r4.D0(zl2.r4.f555483a, t12Var.m75945x2fec8307(4), t12Var.m75945x2fec8307(0), false, 4, null)).concat(" ");
            ((ke0.e) xVar2).getClass();
            i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context4, concat);
        }
        if (y17.length() > 0) {
            android.graphics.drawable.Drawable a17 = gm2.u.a(gm2.v.f355031f, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0.y1(z19, z18, z17, z27), 0.0f, 0.0f, 6, null);
            java.lang.String y18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0.y1(z19, z18, z17, z27);
            float f17 = gm2.w.f355044k;
            i17.setSpan(new gm2.v(a17, new gm2.w(y18, f17, f17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77906xd1a78a03), gm2.w.f355042i, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92), gm2.w.f355043j, 0.0f, 128, null)), 0, y17.length() + 0, 33);
            i18 = y17.length() + 0;
        } else {
            i18 = 0;
        }
        if (imageSpan != null) {
            i17.setSpan(imageSpan, i18, i18 + 1, 33);
        }
        android.widget.TextView t17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0.t1(de0Var);
        android.content.Context context5 = viewGroup.getContext();
        int i19 = com.p314xaae8f345.mm.R.C30860x5b28f31.f561222co;
        t17.setTextSize(0, i65.a.h(context5, z27 ? com.p314xaae8f345.mm.R.C30860x5b28f31.f561222co : com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0.t1(de0Var).setText(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.de0.t1(de0Var).setSingleLine(!z27);
        android.widget.TextView v17 = de0Var.v1();
        android.content.Context context6 = viewGroup.getContext();
        if (z27) {
            i19 = com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb;
        }
        v17.setTextSize(0, i65.a.h(context6, i19));
        if (z27) {
            de0Var.v1().setAlpha(0.55f);
        } else {
            de0Var.v1().setAlpha(1.0f);
        }
        android.widget.TextView v18 = de0Var.v1();
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context7 = viewGroup.getContext();
        java.lang.String m75945x2fec8307 = t12Var.m75945x2fec8307(2);
        ((ke0.e) xVar3).getClass();
        v18.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context7, m75945x2fec8307));
        android.widget.ScrollView scrollView = (android.widget.ScrollView) ((jz5.n) de0Var.f193811s).mo141623x754a37bb();
        java.lang.CharSequence text = de0Var.v1().getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
        scrollView.setVisibility(text.length() > 0 ? 0 : 8);
        de0Var.v1().setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
        de0Var.v1().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yd0(de0Var, t12Var));
        return jz5.f0.f384359a;
    }
}
