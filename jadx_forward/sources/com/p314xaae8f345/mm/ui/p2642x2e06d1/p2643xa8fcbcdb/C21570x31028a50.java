package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.RightBelowPreference */
/* loaded from: classes3.dex */
public class C21570x31028a50 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21574x28121786 {
    public java.lang.CharSequence M;

    public C21570x31028a50(android.content.Context context) {
        super(context, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(this.M)) {
            ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.m3t)).setText(this.M);
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.m38);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/base/preference/RightBelowPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/base/preference/RightBelowPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21574x28121786, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        ((android.view.ViewGroup) ((android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi)).findViewById(android.R.id.widget_frame)).addView((android.view.ViewGroup) android.view.View.inflate(this.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.c_c, null));
        return u17;
    }

    public C21570x31028a50(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C21570x31028a50(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
