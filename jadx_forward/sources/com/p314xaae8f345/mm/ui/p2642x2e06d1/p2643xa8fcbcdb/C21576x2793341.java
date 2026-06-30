package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.SwitchKeyValuePreference */
/* loaded from: classes8.dex */
public class C21576x2793341 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.TextView L;
    public boolean M;

    public C21576x2793341(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.summary);
        this.L = textView;
        if (textView == null) {
            return;
        }
        boolean z17 = this.M;
        android.content.Context context = this.f279303d;
        if (!z17) {
            textView.setTextColor(com.p314xaae8f345.mm.ui.p2740x696c9db.gd.a(context));
        } else {
            iz5.a.g(null, context != null);
            textView.setTextColor(new com.p314xaae8f345.mm.ui.p2740x696c9db.gd(context).f291981a[0]);
        }
    }

    public C21576x2793341(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = true;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}
