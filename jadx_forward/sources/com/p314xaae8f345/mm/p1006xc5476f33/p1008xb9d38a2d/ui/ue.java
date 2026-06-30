package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class ue implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f155784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 f155785e;

    public ue(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 activityC11461x47892174, boolean[] zArr) {
        this.f155785e = activityC11461x47892174;
        this.f155784d = zArr;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f155784d;
        boolean z17 = zArr[0];
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174 activityC11461x47892174 = this.f155785e;
        if (z17) {
            zArr[0] = false;
        } else {
            activityC11461x47892174.U = fo3.l.a(1);
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.qb("ce_reg", "<Reg>", activityC11461x47892174.U);
            sVar.H2("ce_reg", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_reg");
        }
        activityC11461x47892174.f155112w.d();
        if (!activityC11461x47892174.f155112w.b()) {
            yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ck5.f b17 = ck5.f.b(activityC11461x47892174.C.m78930xd454f3ba());
        b17.f124094f = 1;
        b17.f124093e = 32;
        b17.f124089a = true;
        b17.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.te(this));
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
