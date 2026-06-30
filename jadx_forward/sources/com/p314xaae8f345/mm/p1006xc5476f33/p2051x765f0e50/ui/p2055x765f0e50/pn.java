package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes13.dex */
public class pn implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7 f242985d;

    public pn(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7 activityC17476xb3aa84a7) {
        this.f242985d = activityC17476xb3aa84a7;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17476xb3aa84a7 activityC17476xb3aa84a7 = this.f242985d;
        if (!activityC17476xb3aa84a7.f242272i || motionEvent.getAction() != 1 || activityC17476xb3aa84a7.f242268e.pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY()) != -1) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        activityC17476xb3aa84a7.f242272i = false;
        activityC17476xb3aa84a7.f242269f.notifyDataSetChanged();
        yj0.a.i(true, this, "com/tencent/mm/plugin/setting/ui/setting/SettingsTrustFriendUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
