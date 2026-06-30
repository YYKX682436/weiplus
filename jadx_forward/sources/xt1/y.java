package xt1;

/* loaded from: classes15.dex */
public class y extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f538138d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f538139e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e f538140f;

    public y(int i17, java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.x0();
        lVar.f152198b = new r45.y0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/acceptgiftcard";
        lVar.f152200d = 1136;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f538138d = a17;
        r45.x0 x0Var = (r45.x0) a17.f152243a.f152217a;
        x0Var.f471146d = i17;
        x0Var.f471147e = str;
        x0Var.f471148f = str2;
        x0Var.f471149g = bool.booleanValue();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f538139e = u0Var;
        return mo9409x10f9447a(sVar, this.f538138d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1136;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneAcceptGiftCard", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.y0 y0Var = (r45.y0) this.f538138d.f152244b.f152233a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e();
            c13037x580b4d4e.f176180d = y0Var.f472177d;
            c13037x580b4d4e.f176181e = y0Var.f472178e;
            c13037x580b4d4e.f176182f = y0Var.f472179f;
            c13037x580b4d4e.f176183g = y0Var.f472180g;
            c13037x580b4d4e.f176184h = y0Var.f472181h;
            c13037x580b4d4e.f176185i = y0Var.f472182i;
            c13037x580b4d4e.f176186m = y0Var.f472183m;
            c13037x580b4d4e.f176187n = y0Var.f472184n;
            c13037x580b4d4e.f176189p = y0Var.f472186p;
            c13037x580b4d4e.f176188o = y0Var.f472185o;
            c13037x580b4d4e.f176191q = y0Var.f472188q;
            c13037x580b4d4e.f176192r = y0Var.f472189r;
            c13037x580b4d4e.f176193s = y0Var.f472190s;
            c13037x580b4d4e.f176194t = y0Var.f472191t;
            c13037x580b4d4e.f176195u = y0Var.f472192u;
            c13037x580b4d4e.f176196v = y0Var.f472198z;
            c13037x580b4d4e.f176197w = y0Var.f472193v;
            c13037x580b4d4e.f176198x = y0Var.f472194w;
            c13037x580b4d4e.f176200y = y0Var.f472195x;
            c13037x580b4d4e.f176201z = y0Var.f472197y;
            c13037x580b4d4e.A = y0Var.A;
            c13037x580b4d4e.B = y0Var.B;
            c13037x580b4d4e.C = y0Var.C;
            c13037x580b4d4e.D = y0Var.D;
            c13037x580b4d4e.E = y0Var.E;
            c13037x580b4d4e.F = y0Var.F;
            c13037x580b4d4e.G = y0Var.G;
            c13037x580b4d4e.H = y0Var.H;
            c13037x580b4d4e.I = y0Var.I;
            c13037x580b4d4e.f176179J = y0Var.f472176J;
            c13037x580b4d4e.K = y0Var.K;
            c13037x580b4d4e.L = y0Var.L;
            java.util.Iterator it = y0Var.M.iterator();
            while (it.hasNext()) {
                r45.z0 z0Var = (r45.z0) it.next();
                java.util.LinkedList linkedList = c13037x580b4d4e.M;
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AcceptedCardItem acceptedCardItem = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AcceptedCardItem();
                acceptedCardItem.f176203e = z0Var.f473095e;
                acceptedCardItem.f176202d = z0Var.f473094d;
                linkedList.add(acceptedCardItem);
            }
            java.util.Iterator it6 = y0Var.N.iterator();
            while (it6.hasNext()) {
                r45.a1 a1Var = (r45.a1) it6.next();
                java.util.LinkedList linkedList2 = c13037x580b4d4e.N;
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AccepterItem accepterItem = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AccepterItem();
                accepterItem.f176205e = a1Var.f451150e;
                accepterItem.f176204d = a1Var.f451149d;
                accepterItem.f176207g = a1Var.f451152g;
                accepterItem.f176206f = a1Var.f451151f;
                linkedList2.add(accepterItem);
            }
            c13037x580b4d4e.P = y0Var.P;
            c13037x580b4d4e.Q = y0Var.Q;
            c13037x580b4d4e.R = y0Var.R;
            c13037x580b4d4e.S = y0Var.S;
            c13037x580b4d4e.T = y0Var.T;
            c13037x580b4d4e.U = y0Var.U;
            c13037x580b4d4e.V = y0Var.V;
            c13037x580b4d4e.W = y0Var.W;
            c13037x580b4d4e.X = y0Var.X;
            c13037x580b4d4e.Y = y0Var.Y;
            c13037x580b4d4e.f176190p0 = y0Var.f472187p0;
            c13037x580b4d4e.Z = y0Var.Z;
            c13037x580b4d4e.f176199x0 = y0Var.f472196x0;
            this.f538140f = c13037x580b4d4e;
            c13037x580b4d4e.m54441x9616526c();
        }
        this.f538139e.mo815x76e0bfae(i18, i19, str, this);
    }
}
