package k13;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 f384798d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 activityC15562xa7b84ac6) {
        this.f384798d = activityC15562xa7b84ac6;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event.getAction() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15562xa7b84ac6 activityC15562xa7b84ac6 = this.f384798d;
            activityC15562xa7b84ac6.f218874m[0] = (int) event.getRawX();
            activityC15562xa7b84ac6.f218874m[1] = (int) event.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
