package ug1;

/* loaded from: classes7.dex */
public final class g extends ug1.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f509026f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f509027g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f509028h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f509029i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.f f509030j;

    public g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f509026f = str;
        this.f509027g = str2;
        this.f509028h = str3;
        this.f509029i = str4;
    }

    @Override // af.b
    public java.lang.Object a(int i17) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) super.a(i17);
        if (fVar != null) {
            ug1.b.a(7);
        }
        return fVar;
    }

    @Override // af.b
    public int b() {
        return 1;
    }

    @Override // af.b
    public java.lang.Object c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 b17;
        ug1.b.a(4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preFetch: pkg download info, appId[");
        java.lang.String str = this.f509028h;
        sb6.append(str);
        sb6.append("] username[");
        java.lang.String str2 = this.f509027g;
        sb6.append(str2);
        sb6.append("] enterPath[");
        java.lang.String str3 = this.f509026f;
        sb6.append(str3);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreFetchGetDownloadInfoTask", sb6.toString());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f85971b = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j.class);
        java.lang.String z07 = jVar != null ? jVar.z0(str2) : null;
        int i17 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07) || (b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v3.b(z07, 1)) == null) ? 0 : b17.f33456x1c82a56c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreFetchGetDownloadInfoTask", "preFetch: appId[" + str + "] username[" + str2 + "], localPkgVer=" + i17);
        java.lang.String str4 = str == null ? "" : str;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str5 = str2 != null ? str2 : "";
        r45.mb5 mb5Var = new r45.mb5();
        mb5Var.f461863e = str4;
        mb5Var.f461864f = i17;
        mb5Var.f461865g = str3;
        mb5Var.f461867i = true;
        mb5Var.f461862d = str5;
        mb5Var.f461866h = 0;
        this.f509030j = new ug1.f(mb5Var, this.f509029i).t();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f85972c = currentTimeMillis;
        long j17 = currentTimeMillis - this.f85971b;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("preFetch: appId[");
        sb7.append(str);
        sb7.append("] username[");
        sb7.append(str2);
        sb7.append("] cost[");
        sb7.append(j17);
        sb7.append(" ms] ret is?=[");
        sb7.append(this.f509030j == null);
        sb7.append("], errCode=[");
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f509030j;
        sb7.append(fVar != null ? fVar.f152149b : -1);
        sb7.append("], errType=[");
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = this.f509030j;
        sb7.append(fVar2 != null ? fVar2.f152148a : -1);
        sb7.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PreFetchGetDownloadInfoTask", sb7.toString());
        return this.f509030j;
    }

    @Override // ug1.a
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 qualitySession) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qualitySession, "qualitySession");
        if (this.f509030j == null) {
            return;
        }
        long j17 = this.f85972c - this.f85971b;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7109x6e55a777 c7109x6e55a777 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7109x6e55a777();
        c7109x6e55a777.f144270d = c7109x6e55a777.b("InstanceId", qualitySession.f169667d, true);
        java.lang.String str = c7109x6e55a777.f144271e;
        if (str == null) {
            str = "";
        }
        c7109x6e55a777.f144271e = c7109x6e55a777.b("AppId", str, true);
        c7109x6e55a777.f144272f = qualitySession.f169672i;
        c7109x6e55a777.f144273g = cm.j0.a(qualitySession.f169669f);
        c7109x6e55a777.f144274h = qualitySession.f169670g;
        c7109x6e55a777.f144275i = j17;
        c7109x6e55a777.f144276j = qualitySession.f169671h;
        c7109x6e55a777.f144277k = c7109x6e55a777.f144277k;
        c7109x6e55a777.f144278l = c7109x6e55a777.f144278l;
        c7109x6e55a777.f144279m = th1.a.b(this.f509030j) ? cm.k0.ok : cm.k0.common_fail;
        c7109x6e55a777.f144280n = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.c();
        c7109x6e55a777.f144284r = c7109x6e55a777.b("NetworkTypeStr", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true);
        c7109x6e55a777.f144281o = c7109x6e55a777.b(dm.i4.f66875xa013b0d5, this.f509027g, true);
        c7109x6e55a777.f144282p = 1L;
        c7109x6e55a777.f144283q = this.f85973d ? 1L : 0L;
        c7109x6e55a777.k();
    }
}
