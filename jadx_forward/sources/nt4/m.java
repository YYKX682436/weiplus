package nt4;

/* loaded from: classes9.dex */
public class m extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f421375d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f421376e;

    /* renamed from: f, reason: collision with root package name */
    public r45.oy3 f421377f;

    /* renamed from: g, reason: collision with root package name */
    public r45.py3 f421378g;

    public m(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, int i19, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.q93();
        lVar.f152198b = new r45.r93();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/boss/getandroidiappackage";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.z.f34666x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 1;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f421375d = a17;
        r45.q93 q93Var = (r45.q93) a17.f152243a.f152217a;
        q93Var.f465303e = str;
        q93Var.f465302d = i17;
        q93Var.f465305g = java.lang.Integer.parseInt(str2);
        q93Var.f465304f = str3;
        q93Var.f465307i = i18;
        q93Var.f465308m = i19;
        q93Var.f465306h = str4;
        q93Var.f465309n = str5;
        q93Var.f465310o = str6;
        q93Var.f465311p = str7;
        q93Var.f465313r = str8;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f421376e = u0Var;
        return mo9409x10f9447a(sVar, this.f421375d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.z.f34666x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAndroidIapPackage", "ErrType:" + i18 + ",errCode:" + i19 + ",errMsg:" + str);
        if (i18 != 0 || i19 != 0) {
            this.f421376e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.r93 r93Var = (r45.r93) this.f421375d.f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetAndroidIapPackage", "business: errCode:" + r93Var.f466187d + ",errMsg:" + r93Var.f466188e);
        int i27 = r93Var.f466187d;
        java.lang.String str2 = r93Var.f466188e;
        if (i27 == 0) {
            this.f421377f = r93Var.f466189f;
            this.f421378g = r93Var.f466190g;
        }
        this.f421376e.mo815x76e0bfae(i18, i27, str2, this);
    }
}
