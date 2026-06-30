package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class t2 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f259905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f259906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 f259907c;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936, boolean z17, android.app.Dialog dialog) {
        this.f259907c = activityC19014x45f83936;
        this.f259905a = z17;
        this.f259906b = dialog;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d
    public void a(java.lang.Object obj) {
        r45.hb5 hb5Var = (r45.hb5) obj;
        if (hb5Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936.X6(this.f259907c, hb5Var, this.f259905a);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d
    public void b(java.lang.Object obj, int i17, int i18) {
        r45.hb5 hb5Var = (r45.hb5) obj;
        android.app.Dialog dialog = this.f259906b;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936 = this.f259907c;
        if (hb5Var == null) {
            at4.j0.b(0, 0).a(activityC19014x45f83936.mo55332x76847179(), true);
            return;
        }
        int i19 = hb5Var.f457540d;
        if (i19 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936.X6(activityC19014x45f83936, hb5Var, this.f259905a);
        } else {
            at4.j0.c(i19, hb5Var.f457541e).a(activityC19014x45f83936.mo55332x76847179(), true);
        }
    }
}
