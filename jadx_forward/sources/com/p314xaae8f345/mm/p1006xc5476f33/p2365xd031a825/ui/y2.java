package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class y2 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z2 f262339a;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z2 z2Var) {
        this.f262339a = z2Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z2 z2Var = this.f262339a;
        if (i17 == 0) {
            intent.putExtra("rawUrl", z2Var.f262353d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575014ke2, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()));
        } else if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2 activityC19109xac2e2ee2 = z2Var.f262353d;
            if (activityC19109xac2e2ee2.f261493z != null) {
                intent.putExtra("rawUrl", activityC19109xac2e2ee2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575013ke1, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), z2Var.f262353d.f261493z.f261192s));
            }
        }
        intent.putExtra("showShare", false);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(z2Var.f262353d.mo55332x76847179(), intent);
    }
}
