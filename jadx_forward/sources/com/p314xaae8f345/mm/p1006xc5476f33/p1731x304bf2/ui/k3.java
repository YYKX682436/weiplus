package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes3.dex */
public class k3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l3 f222979d;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l3 l3Var) {
        this.f222979d = l3Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameDropdownView$PopupMenu$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() != 4) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/game/ui/GameDropdownView$PopupMenu$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        this.f222979d.dismiss();
        yj0.a.i(true, this, "com/tencent/mm/plugin/game/ui/GameDropdownView$PopupMenu$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
