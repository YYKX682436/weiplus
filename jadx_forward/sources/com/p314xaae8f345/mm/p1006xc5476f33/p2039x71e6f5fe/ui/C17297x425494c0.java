package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* renamed from: com.tencent.mm.plugin.scanner.ui.MusicPreference */
/* loaded from: classes15.dex */
public class C17297x425494c0 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;
    public android.widget.ImageButton M;
    public boolean N;
    public android.view.View.OnClickListener P;
    public java.lang.String Q;
    public java.lang.String R;
    public java.lang.String S;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.s T;

    public C17297x425494c0(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void M(boolean z17) {
        this.N = z17;
        android.widget.ImageButton imageButton = this.M;
        if (imageButton != null) {
            if (z17) {
                imageButton.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.auy);
            } else {
                imageButton.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.auw);
            }
        }
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
        if (this.P == null) {
            this.P = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.r(this);
        }
        android.widget.ImageButton imageButton = (android.widget.ImageButton) view.findViewById(com.p314xaae8f345.mm.R.id.l2t);
        this.M = imageButton;
        imageButton.setOnClickListener(this.P);
        if (this.N) {
            this.M.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.auy);
        } else {
            this.M.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.auw);
        }
    }

    public C17297x425494c0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = null;
        this.M = null;
        this.Q = "";
        this.R = "";
        this.S = "";
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0p;
    }
}
