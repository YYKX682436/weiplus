package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class k80 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final zl2.u4 f200355d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f200356e;

    /* renamed from: f, reason: collision with root package name */
    public final int f200357f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f200358g;

    public k80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 pluginLayout, zl2.u4 uiMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        this.f200355d = uiMode;
        this.f200356e = new java.util.ArrayList();
        this.f200357f = 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f200356e).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f80) ((java.util.ArrayList) this.f200356e).get(i17)).f199860a;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        r45.px1 px1Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.lang.String m76197x6c03c64c;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (!(holder instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j80) || (px1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f80) ((java.util.ArrayList) this.f200356e).get(i17)).f199861b) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j80 j80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j80) holder;
        j80Var.f200266e.setText(java.lang.String.valueOf(i17));
        java.lang.String str = px1Var.f464989h;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        j80Var.f200269h.setText(str);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        r45.xn1 xn1Var = px1Var.f464985d;
        java.lang.String m76184x8010e5e4 = (xn1Var == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76184x8010e5e4();
        android.widget.TextView textView = j80Var.f200267f;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, m76184x8010e5e4, textSize));
        boolean z17 = px1Var.f464990i;
        android.widget.TextView textView2 = j80Var.f200268g;
        if (z17) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oul);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            int i18 = px1Var.f464986e;
            java.lang.String string2 = i18 == 1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ouh, px1Var.f464988g, string, java.lang.Integer.valueOf(i18)) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oug, px1Var.f464988g, string, java.lang.Integer.valueOf(i18));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            android.text.SpannableString spannableString = new android.text.SpannableString(string2);
            int parseColor = android.graphics.Color.parseColor("#4dffffff");
            int L = r26.n0.L(string2, string, 0, false, 6, null);
            if (L != -1) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(parseColor), L, string.length() + L, 33);
            }
            textView2.setText(spannableString);
        } else {
            int i19 = px1Var.f464986e;
            textView2.setText(i19 == 1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nvo, px1Var.f464988g, java.lang.Integer.valueOf(i19)) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nvn, px1Var.f464988g, java.lang.Integer.valueOf(i19)));
        }
        android.view.View view = j80Var.f3639x46306858;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k80 k80Var = j80Var.f200271m;
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h80(k80Var, px1Var));
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.O2;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "1");
        r45.xn1 xn1Var2 = px1Var.f464985d;
        if (xn1Var2 != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) != null && (m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c()) != null) {
            str2 = m76197x6c03c64c;
        }
        gVar.h("rank_username", str2);
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        j80Var.f3639x46306858.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i80(px1Var, j80Var, k80Var));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 0) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ebz, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g80(this, inflate);
        }
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ebx, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.j80(this, inflate2);
    }
}
