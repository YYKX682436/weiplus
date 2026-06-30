package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public class q implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8 f173569a;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8 c12795x70ccad8) {
        this.f173569a = c12795x70ccad8;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8 c12795x70ccad8;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "fetchCommonUsedDataFromServer errType:%d, errCode:%d, errCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0 || oVar == null || (fVar = oVar.f152244b.f152233a) == null) {
            synchronized (this.f173569a.f173404u) {
                c12795x70ccad8 = this.f173569a;
                c12795x70ccad8.f173402s = false;
            }
            c12795x70ccad8.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.p(this));
            return;
        }
        if (fVar instanceof r45.rs3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "get common used app request success");
            r45.rs3 rs3Var = (r45.rs3) oVar.f152244b.f152233a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8.b(this.f173569a, rs3Var, true);
            r45.rs3 rs3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k.f173527a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedCache", "setResponse");
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k.f173528b) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.k.f173527a = rs3Var;
            }
            if (rs3Var != null) {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("appbrand_multi_task_mmkv_name").D("appbrand_multi_task_common_used_resp_key", new java.lang.String(n56.a.b(rs3Var.mo14344x5f01b1f6(), false)));
                } catch (java.io.IOException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedCache", "setResponse, encode error");
                }
            }
            synchronized (this.f173569a.f173404u) {
                this.f173569a.f173402s = false;
            }
        }
    }
}
