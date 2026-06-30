package hc2;

/* loaded from: classes2.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f361848a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().heightPixels;

    /* renamed from: b, reason: collision with root package name */
    public static final android.graphics.Rect f361849b = new android.graphics.Rect();

    /* renamed from: c, reason: collision with root package name */
    public static long f361850c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f361851d = jz5.h.b(hc2.a1.f361835d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f361852e = jz5.h.b(hc2.c1.f361838d);

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f361853f;

    static {
        cq.k1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        f361853f = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209446r8).mo141623x754a37bb()).r()).booleanValue() && (com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A());
    }

    public static final void A(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        try {
            textView.setTypeface(android.graphics.Typeface.createFromAsset(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets(), "fonts/SF-Pro-Display-BoldItalic.otf"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderExt", "setTypeface() Exception:" + e17.getMessage());
        }
    }

    public static final void B(android.content.Context context, java.lang.String wording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        db5.t7.f(context, wording, hc2.d1.f361845a);
    }

    public static final void C(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (context instanceof android.app.Activity) {
            if (((android.app.Activity) context).isFinishing() || !k0Var.i()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "context is finishing or not showing :" + k0Var.i());
            } else {
                try {
                    k0Var.j();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("FinderExt", "", e17);
                }
            }
        }
    }

    public static final void D(com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 c22803x544dcce2, int i17, java.lang.String source, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c22803x544dcce2, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        if (c22803x544dcce2.getProgress() != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "[refreshPostProgress] source:" + source + " progress:" + c22803x544dcce2.getProgress() + " postProgress:" + i17);
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(c22803x544dcce2.getProgress(), i17);
            ofInt.addUpdateListener(new hc2.e1(c22803x544dcce2));
            android.animation.ValueAnimator duration = ofInt.setDuration(400L);
            if (duration != null) {
                duration.start();
            }
        }
    }

    public static final void E(android.widget.TextView textView, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a.a().r()).booleanValue()) {
            textView.setTextSize(0, i65.a.h(textView.getContext(), i17));
            if (z17) {
                textView.setTextColor(b3.l.m9702x7444d5ad(textView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
            } else {
                textView.setTextColor(b3.l.m9702x7444d5ad(textView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
            }
            com.p314xaae8f345.mm.ui.fk.c(textView);
        }
    }

    public static /* synthetic */ void F(android.widget.TextView textView, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        E(textView, i17, z17);
    }

    public static jz5.l a(android.app.Activity activity, float f17, int i17, java.lang.String str, long j17, int i18, int i19, int i27, java.lang.Object obj) {
        int i28;
        java.lang.String str2 = (i27 & 4) != 0 ? "" : str;
        int i29 = (i27 & 16) != 0 ? 0 : i18;
        int i37 = (i27 & 32) != 0 ? 0 : i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "<this>");
        boolean z17 = activity.getResources().getConfiguration().orientation == 1;
        jz5.g gVar = f361852e;
        if (i37 == 0) {
            android.graphics.Point b17 = f361853f ? com.p314xaae8f345.mm.ui.bl.b(activity) : new android.graphics.Point(activity.getResources().getDisplayMetrics().widthPixels, activity.getResources().getDisplayMetrics().heightPixels);
            i37 = ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue() ? b17.x : activity.getResources().getConfiguration().orientation == 1 ? b17.x : b17.y;
        }
        int h17 = com.p314xaae8f345.mm.ui.bl.h(activity);
        int a17 = com.p314xaae8f345.mm.ui.bl.a(activity) + h17;
        int intValue = i17 - ((java.lang.Number) ((jz5.n) f361851d).mo141623x754a37bb()).intValue();
        float f18 = i17;
        float f19 = i37;
        float f27 = (f18 * 1.0f) / f19;
        float f28 = ((intValue - a17) * 1.0f) / f19;
        float f29 = (intValue * 1.0f) / f19;
        boolean z18 = z17;
        float f37 = ((intValue - h17) * 1.0f) / f19;
        float f38 = 0.45f * f18;
        int b18 = a06.d.b(0.05f * f18);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = new jz5.o(0, 0, 17);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var2.f391656d = new jz5.l(java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i37));
        boolean z19 = (i29 & 1) != 0;
        if (java.lang.Float.isNaN(f17)) {
            b(h0Var2, i37, i37);
            c(h0Var, a17, 0, 48);
            pm0.z.b(xy2.b.f539688b, "calculateMedia_radio_error", false, null, null, false, false, new hc2.b1(str2, j17), 60, null);
            i28 = -2;
        } else if (z19 || ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue()) {
            if (z19) {
                if (f17 >= f27) {
                    b(h0Var2, a06.d.b(f18 / f17), i17);
                } else {
                    b(h0Var2, i37, a06.d.b(f19 * f17));
                }
                c(h0Var, 0, 0, 17);
                i28 = -100;
            } else {
                if (f17 >= f27) {
                    b(h0Var2, a06.d.b(f18 / f17), i17);
                } else {
                    b(h0Var2, i37, a06.d.b(f19 * f17));
                }
                c(h0Var, 0, 0, 17);
                i28 = -1;
            }
        } else if (f17 >= f27) {
            b(h0Var2, i37, a06.d.b(f19 * f17));
            c(h0Var, 0, 0, 17);
            i28 = 1;
        } else if (f29 < f17) {
            b(h0Var2, a06.d.b(f18 / f17), i17);
            c(h0Var, 0, 0, 17);
            i28 = 2;
        } else if (f28 < f17) {
            b(h0Var2, i37, intValue);
            c(h0Var, 0, 0, 48);
            i28 = 3;
        } else {
            float f39 = f19 * f17;
            if (f38 - (f39 / 2) >= a17) {
                b(h0Var2, i37, a06.d.b(f39));
                c(h0Var, -b18, 0, 17);
                i28 = 4;
            } else if (f28 <= f17 || f17 < 1.7777778f) {
                b(h0Var2, i37, a06.d.b(f39));
                c(h0Var, h17, 0, 48);
                i28 = 6;
            } else {
                b(h0Var2, i37, a06.d.b(f19 * f37));
                c(h0Var, h17, 0, 48);
                i28 = 5;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateMediaLayoutParams: decorView[");
        sb6.append(activity.getWindow().getDecorView().getWidth());
        sb6.append('x');
        sb6.append(activity.getWindow().getDecorView().getHeight());
        sb6.append("] displayMetrics[");
        sb6.append(activity.getResources().getDisplayMetrics().widthPixels);
        sb6.append('x');
        sb6.append(activity.getResources().getDisplayMetrics().heightPixels);
        sb6.append("] \nrealDisplay[");
        sb6.append(com.p314xaae8f345.mm.ui.bl.b(activity));
        sb6.append("] screenHeight=[");
        sb6.append(i37);
        sb6.append('x');
        sb6.append(i17);
        sb6.append("]@");
        sb6.append(f27);
        sb6.append(" RATIOS[screen=");
        java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f27)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        sb6.append(format);
        sb6.append(" video=");
        java.lang.String format2 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        sb6.append(format2);
        sb6.append("  \navatarTopBar=");
        java.lang.String format3 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f28)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format3, "format(...)");
        sb6.append(format3);
        sb6.append(" avatarScreen=");
        java.lang.String format4 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(f29)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format4, "format(...)");
        sb6.append(format4);
        sb6.append("]  \nsource=");
        sb6.append(i28);
        sb6.append(" OUTPUT[parent[topMargin=");
        sb6.append(((java.lang.Number) ((jz5.o) h0Var.f391656d).f384374d).intValue());
        sb6.append(" bottomMargin=");
        sb6.append(((java.lang.Number) ((jz5.o) h0Var.f391656d).f384375e).intValue());
        sb6.append(" gravity=");
        sb6.append(((java.lang.Number) ((jz5.o) h0Var.f391656d).f384376f).intValue());
        sb6.append("] child[width=");
        sb6.append(((java.lang.Number) ((jz5.l) h0Var2.f391656d).f384366d).intValue());
        sb6.append(" height=");
        sb6.append(((java.lang.Number) ((jz5.l) h0Var2.f391656d).f384367e).intValue());
        sb6.append("]]  \nisPortrait=");
        sb6.append(z18);
        sb6.append(" tag=");
        sb6.append(str2);
        sb6.append(" feedId=");
        sb6.append(pm0.v.u(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", sb6.toString());
        return new jz5.l(h0Var.f391656d, h0Var2.f391656d);
    }

    public static final void b(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17, int i18) {
        h0Var.f391656d = new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public static final void c(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17, int i18, int i19) {
        h0Var.f391656d = new jz5.o(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public static final void d(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209212ec).mo141623x754a37bb()).r()).intValue() == 1) {
            x(view);
        }
    }

    public static final void e(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209212ec).mo141623x754a37bb()).r()).intValue() == 1) {
            view.performHapticFeedback(0);
        }
    }

    public static final java.lang.String f(android.text.TextPaint textPaint, java.lang.String str, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPaint, "<this>");
        if (str == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return str == null ? "" : str;
        }
        try {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            ((ke0.e) xVar).getClass();
            android.text.SpannableString i19 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str);
            if (new android.text.StaticLayout(i19, 0, i19.length(), textPaint, i18, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
                return str;
            }
            java.lang.String substring = str.substring(0, new android.text.StaticLayout(i19, 0, i19.length(), textPaint, i17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineEnd(0));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            return substring.concat("…");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderExt", th6, "ellipseText: ".concat(str), new java.lang.Object[0]);
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0233, code lost:
    
        if ((r1 != null && r1.getHasBgmInfo()) == false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0308 A[LOOP:2: B:49:0x0124->B:65:0x0308, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x031d A[EDGE_INSN: B:66:0x031d->B:67:0x031d BREAK  A[LOOP:2: B:49:0x0124->B:65:0x0308], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r37, int r38, int r39, java.util.Set r40) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hc2.f1.g(androidx.recyclerview.widget.RecyclerView, int, int, java.util.Set):com.tencent.mm.plugin.finder.assist.p0");
    }

    public static final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 h(android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 h17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<this>");
        int childCount = viewGroup.getChildCount();
        int i17 = 0;
        while (true) {
            if (i17 >= childCount) {
                return null;
            }
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt != null) {
                if (childAt instanceof com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) {
                    return (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) childAt;
                }
                android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
                if (viewGroup2 != null && (h17 = h(viewGroup2)) != null) {
                    return h17;
                }
            }
            i17++;
        }
    }

    public static final android.view.View i(android.view.ViewGroup viewGroup, int i17, java.lang.Object tag) {
        android.view.View i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        int childCount = viewGroup.getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = viewGroup.getChildAt(i19);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, childAt.getTag(i17))) {
                return childAt;
            }
            if ((childAt instanceof android.view.ViewGroup) && (i18 = i((android.view.ViewGroup) childAt, i17, tag)) != null) {
                return i18;
            }
        }
        return null;
    }

    public static final int j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, boolean z17, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        if (!z17) {
            return i17;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = c1163xf1deaba4.q0(i17, false);
        android.view.View view = q07 != null ? q07.f3639x46306858 : null;
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        }
        return rect.height() >= (view != null ? view.getHeight() : 0) / 2 ? i17 : j(c1163xf1deaba4, true, i17 + i18, i18);
    }

    public static final java.lang.String k(android.widget.TextView textView, android.content.Context context, int i17, java.lang.String str, int i18) {
        int length;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (i18 <= 0 || str == null) {
            return str;
        }
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(str, 0, str.length(), textView.getPaint(), i17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
        if (staticLayout.getLineCount() < i18) {
            return str;
        }
        if (i18 > 1) {
            i19 = staticLayout.getLineEnd(i18 - 2);
            length = staticLayout.getLineEnd(i18 - 1);
        } else {
            length = str.length();
            i19 = 0;
        }
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ctg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.text.StaticLayout staticLayout2 = new android.text.StaticLayout(str, i19, length, textView.getPaint(), (int) (i17 - textView.getPaint().measureText(string)), android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
        if (staticLayout2.getLineCount() <= 0) {
            return str;
        }
        java.lang.String substring = str.substring(0, staticLayout2.getLineEnd(0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring.concat(string);
    }

    public static final java.util.List l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa, int i17, yz5.l lVar) {
        int i18 = 0;
        if (lVar == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i19 = 0;
            for (java.lang.Object obj : c13920xa5f564aa) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (i19 >= i17) {
                    arrayList.add(obj);
                }
                i19 = i27;
            }
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : c13920xa5f564aa) {
            int i28 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var = (so2.j5) obj2;
            if (i18 >= i17 && ((java.lang.Boolean) lVar.mo146xb9724478(j5Var)).booleanValue()) {
                arrayList2.add(j5Var);
            }
            i18 = i28;
        }
        return arrayList2;
    }

    public static final java.util.List m(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (i17 < 0 || i18 < 0 || i17 > i18) {
            return kz5.n0.V0(linkedList);
        }
        java.lang.Object mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        if (mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19;
            java.util.List m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820();
            if (i17 <= i18) {
                while (true) {
                    int a07 = i17 - c22848x6ddd90cf.a0();
                    if (a07 >= 0 && a07 < m82898xfb7e5820.size()) {
                        in5.c cVar = (in5.c) m82898xfb7e5820.get(a07);
                        if (cVar.mo2128x1ed62e84() != 0 && (cVar instanceof so2.j5)) {
                            fc2.r rVar = new fc2.r((so2.j5) cVar, a07, null, 4, null);
                            in5.v0 v0Var = (in5.v0) c22848x6ddd90cf.f295254z.get(cVar.mo2128x1ed62e84());
                            if (v0Var != null) {
                                rVar.f342512c = v0Var;
                            }
                            linkedList.add(rVar);
                        }
                    }
                    if (i17 == i18) {
                        break;
                    }
                    i17++;
                }
            }
        } else if (mo7946xf939df19 instanceof zy2.fc) {
            zy2.fc fcVar = (zy2.fc) mo7946xf939df19;
            java.util.List mo58957xfb7e5820 = fcVar.mo58957xfb7e5820();
            if (i17 <= i18) {
                while (true) {
                    int n17 = fcVar.n(i17);
                    if (n17 >= 0 && n17 < mo58957xfb7e5820.size()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) mo58957xfb7e5820.get(n17);
                        if (abstractC14490x69736cb5.mo2128x1ed62e84() != 0) {
                            linkedList.add(new fc2.r(abstractC14490x69736cb5, n17, null, 4, null));
                        }
                    }
                    if (i17 == i18) {
                        break;
                    }
                    i17++;
                }
            }
        }
        return kz5.n0.V0(linkedList);
    }

    public static final int n(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        int height = view.getHeight();
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        return (height > 0 || view2 == null) ? height : o(view, view2).y;
    }

    public static final android.graphics.Point o(android.view.View view, android.view.View parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 0), android.view.View.MeasureSpec.makeMeasureSpec(parent.getHeight(), 0));
        return new android.graphics.Point(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static final int p(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        android.graphics.Rect rect = new android.graphics.Rect();
        textView.getPaint().getTextBounds("全", 0, 1, rect);
        return rect.width();
    }

    public static final android.graphics.Rect q(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        return new android.graphics.Rect(i17, iArr[1], view.getWidth() + i17, iArr[1] + view.getHeight());
    }

    public static final int r(android.widget.TextView textView, int i17) {
        if (textView != null && textView.getVisibility() == 0) {
            return ((int) textView.getPaint().measureText(textView.getText().toString())) + i17;
        }
        return 0;
    }

    public static final jz5.l s(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, boolean z17) {
        int w17;
        int y17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        if (layoutManager == null) {
            return new jz5.l(-1, -1);
        }
        if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager;
            java.lang.Integer j07 = kz5.z.j0(c1164x587b7ff1.u(null));
            w17 = j07 != null ? j07.intValue() : 0;
            java.lang.Integer h07 = kz5.z.h0(c1164x587b7ff1.v(null));
            y17 = h07 != null ? h07.intValue() : 0;
        } else {
            if (!(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de)) {
                return new jz5.l(-1, -1);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            w17 = c1162x665295de.w();
            y17 = c1162x665295de.y();
        }
        int j17 = j(c1163xf1deaba4, z17, w17, 1);
        int j18 = j(c1163xf1deaba4, z17, y17, -1);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (w17 <= y17) {
            int i17 = w17;
            while (true) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c1163xf1deaba4.p0(i17);
                in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                android.view.View m8007x6a486239 = layoutManager.m8007x6a486239(i17);
                if (m8007x6a486239 != null) {
                    boolean z18 = m8007x6a486239.isShown() && m8007x6a486239.getAlpha() > 0.0f && m8007x6a486239.getLocalVisibleRect(rect);
                    java.lang.Object obj = s0Var != null ? s0Var.f374658i : null;
                    if ((!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && !(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5) && obj != null) || !z18) {
                        if (i17 == w17) {
                            j17++;
                        } else {
                            j18--;
                        }
                    }
                }
                if (i17 == y17) {
                    break;
                }
                i17++;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "profileScroll realFirstVisibleItemPosition: " + j17 + ", realLastVisibleItemPosition: " + j18);
        return new jz5.l(java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(j18));
    }

    public static final int t(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        int width = view.getWidth();
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        return (width > 0 || view2 == null) ? width : o(view, view2).x;
    }

    public static final int u(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        return view2 != null ? o(view, view2).y : view.getHeight();
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 v(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.content.Intent data, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 feedLoader, boolean z17, yz5.l lVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedLoader, "feedLoader");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        feedLoader.m56360xaa9b1fab(data);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56352x4d6f2425 = feedLoader.m56352x4d6f2425();
        if (!(mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) || m56352x4d6f2425 == null) {
            return null;
        }
        java.util.ArrayList arrayList = m56352x4d6f2425.f189833a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList) || (gVar = m56352x4d6f2425.f189834b) == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19;
        int a07 = c22848x6ddd90cf.a0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56387xe6796cde = feedLoader.m56387xe6796cde();
        java.util.List l17 = l(m56387xe6796cde, 0, lVar);
        if (l17.size() != arrayList.size()) {
            java.util.Iterator it = l17.iterator();
            while (it.hasNext()) {
                m56387xe6796cde.remove((so2.j5) it.next());
            }
            m56387xe6796cde.addAll(arrayList);
            if (z17) {
                feedLoader.m56377x73095078(gVar);
            }
            c22848x6ddd90cf.m8146xced61ae5();
        }
        int i18 = m56352x4d6f2425.f189835c;
        if (i18 >= 0) {
            if (((so2.j5) kz5.n0.a0(arrayList, i18)) != null) {
                java.util.Iterator it6 = m56387xe6796cde.iterator();
                i17 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it6.next();
                    if (j5Var.mo2128x1ed62e84() == j5Var.mo2128x1ed62e84()) {
                        break;
                    }
                    i17++;
                }
            } else {
                i17 = 0;
            }
            if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                arrayList2.add(java.lang.Integer.valueOf(i17 + a07));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c1164x587b7ff1, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ext/FinderViewExtKt", "mergeBackCacheAndNotify", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Intent;Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;ZLkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/feed/model/LoaderCache;", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c1164x587b7ff1.O(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.f(c1164x587b7ff1, "com/tencent/mm/plugin/finder/ext/FinderViewExtKt", "mergeBackCacheAndNotify", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Intent;Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;ZLkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/feed/model/LoaderCache;", "Undefined", "scrollToPositionWithOffset", "(II)V");
            } else if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                arrayList3.add(java.lang.Integer.valueOf(i17 + a07));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(c1162x665295de, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ext/FinderViewExtKt", "mergeBackCacheAndNotify", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Intent;Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;ZLkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/feed/model/LoaderCache;", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c1162x665295de.P(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue());
                yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/finder/ext/FinderViewExtKt", "mergeBackCacheAndNotify", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Intent;Lcom/tencent/mm/plugin/finder/feed/model/internal/BaseFeedLoader;ZLkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/feed/model/LoaderCache;", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "mergeBackCacheAndNotify, pos:" + i18 + ", headCount:" + a07);
        return m56352x4d6f2425;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 w(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.content.Intent data, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 feedLoader, boolean z17, yz5.l lVar, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        if ((i17 & 8) != 0) {
            lVar = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedLoader, "feedLoader");
        feedLoader.m56360xaa9b1fab(data);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 m56352x4d6f2425 = feedLoader.m56352x4d6f2425();
        if (m56352x4d6f2425 == null) {
            return null;
        }
        java.util.ArrayList arrayList = m56352x4d6f2425.f189833a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList) || (gVar = m56352x4d6f2425.f189834b) == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56387xe6796cde = feedLoader.m56387xe6796cde();
        java.util.List l17 = l(m56387xe6796cde, 0, lVar);
        if (l17.size() != arrayList.size()) {
            java.util.Iterator it = l17.iterator();
            while (it.hasNext()) {
                m56387xe6796cde.remove((so2.j5) it.next());
            }
            m56387xe6796cde.addAll(arrayList);
            if (z17) {
                feedLoader.m56377x73095078(gVar);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
        }
        return m56352x4d6f2425;
    }

    public static final void x(android.view.View view) {
        if (view != null) {
            view.performHapticFeedback(4);
        }
    }

    public static void y(android.widget.TextView textView, int i17, int i18, int i19, boolean z17, int i27, java.lang.Object obj) {
        java.lang.String o17;
        if ((i27 & 4) != 0) {
            i19 = 2;
        }
        if ((i27 & 8) != 0) {
            z17 = false;
        }
        android.content.Context context = textView != null ? textView.getContext() : null;
        if (context == null) {
            return;
        }
        if (i18 == 0) {
            textView.setVisibility(8);
            return;
        }
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        if (i19 == 1) {
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.i(i18);
        } else {
            o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.o(i18, z17);
        }
        textView.setText(context.getResources().getString(i17, o17));
    }

    public static final void z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emoji, yz5.l shorterEdgeTransform, yz5.l longerEdgeTransform) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c15276x168ec665, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emoji, "emoji");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shorterEdgeTransform, "shorterEdgeTransform");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(longerEdgeTransform, "longerEdgeTransform");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(emoji.mo42937x755bd410());
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : emoji.b0();
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(emoji.mo42931x1c4fb41d());
        java.lang.Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
        int intValue2 = num != null ? num.intValue() : emoji.t1();
        int min = java.lang.Math.min(intValue, intValue2);
        int max = java.lang.Math.max(intValue, intValue2);
        if (min == 0 || max == 0) {
            return;
        }
        float f17 = min;
        float f18 = max;
        int intValue3 = ((java.lang.Number) longerEdgeTransform.mo146xb9724478(java.lang.Integer.valueOf((int) ((((java.lang.Number) shorterEdgeTransform.mo146xb9724478(java.lang.Integer.valueOf(min))).intValue() / f17) * f18)))).intValue();
        int i17 = (int) (f17 * (intValue3 / f18));
        android.view.ViewGroup.LayoutParams layoutParams = c15276x168ec665.getLayoutParams();
        c15276x168ec665.m62015x86c391e1(intValue3);
        c15276x168ec665.m62016x93dd6bcf(i17);
        if (min == intValue) {
            layoutParams.width = i17;
            layoutParams.height = intValue3;
        } else {
            layoutParams.width = intValue3;
            layoutParams.height = i17;
        }
        c15276x168ec665.setLayoutParams(layoutParams);
    }
}
