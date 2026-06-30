package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public final class v2 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 f239522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 f239523e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var) {
        super(false);
        this.f239522d = h3Var;
        this.f239523e = z0Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var = this.f239522d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var = this.f239523e;
        h3Var.z(z0Var, true);
        h3Var.L(z0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "onclick selectType" + h3Var.f239273i);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.j2 j2Var = h3Var.f239270f;
        if (j2Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.r5) j2Var).a(h3Var.f239273i, z0Var);
        }
    }
}
