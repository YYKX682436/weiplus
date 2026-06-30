package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes4.dex */
public class i0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 f182688d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800) {
        this.f182688d = abstractActivityC13548xbf543800;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavBaseUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "favoriteLV ouTouch happen");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800 = this.f182688d;
        abstractActivityC13548xbf543800.mo48674x36654fab();
        abstractActivityC13548xbf543800.C.d();
        yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/FavBaseUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
