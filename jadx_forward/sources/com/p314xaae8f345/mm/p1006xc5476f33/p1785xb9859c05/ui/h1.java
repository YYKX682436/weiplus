package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes15.dex */
public class h1 extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f224377e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16133x8935f7ee f224378f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f224379g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f224380h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f224376d = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f224381i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f224382m = false;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16133x8935f7ee activityC16133x8935f7ee, java.util.List list) {
        this.f224378f = activityC16133x8935f7ee;
        this.f224377e = list;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            this.f224376d.add((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a) list.get(i17));
        }
        this.f224378f.f224121q.setVisibility(8);
        c();
    }

    public final java.lang.String a(int i17) {
        char c17 = (char) i17;
        java.lang.String valueOf = java.lang.String.valueOf(c17);
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16132x1cb7ea88.f224099r;
        for (int i18 = 0; i18 < 26; i18++) {
            if (strArr[i18].equals(java.lang.String.valueOf(c17))) {
                return valueOf;
            }
        }
        return "#";
    }

    public final void c() {
        java.util.List list = this.f224377e;
        this.f224380h = new int[list.size()];
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            this.f224380h[i17] = ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a) list.get(i17)).a();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f224377e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f224377e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.g1 g1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a) getItem(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16133x8935f7ee activityC16133x8935f7ee = this.f224378f;
        if (view == null) {
            view = android.view.View.inflate(activityC16133x8935f7ee, com.p314xaae8f345.mm.R.C30864xbddafb2a.bln, null);
            g1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.g1();
            g1Var.f224365a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cfx);
            g1Var.f224366b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565447cg1);
            g1Var.f224367c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cg6);
            view.setTag(g1Var);
        } else {
            g1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.g1) view.getTag();
        }
        int i18 = i17 >= 1 ? this.f224380h[i17 - 1] : -1;
        if (i17 == 0) {
            g1Var.f224365a.setVisibility(0);
            if (this.f224382m) {
                g1Var.f224365a.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574250hl0);
            } else {
                g1Var.f224365a.setText(a(this.f224380h[i17]));
            }
        } else if (i17 <= 0 || this.f224380h[i17] == i18) {
            g1Var.f224365a.setVisibility(8);
        } else {
            g1Var.f224365a.setVisibility(0);
            g1Var.f224365a.setText(a(this.f224380h[i17]));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f224379g)) {
            g1Var.f224366b.setText(aVar.f224274a);
            g1Var.f224367c.setText(" (+" + aVar.f224275b + ")");
        } else {
            g1Var.f224366b.setText(o13.q.c(activityC16133x8935f7ee, aVar.f224274a, this.f224379g));
            g1Var.f224367c.setText(o13.q.c(activityC16133x8935f7ee, " (+" + aVar.f224275b + ")", this.f224379g));
        }
        if (this.f224381i) {
            g1Var.f224367c.setVisibility(0);
        } else {
            g1Var.f224367c.setVisibility(4);
        }
        return view;
    }
}
