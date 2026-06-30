package bw5;

/* loaded from: classes2.dex */
public class jl0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public java.lang.String B;
    public boolean D;
    public long E;
    public long F;
    public int G;
    public int H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public bw5.hj0 f110549J;
    public java.lang.String K;
    public bw5.ug0 L;

    /* renamed from: d, reason: collision with root package name */
    public long f110550d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.w2 f110551e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.tr0 f110552f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.wg0 f110553g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f110554h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f110555i;

    /* renamed from: m, reason: collision with root package name */
    public long f110556m;

    /* renamed from: n, reason: collision with root package name */
    public int f110557n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f110558o;

    /* renamed from: p, reason: collision with root package name */
    public long f110559p;

    /* renamed from: q, reason: collision with root package name */
    public int f110560q;

    /* renamed from: r, reason: collision with root package name */
    public long f110561r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f110562s;

    /* renamed from: t, reason: collision with root package name */
    public int f110563t;

    /* renamed from: u, reason: collision with root package name */
    public long f110564u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f110565v;

    /* renamed from: w, reason: collision with root package name */
    public long f110566w;

    /* renamed from: x, reason: collision with root package name */
    public int f110567x;

    /* renamed from: y, reason: collision with root package name */
    public long f110568y;

    /* renamed from: z, reason: collision with root package name */
    public long f110569z;
    public final java.util.LinkedList C = new java.util.LinkedList();
    public final boolean[] M = new boolean[34];

    static {
        new bw5.jl0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jl0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.jl0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jl0)) {
            return false;
        }
        bw5.jl0 jl0Var = (bw5.jl0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f110550d), java.lang.Long.valueOf(jl0Var.f110550d)) && n51.f.a(this.f110551e, jl0Var.f110551e) && n51.f.a(this.f110552f, jl0Var.f110552f) && n51.f.a(this.f110553g, jl0Var.f110553g) && n51.f.a(this.f110554h, jl0Var.f110554h) && n51.f.a(this.f110555i, jl0Var.f110555i) && n51.f.a(java.lang.Long.valueOf(this.f110556m), java.lang.Long.valueOf(jl0Var.f110556m)) && n51.f.a(java.lang.Integer.valueOf(this.f110557n), java.lang.Integer.valueOf(jl0Var.f110557n)) && n51.f.a(this.f110558o, jl0Var.f110558o) && n51.f.a(java.lang.Long.valueOf(this.f110559p), java.lang.Long.valueOf(jl0Var.f110559p)) && n51.f.a(java.lang.Integer.valueOf(this.f110560q), java.lang.Integer.valueOf(jl0Var.f110560q)) && n51.f.a(java.lang.Long.valueOf(this.f110561r), java.lang.Long.valueOf(jl0Var.f110561r)) && n51.f.a(this.f110562s, jl0Var.f110562s) && n51.f.a(java.lang.Integer.valueOf(this.f110563t), java.lang.Integer.valueOf(jl0Var.f110563t)) && n51.f.a(java.lang.Long.valueOf(this.f110564u), java.lang.Long.valueOf(jl0Var.f110564u)) && n51.f.a(this.f110565v, jl0Var.f110565v) && n51.f.a(java.lang.Long.valueOf(this.f110566w), java.lang.Long.valueOf(jl0Var.f110566w)) && n51.f.a(java.lang.Integer.valueOf(this.f110567x), java.lang.Integer.valueOf(jl0Var.f110567x)) && n51.f.a(java.lang.Long.valueOf(this.f110568y), java.lang.Long.valueOf(jl0Var.f110568y)) && n51.f.a(java.lang.Long.valueOf(this.f110569z), java.lang.Long.valueOf(jl0Var.f110569z)) && n51.f.a(this.A, jl0Var.A) && n51.f.a(this.B, jl0Var.B) && n51.f.a(this.C, jl0Var.C) && n51.f.a(java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(jl0Var.D)) && n51.f.a(java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(jl0Var.E)) && n51.f.a(java.lang.Long.valueOf(this.F), java.lang.Long.valueOf(jl0Var.F)) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(jl0Var.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(jl0Var.H)) && n51.f.a(java.lang.Long.valueOf(this.I), java.lang.Long.valueOf(jl0Var.I)) && n51.f.a(this.f110549J, jl0Var.f110549J) && n51.f.a(this.K, jl0Var.K) && n51.f.a(this.L, jl0Var.L);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.jl0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.M;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f110550d);
            }
            bw5.w2 w2Var = this.f110551e;
            if (w2Var != null && zArr[2]) {
                fVar.i(2, w2Var.mo75928xcd1e8d8());
                this.f110551e.mo75956x3d5d1f78(fVar);
            }
            bw5.tr0 tr0Var = this.f110552f;
            if (tr0Var != null && zArr[3]) {
                fVar.i(3, tr0Var.mo75928xcd1e8d8());
                this.f110552f.mo75956x3d5d1f78(fVar);
            }
            bw5.wg0 wg0Var = this.f110553g;
            if (wg0Var != null && zArr[4]) {
                fVar.i(4, wg0Var.mo75928xcd1e8d8());
                this.f110553g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f110554h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f110555i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            if (zArr[7]) {
                fVar.h(7, this.f110556m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f110557n);
            }
            java.lang.String str3 = this.f110558o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.h(10, this.f110559p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f110560q);
            }
            if (zArr[12]) {
                fVar.h(12, this.f110561r);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f110562s;
            if (gVar != null && zArr[13]) {
                fVar.b(13, gVar);
            }
            if (zArr[14]) {
                fVar.e(14, this.f110563t);
            }
            if (zArr[15]) {
                fVar.h(15, this.f110564u);
            }
            java.lang.String str4 = this.f110565v;
            if (str4 != null && zArr[16]) {
                fVar.j(16, str4);
            }
            if (zArr[17]) {
                fVar.h(17, this.f110566w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f110567x);
            }
            if (zArr[19]) {
                fVar.h(19, this.f110568y);
            }
            if (zArr[20]) {
                fVar.h(20, this.f110569z);
            }
            java.lang.String str5 = this.A;
            if (str5 != null && zArr[21]) {
                fVar.j(21, str5);
            }
            java.lang.String str6 = this.B;
            if (str6 != null && zArr[22]) {
                fVar.j(22, str6);
            }
            fVar.g(23, 3, this.C);
            if (zArr[24]) {
                fVar.a(24, this.D);
            }
            if (zArr[25]) {
                fVar.h(25, this.E);
            }
            if (zArr[26]) {
                fVar.h(26, this.F);
            }
            if (zArr[27]) {
                fVar.e(27, this.G);
            }
            if (zArr[28]) {
                fVar.e(28, this.H);
            }
            if (zArr[29]) {
                fVar.h(29, this.I);
            }
            bw5.hj0 hj0Var = this.f110549J;
            if (hj0Var != null && zArr[31]) {
                fVar.i(31, hj0Var.mo75928xcd1e8d8());
                this.f110549J.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str7 = this.K;
            if (str7 != null && zArr[32]) {
                fVar.j(32, str7);
            }
            bw5.ug0 ug0Var = this.L;
            if (ug0Var != null && zArr[33]) {
                fVar.i(33, ug0Var.mo75928xcd1e8d8());
                this.L.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f110550d) + 0 : 0;
            bw5.w2 w2Var2 = this.f110551e;
            if (w2Var2 != null && zArr[2]) {
                h17 += b36.f.i(2, w2Var2.mo75928xcd1e8d8());
            }
            bw5.tr0 tr0Var2 = this.f110552f;
            if (tr0Var2 != null && zArr[3]) {
                h17 += b36.f.i(3, tr0Var2.mo75928xcd1e8d8());
            }
            bw5.wg0 wg0Var2 = this.f110553g;
            if (wg0Var2 != null && zArr[4]) {
                h17 += b36.f.i(4, wg0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f110554h;
            if (str8 != null && zArr[5]) {
                h17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f110555i;
            if (str9 != null && zArr[6]) {
                h17 += b36.f.j(6, str9);
            }
            if (zArr[7]) {
                h17 += b36.f.h(7, this.f110556m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f110557n);
            }
            java.lang.String str10 = this.f110558o;
            if (str10 != null && zArr[9]) {
                h17 += b36.f.j(9, str10);
            }
            if (zArr[10]) {
                h17 += b36.f.h(10, this.f110559p);
            }
            if (zArr[11]) {
                h17 += b36.f.e(11, this.f110560q);
            }
            if (zArr[12]) {
                h17 += b36.f.h(12, this.f110561r);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f110562s;
            if (gVar2 != null && zArr[13]) {
                h17 += b36.f.b(13, gVar2);
            }
            if (zArr[14]) {
                h17 += b36.f.e(14, this.f110563t);
            }
            if (zArr[15]) {
                h17 += b36.f.h(15, this.f110564u);
            }
            java.lang.String str11 = this.f110565v;
            if (str11 != null && zArr[16]) {
                h17 += b36.f.j(16, str11);
            }
            if (zArr[17]) {
                h17 += b36.f.h(17, this.f110566w);
            }
            if (zArr[18]) {
                h17 += b36.f.e(18, this.f110567x);
            }
            if (zArr[19]) {
                h17 += b36.f.h(19, this.f110568y);
            }
            if (zArr[20]) {
                h17 += b36.f.h(20, this.f110569z);
            }
            java.lang.String str12 = this.A;
            if (str12 != null && zArr[21]) {
                h17 += b36.f.j(21, str12);
            }
            java.lang.String str13 = this.B;
            if (str13 != null && zArr[22]) {
                h17 += b36.f.j(22, str13);
            }
            int g17 = h17 + b36.f.g(23, 3, this.C);
            if (zArr[24]) {
                g17 += b36.f.a(24, this.D);
            }
            if (zArr[25]) {
                g17 += b36.f.h(25, this.E);
            }
            if (zArr[26]) {
                g17 += b36.f.h(26, this.F);
            }
            if (zArr[27]) {
                g17 += b36.f.e(27, this.G);
            }
            if (zArr[28]) {
                g17 += b36.f.e(28, this.H);
            }
            if (zArr[29]) {
                g17 += b36.f.h(29, this.I);
            }
            bw5.hj0 hj0Var2 = this.f110549J;
            if (hj0Var2 != null && zArr[31]) {
                g17 += b36.f.i(31, hj0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str14 = this.K;
            if (str14 != null && zArr[32]) {
                g17 += b36.f.j(32, str14);
            }
            bw5.ug0 ug0Var2 = this.L;
            return (ug0Var2 == null || !zArr[33]) ? g17 : g17 + b36.f.i(33, ug0Var2.mo75928xcd1e8d8());
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
                this.f110550d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.w2 w2Var3 = new bw5.w2();
                    if (bArr != null && bArr.length > 0) {
                        w2Var3.mo11468x92b714fd(bArr);
                    }
                    this.f110551e = w2Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.tr0 tr0Var3 = new bw5.tr0();
                    if (bArr2 != null && bArr2.length > 0) {
                        tr0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f110552f = tr0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.wg0 wg0Var3 = new bw5.wg0();
                    if (bArr3 != null && bArr3.length > 0) {
                        wg0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f110553g = wg0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f110554h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f110555i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f110556m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f110557n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f110558o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f110559p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f110560q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f110561r = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f110562s = aVar2.d(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f110563t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f110564u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f110565v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f110566w = aVar2.i(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f110567x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f110568y = aVar2.i(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f110569z = aVar2.i(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.k(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.c(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.i(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.i(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.g(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.g(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.i(intValue);
                zArr[29] = true;
                return 0;
            case 30:
            default:
                return -1;
            case 31:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.hj0 hj0Var3 = new bw5.hj0();
                    if (bArr4 != null && bArr4.length > 0) {
                        hj0Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f110549J = hj0Var3;
                }
                zArr[31] = true;
                return 0;
            case 32:
                this.K = aVar2.k(intValue);
                zArr[32] = true;
                return 0;
            case 33:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.ug0 ug0Var3 = new bw5.ug0();
                    if (bArr5 != null && bArr5.length > 0) {
                        ug0Var3.mo11468x92b714fd(bArr5);
                    }
                    this.L = ug0Var3;
                }
                zArr[33] = true;
                return 0;
        }
    }
}
