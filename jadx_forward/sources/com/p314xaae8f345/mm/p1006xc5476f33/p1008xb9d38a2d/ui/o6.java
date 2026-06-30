package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes13.dex */
public class o6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f155619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 f155620e;

    public o6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98, boolean[] zArr) {
        this.f155620e = activityC11419x78fe9e98;
        this.f155619d = zArr;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/LoginPasswordUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98 = this.f155620e;
        if (activityC11419x78fe9e98.f154860f.f154727x) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginPasswordUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean[] zArr = this.f155619d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            activityC11419x78fe9e98.f154898l1 = fo3.l.a(2);
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.qb("ce_login_id", "<LoginByID>", activityC11419x78fe9e98.f154898l1);
            sVar.H2("ce_login_id", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_login_id");
        }
        activityC11419x78fe9e98.i7();
        activityC11419x78fe9e98.Z6();
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/LoginPasswordUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
