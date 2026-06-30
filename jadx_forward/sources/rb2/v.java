package rb2;

/* loaded from: classes10.dex */
public final class v extends rb2.m0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter presenter, long j17) {
        super(presenter, j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        jz5.h.b(rb2.k.f475199d);
    }

    public static final void B(rb2.v vVar, in5.s0 s0Var, so2.y0 y0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, int i17) {
        java.lang.String m75945x2fec8307;
        vVar.getClass();
        java.lang.String str = null;
        if (y0Var.f492236d.a1()) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.u) a17).O6(s0Var, V6, y0Var, i17);
        } else if (y0Var.f492236d.i1()) {
            android.content.Context context3 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a18 = zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x) a18).P6(pm0.v.u(y0Var.f492236d.f68959xf9a02e3e), i17);
        }
        if (c19786x6a1e2862 == null) {
            vVar.q(y0Var, s0Var, true);
            return;
        }
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.content.Context context4 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        r45.ky0 m76052x34c6289e = y0Var.f492236d.u0().m76052x34c6289e();
        if (m76052x34c6289e == null || (m75945x2fec8307 = m76052x34c6289e.m75945x2fec8307(4)) == null) {
            r45.qy0 m76085x188a5bc0 = y0Var.f492236d.u0().m76085x188a5bc0();
            if (m76085x188a5bc0 != null) {
                str = m76085x188a5bc0.m75945x2fec8307(4);
            }
        } else {
            str = m75945x2fec8307;
        }
        if (str == null) {
            str = "";
        }
        p0Var.f534787p = str;
        p0Var.f534777f = vVar.f475219e.f0();
        xc2.y2.i(y2Var, context4, p0Var, 0, null, 12, null);
    }

    public final void C(in5.s0 s0Var, r45.j60 j60Var, android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15289x510d6f67 c15289x510d6f67, long j17, so2.y0 y0Var, boolean z17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j60Var);
        float m75939xb282bd08 = j60Var.m75939xb282bd08(2) > 0 ? j60Var.m75939xb282bd08(2) : 16.0f;
        float m75939xb282bd082 = j60Var.m75939xb282bd08(3) > 0 ? j60Var.m75939xb282bd08(3) : 9.0f;
        if (z17) {
            jz5.l a17 = rb2.b.f475103g.a(m75939xb282bd08, m75939xb282bd082);
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
                    E(s0Var, c15289x510d6f67, m75939xb282bd083, m75939xb282bd08, m75939xb282bd082, j60Var.m75939xb282bd08(6));
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
        long c17 = c01.id.c();
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).I).mo141623x754a37bb());
        java.lang.String m75945x2fec8307 = j60Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        wo0.c a18 = d1Var.a(new mn2.j0(m75945x2fec8307));
        rb2.c cVar = new rb2.c(this, j17, c17);
        a18.getClass();
        a18.f529406d = cVar;
        a18.c(imageView);
        ym5.a1.i(c15289x510d6f67, new rb2.d(this, j17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(in5.s0 s0Var, r45.s60 s60Var, android.widget.ImageView imageView, android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15289x510d6f67 c15289x510d6f67, long j17, so2.y0 y0Var, boolean z17) {
        java.lang.String str;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15267xd9054be4 c15267xd9054be4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15289x510d6f67 c15289x510d6f672;
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter = this.f475219e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15267xd9054be4 v07 = nPresenter.v0();
        if (s60Var == null || (str = s60Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        v07.m61771xc809512f().a(nPresenter.f0().mo2128x1ed62e84(), y0Var.f492236d.u0());
        v07.m61782xca02517a(j17);
        android.view.ViewParent parent = v07.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(v07);
        }
        viewGroup.addView(v07);
        viewGroup.setVisibility(0);
        imageView.setVisibility(8);
        boolean z18 = true;
        if (v07.m61780xfa6224fa() != 1 && v07.m61780xfa6224fa() != 0 && v07.m61780xfa6224fa() != 10) {
            java.lang.String str3 = v07.mediaId;
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            if (!(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes())))) {
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
            i17 = 0;
            a17.f529406d = new rb2.e(this, j17, c17);
            ((wo0.b) a17).c(imageView);
            v07.u((s60Var == null || (m75945x2fec8307 = s60Var.m75945x2fec8307(0)) == null) ? "" : m75945x2fec8307, new rb2.i(v07, imageView, s0Var, y0Var));
            v07.m66742xdce4ea8b().getClass();
            java.lang.String m66740xe56ce956 = v07.m66740xe56ce956();
            v07.m66742xdce4ea8b().getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m66740xe56ce956, "prepareToFirstFrameRender return for isViewFocused:true");
        } else {
            i17 = 0;
        }
        float m75939xb282bd08 = (s60Var == null || s60Var.m75939xb282bd08(4) <= 0) ? 16.0f : s60Var.m75939xb282bd08(4);
        float m75939xb282bd082 = (s60Var == null || s60Var.m75939xb282bd08(5) <= 0) ? 9.0f : s60Var.m75939xb282bd08(5);
        if (z17) {
            c15267xd9054be4 = v07;
            boolean z19 = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15289x510d6f67 c15289x510d6f673 = c15289x510d6f67;
            jz5.l a18 = rb2.b.f475103g.a(m75939xb282bd08, m75939xb282bd082);
            int dimensionPixelSize = s0Var.f374654e.getResources().getDimensionPixelSize(((java.lang.Number) a18.f384366d).intValue());
            int dimensionPixelSize2 = s0Var.f374654e.getResources().getDimensionPixelSize(((java.lang.Number) a18.f384367e).intValue());
            android.view.ViewGroup.LayoutParams layoutParams = c15289x510d6f67.getLayoutParams();
            layoutParams.height = dimensionPixelSize2;
            c15289x510d6f673.setLayoutParams(layoutParams);
            c15289x510d6f673.b(dimensionPixelSize, dimensionPixelSize2, z19);
            c15289x510d6f672 = c15289x510d6f673;
        } else {
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            int m75939xb282bd083 = s60Var != null ? s60Var.m75939xb282bd08(7) : i17;
            if (m75939xb282bd08 <= 0.0f || m75939xb282bd082 <= 0.0f) {
                c15289x510d6f672 = c15289x510d6f67;
                c15267xd9054be4 = v07;
            } else if (m75939xb282bd083 > 0) {
                if (s60Var != null) {
                    i17 = s60Var.m75939xb282bd08(9);
                }
                c15267xd9054be4 = v07;
                E(s0Var, c15289x510d6f67, m75939xb282bd083, m75939xb282bd08, m75939xb282bd082, i17);
                c15289x510d6f672 = c15289x510d6f67;
            } else {
                c15267xd9054be4 = v07;
                boolean z27 = i17;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15289x510d6f67 c15289x510d6f674 = c15289x510d6f67;
                c15289x510d6f674.b(m75939xb282bd08, m75939xb282bd082, z27);
                c15289x510d6f672 = c15289x510d6f674;
            }
        }
        ym5.a1.i(c15289x510d6f672, new rb2.j(c15267xd9054be4, j17, s0Var, y0Var));
    }

    public final void E(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15289x510d6f67 c15289x510d6f67, int i17, float f17, float f18, int i18) {
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", sb6.toString());
        float f28 = c17;
        if (f27 > f28) {
            f19 = f18;
            i37 = (int) ((f28 / f17) * f19);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleAdHeightPercentage: out of width limit, resultHeight=");
            sb7.append(i37);
            sb7.append(", maxWidth=");
            sb7.append(c17);
            sb7.append(" aid=");
            sb7.append((y0Var == null || (yj0Var = y0Var.f492236d) == null || (m76052x34c6289e = yj0Var.u0().m76052x34c6289e()) == null) ? null : java.lang.Long.valueOf(m76052x34c6289e.m75942xfb822ef2(1)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", sb7.toString());
        } else {
            f19 = f18;
        }
        android.view.ViewGroup.LayoutParams layoutParams = c15289x510d6f67.getLayoutParams();
        layoutParams.height = i37;
        c15289x510d6f67.setLayoutParams(layoutParams);
        c15289x510d6f67.b(f17, f19, false);
    }

    public final void F(android.view.ViewGroup viewGroup) {
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
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.drf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:344:0x022f, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0c8f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0ce5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0cf9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0d3b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0d89 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0cfc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0a73  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0aa0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a7b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0bba  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0bc3  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0bd9  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0677  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r50, in5.c r51, int r52, int r53, boolean r54, java.util.List r55) {
        /*
            Method dump skipped, instructions count: 3466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb2.v.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.p(com.p314xaae8f345.mm.R.id.a_z), "finder_feed_second_comment_awesome_iv");
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        ym5.a1.i(itemView, new rb2.u(holder, this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.v2_);
        if (c22699x3dcdb352 != null) {
            java.lang.Object tag = c22699x3dcdb352.getTag();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, bool)) {
                c22699x3dcdb352.setTag(bool);
                c22699x3dcdb352.post(new d92.a(c22699x3dcdb352));
            }
        }
        o(holder);
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
        da2.g gVar = this.f475221g;
        if (gVar != null) {
            gVar.j();
        }
        this.f475221g = null;
        try {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(holder.f374657h, java.lang.Boolean.TRUE)) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.c6i);
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.rga);
                F(viewGroup);
                F(viewGroup2);
                holder.f374657h = java.lang.Boolean.FALSE;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderCommentConvert", "onViewRecycled error=" + th6);
        }
    }
}
