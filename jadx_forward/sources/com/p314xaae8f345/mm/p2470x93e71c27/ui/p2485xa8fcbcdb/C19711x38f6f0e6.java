package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.PowerSettingPreference */
/* loaded from: classes3.dex */
public class C19711x38f6f0e6 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;

    public C19711x38f6f0e6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            viewGroup2.addView(android.view.LayoutInflater.from(this.f279303d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cb6, (android.view.ViewGroup) null), new android.widget.AbsListView.LayoutParams(-1, -2));
            this.L = u17;
        }
        return this.L;
    }

    public C19711x38f6f0e6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
