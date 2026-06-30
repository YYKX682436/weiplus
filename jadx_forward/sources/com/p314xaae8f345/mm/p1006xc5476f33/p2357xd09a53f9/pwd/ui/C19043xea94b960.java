package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferUISelectPreference */
/* loaded from: classes.dex */
public class C19043xea94b960 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;
    public boolean M;

    public C19043xea94b960(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        E(8);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        java.lang.String text = textView != null ? textView.getText() : "";
        if (this.M) {
            view.setContentDescription(((java.lang.Object) text) + " " + ((java.lang.Object) view.getContext().getText(com.p314xaae8f345.mm.R.C30867xcad56011.kkw)));
        } else {
            view.setContentDescription(((java.lang.Object) text) + " " + ((java.lang.Object) view.getContext().getText(com.p314xaae8f345.mm.R.C30867xcad56011.kkx)));
        }
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.nh8)).setVisibility(this.M ? 0 : 8);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        viewGroup2.setPadding(0, 0, 0, 0);
        ((android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.f568214m43)).setPadding(0, 0, 0, 0);
        android.view.View.inflate(this.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.c0w, viewGroup2);
        this.L = u17;
        return u17;
    }

    public C19043xea94b960(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C19043xea94b960(android.content.Context context) {
        super(context);
    }
}
