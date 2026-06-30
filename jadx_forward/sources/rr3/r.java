package rr3;

/* loaded from: classes3.dex */
public final class r extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f480743d;

    /* renamed from: e, reason: collision with root package name */
    public final rr3.z f480744e;

    public r(java.util.LinkedList dataList, rr3.z scopeUIC) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scopeUIC, "scopeUIC");
        this.f480743d = dataList;
        this.f480744e = scopeUIC;
    }

    public static final boolean x(rr3.r rVar, int i17) {
        int i18;
        int i19;
        rVar.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        rr3.z zVar = rVar.f480744e;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.p1962x2ddda8.ActivityC16886xa16edb76) ((jz5.n) zVar.f480758h).mo141623x754a37bb()).U6(), true);
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("NewBizInfoAuthScopeUIC", "showNotifiedMenu:: get %s contact return null", ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.p1962x2ddda8.ActivityC16886xa16edb76) ((jz5.n) zVar.f480758h).mo141623x754a37bb()).U6());
        }
        boolean z17 = false;
        if ((n17 != null && n17.r2()) && n17.m2()) {
            z17 = true;
        }
        if (z17) {
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.nay;
            i19 = com.p314xaae8f345.mm.R.C30867xcad56011.f572481na4;
        } else {
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.bbx;
            i19 = com.p314xaae8f345.mm.R.C30867xcad56011.f572480bc1;
        }
        java.lang.Object obj = rVar.f480743d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) zVar.m80379x76847179(), 1, true);
        java.lang.String string = zVar.m80379x76847179().getResources().getString(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{((r45.tc5) obj).f467844e}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        k0Var.r(format, 17, i65.a.b(zVar.m80379x76847179(), 12), null);
        k0Var.f293405n = new rr3.p(i19);
        k0Var.f293414s = new rr3.q(rVar, i17);
        k0Var.v();
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f480743d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder instanceof rr3.m) {
            if (i17 == 0) {
                ((rr3.m) holder).f480735g.setVisibility(0);
            } else {
                ((rr3.m) holder).f480735g.setVisibility(8);
            }
            java.lang.Object obj = this.f480743d.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            r45.tc5 tc5Var = (r45.tc5) obj;
            rr3.z zVar = this.f480744e;
            int i18 = zVar.f480756f;
            if (i18 == 1) {
                android.widget.ImageView imageView = ((rr3.m) holder).f480732d;
                imageView.setVisibility(0);
                java.lang.String str = com.p314xaae8f345.mm.ui.bk.C() ? tc5Var.f467847h : tc5Var.f467846g;
                int b17 = i65.a.b(zVar.m80379x76847179(), 24);
                o11.f fVar = new o11.f();
                fVar.f423611b = true;
                fVar.f423610a = true;
                fVar.f423619j = b17;
                fVar.f423620k = b17;
                n11.a.b().h(str, imageView, fVar.a());
                imageView.setOnClickListener(null);
            } else if (i18 == 2) {
                android.widget.ImageView imageView2 = ((rr3.m) holder).f480732d;
                imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f78485xd30530e2);
                imageView2.setOnClickListener(new rr3.n(this, i17));
            }
            rr3.m mVar = (rr3.m) holder;
            mVar.f480733e.setText(tc5Var.f467844e);
            int i19 = tc5Var.f467845f;
            android.widget.TextView textView = mVar.f480734f;
            if (i19 == 7) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            if (zVar.f480756f == 2) {
                holder.f3639x46306858.setOnLongClickListener(null);
            } else {
                holder.f3639x46306858.setOnLongClickListener(new rr3.o(this, i17));
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a1s, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new rr3.m(this, inflate);
    }
}
