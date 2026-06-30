package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.TextButtonPreference */
/* loaded from: classes.dex */
public class C21577xeb88ad1a extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public C21577xeb88ad1a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public int k() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.byy;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        if (textView != null) {
            textView.setText(this.f279307h);
            textView.setEnabled(r());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        super.u(viewGroup);
        return com.p314xaae8f345.mm.ui.id.b(this.f279303d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.byy, viewGroup, false);
    }

    public C21577xeb88ad1a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
