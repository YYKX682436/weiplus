package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4;

/* loaded from: classes7.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f157336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 f157337f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.m6 f157338g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.m6 m6Var) {
        super(1);
        this.f157335d = str;
        this.f157336e = i17;
        this.f157337f = o6Var;
        this.f157338g = m6Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6 response = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.InterfaceC11654xe38d2811 interfaceC11654xe38d2811 = response.f166425a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 L = Di.L(this.f157335d, interfaceC11654xe38d2811.mo49191x1c82a56c(), this.f157336e, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgDownloaderExportServiceImpl", "startDownloadPkg, onSuccess, request:" + this.f157337f + ", respsonse:" + response);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.m6 m6Var = this.f157338g;
        if (m6Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(L);
            java.lang.String mo49190xe121c411 = interfaceC11654xe38d2811.mo49190xe121c411();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo49190xe121c411);
            m6Var.a(L, mo49190xe121c411);
        }
        return jz5.f0.f384359a;
    }
}
