package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.PreferenceInfoCategory */
/* loaded from: classes.dex */
public class C21565x52db4467 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public C21565x52db4467(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        if (textView == null) {
            return;
        }
        java.lang.CharSequence charSequence = this.f279307h;
        if (charSequence == null || charSequence.length() <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(this.f279307h);
            textView.setOnClickListener(null);
        }
        ((android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f564236lp)).setOnClickListener(null);
    }

    public C21565x52db4467(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.c0j;
    }
}
