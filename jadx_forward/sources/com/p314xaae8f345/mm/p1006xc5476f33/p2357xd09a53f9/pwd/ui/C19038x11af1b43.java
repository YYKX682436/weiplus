package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletBalancePrivacyCheckBoxPreference */
/* loaded from: classes9.dex */
public class C19038x11af1b43 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe {
    public boolean X;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 Y;
    public android.view.View Z;

    public C19038x11af1b43(android.content.Context context) {
        this(context, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe
    public int M() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569708jl;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe
    public boolean N() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.Y;
        return viewOnClickListenerC22631x1cc07cc8 != null ? viewOnClickListenerC22631x1cc07cc8.f292896x : this.X;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe
    public void O(boolean z17) {
        this.X = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe
    public void Q(java.lang.String str, int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe
    public void R(int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe
    public void S(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.Y;
        if (viewOnClickListenerC22631x1cc07cc8 != null) {
            this.X = z17;
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        E(8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) view.findViewById(com.p314xaae8f345.mm.R.id.btf);
        this.Y = viewOnClickListenerC22631x1cc07cc8;
        viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.c(this));
        this.Y.m81392x52cfa5c6(this.X);
        if (r()) {
            return;
        }
        this.Y.setEnabled(false);
        ((android.widget.TextView) view.findViewById(android.R.id.title)).setTextColor(view.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560428k4));
        ((android.widget.TextView) view.findViewById(android.R.id.summary)).setTextColor(view.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560428k4));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        this.Z = u17;
        return u17;
    }

    public C19038x11af1b43(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19038x11af1b43(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.X = false;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569708jl;
    }
}
