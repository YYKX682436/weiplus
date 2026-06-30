package bw5;

/* loaded from: classes2.dex */
public class ks extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public bw5.fr A;
    public bw5.i00 B;
    public bw5.fg C;
    public bw5.xg0 D;
    public bw5.sp E;
    public bw5.tf G;
    public bw5.vt H;
    public bw5.qr I;

    /* renamed from: J, reason: collision with root package name */
    public bw5.tq f111050J;
    public bw5.qq K;
    public bw5.zy L;
    public bw5.bg M;
    public java.lang.String N;
    public bw5.yq P;
    public bw5.cw Q;
    public bw5.we R;
    public int S;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111051d;

    /* renamed from: f, reason: collision with root package name */
    public int f111053f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.nq f111054g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.sp f111055h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.gf f111056i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.xy f111057m;

    /* renamed from: o, reason: collision with root package name */
    public bw5.tl f111059o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.sp f111060p;

    /* renamed from: r, reason: collision with root package name */
    public bw5.tp f111062r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.fr f111063s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.cs f111064t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.eg f111065u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.ny f111066v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.ps f111067w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.iq f111068x;

    /* renamed from: y, reason: collision with root package name */
    public long f111069y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.ed f111070z;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f111052e = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f111058n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f111061q = new java.util.LinkedList();
    public final java.util.LinkedList F = new java.util.LinkedList();
    public final boolean[] T = new boolean[40];

    static {
        new bw5.ks();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ks mo11468x92b714fd(byte[] bArr) {
        return (bw5.ks) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ks)) {
            return false;
        }
        bw5.ks ksVar = (bw5.ks) fVar;
        return n51.f.a(this.f111051d, ksVar.f111051d) && n51.f.a(this.f111052e, ksVar.f111052e) && n51.f.a(java.lang.Integer.valueOf(this.f111053f), java.lang.Integer.valueOf(ksVar.f111053f)) && n51.f.a(this.f111054g, ksVar.f111054g) && n51.f.a(this.f111055h, ksVar.f111055h) && n51.f.a(this.f111056i, ksVar.f111056i) && n51.f.a(this.f111057m, ksVar.f111057m) && n51.f.a(this.f111058n, ksVar.f111058n) && n51.f.a(this.f111059o, ksVar.f111059o) && n51.f.a(this.f111060p, ksVar.f111060p) && n51.f.a(this.f111061q, ksVar.f111061q) && n51.f.a(this.f111062r, ksVar.f111062r) && n51.f.a(this.f111063s, ksVar.f111063s) && n51.f.a(this.f111064t, ksVar.f111064t) && n51.f.a(this.f111065u, ksVar.f111065u) && n51.f.a(this.f111066v, ksVar.f111066v) && n51.f.a(this.f111067w, ksVar.f111067w) && n51.f.a(this.f111068x, ksVar.f111068x) && n51.f.a(java.lang.Long.valueOf(this.f111069y), java.lang.Long.valueOf(ksVar.f111069y)) && n51.f.a(this.f111070z, ksVar.f111070z) && n51.f.a(this.A, ksVar.A) && n51.f.a(this.B, ksVar.B) && n51.f.a(this.C, ksVar.C) && n51.f.a(this.D, ksVar.D) && n51.f.a(this.E, ksVar.E) && n51.f.a(this.F, ksVar.F) && n51.f.a(this.G, ksVar.G) && n51.f.a(this.H, ksVar.H) && n51.f.a(this.I, ksVar.I) && n51.f.a(this.f111050J, ksVar.f111050J) && n51.f.a(this.K, ksVar.K) && n51.f.a(this.L, ksVar.L) && n51.f.a(this.M, ksVar.M) && n51.f.a(this.N, ksVar.N) && n51.f.a(this.P, ksVar.P) && n51.f.a(this.Q, ksVar.Q) && n51.f.a(this.R, ksVar.R) && n51.f.a(java.lang.Integer.valueOf(this.S), java.lang.Integer.valueOf(ksVar.S));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ks();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.T;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111051d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f111052e);
            if (zArr[3]) {
                fVar.f(3, this.f111053f);
            }
            bw5.nq nqVar = this.f111054g;
            if (nqVar != null && zArr[4]) {
                fVar.i(4, nqVar.mo75928xcd1e8d8());
                this.f111054g.mo75956x3d5d1f78(fVar);
            }
            bw5.sp spVar = this.f111055h;
            if (spVar != null && zArr[5]) {
                fVar.i(5, spVar.mo75928xcd1e8d8());
                this.f111055h.mo75956x3d5d1f78(fVar);
            }
            bw5.gf gfVar = this.f111056i;
            if (gfVar != null && zArr[6]) {
                fVar.i(6, gfVar.mo75928xcd1e8d8());
                this.f111056i.mo75956x3d5d1f78(fVar);
            }
            bw5.xy xyVar = this.f111057m;
            if (xyVar != null && zArr[7]) {
                fVar.i(7, xyVar.mo75928xcd1e8d8());
                this.f111057m.mo75956x3d5d1f78(fVar);
            }
            fVar.g(8, 8, this.f111058n);
            bw5.tl tlVar = this.f111059o;
            if (tlVar != null && zArr[9]) {
                fVar.i(9, tlVar.mo75928xcd1e8d8());
                this.f111059o.mo75956x3d5d1f78(fVar);
            }
            bw5.sp spVar2 = this.f111060p;
            if (spVar2 != null && zArr[10]) {
                fVar.i(10, spVar2.mo75928xcd1e8d8());
                this.f111060p.mo75956x3d5d1f78(fVar);
            }
            fVar.g(11, 8, this.f111061q);
            bw5.tp tpVar = this.f111062r;
            if (tpVar != null && zArr[12]) {
                fVar.i(12, tpVar.mo75928xcd1e8d8());
                this.f111062r.mo75956x3d5d1f78(fVar);
            }
            bw5.fr frVar = this.f111063s;
            if (frVar != null && zArr[13]) {
                fVar.i(13, frVar.mo75928xcd1e8d8());
                this.f111063s.mo75956x3d5d1f78(fVar);
            }
            bw5.cs csVar = this.f111064t;
            if (csVar != null && zArr[14]) {
                fVar.i(14, csVar.mo75928xcd1e8d8());
                this.f111064t.mo75956x3d5d1f78(fVar);
            }
            bw5.eg egVar = this.f111065u;
            if (egVar != null && zArr[15]) {
                fVar.i(15, egVar.mo75928xcd1e8d8());
                this.f111065u.mo75956x3d5d1f78(fVar);
            }
            bw5.ny nyVar = this.f111066v;
            if (nyVar != null && zArr[16]) {
                fVar.i(16, nyVar.mo75928xcd1e8d8());
                this.f111066v.mo75956x3d5d1f78(fVar);
            }
            bw5.ps psVar = this.f111067w;
            if (psVar != null && zArr[17]) {
                fVar.i(17, psVar.mo75928xcd1e8d8());
                this.f111067w.mo75956x3d5d1f78(fVar);
            }
            bw5.iq iqVar = this.f111068x;
            if (iqVar != null && zArr[18]) {
                fVar.i(18, iqVar.mo75928xcd1e8d8());
                this.f111068x.mo75956x3d5d1f78(fVar);
            }
            if (zArr[19]) {
                fVar.h(19, this.f111069y);
            }
            bw5.ed edVar = this.f111070z;
            if (edVar != null && zArr[20]) {
                fVar.i(20, edVar.mo75928xcd1e8d8());
                this.f111070z.mo75956x3d5d1f78(fVar);
            }
            bw5.fr frVar2 = this.A;
            if (frVar2 != null && zArr[21]) {
                fVar.i(21, frVar2.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            bw5.i00 i00Var = this.B;
            if (i00Var != null && zArr[22]) {
                fVar.i(22, i00Var.mo75928xcd1e8d8());
                this.B.mo75956x3d5d1f78(fVar);
            }
            bw5.fg fgVar = this.C;
            if (fgVar != null && zArr[23]) {
                fVar.i(23, fgVar.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            bw5.xg0 xg0Var = this.D;
            if (xg0Var != null && zArr[24]) {
                fVar.i(24, xg0Var.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            bw5.sp spVar3 = this.E;
            if (spVar3 != null && zArr[25]) {
                fVar.i(25, spVar3.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            fVar.g(26, 8, this.F);
            bw5.tf tfVar = this.G;
            if (tfVar != null && zArr[27]) {
                fVar.i(27, tfVar.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            bw5.vt vtVar = this.H;
            if (vtVar != null && zArr[28]) {
                fVar.i(28, vtVar.mo75928xcd1e8d8());
                this.H.mo75956x3d5d1f78(fVar);
            }
            bw5.qr qrVar = this.I;
            if (qrVar != null && zArr[29]) {
                fVar.i(29, qrVar.mo75928xcd1e8d8());
                this.I.mo75956x3d5d1f78(fVar);
            }
            bw5.tq tqVar = this.f111050J;
            if (tqVar != null && zArr[30]) {
                fVar.i(30, tqVar.mo75928xcd1e8d8());
                this.f111050J.mo75956x3d5d1f78(fVar);
            }
            bw5.qq qqVar = this.K;
            if (qqVar != null && zArr[31]) {
                fVar.i(31, qqVar.mo75928xcd1e8d8());
                this.K.mo75956x3d5d1f78(fVar);
            }
            bw5.zy zyVar = this.L;
            if (zyVar != null && zArr[32]) {
                fVar.i(32, zyVar.mo75928xcd1e8d8());
                this.L.mo75956x3d5d1f78(fVar);
            }
            bw5.bg bgVar = this.M;
            if (bgVar != null && zArr[33]) {
                fVar.i(33, bgVar.mo75928xcd1e8d8());
                this.M.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.N;
            if (str2 != null && zArr[34]) {
                fVar.j(34, str2);
            }
            bw5.yq yqVar = this.P;
            if (yqVar != null && zArr[35]) {
                fVar.i(35, yqVar.mo75928xcd1e8d8());
                this.P.mo75956x3d5d1f78(fVar);
            }
            bw5.cw cwVar = this.Q;
            if (cwVar != null && zArr[36]) {
                fVar.i(36, cwVar.mo75928xcd1e8d8());
                this.Q.mo75956x3d5d1f78(fVar);
            }
            bw5.we weVar = this.R;
            if (weVar != null && zArr[38]) {
                fVar.i(38, weVar.mo75928xcd1e8d8());
                this.R.mo75956x3d5d1f78(fVar);
            }
            if (zArr[39]) {
                fVar.f(39, this.S);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f111051d;
            if (str3 != null && zArr[1]) {
                i18 = b36.f.j(1, str3) + 0;
            }
            int g17 = i18 + b36.f.g(2, 8, this.f111052e);
            if (zArr[3]) {
                g17 += b36.f.f(3, this.f111053f);
            }
            bw5.nq nqVar2 = this.f111054g;
            if (nqVar2 != null && zArr[4]) {
                g17 += b36.f.i(4, nqVar2.mo75928xcd1e8d8());
            }
            bw5.sp spVar4 = this.f111055h;
            if (spVar4 != null && zArr[5]) {
                g17 += b36.f.i(5, spVar4.mo75928xcd1e8d8());
            }
            bw5.gf gfVar2 = this.f111056i;
            if (gfVar2 != null && zArr[6]) {
                g17 += b36.f.i(6, gfVar2.mo75928xcd1e8d8());
            }
            bw5.xy xyVar2 = this.f111057m;
            if (xyVar2 != null && zArr[7]) {
                g17 += b36.f.i(7, xyVar2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(8, 8, this.f111058n);
            bw5.tl tlVar2 = this.f111059o;
            if (tlVar2 != null && zArr[9]) {
                g18 += b36.f.i(9, tlVar2.mo75928xcd1e8d8());
            }
            bw5.sp spVar5 = this.f111060p;
            if (spVar5 != null && zArr[10]) {
                g18 += b36.f.i(10, spVar5.mo75928xcd1e8d8());
            }
            int g19 = g18 + b36.f.g(11, 8, this.f111061q);
            bw5.tp tpVar2 = this.f111062r;
            if (tpVar2 != null && zArr[12]) {
                g19 += b36.f.i(12, tpVar2.mo75928xcd1e8d8());
            }
            bw5.fr frVar3 = this.f111063s;
            if (frVar3 != null && zArr[13]) {
                g19 += b36.f.i(13, frVar3.mo75928xcd1e8d8());
            }
            bw5.cs csVar2 = this.f111064t;
            if (csVar2 != null && zArr[14]) {
                g19 += b36.f.i(14, csVar2.mo75928xcd1e8d8());
            }
            bw5.eg egVar2 = this.f111065u;
            if (egVar2 != null && zArr[15]) {
                g19 += b36.f.i(15, egVar2.mo75928xcd1e8d8());
            }
            bw5.ny nyVar2 = this.f111066v;
            if (nyVar2 != null && zArr[16]) {
                g19 += b36.f.i(16, nyVar2.mo75928xcd1e8d8());
            }
            bw5.ps psVar2 = this.f111067w;
            if (psVar2 != null && zArr[17]) {
                g19 += b36.f.i(17, psVar2.mo75928xcd1e8d8());
            }
            bw5.iq iqVar2 = this.f111068x;
            if (iqVar2 != null && zArr[18]) {
                g19 += b36.f.i(18, iqVar2.mo75928xcd1e8d8());
            }
            if (zArr[19]) {
                g19 += b36.f.h(19, this.f111069y);
            }
            bw5.ed edVar2 = this.f111070z;
            if (edVar2 != null && zArr[20]) {
                g19 += b36.f.i(20, edVar2.mo75928xcd1e8d8());
            }
            bw5.fr frVar4 = this.A;
            if (frVar4 != null && zArr[21]) {
                g19 += b36.f.i(21, frVar4.mo75928xcd1e8d8());
            }
            bw5.i00 i00Var2 = this.B;
            if (i00Var2 != null && zArr[22]) {
                g19 += b36.f.i(22, i00Var2.mo75928xcd1e8d8());
            }
            bw5.fg fgVar2 = this.C;
            if (fgVar2 != null && zArr[23]) {
                g19 += b36.f.i(23, fgVar2.mo75928xcd1e8d8());
            }
            bw5.xg0 xg0Var2 = this.D;
            if (xg0Var2 != null && zArr[24]) {
                g19 += b36.f.i(24, xg0Var2.mo75928xcd1e8d8());
            }
            bw5.sp spVar6 = this.E;
            if (spVar6 != null && zArr[25]) {
                g19 += b36.f.i(25, spVar6.mo75928xcd1e8d8());
            }
            int g27 = g19 + b36.f.g(26, 8, this.F);
            bw5.tf tfVar2 = this.G;
            if (tfVar2 != null && zArr[27]) {
                g27 += b36.f.i(27, tfVar2.mo75928xcd1e8d8());
            }
            bw5.vt vtVar2 = this.H;
            if (vtVar2 != null && zArr[28]) {
                g27 += b36.f.i(28, vtVar2.mo75928xcd1e8d8());
            }
            bw5.qr qrVar2 = this.I;
            if (qrVar2 != null && zArr[29]) {
                g27 += b36.f.i(29, qrVar2.mo75928xcd1e8d8());
            }
            bw5.tq tqVar2 = this.f111050J;
            if (tqVar2 != null && zArr[30]) {
                g27 += b36.f.i(30, tqVar2.mo75928xcd1e8d8());
            }
            bw5.qq qqVar2 = this.K;
            if (qqVar2 != null && zArr[31]) {
                g27 += b36.f.i(31, qqVar2.mo75928xcd1e8d8());
            }
            bw5.zy zyVar2 = this.L;
            if (zyVar2 != null && zArr[32]) {
                g27 += b36.f.i(32, zyVar2.mo75928xcd1e8d8());
            }
            bw5.bg bgVar2 = this.M;
            if (bgVar2 != null && zArr[33]) {
                g27 += b36.f.i(33, bgVar2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.N;
            if (str4 != null && zArr[34]) {
                g27 += b36.f.j(34, str4);
            }
            bw5.yq yqVar2 = this.P;
            if (yqVar2 != null && zArr[35]) {
                g27 += b36.f.i(35, yqVar2.mo75928xcd1e8d8());
            }
            bw5.cw cwVar2 = this.Q;
            if (cwVar2 != null && zArr[36]) {
                g27 += b36.f.i(36, cwVar2.mo75928xcd1e8d8());
            }
            bw5.we weVar2 = this.R;
            if (weVar2 != null && zArr[38]) {
                g27 += b36.f.i(38, weVar2.mo75928xcd1e8d8());
            }
            return zArr[39] ? g27 + b36.f.f(39, this.S) : g27;
        }
        if (i17 == 2) {
            this.f111052e.clear();
            this.f111058n.clear();
            this.f111061q.clear();
            this.F.clear();
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
        switch (intValue) {
            case 1:
                this.f111051d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.jq jqVar = new bw5.jq();
                    if (bArr != null && bArr.length > 0) {
                        jqVar.mo11468x92b714fd(bArr);
                    }
                    this.f111052e.add(jqVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f111053f = aVar2.h(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.nq nqVar3 = new bw5.nq();
                    if (bArr2 != null && bArr2.length > 0) {
                        nqVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f111054g = nqVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.sp spVar7 = new bw5.sp();
                    if (bArr3 != null && bArr3.length > 0) {
                        spVar7.mo11468x92b714fd(bArr3);
                    }
                    this.f111055h = spVar7;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.gf gfVar3 = new bw5.gf();
                    if (bArr4 != null && bArr4.length > 0) {
                        gfVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f111056i = gfVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.xy xyVar3 = new bw5.xy();
                    if (bArr5 != null && bArr5.length > 0) {
                        xyVar3.mo11468x92b714fd(bArr5);
                    }
                    this.f111057m = xyVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.vq vqVar = new bw5.vq();
                    if (bArr6 != null && bArr6.length > 0) {
                        vqVar.mo11468x92b714fd(bArr6);
                    }
                    this.f111058n.add(vqVar);
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.tl tlVar3 = new bw5.tl();
                    if (bArr7 != null && bArr7.length > 0) {
                        tlVar3.mo11468x92b714fd(bArr7);
                    }
                    this.f111059o = tlVar3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.sp spVar8 = new bw5.sp();
                    if (bArr8 != null && bArr8.length > 0) {
                        spVar8.mo11468x92b714fd(bArr8);
                    }
                    this.f111060p = spVar8;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.uq uqVar = new bw5.uq();
                    if (bArr9 != null && bArr9.length > 0) {
                        uqVar.mo11468x92b714fd(bArr9);
                    }
                    this.f111061q.add(uqVar);
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.tp tpVar3 = new bw5.tp();
                    if (bArr10 != null && bArr10.length > 0) {
                        tpVar3.mo11468x92b714fd(bArr10);
                    }
                    this.f111062r = tpVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.fr frVar5 = new bw5.fr();
                    if (bArr11 != null && bArr11.length > 0) {
                        frVar5.mo11468x92b714fd(bArr11);
                    }
                    this.f111063s = frVar5;
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.cs csVar3 = new bw5.cs();
                    if (bArr12 != null && bArr12.length > 0) {
                        csVar3.mo11468x92b714fd(bArr12);
                    }
                    this.f111064t = csVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.eg egVar3 = new bw5.eg();
                    if (bArr13 != null && bArr13.length > 0) {
                        egVar3.mo11468x92b714fd(bArr13);
                    }
                    this.f111065u = egVar3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    bw5.ny nyVar3 = new bw5.ny();
                    if (bArr14 != null && bArr14.length > 0) {
                        nyVar3.mo11468x92b714fd(bArr14);
                    }
                    this.f111066v = nyVar3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr15 = (byte[]) j59.get(i67);
                    bw5.ps psVar3 = new bw5.ps();
                    if (bArr15 != null && bArr15.length > 0) {
                        psVar3.mo11468x92b714fd(bArr15);
                    }
                    this.f111067w = psVar3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr16 = (byte[]) j66.get(i68);
                    bw5.iq iqVar3 = new bw5.iq();
                    if (bArr16 != null && bArr16.length > 0) {
                        iqVar3.mo11468x92b714fd(bArr16);
                    }
                    this.f111068x = iqVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f111069y = aVar2.i(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j67 = aVar2.j(intValue);
                int size17 = j67.size();
                for (int i69 = 0; i69 < size17; i69++) {
                    byte[] bArr17 = (byte[]) j67.get(i69);
                    bw5.ed edVar3 = new bw5.ed();
                    if (bArr17 != null && bArr17.length > 0) {
                        edVar3.mo11468x92b714fd(bArr17);
                    }
                    this.f111070z = edVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j68 = aVar2.j(intValue);
                int size18 = j68.size();
                for (int i76 = 0; i76 < size18; i76++) {
                    byte[] bArr18 = (byte[]) j68.get(i76);
                    bw5.fr frVar6 = new bw5.fr();
                    if (bArr18 != null && bArr18.length > 0) {
                        frVar6.mo11468x92b714fd(bArr18);
                    }
                    this.A = frVar6;
                }
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j69 = aVar2.j(intValue);
                int size19 = j69.size();
                for (int i77 = 0; i77 < size19; i77++) {
                    byte[] bArr19 = (byte[]) j69.get(i77);
                    bw5.i00 i00Var3 = new bw5.i00();
                    if (bArr19 != null && bArr19.length > 0) {
                        i00Var3.mo11468x92b714fd(bArr19);
                    }
                    this.B = i00Var3;
                }
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j76 = aVar2.j(intValue);
                int size20 = j76.size();
                for (int i78 = 0; i78 < size20; i78++) {
                    byte[] bArr20 = (byte[]) j76.get(i78);
                    bw5.fg fgVar3 = new bw5.fg();
                    if (bArr20 != null && bArr20.length > 0) {
                        fgVar3.mo11468x92b714fd(bArr20);
                    }
                    this.C = fgVar3;
                }
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j77 = aVar2.j(intValue);
                int size21 = j77.size();
                for (int i79 = 0; i79 < size21; i79++) {
                    byte[] bArr21 = (byte[]) j77.get(i79);
                    bw5.xg0 xg0Var3 = new bw5.xg0();
                    if (bArr21 != null && bArr21.length > 0) {
                        xg0Var3.mo11468x92b714fd(bArr21);
                    }
                    this.D = xg0Var3;
                }
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j78 = aVar2.j(intValue);
                int size22 = j78.size();
                for (int i86 = 0; i86 < size22; i86++) {
                    byte[] bArr22 = (byte[]) j78.get(i86);
                    bw5.sp spVar9 = new bw5.sp();
                    if (bArr22 != null && bArr22.length > 0) {
                        spVar9.mo11468x92b714fd(bArr22);
                    }
                    this.E = spVar9;
                }
                zArr[25] = true;
                return 0;
            case 26:
                java.util.LinkedList j79 = aVar2.j(intValue);
                int size23 = j79.size();
                for (int i87 = 0; i87 < size23; i87++) {
                    byte[] bArr23 = (byte[]) j79.get(i87);
                    bw5.aw awVar = new bw5.aw();
                    if (bArr23 != null && bArr23.length > 0) {
                        awVar.mo11468x92b714fd(bArr23);
                    }
                    this.F.add(awVar);
                }
                zArr[26] = true;
                return 0;
            case 27:
                java.util.LinkedList j86 = aVar2.j(intValue);
                int size24 = j86.size();
                for (int i88 = 0; i88 < size24; i88++) {
                    byte[] bArr24 = (byte[]) j86.get(i88);
                    bw5.tf tfVar3 = new bw5.tf();
                    if (bArr24 != null && bArr24.length > 0) {
                        tfVar3.mo11468x92b714fd(bArr24);
                    }
                    this.G = tfVar3;
                }
                zArr[27] = true;
                return 0;
            case 28:
                java.util.LinkedList j87 = aVar2.j(intValue);
                int size25 = j87.size();
                for (int i89 = 0; i89 < size25; i89++) {
                    byte[] bArr25 = (byte[]) j87.get(i89);
                    bw5.vt vtVar3 = new bw5.vt();
                    if (bArr25 != null && bArr25.length > 0) {
                        vtVar3.mo11468x92b714fd(bArr25);
                    }
                    this.H = vtVar3;
                }
                zArr[28] = true;
                return 0;
            case 29:
                java.util.LinkedList j88 = aVar2.j(intValue);
                int size26 = j88.size();
                for (int i96 = 0; i96 < size26; i96++) {
                    byte[] bArr26 = (byte[]) j88.get(i96);
                    bw5.qr qrVar3 = new bw5.qr();
                    if (bArr26 != null && bArr26.length > 0) {
                        qrVar3.mo11468x92b714fd(bArr26);
                    }
                    this.I = qrVar3;
                }
                zArr[29] = true;
                return 0;
            case 30:
                java.util.LinkedList j89 = aVar2.j(intValue);
                int size27 = j89.size();
                for (int i97 = 0; i97 < size27; i97++) {
                    byte[] bArr27 = (byte[]) j89.get(i97);
                    bw5.tq tqVar3 = new bw5.tq();
                    if (bArr27 != null && bArr27.length > 0) {
                        tqVar3.mo11468x92b714fd(bArr27);
                    }
                    this.f111050J = tqVar3;
                }
                zArr[30] = true;
                return 0;
            case 31:
                java.util.LinkedList j96 = aVar2.j(intValue);
                int size28 = j96.size();
                for (int i98 = 0; i98 < size28; i98++) {
                    byte[] bArr28 = (byte[]) j96.get(i98);
                    bw5.qq qqVar3 = new bw5.qq();
                    if (bArr28 != null && bArr28.length > 0) {
                        qqVar3.mo11468x92b714fd(bArr28);
                    }
                    this.K = qqVar3;
                }
                zArr[31] = true;
                return 0;
            case 32:
                java.util.LinkedList j97 = aVar2.j(intValue);
                int size29 = j97.size();
                for (int i99 = 0; i99 < size29; i99++) {
                    byte[] bArr29 = (byte[]) j97.get(i99);
                    bw5.zy zyVar3 = new bw5.zy();
                    if (bArr29 != null && bArr29.length > 0) {
                        zyVar3.mo11468x92b714fd(bArr29);
                    }
                    this.L = zyVar3;
                }
                zArr[32] = true;
                return 0;
            case 33:
                java.util.LinkedList j98 = aVar2.j(intValue);
                int size30 = j98.size();
                for (int i100 = 0; i100 < size30; i100++) {
                    byte[] bArr30 = (byte[]) j98.get(i100);
                    bw5.bg bgVar3 = new bw5.bg();
                    if (bArr30 != null && bArr30.length > 0) {
                        bgVar3.mo11468x92b714fd(bArr30);
                    }
                    this.M = bgVar3;
                }
                zArr[33] = true;
                return 0;
            case 34:
                this.N = aVar2.k(intValue);
                zArr[34] = true;
                return 0;
            case 35:
                java.util.LinkedList j99 = aVar2.j(intValue);
                int size31 = j99.size();
                for (int i101 = 0; i101 < size31; i101++) {
                    byte[] bArr31 = (byte[]) j99.get(i101);
                    bw5.yq yqVar3 = new bw5.yq();
                    if (bArr31 != null && bArr31.length > 0) {
                        yqVar3.mo11468x92b714fd(bArr31);
                    }
                    this.P = yqVar3;
                }
                zArr[35] = true;
                return 0;
            case 36:
                java.util.LinkedList j100 = aVar2.j(intValue);
                int size32 = j100.size();
                for (int i102 = 0; i102 < size32; i102++) {
                    byte[] bArr32 = (byte[]) j100.get(i102);
                    bw5.cw cwVar3 = new bw5.cw();
                    if (bArr32 != null && bArr32.length > 0) {
                        cwVar3.mo11468x92b714fd(bArr32);
                    }
                    this.Q = cwVar3;
                }
                zArr[36] = true;
                return 0;
            case 37:
            default:
                return -1;
            case 38:
                java.util.LinkedList j101 = aVar2.j(intValue);
                int size33 = j101.size();
                for (int i103 = 0; i103 < size33; i103++) {
                    byte[] bArr33 = (byte[]) j101.get(i103);
                    bw5.we weVar3 = new bw5.we();
                    if (bArr33 != null && bArr33.length > 0) {
                        weVar3.mo11468x92b714fd(bArr33);
                    }
                    this.R = weVar3;
                }
                zArr[38] = true;
                return 0;
            case 39:
                this.S = aVar2.h(intValue);
                zArr[39] = true;
                return 0;
        }
    }
}
