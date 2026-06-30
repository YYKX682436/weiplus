package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790;

/* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference */
/* loaded from: classes8.dex */
public class C18533xf1098150 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final android.content.Context L;
    public fg4.l M;
    public java.util.List N;
    public android.widget.AdapterView.OnItemClickListener P;
    public final int Q;
    public final boolean R;
    public final int S;

    public C18533xf1098150(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21499x297cf4cb c21499x297cf4cb = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21499x297cf4cb) view.findViewById(com.p314xaae8f345.mm.R.id.gts);
        if (c21499x297cf4cb == null) {
            return;
        }
        this.M = new fg4.l(this.L, this.N);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().mo49775xc84af884(this.M);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().add(this.M);
        c21499x297cf4cb.setAdapter((android.widget.ListAdapter) this.M);
        c21499x297cf4cb.setOnItemClickListener(new fg4.q(this));
        if (this.R) {
            c21499x297cf4cb.setOnItemLongClickListener(new fg4.r(this));
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565761dg2);
        if (this.M.getCount() == 0) {
            textView.setVisibility(0);
            textView.setText(this.S);
            c21499x297cf4cb.setVisibility(8);
        } else {
            textView.setVisibility(8);
            c21499x297cf4cb.setVisibility(0);
        }
        android.widget.Button button = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.azj);
        button.setVisibility(this.Q);
        button.setOnClickListener(null);
    }

    public C18533xf1098150(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.P = null;
        this.R = false;
        this.S = 0;
        this.L = context;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569663hz;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rj.t.f477685b);
        this.Q = obtainStyledAttributes.getInt(0, 8);
        this.R = obtainStyledAttributes.getBoolean(1, false);
        this.S = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
    }
}
