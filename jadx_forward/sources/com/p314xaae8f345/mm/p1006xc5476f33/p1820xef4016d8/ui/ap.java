package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class ap extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f228258e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f228259f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f228260g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.LayoutInflater f228261h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View.OnClickListener f228262i;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f228257d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f228263m = 1;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.yo f228264n = null;

    public ap(android.content.Context context) {
        this.f228260g = context;
        this.f228261h = android.view.LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f228257d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5) this.f228257d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zo zoVar;
        android.content.Context context = this.f228260g;
        if (view == null) {
            view = this.f228261h.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bv7, viewGroup, false);
            zoVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zo(this);
            zoVar.f229330a = view.findViewById(com.p314xaae8f345.mm.R.id.m7g);
            zoVar.f229331b = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.j6l);
            zoVar.f229332c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j6p);
            zoVar.f229333d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j6q);
            zoVar.f229334e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j6j);
            zoVar.f229335f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j6k);
            zoVar.f229336g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j6r);
            zoVar.f229337h = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.j6m);
            zoVar.f229338i = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j6n);
            if (this.f228264n != null) {
                int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560878x0);
                int color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560879x1);
                int color3 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560889xa);
                zoVar.f229330a.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
                zoVar.f229330a.setPadding(0, context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx), 0, context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx));
                zoVar.f229332c.setTextColor(color);
                zoVar.f229333d.setTextColor(color2);
                zoVar.f229334e.setTextColor(color);
                zoVar.f229335f.setTextColor(color);
                zoVar.f229336g.setTextColor(color3);
            }
            view.setTag(zoVar);
        } else {
            zoVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zo) view.getTag();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5 h5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5) this.f228257d.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.b(zoVar.f229331b, h5Var.f226846e, h5Var.f226852n);
        java.lang.String str = h5Var.f226850i;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (str.equals(this.f228258e) && this.f228259f) {
            zoVar.f229336g.setOnClickListener(this.f228262i);
            zoVar.f229336g.setVisibility(0);
            zoVar.f229335f.setVisibility(8);
            zoVar.f229333d.setVisibility(8);
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var.f226849h)) {
                zoVar.f229335f.setVisibility(8);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(context, zoVar.f229335f, h5Var.f226849h);
                zoVar.f229335f.setVisibility(0);
            }
            zoVar.f229333d.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f(context, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(h5Var.f226848g, 0L) * 1000));
            zoVar.f229333d.setVisibility(0);
            zoVar.f229336g.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(context, zoVar.f229332c, h5Var.f226845d);
        zoVar.f229334e.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gna, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(h5Var.f226847f / 100.0d)));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var.f226851m)) {
            zoVar.f229337h.setVisibility(8);
            zoVar.f229338i.setVisibility(8);
        } else {
            zoVar.f229338i.setText(h5Var.f226851m);
            if (this.f228263m == 2) {
                zoVar.f229337h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c_a);
            } else {
                zoVar.f229337h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c99);
            }
            zoVar.f229337h.setVisibility(0);
            zoVar.f229338i.setVisibility(0);
        }
        return view;
    }
}
