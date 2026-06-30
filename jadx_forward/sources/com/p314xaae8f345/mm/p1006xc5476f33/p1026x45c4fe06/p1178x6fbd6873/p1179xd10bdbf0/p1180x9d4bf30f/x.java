package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes7.dex */
public class x implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.y f169210d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.y yVar) {
        this.f169210d = yVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandDeviceOrientationRetrier", "hy: still not cancelled, trigger retry");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.b0 b0Var = this.f169210d.f169212e;
        int i17 = b0Var.f169106a + 1;
        b0Var.f169106a = i17;
        if (i17 <= 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.a0 a0Var = b0Var.f169107b;
            if (a0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.t) a0Var;
                android.app.Activity activity = tVar.f169192b;
                if (!activity.isDestroyed()) {
                    xi1.o oVar = tVar.f169191a.f169198a;
                    tVar.f169193c.getClass();
                    activity.setRequestedOrientation(oVar.f536245d);
                }
            }
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.a0 a0Var2 = b0Var.f169107b;
        if (a0Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.t tVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.t) a0Var2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.v vVar = tVar2.f169191a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandDeviceOrientationHandler", "hy: activity not turn to correct orientation for long time, request[%s]", vVar);
            xi1.n nVar = vVar.f169199b;
            xi1.o oVar2 = vVar.f169198a;
            if (nVar != null) {
                nVar.e(oVar2, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.w wVar = tVar2.f169193c;
            if (wVar.f169201a == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.k0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.k0.class);
                wVar.f169201a = k0Var;
                if (k0Var != null) {
                    xi1.o a17 = wVar.a();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12564xc4180c42 c12564xc4180c42 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.C12564xc4180c42();
                    c12564xc4180c42.f169457d = oVar2.f536245d;
                    c12564xc4180c42.f169458e = a17.f536245d;
                    c12564xc4180c42.k();
                }
            }
        }
        return false;
    }
}
