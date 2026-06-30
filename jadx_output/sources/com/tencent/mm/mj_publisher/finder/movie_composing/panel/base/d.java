package com.tencent.mm.mj_publisher.finder.movie_composing.panel.base;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel f69229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f69230e;

    public d(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel, android.graphics.Rect rect) {
        this.f69229d = baseComposingPanel;
        this.f69230e = rect;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/BaseComposingPanel$initOutside$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        float x17 = motionEvent.getX();
        float y17 = motionEvent.getY();
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel = this.f69229d;
        android.widget.LinearLayout linearLayout = baseComposingPanel.f69212o;
        android.graphics.Rect rect = this.f69230e;
        linearLayout.getHitRect(rect);
        if (rect.contains((int) x17, (int) y17)) {
            z17 = baseComposingPanel.isShown();
        } else if (baseComposingPanel.n(motionEvent)) {
            z17 = false;
        } else {
            if (baseComposingPanel.m() && motionEvent.getAction() == 1) {
                com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q.a(baseComposingPanel, false, false, 3, null);
            }
            z17 = true;
        }
        yj0.a.i(z17, this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/BaseComposingPanel$initOutside$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
