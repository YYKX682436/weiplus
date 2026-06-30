package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class hy implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18149x2128f641 f250078d;

    public hy(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18149x2128f641 c18149x2128f641) {
        this.f250078d = c18149x2128f641;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.TouchImageView$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TouchImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18149x2128f641.f249179m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18149x2128f641 c18149x2128f641 = this.f250078d;
        boolean z17 = c18149x2128f641.f249185i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        boolean z18 = false;
        if (!z17) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/TouchImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.TouchImageView$2");
            return false;
        }
        c18149x2128f641.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateState", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setPressed(true);
            view.invalidate();
            c18149x2128f641.f249180d.mo50300x3fa464aa(c18149x2128f641.f249181e);
        } else if (action == 1 || action == 3) {
            c18149x2128f641.f249180d.mo50293x3498a0(c18149x2128f641.f249181e);
        }
        if (!c18149x2128f641.isClickable() && !c18149x2128f641.isLongClickable()) {
            z18 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateState", "com.tencent.mm.plugin.sns.ui.TouchImageView");
        yj0.a.i(z18, this, "com/tencent/mm/plugin/sns/ui/TouchImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.TouchImageView$2");
        return z18;
    }
}
