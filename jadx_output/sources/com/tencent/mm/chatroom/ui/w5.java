package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class w5 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.x5 f64618d;

    public w5(com.tencent.mm.chatroom.ui.x5 x5Var) {
        this.f64618d = x5Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationAdapter$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            java.lang.Float valueOf = java.lang.Float.valueOf(motionEvent.getRawX());
            com.tencent.mm.chatroom.ui.x5 x5Var = this.f64618d;
            x5Var.f64650g = valueOf;
            x5Var.f64651h = java.lang.Float.valueOf(motionEvent.getRawY());
        }
        yj0.a.i(false, this, "com/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI$ApplicationAdapter$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
