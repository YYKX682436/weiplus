package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* renamed from: com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic */
/* loaded from: classes8.dex */
public class C17263x2beb5636 implements p012xc85e97e9.p093xedfae76a.x, kd0.p2 {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f240180d;

    /* renamed from: g, reason: collision with root package name */
    public final kd0.n2 f240183g;

    /* renamed from: h, reason: collision with root package name */
    public kd0.o2 f240184h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.y f240185i;

    /* renamed from: n, reason: collision with root package name */
    public int f240187n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f240188o;

    /* renamed from: e, reason: collision with root package name */
    public r45.aq3 f240181e = null;

    /* renamed from: f, reason: collision with root package name */
    public final r45.aq3 f240182f = new r45.aq3();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f240186m = new java.util.HashMap();

    public C17263x2beb5636(android.content.Context context) {
        new p012xc85e97e9.p093xedfae76a.j0();
        this.f240188o = false;
        this.f240180d = context;
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636 c17263x2beb5636, r45.aq3 aq3Var) {
        c17263x2beb5636.getClass();
        if (aq3Var != null && !android.text.TextUtils.isEmpty(aq3Var.f451738n)) {
            try {
                java.lang.String optString = new org.json.JSONObject(aq3Var.f451738n).optString(dm.i4.f66875xa013b0d5);
                if (android.text.TextUtils.isEmpty(optString) || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.z3(optString)) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeSheetItemLogic", "try preloadWxaAttrs username:%s, scene:%d", optString, java.lang.Integer.valueOf(c17263x2beb5636.f240187n));
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17259x62269d70 c17259x62269d70 = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17259x62269d70();
                c17259x62269d70.f240148g = optString;
                c17259x62269d70.e();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public android.view.View b(android.view.View.OnClickListener onClickListener, int i17, java.lang.String str, int i18) {
        this.f240187n = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.g1 g1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.g1(this, i18, onClickListener);
        return this.f240181e == null ? f(g1Var, i17, str) : g(g1Var);
    }

    public android.view.View c(android.view.View.OnClickListener onClickListener, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357, int i17) {
        this.f240187n = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.h1(this, i17, onClickListener);
        if (this.f240181e != null) {
            return g(h1Var);
        }
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanCodeSheetItemLogic", "createQRCodeMenuItemDefault return null,  list is null or empty");
            return null;
        }
        if (c17261xe88a6357 != null) {
            return f(h1Var, c17261xe88a6357.f240153e, c17261xe88a6357.f240152d);
        }
        if (list.size() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a63572 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) list.get(0);
            return f(h1Var, c17261xe88a63572.f240153e, c17261xe88a63572.f240152d);
        }
        java.lang.String m17 = m(list);
        dl5.a aVar = new dl5.a(this.f240180d);
        aVar.setOnClickListener(h1Var);
        aVar.m124773x53bfe316(m17);
        return aVar;
    }

    public void d(int i17, java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, db5.g4 g4Var, int i18) {
        r45.aq3 aq3Var = this.f240181e;
        boolean z17 = false;
        if (aq3Var == null || !(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(aq3Var.f451732e, str) || this.f240181e == this.f240182f)) {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.e(i17, str)) {
                g4Var.g(i18, l(i17, str), com.p314xaae8f345.mm.R.raw.f80274xa3990f3);
                return;
            }
            db5.h4 h4Var = new db5.h4(g4Var.f309879f, i18, 0);
            h4Var.f309898f = true;
            ((java.util.ArrayList) g4Var.f309877d).add(h4Var);
            return;
        }
        r45.aq3 aq3Var2 = this.f240181e;
        if (aq3Var2 != null && (aq3Var2.f451739o & 1) != 0) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanCodeSheetItemLogic", "qrcode banned: %s, remove menu: %d", str, java.lang.Integer.valueOf(i18));
            g4Var.removeItem(i18);
            return;
        }
        if (aq3Var2.f451731d != 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aq3Var2.f451736i)) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.d(i17, str) || com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.h(i17, str) || com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.l(i17, str) || com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.n(i17, str)) {
                g4Var.h(i18, this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_2), com.p314xaae8f345.mm.R.raw.f80274xa3990f3, this.f240180d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                return;
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.o(i17, str)) {
                g4Var.h(i18, this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_4), com.p314xaae8f345.mm.R.raw.f80274xa3990f3, this.f240180d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                return;
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.k(i17, str)) {
                g4Var.h(i18, this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_1), com.p314xaae8f345.mm.R.raw.f80359x70a7cd6a, this.f240180d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                return;
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.m(i17, str)) {
                g4Var.h(i18, this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_3), com.p314xaae8f345.mm.R.raw.f80253x783ef38e, this.f240180d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                return;
            }
            java.lang.CharSequence string = this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_2);
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.b(i17)) {
                string = this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_0);
            }
            g4Var.h(i18, string, com.p314xaae8f345.mm.R.raw.f80274xa3990f3, this.f240180d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            return;
        }
        r45.aq3 aq3Var3 = this.f240181e;
        java.lang.String str2 = aq3Var3.f451736i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.f1 f1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.f1(this, i18);
        k0Var.F = f1Var;
        k0Var.E = f1Var;
        int i19 = aq3Var3.f451734g;
        if (i19 == 4) {
            g4Var.q(i18, str2, this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8p), 0, 0);
            return;
        }
        if (i19 == 3) {
            g4Var.q(i18, str2, this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574454i93), 0, 0);
            return;
        }
        if (i19 == 11) {
            if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
                g4Var.q(i18, str2, this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pbr), 0, 0);
                return;
            } else {
                k0Var.F = null;
                g4Var.h(i18, this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_2), com.p314xaae8f345.mm.R.raw.f80274xa3990f3, this.f240180d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                return;
            }
        }
        if (i19 == 1) {
            g4Var.q(i18, str2, this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574458ia1), 0, 0);
            return;
        }
        if (i19 == 2) {
            g4Var.q(i18, str2, this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9u), 0, this.f240180d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            return;
        }
        if (i19 != 7) {
            if (i19 == 6) {
                g4Var.q(i18, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574457ia0), this.f240181e.f451736i), this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_z), 0, this.f240180d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                return;
            } else if (i19 == 5) {
                g4Var.q(i18, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iap), this.f240181e.f451736i), this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iao), 0, this.f240180d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                return;
            } else {
                if (i19 == 9) {
                    g4Var.q(i18, str2, this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9i), 0, 0);
                    return;
                }
                return;
            }
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.String str3 = str2 + " ";
        spannableStringBuilder.append((java.lang.CharSequence) str3);
        java.lang.String str4 = "@" + this.f240181e.f451738n;
        spannableStringBuilder.append((java.lang.CharSequence) str4);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(this.f240180d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7)), str3.length(), str3.length() + str4.length(), 33);
        g4Var.q(i18, spannableStringBuilder, this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ib7), 0, 0);
    }

    public void e(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, db5.g4 g4Var, int i17) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() <= 1) {
            d(((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) arrayList.get(0)).f240153e, ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) arrayList.get(0)).f240152d, k0Var, g4Var, i17);
        } else if (c17261xe88a6357 != null) {
            d(c17261xe88a6357.f240153e, c17261xe88a6357.f240152d, k0Var, g4Var, i17);
        } else {
            g4Var.g(i17, m(arrayList), com.p314xaae8f345.mm.R.raw.f80274xa3990f3);
        }
    }

    public final android.view.View f(android.view.View.OnClickListener onClickListener, int i17, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2749xdcc86614.C22660xcf62c98b c22660xcf62c98b = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2749xdcc86614.C22660xcf62c98b(this.f240180d);
        c22660xcf62c98b.f293072h.clearAnimation();
        c22660xcf62c98b.f293068d.setVisibility(8);
        c22660xcf62c98b.f293071g.setVisibility(8);
        c22660xcf62c98b.f293069e.setVisibility(8);
        c22660xcf62c98b.f293072h.setVisibility(0);
        android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        c22660xcf62c98b.f293072h.startAnimation(rotateAnimation);
        c22660xcf62c98b.setOnClickListener(onClickListener);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.o(i17, str)) {
            c22660xcf62c98b.m81535x54a3ca71().setImageResource(com.p314xaae8f345.mm.R.raw.f78370x999efabe);
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9l));
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.d(i17, str)) {
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9m));
            c22660xcf62c98b.m81535x54a3ca71().setImageDrawable(null);
            c22660xcf62c98b.m81535x54a3ca71().setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563611ay3);
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.l(i17, str)) {
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9q));
            c22660xcf62c98b.m81535x54a3ca71().setImageDrawable(null);
            c22660xcf62c98b.m81535x54a3ca71().setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77712x682bd8ec);
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.h(i17, str)) {
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9o));
            c22660xcf62c98b.m81535x54a3ca71().setImageDrawable(null);
            c22660xcf62c98b.m81535x54a3ca71().setImageResource(com.p314xaae8f345.mm.R.raw.f78927x4fa27c71);
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.n(i17, str)) {
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9s));
            c22660xcf62c98b.m81535x54a3ca71().setImageDrawable(null);
            c22660xcf62c98b.m81535x54a3ca71().setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77712x682bd8ec);
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.k(i17, str)) {
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9p));
            android.widget.ImageView m81535x54a3ca71 = c22660xcf62c98b.m81535x54a3ca71();
            android.content.Context context = this.f240180d;
            m81535x54a3ca71.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f80355x647eb351, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19)));
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.m(i17, str)) {
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9r));
            android.widget.ImageView m81535x54a3ca712 = c22660xcf62c98b.m81535x54a3ca71();
            android.content.Context context2 = this.f240180d;
            m81535x54a3ca712.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context2, com.p314xaae8f345.mm.R.raw.f79589x22296205, context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao)));
        } else {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.g(i17, str)) {
                java.lang.String string = this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574462ia5);
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.b(i17)) {
                    string = this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574461ia4);
                }
                dl5.a aVar = new dl5.a(this.f240180d);
                aVar.setOnClickListener(onClickListener);
                aVar.m124773x53bfe316(string);
                return aVar;
            }
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9n));
            c22660xcf62c98b.m81535x54a3ca71().setImageDrawable(null);
            c22660xcf62c98b.m81535x54a3ca71().setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563611ay3);
        }
        return c22660xcf62c98b;
    }

    public final android.view.View g(android.view.View.OnClickListener onClickListener) {
        r45.aq3 aq3Var = this.f240181e;
        if ((aq3Var == null || (aq3Var.f451739o & 1) == 0) ? false : true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanCodeSheetItemLogic", "qrcode banned, remove menu");
            return null;
        }
        if (aq3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanCodeSheetItemLogic", "qrcode mCodeInfoRespItem is null, remove menu");
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2749xdcc86614.C22660xcf62c98b c22660xcf62c98b = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2749xdcc86614.C22660xcf62c98b(this.f240180d);
        c22660xcf62c98b.f293072h.clearAnimation();
        c22660xcf62c98b.f293072h.setVisibility(8);
        c22660xcf62c98b.f293068d.setVisibility(0);
        c22660xcf62c98b.f293069e.setVisibility(0);
        c22660xcf62c98b.f293071g.setVisibility(0);
        r45.aq3 aq3Var2 = this.f240181e;
        if (aq3Var2.f451731d != 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aq3Var2.f451736i)) {
            c22660xcf62c98b.f293074m.setVisibility(4);
            c22660xcf62c98b.f293073i.setVisibility(0);
            c22660xcf62c98b.setOnClickListener(onClickListener);
            return c22660xcf62c98b;
        }
        c22660xcf62c98b.m81538x53bfe316(this.f240181e.f451736i);
        c22660xcf62c98b.setOnClickListener(onClickListener);
        o11.f fVar = new o11.f();
        fVar.f423612c = true;
        c22660xcf62c98b.m81535x54a3ca71().setBackground(null);
        c22660xcf62c98b.m81535x54a3ca71().setImageDrawable(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeSheetItemLogic", "mCodeInfoRespItem.UrlType: " + this.f240181e.f451734g);
        int i17 = this.f240181e.f451734g;
        if (i17 == 4) {
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9l));
            fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78370x999efabe;
            fVar.f423629t = true;
            n11.a.b().h(this.f240181e.f451737m, c22660xcf62c98b.m81535x54a3ca71(), fVar.a());
        } else if (i17 == 3) {
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9m));
            fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.f563611ay3;
            fVar.f423629t = true;
            n11.a.b().h(this.f240181e.f451737m, c22660xcf62c98b.m81535x54a3ca71(), fVar.a());
        } else if (i17 == 11) {
            if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
                c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pbq));
                fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.f563611ay3;
                fVar.f423629t = true;
                n11.a.b().h(this.f240181e.f451737m, c22660xcf62c98b.m81535x54a3ca71(), fVar.a());
            } else {
                c22660xcf62c98b.f293074m.setVisibility(4);
                c22660xcf62c98b.f293073i.setVisibility(0);
            }
        } else if (i17 == 1) {
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9q));
            fVar.f423624o = com.p314xaae8f345.mm.R.C30859x5a72f63.f77712x682bd8ec;
            n11.a.b().h(this.f240181e.f451737m, c22660xcf62c98b.m81535x54a3ca71(), fVar.a());
        } else if (i17 == 2) {
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9o));
            c22660xcf62c98b.m81535x54a3ca71().setImageResource(com.p314xaae8f345.mm.R.raw.f78927x4fa27c71);
        } else if (i17 == 7) {
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9s));
            c22660xcf62c98b.m81535x54a3ca71().setImageDrawable(null);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f240181e.f451738n)) {
                c22660xcf62c98b.m81536x51ee2988(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("@%s", this.f240181e.f451738n));
            }
            fVar.f423624o = com.p314xaae8f345.mm.R.C30859x5a72f63.f77712x682bd8ec;
            n11.a.b().h(this.f240181e.f451737m, c22660xcf62c98b.m81535x54a3ca71(), fVar.a());
        } else if (i17 == 6) {
            c22660xcf62c98b.m81538x53bfe316(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574457ia0), this.f240181e.f451736i));
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9p));
            android.widget.ImageView m81535x54a3ca71 = c22660xcf62c98b.m81535x54a3ca71();
            android.content.Context context = this.f240180d;
            m81535x54a3ca71.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f80355x647eb351, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m)));
        } else if (i17 == 5) {
            c22660xcf62c98b.m81538x53bfe316(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iap), this.f240181e.f451736i));
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9r));
            android.widget.ImageView m81535x54a3ca712 = c22660xcf62c98b.m81535x54a3ca71();
            android.content.Context context2 = this.f240180d;
            m81535x54a3ca712.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context2, com.p314xaae8f345.mm.R.raw.f79589x22296205, context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao)));
        } else if (i17 == 9) {
            c22660xcf62c98b.m81537xf9fefa7a(this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9n));
            fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.f563611ay3;
            fVar.f423629t = true;
            n11.a.b().h(this.f240181e.f451737m, c22660xcf62c98b.m81535x54a3ca71(), fVar.a());
        } else {
            c22660xcf62c98b.f293074m.setVisibility(4);
            c22660xcf62c98b.f293073i.setVisibility(0);
        }
        return c22660xcf62c98b;
    }

    public void h(int i17, java.lang.String str) {
        i(i17, new kd0.f2(str));
    }

    public void i(int i17, kd0.f2 f2Var) {
        this.f240181e = null;
        java.lang.String trim = f2Var.f388167a.trim();
        f2Var.f388167a = trim;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
            return;
        }
        if (this.f240185i == null) {
            this.f240185i = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.y();
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.e(i17, trim)) {
            this.f240185i.a(i17, f2Var).a(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.c1(this, trim));
        }
    }

    public void j(int i17, kd0.f2 f2Var, long j17) {
        this.f240188o = true;
        this.f240181e = null;
        ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.ScanCodeSheetItemLogic");
        java.lang.String str = f2Var.f388167a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (this.f240185i == null) {
            this.f240185i = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.y();
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.e(i17, str)) {
            if (j17 > 0) {
                ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.ScanCodeSheetItemLogic");
                ((ku5.t0) ku5.t0.f394148d).l(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.e1(this, str), j17, "MicroMsg.ScanCodeSheetItemLogic");
            }
            this.f240185i.a(i17, f2Var).a(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.b1(this, str));
        }
    }

    public void k(int i17, kd0.f2 f2Var, kd0.n2 n2Var) {
        this.f240181e = null;
        java.lang.String str = f2Var.f388167a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (this.f240185i == null) {
            this.f240185i = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.y();
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.e(i17, str)) {
            this.f240185i.a(i17, f2Var).a(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.a1(this, str, n2Var));
        }
    }

    public java.lang.String l(int i17, java.lang.String str) {
        return !com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.b(i17) ? this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_0) : this.f240180d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_2);
    }

    public java.lang.String m(java.util.List list) {
        boolean z17;
        boolean z18 = false;
        int i17 = 0;
        boolean z19 = false;
        boolean z27 = false;
        boolean z28 = false;
        while (true) {
            z17 = true;
            if (i17 >= list.size()) {
                break;
            }
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) list.get(i17)).f240152d;
            int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) list.get(i17)).f240153e;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.o(i18, str)) {
                z28 = true;
            } else if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.b(i18)) {
                z19 = true;
            } else {
                z27 = true;
            }
            i17++;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("识别图中");
        if (z19) {
            sb6.append("二维码");
            z18 = true;
        }
        if (z27) {
            if (z18) {
                sb6.append(" / ");
            }
            sb6.append("条码");
        } else {
            z17 = z18;
        }
        if (z28) {
            if (z17) {
                sb6.append(" / ");
            }
            sb6.append("小程序码");
        }
        return sb6.toString();
    }

    public void n() {
        ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.ScanCodeSheetItemLogic");
        this.f240181e = null;
        this.f240188o = false;
    }

    public void o(int i17, byte[] bArr) {
        r45.aq3 aq3Var = new r45.aq3();
        if (i17 != 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            aq3Var.f451731d = -1;
        } else {
            try {
                aq3Var.mo11468x92b714fd(bArr);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aq3Var.f451737m) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aq3Var.f451736i)) {
                    aq3Var.f451731d = -1;
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanCodeSheetItemLogic", "parse exception: s%", e17.getMessage());
                aq3Var.f451731d = -1;
            }
        }
        this.f240181e = aq3Var;
        kd0.n2 n2Var = this.f240183g;
        if (n2Var != null) {
            n2Var.a();
        }
    }

    public C17263x2beb5636(android.content.Context context, kd0.n2 n2Var) {
        new p012xc85e97e9.p093xedfae76a.j0();
        this.f240188o = false;
        this.f240180d = context;
        this.f240183g = n2Var;
    }

    public C17263x2beb5636(android.content.Context context, kd0.o2 o2Var) {
        new p012xc85e97e9.p093xedfae76a.j0();
        this.f240188o = false;
        this.f240180d = context;
        this.f240184h = o2Var;
    }

    public C17263x2beb5636(android.content.Context context, kd0.o2 o2Var, p012xc85e97e9.p093xedfae76a.y yVar) {
        new p012xc85e97e9.p093xedfae76a.j0();
        this.f240188o = false;
        this.f240180d = context;
        this.f240184h = o2Var;
        yVar.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic.1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onDestroyed */
            public void m68526x7495d2fa() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636.this.f240184h = null;
            }
        });
    }
}
