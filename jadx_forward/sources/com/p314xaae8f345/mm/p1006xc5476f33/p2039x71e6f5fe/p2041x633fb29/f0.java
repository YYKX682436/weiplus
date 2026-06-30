package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes4.dex */
public class f0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f240431d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f240432e;

    /* renamed from: f, reason: collision with root package name */
    public final int f240433f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f240434g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240435h;

    public f0(int i17, java.lang.String str, int i18, int i19, int i27, r45.im imVar) {
        this.f240434g = "";
        this.f240435h = false;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.em();
        lVar.f152198b = new r45.fm();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/usrmsg/bizscanbarcode";
        lVar.f152200d = 1061;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f240432e = a17;
        r45.em emVar = (r45.em) a17.f152243a.f152217a;
        emVar.f455129d = i17;
        emVar.f455130e = str;
        emVar.f455131f = H(i27);
        emVar.f455132g = i19;
        emVar.f455133h = imVar;
        this.f240433f = i18;
    }

    public final int H(int i17) {
        if (i17 == 1 || i17 == 9) {
            return 3;
        }
        if (i17 != 99) {
            return (i17 == 5 || i17 == 6 || i17 == 13 || i17 == 14 || i17 == 16 || i17 == 17) ? 1 : 0;
        }
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f240431d = u0Var;
        return mo9409x10f9447a(sVar, this.f240432e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1061;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f240431d.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        java.lang.String str;
        r45.em emVar = (r45.em) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152243a.f152217a;
        if (emVar.f455129d >= 0 && (str = emVar.f455130e) != null && str.length() > 0) {
            return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.scanner.NetSceneScanBarcode", "securityVerificationChecked failed, Type = " + emVar.f455129d + ", Barcode = %s" + emVar.f455130e);
        return com.p314xaae8f345.mm.p944x882e457a.o1.EFailed;
    }

    public f0(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, r45.im imVar) {
        this.f240434g = "";
        this.f240435h = false;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.em();
        lVar.f152198b = new r45.fm();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/usrmsg/bizscanbarcode";
        lVar.f152200d = 1061;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f240432e = a17;
        r45.em emVar = (r45.em) a17.f152243a.f152217a;
        emVar.f455129d = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.a(str);
        emVar.f455130e = str2;
        emVar.f455131f = H(i19);
        emVar.f455132g = i18;
        emVar.f455133h = imVar;
        this.f240433f = i17;
        this.f240434g = str2;
    }
}
