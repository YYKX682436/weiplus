package bm2;

/* loaded from: classes3.dex */
public final class v2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: e, reason: collision with root package name */
    public int f103909e;

    /* renamed from: g, reason: collision with root package name */
    public r45.js1 f103911g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f103912h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f103908d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f103910f = 1;

    /* renamed from: i, reason: collision with root package name */
    public final int f103913i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561214ch);

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103908d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        ((bm2.t2) this.f103908d.get(i17)).getClass();
        return 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        bm2.q2 holder = (bm2.q2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (!(holder instanceof bm2.r2)) {
            if (holder instanceof bm2.s2) {
                bm2.s2 s2Var = (bm2.s2) holder;
                int i18 = this.f103909e;
                s2Var.f103822d.setText(s2Var.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.den, java.lang.Integer.valueOf(i18 > 0 ? i18 : 0)));
                return;
            }
            return;
        }
        bm2.r2 r2Var = (bm2.r2) holder;
        r45.fq1 fq1Var = ((bm2.t2) this.f103908d.get(i17)).f103840a;
        java.lang.String str = null;
        r45.xn1 xn1Var = fq1Var != null ? (r45.xn1) fq1Var.m75936x14adae67(0) : null;
        r2Var.f103800d.setText(java.lang.String.valueOf(i17 + 1));
        int measuredWidth = (r2Var.f3639x46306858.getMeasuredWidth() - r2Var.f103800d.getMeasuredWidth()) - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        r2Var.f103802f.setVisibility(xn1Var != null && xn1Var.m75939xb282bd08(7) == 3 ? 0 : 8);
        if (r2Var.f103802f.getVisibility() == 0) {
            measuredWidth -= r2Var.f103802f.getMeasuredWidth();
        }
        java.util.List<android.text.style.UpdateLayout> r17 = gm2.c1.r(gm2.c1.f354853a, xn1Var != null ? xn1Var.m75941xfb821914(11) : null, new int[]{12, 4}, gm2.c2.f354883i, null, 0, r2Var.f103803g, null, 0, 0, null, null, 2008, null);
        if (r17.isEmpty()) {
            mm2.x0 x0Var = mm2.c1.f410306y6;
            java.util.LinkedList m75941xfb821914 = xn1Var != null ? xn1Var.m75941xfb821914(11) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((xn1Var == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76184x8010e5e4());
            sb6.append(",bindFansItem");
            x0Var.b(m75941xfb821914, sb6.toString());
        } else {
            for (android.text.style.UpdateLayout updateLayout : r17) {
                gm2.y1 y1Var = updateLayout instanceof gm2.y1 ? (gm2.y1) updateLayout : null;
                measuredWidth -= y1Var != null ? y1Var.a() : 0;
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(gm2.c1.f354853a.o(r17).concat(" "));
        java.util.Iterator it = r17.iterator();
        int i19 = 0;
        while (it.hasNext()) {
            int i27 = i19 + 1;
            f0Var.c((android.text.style.ImageSpan) it.next(), i19, i27, 33);
            i19 = i27;
        }
        r2Var.f103803g.setText(f0Var);
        if (this.f103910f == 1) {
            r2Var.f103804h.setText(java.lang.String.valueOf(xn1Var != null ? java.lang.Long.valueOf(xn1Var.m75942xfb822ef2(13)) : null));
        } else {
            r2Var.f103804h.setText(java.lang.String.valueOf(xn1Var != null ? java.lang.Long.valueOf(xn1Var.m75942xfb822ef2(15)) : null));
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(r2Var.f103804h.getMeasuredWidth());
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        int intValue = measuredWidth - (valueOf != null ? valueOf.intValue() : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj));
        if (intValue > 0) {
            r2Var.f103801e.setMaxWidth(intValue);
        } else {
            r2Var.f103801e.setMaxWidth(this.f103913i);
        }
        android.widget.TextView textView = r2Var.f103801e;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (xn1Var != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null) {
            str = c19782x23db1cfa.m76184x8010e5e4();
        }
        float textSize = r2Var.f103801e.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        r2Var.f3639x46306858.setOnClickListener(new bm2.u2(this, xn1Var));
        android.widget.TextView textView2 = r2Var.f103805i;
        r45.js1 js1Var = this.f103911g;
        int m75939xb282bd08 = js1Var != null ? js1Var.m75939xb282bd08(8) : 0;
        r45.js1 js1Var2 = this.f103911g;
        int m75939xb282bd082 = js1Var2 != null ? js1Var2.m75939xb282bd08(6) : -1;
        if (i17 != m75939xb282bd08 - 1 || m75939xb282bd08 <= 1 || m75939xb282bd082 < 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lu_, java.lang.String.valueOf(m75939xb282bd082)));
        }
        zl2.r4.f555483a.M2("FinderLiveFansListAdapter", "bindFansItem nicknameMaxWidth:" + intValue);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqg, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new bm2.s2(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqf, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        return new bm2.r2(this, inflate2);
    }
}
