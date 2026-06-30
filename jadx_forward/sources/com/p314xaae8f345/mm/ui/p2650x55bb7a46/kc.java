package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class kc implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21636x9b225e6d f283439d;

    public kc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21636x9b225e6d activityC21636x9b225e6d) {
        this.f283439d = activityC21636x9b225e6d;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ResourcesExceedUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f283439d.finish();
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/ResourcesExceedUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
