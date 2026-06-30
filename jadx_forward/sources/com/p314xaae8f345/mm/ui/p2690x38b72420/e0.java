package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes3.dex */
public class e0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.g0 f288210d;

    public e0(com.p314xaae8f345.mm.ui.p2690x38b72420.g0 g0Var) {
        this.f288210d = g0Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.content.Context context = this.f288210d.f288246d;
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo48674x36654fab();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/contact/AddressUIEntranceHeaderView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
