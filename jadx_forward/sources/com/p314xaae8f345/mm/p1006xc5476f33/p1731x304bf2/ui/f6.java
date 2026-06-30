package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes3.dex */
public class f6 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15989x4803986e f222921d;

    public f6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15989x4803986e activityC15989x4803986e) {
        this.f222921d = activityC15989x4803986e;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameSearchUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15989x4803986e activityC15989x4803986e = this.f222921d;
        activityC15989x4803986e.f222504h.clearFocus();
        activityC15989x4803986e.mo48674x36654fab();
        yj0.a.i(false, this, "com/tencent/mm/plugin/game/ui/GameSearchUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
