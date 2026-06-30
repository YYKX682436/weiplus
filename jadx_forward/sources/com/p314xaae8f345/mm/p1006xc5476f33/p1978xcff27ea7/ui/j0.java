package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class j0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 f236727a;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 activityC16959x6229db69) {
        this.f236727a = activityC16959x6229db69;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p
    public void a(vr4.b1 b1Var) {
        if (b1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneRechargeUI", "hy: no product item");
            return;
        }
        java.lang.String str = b1Var.f521234r;
        java.lang.String str2 = b1Var.f521235s;
        java.lang.String str3 = b1Var.f521224e;
        java.lang.String str4 = b1Var.f521225f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 activityC16959x6229db69 = this.f236727a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69.V6(activityC16959x6229db69, str, str2, str3, str4)) {
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b1Var.f521227h)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69.X6(activityC16959x6229db69, com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69.W6(activityC16959x6229db69, b1Var.f521227h), b1Var.f521224e, b1Var.f521225f);
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69.T6(activityC16959x6229db69, b1Var)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69.U6(activityC16959x6229db69, b1Var);
        }
    }
}
