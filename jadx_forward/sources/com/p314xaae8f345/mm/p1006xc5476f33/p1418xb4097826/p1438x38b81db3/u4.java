package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class u4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter f186203e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f186204f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f186205g;

    /* renamed from: h, reason: collision with root package name */
    public da2.g f186206h;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter presenter, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feedObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObj, "feedObj");
        this.f186203e = presenter;
        this.f186204f = z17;
        this.f186205g = feedObj;
        jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.r3.f185971d);
    }

    public static /* synthetic */ void K(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 u4Var, in5.s0 s0Var, r45.j60 j60Var, android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15289x510d6f67 c15289x510d6f67, long j17, so2.y0 y0Var, boolean z17, int i17, java.lang.Object obj) {
        u4Var.J(s0Var, j60Var, imageView, c15289x510d6f67, j17, y0Var, (i17 & 64) != 0 ? false : z17);
    }

    public static /* synthetic */ void M(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 u4Var, in5.s0 s0Var, r45.s60 s60Var, android.widget.ImageView imageView, android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15289x510d6f67 c15289x510d6f67, long j17, so2.y0 y0Var, boolean z17, int i17, java.lang.Object obj) {
        u4Var.L(s0Var, s60Var, imageView, viewGroup, c15289x510d6f67, j17, y0Var, (i17 & 128) != 0 ? false : z17);
    }

    public final void J(in5.s0 s0Var, r45.j60 j60Var, android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15289x510d6f67 c15289x510d6f67, long j17, so2.y0 y0Var, boolean z17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j60Var);
        float m75939xb282bd08 = j60Var.m75939xb282bd08(2) > 0 ? j60Var.m75939xb282bd08(2) : 16.0f;
        float m75939xb282bd082 = j60Var.m75939xb282bd08(3) > 0 ? j60Var.m75939xb282bd08(3) : 9.0f;
        if (z17) {
            jz5.l a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c3.f184549g.a(m75939xb282bd08, m75939xb282bd082);
            int dimensionPixelSize = s0Var.f374654e.getResources().getDimensionPixelSize(((java.lang.Number) a17.f384366d).intValue());
            int dimensionPixelSize2 = s0Var.f374654e.getResources().getDimensionPixelSize(((java.lang.Number) a17.f384367e).intValue());
            android.view.ViewGroup.LayoutParams layoutParams = c15289x510d6f67.getLayoutParams();
            layoutParams.height = dimensionPixelSize2;
            c15289x510d6f67.setLayoutParams(layoutParams);
            c15289x510d6f67.b(dimensionPixelSize, dimensionPixelSize2, false);
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            int m75939xb282bd083 = j60Var.m75939xb282bd08(4);
            if (m75939xb282bd08 > 0.0f && m75939xb282bd082 > 0.0f) {
                if (m75939xb282bd083 > 0) {
                    R(s0Var, c15289x510d6f67, m75939xb282bd083, m75939xb282bd08, m75939xb282bd082, j60Var.m75939xb282bd08(6));
                } else {
                    c15289x510d6f67.b(m75939xb282bd08, m75939xb282bd082, false);
                }
            }
        }
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dqg, (android.view.ViewGroup) null);
        c15289x510d6f67.removeView(inflate);
        r45.ky0 m76052x34c6289e = y0Var.f492236d.u0().m76052x34c6289e();
        if (m76052x34c6289e != null && (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) m76052x34c6289e.m75936x14adae67(0)) != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = c19786x6a1e2862.m76506x42318aa0();
            if (m76506x42318aa0 != null && m76506x42318aa0.m77224x4236b52c() == 14) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutParams2.leftMargin = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                layoutParams2.topMargin = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                c15289x510d6f67.addView(inflate, layoutParams2);
            }
        }
        if (imageView != null) {
            long c17 = c01.id.c();
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).I).mo141623x754a37bb());
            java.lang.String m75945x2fec8307 = j60Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            wo0.c a18 = d1Var.a(new mn2.j0(m75945x2fec8307));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d3 d3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d3(this, j17, c17);
            a18.getClass();
            a18.f529406d = d3Var;
            a18.c(imageView);
        }
        ym5.a1.i(c15289x510d6f67, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e3(this, j17));
    }

    public final void L(in5.s0 s0Var, r45.s60 s60Var, android.widget.ImageView imageView, android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15289x510d6f67 c15289x510d6f67, long j17, so2.y0 y0Var, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15267xd9054be4 v07 = this.f186203e.v0();
        java.lang.String str3 = "";
        if (s60Var == null || (str = s60Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        v07.m61771xc809512f().a(this.f186205g.mo2128x1ed62e84(), y0Var.f492236d.u0());
        v07.m61782xca02517a(j17);
        android.view.ViewParent parent = v07.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(v07);
        }
        if (viewGroup != null) {
            viewGroup.addView(v07);
        }
        viewGroup.setVisibility(0);
        imageView.setVisibility(8);
        boolean z18 = true;
        if (v07.m61780xfa6224fa() != 1 && v07.m61780xfa6224fa() != 0 && v07.m61780xfa6224fa() != 10) {
            java.lang.String str4 = v07.mediaId;
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            if (!(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes())))) {
                z18 = false;
            }
        }
        if (z18) {
            imageView.setVisibility(0);
            long c17 = c01.id.c();
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).I).mo141623x754a37bb());
            if (s60Var == null || (str2 = s60Var.m75945x2fec8307(2)) == null) {
                str2 = "";
            }
            wo0.c a17 = d1Var.a(new mn2.j0(str2));
            a17.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.f3(this, j17, c17);
            ((wo0.b) a17).c(imageView);
            if (s60Var != null && (m75945x2fec8307 = s60Var.m75945x2fec8307(0)) != null) {
                str3 = m75945x2fec8307;
            }
            v07.u(str3, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.j3(v07, imageView, s0Var, y0Var));
            v07.m66742xdce4ea8b().getClass();
            java.lang.String m66740xe56ce956 = v07.m66740xe56ce956();
            v07.m66742xdce4ea8b().getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m66740xe56ce956, "prepareToFirstFrameRender return for isViewFocused:true");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s60Var);
        float m75939xb282bd08 = s60Var.m75939xb282bd08(4) > 0 ? s60Var.m75939xb282bd08(4) : 16.0f;
        float m75939xb282bd082 = s60Var.m75939xb282bd08(5) > 0 ? s60Var.m75939xb282bd08(5) : 9.0f;
        if (z17) {
            jz5.l a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c3.f184549g.a(m75939xb282bd08, m75939xb282bd082);
            int dimensionPixelSize = s0Var.f374654e.getResources().getDimensionPixelSize(((java.lang.Number) a18.f384366d).intValue());
            int dimensionPixelSize2 = s0Var.f374654e.getResources().getDimensionPixelSize(((java.lang.Number) a18.f384367e).intValue());
            android.view.ViewGroup.LayoutParams layoutParams = c15289x510d6f67.getLayoutParams();
            layoutParams.height = dimensionPixelSize2;
            c15289x510d6f67.setLayoutParams(layoutParams);
            c15289x510d6f67.b(dimensionPixelSize, dimensionPixelSize2, false);
        } else {
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            int m75939xb282bd083 = s60Var.m75939xb282bd08(7);
            if (m75939xb282bd08 > 0.0f && m75939xb282bd082 > 0.0f) {
                if (m75939xb282bd083 > 0) {
                    R(s0Var, c15289x510d6f67, m75939xb282bd083, m75939xb282bd08, m75939xb282bd082, s60Var.m75939xb282bd08(9));
                } else {
                    c15289x510d6f67.b(m75939xb282bd08, m75939xb282bd082, false);
                }
            }
        }
        ym5.a1.i(c15289x510d6f67, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.k3(v07, j17, s0Var, y0Var));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 N() {
        return cu2.u.f303974a.p(this.f186203e.z0());
    }

    public final int O(java.lang.String str, java.lang.String str2) {
        int i17 = 0;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            try {
                boolean z17 = true;
                if (!jSONObject.has(str2)) {
                    z17 = false;
                }
                if (z17) {
                    i17 = jSONObject.getInt(str2);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetInt", "", e17);
            }
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderFeedCommentConvert", e18.getMessage());
        }
        return i17;
    }

    public final java.lang.String P(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String str3 = null;
            try {
                boolean z17 = true;
                if (!jSONObject.has(str2)) {
                    z17 = false;
                }
                if (z17) {
                    str3 = jSONObject.getString(str2);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", e17);
            }
            return str3 == null ? "" : str3;
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderFeedCommentConvert", e18.getMessage());
            return "";
        }
    }

    public final void R(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15289x510d6f67 c15289x510d6f67, int i17, float f17, float f18, int i18) {
        float f19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var;
        r45.ky0 m76052x34c6289e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var2;
        r45.ky0 m76052x34c6289e2;
        int dimensionPixelSize = s0Var.f374654e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        android.content.Context context = s0Var.f374654e;
        int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8.f183664a.c(null) - (dimensionPixelSize + context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561249d9));
        float b17 = r8.b(context) * kx2.a.f394811a.a(context);
        int i19 = (int) ((i17 * b17) / 100.0f);
        int i27 = (int) ((i19 * 9.0f) / 16);
        int i28 = i27 * i19;
        int b18 = i65.a.b(context, i18 > 0 ? i18 : 9216);
        int i29 = i28 < b18 ? b18 : i28;
        float sqrt = (float) java.lang.Math.sqrt((i29 / f17) / f18);
        int i37 = (((int) (sqrt * f18)) / 8) * 8;
        float f27 = (i37 / f18) * f17;
        java.lang.Object obj = s0Var.f374658i;
        so2.y0 y0Var = obj instanceof so2.y0 ? (so2.y0) obj : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleAdHeightPercentage: resultWidth=");
        sb6.append(f27);
        sb6.append(", resultHeight=");
        sb6.append(i37);
        sb6.append(", area=");
        sb6.append(i29);
        sb6.append(", calArea=");
        sb6.append(i28);
        sb6.append(", realMiniArea=");
        sb6.append(b18);
        sb6.append(", svrMiniArea=");
        sb6.append(i18);
        sb6.append("proportion=");
        sb6.append(sqrt);
        sb6.append(", commentAreaHeight=");
        sb6.append(b17);
        sb6.append(", heightPercentage=");
        sb6.append(i17);
        sb6.append(", refWidth=");
        sb6.append(i27);
        sb6.append(", refHeight=");
        sb6.append(i19);
        sb6.append(", maxWidth=");
        sb6.append(c17);
        sb6.append(", aid=");
        sb6.append((y0Var == null || (yj0Var2 = y0Var.f492236d) == null || (m76052x34c6289e2 = yj0Var2.u0().m76052x34c6289e()) == null) ? null : java.lang.Long.valueOf(m76052x34c6289e2.m75942xfb822ef2(1)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedCommentConvert", sb6.toString());
        float f28 = c17;
        if (f27 > f28) {
            f19 = f18;
            i37 = (int) ((f28 / f17) * f19);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleAdHeightPercentage: out of width limit, resultHeight=");
            sb7.append(i37);
            sb7.append(", maxWidth=");
            sb7.append(c17);
            sb7.append("aid=");
            sb7.append((y0Var == null || (yj0Var = y0Var.f492236d) == null || (m76052x34c6289e = yj0Var.u0().m76052x34c6289e()) == null) ? null : java.lang.Long.valueOf(m76052x34c6289e.m75942xfb822ef2(1)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedCommentConvert", sb7.toString());
        } else {
            f19 = f18;
        }
        android.view.ViewGroup.LayoutParams layoutParams = c15289x510d6f67.getLayoutParams();
        layoutParams.height = i37;
        c15289x510d6f67.setLayoutParams(layoutParams);
        c15289x510d6f67.b(f17, f19, false);
    }

    public final void S(in5.s0 s0Var, android.view.View view, android.view.View view2, so2.y0 y0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, java.lang.String str) {
        int i17;
        android.view.View view3;
        jz5.f0 f0Var;
        if (c19786x6a1e2862 != null) {
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert", "handleFollowPatBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert", "handleFollowPatBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (view != null) {
                view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.l3(view2, view, s0Var));
            }
            int m76480xe2ee1ca3 = c19786x6a1e2862.m76480xe2ee1ca3();
            if (m76480xe2ee1ca3 == 54) {
                i17 = 0;
                view3 = view2;
                Z("template", s0Var, view2, c19786x6a1e2862, com.p314xaae8f345.mm.R.C30867xcad56011.f9v, com.p314xaae8f345.mm.R.raw.f79660xdc46db14, com.p314xaae8f345.mm.R.C30859x5a72f63.f77845x35e12880, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.m3(s0Var, c19786x6a1e2862, this));
            } else if (m76480xe2ee1ca3 != 62) {
                i17 = 0;
                view3 = view2;
                Z("topic=" + str, s0Var, view2, c19786x6a1e2862, com.p314xaae8f345.mm.R.C30867xcad56011.lox, com.p314xaae8f345.mm.R.raw.f80029x425e227d, com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.o3(s0Var, str, y0Var, c19786x6a1e2862));
            } else {
                i17 = 0;
                view3 = view2;
                Z("music", s0Var, view2, c19786x6a1e2862, com.p314xaae8f345.mm.R.C30867xcad56011.f9v, com.p314xaae8f345.mm.R.raw.f79824x96410423, com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.n3(this, s0Var, y0Var, c19786x6a1e2862));
            }
            f0Var = jz5.f0.f384359a;
        } else {
            i17 = 0;
            view3 = view2;
            f0Var = null;
        }
        if (f0Var != null || view3 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert", "handleFollowPatBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(i17)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert", "handleFollowPatBtn", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0092, code lost:
    
        if (r13 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(in5.s0 r28, int r29, android.view.View r30, android.view.View r31, so2.y0 r32, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 r33, java.lang.String r34, java.lang.String r35, int r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4.T(in5.s0, int, android.view.View, android.view.View, so2.y0, com.tencent.mm.protocal.protobuf.FinderJumpInfo, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    public final void U(in5.s0 s0Var, so2.y0 y0Var) {
        F(s0Var, this.f186205g.getFeedObject(), y0Var);
        s0Var.p(com.p314xaae8f345.mm.R.id.uca).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q3(y0Var, this, s0Var));
    }

    public final boolean V() {
        return this.f186203e.W() == 2;
    }

    public final void W(so2.y0 y0Var, in5.s0 s0Var, boolean z17) {
        jz5.f0 f0Var;
        java.lang.String m75945x2fec8307;
        r45.ky0 m76052x34c6289e = y0Var.f492236d.u0().m76052x34c6289e();
        java.lang.String str = (m76052x34c6289e == null || (m75945x2fec8307 = m76052x34c6289e.m75945x2fec8307(4)) == null) ? "" : m75945x2fec8307;
        r45.xk m60785x37f6d02b = y0Var.f492236d.m60785x37f6d02b();
        if (m60785x37f6d02b != null) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String m75945x2fec83072 = m60785x37f6d02b.m75945x2fec8307(0);
            java.lang.String str2 = m75945x2fec83072 == null ? "" : m75945x2fec83072;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter = this.f186203e;
            so2.g0.b(y0Var, context, str2, nPresenter.mo56026x8fadefe3(), nPresenter.z0(), str);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.String Z0 = y0Var.f492236d.Z0();
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            so2.g0.d(y0Var, Z0, context2, str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        android.content.Context context3 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        o3Var.Gk(context3, y0Var.f492236d.f68959xf9a02e3e, true, true, 1, z17);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // in5.r
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 r84, so2.y0 r85, int r86, int r87, boolean r88, java.util.List r89) {
        /*
            Method dump skipped, instructions count: 7610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4.h(in5.s0, so2.y0, int, int, boolean, java.util.List):void");
    }

    public final void Y(so2.y0 y0Var, boolean z17, in5.s0 s0Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.a_z);
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.iht);
        boolean[] zArr = {false};
        p17.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p4(zArr));
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int s17 = s(context, z17, this.f186203e);
        c22699x3dcdb352.setImageResource(z17 ? com.p314xaae8f345.mm.R.raw.f79758xc84e73d5 : com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b);
        c22699x3dcdb352.m82040x7541828(s17);
        android.view.ViewGroup.LayoutParams layoutParams = c22699x3dcdb352.getLayoutParams();
        if (layoutParams != null) {
            int h17 = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561224cq);
            layoutParams.width = h17;
            layoutParams.height = h17;
        }
        p17.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q4(s0Var, this, zArr));
    }

    public final void Z(java.lang.String str, in5.s0 s0Var, android.view.View view, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, int i17, int i18, int i19, yz5.l lVar) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        java.lang.String str2;
        android.widget.TextView textView;
        java.lang.String m75945x2fec8307;
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.sd) ((r45.wf6) obj).m75936x14adae67(33)) != null) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        r45.sd sdVar = wf6Var != null ? (r45.sd) wf6Var.m75936x14adae67(33) : null;
        if (view != null && (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565376c75)) != null) {
            java.lang.String m75945x2fec83072 = sdVar != null ? sdVar.m75945x2fec8307(1) : null;
            if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
                m75945x2fec8307 = s0Var.f374654e.getResources().getString(i17);
            } else {
                m75945x2fec8307 = sdVar != null ? sdVar.m75945x2fec8307(1) : null;
            }
            textView.setText(m75945x2fec8307);
        }
        if (view != null && (c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.f565375c74)) != null) {
            if (sdVar == null || (str2 = sdVar.m75945x2fec8307(0)) == null) {
                str2 = "";
            }
            if (str2.length() == 0) {
                d75.b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.o4(c22699x3dcdb352, i18, i19));
            } else {
                c22699x3dcdb352.m82040x7541828(s0Var.f374654e.getResources().getColor(i19));
                mn2.g1 g1Var = mn2.g1.f411508a;
                wo0.c b17 = g1Var.e().b(new mn2.q3(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(mn2.f1.f411497r));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.r4 r4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.r4(this, c22699x3dcdb352, i18, i19);
                b17.getClass();
                b17.f529412j = r4Var;
                b17.f529411i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s4(this, c22699x3dcdb352, i18, i19);
                b17.c(c22699x3dcdb352);
            }
        }
        if (view != null) {
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.t4(str, c19786x6a1e2862, lVar));
        }
    }

    public final void a0(android.view.ViewGroup viewGroup) {
        android.view.View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15267xd9054be4 c15267xd9054be4 = childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15267xd9054be4 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15267xd9054be4) childAt : null;
        if (c15267xd9054be4 == null) {
            return;
        }
        if (c15267xd9054be4.isAttached) {
            c15267xd9054be4.q();
        }
        viewGroup.removeAllViews();
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569367c;
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.p(com.p314xaae8f345.mm.R.id.a_z), "finder_feed_first_comment_awesome_iv");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.f568176lz4);
        c15258xcd50c176.m61741xc3b64c0d(2);
        c15258xcd50c176.m61734x50e5c22f(true);
        c15258xcd50c176.f(false, true);
        c15258xcd50c176.m61743x9bd24cae(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.k4(holder, this));
        android.content.Context context = holder.f374654e;
        c15258xcd50c176.m61746x1c5c5ff4(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c1762 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.c6d);
        c15258xcd50c1762.m61741xc3b64c0d(4);
        c15258xcd50c1762.m61734x50e5c22f(true);
        c15258xcd50c1762.f(false, true);
        c15258xcd50c1762.m61739x5164a7fa(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560654qk));
        c15258xcd50c1762.m61743x9bd24cae(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.l4(holder, this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15302x70e49e3b c15302x70e49e3b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15302x70e49e3b) holder.p(com.p314xaae8f345.mm.R.id.rrw);
        if (c15302x70e49e3b != null) {
            c15302x70e49e3b.m62114x5691fb54(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.m4(this));
        }
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        ym5.a1.i(itemView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.n4(holder, this));
        com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 c22803x544dcce2 = (com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2) holder.p(com.p314xaae8f345.mm.R.id.swk);
        if (c22803x544dcce2 != null) {
            c22803x544dcce2.m82730xa9c9647a(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77667x8113c229));
            c22803x544dcce2.m82732xb86bf9c5(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.v2_);
        if (c22699x3dcdb352 != null) {
            java.lang.Object tag = c22699x3dcdb352.getTag();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, bool)) {
                return;
            }
            c22699x3dcdb352.setTag(bool);
            c22699x3dcdb352.post(new d92.a(c22699x3dcdb352));
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(sc2.a8.class);
        a8Var.getClass();
        a8Var.f7(holder);
        da2.g gVar = this.f186206h;
        if (gVar != null) {
            gVar.j();
        }
        this.f186206h = null;
        try {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(holder.f374657h, java.lang.Boolean.TRUE)) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.c6i);
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.rga);
                a0(viewGroup);
                a0(viewGroup2);
                holder.f374657h = java.lang.Boolean.FALSE;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderFeedCommentConvert", "onViewRecycled error=" + th6);
        }
    }
}
