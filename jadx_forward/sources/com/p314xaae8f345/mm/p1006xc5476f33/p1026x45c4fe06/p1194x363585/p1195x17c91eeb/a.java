package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb;

/* loaded from: classes7.dex */
public class a implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f170531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d f170532e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb.b bVar, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d) {
        this.f170531d = rVar;
        this.f170532e = c10756x2a5d7b2d;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.bc7 bc7Var;
        if (m1Var.mo808xfb85f7b0() != 1124) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "CheckDemoTask callback error mismatch ");
            return 0;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f170531d;
        if (i17 == 0 && i18 == 0) {
            r45.i00 i00Var = (r45.i00) oVar.f152244b.f152233a;
            com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = this.f170532e;
            if (i00Var == null || (bc7Var = i00Var.f458136d) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "CheckDemoTask callback error nil resp");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ai().z0(c10756x2a5d7b2d.f149939d, false);
                rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false));
            } else {
                int i19 = bc7Var.f452202d;
                if (i19 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "CheckDemoTask callback error,ErrCode %d", java.lang.Integer.valueOf(i19));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ai().z0(c10756x2a5d7b2d.f149939d, false);
                    rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "CheckDemoTask callback success");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ai().z0(c10756x2a5d7b2d.f149939d, true);
                    rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(true));
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "CheckDemoTask callback error, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false));
        }
        return 0;
    }
}
