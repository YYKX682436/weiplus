package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes14.dex */
public class t0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17941xa09a2818 f252025d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17941xa09a2818 c17941xa09a2818) {
        this.f252025d = c17941xa09a2818;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/AsyncMaskImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17941xa09a2818.f247746h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17941xa09a2818 c17941xa09a2818 = this.f252025d;
        boolean z17 = c17941xa09a2818.f247750g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        boolean z18 = false;
        if (!z17) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/AsyncMaskImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView$2");
            return false;
        }
        c17941xa09a2818.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateState", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setPressed(true);
            view.invalidate();
            c17941xa09a2818.f247747d.mo50300x3fa464aa(c17941xa09a2818.f247748e);
        } else if (action == 1 || action == 3) {
            c17941xa09a2818.f247747d.mo50293x3498a0(c17941xa09a2818.f247748e);
        }
        if (!c17941xa09a2818.isClickable() && !c17941xa09a2818.isLongClickable()) {
            z18 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateState", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView");
        yj0.a.i(z18, this, "com/tencent/mm/plugin/sns/ui/AsyncMaskImageView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.AsyncMaskImageView$2");
        return z18;
    }
}
