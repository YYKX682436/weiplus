package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2267x5897e6f;

/* loaded from: classes11.dex */
public final class a extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f254746e;

    public a(android.view.View.OnLongClickListener longClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(longClickListener, "longClickListener");
        this.f254746e = longClickListener;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cyk;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        fj4.a item = (fj4.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.AlbumItemConvert", "onBindViewHolder");
        java.lang.Object obj = holder.f374657h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.api.IStatusCardView");
        bi4.n0 n0Var = (bi4.n0) obj;
        n0Var.mo10628xfb86a31b().setTag(com.p314xaae8f345.mm.R.id.ipp, item);
        n0Var.mo10628xfb86a31b().setOnLongClickListener(this.f254746e);
        n0Var.mo10628xfb86a31b().setTag(com.p314xaae8f345.mm.R.id.nwq, java.lang.Integer.valueOf(i17));
        android.view.View mo10628xfb86a31b = n0Var.mo10628xfb86a31b();
        pj4.n1 n1Var = item.f344756d;
        mo10628xfb86a31b.setTag(com.p314xaae8f345.mm.R.id.nwo, n1Var);
        if (n0Var instanceof bi4.p0) {
            pj4.u0 u0Var = new pj4.u0();
            u0Var.f436836d = n1Var.f436735g + n1Var.f436737i;
            java.lang.String a17 = en1.a.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "username(...)");
            ((bi4.p0) n0Var).m(a17, item.f344757e, u0Var);
        }
        java.lang.String str = item.f344758f;
        boolean z18 = true;
        if (str == null || r26.n0.N(str)) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oqw)).setVisibility(8);
        } else {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oqw);
            textView.setVisibility(0);
            textView.setText(item.f344758f);
        }
        java.lang.String str2 = item.f344759g;
        if (str2 != null && !r26.n0.N(str2)) {
            z18 = false;
        }
        if (z18) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oo6)).setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.oo6);
        textView2.setVisibility(0);
        textView2.setText(item.f344759g);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.AlbumItemConvert", "onCreateViewHolder");
        android.view.View view = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
        bi4.k1 k1Var = new bi4.k1();
        k1Var.j(true);
        k1Var.q(true);
        k1Var.f102598e = true;
        k1Var.f102600g = 6;
        k1Var.f102597d = (k1Var.f102597d & (-4097)) | 2048;
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        android.content.Context context = recyclerView.getContext();
        ((we0.j1) l0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 n2Var = k1Var.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) ? new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2(context, k1Var) : new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3(context, k1Var);
        android.view.View view2 = n2Var.f255729m;
        linearLayout.addView(view2);
        holder.f374657h = n2Var;
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((android.widget.LinearLayout.LayoutParams) layoutParams).width = -1;
    }
}
