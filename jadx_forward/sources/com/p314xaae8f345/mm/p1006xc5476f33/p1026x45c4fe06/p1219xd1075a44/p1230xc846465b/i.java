package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.j f173523d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.j jVar) {
        this.f173523d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.String u17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("appbrand_multi_task_mmkv_name").u("appbrand_multi_task_common_used_resp_key", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedCache", "textEncode:%s", u17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17)) {
                r45.rs3 rs3Var = (r45.rs3) new r45.rs3().mo11468x92b714fd(n56.a.a(u17));
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k.f173528b) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k.f173527a = rs3Var;
                }
            }
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedCache", "getResponse, encode error");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.j jVar = this.f173523d;
        if (jVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.o oVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.o) jVar;
            oVar.f173553a.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.RunnableC12807x330112(oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k.f173527a));
        }
    }
}
