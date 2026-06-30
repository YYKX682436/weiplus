package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

/* loaded from: classes8.dex */
public class o implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI f279504d;

    public o(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f279504d = bizChatConversationFmUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            int rawX = (int) motionEvent.getRawX();
            com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21584xb440222.BizChatConversationFmUI bizChatConversationFmUI = this.f279504d;
            bizChatConversationFmUI.f279442s = rawX;
            bizChatConversationFmUI.f279443t = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/bizchat/BizChatConversationUI$BizChatConversationFmUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
