package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class c9 implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d0 f239195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb f239196b;

    public c9(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d0 d0Var) {
        this.f239196b = activityC17155x7c2f4bb;
        this.f239195a = d0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.k0
    public void a(r45.n34 n34Var) {
        int i17 = n34Var.f462582e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17155x7c2f4bb activityC17155x7c2f4bb = this.f239196b;
        if (i17 == 1) {
            activityC17155x7c2f4bb.finish();
            return;
        }
        if (i17 == 2) {
            java.lang.String str = n34Var.f462583f;
            if (str == null || str.length() <= 0) {
                activityC17155x7c2f4bb.c7(this.f239195a);
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", n34Var.f462583f);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activityC17155x7c2f4bb, intent);
        }
    }
}
