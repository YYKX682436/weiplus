package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 f235074a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f235075b;

    /* renamed from: c, reason: collision with root package name */
    public r45.wl f235076c;

    /* renamed from: d, reason: collision with root package name */
    public sr3.g f235077d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 f235078e;

    /* renamed from: f, reason: collision with root package name */
    public qk.o f235079f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f235080g;

    /* renamed from: h, reason: collision with root package name */
    public final int f235081h;

    /* renamed from: i, reason: collision with root package name */
    public jz5.l f235082i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f235083j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.ViewGroup f235084k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f235085l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235086m;

    /* renamed from: n, reason: collision with root package name */
    public int f235087n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f235088o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f235089p;

    /* renamed from: q, reason: collision with root package name */
    public int f235090q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f235091r;

    /* renamed from: s, reason: collision with root package name */
    public int f235092s;

    /* renamed from: t, reason: collision with root package name */
    public int f235093t;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, r45.wl wlVar, sr3.g config, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var, qk.o oVar, java.lang.String pageId) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageId, "pageId");
        this.f235074a = context;
        this.f235075b = z3Var;
        this.f235076c = wlVar;
        this.f235077d = config;
        this.f235078e = m0Var;
        this.f235079f = oVar;
        this.f235080g = pageId;
        int ordinal = config.g().ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = this.f235075b;
            i17 = z3Var2 != null && z3Var2.n2() ? 0 : 1;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            i17 = 5;
        }
        this.f235081h = i17;
        sr3.a g17 = this.f235077d.g();
        sr3.a aVar = sr3.a.f493363f;
        if (g17 == aVar && this.f235077d.a() && ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).wj()) {
            if (this.f235077d.g() == aVar) {
                try {
                    tk.s[] sVarArr = tk.s.f501403d;
                    ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Ni(2).h("BrandProfileInteractionRedDot", new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.i(this));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BizProfileMenuController", "subscribeInteractionRedDotEvent error: " + e17.getMessage());
                }
            }
            a();
        }
        this.f235082i = new jz5.l("", "");
        this.f235088o = true;
    }

    public final void a() {
        if (this.f235077d.g() != sr3.a.f493363f) {
            return;
        }
        int i17 = this.f235093t + 1;
        this.f235093t = i17;
        try {
            tk.s[] sVarArr = tk.s.f501403d;
            ((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Ni(2).b(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m4.IAM_BIZ_PERSONAL_CENTER_RED_DOT_SCENE_PROFILE, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.b(i17, this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BizProfileMenuController", "fetchInteractionRedDotCount error: " + e17.getMessage());
        }
    }

    public final android.widget.TextView b(android.view.View view, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        android.widget.TextView textView = (android.widget.TextView) view.findViewWithTag("interaction_badge");
        if (textView == null) {
            textView = new android.widget.TextView(this.f235074a);
            textView.setTag("interaction_badge");
            textView.setTextColor(textView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            textView.setGravity(17);
            textView.setIncludeFontPadding(false);
            textView.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.a(textView.getContext()));
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(1, c22699x3dcdb352.getId());
            layoutParams.addRule(6, c22699x3dcdb352.getId());
            layoutParams.leftMargin = i65.a.b(this.f235074a, 32);
            layoutParams.topMargin = i65.a.b(this.f235074a, 4);
            android.view.ViewParent parent = c22699x3dcdb352.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.addView(textView, layoutParams);
            }
        }
        return textView;
    }

    public final void c() {
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235075b;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(z3Var != null ? z3Var.d1() : null, true);
        if (n17 == null) {
            n17 = this.f235075b;
        }
        this.f235075b = n17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this.f235074a, 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e(this);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.g(this);
        k0Var.v();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = this.f235075b;
        java.lang.String d17 = z3Var2 != null ? z3Var2.d1() : null;
        if (d17 == null) {
            d17 = "";
        }
        gr3.e.d(d17, 600, this.f235077d.c(), this.f235074a.getIntent(), this.f235081h, this.f235077d.b(), 0, null, null, null, 0, 0, 4032, null);
    }

    public final void d(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = this.f235078e;
        if (m0Var != null) {
            if (!(m0Var.f235987f & (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m0Var.f235988g)))) {
                m0Var = null;
            }
            if (m0Var != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this.f235074a);
                u1Var.g(m0Var.f235988g);
                u1Var.n(this.f235074a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ak7));
                u1Var.l(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.h.f235013a);
                u1Var.q(false);
                return;
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235075b;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra("ftsneedkeyboard", true);
        int i17 = z17 ? 261 : this.f235077d.g() == sr3.a.f493363f ? 244 : 136;
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(i17, true, 0);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        hashMap.put("userName", d17);
        hashMap.put("fromProfileTab", java.lang.String.valueOf(this.f235092s));
        r45.wl wlVar = this.f235076c;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wlVar != null ? wlVar.f470776q : null)) {
            r45.wl wlVar2 = this.f235076c;
            hashMap.put("thirdExtParam", wlVar2 != null ? wlVar2.f470776q : null);
        }
        a17.putExtra("rawUrl", su4.r2.e(b17, 0));
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsbizusername", d17);
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = this.f235074a;
        ((c61.l7) b6Var).getClass();
        if (activityC16840x4302a3e2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activityC16840x4302a3e2).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s0.f206873b = nyVar != null ? nyVar.f216915p : null;
        }
        if (this.f235077d.a()) {
            a17.putExtra(com.p314xaae8f345.mm.ui.w2.f292734n, 33723);
            java.lang.String str = com.p314xaae8f345.mm.ui.w2.f292735o;
            byte[] decode = android.util.Base64.decode(((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s.class)).Bi(), 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
            a17.putStringArrayListExtra(str, kz5.c0.d(java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(new java.lang.String(decode, r26.c.f450398a), 0L)), java.lang.String.valueOf((java.lang.Object) 0L), java.lang.String.valueOf((java.lang.Object) 0L), java.lang.String.valueOf(502L), java.lang.String.valueOf(0L)));
            a17.addFlags(67108864);
            gr3.b.f356380a.b(0L, 0L, 501L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, this.f235077d.b(), (r29 & 128) != 0 ? 0 : this.f235081h, (r29 & 256) != 0 ? 0 : 0);
        } else {
            a17.putExtra(com.p314xaae8f345.mm.ui.w2.f292734n, 13307);
            java.lang.String str2 = com.p314xaae8f345.mm.ui.w2.f292735o;
            java.lang.String str3 = d17 == null ? "" : d17;
            int b18 = this.f235077d.b();
            sr3.j y07 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Ai().y0(str3);
            java.lang.String str4 = y07 != null ? y07.f68062x92c1a05e : null;
            a17.putStringArrayListExtra(str2, kz5.c0.d(str3, "3", java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.v.f34316x366c91de), "4", str4 == null ? "" : str4, java.lang.String.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a), java.lang.String.valueOf(b18)));
            a17.addFlags(67108864);
            gr3.e.d(d17 == null ? "" : d17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.n.f34632x366c91de, this.f235077d.c(), this.f235074a.getIntent(), this.f235081h, 0, (this.f235074a.m81210x448cda5d() || (this.f235074a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16852x1460437a)) ? 1 : 0, null, null, null, 0, 0, 3968, null);
        }
        a17.putExtra("ftsbizscene", i17);
        a17.putExtra("ftsInitToSearch", true);
        j45.l.y(this.f235074a, a17);
    }

    public final void e(boolean z17, boolean z18) {
        boolean z19;
        if (!this.f235085l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizProfileMenuController", "contentView not set, skip updateActionBarMenu");
            return;
        }
        if (z18 || z17 != this.f235086m) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = this.f235074a;
            activityC16840x4302a3e2.getClass();
            if (activityC16840x4302a3e2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16852x1460437a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizProfileMenuController", "isDialogStyle");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizProfileMenuController", "updateActionBarMenu  return");
            this.f235086m = z17;
            this.f235074a.m78548x39037dd1();
            boolean z27 = true;
            if (!this.f235088o && !z17 && !this.f235077d.a()) {
                if (!this.f235074a.m81210x448cda5d() && !(this.f235074a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16852x1460437a)) {
                    z27 = false;
                }
                if (z27) {
                    android.view.View view = this.f235083j;
                    if (view != null) {
                        view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n(this));
                        return;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
                        throw null;
                    }
                }
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f235075b;
            if (z3Var != null && z3Var.l2()) {
                if (!this.f235089p) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_biz_photo_search_android, false)) {
                        z19 = true;
                    }
                }
                z19 = false;
            } else {
                z19 = !this.f235089p;
            }
            if (z19) {
                this.f235074a.m78478x84f07bce(1, com.p314xaae8f345.mm.R.C30867xcad56011.jzr, com.p314xaae8f345.mm.R.raw.f78356x618865ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.j(this));
            }
            if (this.f235077d.g() == sr3.a.f493363f && this.f235077d.a() && ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).wj()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e22 = this.f235074a;
                activityC16840x4302a3e22.m78484x84f07bce(9, activityC16840x4302a3e22.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pgs), com.p314xaae8f345.mm.R.raw.f78617x102795f8, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.k(this));
                this.f235091r = true;
                android.view.View view2 = this.f235083j;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
                    throw null;
                }
                view2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.l(this));
            } else {
                this.f235091r = false;
            }
            this.f235074a.m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.b4l, com.p314xaae8f345.mm.R.raw.f78355x20db789a, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.m(this));
        }
    }

    public final void f(android.widget.TextView textView, int i17) {
        if (i17 <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setTextSize(0, i65.a.f(this.f235074a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja) * i65.a.m(this.f235074a));
        if (i17 > 99) {
            textView.setText("");
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f78601xa3931aa1);
        } else {
            textView.setText(java.lang.String.valueOf(i17));
            textView.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(this.f235074a, i17));
        }
    }

    public final void g() {
        com.p314xaae8f345.mm.ui.eb E;
        try {
            com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = this.f235074a.mo78514x143f1b92();
            android.view.View view = (mo78514x143f1b92 == null || (E = mo78514x143f1b92.E(9)) == null) ? null : E.f289918k;
            if (view == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizProfileMenuController", "updateInteractionBadge: normalActionView is null");
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.f564015fq);
            if (c22699x3dcdb352 == null && (c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.f564016fr)) == null) {
                c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.f564017fs);
            }
            if (c22699x3dcdb352 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizProfileMenuController", "updateInteractionBadge: iconView not found");
            } else {
                f(b(view, c22699x3dcdb352), this.f235090q);
                this.f235074a.m78613xf365e75(9, false);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BizProfileMenuController", "updateInteractionBadge error: " + e17.getMessage());
        }
    }

    public final void h(as3.m0 tabType, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabType, "tabType");
        int ordinal = tabType.ordinal();
        int i17 = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                i17 = 5;
                if (ordinal != 2) {
                    i17 = ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? 0 : 7 : 6 : 3;
                }
            } else {
                i17 = z17 ? 4 : 2;
            }
        }
        this.f235092s = i17;
    }
}
