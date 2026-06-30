package ht2;

@j95.b
/* loaded from: classes2.dex */
public final class y0 extends i95.w implements zy2.s6 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.regex.Pattern f366469g = java.util.regex.Pattern.compile("<_wc_custom_link_.+? (.*?)>(.*?)</_wc_custom_link_>");

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.regex.Pattern f366470h = java.util.regex.Pattern.compile("<_wc_custom_link_\\s+(.*?)>(.*?)</_wc_custom_link_>");

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.regex.Pattern f366471i = java.util.regex.Pattern.compile("<_wc_custom_img_.+? (.*?)/>");

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.regex.Pattern f366472m = java.util.regex.Pattern.compile("<_wc_custom_img_\\s+(.*?)/>");

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f366473d = kz5.c1.k(new jz5.l("FinderObjectDynamicImageKey_FinderAdPoiIcon", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79787x448e46cd)), new jz5.l("icons_outlined_like_1.5pt.svg", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80143xebd704ef)), new jz5.l("finder_thank_fireworks_icon.png", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563336cr1)), new jz5.l("arrow_right_regular.svg", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78546xb4052203)), new jz5.l("icons_outlined_red_envelope.svg", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80285xdb531916)), new jz5.l("icons_filled_red_envelope.svg", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79883x87bc4817)), new jz5.l("finder_thank_party_icon.png", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.cwy)), new jz5.l("camera_regular.svg", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78739x813c9482)), new jz5.l("heart_medium.svg", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79472xe7e9e18e)), new jz5.l("icons_outlined_channels_like", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80143xebd704ef)), new jz5.l("icons_outlined_channels_good", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b)));

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f366474e = "";

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f366475f;

    public static final void Vi(android.widget.LinearLayout linearLayout, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2, android.view.ViewGroup viewGroup) {
        if (c0Var.f391645d && c0Var2.f391645d) {
            linearLayout.animate().alpha(0.0f).setDuration(400L).setListener(new ht2.q0(viewGroup, linearLayout));
        }
    }

    public static java.util.Map nj(ht2.y0 y0Var, java.lang.CharSequence richText, int i17, int i18, int i19, java.lang.Object obj) {
        java.util.Map d17;
        if ((i19 & 2) != 0) {
            i17 = -1;
        }
        if ((i19 & 4) != 0) {
            i18 = -1;
        }
        y0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(richText, "richText");
        if (i17 == -1) {
            i17 = r26.n0.K(richText, '<', 0, false, 6, null);
        }
        if (i18 == -1) {
            i18 = r26.n0.K(richText, '>', 0, false, 6, null);
        }
        kz5.q0 q0Var = kz5.q0.f395534d;
        return (i17 < 0 || i18 < 0 || i18 <= i17 || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(richText.subSequence(i17, i18 + 1).toString(), "_wc_custom_img_", null)) == null) ? q0Var : d17;
    }

    public static boolean pj(ht2.y0 y0Var, android.widget.TextView view, java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18, java.lang.Object obj) {
        fx2.f fVar;
        java.lang.Object obj2;
        int i19 = (i18 & 16) != 0 ? 0 : i17;
        y0Var.getClass();
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        java.lang.String t17 = r26.i0.t(str2, "$$", str, false);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(t17);
        java.util.Map nj6 = nj(y0Var, t17, 0, 0, 6, null);
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
        zy2.k6 ij6 = y0Var.ij(nj6, resources);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new ht2.e(ij6.f558968a, r26.n0.L(t17, "<", 0, false, 6, null), r26.n0.L(t17, ">", 0, false, 6, null)));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ht2.e eVar = (ht2.e) it.next();
            if (eVar.f366352b >= 0 && eVar.f366353c >= 0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
                java.util.Iterator it6 = cu2.f0.f303926c.iterator();
                while (true) {
                    fVar = null;
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.rl2) obj2).m75945x2fec8307(3), eVar.f366351a)) {
                        break;
                    }
                }
                r45.rl2 rl2Var = (r45.rl2) obj2;
                if (rl2Var != null) {
                    java.lang.String m75945x2fec8307 = z17 ? rl2Var.m75945x2fec8307(1) : rl2Var.m75945x2fec8307(2);
                    if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                        fVar = new fx2.f(m75945x2fec8307, com.p314xaae8f345.mm.R.id.f569043ou1, view);
                    }
                }
                if (fVar != null) {
                    fVar.f348665g = mn2.f1.f411486d;
                    int textSize = i19 == 0 ? (int) view.getTextSize() : i19;
                    fVar.setBounds(0, 0, textSize, textSize);
                    fVar.f348664f = 204;
                    spannableStringBuilder.setSpan(new al5.w(fVar, 1), eVar.f366352b, eVar.f366353c + 1, 17);
                }
            }
            return false;
        }
        view.setVisibility(0);
        view.setText(spannableStringBuilder);
        return true;
    }

    public void Ai(android.view.View btnIv, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(btnIv, "btnIv");
        uw2.h0.o(uw2.h0.f513207a, btnIv, 0L, 2, null);
        try {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = view instanceof com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b ? (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) view : null;
            if (c22789xd23e9a9b != null) {
                c22789xd23e9a9b.setVisibility(0);
                c22789xd23e9a9b.m82582x3ae760af(0.0d);
                c22789xd23e9a9b.m82583xcde73672(1);
                c22789xd23e9a9b.o(((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Z0().r()).booleanValue());
                if (c22789xd23e9a9b.getUseRfx()) {
                    c22789xd23e9a9b.mo82566x3e3ac3e8(com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77390x243906(btnIv.getContext().getAssets(), "finder_like_animate.pag"));
                } else {
                    c22789xd23e9a9b.mo82568x3e3ac3e8(org.p3363xbe4143f1.C29690xfae77312.m154715x243906(btnIv.getContext().getAssets(), "finder_like_animate.pag"));
                }
                c22789xd23e9a9b.g();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.DynamicIconResService", "playIconInTimeLineFeedLikeAnimDefault e:" + th6);
        }
    }

    public void Bi(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 iv6, android.widget.TextView tv6, zy2.o6 iConfig) {
        java.lang.String m75945x2fec8307;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iv6, "iv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iConfig, "iConfig");
        iv6.setVisibility(8);
        int dimension = iv6.getLayoutParams().width > 0 ? iv6.getLayoutParams().width : (int) iv6.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        java.lang.String str = "";
        if (iConfig.f559046c) {
            java.lang.String str2 = iConfig.f559045b;
            if (str2 == null || str2.length() == 0) {
                z17 = false;
            } else {
                android.text.SpannableString H3 = zy2.s6.H3(this, r26.i0.t(str2, "$$", "", false), dimension, false, 4, null);
                tv6.setVisibility(0);
                tv6.setText(H3);
                tv6.postInvalidate();
                z17 = true;
            }
            if (z17) {
                return;
            }
        }
        tv6.setVisibility(8);
        iv6.setVisibility(0);
        boolean z18 = iConfig.f559044a;
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (z18) {
            if (iConfig.f559048e) {
                iv6.setImageResource(com.p314xaae8f345.mm.R.raw.f79578xb4112bf8);
                iv6.m82040x7541828(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                return;
            }
            r45.rl2 a17 = cu2.f0.f303924a.a("FinderObjectDynamicImageKey_FinderFavOffIcon");
            if (com.p314xaae8f345.mm.ui.bk.C() ? !(a17 == null || (m75945x2fec8307 = a17.m75945x2fec8307(1)) == null) : !(a17 == null || (m75945x2fec8307 = a17.m75945x2fec8307(2)) == null)) {
                str = m75945x2fec8307;
            }
            if (str.length() == 0) {
                iv6.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(iv6.getContext(), com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b, iv6.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
                iv6.m82040x7541828(i65.a.d(iv6.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                return;
            }
            wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.f411486d));
            ht2.h hVar = new ht2.h(iv6, this);
            b17.getClass();
            b17.f529406d = hVar;
            b17.f();
            return;
        }
        r45.bm2 bm2Var = iConfig.f559047d;
        if (bm2Var != null) {
            java.lang.String str3 = null;
            java.lang.String m75945x2fec83072 = bm2Var != null ? bm2Var.m75945x2fec8307(10) : null;
            if (m75945x2fec83072 != null && m75945x2fec83072.length() != 0) {
                r9 = false;
            }
            if (!r9) {
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    r45.bm2 bm2Var2 = iConfig.f559047d;
                    if (bm2Var2 != null) {
                        str3 = bm2Var2.m75945x2fec8307(9);
                    }
                } else {
                    r45.bm2 bm2Var3 = iConfig.f559047d;
                    if (bm2Var3 != null) {
                        str3 = bm2Var3.m75945x2fec8307(10);
                    }
                }
                wo0.c b18 = g1Var.e().b(new mn2.q3(str3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.f411486d));
                ht2.j jVar = new ht2.j(iv6, this);
                b18.getClass();
                b18.f529406d = jVar;
                b18.f();
                return;
            }
        }
        iv6.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(iv6.getContext(), com.p314xaae8f345.mm.R.raw.f79562xfeb10c8c, iv6.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
        iv6.m82040x7541828(i65.a.d(iv6.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r2 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        if (r7.f559087e == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
    
        if (com.p314xaae8f345.mm.ui.bk.C() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008f, code lost:
    
        fj(r2, r0, new ht2.v0(r1, r7, r6, r5));
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r2 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        if (r2 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Di(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 r6, zy2.r6 r7) {
        /*
            r5 = this;
            java.lang.String r0 = "iv"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = "iConfig"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            r0 = 0
            r6.setLayerPaint(r0)
            r0 = 0
            r6.m82040x7541828(r0)
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r7.f559091i
            if (r1 != 0) goto L18
            goto L98
        L18:
            boolean r2 = r7.f559086d
            r3 = 1
            r4 = 27
            if (r2 == 0) goto L40
            r5.vj(r1)
            r45.dm2 r2 = r1.m76806xdef68064()
            if (r2 == 0) goto L98
            com.tencent.mm.protobuf.f r2 = r2.m75936x14adae67(r4)
            r45.vl2 r2 = (r45.vl2) r2
            if (r2 == 0) goto L98
            com.tencent.mm.protobuf.f r2 = r2.m75936x14adae67(r0)
            r45.ql2 r2 = (r45.ql2) r2
            if (r2 == 0) goto L98
            r4 = 3
            java.lang.String r2 = r2.m75945x2fec8307(r4)
            if (r2 != 0) goto L84
            goto L98
        L40:
            boolean r2 = r7.f559084b
            if (r2 == 0) goto L64
            r5.vj(r1)
            r45.dm2 r2 = r1.m76806xdef68064()
            if (r2 == 0) goto L98
            com.tencent.mm.protobuf.f r2 = r2.m75936x14adae67(r4)
            r45.vl2 r2 = (r45.vl2) r2
            if (r2 == 0) goto L98
            com.tencent.mm.protobuf.f r2 = r2.m75936x14adae67(r0)
            r45.ql2 r2 = (r45.ql2) r2
            if (r2 == 0) goto L98
            java.lang.String r2 = r2.m75945x2fec8307(r0)
            if (r2 != 0) goto L84
            goto L98
        L64:
            r5.vj(r1)
            r45.dm2 r2 = r1.m76806xdef68064()
            if (r2 == 0) goto L98
            com.tencent.mm.protobuf.f r2 = r2.m75936x14adae67(r4)
            r45.vl2 r2 = (r45.vl2) r2
            if (r2 == 0) goto L98
            com.tencent.mm.protobuf.f r2 = r2.m75936x14adae67(r0)
            r45.ql2 r2 = (r45.ql2) r2
            if (r2 == 0) goto L98
            java.lang.String r2 = r2.m75945x2fec8307(r3)
            if (r2 != 0) goto L84
            goto L98
        L84:
            boolean r4 = r7.f559087e
            if (r4 == 0) goto L8e
            boolean r4 = com.p314xaae8f345.mm.ui.bk.C()
            if (r4 == 0) goto L8f
        L8e:
            r0 = r3
        L8f:
            ht2.v0 r4 = new ht2.v0
            r4.<init>(r1, r7, r6, r5)
            r5.fj(r2, r0, r4)
            r0 = r3
        L98:
            if (r0 != 0) goto L9d
            r5.rj(r6, r7)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ht2.y0.Di(com.tencent.mm.ui.widget.imageview.WeImageView, zy2.r6):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0041, code lost:
    
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0086, code lost:
    
        r0 = pj(r35, r36, java.lang.String.valueOf(r37.f558985c), cu2.f0.f303924a.d(r0), com.p314xaae8f345.mm.ui.bk.C(), 0, 16, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0062, code lost:
    
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0083, code lost:
    
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:5:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ni(android.widget.TextView r36, zy2.l6 r37) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ht2.y0.Ni(android.widget.TextView, zy2.l6):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x003c, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005f, code lost:
    
        r3 = r28.f559005g + ' ' + cu2.f0.f303924a.d(r0);
        r2 = java.lang.String.valueOf(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        if (r28.f559002d == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0087, code lost:
    
        if (com.p314xaae8f345.mm.ui.bk.C() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008d, code lost:
    
        r0 = pj(r26, r27, r2, r3, r4, 0, 16, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008c, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x005c, code lost:
    
        if (r0 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ri(android.widget.TextView r27, zy2.m6 r28) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ht2.y0.Ri(android.widget.TextView, zy2.m6):void");
    }

    public void Ui(android.widget.TextView tv6, android.view.ViewGroup viewGroup, zy2.r6 iConfig) {
        r45.vl2 vl2Var;
        r45.wl2 wl2Var;
        r45.zz3 zz3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iConfig, "iConfig");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = iConfig.f559091i;
        if (c19792x256d2725 == null) {
            return;
        }
        nv2.h1 h1Var = nv2.n1.f422083g;
        nv2.n1 n1Var = nv2.n1.f422084h;
        int l17 = n1Var.l(c19792x256d2725);
        boolean booleanValue = ((java.lang.Boolean) n1Var.k(c19792x256d2725).f384366d).booleanValue();
        if (viewGroup != null) {
            viewGroup.setTag(com.p314xaae8f345.mm.R.id.e5w, java.lang.Boolean.valueOf(booleanValue));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicIconResService", "_setTextInTimeLineFeedLike feedId:" + pm0.v.u(c19792x256d2725.m76784x5db1b11()) + " likeCount=" + l17);
        if (iConfig.f559086d) {
            com.p314xaae8f345.mm.ui.fk.c(tv6);
            java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.i(n1Var.l(c19792x256d2725));
            if (viewGroup != null) {
                viewGroup.setTag(com.p314xaae8f345.mm.R.id.f565941e61, i17);
            }
            tv6.setText(i17);
        } else if (l17 > 0) {
            java.lang.String g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.g(2, l17);
            com.p314xaae8f345.mm.ui.fk.a(tv6);
            if (viewGroup != null) {
                viewGroup.setTag(com.p314xaae8f345.mm.R.id.f565941e61, g17);
            }
            tv6.setText(g17);
        } else {
            vj(c19792x256d2725);
            r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
            java.lang.String m75945x2fec8307 = (m76806xdef68064 == null || (zz3Var = (r45.zz3) m76806xdef68064.m75936x14adae67(41)) == null) ? null : zz3Var.m75945x2fec8307(4);
            r45.dm2 m76806xdef680642 = c19792x256d2725.m76806xdef68064();
            boolean z17 = true;
            java.lang.String m75945x2fec83072 = (m76806xdef680642 == null || (vl2Var = (r45.vl2) m76806xdef680642.m75936x14adae67(27)) == null || (wl2Var = (r45.wl2) vl2Var.m75936x14adae67(1)) == null) ? null : wl2Var.m75945x2fec8307(4);
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
                    r45.bm2 bm2Var = iConfig.f559090h;
                    java.lang.String m75945x2fec83073 = bm2Var != null ? bm2Var.m75945x2fec8307(11) : null;
                    if (m75945x2fec83073 != null && m75945x2fec83073.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        m75945x2fec8307 = tv6.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d1d);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec8307);
                    } else {
                        r45.bm2 bm2Var2 = iConfig.f559090h;
                        if (bm2Var2 == null || (m75945x2fec8307 = bm2Var2.m75945x2fec8307(11)) == null) {
                            m75945x2fec8307 = "";
                        }
                    }
                } else {
                    m75945x2fec8307 = m75945x2fec83072;
                }
            }
            com.p314xaae8f345.mm.ui.fk.c(tv6);
            tv6.setText(m75945x2fec8307);
            if (viewGroup != null) {
                viewGroup.setTag(com.p314xaae8f345.mm.R.id.f565941e61, "0");
            }
        }
        if (!iConfig.f559093k) {
            tv6.setTextColor(tv6.getContext().getResources().getColor(iConfig.f559087e ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77644xad7ef2b : com.p314xaae8f345.mm.R.C30859x5a72f63.f560521mr));
        } else if (iConfig.f559087e) {
            tv6.setTextColor(tv6.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
        } else {
            tv6.setTextColor(tv6.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Zi(android.view.ViewGroup viewGroup, zy2.r6 r6Var, yz5.p pVar) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        android.content.Context context = viewGroup.getContext();
        java.lang.CharSequence charSequence = r6Var.f559094l;
        boolean z17 = !(charSequence == null || r26.n0.N(charSequence));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context);
        int dimension = (int) viewGroup.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561258dh);
        int i17 = z17 ? -1 : dimension;
        if (viewGroup instanceof android.widget.RelativeLayout) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(i17, i17);
            layoutParams2.addRule(13);
            layoutParams = layoutParams2;
        } else {
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(i17, i17);
            layoutParams3.gravity = 17;
            layoutParams = layoutParams3;
        }
        c22699x3dcdb352.setVisibility(4);
        if (!z17) {
            c22699x3dcdb352.setLayoutParams(layoutParams);
            viewGroup.addView(c22699x3dcdb352);
            c22699x3dcdb352.post(new ht2.l(pVar, c22699x3dcdb352));
            return;
        }
        c22699x3dcdb352.setLayoutParams(new android.widget.LinearLayout.LayoutParams(dimension, dimension));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.addView(c22699x3dcdb352);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        int f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        textView.setPadding(f17, context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561249d9), f17, 0);
        textView.setGravity(17);
        textView.setVisibility(4);
        textView.setShadowLayer(20.0f, 0.0f, 8.0f, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90));
        textView.setText(r6Var.f559094l);
        textView.setTextSize(0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb));
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        linearLayout.addView(textView);
        viewGroup.addView(linearLayout);
        linearLayout.post(new ht2.m(pVar, textView, c22699x3dcdb352));
    }

    public final al5.v aj(java.util.Map map, android.content.res.Resources resources, boolean z17, int i17, boolean z18, yz5.a aVar) {
        boolean z19;
        java.lang.String str;
        al5.v vVar;
        java.lang.Integer num;
        zy2.k6 ij6 = ij(map, resources);
        int i18 = z17 ? ij6.f558970c : ij6.f558969b;
        android.util.Size size = ij6.f558971d;
        int width = size.getWidth() == 0 ? i17 : size.getWidth();
        int height = size.getHeight() == 0 ? i17 : size.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/res/FinderDynamicIconResService", "getIconSpan", "(Ljava/util/Map;Landroid/content/res/Resources;ZIZLkotlin/jvm/functions/Function0;)Lcom/tencent/mm/ui/widget/FixAlphaImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/res/FinderDynamicIconResService", "getIconSpan", "(Ljava/util/Map;Landroid/content/res/Resources;ZIZLkotlin/jvm/functions/Function0;)Lcom/tencent/mm/ui/widget/FixAlphaImageSpan;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        cu2.f0 f0Var = cu2.f0.f303924a;
        java.lang.String str2 = ij6.f558968a;
        r45.rl2 a17 = f0Var.a(str2);
        boolean z27 = r26.i0.y(str2, "http://", false) || r26.i0.y(str2, "https://", false);
        if (a17 == null) {
            z19 = true;
            str = z27 ? str2 : null;
        } else if (z17) {
            str = a17.m75945x2fec8307(2);
            z19 = true;
        } else {
            z19 = true;
            str = a17.m75945x2fec8307(1);
        }
        boolean z28 = ij6.f558973f;
        boolean z29 = ij6.f558972e;
        boolean z37 = (!z27 || (!z17 && z29) || (z17 && z28)) ? z19 : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicIconResService", "[getIconSpan] needDye:" + z37 + " isRemoteURL:" + z27 + " isDark:" + z17 + " hasLightColor:" + z29 + " hasDarkColor:" + z28);
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(resources, createBitmap);
        if (z37) {
            cj(bitmapDrawable, i18);
            bitmapDrawable.setBounds(0, 0, width, height);
            vVar = new al5.v(bitmapDrawable, 2);
            vVar.f87605f = str2;
        } else {
            bitmapDrawable.setBounds(0, 0, width, height);
            vVar = new al5.v(bitmapDrawable, 2);
        }
        al5.v vVar2 = vVar;
        java.util.Map map2 = this.f366473d;
        if (z18 && str != null && z37 && (num = (java.lang.Integer) map2.get(str2)) != null) {
            android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, num.intValue(), i18);
            e17.setBounds(0, 0, width, height);
            e17.draw(new android.graphics.Canvas(bitmapDrawable.getBitmap()));
        }
        if (str != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicIconResService", "[getIconSpan] url=".concat(str));
            mn2.g1 g1Var = mn2.g1.f411508a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.f411486d));
            ht2.x xVar = new ht2.x(bitmapDrawable, z27, i18, this, aVar);
            b17.getClass();
            b17.f529406d = xVar;
            b17.a();
            return vVar2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicIconResService", "[getIconSpan] no server data, use local res, dynamicImage=".concat(str2));
        java.lang.Integer num2 = (java.lang.Integer) map2.get(str2);
        if (num2 == null) {
            return vVar2;
        }
        android.graphics.drawable.Drawable e18 = com.p314xaae8f345.mm.ui.uk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, num2.intValue(), i18);
        e18.setBounds(0, 0, width, height);
        al5.v vVar3 = new al5.v(e18, 2);
        vVar3.f87605f = str2;
        return vVar3;
    }

    public final android.text.style.ForegroundColorSpan bj(java.util.Map map, android.content.res.Resources resources, int i17) {
        java.lang.Object m143895xf1229813;
        java.lang.String str = (java.lang.String) map.get("._wc_custom_link_.$color");
        if (str != null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Integer.valueOf(hj(str)));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                m143895xf1229813 = null;
            }
            java.lang.Integer num = (java.lang.Integer) m143895xf1229813;
            if (num != null) {
                i17 = num.intValue();
            }
        }
        return new android.text.style.ForegroundColorSpan(i17);
    }

    public final android.graphics.drawable.Drawable cj(android.graphics.drawable.Drawable drawable, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        if (i17 == 0) {
            drawable.mutate().setColorFilter(null);
            return drawable;
        }
        int argb = android.graphics.Color.argb(255, android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17));
        int alpha = android.graphics.Color.alpha(i17);
        drawable.mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(argb, android.graphics.PorterDuff.Mode.SRC_ATOP));
        drawable.setAlpha(alpha);
        return drawable;
    }

    public final void fj(java.lang.String str, boolean z17, yz5.p pVar) {
        r45.rl2 a17 = cu2.f0.f303924a.a(str);
        boolean z18 = true;
        java.lang.String m75945x2fec8307 = a17 != null ? z17 ? a17.m75945x2fec8307(1) : a17.m75945x2fec8307(2) : null;
        if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
            z18 = false;
        }
        if (z18) {
            pm0.v.X(new ht2.l0(pVar));
            return;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.f411486d));
        ht2.k0 k0Var = new ht2.k0(pVar, m75945x2fec8307);
        b17.getClass();
        b17.f529406d = k0Var;
        b17.a();
    }

    public final int hj(java.lang.String colorString) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colorString, "colorString");
        nf5.a a17 = nf5.b.f418417a.a(colorString);
        if (a17 != null) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                java.lang.String str = a17.f418416c;
                if (str.length() > 0) {
                    return hc2.l.l(str);
                }
            }
            return hc2.l.l(a17.f418415b);
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\s");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(colorString).replaceAll("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        java.util.List f07 = r26.n0.f0(replaceAll, new java.lang.String[]{","}, false, 0, 6, null);
        if (f07.size() == 1) {
            return hc2.l.l((java.lang.String) kz5.n0.X(f07));
        }
        if (f07.size() >= 2) {
            return hc2.l.l((java.lang.String) f07.get(com.p314xaae8f345.mm.ui.bk.C() ? 1 : 0));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.DynamicIconResService", "fail to parseDynamicColorString: ".concat(colorString));
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zy2.k6 ij(java.util.Map r12, android.content.res.Resources r13) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ht2.y0.ij(java.util.Map, android.content.res.Resources):zy2.k6");
    }

    public android.text.SpannableString mj(java.lang.CharSequence richText, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(richText, "richText");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicIconResService", "parseRichText: richText=" + ((java.lang.Object) richText) + " textSize=" + i17);
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources();
        boolean z18 = com.p314xaae8f345.mm.ui.bk.C() || z17;
        int K = r26.n0.K(richText, '<', 0, false, 6, null);
        int K2 = r26.n0.K(richText, '>', 0, false, 6, null);
        if (K < 0 || K2 < 0 || K2 <= K) {
            return new android.text.SpannableString(richText);
        }
        java.util.Map nj6 = nj(this, richText, 0, 0, 6, null);
        if (nj6.isEmpty()) {
            return new android.text.SpannableString(richText);
        }
        java.lang.CharSequence b07 = r26.n0.b0(richText, K, K2 + 1, "$$");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(resources);
        al5.v aj6 = aj(nj6, resources, z18, i17, false, null);
        android.text.SpannableString spannableString = new android.text.SpannableString(b07);
        spannableString.setSpan(aj6, K, K + 2, 33);
        return spannableString;
    }

    public final void oj(android.view.ViewGroup viewGroup, r45.tl2 tl2Var, java.lang.String str, zy2.r6 r6Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(viewGroup.getContext());
        linearLayout.setTag("playLikeFloatPagView");
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(um3.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        pf5.e.m158343xd39de650((pf5.e) a17, null, null, new ht2.p0(tl2Var, this, linearLayout, str, viewGroup, c0Var, c0Var2, r6Var, null), 3, null);
    }

    public final void qj(android.widget.ImageView imageView, zy2.q6 q6Var) {
        r45.bm2 bm2Var = q6Var.f559077c;
        imageView.setVisibility(q6Var.f559076b > 0 ? 0 : 8);
        if (bm2Var != null) {
            java.lang.String m75945x2fec8307 = bm2Var.m75945x2fec8307(18);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                mn2.g1 g1Var = mn2.g1.f411508a;
                g1Var.e().c(new mn2.q3(bm2Var.m75945x2fec8307(18), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), imageView, g1Var.h(mn2.f1.f411486d));
                imageView.setColorFilter(i65.a.d(imageView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an), android.graphics.PorterDuff.Mode.SRC_ATOP);
                return;
            }
        }
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79777xe843128, imageView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
        imageView.setEnabled(false);
    }

    public final void rj(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, zy2.r6 r6Var) {
        android.graphics.drawable.Drawable e17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = r6Var.f559091i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicIconResService", "[setIconInTimeLineFeedLikeDefault] ".concat(pm0.v.u(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L)));
        c22699x3dcdb352.setAlpha(1.0f);
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        boolean z17 = r6Var.f559084b;
        int i17 = com.p314xaae8f345.mm.R.raw.f79317x4f94063f;
        boolean z18 = true;
        if (z17) {
            c22699x3dcdb352.setTag(1);
            android.content.res.Resources resources = c22699x3dcdb352.getContext().getResources();
            if (!r6Var.f559086d) {
                i17 = com.p314xaae8f345.mm.R.raw.f79160x8dce826e;
            }
            e17 = m95.a.e(resources, i17, 0.0f);
        } else {
            c22699x3dcdb352.setTag(0);
            android.content.res.Resources resources2 = c22699x3dcdb352.getContext().getResources();
            if (!r6Var.f559086d) {
                i17 = com.p314xaae8f345.mm.R.raw.f79161x66488b13;
            }
            e17 = m95.a.e(resources2, i17, 0.0f);
        }
        r45.bm2 bm2Var = r6Var.f559090h;
        mn2.g1 g1Var = mn2.g1.f411508a;
        int i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30;
        java.lang.String str = null;
        if (bm2Var == null || r6Var.f559088f || r6Var.f559089g || r6Var.f559086d) {
            c22699x3dcdb352.setLayerPaint(null);
            c22699x3dcdb352.m82040x7541828(0);
            r45.bm2 bm2Var2 = r6Var.f559090h;
            java.lang.String m75945x2fec8307 = bm2Var2 != null ? bm2Var2.m75945x2fec8307(14) : null;
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z18 = false;
            }
            if (z18 || r6Var.f559086d || r6Var.f559088f) {
                if (!r6Var.f559084b || r6Var.f559086d) {
                    android.content.res.Resources resources3 = c22699x3dcdb352.getContext().getResources();
                    if (!r6Var.f559087e) {
                        i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6;
                    }
                    c22699x3dcdb352.m82040x7541828(resources3.getColor(i18));
                } else {
                    c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
                }
                c22699x3dcdb352.setImageDrawable(e17);
            } else {
                yo0.i h17 = g1Var.h(mn2.f1.f411502w);
                h17.f545635g = com.p314xaae8f345.mm.R.C30861xcebc809e.f563165c44;
                vo0.d e18 = g1Var.e();
                if (!r6Var.f559087e || C) {
                    r45.bm2 bm2Var3 = r6Var.f559090h;
                    if (bm2Var3 != null) {
                        str = bm2Var3.m75945x2fec8307(14);
                    }
                } else {
                    r45.bm2 bm2Var4 = r6Var.f559090h;
                    if (bm2Var4 != null) {
                        str = bm2Var4.m75945x2fec8307(13);
                    }
                }
                e18.b(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), h17).c(c22699x3dcdb352);
            }
        } else {
            java.lang.String m75945x2fec83072 = r6Var.f559084b ? (!r6Var.f559087e || C) ? bm2Var.m75945x2fec8307(7) : bm2Var.m75945x2fec8307(8) : (!r6Var.f559087e || C) ? bm2Var.m75945x2fec8307(14) : bm2Var.m75945x2fec8307(13);
            c22699x3dcdb352.setLayerPaint(null);
            c22699x3dcdb352.m82040x7541828(0);
            if (m75945x2fec83072 != null && m75945x2fec83072.length() != 0) {
                z18 = false;
            }
            if (z18) {
                if (r6Var.f559084b) {
                    c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
                } else {
                    android.content.res.Resources resources4 = c22699x3dcdb352.getContext().getResources();
                    if (!r6Var.f559087e) {
                        i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6;
                    }
                    c22699x3dcdb352.m82040x7541828(resources4.getColor(i18));
                }
                c22699x3dcdb352.setImageDrawable(e17);
            } else {
                yo0.i h18 = g1Var.h(mn2.f1.f411502w);
                h18.f545635g = com.p314xaae8f345.mm.R.C30861xcebc809e.f563165c44;
                g1Var.e().b(new mn2.q3(m75945x2fec83072, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), h18).c(c22699x3dcdb352);
            }
        }
        if (r6Var.f559083a || !r6Var.f559093k) {
            c22699x3dcdb352.m82040x7541828(i65.a.d(c22699x3dcdb352.getContext(), r6Var.f559087e ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77644xad7ef2b : com.p314xaae8f345.mm.R.C30859x5a72f63.f560521mr));
        }
    }

    public void sj(android.widget.ImageView iv6, zy2.r6 iConfig, android.graphics.drawable.Drawable defaultIcon) {
        r45.dm2 m76806xdef68064;
        r45.vl2 vl2Var;
        r45.ql2 ql2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iv6, "iv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iConfig, "iConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultIcon, "defaultIcon");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = iConfig.f559091i;
        java.lang.String m75945x2fec8307 = (c19792x256d2725 == null || (m76806xdef68064 = c19792x256d2725.m76806xdef68064()) == null || (vl2Var = (r45.vl2) m76806xdef68064.m75936x14adae67(27)) == null || (ql2Var = (r45.ql2) vl2Var.m75936x14adae67(0)) == null) ? null : ql2Var.m75945x2fec8307(2);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            iv6.setImageDrawable(defaultIcon);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec8307);
            fj(m75945x2fec8307, true, new ht2.w0(iv6, defaultIcon));
        }
    }

    public void tj(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b pagView, zy2.r6 iConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagView, "pagView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iConfig, "iConfig");
        cq.k1.a();
        pagView.o(((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.Z0().r()).booleanValue());
        java.lang.String str = iConfig.f559085c == 1 ? "finder_heart_like_hot.pag" : "finder_heart_like.pag";
        if (pagView.getUseRfx()) {
            pagView.mo82566x3e3ac3e8(com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77390x243906(pagView.getContext().getAssets(), str));
        } else {
            pagView.mo82568x3e3ac3e8(org.p3363xbe4143f1.C29690xfae77312.m154715x243906(pagView.getContext().getAssets(), str));
        }
    }

    public final void uj(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, zy2.n6 n6Var) {
        if (n6Var.f559016c) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79731x8858d8c4);
        } else {
            r45.bm2 bm2Var = n6Var.f559015b;
            if (bm2Var != null) {
                java.lang.String m75945x2fec8307 = bm2Var.m75945x2fec8307(10);
                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    vo0.d e17 = g1Var.e();
                    mn2.q3 q3Var = new mn2.q3(bm2Var.m75945x2fec8307(10), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c22699x3dcdb352, "null cannot be cast to non-null type android.widget.ImageView");
                    e17.c(q3Var, c22699x3dcdb352, g1Var.h(mn2.f1.B));
                }
            }
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79668x47e8ad96);
        }
        c22699x3dcdb352.setLayerPaint(null);
        c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 vj(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        r45.zz3 zz3Var;
        r45.zz3 zz3Var2;
        r45.zz3 zz3Var3;
        r45.vl2 vl2Var;
        r45.ul2 ul2Var;
        org.json.JSONObject mo12245xcc313de3;
        r45.vl2 vl2Var2;
        r45.wl2 wl2Var;
        org.json.JSONObject mo12245xcc313de32;
        r45.vl2 vl2Var3;
        r45.ql2 ql2Var;
        org.json.JSONObject mo12245xcc313de33;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        java.lang.String str = null;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Nd).mo141623x754a37bb()).r()).intValue() == 1) {
            c19792x256d2725.m76899x71cce6d8(null);
        }
        java.lang.String u17 = pm0.v.u(c19792x256d2725.m76784x5db1b11());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedId=");
        sb6.append(u17);
        sb6.append(" icon=");
        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
        sb6.append((m76806xdef68064 == null || (vl2Var3 = (r45.vl2) m76806xdef68064.m75936x14adae67(27)) == null || (ql2Var = (r45.ql2) vl2Var3.m75936x14adae67(0)) == null || (mo12245xcc313de33 = ql2Var.mo12245xcc313de3()) == null) ? null : ht2.z0.a(mo12245xcc313de33));
        sb6.append("\nwording=");
        r45.dm2 m76806xdef680642 = c19792x256d2725.m76806xdef68064();
        sb6.append((m76806xdef680642 == null || (vl2Var2 = (r45.vl2) m76806xdef680642.m75936x14adae67(27)) == null || (wl2Var = (r45.wl2) vl2Var2.m75936x14adae67(1)) == null || (mo12245xcc313de32 = wl2Var.mo12245xcc313de3()) == null) ? null : ht2.z0.a(mo12245xcc313de32));
        sb6.append("\npag=");
        r45.dm2 m76806xdef680643 = c19792x256d2725.m76806xdef68064();
        sb6.append((m76806xdef680643 == null || (vl2Var = (r45.vl2) m76806xdef680643.m75936x14adae67(27)) == null || (ul2Var = (r45.ul2) vl2Var.m75936x14adae67(2)) == null || (mo12245xcc313de3 = ul2Var.mo12245xcc313de3()) == null) ? null : ht2.z0.a(mo12245xcc313de3));
        sb6.append("\ncarouselWording=");
        r45.dm2 m76806xdef680644 = c19792x256d2725.m76806xdef68064();
        sb6.append((m76806xdef680644 == null || (zz3Var3 = (r45.zz3) m76806xdef680644.m75936x14adae67(41)) == null) ? null : zz3Var3.m75945x2fec8307(4));
        sb6.append("\ntoastWording=");
        r45.dm2 m76806xdef680645 = c19792x256d2725.m76806xdef68064();
        sb6.append((m76806xdef680645 == null || (zz3Var2 = (r45.zz3) m76806xdef680645.m75936x14adae67(41)) == null) ? null : zz3Var2.m75945x2fec8307(0));
        sb6.append("\neducationWording=");
        r45.dm2 m76806xdef680646 = c19792x256d2725.m76806xdef68064();
        if (m76806xdef680646 != null && (zz3Var = (r45.zz3) m76806xdef680646.m75936x14adae67(41)) != null) {
            str = zz3Var.m75945x2fec8307(2);
        }
        sb6.append(str);
        sb6.append('\n');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicIconResService", sb6.toString());
        return c19792x256d2725;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wi(android.view.ViewGroup r17, android.view.View r18, android.view.View r19, zy2.r6 r20, yz5.l r21) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ht2.y0.wi(android.view.ViewGroup, android.view.View, android.view.View, zy2.r6, yz5.l):void");
    }
}
