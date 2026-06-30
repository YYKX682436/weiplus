package g21;

/* loaded from: classes5.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, kd0.j2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f349317d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f349318e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f349319f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f349320g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f349321h;

    /* renamed from: i, reason: collision with root package name */
    public int f349322i;

    /* renamed from: m, reason: collision with root package name */
    public int f349323m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f349324n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f349325o;

    /* renamed from: p, reason: collision with root package name */
    public int f349326p;

    public a(java.lang.String str, int i17, int i18) {
        this(str, i17, i18, "");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f349318e = u0Var;
        return mo9409x10f9447a(sVar, this.f349317d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return be1.r0.f4232x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f349317d;
            r45.cm3 cm3Var = (r45.cm3) oVar.f152243a.f152217a;
            r45.dm3 dm3Var = (r45.dm3) oVar.f152244b.f152233a;
            java.lang.String g17 = x51.j1.g(cm3Var.f453196d);
            this.f349321h = x51.j1.e(dm3Var.f454093d, new byte[0]);
            java.lang.String str2 = dm3Var.f454095f;
            this.f349319f = str2;
            this.f349323m = dm3Var.f454099m;
            this.f349324n = dm3Var.f454100n;
            int i27 = dm3Var.f454094e;
            this.f349322i = i27;
            java.lang.String str3 = dm3Var.f454098i;
            if (str3 == null) {
                str3 = "";
            }
            this.f349325o = str3;
            this.f349326p = dm3Var.f454101o;
            java.lang.Object[] objArr = new java.lang.Object[7];
            objArr[0] = str2;
            objArr[1] = dm3Var.f454096g;
            objArr[2] = dm3Var.f454097h;
            objArr[3] = java.lang.Integer.valueOf(i27);
            objArr[4] = this.f349325o;
            byte[] bArr2 = this.f349321h;
            objArr[5] = java.lang.Integer.valueOf(bArr2 != null ? bArr2.length : 0);
            objArr[6] = java.lang.Integer.valueOf(this.f349326p);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetQRCode", "expiredWording:%s, revokeId:%s, revokeWording:%s respStyle:%s respQrUrl:%s, qrcodeBuf.size: %s, respQrStatus: %s", objArr);
            if (c01.z1.r().equals(g17)) {
                java.lang.String str4 = dm3Var.f454096g;
                java.lang.String str5 = (java.lang.String) gm0.j1.u().c().l(66563, "");
                if (str4 != null && !str5.equals(str4)) {
                    gm0.j1.u().c().w(66563, str4);
                    this.f349320g = dm3Var.f454097h;
                }
            }
        }
        this.f349318e.mo815x76e0bfae(i18, i19, str, this);
    }

    public a(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f349318e = null;
        this.f349319f = null;
        this.f349320g = null;
        this.f349321h = null;
        this.f349322i = 0;
        this.f349323m = 0;
        this.f349324n = null;
        this.f349325o = "";
        this.f349326p = 0;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.cm3();
        lVar.f152198b = new r45.dm3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getqrcode";
        lVar.f152200d = be1.r0.f4232x366c91de;
        lVar.f152201e = 67;
        lVar.f152202f = 1000000067;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f349317d = a17;
        r45.cm3 cm3Var = (r45.cm3) a17.f152243a.f152217a;
        cm3Var.f453196d = x51.j1.i(str);
        cm3Var.f453197e = i17;
        cm3Var.f453198f = i18;
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = str2 != null ? str2 : "";
        du5Var.f454290e = true;
        cm3Var.f453199g = du5Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetQRCode", "username:%s, style:%d, opcode:%d, url:%s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
    }
}
