package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes8.dex */
public class u2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226 f179741d;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226 activityC13309xb24c3226) {
        this.f179741d = activityC13309xb24c3226;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/EmojiPaidUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        float rawX = motionEvent.getRawX();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13309xb24c3226 activityC13309xb24c3226 = this.f179741d;
        activityC13309xb24c3226.I = rawX;
        activityC13309xb24c3226.f179345J = motionEvent.getRawY();
        yj0.a.i(false, this, "com/tencent/mm/plugin/emoji/ui/EmojiPaidUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
