package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class p1 extends ea5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f225574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.e f225575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 f225576c;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.e eVar) {
        this.f225576c = g1Var;
        this.f225574a = arrayList;
        this.f225575b = eVar;
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackFailAsync */
    public void mo13581xd73276fa(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r rVar) {
        super.mo13581xd73276fa(j17, i17, i18, str, str2, i19, rVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteApp.LiteAppLogic", "batchCheck udr fail, appId: %s, errNo: %d, errCode: %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        e70.t tVar = e70.t.f331388d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var = this.f225576c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.e eVar = this.f225575b;
        java.util.ArrayList arrayList = this.f225574a;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.e(g1Var, arrayList, eVar, str);
            return;
        }
        if (eVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.k0) eVar).a(arrayList);
        }
        ((java.util.concurrent.ConcurrentHashMap) g1Var.f225494o).remove(arrayList);
    }

    @Override // ea5.k, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.e
    /* renamed from: onCallBackSuccessAsync */
    public void mo13582x5e6271bd(long j17, java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r rVar) {
        super.mo13582x5e6271bd(j17, str, str2, i17, rVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "batchCheck udr success, appId: %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.e(this.f225576c, this.f225574a, this.f225575b, str);
    }
}
