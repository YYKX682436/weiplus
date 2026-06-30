package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.SelectPreference */
/* loaded from: classes3.dex */
public class C21571x8a410717 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;
    public android.widget.TextView M;
    public java.lang.String N;
    public boolean P;

    public C21571x8a410717(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }

    public void M(java.lang.String str) {
        this.N = str;
        if (this.M != null) {
            if (android.text.TextUtils.isEmpty(str)) {
                this.M.setVisibility(8);
                this.M.setText("");
            } else {
                this.M.setVisibility(0);
                this.M.setText(str);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        E(8);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.nh8)).setVisibility(this.P ? 0 : 8);
        this.M = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        M(this.N);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.c0w, viewGroup2);
        this.L = u17;
        return u17;
    }

    public C21571x8a410717(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
