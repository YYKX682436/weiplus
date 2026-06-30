package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164;

@mk0.a
/* loaded from: classes7.dex */
final class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private e() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0 c10757xa20383b0;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandThirdBusiTipsManager", "run UpdateWxaLaunchInfoTask");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k9 k9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k9();
            k9Var.f67120x28d45f97 = c10756x2a5d7b2d.f149939d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i9 Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Zi();
            if (Zi != null) {
                if (Zi.get(k9Var, "appId")) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandThirdBusiTipsManager", "get showThirdBusiTips success showThirdBusiTips:%b", java.lang.Boolean.valueOf(k9Var.f67129x71936746));
                    k9Var.f67129x71936746 = false;
                    if (Zi.mo9952xce0038c9(k9Var, "appId")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandThirdBusiTipsManager", "update showThirdBusiTips false success");
                    }
                }
                if (rVar == null) {
                    return;
                } else {
                    c10757xa20383b0 = new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0();
                }
            } else if (rVar == null) {
                return;
            } else {
                c10757xa20383b0 = new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0();
            }
        } catch (java.lang.Exception unused) {
            if (rVar == null) {
                return;
            } else {
                c10757xa20383b0 = new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0();
            }
        } catch (java.lang.Throwable th6) {
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0());
            }
            throw th6;
        }
        rVar.a(c10757xa20383b0);
    }
}
