package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class g4 extends k75.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r4 f157082d;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r4 r4Var) {
        this.f157082d = r4Var;
    }

    @Override // k75.c
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LibIncrementalTestCase[incremental]", "WriteMockLibInfo enter");
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.a();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r4 r4Var = this.f157082d;
        if (K0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r4.q(r4Var, "!!MockLibInfo Path Error!!");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("version", 0);
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(a17);
            r6Var.l();
            r6Var.k();
            byte[] bytes = jSONObject.toString().getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            int S = com.p314xaae8f345.mm.vfs.w6.S(r6Var.o(), bytes, 0, bytes.length);
            if (S == 0) {
                r4Var.o(r4Var.f157476o);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r4.q(r4Var, "MockLibInfo Write Error " + S);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r4.q(r4Var, "MockLibInfo Write Exception " + e17.getMessage());
        }
    }
}
