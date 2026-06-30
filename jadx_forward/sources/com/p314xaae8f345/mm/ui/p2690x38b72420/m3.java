package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.n3 f288556d;

    public m3(com.p314xaae8f345.mm.ui.p2690x38b72420.n3 n3Var) {
        this.f288556d = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.n3 n3Var = this.f288556d;
        java.util.List list = n3Var.f288572d.f288666h;
        if (list != null && list.contains("wework")) {
            n3Var.f288572d.f288666h.clear();
            n3Var.f288572d.f288666h.add("wework");
        }
        if (n3Var.f288572d.f288664f.size() > 0 || n3Var.f288572d.f288666h.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnterpriseBizView", "biz list size = %s", java.lang.Integer.valueOf(n3Var.f288572d.f288664f.size()));
            com.p314xaae8f345.mm.ui.p2690x38b72420.q3 q3Var = n3Var.f288572d;
            if (q3Var.f288663e == null) {
                android.view.View.inflate(q3Var.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.a8z, n3Var.f288572d);
                com.p314xaae8f345.mm.ui.p2690x38b72420.q3 q3Var2 = n3Var.f288572d;
                q3Var2.f288663e = (android.widget.LinearLayout) q3Var2.findViewById(com.p314xaae8f345.mm.R.id.cg7);
            }
            n3Var.f288572d.f288663e.removeAllViews();
            if (n3Var.f288572d.f288666h.size() > 0) {
                for (int i17 = 0; i17 < n3Var.f288572d.f288666h.size(); i17++) {
                    com.p314xaae8f345.mm.ui.p2690x38b72420.j8 j8Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.j8(n3Var.f288572d.getContext(), (java.lang.String) n3Var.f288572d.f288666h.get(i17));
                    n3Var.f288572d.f288663e.addView(j8Var);
                    if (i17 == n3Var.f288572d.f288666h.size() - 1 && n3Var.f288572d.f288664f.size() == 0) {
                        android.view.View findViewById = j8Var.findViewById(com.p314xaae8f345.mm.R.id.dgy);
                        int paddingLeft = findViewById.getPaddingLeft();
                        findViewById.setBackground(com.p314xaae8f345.mm.ui.zk.d(n3Var.f288572d.f288662d, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559855gp));
                        findViewById.findViewById(com.p314xaae8f345.mm.R.id.f565764dh0).setBackground(null);
                        findViewById.setPadding(paddingLeft, 0, 0, 0);
                    } else {
                        j8Var.findViewById(com.p314xaae8f345.mm.R.id.dgy).setBackground(null);
                        j8Var.findViewById(com.p314xaae8f345.mm.R.id.dgy).findViewById(com.p314xaae8f345.mm.R.id.f565764dh0).setBackground(com.p314xaae8f345.mm.ui.zk.d(n3Var.f288572d.f288662d, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559855gp));
                    }
                }
            }
            if (n3Var.f288572d.f288664f.size() > 0) {
                n3Var.f288572d.f288665g = new java.util.HashMap();
                for (int i18 = 0; i18 < n3Var.f288572d.f288664f.size(); i18++) {
                    java.lang.String str = (java.lang.String) n3Var.f288572d.f288664f.get(i18);
                    com.p314xaae8f345.mm.ui.p2690x38b72420.t3 t3Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.t3(n3Var.f288572d.getContext(), str);
                    n3Var.f288572d.f288663e.addView(t3Var);
                    n3Var.f288572d.f288665g.put(str, t3Var);
                    if (i18 == n3Var.f288572d.f288664f.size() - 1) {
                        android.view.View findViewById2 = t3Var.findViewById(com.p314xaae8f345.mm.R.id.dgy);
                        int paddingLeft2 = findViewById2.getPaddingLeft();
                        findViewById2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
                        findViewById2.findViewById(com.p314xaae8f345.mm.R.id.dgz).setBackground(null);
                        findViewById2.setPadding(paddingLeft2, 0, 0, 0);
                    } else {
                        t3Var.findViewById(com.p314xaae8f345.mm.R.id.dgy).setBackground(null);
                        android.view.View findViewById3 = t3Var.findViewById(com.p314xaae8f345.mm.R.id.dgy).findViewById(com.p314xaae8f345.mm.R.id.dgz);
                        int paddingRight = findViewById3.getPaddingRight();
                        findViewById3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
                        findViewById3.setPadding(0, 0, paddingRight, 0);
                    }
                }
            }
            com.p314xaae8f345.mm.ui.p2690x38b72420.q3 q3Var3 = n3Var.f288572d;
            q3Var3.f288667i.a(q3Var3.m80428x7002593a());
        }
    }
}
