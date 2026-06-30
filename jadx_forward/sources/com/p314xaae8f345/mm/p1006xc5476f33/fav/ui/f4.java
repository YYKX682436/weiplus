package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes3.dex */
public class f4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b f182378d;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b activityC13569x56faec8b) {
        this.f182378d = activityC13569x56faec8b;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b.C;
        this.f182378d.Q6();
        yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
