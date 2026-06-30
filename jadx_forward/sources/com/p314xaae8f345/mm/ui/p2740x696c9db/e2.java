package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class e2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f291903d;

    public e2(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 activityC22499xed564269, com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var) {
        this.f291903d = b4Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/CropImageNewUI$17", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f291903d;
        if (action == 0) {
            b4Var.c(200L, 200L);
        } else if (action == 1) {
            b4Var.d();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/tools/CropImageNewUI$17", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
