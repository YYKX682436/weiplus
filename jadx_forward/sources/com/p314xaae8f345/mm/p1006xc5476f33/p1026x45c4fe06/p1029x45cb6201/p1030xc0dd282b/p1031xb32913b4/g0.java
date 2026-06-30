package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.p1031xb32913b4;

/* loaded from: classes7.dex */
public final class g0 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l6 f157324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km5.b f157325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157326f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f157327g;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l6 l6Var, km5.b bVar, java.lang.String str, int i17) {
        this.f157324d = l6Var;
        this.f157325e = bVar;
        this.f157326f = str;
        this.f157327g = i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.bc7 bc7Var;
        r45.bc7 bc7Var2;
        r45.bc7 bc7Var3;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        java.lang.String str2 = null;
        r45.i00 i00Var = fVar instanceof r45.i00 ? (r45.i00) fVar : null;
        km5.b bVar = this.f157325e;
        if (i17 == 0 && i18 == 0) {
            if ((i00Var == null || (bc7Var3 = i00Var.f458136d) == null || bc7Var3.f452202d != 0) ? false : true) {
                if (i00Var.f458137e) {
                    java.lang.String str3 = i00Var.f458139g;
                    if (!(str3 == null || str3.length() == 0)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o oVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o.class);
                        java.lang.String str4 = this.f157326f;
                        int i19 = this.f157327g;
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(i00Var.f458139g, oVar2.z0(str4, i19))) {
                            java.lang.String str5 = i00Var.f458138f;
                            if (!(str5 == null || str5.length() == 0)) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().k(this.f157326f, this.f157327g, i00Var.f458138f, i00Var.f458139g, 0L, 0L);
                            }
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a5.class)).D0(str4, i19, i00Var.f458143n, true);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o oVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o.class);
                            java.lang.String new_demo_md5 = i00Var.f458139g;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(new_demo_md5, "new_demo_md5");
                            oVar3.D0(str4, i19, new_demo_md5);
                        }
                    }
                }
                bVar.c(java.lang.Boolean.TRUE);
                return 0;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startDownloadPkg, waitFor demo info failed, errType:");
        sb6.append(i17);
        sb6.append(", errCode:");
        sb6.append(i18);
        sb6.append(", errMsg:");
        sb6.append(str);
        sb6.append(", wxaapp_baseresponse:{ErrCode:");
        sb6.append((i00Var == null || (bc7Var2 = i00Var.f458136d) == null) ? null : java.lang.Integer.valueOf(bc7Var2.f452202d));
        sb6.append(", ErrMsg:");
        if (i00Var != null && (bc7Var = i00Var.f458136d) != null) {
            str2 = bc7Var.f452203e;
        }
        sb6.append(str2);
        sb6.append('}');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgDownloaderExportServiceImpl", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l6 l6Var = this.f157324d;
        if (l6Var != null) {
            l6Var.a(i18, str);
        }
        bVar.a(new java.lang.Exception());
        return 0;
    }
}
