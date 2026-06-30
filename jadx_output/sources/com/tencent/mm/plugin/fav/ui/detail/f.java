package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes8.dex */
public class f implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI f100714d;

    public f(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI) {
        this.f100714d = favoriteFileDetailUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            int rawX = (int) motionEvent.getRawX();
            com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI = this.f100714d;
            favoriteFileDetailUI.W = rawX;
            favoriteFileDetailUI.X = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
