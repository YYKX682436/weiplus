package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes11.dex */
public class h6 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d f182667d;

    public h6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13572xe5ee659d activityC13572xe5ee659d) {
        this.f182667d = activityC13572xe5ee659d;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavTagEditUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f182667d.f181950g.f();
        yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/FavTagEditUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
