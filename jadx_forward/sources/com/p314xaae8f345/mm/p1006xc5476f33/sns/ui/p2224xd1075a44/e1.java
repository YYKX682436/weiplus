package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public class e1 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f252651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f252652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18410x906a0652 f252653f;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18410x906a0652 c18410x906a0652, android.widget.TextView textView, android.view.View view) {
        this.f252653f = c18410x906a0652;
        this.f252651d = textView;
        this.f252652e = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        java.lang.CharSequence text;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView$1");
        android.widget.TextView textView = this.f252651d;
        android.text.Layout layout = textView.getLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18410x906a0652 c18410x906a0652 = this.f252653f;
        if (layout != null && (text = textView.getLayout().getText()) != null) {
            java.lang.String charSequence = text.toString();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence) || charSequence.indexOf(8230) >= 0) {
                android.view.View view = this.f252652e;
                c18410x906a0652.removeView(view);
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18410x906a0652.f252375i;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                java.util.List list = c18410x906a0652.f252376d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                ((java.util.ArrayList) list).remove(view);
            }
        }
        c18410x906a0652.getViewTreeObserver().removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView$1");
        return true;
    }
}
