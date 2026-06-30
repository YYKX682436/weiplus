package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class w7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d f155826d;

    public w7(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d) {
        this.f155826d = activityC11438x77a05b9d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d = this.f155826d;
        if (activityC11438x77a05b9d.f154948s.f154727x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (fp.h.c(31)) {
            android.view.View decorView = activityC11438x77a05b9d.getWindow().getDecorView();
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.b1.a(decorView).f(8)) {
                activityC11438x77a05b9d.mo48674x36654fab();
                activityC11438x77a05b9d.f154955z = java.lang.Boolean.TRUE;
                yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        activityC11438x77a05b9d.W6();
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
