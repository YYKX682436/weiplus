package q81;

/* loaded from: classes7.dex */
public class v implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f442256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q81.u f442257b;

    public v(q81.u uVar, km5.b bVar) {
        this.f442257b = uVar;
        this.f442256a = bVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6 n6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n6.class);
            q81.u uVar = this.f442257b;
            t81.c cVar = uVar.f442251a;
            boolean h17 = q81.n.h(n6Var.D0(cVar.f67698x28d45f97, cVar.f67715x2262335f, cVar.f67716x8987ca93), q81.m.GET_CODE);
            t81.c cVar2 = uVar.f442251a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "record(%s %d %d) download ok, decryptResult %b", cVar2.f67698x28d45f97, java.lang.Integer.valueOf(cVar2.f67715x2262335f), java.lang.Integer.valueOf(cVar2.f67716x8987ca93), java.lang.Boolean.valueOf(h17));
        }
        this.f442256a.mo143715xc84dc82d();
        return null;
    }
}
