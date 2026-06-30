package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.b2.class)
/* loaded from: classes5.dex */
public final class bl extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.b2 {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.HorizontalScrollView f280367e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f280368f;

    /* renamed from: g, reason: collision with root package name */
    public sb5.a2 f280369g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f280370h = kz5.p0.f395529d;

    /* renamed from: i, reason: collision with root package name */
    public int f280371i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f280372m;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        sb5.a2 a2Var;
        android.widget.HorizontalScrollView horizontalScrollView = this.f280367e;
        if ((horizontalScrollView != null && horizontalScrollView.getVisibility() == 0) && (a2Var = this.f280369g) != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.r2) a2Var).f272128a;
            c19666xfd6e2f33.f271598t = false;
            c19666xfd6e2f33.M1();
        }
        android.widget.HorizontalScrollView horizontalScrollView2 = this.f280367e;
        if (horizontalScrollView2 == null) {
            return;
        }
        horizontalScrollView2.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        java.lang.String x17 = this.f280113d.x();
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(x17)) {
            m0();
            return;
        }
        if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2517x2c0e0b6f.C19980xa712f67c()) == 1)) {
            m0();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutCommandTagComponent", "onChattingInit: WeClaw username=%s", x17);
        android.widget.HorizontalScrollView horizontalScrollView = this.f280367e;
        if ((horizontalScrollView != null ? horizontalScrollView.getParent() : null) == null) {
            android.view.View c17 = this.f280113d.c(com.p314xaae8f345.mm.R.id.bl8);
            if (c17 instanceof android.view.ViewGroup) {
                android.app.Activity g17 = this.f280113d.g();
                android.widget.HorizontalScrollView horizontalScrollView2 = this.f280367e;
                if (horizontalScrollView2 == null) {
                    horizontalScrollView2 = new android.widget.HorizontalScrollView(g17);
                    horizontalScrollView2.setHorizontalScrollBarEnabled(false);
                    horizontalScrollView2.setVerticalScrollBarEnabled(false);
                    horizontalScrollView2.setOverScrollMode(2);
                    horizontalScrollView2.setBackgroundColor(g17.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b, g17.getTheme()));
                    int dimensionPixelSize = g17.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                    horizontalScrollView2.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
                    android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(g17);
                    linearLayout.setOrientation(0);
                    linearLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
                    int dimensionPixelSize2 = g17.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                    linearLayout.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
                    horizontalScrollView2.addView(linearLayout);
                    this.f280367e = horizontalScrollView2;
                    this.f280368f = linearLayout;
                }
                horizontalScrollView2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
                horizontalScrollView2.setVisibility(8);
                ((android.view.ViewGroup) c17).addView(horizontalScrollView2, 0);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShortcutCommandTagComponent", "initView: chatting_foot_bar_container not found or not ViewGroup");
            }
        }
        n0();
    }

    public final void m0() {
        android.widget.HorizontalScrollView horizontalScrollView = this.f280367e;
        if (horizontalScrollView != null) {
            horizontalScrollView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = this.f280368f;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.f280370h = kz5.p0.f395529d;
        sb5.a2 a2Var = this.f280369g;
        if (a2Var != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.r2) a2Var).f272128a;
            c19666xfd6e2f33.f271598t = false;
            c19666xfd6e2f33.M1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.widget.LinearLayout, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.widget.LinearLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public void n0() {
        ?? arrayList;
        android.widget.HorizontalScrollView horizontalScrollView;
        int i17;
        int i18;
        java.lang.String x17 = this.f280113d.x();
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(x17)) {
            m0();
            return;
        }
        int i19 = 0;
        if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2517x2c0e0b6f.C19980xa712f67c()) == 1)) {
            m0();
            return;
        }
        java.lang.String fj6 = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).fj(x17);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fj6);
        kz5.p0 p0Var = kz5.p0.f395529d;
        java.lang.String str = "MicroMsg.ShortcutCommandTagComponent";
        if (K0) {
            arrayList = p0Var;
        } else {
            arrayList = new java.util.ArrayList();
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(fj6);
                int length = jSONArray.length();
                for (int i27 = 0; i27 < length; i27++) {
                    org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i27);
                    if (optJSONObject != null) {
                        java.lang.String optString = optJSONObject.optString("content", "");
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                            int optInt = optJSONObject.optInt(dm.i4.f66865x76d1ec5a, 0);
                            java.lang.String optString2 = optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8(optInt, optString2, optString));
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShortcutCommandTagComponent", e17, "loadCommands: parse failed", new java.lang.Object[0]);
            }
        }
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutCommandTagComponent", "refreshTags: no commands for %s, hide tags", x17);
            this.f280370h = p0Var;
            m0();
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(arrayList, this.f280370h)) {
            android.widget.HorizontalScrollView horizontalScrollView2 = this.f280367e;
            if (horizontalScrollView2 != null && horizontalScrollView2.getVisibility() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutCommandTagComponent", "refreshTags: commands unchanged, skip rebuild");
                sb5.a2 a2Var = this.f280369g;
                if (a2Var != null) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.r2) a2Var).f272128a;
                    c19666xfd6e2f33.f271598t = true;
                    c19666xfd6e2f33.M1();
                    return;
                }
                return;
            }
        }
        this.f280370h = arrayList;
        ?? r07 = this.f280368f;
        if (r07 == 0 || (horizontalScrollView = this.f280367e) == null) {
            return;
        }
        r07.removeAllViews();
        android.app.Activity g17 = this.f280113d.g();
        int dimensionPixelSize = g17.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int dimensionPixelSize2 = g17.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        int dimensionPixelSize3 = g17.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        int dimensionPixelSize4 = g17.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        int dimensionPixelSize5 = g17.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        int dimensionPixelSize6 = g17.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.j_);
        int i28 = (((((int) ((160 * g17.getResources().getDisplayMetrics().density) + 0.5f)) - dimensionPixelSize3) - dimensionPixelSize4) - dimensionPixelSize5) - dimensionPixelSize6;
        float dimension = g17.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3);
        float q17 = i65.a.q(g17);
        if (q17 > 1.0f) {
            dimension *= q17;
        }
        java.util.Iterator it = arrayList.iterator();
        int i29 = 0;
        java.util.List list = arrayList;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i37 = i29 + 1;
            java.lang.String str2 = null;
            if (i29 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8 = (com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8) next;
            java.util.Iterator it6 = it;
            int size = list.size();
            java.lang.String str3 = str;
            android.app.Activity g18 = this.f280113d.g();
            java.util.List list2 = list;
            ?? linearLayout = new android.widget.LinearLayout(g18);
            android.widget.HorizontalScrollView horizontalScrollView3 = horizontalScrollView;
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cxx);
            linearLayout.setPadding(dimensionPixelSize3, 0, dimensionPixelSize4, 0);
            android.widget.TextView textView = new android.widget.TextView(g18);
            int i38 = dimensionPixelSize4;
            java.lang.String str4 = c19510x90fb7cb8.f269613e;
            if (!(!r26.n0.N(str4))) {
                str4 = c19510x90fb7cb8.f269614f;
            }
            java.util.Iterator it7 = r26.n0.Q(str4).iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                ?? next2 = it7.next();
                if (((java.lang.String) next2).length() > 0) {
                    str2 = next2;
                    break;
                }
            }
            java.lang.String str5 = str2;
            if (str5 == null) {
                str5 = (java.lang.String) kz5.n0.X(r26.n0.Q(str4));
            }
            int i39 = dimensionPixelSize3;
            java.lang.String str6 = str5;
            int i47 = dimensionPixelSize;
            if (str6.length() > 20) {
                i17 = 0;
                java.lang.String substring = str6.substring(0, 20);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                str6 = substring.concat("…");
            } else {
                i17 = 0;
            }
            textView.setText(str6);
            textView.setTextSize(i17, dimension);
            textView.setTextColor(g18.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832, g18.getTheme()));
            textView.setMaxLines(1);
            textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            textView.setMaxWidth(i28);
            textView.setIncludeFontPadding(false);
            linearLayout.addView(textView, new android.widget.LinearLayout.LayoutParams(-2, -2));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(g18);
            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f78554x3696c9ff, com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84);
            c22699x3dcdb352.setRotation(270.0f);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(dimensionPixelSize5, dimensionPixelSize5);
            layoutParams.setMarginStart(dimensionPixelSize6);
            layoutParams.gravity = 16;
            c22699x3dcdb352.setLayoutParams(layoutParams);
            linearLayout.addView(c22699x3dcdb352);
            linearLayout.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.al(this, c19510x90fb7cb8, i29, size));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, dimensionPixelSize2);
            if (r07.getChildCount() > 0) {
                i18 = i47;
                marginLayoutParams.leftMargin = i18;
            } else {
                i18 = i47;
            }
            linearLayout.setLayoutParams(marginLayoutParams);
            r07.addView(linearLayout);
            dimensionPixelSize = i18;
            it = it6;
            i29 = i37;
            str = str3;
            list = list2;
            horizontalScrollView = horizontalScrollView3;
            dimensionPixelSize4 = i38;
            dimensionPixelSize3 = i39;
            i19 = 0;
        }
        android.widget.HorizontalScrollView horizontalScrollView4 = horizontalScrollView;
        java.util.List list3 = list;
        java.lang.String str7 = str;
        horizontalScrollView4.setVisibility(i19);
        sb5.a2 a2Var2 = this.f280369g;
        if (a2Var2 != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f332 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.r2) a2Var2).f272128a;
            c19666xfd6e2f332.f271598t = true;
            c19666xfd6e2f332.M1();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str7, "buildTagViews: built %d tags", java.lang.Integer.valueOf(list3.size()));
        this.f280372m = false;
        horizontalScrollView4.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zk(this, list3));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(this.f280113d.x())) {
            m0();
            return;
        }
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2517x2c0e0b6f.C19980xa712f67c()) == 1) {
            n0();
        } else {
            m0();
        }
    }
}
