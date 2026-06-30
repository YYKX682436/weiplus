package c72;

/* loaded from: classes8.dex */
public class b0 extends c72.v implements c72.b {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.v0 f121069g;

    /* renamed from: h, reason: collision with root package name */
    public long f121070h = -1;

    /* renamed from: i, reason: collision with root package name */
    public float f121071i = 0.5f;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f121072m = null;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f121073n = null;

    public b0(int i17, int i18, java.lang.String str, java.lang.String str2, byte[] bArr, r45.ua3 ua3Var) {
        c72.f fVar = new c72.f();
        this.f121069g = fVar;
        c72.g gVar = (c72.g) fVar.mo47979x2d63726f();
        r45.va3 va3Var = gVar.f121085a;
        va3Var.f469560f = c72.v.f121126f;
        va3Var.f469558d = 1;
        va3Var.f469559e = i17;
        va3Var.f469562h = i18;
        va3Var.f469563i = str;
        va3Var.f469564m = str2;
        va3Var.f469565n = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        gVar.f121085a.f469566o = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(ua3Var.m75963xebb06ba0());
    }

    @Override // c72.v
    public int H(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        return mo9409x10f9447a(sVar, this.f121069g, this);
    }

    @Override // c72.v
    public r45.vt4 I(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return ((c72.h) v0Var.mo13821x7f35c2d1()).f121086a.f470540f;
    }

    @Override // c72.v
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        byte[] bArr2;
        int i27;
        int i28;
        if (i18 == 0 && i19 == 0) {
            c72.h hVar = (c72.h) v0Var.mo13821x7f35c2d1();
            r45.wa3 wa3Var = hVar.f121086a;
            this.f121070h = wa3Var.f470538d;
            this.f121071i = wa3Var.f470543i;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = wa3Var.f470539e;
            if (gVar != null) {
                this.f121072m = gVar.f273689a;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = wa3Var.f470542h;
            if (gVar2 != null) {
                this.f121073n = gVar2.f273689a;
            }
            r45.ni niVar = wa3Var.f470541g;
            if (niVar != null) {
                r45.cu5 cu5Var = niVar.f462941g;
                byte[] bArr3 = null;
                if (cu5Var == null || (i28 = cu5Var.f453372d) <= 0) {
                    bArr2 = null;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetBioConfigRsa", "summersafecdn onGYNetEnd cdnrule:%d", java.lang.Integer.valueOf(i28));
                    bArr2 = x51.j1.d(hVar.f121086a.f470541g.f462941g);
                }
                r45.cu5 cu5Var2 = hVar.f121086a.f470541g.f462942h;
                if (cu5Var2 != null && (i27 = cu5Var2.f453372d) > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetBioConfigRsa", "summersafecdn onGYNetEnd safecdnrule:%d", java.lang.Integer.valueOf(i27));
                    bArr3 = x51.j1.d(hVar.f121086a.f470541g.f462942h);
                }
                sx.y yVar = (sx.y) i95.n0.c(sx.y.class);
                r45.ni niVar2 = hVar.f121086a.f470541g;
                r45.ms msVar = niVar2.f462938d;
                r45.ms msVar2 = niVar2.f462939e;
                r45.ms msVar3 = niVar2.f462940f;
                r45.ms msVar4 = niVar2.f462943i;
                ((rx.a) yVar).getClass();
                com.p314xaae8f345.mm.p947xba6de98f.s1.cj().h(msVar, msVar2, msVar3, bArr2, bArr3, msVar4, "");
            }
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Long.valueOf(this.f121070h);
            byte[] bArr4 = this.f121072m;
            objArr[1] = java.lang.Integer.valueOf(bArr4 != null ? bArr4.length : 0);
            objArr[2] = java.lang.Float.valueOf(this.f121071i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetBioConfigRsa", "hy: get bio config: bioId: %s, bioConfigSize: %d ratio:%s", objArr);
        }
        this.f121127e.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // c72.v
    public void K(java.lang.String str) {
        ((c72.g) this.f121069g.mo47979x2d63726f()).f121085a.f469560f = str;
    }

    @Override // c72.b
    public float b() {
        float f17 = this.f121071i;
        if (f17 <= 0.0f || f17 > 1.0f) {
            this.f121071i = 0.5f;
        }
        return this.f121071i;
    }

    @Override // c72.b
    public byte[] c() {
        return this.f121072m;
    }

    @Override // c72.b
    public long g() {
        return this.f121070h;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 733;
    }

    @Override // c72.b
    public byte[] p() {
        return this.f121073n;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
    }
}
