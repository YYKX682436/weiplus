package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public class pb implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavoriteIndexUI f101347d;

    public pb(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI) {
        this.f101347d = favoriteIndexUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = this.f101347d;
            favoriteIndexUI.f100440x0[0] = (int) motionEvent.getRawX();
            favoriteIndexUI.f100440x0[1] = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
