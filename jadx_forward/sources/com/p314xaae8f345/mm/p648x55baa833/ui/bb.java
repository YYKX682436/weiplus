package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes3.dex */
public class bb implements android.view.View.OnTouchListener {
    public bb(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3 activityC10364x5bffdef3) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/ui/SeeRoomManagerUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(true, this, "com/tencent/mm/chatroom/ui/SeeRoomManagerUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
