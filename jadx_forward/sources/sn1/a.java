package sn1;

/* loaded from: classes12.dex */
public class a extends sn1.i {

    /* renamed from: u, reason: collision with root package name */
    public final wn1.t f491499u;

    /* renamed from: v, reason: collision with root package name */
    public final wn1.u f491500v;

    /* renamed from: w, reason: collision with root package name */
    public final int f491501w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f491502x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[] f491503y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f491504z;

    public a(java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, int i17, int i18, boolean z17) {
        wn1.t tVar = new wn1.t();
        this.f491499u = tVar;
        this.f491500v = new wn1.u();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupAuthScene", "BackupAuthScene init, backupType[%d], stack:%s", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        tVar.f529011f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(kk.p.b(str.getBytes(), bArr));
        tVar.f529009d = 0;
        tVar.f529010e = str3;
        tVar.f529012g = i17;
        tVar.f529013h = z17 ? 1 : 0;
        this.f491502x = str2;
        this.f491504z = str3;
        this.f491503y = bArr;
        this.f491501w = i18;
    }

    @Override // sn1.i
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f M() {
        return this.f491499u;
    }

    @Override // sn1.i
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f N() {
        return this.f491500v;
    }

    @Override // sn1.i
    public void P(int i17) {
        wn1.u uVar = this.f491500v;
        int i18 = uVar.f529017e;
        if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupAuthScene", "onSceneEnd errType[%d]", java.lang.Integer.valueOf(i18));
            J(4, uVar.f529017e, "onSceneEnd status failed");
            kn1.q.a(kn1.m.f391168h, kn1.o.f391184g, "OnHandShake: status fail");
            return;
        }
        java.lang.String str = uVar.f529018f;
        java.lang.String str2 = this.f491504z;
        if (!str2.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupAuthScene", "onSceneEnd not the same id");
            kn1.q.a(kn1.m.f391168h, kn1.o.f391184g, "OnHandShake: wrong id");
            J(4, -1, "onSceneEnd not the same id");
            return;
        }
        byte[] bArr = uVar.f529019g.f273689a;
        byte[] bArr2 = this.f491503y;
        java.lang.String str3 = new java.lang.String((bArr == null || bArr2 == null) ? null : kk.p.a(bArr, bArr2));
        int length = str3.length();
        java.lang.String str4 = this.f491502x;
        boolean equals = length != str4.length() ? false : str3.equals(str4);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(equals);
        wn1.t tVar = this.f491499u;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupAuthScene", "onSceneEnd check ok result[%b], req supportExt:%s, resp supportExt:%s", valueOf, java.lang.Integer.valueOf(tVar.f529014i), java.lang.Integer.valueOf(uVar.f529022m));
        if (!equals) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupAuthScene", "onSceneEnd check ok failed");
            kn1.q.a(kn1.m.f391168h, kn1.o.f391184g, "OnHandShake: wrong ok");
            J(4, -3, "onSceneEnd check ok failed");
            return;
        }
        J(0, 0, "onSceneEnd auth success");
        boolean z17 = (uVar.f529022m & 32) != 0 || (tVar.f529014i & 32) == 0;
        int i19 = this.f491501w;
        if (!z17 && i19 == 1) {
            qn1.c.i().j().getClass();
        }
        if (i19 != 22 || uVar.f529020h >= 3) {
            tVar.f529011f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(kk.p.b(str4.getBytes(), bArr2));
            tVar.f529009d = 1;
            tVar.f529010e = str2;
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupAuthScene", "directSendAuthOk");
                sn1.i.S(tVar.mo14344x5f01b1f6(), 1, i17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupAuthScene", e17, "directSendAuthOk req to bur err.", new java.lang.Object[0]);
            }
        }
    }

    public void b0(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29) {
        wn1.t tVar = this.f491499u;
        if (z17) {
            tVar.f529014i |= 1;
        }
        if (z18) {
            tVar.f529014i |= 2;
        }
        if (z19) {
            tVar.f529014i |= 4;
        }
        if (z27) {
            tVar.f529014i |= 8;
        }
        if (z28) {
            tVar.f529014i |= 16;
        }
        if (z29) {
            tVar.f529014i |= 32;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1;
    }
}
