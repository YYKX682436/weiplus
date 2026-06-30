package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class m0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22362x9bac7ed5.ConvBoxServiceConversationFmUI f289390d;

    public m0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22362x9bac7ed5.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI) {
        this.f289390d = convBoxServiceConversationFmUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22362x9bac7ed5.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI = this.f289390d;
            convBoxServiceConversationFmUI.mo78661x36654fab();
            convBoxServiceConversationFmUI.f39577xd22f6809 = (int) motionEvent.getRawX();
            convBoxServiceConversationFmUI.f39578xd3e440a8 = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/conversation/ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
