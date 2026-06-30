package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMMHeaderPreference */
/* loaded from: classes9.dex */
public class C17401xed12d392 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public java.lang.String L;

    public C17401xed12d392(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.oxh);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f563862bj);
        if (textView != null) {
            textView.getPaint().setFakeBoldText(true);
            textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574511ij2));
        }
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f563861bi)).setText(java.lang.String.format("%s %s", "Version", this.L));
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e5(this));
        }
    }

    public C17401xed12d392(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = "";
    }

    public C17401xed12d392(android.content.Context context) {
        super(context);
        this.L = "";
    }
}
