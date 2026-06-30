package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes4.dex */
public class i0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavBaseUI f101155d;

    public i0(com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI) {
        this.f101155d = favBaseUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavBaseUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "favoriteLV ouTouch happen");
        com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI = this.f101155d;
        favBaseUI.hideVKB();
        favBaseUI.C.d();
        yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/FavBaseUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
