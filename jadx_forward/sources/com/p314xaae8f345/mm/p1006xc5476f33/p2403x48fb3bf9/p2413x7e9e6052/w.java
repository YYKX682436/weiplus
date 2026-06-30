package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes8.dex */
public abstract class w {
    public static void a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5159xfddea0d4 c5159xfddea0d4) {
        android.os.Bundle bundle;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NFCIPCHelper", "nfcInvokeAsResult actionCode: %d", java.lang.Integer.valueOf(c5159xfddea0d4.f135508g.f89026a));
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.C19294x4afbb13f c19294x4afbb13f = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.C19294x4afbb13f) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.C19294x4afbb13f(c5159xfddea0d4), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.v.class);
            if (c19294x4afbb13f == null || (bundle = c19294x4afbb13f.f264767h) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NFCIPCHelper", "nfcInvokeAsResult error");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.r.f34013x366c91de, 0);
            } else {
                c5159xfddea0d4.f135509h.f89121a = bundle;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NFCIPCHelper", e17, "nfcInvokeAsResult exception", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NFCIPCHelper", "nfcInvokeAsResult error");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.r.f34013x366c91de, 0);
        }
    }
}
