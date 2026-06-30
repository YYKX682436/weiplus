package bw5;

/* loaded from: classes2.dex */
public class lj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public bw5.sh A;
    public int A1;
    public bw5.jj B;
    public bw5.m30 B1;
    public int C;
    public bw5.ai C1;
    public bw5.oh D;
    public bw5.hi D1;
    public bw5.wi E;
    public bw5.rh E1;
    public bw5.vi F;
    public bw5.th F1;
    public bw5.yh G;
    public final boolean[] G1 = new boolean[67];
    public bw5.si H;
    public bw5.nj I;

    /* renamed from: J, reason: collision with root package name */
    public bw5.qi f111331J;
    public bw5.lh K;
    public boolean L;
    public bw5.xh M;
    public bw5.oi N;
    public bw5.zh P;
    public bw5.di Q;
    public bw5.mh R;
    public bw5.uh S;
    public bw5.vh T;
    public bw5.fi U;
    public int V;
    public int W;
    public bw5.ni X;
    public bw5.pi Y;
    public int Z;

    /* renamed from: d, reason: collision with root package name */
    public int f111332d;

    /* renamed from: e, reason: collision with root package name */
    public int f111333e;

    /* renamed from: f, reason: collision with root package name */
    public int f111334f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.cj f111335g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.li f111336h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.ti f111337i;

    /* renamed from: l1, reason: collision with root package name */
    public bw5.hi0 f111338l1;

    /* renamed from: m, reason: collision with root package name */
    public bw5.qh f111339m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.yi f111340n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.wh f111341o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.wh f111342p;

    /* renamed from: p0, reason: collision with root package name */
    public bw5.ci f111343p0;

    /* renamed from: p1, reason: collision with root package name */
    public bw5.ej f111344p1;

    /* renamed from: q, reason: collision with root package name */
    public bw5.bi f111345q;

    /* renamed from: r, reason: collision with root package name */
    public int f111346r;

    /* renamed from: s, reason: collision with root package name */
    public int f111347s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.ph f111348t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.ki f111349u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.kh f111350v;

    /* renamed from: w, reason: collision with root package name */
    public int f111351w;

    /* renamed from: x, reason: collision with root package name */
    public int f111352x;

    /* renamed from: x0, reason: collision with root package name */
    public bw5.wa f111353x0;

    /* renamed from: x1, reason: collision with root package name */
    public bw5.oj f111354x1;

    /* renamed from: y, reason: collision with root package name */
    public int f111355y;

    /* renamed from: y0, reason: collision with root package name */
    public bw5.zz f111356y0;

    /* renamed from: y1, reason: collision with root package name */
    public bw5.kg0 f111357y1;

    /* renamed from: z, reason: collision with root package name */
    public bw5.xi f111358z;

    /* renamed from: z1, reason: collision with root package name */
    public int f111359z1;

    static {
        new bw5.lj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lj mo11468x92b714fd(byte[] bArr) {
        return (bw5.lj) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lj)) {
            return false;
        }
        bw5.lj ljVar = (bw5.lj) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f111332d), java.lang.Integer.valueOf(ljVar.f111332d)) && n51.f.a(java.lang.Integer.valueOf(this.f111333e), java.lang.Integer.valueOf(ljVar.f111333e)) && n51.f.a(java.lang.Integer.valueOf(this.f111334f), java.lang.Integer.valueOf(ljVar.f111334f)) && n51.f.a(this.f111335g, ljVar.f111335g) && n51.f.a(this.f111336h, ljVar.f111336h) && n51.f.a(this.f111337i, ljVar.f111337i) && n51.f.a(this.f111339m, ljVar.f111339m) && n51.f.a(this.f111340n, ljVar.f111340n) && n51.f.a(this.f111341o, ljVar.f111341o) && n51.f.a(this.f111342p, ljVar.f111342p) && n51.f.a(this.f111345q, ljVar.f111345q) && n51.f.a(java.lang.Integer.valueOf(this.f111346r), java.lang.Integer.valueOf(ljVar.f111346r)) && n51.f.a(java.lang.Integer.valueOf(this.f111347s), java.lang.Integer.valueOf(ljVar.f111347s)) && n51.f.a(this.f111348t, ljVar.f111348t) && n51.f.a(this.f111349u, ljVar.f111349u) && n51.f.a(this.f111350v, ljVar.f111350v) && n51.f.a(java.lang.Integer.valueOf(this.f111351w), java.lang.Integer.valueOf(ljVar.f111351w)) && n51.f.a(java.lang.Integer.valueOf(this.f111352x), java.lang.Integer.valueOf(ljVar.f111352x)) && n51.f.a(java.lang.Integer.valueOf(this.f111355y), java.lang.Integer.valueOf(ljVar.f111355y)) && n51.f.a(this.f111358z, ljVar.f111358z) && n51.f.a(this.A, ljVar.A) && n51.f.a(this.B, ljVar.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(ljVar.C)) && n51.f.a(this.D, ljVar.D) && n51.f.a(this.E, ljVar.E) && n51.f.a(this.F, ljVar.F) && n51.f.a(this.G, ljVar.G) && n51.f.a(this.H, ljVar.H) && n51.f.a(this.I, ljVar.I) && n51.f.a(this.f111331J, ljVar.f111331J) && n51.f.a(this.K, ljVar.K) && n51.f.a(java.lang.Boolean.valueOf(this.L), java.lang.Boolean.valueOf(ljVar.L)) && n51.f.a(this.M, ljVar.M) && n51.f.a(this.N, ljVar.N) && n51.f.a(this.P, ljVar.P) && n51.f.a(this.Q, ljVar.Q) && n51.f.a(this.R, ljVar.R) && n51.f.a(this.S, ljVar.S) && n51.f.a(this.T, ljVar.T) && n51.f.a(this.U, ljVar.U) && n51.f.a(java.lang.Integer.valueOf(this.V), java.lang.Integer.valueOf(ljVar.V)) && n51.f.a(java.lang.Integer.valueOf(this.W), java.lang.Integer.valueOf(ljVar.W)) && n51.f.a(this.X, ljVar.X) && n51.f.a(this.Y, ljVar.Y) && n51.f.a(java.lang.Integer.valueOf(this.Z), java.lang.Integer.valueOf(ljVar.Z)) && n51.f.a(this.f111343p0, ljVar.f111343p0) && n51.f.a(this.f111353x0, ljVar.f111353x0) && n51.f.a(this.f111356y0, ljVar.f111356y0) && n51.f.a(this.f111338l1, ljVar.f111338l1) && n51.f.a(this.f111344p1, ljVar.f111344p1) && n51.f.a(this.f111354x1, ljVar.f111354x1) && n51.f.a(this.f111357y1, ljVar.f111357y1) && n51.f.a(java.lang.Integer.valueOf(this.f111359z1), java.lang.Integer.valueOf(ljVar.f111359z1)) && n51.f.a(java.lang.Integer.valueOf(this.A1), java.lang.Integer.valueOf(ljVar.A1)) && n51.f.a(this.B1, ljVar.B1) && n51.f.a(this.C1, ljVar.C1) && n51.f.a(this.D1, ljVar.D1) && n51.f.a(this.E1, ljVar.E1) && n51.f.a(this.F1, ljVar.F1);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.G1;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.f(1, this.f111332d);
            }
            if (zArr[2]) {
                fVar.f(2, this.f111333e);
            }
            if (zArr[3]) {
                fVar.f(3, this.f111334f);
            }
            bw5.cj cjVar = this.f111335g;
            if (cjVar != null && zArr[4]) {
                fVar.i(4, cjVar.mo75928xcd1e8d8());
                this.f111335g.mo75956x3d5d1f78(fVar);
            }
            bw5.li liVar = this.f111336h;
            if (liVar != null && zArr[5]) {
                fVar.i(5, liVar.mo75928xcd1e8d8());
                this.f111336h.mo75956x3d5d1f78(fVar);
            }
            bw5.ti tiVar = this.f111337i;
            if (tiVar != null && zArr[6]) {
                fVar.i(6, tiVar.mo75928xcd1e8d8());
                this.f111337i.mo75956x3d5d1f78(fVar);
            }
            bw5.qh qhVar = this.f111339m;
            if (qhVar != null && zArr[7]) {
                fVar.i(7, qhVar.mo75928xcd1e8d8());
                this.f111339m.mo75956x3d5d1f78(fVar);
            }
            bw5.yi yiVar = this.f111340n;
            if (yiVar != null && zArr[8]) {
                fVar.i(8, yiVar.mo75928xcd1e8d8());
                this.f111340n.mo75956x3d5d1f78(fVar);
            }
            bw5.wh whVar = this.f111341o;
            if (whVar != null && zArr[9]) {
                fVar.i(9, whVar.mo75928xcd1e8d8());
                this.f111341o.mo75956x3d5d1f78(fVar);
            }
            bw5.wh whVar2 = this.f111342p;
            if (whVar2 != null && zArr[10]) {
                fVar.i(10, whVar2.mo75928xcd1e8d8());
                this.f111342p.mo75956x3d5d1f78(fVar);
            }
            bw5.bi biVar = this.f111345q;
            if (biVar != null && zArr[11]) {
                fVar.i(11, biVar.mo75928xcd1e8d8());
                this.f111345q.mo75956x3d5d1f78(fVar);
            }
            if (zArr[12]) {
                fVar.f(12, this.f111346r);
            }
            if (zArr[13]) {
                fVar.f(13, this.f111347s);
            }
            bw5.ph phVar = this.f111348t;
            if (phVar != null && zArr[14]) {
                fVar.i(14, phVar.mo75928xcd1e8d8());
                this.f111348t.mo75956x3d5d1f78(fVar);
            }
            bw5.ki kiVar = this.f111349u;
            if (kiVar != null && zArr[15]) {
                fVar.i(15, kiVar.mo75928xcd1e8d8());
                this.f111349u.mo75956x3d5d1f78(fVar);
            }
            bw5.kh khVar = this.f111350v;
            if (khVar != null && zArr[16]) {
                fVar.i(16, khVar.mo75928xcd1e8d8());
                this.f111350v.mo75956x3d5d1f78(fVar);
            }
            if (zArr[17]) {
                fVar.f(17, this.f111351w);
            }
            if (zArr[18]) {
                fVar.f(18, this.f111352x);
            }
            if (zArr[19]) {
                fVar.f(19, this.f111355y);
            }
            bw5.xi xiVar = this.f111358z;
            if (xiVar != null && zArr[20]) {
                fVar.i(20, xiVar.mo75928xcd1e8d8());
                this.f111358z.mo75956x3d5d1f78(fVar);
            }
            bw5.sh shVar = this.A;
            if (shVar != null && zArr[21]) {
                fVar.i(21, shVar.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            bw5.jj jjVar = this.B;
            if (jjVar != null && zArr[22]) {
                fVar.i(22, jjVar.mo75928xcd1e8d8());
                this.B.mo75956x3d5d1f78(fVar);
            }
            if (zArr[23]) {
                fVar.f(23, this.C);
            }
            bw5.oh ohVar = this.D;
            if (ohVar != null && zArr[24]) {
                fVar.i(24, ohVar.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            bw5.wi wiVar = this.E;
            if (wiVar != null && zArr[25]) {
                fVar.i(25, wiVar.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            bw5.vi viVar = this.F;
            if (viVar != null && zArr[26]) {
                fVar.i(26, viVar.mo75928xcd1e8d8());
                this.F.mo75956x3d5d1f78(fVar);
            }
            bw5.yh yhVar = this.G;
            if (yhVar != null && zArr[27]) {
                fVar.i(27, yhVar.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            bw5.si siVar = this.H;
            if (siVar != null && zArr[28]) {
                fVar.i(28, siVar.mo75928xcd1e8d8());
                this.H.mo75956x3d5d1f78(fVar);
            }
            bw5.nj njVar = this.I;
            if (njVar != null && zArr[29]) {
                fVar.i(29, njVar.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            bw5.qi qiVar = this.f111331J;
            if (qiVar != null && zArr[30]) {
                fVar.i(30, qiVar.mo75928xcd1e8d8());
                this.f111331J.mo75956x3d5d1f78(fVar);
            }
            bw5.lh lhVar = this.K;
            if (lhVar != null && zArr[31]) {
                fVar.i(31, lhVar.mo75928xcd1e8d8());
                this.K.mo75956x3d5d1f78(fVar);
            }
            if (zArr[32]) {
                fVar.a(32, this.L);
            }
            bw5.xh xhVar = this.M;
            if (xhVar != null && zArr[33]) {
                fVar.i(33, xhVar.mo75928xcd1e8d8());
                this.M.mo75956x3d5d1f78(fVar);
            }
            bw5.oi oiVar = this.N;
            if (oiVar != null && zArr[34]) {
                fVar.i(34, oiVar.mo75928xcd1e8d8());
                this.N.mo75956x3d5d1f78(fVar);
            }
            bw5.zh zhVar = this.P;
            if (zhVar != null && zArr[35]) {
                fVar.i(35, zhVar.mo75928xcd1e8d8());
                this.P.mo75956x3d5d1f78(fVar);
            }
            bw5.di diVar = this.Q;
            if (diVar != null && zArr[36]) {
                fVar.i(36, diVar.mo75928xcd1e8d8());
                this.Q.mo75956x3d5d1f78(fVar);
            }
            bw5.mh mhVar = this.R;
            if (mhVar != null && zArr[37]) {
                fVar.i(37, mhVar.mo75928xcd1e8d8());
                this.R.mo75956x3d5d1f78(fVar);
            }
            bw5.uh uhVar = this.S;
            if (uhVar != null && zArr[38]) {
                fVar.i(38, uhVar.mo75928xcd1e8d8());
                this.S.mo75956x3d5d1f78(fVar);
            }
            bw5.vh vhVar = this.T;
            if (vhVar != null && zArr[39]) {
                fVar.i(39, vhVar.mo75928xcd1e8d8());
                this.T.mo75956x3d5d1f78(fVar);
            }
            bw5.fi fiVar = this.U;
            if (fiVar != null && zArr[40]) {
                fVar.i(40, fiVar.mo75928xcd1e8d8());
                this.U.mo75956x3d5d1f78(fVar);
            }
            if (zArr[41]) {
                fVar.f(41, this.V);
            }
            if (zArr[42]) {
                fVar.f(42, this.W);
            }
            bw5.ni niVar = this.X;
            if (niVar != null && zArr[43]) {
                fVar.i(43, niVar.mo75928xcd1e8d8());
                this.X.mo75956x3d5d1f78(fVar);
            }
            bw5.pi piVar = this.Y;
            if (piVar != null && zArr[44]) {
                fVar.i(44, piVar.mo75928xcd1e8d8());
                this.Y.mo75956x3d5d1f78(fVar);
            }
            if (zArr[45]) {
                fVar.f(45, this.Z);
            }
            bw5.ci ciVar = this.f111343p0;
            if (ciVar != null && zArr[46]) {
                fVar.i(46, ciVar.mo75928xcd1e8d8());
                this.f111343p0.mo75956x3d5d1f78(fVar);
            }
            bw5.wa waVar = this.f111353x0;
            if (waVar != null && zArr[47]) {
                fVar.i(47, waVar.mo75928xcd1e8d8());
                this.f111353x0.mo75956x3d5d1f78(fVar);
            }
            bw5.zz zzVar = this.f111356y0;
            if (zzVar != null && zArr[48]) {
                fVar.i(48, zzVar.mo75928xcd1e8d8());
                this.f111356y0.mo75956x3d5d1f78(fVar);
            }
            bw5.hi0 hi0Var = this.f111338l1;
            if (hi0Var != null && zArr[49]) {
                fVar.i(49, hi0Var.mo75928xcd1e8d8());
                this.f111338l1.mo75956x3d5d1f78(fVar);
            }
            bw5.ej ejVar = this.f111344p1;
            if (ejVar != null && zArr[50]) {
                fVar.i(50, ejVar.mo75928xcd1e8d8());
                this.f111344p1.mo75956x3d5d1f78(fVar);
            }
            bw5.oj ojVar = this.f111354x1;
            if (ojVar != null && zArr[51]) {
                fVar.i(51, ojVar.mo75928xcd1e8d8());
                this.f111354x1.mo75956x3d5d1f78(fVar);
            }
            bw5.kg0 kg0Var = this.f111357y1;
            if (kg0Var != null && zArr[52]) {
                fVar.i(52, kg0Var.mo75928xcd1e8d8());
                this.f111357y1.mo75956x3d5d1f78(fVar);
            }
            if (zArr[56]) {
                fVar.f(56, this.f111359z1);
            }
            if (zArr[61]) {
                fVar.f(61, this.A1);
            }
            bw5.m30 m30Var = this.B1;
            if (m30Var != null && zArr[62]) {
                fVar.i(62, m30Var.mo75928xcd1e8d8());
                this.B1.mo75956x3d5d1f78(fVar);
            }
            bw5.ai aiVar = this.C1;
            if (aiVar != null && zArr[63]) {
                fVar.i(63, aiVar.mo75928xcd1e8d8());
                this.C1.mo75956x3d5d1f78(fVar);
            }
            bw5.hi hiVar = this.D1;
            if (hiVar != null && zArr[64]) {
                fVar.i(64, hiVar.mo75928xcd1e8d8());
                this.D1.mo75956x3d5d1f78(fVar);
            }
            bw5.rh rhVar = this.E1;
            if (rhVar != null && zArr[65]) {
                fVar.i(65, rhVar.mo75928xcd1e8d8());
                this.E1.mo75956x3d5d1f78(fVar);
            }
            bw5.th thVar = this.F1;
            if (thVar != null && zArr[66]) {
                fVar.i(66, thVar.mo75928xcd1e8d8());
                this.F1.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int f17 = zArr[1] ? b36.f.f(1, this.f111332d) + 0 : 0;
            if (zArr[2]) {
                f17 += b36.f.f(2, this.f111333e);
            }
            if (zArr[3]) {
                f17 += b36.f.f(3, this.f111334f);
            }
            bw5.cj cjVar2 = this.f111335g;
            if (cjVar2 != null && zArr[4]) {
                f17 += b36.f.i(4, cjVar2.mo75928xcd1e8d8());
            }
            bw5.li liVar2 = this.f111336h;
            if (liVar2 != null && zArr[5]) {
                f17 += b36.f.i(5, liVar2.mo75928xcd1e8d8());
            }
            bw5.ti tiVar2 = this.f111337i;
            if (tiVar2 != null && zArr[6]) {
                f17 += b36.f.i(6, tiVar2.mo75928xcd1e8d8());
            }
            bw5.qh qhVar2 = this.f111339m;
            if (qhVar2 != null && zArr[7]) {
                f17 += b36.f.i(7, qhVar2.mo75928xcd1e8d8());
            }
            bw5.yi yiVar2 = this.f111340n;
            if (yiVar2 != null && zArr[8]) {
                f17 += b36.f.i(8, yiVar2.mo75928xcd1e8d8());
            }
            bw5.wh whVar3 = this.f111341o;
            if (whVar3 != null && zArr[9]) {
                f17 += b36.f.i(9, whVar3.mo75928xcd1e8d8());
            }
            bw5.wh whVar4 = this.f111342p;
            if (whVar4 != null && zArr[10]) {
                f17 += b36.f.i(10, whVar4.mo75928xcd1e8d8());
            }
            bw5.bi biVar2 = this.f111345q;
            if (biVar2 != null && zArr[11]) {
                f17 += b36.f.i(11, biVar2.mo75928xcd1e8d8());
            }
            if (zArr[12]) {
                f17 += b36.f.f(12, this.f111346r);
            }
            if (zArr[13]) {
                f17 += b36.f.f(13, this.f111347s);
            }
            bw5.ph phVar2 = this.f111348t;
            if (phVar2 != null && zArr[14]) {
                f17 += b36.f.i(14, phVar2.mo75928xcd1e8d8());
            }
            bw5.ki kiVar2 = this.f111349u;
            if (kiVar2 != null && zArr[15]) {
                f17 += b36.f.i(15, kiVar2.mo75928xcd1e8d8());
            }
            bw5.kh khVar2 = this.f111350v;
            if (khVar2 != null && zArr[16]) {
                f17 += b36.f.i(16, khVar2.mo75928xcd1e8d8());
            }
            if (zArr[17]) {
                f17 += b36.f.f(17, this.f111351w);
            }
            if (zArr[18]) {
                f17 += b36.f.f(18, this.f111352x);
            }
            if (zArr[19]) {
                f17 += b36.f.f(19, this.f111355y);
            }
            bw5.xi xiVar2 = this.f111358z;
            if (xiVar2 != null && zArr[20]) {
                f17 += b36.f.i(20, xiVar2.mo75928xcd1e8d8());
            }
            bw5.sh shVar2 = this.A;
            if (shVar2 != null && zArr[21]) {
                f17 += b36.f.i(21, shVar2.mo75928xcd1e8d8());
            }
            bw5.jj jjVar2 = this.B;
            if (jjVar2 != null && zArr[22]) {
                f17 += b36.f.i(22, jjVar2.mo75928xcd1e8d8());
            }
            if (zArr[23]) {
                f17 += b36.f.f(23, this.C);
            }
            bw5.oh ohVar2 = this.D;
            if (ohVar2 != null && zArr[24]) {
                f17 += b36.f.i(24, ohVar2.mo75928xcd1e8d8());
            }
            bw5.wi wiVar2 = this.E;
            if (wiVar2 != null && zArr[25]) {
                f17 += b36.f.i(25, wiVar2.mo75928xcd1e8d8());
            }
            bw5.vi viVar2 = this.F;
            if (viVar2 != null && zArr[26]) {
                f17 += b36.f.i(26, viVar2.mo75928xcd1e8d8());
            }
            bw5.yh yhVar2 = this.G;
            if (yhVar2 != null && zArr[27]) {
                f17 += b36.f.i(27, yhVar2.mo75928xcd1e8d8());
            }
            bw5.si siVar2 = this.H;
            if (siVar2 != null && zArr[28]) {
                f17 += b36.f.i(28, siVar2.mo75928xcd1e8d8());
            }
            bw5.nj njVar2 = this.I;
            if (njVar2 != null && zArr[29]) {
                f17 += b36.f.i(29, njVar2.mo75928xcd1e8d8());
            }
            bw5.qi qiVar2 = this.f111331J;
            if (qiVar2 != null && zArr[30]) {
                f17 += b36.f.i(30, qiVar2.mo75928xcd1e8d8());
            }
            bw5.lh lhVar2 = this.K;
            if (lhVar2 != null && zArr[31]) {
                f17 += b36.f.i(31, lhVar2.mo75928xcd1e8d8());
            }
            if (zArr[32]) {
                f17 += b36.f.a(32, this.L);
            }
            bw5.xh xhVar2 = this.M;
            if (xhVar2 != null && zArr[33]) {
                f17 += b36.f.i(33, xhVar2.mo75928xcd1e8d8());
            }
            bw5.oi oiVar2 = this.N;
            if (oiVar2 != null && zArr[34]) {
                f17 += b36.f.i(34, oiVar2.mo75928xcd1e8d8());
            }
            bw5.zh zhVar2 = this.P;
            if (zhVar2 != null && zArr[35]) {
                f17 += b36.f.i(35, zhVar2.mo75928xcd1e8d8());
            }
            bw5.di diVar2 = this.Q;
            if (diVar2 != null && zArr[36]) {
                f17 += b36.f.i(36, diVar2.mo75928xcd1e8d8());
            }
            bw5.mh mhVar2 = this.R;
            if (mhVar2 != null && zArr[37]) {
                f17 += b36.f.i(37, mhVar2.mo75928xcd1e8d8());
            }
            bw5.uh uhVar2 = this.S;
            if (uhVar2 != null && zArr[38]) {
                f17 += b36.f.i(38, uhVar2.mo75928xcd1e8d8());
            }
            bw5.vh vhVar2 = this.T;
            if (vhVar2 != null && zArr[39]) {
                f17 += b36.f.i(39, vhVar2.mo75928xcd1e8d8());
            }
            bw5.fi fiVar2 = this.U;
            if (fiVar2 != null && zArr[40]) {
                f17 += b36.f.i(40, fiVar2.mo75928xcd1e8d8());
            }
            if (zArr[41]) {
                f17 += b36.f.f(41, this.V);
            }
            if (zArr[42]) {
                f17 += b36.f.f(42, this.W);
            }
            bw5.ni niVar2 = this.X;
            if (niVar2 != null && zArr[43]) {
                f17 += b36.f.i(43, niVar2.mo75928xcd1e8d8());
            }
            bw5.pi piVar2 = this.Y;
            if (piVar2 != null && zArr[44]) {
                f17 += b36.f.i(44, piVar2.mo75928xcd1e8d8());
            }
            if (zArr[45]) {
                f17 += b36.f.f(45, this.Z);
            }
            bw5.ci ciVar2 = this.f111343p0;
            if (ciVar2 != null && zArr[46]) {
                f17 += b36.f.i(46, ciVar2.mo75928xcd1e8d8());
            }
            bw5.wa waVar2 = this.f111353x0;
            if (waVar2 != null && zArr[47]) {
                f17 += b36.f.i(47, waVar2.mo75928xcd1e8d8());
            }
            bw5.zz zzVar2 = this.f111356y0;
            if (zzVar2 != null && zArr[48]) {
                f17 += b36.f.i(48, zzVar2.mo75928xcd1e8d8());
            }
            bw5.hi0 hi0Var2 = this.f111338l1;
            if (hi0Var2 != null && zArr[49]) {
                f17 += b36.f.i(49, hi0Var2.mo75928xcd1e8d8());
            }
            bw5.ej ejVar2 = this.f111344p1;
            if (ejVar2 != null && zArr[50]) {
                f17 += b36.f.i(50, ejVar2.mo75928xcd1e8d8());
            }
            bw5.oj ojVar2 = this.f111354x1;
            if (ojVar2 != null && zArr[51]) {
                f17 += b36.f.i(51, ojVar2.mo75928xcd1e8d8());
            }
            bw5.kg0 kg0Var2 = this.f111357y1;
            if (kg0Var2 != null && zArr[52]) {
                f17 += b36.f.i(52, kg0Var2.mo75928xcd1e8d8());
            }
            if (zArr[56]) {
                f17 += b36.f.f(56, this.f111359z1);
            }
            if (zArr[61]) {
                f17 += b36.f.f(61, this.A1);
            }
            bw5.m30 m30Var2 = this.B1;
            if (m30Var2 != null && zArr[62]) {
                f17 += b36.f.i(62, m30Var2.mo75928xcd1e8d8());
            }
            bw5.ai aiVar2 = this.C1;
            if (aiVar2 != null && zArr[63]) {
                f17 += b36.f.i(63, aiVar2.mo75928xcd1e8d8());
            }
            bw5.hi hiVar2 = this.D1;
            if (hiVar2 != null && zArr[64]) {
                f17 += b36.f.i(64, hiVar2.mo75928xcd1e8d8());
            }
            bw5.rh rhVar2 = this.E1;
            if (rhVar2 != null && zArr[65]) {
                f17 += b36.f.i(65, rhVar2.mo75928xcd1e8d8());
            }
            bw5.th thVar2 = this.F1;
            return (thVar2 == null || !zArr[66]) ? f17 : f17 + b36.f.i(66, thVar2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 56) {
            this.f111359z1 = aVar2.h(intValue);
            zArr[56] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f111332d = aVar2.h(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111333e = aVar2.h(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111334f = aVar2.h(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.cj cjVar3 = new bw5.cj();
                    if (bArr != null && bArr.length > 0) {
                        cjVar3.mo11468x92b714fd(bArr);
                    }
                    this.f111335g = cjVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.li liVar3 = new bw5.li();
                    if (bArr2 != null && bArr2.length > 0) {
                        liVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f111336h = liVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.ti tiVar3 = new bw5.ti();
                    if (bArr3 != null && bArr3.length > 0) {
                        tiVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f111337i = tiVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.qh qhVar3 = new bw5.qh();
                    if (bArr4 != null && bArr4.length > 0) {
                        qhVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f111339m = qhVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.yi yiVar3 = new bw5.yi();
                    if (bArr5 != null && bArr5.length > 0) {
                        yiVar3.mo11468x92b714fd(bArr5);
                    }
                    this.f111340n = yiVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.wh whVar5 = new bw5.wh();
                    if (bArr6 != null && bArr6.length > 0) {
                        whVar5.mo11468x92b714fd(bArr6);
                    }
                    this.f111341o = whVar5;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.wh whVar6 = new bw5.wh();
                    if (bArr7 != null && bArr7.length > 0) {
                        whVar6.mo11468x92b714fd(bArr7);
                    }
                    this.f111342p = whVar6;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.bi biVar3 = new bw5.bi();
                    if (bArr8 != null && bArr8.length > 0) {
                        biVar3.mo11468x92b714fd(bArr8);
                    }
                    this.f111345q = biVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f111346r = aVar2.h(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f111347s = aVar2.h(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.ph phVar3 = new bw5.ph();
                    if (bArr9 != null && bArr9.length > 0) {
                        phVar3.mo11468x92b714fd(bArr9);
                    }
                    this.f111348t = phVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.ki kiVar3 = new bw5.ki();
                    if (bArr10 != null && bArr10.length > 0) {
                        kiVar3.mo11468x92b714fd(bArr10);
                    }
                    this.f111349u = kiVar3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    bw5.kh khVar3 = new bw5.kh();
                    if (bArr11 != null && bArr11.length > 0) {
                        khVar3.mo11468x92b714fd(bArr11);
                    }
                    this.f111350v = khVar3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                this.f111351w = aVar2.h(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f111352x = aVar2.h(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f111355y = aVar2.h(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr12 = (byte[]) j49.get(i57);
                    bw5.xi xiVar3 = new bw5.xi();
                    if (bArr12 != null && bArr12.length > 0) {
                        xiVar3.mo11468x92b714fd(bArr12);
                    }
                    this.f111358z = xiVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i58 = 0; i58 < size13; i58++) {
                    byte[] bArr13 = (byte[]) j57.get(i58);
                    bw5.sh shVar3 = new bw5.sh();
                    if (bArr13 != null && bArr13.length > 0) {
                        shVar3.mo11468x92b714fd(bArr13);
                    }
                    this.A = shVar3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i59 = 0; i59 < size14; i59++) {
                    byte[] bArr14 = (byte[]) j58.get(i59);
                    bw5.jj jjVar3 = new bw5.jj();
                    if (bArr14 != null && bArr14.length > 0) {
                        jjVar3.mo11468x92b714fd(bArr14);
                    }
                    this.B = jjVar3;
                }
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.h(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i66 = 0; i66 < size15; i66++) {
                    byte[] bArr15 = (byte[]) j59.get(i66);
                    bw5.oh ohVar3 = new bw5.oh();
                    if (bArr15 != null && bArr15.length > 0) {
                        ohVar3.mo11468x92b714fd(bArr15);
                    }
                    this.D = ohVar3;
                }
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i67 = 0; i67 < size16; i67++) {
                    byte[] bArr16 = (byte[]) j66.get(i67);
                    bw5.wi wiVar3 = new bw5.wi();
                    if (bArr16 != null && bArr16.length > 0) {
                        wiVar3.mo11468x92b714fd(bArr16);
                    }
                    this.E = wiVar3;
                }
                zArr[25] = true;
                return 0;
            case 26:
                java.util.LinkedList j67 = aVar2.j(intValue);
                int size17 = j67.size();
                for (int i68 = 0; i68 < size17; i68++) {
                    byte[] bArr17 = (byte[]) j67.get(i68);
                    bw5.vi viVar3 = new bw5.vi();
                    if (bArr17 != null && bArr17.length > 0) {
                        viVar3.mo11468x92b714fd(bArr17);
                    }
                    this.F = viVar3;
                }
                zArr[26] = true;
                return 0;
            case 27:
                java.util.LinkedList j68 = aVar2.j(intValue);
                int size18 = j68.size();
                for (int i69 = 0; i69 < size18; i69++) {
                    byte[] bArr18 = (byte[]) j68.get(i69);
                    bw5.yh yhVar3 = new bw5.yh();
                    if (bArr18 != null && bArr18.length > 0) {
                        yhVar3.mo11468x92b714fd(bArr18);
                    }
                    this.G = yhVar3;
                }
                zArr[27] = true;
                return 0;
            case 28:
                java.util.LinkedList j69 = aVar2.j(intValue);
                int size19 = j69.size();
                for (int i76 = 0; i76 < size19; i76++) {
                    byte[] bArr19 = (byte[]) j69.get(i76);
                    bw5.si siVar3 = new bw5.si();
                    if (bArr19 != null && bArr19.length > 0) {
                        siVar3.mo11468x92b714fd(bArr19);
                    }
                    this.H = siVar3;
                }
                zArr[28] = true;
                return 0;
            case 29:
                java.util.LinkedList j76 = aVar2.j(intValue);
                int size20 = j76.size();
                for (int i77 = 0; i77 < size20; i77++) {
                    byte[] bArr20 = (byte[]) j76.get(i77);
                    bw5.nj njVar3 = new bw5.nj();
                    if (bArr20 != null && bArr20.length > 0) {
                        njVar3.mo11468x92b714fd(bArr20);
                    }
                    this.I = njVar3;
                }
                zArr[29] = true;
                return 0;
            case 30:
                java.util.LinkedList j77 = aVar2.j(intValue);
                int size21 = j77.size();
                for (int i78 = 0; i78 < size21; i78++) {
                    byte[] bArr21 = (byte[]) j77.get(i78);
                    bw5.qi qiVar3 = new bw5.qi();
                    if (bArr21 != null && bArr21.length > 0) {
                        qiVar3.mo11468x92b714fd(bArr21);
                    }
                    this.f111331J = qiVar3;
                }
                zArr[30] = true;
                return 0;
            case 31:
                java.util.LinkedList j78 = aVar2.j(intValue);
                int size22 = j78.size();
                for (int i79 = 0; i79 < size22; i79++) {
                    byte[] bArr22 = (byte[]) j78.get(i79);
                    bw5.lh lhVar3 = new bw5.lh();
                    if (bArr22 != null && bArr22.length > 0) {
                        lhVar3.mo11468x92b714fd(bArr22);
                    }
                    this.K = lhVar3;
                }
                zArr[31] = true;
                return 0;
            case 32:
                this.L = aVar2.c(intValue);
                zArr[32] = true;
                return 0;
            case 33:
                java.util.LinkedList j79 = aVar2.j(intValue);
                int size23 = j79.size();
                for (int i86 = 0; i86 < size23; i86++) {
                    byte[] bArr23 = (byte[]) j79.get(i86);
                    bw5.xh xhVar3 = new bw5.xh();
                    if (bArr23 != null && bArr23.length > 0) {
                        xhVar3.mo11468x92b714fd(bArr23);
                    }
                    this.M = xhVar3;
                }
                zArr[33] = true;
                return 0;
            case 34:
                java.util.LinkedList j86 = aVar2.j(intValue);
                int size24 = j86.size();
                for (int i87 = 0; i87 < size24; i87++) {
                    byte[] bArr24 = (byte[]) j86.get(i87);
                    bw5.oi oiVar3 = new bw5.oi();
                    if (bArr24 != null && bArr24.length > 0) {
                        oiVar3.mo11468x92b714fd(bArr24);
                    }
                    this.N = oiVar3;
                }
                zArr[34] = true;
                return 0;
            case 35:
                java.util.LinkedList j87 = aVar2.j(intValue);
                int size25 = j87.size();
                for (int i88 = 0; i88 < size25; i88++) {
                    byte[] bArr25 = (byte[]) j87.get(i88);
                    bw5.zh zhVar3 = new bw5.zh();
                    if (bArr25 != null && bArr25.length > 0) {
                        zhVar3.mo11468x92b714fd(bArr25);
                    }
                    this.P = zhVar3;
                }
                zArr[35] = true;
                return 0;
            case 36:
                java.util.LinkedList j88 = aVar2.j(intValue);
                int size26 = j88.size();
                for (int i89 = 0; i89 < size26; i89++) {
                    byte[] bArr26 = (byte[]) j88.get(i89);
                    bw5.di diVar3 = new bw5.di();
                    if (bArr26 != null && bArr26.length > 0) {
                        diVar3.mo11468x92b714fd(bArr26);
                    }
                    this.Q = diVar3;
                }
                zArr[36] = true;
                return 0;
            case 37:
                java.util.LinkedList j89 = aVar2.j(intValue);
                int size27 = j89.size();
                for (int i96 = 0; i96 < size27; i96++) {
                    byte[] bArr27 = (byte[]) j89.get(i96);
                    bw5.mh mhVar3 = new bw5.mh();
                    if (bArr27 != null && bArr27.length > 0) {
                        mhVar3.mo11468x92b714fd(bArr27);
                    }
                    this.R = mhVar3;
                }
                zArr[37] = true;
                return 0;
            case 38:
                java.util.LinkedList j96 = aVar2.j(intValue);
                int size28 = j96.size();
                for (int i97 = 0; i97 < size28; i97++) {
                    byte[] bArr28 = (byte[]) j96.get(i97);
                    bw5.uh uhVar3 = new bw5.uh();
                    if (bArr28 != null && bArr28.length > 0) {
                        uhVar3.mo11468x92b714fd(bArr28);
                    }
                    this.S = uhVar3;
                }
                zArr[38] = true;
                return 0;
            case 39:
                java.util.LinkedList j97 = aVar2.j(intValue);
                int size29 = j97.size();
                for (int i98 = 0; i98 < size29; i98++) {
                    byte[] bArr29 = (byte[]) j97.get(i98);
                    bw5.vh vhVar3 = new bw5.vh();
                    if (bArr29 != null && bArr29.length > 0) {
                        vhVar3.mo11468x92b714fd(bArr29);
                    }
                    this.T = vhVar3;
                }
                zArr[39] = true;
                return 0;
            case 40:
                java.util.LinkedList j98 = aVar2.j(intValue);
                int size30 = j98.size();
                for (int i99 = 0; i99 < size30; i99++) {
                    byte[] bArr30 = (byte[]) j98.get(i99);
                    bw5.fi fiVar3 = new bw5.fi();
                    if (bArr30 != null && bArr30.length > 0) {
                        fiVar3.mo11468x92b714fd(bArr30);
                    }
                    this.U = fiVar3;
                }
                zArr[40] = true;
                return 0;
            case 41:
                this.V = aVar2.h(intValue);
                zArr[41] = true;
                return 0;
            case 42:
                this.W = aVar2.h(intValue);
                zArr[42] = true;
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                java.util.LinkedList j99 = aVar2.j(intValue);
                int size31 = j99.size();
                for (int i100 = 0; i100 < size31; i100++) {
                    byte[] bArr31 = (byte[]) j99.get(i100);
                    bw5.ni niVar3 = new bw5.ni();
                    if (bArr31 != null && bArr31.length > 0) {
                        niVar3.mo11468x92b714fd(bArr31);
                    }
                    this.X = niVar3;
                }
                zArr[43] = true;
                return 0;
            case 44:
                java.util.LinkedList j100 = aVar2.j(intValue);
                int size32 = j100.size();
                for (int i101 = 0; i101 < size32; i101++) {
                    byte[] bArr32 = (byte[]) j100.get(i101);
                    bw5.pi piVar3 = new bw5.pi();
                    if (bArr32 != null && bArr32.length > 0) {
                        piVar3.mo11468x92b714fd(bArr32);
                    }
                    this.Y = piVar3;
                }
                zArr[44] = true;
                return 0;
            case 45:
                this.Z = aVar2.h(intValue);
                zArr[45] = true;
                return 0;
            case 46:
                java.util.LinkedList j101 = aVar2.j(intValue);
                int size33 = j101.size();
                for (int i102 = 0; i102 < size33; i102++) {
                    byte[] bArr33 = (byte[]) j101.get(i102);
                    bw5.ci ciVar3 = new bw5.ci();
                    if (bArr33 != null && bArr33.length > 0) {
                        ciVar3.mo11468x92b714fd(bArr33);
                    }
                    this.f111343p0 = ciVar3;
                }
                zArr[46] = true;
                return 0;
            case 47:
                java.util.LinkedList j102 = aVar2.j(intValue);
                int size34 = j102.size();
                for (int i103 = 0; i103 < size34; i103++) {
                    byte[] bArr34 = (byte[]) j102.get(i103);
                    bw5.wa waVar3 = new bw5.wa();
                    if (bArr34 != null && bArr34.length > 0) {
                        waVar3.mo11468x92b714fd(bArr34);
                    }
                    this.f111353x0 = waVar3;
                }
                zArr[47] = true;
                return 0;
            case 48:
                java.util.LinkedList j103 = aVar2.j(intValue);
                int size35 = j103.size();
                for (int i104 = 0; i104 < size35; i104++) {
                    byte[] bArr35 = (byte[]) j103.get(i104);
                    bw5.zz zzVar3 = new bw5.zz();
                    if (bArr35 != null && bArr35.length > 0) {
                        zzVar3.mo11468x92b714fd(bArr35);
                    }
                    this.f111356y0 = zzVar3;
                }
                zArr[48] = true;
                return 0;
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                java.util.LinkedList j104 = aVar2.j(intValue);
                int size36 = j104.size();
                for (int i105 = 0; i105 < size36; i105++) {
                    byte[] bArr36 = (byte[]) j104.get(i105);
                    bw5.hi0 hi0Var3 = new bw5.hi0();
                    if (bArr36 != null && bArr36.length > 0) {
                        hi0Var3.mo11468x92b714fd(bArr36);
                    }
                    this.f111338l1 = hi0Var3;
                }
                zArr[49] = true;
                return 0;
            case 50:
                java.util.LinkedList j105 = aVar2.j(intValue);
                int size37 = j105.size();
                for (int i106 = 0; i106 < size37; i106++) {
                    byte[] bArr37 = (byte[]) j105.get(i106);
                    bw5.ej ejVar3 = new bw5.ej();
                    if (bArr37 != null && bArr37.length > 0) {
                        ejVar3.mo11468x92b714fd(bArr37);
                    }
                    this.f111344p1 = ejVar3;
                }
                zArr[50] = true;
                return 0;
            case 51:
                java.util.LinkedList j106 = aVar2.j(intValue);
                int size38 = j106.size();
                for (int i107 = 0; i107 < size38; i107++) {
                    byte[] bArr38 = (byte[]) j106.get(i107);
                    bw5.oj ojVar3 = new bw5.oj();
                    if (bArr38 != null && bArr38.length > 0) {
                        ojVar3.mo11468x92b714fd(bArr38);
                    }
                    this.f111354x1 = ojVar3;
                }
                zArr[51] = true;
                return 0;
            case 52:
                java.util.LinkedList j107 = aVar2.j(intValue);
                int size39 = j107.size();
                for (int i108 = 0; i108 < size39; i108++) {
                    byte[] bArr39 = (byte[]) j107.get(i108);
                    bw5.kg0 kg0Var3 = new bw5.kg0();
                    if (bArr39 != null && bArr39.length > 0) {
                        kg0Var3.mo11468x92b714fd(bArr39);
                    }
                    this.f111357y1 = kg0Var3;
                }
                zArr[52] = true;
                return 0;
            default:
                switch (intValue) {
                    case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                        this.A1 = aVar2.h(intValue);
                        zArr[61] = true;
                        return 0;
                    case 62:
                        java.util.LinkedList j108 = aVar2.j(intValue);
                        int size40 = j108.size();
                        for (int i109 = 0; i109 < size40; i109++) {
                            byte[] bArr40 = (byte[]) j108.get(i109);
                            bw5.m30 m30Var3 = new bw5.m30();
                            if (bArr40 != null && bArr40.length > 0) {
                                m30Var3.mo11468x92b714fd(bArr40);
                            }
                            this.B1 = m30Var3;
                        }
                        zArr[62] = true;
                        return 0;
                    case 63:
                        java.util.LinkedList j109 = aVar2.j(intValue);
                        int size41 = j109.size();
                        for (int i110 = 0; i110 < size41; i110++) {
                            byte[] bArr41 = (byte[]) j109.get(i110);
                            bw5.ai aiVar3 = new bw5.ai();
                            if (bArr41 != null && bArr41.length > 0) {
                                aiVar3.mo11468x92b714fd(bArr41);
                            }
                            this.C1 = aiVar3;
                        }
                        zArr[63] = true;
                        return 0;
                    case 64:
                        java.util.LinkedList j110 = aVar2.j(intValue);
                        int size42 = j110.size();
                        for (int i111 = 0; i111 < size42; i111++) {
                            byte[] bArr42 = (byte[]) j110.get(i111);
                            bw5.hi hiVar3 = new bw5.hi();
                            if (bArr42 != null && bArr42.length > 0) {
                                hiVar3.mo11468x92b714fd(bArr42);
                            }
                            this.D1 = hiVar3;
                        }
                        zArr[64] = true;
                        return 0;
                    case 65:
                        java.util.LinkedList j111 = aVar2.j(intValue);
                        int size43 = j111.size();
                        for (int i112 = 0; i112 < size43; i112++) {
                            byte[] bArr43 = (byte[]) j111.get(i112);
                            bw5.rh rhVar3 = new bw5.rh();
                            if (bArr43 != null && bArr43.length > 0) {
                                rhVar3.mo11468x92b714fd(bArr43);
                            }
                            this.E1 = rhVar3;
                        }
                        zArr[65] = true;
                        return 0;
                    case 66:
                        java.util.LinkedList j112 = aVar2.j(intValue);
                        int size44 = j112.size();
                        for (int i113 = 0; i113 < size44; i113++) {
                            byte[] bArr44 = (byte[]) j112.get(i113);
                            bw5.th thVar3 = new bw5.th();
                            if (bArr44 != null && bArr44.length > 0) {
                                thVar3.mo11468x92b714fd(bArr44);
                            }
                            this.F1 = thVar3;
                        }
                        zArr[66] = true;
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
