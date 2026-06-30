package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes13.dex */
public class f2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f180420d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f180421e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f180422f;

    /* renamed from: g, reason: collision with root package name */
    public final long f180423g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f180424h;

    /* renamed from: i, reason: collision with root package name */
    public final long f180425i;

    public f2(long j17, java.lang.String str, java.lang.String str2, long j18) {
        this.f180423g = j17;
        this.f180424h = str;
        this.f180422f = str2;
        this.f180425i = j18;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f180420d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ki();
        lVar.f152198b = new r45.li();
        lVar.f152199c = "/cgi-bin/mmoc-bin/hardware/bindunauthdevice";
        lVar.f152200d = 1262;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f180421e = a17;
        r45.ki kiVar = (r45.ki) a17.f152243a.f152217a;
        kiVar.f460240f = a42.i.g(this.f180423g);
        kiVar.f460239e = this.f180424h;
        kiVar.f460238d = this.f180422f;
        kiVar.f460241g = this.f180425i;
        return mo9409x10f9447a(sVar, this.f180421e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1262;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.String str2;
        java.lang.String str3;
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindUnauthDevice", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + str);
        if (i18 == 0 && i19 == 0) {
            r45.li liVar = (r45.li) this.f180421e.f152244b.f152233a;
            r45.nv3 nv3Var = liVar.f461029d;
            if (nv3Var != null) {
                str2 = nv3Var.f463225e;
                str3 = nv3Var.f463224d;
            } else {
                str2 = null;
                str3 = null;
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().d1(str3, str2) != null) {
                z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().y0(str2, str3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBindUnauthDevice", "delete local deviceinfo : %s, ret : %b", str3, java.lang.Boolean.valueOf(z17));
            } else {
                z17 = true;
            }
            v32.b bVar = new v32.b();
            bVar.f66604x76f6f117 = this.f180422f;
            bVar.f66605xb06879e4 = 1;
            bVar.f66603x2e78a306 = 1;
            bVar.f66613x4b6e88aa = "";
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.q0.a(bVar, nv3Var, liVar.f461030e);
            if (bVar.f66609x4b6e688a == 0) {
                bVar.f66609x4b6e688a = this.f180423g;
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().mo880xb970c2b9(bVar);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().i1(bVar);
            }
        }
        this.f180420d.mo815x76e0bfae(i18, i19, str, this);
    }
}
