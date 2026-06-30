package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.rl6 f239216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 f239217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.gq f239218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 f239219g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 f239220h;

    public e3(r45.rl6 rl6Var, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 n2Var, r45.gq gqVar, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var) {
        this.f239216d = rl6Var;
        this.f239217e = n2Var;
        this.f239218f = gqVar;
        this.f239219g = h3Var;
        this.f239220h = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.rl6 rl6Var = this.f239216d;
        if (rl6Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 n2Var = this.f239217e;
            n2Var.f239368n.setVisibility(0);
            if (rl6Var.f466520d.size() > 0) {
                r45.hl6 hl6Var = new r45.hl6();
                hl6Var.f457806f = "\u2060";
                hl6Var.f457804d = ((r45.hl6) rl6Var.f466520d.get(0)).f457804d;
                hl6Var.f457807g = ((r45.hl6) rl6Var.f466520d.get(0)).f457807g;
                rl6Var.f466520d.add(hl6Var);
            }
            android.widget.TextView textView = n2Var.f239368n;
            android.graphics.drawable.Drawable drawable = n2Var.f239369o.getDrawable();
            r45.gq gqVar = this.f239218f;
            r45.yt5 yt5Var = gqVar.f456996e;
            java.lang.String str = gqVar.f456999h;
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.d3 d3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.d3(this.f239219g, this.f239220h);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.m(rl6Var)) {
                textView.setClickable(true);
                textView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(textView.getContext()));
            }
            if (yt5Var != null) {
                textView.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.p1());
            }
            android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.f(textView.getContext(), rl6Var, d3Var, bool);
            if (drawable != null) {
                int q17 = (int) (i65.a.q(textView.getContext()) * 16.0f);
                drawable.setBounds(0, 0, com.p314xaae8f345.mm.ui.zk.a(textView.getContext(), q17), com.p314xaae8f345.mm.ui.zk.a(textView.getContext(), q17));
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.k(drawable);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = " ";
                }
                spannableStringBuilder.append((java.lang.CharSequence) str);
                spannableStringBuilder.setSpan(kVar, spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
                spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.q1(d3Var, yt5Var), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
            }
            textView.setText(spannableStringBuilder);
        }
    }
}
