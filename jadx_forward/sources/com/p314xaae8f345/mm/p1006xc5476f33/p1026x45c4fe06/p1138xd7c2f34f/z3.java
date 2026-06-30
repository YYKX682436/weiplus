package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class z3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.me3[] f166986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 f166987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 f166988c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f166989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4 f166990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m81.c[] f166991f;

    public z3(r45.me3[] me3VarArr, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4 f4Var, m81.c[] cVarArr) {
        this.f166986a = me3VarArr;
        this.f166987b = z6Var;
        this.f166988c = q4Var;
        this.f166989d = i17;
        this.f166990e = f4Var;
        this.f166991f = cVarArr;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.me3[] me3VarArr = this.f166986a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(me3VarArr, "<this>");
        r45.me3 me3Var = me3VarArr[1];
        java.lang.String str = me3Var != null ? me3Var.f461932e : null;
        if (!(str == null || str.length() == 0)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(me3Var);
            km5.b c17 = km5.u.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CommonPkgFetcher", "Downloader.tryZstd with " + this.f166987b);
            m81.b[] bVarArr = new m81.b[1];
            java.lang.String str2 = me3Var.f461932e;
            java.lang.String m49244x9616526c = this.f166988c.f166600j.m49244x9616526c();
            int i17 = this.f166989d;
            int i18 = this.f166987b.f166997g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var = this.f166988c;
            r45.y50 y50Var = q4Var.f166594d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y3 y3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y3(q4Var, this.f166990e, this.f166991f, me3Var, c17, bVarArr);
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.gc.f157090a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.fc fcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.fc(str2, m49244x9616526c, i17, i18, y3Var);
            fcVar.f406224o = y50Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.fc fcVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.Ui(fcVar, y3Var) ? fcVar : null;
            bVarArr[0] = fcVar2;
            if (fcVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.CommonPkgFetcher", "Downloader.tryZstd failed with " + this.f166987b);
                c17.mo143715xc84dc82d();
            } else {
                fcVar2.f157072r = me3Var.f461940p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fcVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.WxaZstdPkgDownloadRequest");
                java.lang.String c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y6.c(this.f166986a);
                java.lang.String str3 = "";
                if (c18 == null) {
                    c18 = "";
                }
                fcVar2.f157073s = c18;
                m81.b bVar = bVarArr[0];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(bVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.WxaZstdPkgDownloadRequest");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.fc fcVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.fc) bVar;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y6.b(this.f166986a) != 0) {
                    str3 = java.lang.String.format("%08x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y6.b(this.f166986a))}, 1));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "format(...)");
                }
                fcVar3.f157074t = str3;
                this.f166988c.f166604n.add(bVarArr[0]);
            }
        }
        return jz5.f0.f384359a;
    }
}
