package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingHeaderPref */
/* loaded from: classes9.dex */
public class C19054x2e6b9f47 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.TextView L;
    public android.widget.TextView M;
    public android.widget.TextView N;
    public android.widget.ImageView P;
    public java.lang.String Q;
    public java.lang.String R;
    public java.lang.String S;
    public android.view.View.OnClickListener T;
    public android.view.View.OnClickListener U;

    public C19054x2e6b9f47(android.content.Context context) {
        this(context, null);
    }

    public final void M() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.Q) && (textView4 = this.L) != null) {
            textView4.setText(this.Q);
            this.L.setVisibility(0);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.R) && (textView3 = this.M) != null) {
            textView3.setText(this.R);
            this.M.setVisibility(0);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.S) && (textView2 = this.N) != null) {
            textView2.setText(this.S);
            this.N.setVisibility(0);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.S) || (textView = this.N) == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        android.view.View.OnClickListener onClickListener;
        android.view.View.OnClickListener onClickListener2;
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j8i);
        this.L = textView;
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.M = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        this.N = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cwp);
        this.P = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.pey);
        M();
        android.widget.TextView textView2 = this.N;
        if (textView2 != null && (onClickListener2 = this.T) != null) {
            textView2.setOnClickListener(onClickListener2);
        }
        android.widget.ImageView imageView = this.P;
        if (imageView == null || (onClickListener = this.U) == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public C19054x2e6b9f47(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19054x2e6b9f47(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.T = null;
        this.U = null;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.d87;
    }
}
