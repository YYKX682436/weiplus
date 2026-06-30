package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class c8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.d8 f288177d;

    public c8(com.p314xaae8f345.mm.ui.p2690x38b72420.d8 d8Var) {
        this.f288177d = d8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.d8 d8Var = this.f288177d;
        java.util.List list = d8Var.f288200d.f288259f;
        if (list == null || list.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMListHeaderView", "openimIdList is null");
            return;
        }
        d8Var.f288200d.f288259f.remove("wework");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMListHeaderView", "openim list size = %s", java.lang.Integer.valueOf(d8Var.f288200d.f288259f.size()));
        com.p314xaae8f345.mm.ui.p2690x38b72420.g8 g8Var = d8Var.f288200d;
        if (g8Var.f288258e == null) {
            android.view.View.inflate(g8Var.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.c8r, d8Var.f288200d);
            com.p314xaae8f345.mm.ui.p2690x38b72420.g8 g8Var2 = d8Var.f288200d;
            g8Var2.f288258e = (android.widget.LinearLayout) g8Var2.findViewById(com.p314xaae8f345.mm.R.id.cg7);
        }
        d8Var.f288200d.f288258e.removeAllViews();
        for (int i17 = 0; i17 < d8Var.f288200d.f288259f.size(); i17++) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.j8 j8Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.j8(d8Var.f288200d.getContext(), (java.lang.String) d8Var.f288200d.f288259f.get(i17));
            d8Var.f288200d.f288258e.addView(j8Var);
            if (i17 == d8Var.f288200d.f288259f.size() - 1) {
                android.view.View findViewById = j8Var.findViewById(com.p314xaae8f345.mm.R.id.dgy);
                int paddingLeft = findViewById.getPaddingLeft();
                findViewById.setBackground(com.p314xaae8f345.mm.ui.zk.d(d8Var.f288200d.f288257d, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559855gp));
                findViewById.findViewById(com.p314xaae8f345.mm.R.id.f565764dh0).setBackground(null);
                findViewById.setPadding(paddingLeft, 0, 0, 0);
            } else {
                j8Var.findViewById(com.p314xaae8f345.mm.R.id.dgy).setBackground(null);
                j8Var.findViewById(com.p314xaae8f345.mm.R.id.dgy).findViewById(com.p314xaae8f345.mm.R.id.f565764dh0).setBackground(com.p314xaae8f345.mm.ui.zk.d(d8Var.f288200d.f288257d, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559855gp));
            }
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.g8 g8Var3 = d8Var.f288200d;
        g8Var3.f288260g.a(g8Var3.f288259f.size());
    }
}
