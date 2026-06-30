package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes.dex */
public class j9 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22522xdab24d6c f292050d;

    public j9(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22522xdab24d6c activityC22522xdab24d6c) {
        this.f292050d = activityC22522xdab24d6c;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ShareImageRedirectUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22522xdab24d6c activityC22522xdab24d6c = this.f292050d;
        dp.a.m125853x26a183b(activityC22522xdab24d6c, com.p314xaae8f345.mm.R.C30867xcad56011.j4c, 1).show();
        activityC22522xdab24d6c.finish();
        yj0.a.i(false, this, "com/tencent/mm/ui/tools/ShareImageRedirectUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
