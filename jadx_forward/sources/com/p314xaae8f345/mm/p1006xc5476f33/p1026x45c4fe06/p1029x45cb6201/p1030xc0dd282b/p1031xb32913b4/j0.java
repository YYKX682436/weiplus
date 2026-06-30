package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4;

/* loaded from: classes7.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 f157343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l6 f157344e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l6 l6Var) {
        super(2);
        this.f157343d = o6Var;
        this.f157344e = l6Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6 err = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6) obj;
        java.lang.String str = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err, "err");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startDownloadPkg, onError, request:");
        sb6.append(this.f157343d);
        sb6.append(", errCode:");
        int i17 = err.f166030d;
        sb6.append(i17);
        sb6.append(", errMsg:");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgDownloaderExportServiceImpl", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l6 l6Var = this.f157344e;
        if (l6Var != null) {
            l6Var.a(i17, str);
        }
        return jz5.f0.f384359a;
    }
}
