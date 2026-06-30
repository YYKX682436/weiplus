package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyMMHeaderPreference */
/* loaded from: classes.dex */
public class C19039x74188f4d extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public java.lang.String L;
    public final java.util.Map M;

    public C19039x74188f4d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = new java.util.HashMap();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.acr);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.L)) {
            textView.setText(this.L);
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
    }

    public C19039x74188f4d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = new java.util.HashMap();
    }

    public C19039x74188f4d(android.content.Context context) {
        super(context);
        this.M = new java.util.HashMap();
    }
}
