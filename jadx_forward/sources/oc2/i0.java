package oc2;

/* loaded from: classes8.dex */
public abstract class i0 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public oc2.y0 f425740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b f425741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b, android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f425741e = c13738xbdff117b;
    }

    public final r45.cp5 a(oc2.w renderNodeType) {
        oc2.y yVar;
        boolean z17;
        r45.x80 x80Var;
        r45.wm5 wm5Var;
        r45.x80 x80Var2;
        r45.wm5 wm5Var2;
        r45.xy3 xy3Var;
        r45.x80 x80Var3;
        r45.wm5 wm5Var3;
        r45.x80 x80Var4;
        r45.wm5 wm5Var4;
        r45.xy3 xy3Var2;
        r45.x80 x80Var5;
        r45.wm5 wm5Var5;
        r45.x80 x80Var6;
        r45.wm5 wm5Var6;
        r45.xy3 xy3Var3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderNodeType, "renderNodeType");
        java.util.Iterator it = m150998x7526c164().f425855b.iterator();
        do {
            java.lang.String str = null;
            if (!it.hasNext()) {
                return null;
            }
            yVar = (oc2.y) it.next();
            int ordinal = renderNodeType.ordinal();
            z17 = true;
            if (ordinal == 0) {
                r45.ap5 ap5Var = yVar.f425844a.f453302e;
                if (ap5Var != null && (x80Var2 = ap5Var.f451709d) != null && (wm5Var2 = x80Var2.f471388f) != null && (xy3Var = wm5Var2.f470824e) != null) {
                    str = xy3Var.f472126d;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    r45.ap5 ap5Var2 = yVar.f425844a.f453302e;
                    if (((ap5Var2 == null || (x80Var = ap5Var2.f451709d) == null || (wm5Var = x80Var.f471388f) == null) ? 0 : wm5Var.f470823d) > 0) {
                    }
                    z17 = false;
                }
            } else if (ordinal == 1) {
                r45.ap5 ap5Var3 = yVar.f425844a.f453302e;
                if (ap5Var3 != null && (x80Var4 = ap5Var3.f451710e) != null && (wm5Var4 = x80Var4.f471388f) != null && (xy3Var2 = wm5Var4.f470824e) != null) {
                    str = xy3Var2.f472126d;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    r45.ap5 ap5Var4 = yVar.f425844a.f453302e;
                    if (((ap5Var4 == null || (x80Var3 = ap5Var4.f451710e) == null || (wm5Var3 = x80Var3.f471388f) == null) ? 0 : wm5Var3.f470823d) > 0) {
                    }
                    z17 = false;
                }
            } else {
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                r45.ap5 ap5Var5 = yVar.f425844a.f453302e;
                if (ap5Var5 != null && (x80Var6 = ap5Var5.f451711f) != null && (wm5Var6 = x80Var6.f471388f) != null && (xy3Var3 = wm5Var6.f470824e) != null) {
                    str = xy3Var3.f472126d;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    r45.ap5 ap5Var6 = yVar.f425844a.f453302e;
                    if (((ap5Var6 == null || (x80Var5 = ap5Var6.f451711f) == null || (wm5Var5 = x80Var5.f471388f) == null) ? 0 : wm5Var5.f470823d) > 0) {
                    }
                    z17 = false;
                }
            }
        } while (!z17);
        return yVar.f425844a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b4, code lost:
    
        if (r0.length == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(oc2.y r20, android.widget.TextView r21, r45.x80 r22, oc2.c0 r23, float r24) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oc2.i0.b(oc2.y, android.widget.TextView, r45.x80, oc2.c0, float):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0017, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0021, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x001e, code lost:
    
        if (r3 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(r45.zo5 r3, int r4) {
        /*
            r2 = this;
            boolean r0 = com.p314xaae8f345.mm.ui.bk.C()
            java.lang.String r1 = ""
            if (r0 == 0) goto L1a
            if (r3 == 0) goto L11
            java.lang.String r0 = r3.f473787e
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r1 = r0
            goto L22
        L11:
            if (r3 == 0) goto L16
            java.lang.String r3 = r3.f473786d
            goto L17
        L16:
            r3 = 0
        L17:
            if (r3 != 0) goto L21
            goto L22
        L1a:
            if (r3 == 0) goto L22
            java.lang.String r3 = r3.f473786d
            if (r3 != 0) goto L21
            goto L22
        L21:
            r1 = r3
        L22:
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r3 != 0) goto L35
            r3 = 0
            java.lang.String r0 = "#"
            boolean r3 = r26.i0.y(r1, r0, r3)
            if (r3 != 0) goto L35
            java.lang.String r1 = r0.concat(r1)
        L35:
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r3 == 0) goto L3c
            goto L54
        L3c:
            int r3 = android.graphics.Color.parseColor(r1)
            int r4 = android.graphics.Color.blue(r3)
            int r0 = android.graphics.Color.green(r3)
            int r1 = android.graphics.Color.red(r3)
            int r3 = android.graphics.Color.alpha(r3)
            int r4 = android.graphics.Color.argb(r4, r3, r1, r0)
        L54:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oc2.i0.c(r45.zo5, int):int");
    }

    public final jz5.l d(int i17) {
        int a17 = i17 == 1 ? -2 : (int) (ym5.x.a(getContext(), 11.1f) * i65.a.q(getContext()));
        return new jz5.l(java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(a17));
    }

    public final void e(android.widget.ImageView imageView, java.lang.String url, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
            imageView.setImageResource(i17 == 1 ? com.p314xaae8f345.mm.R.C30861xcebc809e.b8i : com.p314xaae8f345.mm.R.raw.f79236x2de5f313);
            return;
        }
        oc2.v vVar = oc2.v.f425815a;
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(url, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(mn2.f1.f411497r));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b = this.f425741e;
        vVar.u(b17, c13738xbdff117b.h(), c13738xbdff117b.getCtrlInfo(), c13738xbdff117b.getShowInfo(), url);
        b17.c(imageView);
    }

    public final void f(android.view.ViewGroup container, android.view.View redDotView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotView, "redDotView");
        container.setClipToPadding(false);
        android.view.ViewGroup.LayoutParams layoutParams = redDotView.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2.topMargin < 0) {
            container.setPadding(container.getPaddingLeft(), -layoutParams2.topMargin, container.getPaddingRight(), container.getPaddingBottom());
        }
        if (layoutParams2.getMarginStart() < 0) {
            container.setPadding(-layoutParams2.getMarginStart(), container.getPaddingTop(), container.getPaddingRight(), container.getPaddingBottom());
        }
        if (layoutParams2.getMarginEnd() < 0) {
            container.setPadding(container.getPaddingLeft(), container.getPaddingTop(), -layoutParams2.getMarginEnd(), container.getPaddingBottom());
        }
        if (layoutParams2.bottomMargin < 0) {
            container.setPadding(container.getPaddingLeft(), container.getPaddingTop(), container.getPaddingRight(), -layoutParams2.bottomMargin);
        }
    }

    public final void g(android.widget.FrameLayout.LayoutParams layoutParam, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutParam, "layoutParam");
        layoutParam.bottomMargin = 0;
        layoutParam.topMargin = 0;
        layoutParam.setMarginStart(0);
        layoutParam.setMarginEnd(0);
        if (i17 != 0) {
            if (i17 == 1) {
                layoutParam.gravity = 8388659;
                int i27 = i18 + i19;
                layoutParam.topMargin = i27;
                layoutParam.setMarginStart(i27);
                return;
            }
            if (i17 != 2) {
                if (i17 == 3) {
                    layoutParam.gravity = 8388691;
                    layoutParam.bottomMargin = i18 - i19;
                    layoutParam.setMarginStart(i18 + i19);
                    return;
                } else if (i17 == 4) {
                    layoutParam.gravity = 8388693;
                    layoutParam.bottomMargin = i18 - i19;
                    layoutParam.setMarginEnd(i18 + i19);
                    return;
                } else if (i17 == 6) {
                    layoutParam.gravity = 8388629;
                    layoutParam.setMarginEnd(i18 + i19);
                    return;
                } else {
                    if (i17 != 7) {
                        return;
                    }
                    layoutParam.gravity = 8388627;
                    layoutParam.setMarginStart(i18 + i19);
                    return;
                }
            }
        }
        layoutParam.gravity = 8388661;
        int i28 = i18 + i19;
        layoutParam.topMargin = i28;
        layoutParam.setMarginEnd(i28);
    }

    /* renamed from: getSplit */
    public final oc2.y0 m150998x7526c164() {
        oc2.y0 y0Var = this.f425740d;
        if (y0Var != null) {
            return y0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("split");
        throw null;
    }

    public final int h(r45.cp5 node) {
        r45.t60 t60Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(node, "node");
        r45.yo5 yo5Var = node.f453303f;
        if (yo5Var == null || (t60Var = yo5Var.f472794d) == null) {
            return 0;
        }
        return t60Var.f467702g;
    }

    /* renamed from: setSplit */
    public final void m150999x53b4dbd8(oc2.y0 y0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(y0Var, "<set-?>");
        this.f425740d = y0Var;
    }
}
