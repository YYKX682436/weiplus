package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes3.dex */
public class u implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 f284258d;

    public u(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d6) {
        this.f284258d = activityC21601xaeea84d6;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$25", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            int rawX = (int) motionEvent.getRawX();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d6 = this.f284258d;
            activityC21601xaeea84d6.T1 = rawX;
            activityC21601xaeea84d6.U1 = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$25", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
