package q81;

/* loaded from: classes7.dex */
public class c extends q81.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.o f442228a;

    /* renamed from: b, reason: collision with root package name */
    public final int f442229b;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.o oVar) {
        this.f442228a = oVar;
        this.f442229b = oVar != null ? oVar.f157407p : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0166, code lost:
    
        if ((r8 ? r0.mo9952xce0038c9(r7, new java.lang.String[0]) : r0.mo880xb970c2b9(r7)) != false) goto L47;
     */
    @Override // q81.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r12, java.lang.String r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q81.c.b(java.lang.String, java.lang.String, java.lang.Object):java.lang.Object");
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        return ((r45.ff7) obj).f455824d;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdGetCode";
    }

    @Override // q81.a
    public boolean f() {
        boolean z17;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.u0.wi() == null) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
        if (a17 != null) {
            z17 = a17.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl.CanRetryOnGetCodeSequenceNotChangedForScene:" + this.f442229b, false);
        } else {
            z17 = false;
        }
        return z17;
    }
}
