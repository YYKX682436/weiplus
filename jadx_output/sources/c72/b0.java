package c72;

/* loaded from: classes8.dex */
public class b0 extends c72.v implements c72.b {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f39536g;

    /* renamed from: h, reason: collision with root package name */
    public long f39537h = -1;

    /* renamed from: i, reason: collision with root package name */
    public float f39538i = 0.5f;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f39539m = null;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f39540n = null;

    public b0(int i17, int i18, java.lang.String str, java.lang.String str2, byte[] bArr, r45.ua3 ua3Var) {
        c72.f fVar = new c72.f();
        this.f39536g = fVar;
        c72.g gVar = (c72.g) fVar.getReqObj();
        r45.va3 va3Var = gVar.f39552a;
        va3Var.f388027f = c72.v.f39593f;
        va3Var.f388025d = 1;
        va3Var.f388026e = i17;
        va3Var.f388029h = i18;
        va3Var.f388030i = str;
        va3Var.f388031m = str2;
        va3Var.f388032n = com.tencent.mm.protobuf.g.b(bArr);
        gVar.f39552a.f388033o = com.tencent.mm.protobuf.g.b(ua3Var.toByteArrayOrNull());
    }

    @Override // c72.v
    public int H(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        return dispatch(sVar, this.f39536g, this);
    }

    @Override // c72.v
    public r45.vt4 I(com.tencent.mm.network.v0 v0Var) {
        return ((c72.h) v0Var.getRespObj()).f39553a.f389007f;
    }

    @Override // c72.v
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        byte[] bArr2;
        int i27;
        int i28;
        if (i18 == 0 && i19 == 0) {
            c72.h hVar = (c72.h) v0Var.getRespObj();
            r45.wa3 wa3Var = hVar.f39553a;
            this.f39537h = wa3Var.f389005d;
            this.f39538i = wa3Var.f389010i;
            com.tencent.mm.protobuf.g gVar = wa3Var.f389006e;
            if (gVar != null) {
                this.f39539m = gVar.f192156a;
            }
            com.tencent.mm.protobuf.g gVar2 = wa3Var.f389009h;
            if (gVar2 != null) {
                this.f39540n = gVar2.f192156a;
            }
            r45.ni niVar = wa3Var.f389008g;
            if (niVar != null) {
                r45.cu5 cu5Var = niVar.f381408g;
                byte[] bArr3 = null;
                if (cu5Var == null || (i28 = cu5Var.f371839d) <= 0) {
                    bArr2 = null;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetBioConfigRsa", "summersafecdn onGYNetEnd cdnrule:%d", java.lang.Integer.valueOf(i28));
                    bArr2 = x51.j1.d(hVar.f39553a.f389008g.f381408g);
                }
                r45.cu5 cu5Var2 = hVar.f39553a.f389008g.f381409h;
                if (cu5Var2 != null && (i27 = cu5Var2.f371839d) > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetBioConfigRsa", "summersafecdn onGYNetEnd safecdnrule:%d", java.lang.Integer.valueOf(i27));
                    bArr3 = x51.j1.d(hVar.f39553a.f389008g.f381409h);
                }
                sx.y yVar = (sx.y) i95.n0.c(sx.y.class);
                r45.ni niVar2 = hVar.f39553a.f389008g;
                r45.ms msVar = niVar2.f381405d;
                r45.ms msVar2 = niVar2.f381406e;
                r45.ms msVar3 = niVar2.f381407f;
                r45.ms msVar4 = niVar2.f381410i;
                ((rx.a) yVar).getClass();
                com.tencent.mm.modelcdntran.s1.cj().h(msVar, msVar2, msVar3, bArr2, bArr3, msVar4, "");
            }
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Long.valueOf(this.f39537h);
            byte[] bArr4 = this.f39539m;
            objArr[1] = java.lang.Integer.valueOf(bArr4 != null ? bArr4.length : 0);
            objArr[2] = java.lang.Float.valueOf(this.f39538i);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetBioConfigRsa", "hy: get bio config: bioId: %s, bioConfigSize: %d ratio:%s", objArr);
        }
        this.f39594e.onSceneEnd(i18, i19, str, this);
    }

    @Override // c72.v
    public void K(java.lang.String str) {
        ((c72.g) this.f39536g.getReqObj()).f39552a.f388027f = str;
    }

    @Override // c72.b
    public float b() {
        float f17 = this.f39538i;
        if (f17 <= 0.0f || f17 > 1.0f) {
            this.f39538i = 0.5f;
        }
        return this.f39538i;
    }

    @Override // c72.b
    public byte[] c() {
        return this.f39539m;
    }

    @Override // c72.b
    public long g() {
        return this.f39537h;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 733;
    }

    @Override // c72.b
    public byte[] p() {
        return this.f39540n;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
    }
}
