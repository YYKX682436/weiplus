package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes3.dex */
public final class y2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f273541d;

    public y2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f) {
        this.f273541d = activityC19730xa7b9756f;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f273541d.mo48674x36654fab();
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$onCreate$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
