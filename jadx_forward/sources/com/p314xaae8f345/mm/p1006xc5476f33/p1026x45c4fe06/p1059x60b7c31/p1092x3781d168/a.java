package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168;

/* loaded from: classes7.dex */
public class a implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17;
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.C12141x9d1ae043) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.C12141x9d1ae043 c12141x9d1ae043 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.C12141x9d1ae043) obj;
            java.lang.String str = c12141x9d1ae043.f162804d;
            java.lang.String str2 = c12141x9d1ae043.f162805e;
            int i17 = c12141x9d1ae043.f162806f;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str)) == null || !b17.J0()) {
                return;
            }
            try {
                org.json.JSONObject put = new org.json.JSONObject().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str2).put("webviewId", java.lang.String.valueOf(i17));
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.c();
                cVar.u(b17.C0());
                cVar.f163907f = put.toString();
                cVar.m();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.EventOnH5Data", "dispatch ex = %s", e17);
            }
        }
    }
}
