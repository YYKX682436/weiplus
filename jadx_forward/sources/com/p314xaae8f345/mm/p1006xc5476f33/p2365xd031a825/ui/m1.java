package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class m1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.LayoutInflater f262018d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f262019e;

    public m1(android.content.Context context, java.util.List list) {
        this.f262018d = null;
        this.f262019e = new java.util.LinkedList();
        this.f262018d = android.view.LayoutInflater.from(context);
        this.f262019e = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f262019e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f262019e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l1 l1Var;
        if (view == null) {
            view = this.f262018d.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d5q, viewGroup, false);
            l1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l1(this);
            l1Var.f261928a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.par);
            l1Var.f261929b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.paq);
            l1Var.f261930c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.pat);
            l1Var.f261931d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.pas);
            view.setTag(l1Var);
        } else {
            l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.l1) view.getTag();
        }
        vr4.i1 i1Var = (vr4.i1) getItem(i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i1Var.f521280t)) {
            l1Var.f261929b.setVisibility(8);
        } else {
            l1Var.f261929b.setText(i1Var.f521280t);
            l1Var.f261929b.setVisibility(0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i1Var.f521272i)) {
            l1Var.f261930c.setVisibility(8);
        } else {
            l1Var.f261930c.setText(i1Var.f521272i);
            l1Var.f261930c.setVisibility(0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i1Var.f521274n)) {
            l1Var.f261931d.setVisibility(8);
        } else {
            l1Var.f261931d.setText(i1Var.f521274n);
            l1Var.f261931d.setVisibility(0);
        }
        java.lang.String str = i1Var.f521281u;
        l1Var.f261928a.setImageBitmap(null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            o11.f fVar = new o11.f();
            fVar.f423616g = lp0.b.D();
            fVar.f423615f = dt4.b.a(str);
            fVar.f423611b = true;
            fVar.f423628s = true;
            n11.a.b().h(str, l1Var.f261928a, fVar.a());
        }
        return view;
    }
}
