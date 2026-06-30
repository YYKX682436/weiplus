package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class l7 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.m7 f145837d;

    public l7(com.p314xaae8f345.mm.p648x55baa833.ui.m7 m7Var) {
        this.f145837d = m7Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationAdapter$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            java.lang.Float valueOf = java.lang.Float.valueOf(motionEvent.getRawX());
            com.p314xaae8f345.mm.p648x55baa833.ui.m7 m7Var = this.f145837d;
            m7Var.f145898f = valueOf;
            m7Var.f145899g = java.lang.Float.valueOf(motionEvent.getRawY());
        }
        yj0.a.i(false, this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationUI$ApplicationAdapter$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
