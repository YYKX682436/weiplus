package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes4.dex */
public class q2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f223258d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f223259e = new java.util.LinkedList();

    public q2(android.content.Context context) {
        this.f223258d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.LinkedList) this.f223259e).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (m53.x5) ((java.util.LinkedList) this.f223259e).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p2 p2Var;
        android.content.Context context = this.f223258d;
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bfk, viewGroup, false);
            p2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p2(null);
            p2Var.f223238a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.gkk);
            p2Var.f223239b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gkl);
            p2Var.f223240c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gkm);
            view.setTag(p2Var);
        } else {
            p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p2) view.getTag();
        }
        m53.x5 x5Var = (m53.x5) ((java.util.LinkedList) this.f223259e).get(i17);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(p2Var.f223238a, x5Var.f405711d, 0.5f);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(x5Var.f405711d, true);
        if (n17 != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String g27 = n17.g2();
            float textSize = p2Var.f223239b.getTextSize();
            ((ke0.e) xVar).getClass();
            p2Var.f223239b.setText(new android.text.SpannableString(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, g27, textSize)));
        } else {
            p2Var.f223239b.setText("");
        }
        p2Var.f223240c.setText(x5Var.f405712e);
        return view;
    }
}
