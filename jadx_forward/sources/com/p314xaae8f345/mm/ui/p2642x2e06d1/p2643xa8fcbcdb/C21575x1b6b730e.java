package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.SummaryTextPreference */
/* loaded from: classes3.dex */
public class C21575x1b6b730e extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.TextView L;
    public java.lang.String M;
    public android.view.View N;

    public C21575x1b6b730e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.L = (android.widget.TextView) view.findViewById(android.R.id.summary);
        if (!android.text.TextUtils.isEmpty(this.M)) {
            try {
                this.L.setTypeface(android.graphics.Typeface.createFromAsset(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets(), this.M));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SummaryTextPreference", "setTypeface assets: %s", this.M);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SummaryTextPreference", "setTypeface assets path exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        this.N = view;
    }

    public C21575x1b6b730e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = null;
    }

    public C21575x1b6b730e(android.content.Context context) {
        super(context);
        this.M = null;
    }
}
