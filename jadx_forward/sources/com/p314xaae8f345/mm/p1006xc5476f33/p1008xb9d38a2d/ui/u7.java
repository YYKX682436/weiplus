package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes13.dex */
public class u7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f155775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d f155776e;

    public u7(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d, boolean[] zArr) {
        this.f155776e = activityC11438x77a05b9d;
        this.f155775d = zArr;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d = this.f155776e;
        if (activityC11438x77a05b9d.f154948s.f154727x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean[] zArr = this.f155775d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            activityC11438x77a05b9d.H = fo3.l.a(2);
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.qb("ce_login_id", "<LoginByID>", activityC11438x77a05b9d.H);
            sVar.H2("ce_login_id", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_login_id");
        }
        activityC11438x77a05b9d.V6();
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
