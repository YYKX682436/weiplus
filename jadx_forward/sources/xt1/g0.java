package xt1;

/* loaded from: classes15.dex */
public class g0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f538011d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f538012e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e f538013f;

    public g0(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.bc3();
        lVar.f152198b = new r45.cc3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getcardgiftinfo";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.d0.f34984x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f538011d = a17;
        r45.bc3 bc3Var = (r45.bc3) a17.f152243a.f152217a;
        bc3Var.f452198d = i17;
        bc3Var.f452199e = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f538012e = u0Var;
        return mo9409x10f9447a(sVar, this.f538011d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.d0.f34984x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCardGiftInfo", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.cc3 cc3Var = (r45.cc3) this.f538011d.f152244b.f152233a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e();
            c13037x580b4d4e.f176180d = cc3Var.f452985d;
            c13037x580b4d4e.f176181e = cc3Var.f452986e;
            c13037x580b4d4e.f176182f = cc3Var.f452987f;
            c13037x580b4d4e.f176183g = cc3Var.f452988g;
            c13037x580b4d4e.f176184h = cc3Var.f452989h;
            c13037x580b4d4e.f176185i = cc3Var.f452990i;
            c13037x580b4d4e.f176186m = cc3Var.f452991m;
            c13037x580b4d4e.f176187n = cc3Var.f452992n;
            c13037x580b4d4e.f176189p = cc3Var.f452994p;
            c13037x580b4d4e.f176188o = cc3Var.f452993o;
            c13037x580b4d4e.f176191q = cc3Var.f452995q;
            c13037x580b4d4e.f176192r = cc3Var.f452996r;
            c13037x580b4d4e.f176193s = cc3Var.f452997s;
            c13037x580b4d4e.f176194t = cc3Var.f452998t;
            c13037x580b4d4e.f176195u = cc3Var.f452999u;
            c13037x580b4d4e.f176196v = cc3Var.f453004z;
            c13037x580b4d4e.f176197w = cc3Var.f453000v;
            c13037x580b4d4e.f176198x = cc3Var.f453001w;
            c13037x580b4d4e.f176200y = cc3Var.f453002x;
            c13037x580b4d4e.f176201z = cc3Var.f453003y;
            c13037x580b4d4e.A = cc3Var.A;
            c13037x580b4d4e.B = cc3Var.B;
            c13037x580b4d4e.C = cc3Var.C;
            c13037x580b4d4e.D = cc3Var.D;
            c13037x580b4d4e.E = cc3Var.E;
            c13037x580b4d4e.F = cc3Var.F;
            c13037x580b4d4e.G = cc3Var.G;
            c13037x580b4d4e.H = cc3Var.H;
            c13037x580b4d4e.I = cc3Var.I;
            c13037x580b4d4e.f176179J = cc3Var.f452984J;
            c13037x580b4d4e.K = cc3Var.K;
            c13037x580b4d4e.L = cc3Var.L;
            c13037x580b4d4e.R = cc3Var.N;
            c13037x580b4d4e.S = cc3Var.P;
            c13037x580b4d4e.T = cc3Var.Q;
            c13037x580b4d4e.U = cc3Var.R;
            c13037x580b4d4e.V = cc3Var.S;
            c13037x580b4d4e.W = cc3Var.T;
            c13037x580b4d4e.X = cc3Var.U;
            c13037x580b4d4e.Y = cc3Var.V;
            c13037x580b4d4e.f176190p0 = cc3Var.X;
            c13037x580b4d4e.Z = cc3Var.W;
            c13037x580b4d4e.f176199x0 = cc3Var.Y;
            this.f538013f = c13037x580b4d4e;
            c13037x580b4d4e.m54441x9616526c();
        }
        this.f538012e.mo815x76e0bfae(i18, i19, str, this);
    }
}
