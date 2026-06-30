package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class pp extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rp f228865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16407x72652a1a f228866e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16407x72652a1a c16407x72652a1a, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rp rpVar) {
        super(false);
        this.f228866e = c16407x72652a1a;
        this.f228865d = rpVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16407x72652a1a c16407x72652a1a = this.f228866e;
        java.lang.String obj = c16407x72652a1a.f228214p.getText().toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.a0 a0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.a0) this.f228865d;
        a0Var.getClass();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16359x81eae2a6 activityC16359x81eae2a6 = a0Var.f228220a;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16359x81eae2a6.D)) {
                activityC16359x81eae2a6.m66164x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e6(activityC16359x81eae2a6.C, obj, activityC16359x81eae2a6.D, "v1.0"));
                activityC16359x81eae2a6.V6();
            }
        }
        c16407x72652a1a.f228214p.setText("");
    }
}
