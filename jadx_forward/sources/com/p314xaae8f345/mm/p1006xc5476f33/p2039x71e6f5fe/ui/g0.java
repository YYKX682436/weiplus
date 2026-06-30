package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes15.dex */
public class g0 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;
    public final android.content.Context M;
    public java.util.List N;

    public g0(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = null;
        this.N = null;
        this.M = context;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.ca9;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View p(android.view.View view, android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            this.L = u(viewGroup);
        }
        t(this.L);
        return this.L;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.GridView gridView = (android.widget.GridView) this.L.findViewById(com.p314xaae8f345.mm.R.id.j8r);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.f0 f0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.f0(this);
        gridView.setAdapter((android.widget.ListAdapter) f0Var);
        java.util.List list = this.N;
        if (list != null) {
            ((java.util.HashMap) f0Var.f241076f).clear();
            f0Var.f241075e.clear();
            f0Var.f241075e = list;
            f0Var.notifyDataSetChanged();
        }
    }
}
