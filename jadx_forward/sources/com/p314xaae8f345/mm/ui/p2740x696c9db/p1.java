package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class p1 extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f292163e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f292164f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f292165g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f292166h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f292162d = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f292167i = false;

    public p1(android.content.Context context, java.util.List list) {
        this.f292164f = context;
        this.f292163e = list;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            this.f292162d.add((u11.a) list.get(i17));
        }
        c();
    }

    public final java.lang.String a(int i17) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n()) {
            return java.lang.String.valueOf((char) i17);
        }
        return java.lang.Integer.toString(i17) + "劃";
    }

    public final void c() {
        java.util.List list = this.f292163e;
        this.f292166h = new int[list.size()];
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            this.f292166h[i17] = ((u11.a) list.get(i17)).f505264e;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f292163e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f292163e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.o1 o1Var;
        u11.a aVar = (u11.a) getItem(i17);
        if (view == null) {
            boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n();
            android.content.Context context = this.f292164f;
            view = !n17 ? android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570225a30, null) : android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570226a31, null);
            o1Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.o1();
            o1Var.f292147a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cfx);
            o1Var.f292148b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565447cg1);
            o1Var.f292149c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cg6);
            view.setTag(o1Var);
        } else {
            o1Var = (com.p314xaae8f345.mm.ui.p2740x696c9db.o1) view.getTag();
        }
        int i18 = i17 >= 1 ? this.f292166h[i17 - 1] : -1;
        if (i17 == 0) {
            o1Var.f292147a.setVisibility(0);
            o1Var.f292147a.setText(a(this.f292166h[i17]));
        } else if (i17 <= 0 || this.f292166h[i17] == i18) {
            o1Var.f292147a.setVisibility(8);
        } else {
            o1Var.f292147a.setVisibility(0);
            o1Var.f292147a.setText(a(this.f292166h[i17]));
        }
        o1Var.f292148b.setText(aVar.f505262c);
        o1Var.f292149c.setText(aVar.f505261b);
        if (this.f292167i) {
            o1Var.f292149c.setVisibility(0);
        } else {
            o1Var.f292149c.setVisibility(4);
        }
        return view;
    }
}
