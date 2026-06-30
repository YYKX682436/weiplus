package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* renamed from: com.tencent.mm.plugin.aa.ui.AAQueryListH5UrlFooterView */
/* loaded from: classes3.dex */
public class C11340x3c0307bc extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f153975d;

    public C11340x3c0307bc(android.content.Context context) {
        super(context);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.widget.TextView textView = (android.widget.TextView) com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569405a9, (android.view.ViewGroup) this, true).findViewById(com.p314xaae8f345.mm.R.id.f563843az);
        this.f153975d = textView;
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
    }

    /* renamed from: getBottomLinkTv */
    public android.widget.TextView m48626xdabc309d() {
        return this.f153975d;
    }

    public C11340x3c0307bc(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public C11340x3c0307bc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
