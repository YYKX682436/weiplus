package bw5;

/* loaded from: classes2.dex */
public class bf extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public bw5.xe A;
    public int B;
    public java.lang.String D;
    public bw5.ze E;
    public bw5.cf F;
    public bw5.af G;
    public int H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public bw5.df f107146J;
    public bw5.ye K;

    /* renamed from: d, reason: collision with root package name */
    public long f107147d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ae f107148e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107149f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107150g;

    /* renamed from: h, reason: collision with root package name */
    public int f107151h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f107152i;

    /* renamed from: m, reason: collision with root package name */
    public long f107153m;

    /* renamed from: n, reason: collision with root package name */
    public int f107154n;

    /* renamed from: o, reason: collision with root package name */
    public int f107155o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f107156p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f107157q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f107158r;

    /* renamed from: s, reason: collision with root package name */
    public int f107159s;

    /* renamed from: t, reason: collision with root package name */
    public long f107160t;

    /* renamed from: u, reason: collision with root package name */
    public int f107161u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.pj f107162v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.cz f107163w;

    /* renamed from: x, reason: collision with root package name */
    public long f107164x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.ef f107165y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.pj f107166z;
    public final java.util.LinkedList C = new java.util.LinkedList();
    public final boolean[] L = new boolean[32];

    static {
        new bw5.bf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bf mo11468x92b714fd(byte[] bArr) {
        return (bw5.bf) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bf)) {
            return false;
        }
        bw5.bf bfVar = (bw5.bf) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f107147d), java.lang.Long.valueOf(bfVar.f107147d)) && n51.f.a(this.f107148e, bfVar.f107148e) && n51.f.a(this.f107149f, bfVar.f107149f) && n51.f.a(this.f107150g, bfVar.f107150g) && n51.f.a(java.lang.Integer.valueOf(this.f107151h), java.lang.Integer.valueOf(bfVar.f107151h)) && n51.f.a(this.f107152i, bfVar.f107152i) && n51.f.a(java.lang.Long.valueOf(this.f107153m), java.lang.Long.valueOf(bfVar.f107153m)) && n51.f.a(java.lang.Integer.valueOf(this.f107154n), java.lang.Integer.valueOf(bfVar.f107154n)) && n51.f.a(java.lang.Integer.valueOf(this.f107155o), java.lang.Integer.valueOf(bfVar.f107155o)) && n51.f.a(this.f107156p, bfVar.f107156p) && n51.f.a(this.f107157q, bfVar.f107157q) && n51.f.a(this.f107158r, bfVar.f107158r) && n51.f.a(java.lang.Integer.valueOf(this.f107159s), java.lang.Integer.valueOf(bfVar.f107159s)) && n51.f.a(java.lang.Long.valueOf(this.f107160t), java.lang.Long.valueOf(bfVar.f107160t)) && n51.f.a(java.lang.Integer.valueOf(this.f107161u), java.lang.Integer.valueOf(bfVar.f107161u)) && n51.f.a(this.f107162v, bfVar.f107162v) && n51.f.a(this.f107163w, bfVar.f107163w) && n51.f.a(java.lang.Long.valueOf(this.f107164x), java.lang.Long.valueOf(bfVar.f107164x)) && n51.f.a(this.f107165y, bfVar.f107165y) && n51.f.a(this.f107166z, bfVar.f107166z) && n51.f.a(this.A, bfVar.A) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(bfVar.B)) && n51.f.a(this.C, bfVar.C) && n51.f.a(this.D, bfVar.D) && n51.f.a(this.E, bfVar.E) && n51.f.a(this.F, bfVar.F) && n51.f.a(this.G, bfVar.G) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(bfVar.H)) && n51.f.a(this.I, bfVar.I) && n51.f.a(this.f107146J, bfVar.f107146J) && n51.f.a(this.K, bfVar.K);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.L;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f107147d);
            }
            bw5.ae aeVar = this.f107148e;
            if (aeVar != null && zArr[2]) {
                fVar.i(2, aeVar.mo75928xcd1e8d8());
                this.f107148e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f107149f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f107150g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f107151h);
            }
            java.lang.String str3 = this.f107152i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            if (zArr[7]) {
                fVar.h(7, this.f107153m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f107154n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f107155o);
            }
            java.lang.String str4 = this.f107156p;
            if (str4 != null && zArr[10]) {
                fVar.j(10, str4);
            }
            java.lang.String str5 = this.f107157q;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f107158r;
            if (str6 != null && zArr[12]) {
                fVar.j(12, str6);
            }
            if (zArr[13]) {
                fVar.e(13, this.f107159s);
            }
            if (zArr[14]) {
                fVar.h(14, this.f107160t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f107161u);
            }
            bw5.pj pjVar = this.f107162v;
            if (pjVar != null && zArr[16]) {
                fVar.i(16, pjVar.mo75928xcd1e8d8());
                this.f107162v.mo75956x3d5d1f78(fVar);
            }
            bw5.cz czVar = this.f107163w;
            if (czVar != null && zArr[17]) {
                fVar.i(17, czVar.mo75928xcd1e8d8());
                this.f107163w.mo75956x3d5d1f78(fVar);
            }
            if (zArr[18]) {
                fVar.h(18, this.f107164x);
            }
            bw5.ef efVar = this.f107165y;
            if (efVar != null && zArr[19]) {
                fVar.i(19, efVar.mo75928xcd1e8d8());
                this.f107165y.mo75956x3d5d1f78(fVar);
            }
            bw5.pj pjVar2 = this.f107166z;
            if (pjVar2 != null && zArr[20]) {
                fVar.i(20, pjVar2.mo75928xcd1e8d8());
                this.f107166z.mo75956x3d5d1f78(fVar);
            }
            bw5.xe xeVar = this.A;
            if (xeVar != null && zArr[21]) {
                fVar.i(21, xeVar.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            if (zArr[22]) {
                fVar.e(22, this.B);
            }
            fVar.g(23, 8, this.C);
            java.lang.String str7 = this.D;
            if (str7 != null && zArr[24]) {
                fVar.j(24, str7);
            }
            bw5.ze zeVar = this.E;
            if (zeVar != null && zArr[25]) {
                fVar.i(25, zeVar.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            bw5.cf cfVar = this.F;
            if (cfVar != null && zArr[26]) {
                fVar.i(26, cfVar.mo75928xcd1e8d8());
                this.F.mo75956x3d5d1f78(fVar);
            }
            bw5.af afVar = this.G;
            if (afVar != null && zArr[27]) {
                fVar.i(27, afVar.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            if (zArr[28]) {
                fVar.e(28, this.H);
            }
            java.lang.String str8 = this.I;
            if (str8 != null && zArr[29]) {
                fVar.j(29, str8);
            }
            bw5.df dfVar = this.f107146J;
            if (dfVar != null && zArr[30]) {
                fVar.i(30, dfVar.mo75928xcd1e8d8());
                this.f107146J.mo75956x3d5d1f78(fVar);
            }
            bw5.ye yeVar = this.K;
            if (yeVar != null && zArr[31]) {
                fVar.i(31, yeVar.mo75928xcd1e8d8());
                this.K.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f107147d) + 0 : 0;
            bw5.ae aeVar2 = this.f107148e;
            if (aeVar2 != null && zArr[2]) {
                h17 += b36.f.i(2, aeVar2.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f107149f;
            if (str9 != null && zArr[3]) {
                h17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f107150g;
            if (str10 != null && zArr[4]) {
                h17 += b36.f.j(4, str10);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f107151h);
            }
            java.lang.String str11 = this.f107152i;
            if (str11 != null && zArr[6]) {
                h17 += b36.f.j(6, str11);
            }
            if (zArr[7]) {
                h17 += b36.f.h(7, this.f107153m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f107154n);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f107155o);
            }
            java.lang.String str12 = this.f107156p;
            if (str12 != null && zArr[10]) {
                h17 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f107157q;
            if (str13 != null && zArr[11]) {
                h17 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f107158r;
            if (str14 != null && zArr[12]) {
                h17 += b36.f.j(12, str14);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f107159s);
            }
            if (zArr[14]) {
                h17 += b36.f.h(14, this.f107160t);
            }
            if (zArr[15]) {
                h17 += b36.f.e(15, this.f107161u);
            }
            bw5.pj pjVar3 = this.f107162v;
            if (pjVar3 != null && zArr[16]) {
                h17 += b36.f.i(16, pjVar3.mo75928xcd1e8d8());
            }
            bw5.cz czVar2 = this.f107163w;
            if (czVar2 != null && zArr[17]) {
                h17 += b36.f.i(17, czVar2.mo75928xcd1e8d8());
            }
            if (zArr[18]) {
                h17 += b36.f.h(18, this.f107164x);
            }
            bw5.ef efVar2 = this.f107165y;
            if (efVar2 != null && zArr[19]) {
                h17 += b36.f.i(19, efVar2.mo75928xcd1e8d8());
            }
            bw5.pj pjVar4 = this.f107166z;
            if (pjVar4 != null && zArr[20]) {
                h17 += b36.f.i(20, pjVar4.mo75928xcd1e8d8());
            }
            bw5.xe xeVar2 = this.A;
            if (xeVar2 != null && zArr[21]) {
                h17 += b36.f.i(21, xeVar2.mo75928xcd1e8d8());
            }
            if (zArr[22]) {
                h17 += b36.f.e(22, this.B);
            }
            int g17 = h17 + b36.f.g(23, 8, this.C);
            java.lang.String str15 = this.D;
            if (str15 != null && zArr[24]) {
                g17 += b36.f.j(24, str15);
            }
            bw5.ze zeVar2 = this.E;
            if (zeVar2 != null && zArr[25]) {
                g17 += b36.f.i(25, zeVar2.mo75928xcd1e8d8());
            }
            bw5.cf cfVar2 = this.F;
            if (cfVar2 != null && zArr[26]) {
                g17 += b36.f.i(26, cfVar2.mo75928xcd1e8d8());
            }
            bw5.af afVar2 = this.G;
            if (afVar2 != null && zArr[27]) {
                g17 += b36.f.i(27, afVar2.mo75928xcd1e8d8());
            }
            if (zArr[28]) {
                g17 += b36.f.e(28, this.H);
            }
            java.lang.String str16 = this.I;
            if (str16 != null && zArr[29]) {
                g17 += b36.f.j(29, str16);
            }
            bw5.df dfVar2 = this.f107146J;
            if (dfVar2 != null && zArr[30]) {
                g17 += b36.f.i(30, dfVar2.mo75928xcd1e8d8());
            }
            bw5.ye yeVar2 = this.K;
            return (yeVar2 == null || !zArr[31]) ? g17 : g17 + b36.f.i(31, yeVar2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.C.clear();
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
                this.f107147d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ae aeVar3 = new bw5.ae();
                    if (bArr != null && bArr.length > 0) {
                        aeVar3.mo11468x92b714fd(bArr);
                    }
                    this.f107148e = aeVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f107149f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107150g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107151h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107152i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107153m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107154n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f107155o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f107156p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f107157q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f107158r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f107159s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f107160t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f107161u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.pj pjVar5 = new bw5.pj();
                    if (bArr2 != null && bArr2.length > 0) {
                        pjVar5.mo11468x92b714fd(bArr2);
                    }
                    this.f107162v = pjVar5;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.cz czVar3 = new bw5.cz();
                    if (bArr3 != null && bArr3.length > 0) {
                        czVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f107163w = czVar3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                this.f107164x = aVar2.i(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.ef efVar3 = new bw5.ef();
                    if (bArr4 != null && bArr4.length > 0) {
                        efVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f107165y = efVar3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.pj pjVar6 = new bw5.pj();
                    if (bArr5 != null && bArr5.length > 0) {
                        pjVar6.mo11468x92b714fd(bArr5);
                    }
                    this.f107166z = pjVar6;
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.xe xeVar3 = new bw5.xe();
                    if (bArr6 != null && bArr6.length > 0) {
                        xeVar3.mo11468x92b714fd(bArr6);
                    }
                    this.A = xeVar3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.g(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.pj pjVar7 = new bw5.pj();
                    if (bArr7 != null && bArr7.length > 0) {
                        pjVar7.mo11468x92b714fd(bArr7);
                    }
                    this.C.add(pjVar7);
                }
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.k(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.ze zeVar3 = new bw5.ze();
                    if (bArr8 != null && bArr8.length > 0) {
                        zeVar3.mo11468x92b714fd(bArr8);
                    }
                    this.E = zeVar3;
                }
                zArr[25] = true;
                return 0;
            case 26:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.cf cfVar3 = new bw5.cf();
                    if (bArr9 != null && bArr9.length > 0) {
                        cfVar3.mo11468x92b714fd(bArr9);
                    }
                    this.F = cfVar3;
                }
                zArr[26] = true;
                return 0;
            case 27:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.af afVar3 = new bw5.af();
                    if (bArr10 != null && bArr10.length > 0) {
                        afVar3.mo11468x92b714fd(bArr10);
                    }
                    this.G = afVar3;
                }
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.g(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.k(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    bw5.df dfVar3 = new bw5.df();
                    if (bArr11 != null && bArr11.length > 0) {
                        dfVar3.mo11468x92b714fd(bArr11);
                    }
                    this.f107146J = dfVar3;
                }
                zArr[30] = true;
                return 0;
            case 31:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr12 = (byte[]) j49.get(i57);
                    bw5.ye yeVar3 = new bw5.ye();
                    if (bArr12 != null && bArr12.length > 0) {
                        yeVar3.mo11468x92b714fd(bArr12);
                    }
                    this.K = yeVar3;
                }
                zArr[31] = true;
                return 0;
            default:
                return -1;
        }
    }
}
