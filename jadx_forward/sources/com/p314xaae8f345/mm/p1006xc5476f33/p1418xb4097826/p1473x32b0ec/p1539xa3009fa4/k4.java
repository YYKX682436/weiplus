package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class k4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final r45.kv1 f198722h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f198723i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f198724m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f198725n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f198726o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f198727p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f198728q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f198729r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k4(android.content.Context r8, r45.kv1 r9, zl2.u4 r10, int r11, p3321xbce91901.jvm.p3324x21ffc6bd.i r12) {
        /*
            r7 = this;
            r11 = r11 & 4
            if (r11 == 0) goto L6
            zl2.u4 r10 = zl2.u4.f555521d
        L6:
            r3 = r10
            java.lang.String r10 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r10)
            java.lang.String r10 = "uiMode"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r10)
            r2 = 0
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f198722h = r9
            java.lang.String r8 = "FinderLiveGiftWallTopFirstDialog"
            r7.f198723i = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k4.<init>(android.content.Context, r45.kv1, zl2.u4, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ast;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f198724m = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.khs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f198725n = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566704gs3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f198726o = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.hlh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f198727p = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f198728q = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.p314xaae8f345.mm.R.id.obc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f198729r = (android.widget.TextView) findViewById6;
        android.view.View view = this.f198724m;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
            throw null;
        }
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h4(this));
        android.view.View view2 = this.f198725n;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmBtn");
            throw null;
        }
        view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.i4(this));
        android.widget.TextView textView = this.f198729r;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleView");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) rootView.findViewById(com.p314xaae8f345.mm.R.id.b0m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        y(viewGroup, (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz));
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) rootView.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup2);
        y(viewGroup2, (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public boolean r() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        jz5.f0 f0Var;
        java.lang.String m75945x2fec8307;
        android.widget.ImageView imageView = this.f198727p;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarImgView");
            throw null;
        }
        ng5.a.a(imageView, c01.z1.r());
        android.content.Context context = this.f199914d;
        r45.kv1 kv1Var = this.f198722h;
        java.lang.String str = "";
        if (kv1Var != null) {
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
            java.lang.String m75945x2fec83072 = kv1Var.m75945x2fec8307(2);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            wo0.c a17 = d1Var.a(new mn2.q3(m75945x2fec83072, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
            android.widget.ImageView imageView2 = this.f198726o;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftImgView");
                throw null;
            }
            ((wo0.b) a17).c(imageView2);
            android.widget.TextView textView = this.f198728q;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descView");
                throw null;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.lang.String m75945x2fec83073 = kv1Var.m75945x2fec8307(8);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            objArr[0] = m75945x2fec83073;
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.djx, objArr));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.widget.ImageView imageView3 = this.f198726o;
            if (imageView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftImgView");
                throw null;
            }
            imageView3.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c4i);
            android.widget.TextView textView2 = this.f198728q;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descView");
                throw null;
            }
            textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.djx, ""));
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.Z1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 6);
        if (kv1Var != null && (m75945x2fec8307 = kv1Var.m75945x2fec8307(0)) != null) {
            str = m75945x2fec8307;
        }
        jSONObject.put("gift_id", str);
        ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        super.w();
    }

    public final void y(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i17 + (k0Var != null ? k0Var.m46546x9b8334b1() : false ? 0 : com.p314xaae8f345.mm.ui.bl.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
    }
}
