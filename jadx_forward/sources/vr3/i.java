package vr3;

/* loaded from: classes11.dex */
public final class i implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 f521166d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7) {
        this.f521166d = c16893x570516c7;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileDataFetcher", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.wl wlVar = (r45.wl) oVar.f152244b.f152233a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7 = this.f521166d;
        if (i17 == 0 && i18 == 0 && wlVar != null) {
            qr3.c0.f447615a.e(wlVar.f470768f);
            try {
                try {
                    qr3.c0.c(wlVar);
                    c16893x570516c7.f235815m.mo523x53d8522f(wlVar);
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizProfileDataFetcher", e17, "profileInfo.parseFrom", new java.lang.Object[0]);
                }
                c16893x570516c7.f235826x = false;
                return 0;
            } finally {
                gr3.c.e(c16893x570516c7.f235811f);
            }
        }
        if (i18 == -3003) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileDataFetcher", "get profile info -3003, dismiss biz menu");
            r45.wl wlVar2 = c16893x570516c7.f235814i;
            r45.km kmVar = wlVar2.f470771i;
            if (kmVar != null) {
                kmVar.f460348d = null;
                if (wlVar2.f470766d != null) {
                    qr3.c0.c(wlVar2);
                }
                c16893x570516c7.f235815m.mo523x53d8522f(c16893x570516c7.f235814i);
            }
        }
        gr3.c.c(54L);
        return 0;
    }
}
