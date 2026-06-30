package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790;

/* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.AppPreference */
/* loaded from: classes8.dex */
public class C18530x30d9cdbc extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final android.content.Context L;
    public fg4.e M;
    public android.widget.AdapterView.OnItemClickListener N;
    public android.widget.AdapterView.OnItemClickListener P;
    public int Q;
    public final int R;
    public final boolean S;
    public final int T;

    public C18530x30d9cdbc(android.content.Context context) {
        this(context, null);
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m M(int i17) {
        if (i17 < 0 || i17 >= this.M.getCount()) {
            return null;
        }
        return (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) this.M.getItem(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21499x297cf4cb c21499x297cf4cb = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21499x297cf4cb) view.findViewById(com.p314xaae8f345.mm.R.id.gts);
        fg4.e eVar = new fg4.e(this.L, this.Q);
        this.M = eVar;
        c21499x297cf4cb.setAdapter((android.widget.ListAdapter) eVar);
        c21499x297cf4cb.setOnItemClickListener(new fg4.g(this));
        if (this.S) {
            c21499x297cf4cb.setOnItemLongClickListener(new fg4.h(this));
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565761dg2);
        if (this.M.getCount() == 0) {
            textView.setVisibility(0);
            textView.setText(this.T);
            c21499x297cf4cb.setVisibility(8);
        } else {
            textView.setVisibility(8);
            c21499x297cf4cb.setVisibility(0);
        }
        android.widget.Button button = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.azj);
        button.setVisibility(this.R);
        button.setOnClickListener(null);
    }

    public C18530x30d9cdbc(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C18530x30d9cdbc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = null;
        this.P = null;
        this.Q = 0;
        this.S = false;
        this.T = 0;
        this.L = context;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rj.t.f477685b);
        this.R = obtainStyledAttributes.getInt(0, 8);
        this.S = obtainStyledAttributes.getBoolean(1, false);
        this.T = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
    }
}
