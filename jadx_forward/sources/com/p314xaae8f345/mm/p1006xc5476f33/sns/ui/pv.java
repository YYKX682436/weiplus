package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes13.dex */
public final class pv implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f251816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18143x65a1db60 f251817e;

    public pv(k91.v5 v5Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18143x65a1db60 c18143x65a1db60) {
        this.f251816d = v5Var;
        this.f251817e = c18143x65a1db60;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsWeappView$setAttrNickname$1");
        k91.v5 v5Var = this.f251816d;
        boolean isEmpty = android.text.TextUtils.isEmpty(v5Var.f68913x21f9b213);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18143x65a1db60 c18143x65a1db60 = this.f251817e;
        if (isEmpty) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18143x65a1db60.f249153g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setDefaultName", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
            c18143x65a1db60.b();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setDefaultName", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
        } else {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18143x65a1db60.f249153g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTextView$p", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
            android.widget.TextView textView = c18143x65a1db60.f249155e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTextView$p", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
            textView.setText(v5Var.f68913x21f9b213);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsWeappView$setAttrNickname$1");
    }
}
