package com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8;

/* renamed from: com.tencent.mm.plugin.newtips.NewTipIconSwitchKeyValuePreference */
/* loaded from: classes8.dex */
public class C16739x3cca9955 extends com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 {

    /* renamed from: i2, reason: collision with root package name */
    public android.widget.TextView f233889i2;

    public C16739x3cca9955(android.content.Context context) {
        this(context, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.summary);
        this.f233889i2 = textView;
        if (textView == null) {
            return;
        }
        android.content.Context context = this.f279303d;
        int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 2.0f);
        this.f233889i2.setTextColor(com.p314xaae8f345.mm.ui.p2740x696c9db.gd.a(context));
        this.f233889i2.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f81151x88e3ba46, 0, 0, 0);
        this.f233889i2.setCompoundDrawablePadding(d17);
    }

    public C16739x3cca9955(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C16739x3cca9955(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
