package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes7.dex */
public class p4 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.k5) ((s40.z0) i95.n0.c(s40.z0.class))).getClass();
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveShellService", "Environment denied: not coolassist or monkey env");
            return;
        }
        try {
            cl0.g gVar = new cl0.g(intent.getStringExtra("info"));
            r45.lk1 lk1Var = new r45.lk1();
            lk1Var.set(0, java.lang.Boolean.valueOf(gVar.mo15078x42e4f5f5("can_display", false)));
            lk1Var.set(2, java.lang.Double.valueOf(gVar.optDouble(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54483x1466c762)));
            lk1Var.set(1, java.lang.Long.valueOf(gVar.optLong("resource_id")));
            ((mm2.l0) dk2.ef.f314905a.i(mm2.l0.class)).P6(lk1Var);
        } catch (cl0.f unused) {
        }
    }
}
