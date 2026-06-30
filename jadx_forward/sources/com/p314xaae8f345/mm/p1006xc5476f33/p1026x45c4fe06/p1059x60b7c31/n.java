package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class n implements pd.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m f163887a;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar) {
        this.f163887a = mVar;
    }

    @Override // pd.d
    public void a(java.lang.Class cls, nd.d dVar) {
    }

    @Override // pd.d
    public void b(java.lang.Class cls, nd.b bVar) {
        if (cls == null || bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandComponentImpl", "registerCustomize failed, clazz(%s) or customize(%s) is null.", cls, bVar);
            return;
        }
        lm0.e eVar = this.f163887a.f163115o;
        eVar.getClass();
        eVar.a(cls, new lm0.f(bVar));
    }
}
