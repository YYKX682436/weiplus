package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt;

/* loaded from: classes9.dex */
public class d3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.oa5 f259158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f259159e;

    public d3(r45.oa5 oa5Var, android.content.Context context) {
        this.f259158d = oa5Var;
        this.f259159e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.oa5 oa5Var = this.f259158d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtUtil", "click item, type: %s", java.lang.Integer.valueOf(oa5Var.f463630e));
        int i18 = oa5Var.f463630e;
        if (i18 == 1) {
            return;
        }
        if (i18 == 2) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this.f259159e, oa5Var.f463631f, true);
        } else if (i18 == 3) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(oa5Var.f463632g, oa5Var.f463633h, 0, 1061);
        }
    }
}
