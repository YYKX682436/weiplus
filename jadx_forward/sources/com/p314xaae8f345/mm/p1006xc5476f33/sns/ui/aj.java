package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class aj implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 f249292d;

    public aj(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 c18062xf8f7b205) {
        this.f249292d = c18062xf8f7b205;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.SnsHeader$9");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 c18062xf8f7b205 = this.f249292d;
        c18062xf8f7b205.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (c18062xf8f7b205.f248698d.f249725i.getHeight() > c18062xf8f7b205.f248698d.f249725i.getWidth()) {
            android.view.ViewGroup.LayoutParams layoutParams = c18062xf8f7b205.f248698d.f249725i.getLayoutParams();
            layoutParams.height = c18062xf8f7b205.f248698d.f249725i.getWidth();
            c18062xf8f7b205.f248698d.f249725i.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.SnsHeader$9");
    }
}
