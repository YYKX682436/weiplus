package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class sh implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.uh f291392e;

    public sh(com.p314xaae8f345.mm.ui.uh uhVar, java.lang.String str) {
        this.f291392e = uhVar;
        this.f291391d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = 0;
        while (true) {
            com.p314xaae8f345.mm.ui.uh uhVar = this.f291392e;
            if (i18 >= uhVar.f292625e.f294093h.size()) {
                return;
            }
            com.p314xaae8f345.mm.ui.vh vhVar = (com.p314xaae8f345.mm.ui.vh) uhVar.f292625e.f294093h.get(i18);
            if (vhVar != null) {
                java.lang.String str = vhVar.f292690a;
                java.lang.String str2 = this.f291391d;
                if (str2.equals(str)) {
                    com.p314xaae8f345.mm.ui.xh xhVar = uhVar.f292625e;
                    xhVar.f294094i.add((com.p314xaae8f345.mm.ui.vh) xhVar.f294093h.remove(i18));
                    uhVar.f292625e.notifyDataSetChanged();
                    k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(str2);
                    java.lang.String str3 = Bi == null ? "" : Bi.f68904x28d45f97;
                    if (uhVar.f292624d != 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13796, 12, str3, "", 0, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
                        return;
                    } else {
                        java.lang.String str4 = uhVar.f292625e.f294091f;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13798, 4, str3, 0, uhVar.f292625e.f294091f, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
                        return;
                    }
                }
            }
            i18++;
        }
    }
}
