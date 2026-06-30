package bw5;

/* loaded from: classes2.dex */
public class ti0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f114979J;
    public java.lang.String K;
    public int L;
    public int M;
    public java.lang.String N;
    public int P;
    public java.lang.String Q;
    public java.lang.String R;
    public java.lang.String S;
    public java.lang.String T;
    public final boolean[] U = new boolean[40];

    /* renamed from: d, reason: collision with root package name */
    public int f114980d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f114981e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f114982f;

    /* renamed from: g, reason: collision with root package name */
    public long f114983g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f114984h;

    /* renamed from: i, reason: collision with root package name */
    public int f114985i;

    /* renamed from: m, reason: collision with root package name */
    public int f114986m;

    /* renamed from: n, reason: collision with root package name */
    public int f114987n;

    /* renamed from: o, reason: collision with root package name */
    public long f114988o;

    /* renamed from: p, reason: collision with root package name */
    public int f114989p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f114990q;

    /* renamed from: r, reason: collision with root package name */
    public int f114991r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f114992s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f114993t;

    /* renamed from: u, reason: collision with root package name */
    public int f114994u;

    /* renamed from: v, reason: collision with root package name */
    public int f114995v;

    /* renamed from: w, reason: collision with root package name */
    public int f114996w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f114997x;

    /* renamed from: y, reason: collision with root package name */
    public int f114998y;

    /* renamed from: z, reason: collision with root package name */
    public int f114999z;

    static {
        new bw5.ti0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ti0)) {
            return false;
        }
        bw5.ti0 ti0Var = (bw5.ti0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f114980d), java.lang.Integer.valueOf(ti0Var.f114980d)) && n51.f.a(this.f114981e, ti0Var.f114981e) && n51.f.a(this.f114982f, ti0Var.f114982f) && n51.f.a(java.lang.Long.valueOf(this.f114983g), java.lang.Long.valueOf(ti0Var.f114983g)) && n51.f.a(this.f114984h, ti0Var.f114984h) && n51.f.a(java.lang.Integer.valueOf(this.f114985i), java.lang.Integer.valueOf(ti0Var.f114985i)) && n51.f.a(java.lang.Integer.valueOf(this.f114986m), java.lang.Integer.valueOf(ti0Var.f114986m)) && n51.f.a(java.lang.Integer.valueOf(this.f114987n), java.lang.Integer.valueOf(ti0Var.f114987n)) && n51.f.a(java.lang.Long.valueOf(this.f114988o), java.lang.Long.valueOf(ti0Var.f114988o)) && n51.f.a(java.lang.Integer.valueOf(this.f114989p), java.lang.Integer.valueOf(ti0Var.f114989p)) && n51.f.a(this.f114990q, ti0Var.f114990q) && n51.f.a(java.lang.Integer.valueOf(this.f114991r), java.lang.Integer.valueOf(ti0Var.f114991r)) && n51.f.a(this.f114992s, ti0Var.f114992s) && n51.f.a(this.f114993t, ti0Var.f114993t) && n51.f.a(java.lang.Integer.valueOf(this.f114994u), java.lang.Integer.valueOf(ti0Var.f114994u)) && n51.f.a(java.lang.Integer.valueOf(this.f114995v), java.lang.Integer.valueOf(ti0Var.f114995v)) && n51.f.a(java.lang.Integer.valueOf(this.f114996w), java.lang.Integer.valueOf(ti0Var.f114996w)) && n51.f.a(this.f114997x, ti0Var.f114997x) && n51.f.a(java.lang.Integer.valueOf(this.f114998y), java.lang.Integer.valueOf(ti0Var.f114998y)) && n51.f.a(java.lang.Integer.valueOf(this.f114999z), java.lang.Integer.valueOf(ti0Var.f114999z)) && n51.f.a(this.A, ti0Var.A) && n51.f.a(this.B, ti0Var.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(ti0Var.C)) && n51.f.a(this.D, ti0Var.D) && n51.f.a(this.E, ti0Var.E) && n51.f.a(this.F, ti0Var.F) && n51.f.a(this.G, ti0Var.G) && n51.f.a(this.H, ti0Var.H) && n51.f.a(this.I, ti0Var.I) && n51.f.a(java.lang.Integer.valueOf(this.f114979J), java.lang.Integer.valueOf(ti0Var.f114979J)) && n51.f.a(this.K, ti0Var.K) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(ti0Var.L)) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(ti0Var.M)) && n51.f.a(this.N, ti0Var.N) && n51.f.a(java.lang.Integer.valueOf(this.P), java.lang.Integer.valueOf(ti0Var.P)) && n51.f.a(this.Q, ti0Var.Q) && n51.f.a(this.R, ti0Var.R) && n51.f.a(this.S, ti0Var.S) && n51.f.a(this.T, ti0Var.T);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ti0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.U;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f114980d);
            }
            java.lang.String str = this.f114981e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f114982f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.h(4, this.f114983g);
            }
            java.lang.String str3 = this.f114984h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f114985i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f114986m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f114987n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f114988o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f114989p);
            }
            java.lang.String str4 = this.f114990q;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            if (zArr[12]) {
                fVar.e(12, this.f114991r);
            }
            java.lang.String str5 = this.f114992s;
            if (str5 != null && zArr[13]) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f114993t;
            if (str6 != null && zArr[14]) {
                fVar.j(14, str6);
            }
            if (zArr[15]) {
                fVar.e(15, this.f114994u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f114995v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f114996w);
            }
            java.lang.String str7 = this.f114997x;
            if (str7 != null && zArr[18]) {
                fVar.j(18, str7);
            }
            if (zArr[19]) {
                fVar.e(19, this.f114998y);
            }
            if (zArr[20]) {
                fVar.e(20, this.f114999z);
            }
            java.lang.String str8 = this.A;
            if (str8 != null && zArr[21]) {
                fVar.j(21, str8);
            }
            java.lang.String str9 = this.B;
            if (str9 != null && zArr[22]) {
                fVar.j(22, str9);
            }
            if (zArr[23]) {
                fVar.e(23, this.C);
            }
            java.lang.String str10 = this.D;
            if (str10 != null && zArr[24]) {
                fVar.j(24, str10);
            }
            java.lang.String str11 = this.E;
            if (str11 != null && zArr[25]) {
                fVar.j(25, str11);
            }
            java.lang.String str12 = this.F;
            if (str12 != null && zArr[26]) {
                fVar.j(26, str12);
            }
            java.lang.String str13 = this.G;
            if (str13 != null && zArr[27]) {
                fVar.j(27, str13);
            }
            java.lang.String str14 = this.H;
            if (str14 != null && zArr[28]) {
                fVar.j(28, str14);
            }
            java.lang.String str15 = this.I;
            if (str15 != null && zArr[29]) {
                fVar.j(29, str15);
            }
            if (zArr[30]) {
                fVar.e(30, this.f114979J);
            }
            java.lang.String str16 = this.K;
            if (str16 != null && zArr[31]) {
                fVar.j(31, str16);
            }
            if (zArr[32]) {
                fVar.e(32, this.L);
            }
            if (zArr[33]) {
                fVar.e(33, this.M);
            }
            java.lang.String str17 = this.N;
            if (str17 != null && zArr[34]) {
                fVar.j(34, str17);
            }
            if (zArr[35]) {
                fVar.e(35, this.P);
            }
            java.lang.String str18 = this.Q;
            if (str18 != null && zArr[36]) {
                fVar.j(36, str18);
            }
            java.lang.String str19 = this.R;
            if (str19 != null && zArr[37]) {
                fVar.j(37, str19);
            }
            java.lang.String str20 = this.S;
            if (str20 != null && zArr[38]) {
                fVar.j(38, str20);
            }
            java.lang.String str21 = this.T;
            if (str21 != null && zArr[39]) {
                fVar.j(39, str21);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f114980d) + 0 : 0;
            java.lang.String str22 = this.f114981e;
            if (str22 != null && zArr[2]) {
                e17 += b36.f.j(2, str22);
            }
            java.lang.String str23 = this.f114982f;
            if (str23 != null && zArr[3]) {
                e17 += b36.f.j(3, str23);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f114983g);
            }
            java.lang.String str24 = this.f114984h;
            if (str24 != null && zArr[5]) {
                e17 += b36.f.j(5, str24);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f114985i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f114986m);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f114987n);
            }
            if (zArr[9]) {
                e17 += b36.f.h(9, this.f114988o);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f114989p);
            }
            java.lang.String str25 = this.f114990q;
            if (str25 != null && zArr[11]) {
                e17 += b36.f.j(11, str25);
            }
            if (zArr[12]) {
                e17 += b36.f.e(12, this.f114991r);
            }
            java.lang.String str26 = this.f114992s;
            if (str26 != null && zArr[13]) {
                e17 += b36.f.j(13, str26);
            }
            java.lang.String str27 = this.f114993t;
            if (str27 != null && zArr[14]) {
                e17 += b36.f.j(14, str27);
            }
            if (zArr[15]) {
                e17 += b36.f.e(15, this.f114994u);
            }
            if (zArr[16]) {
                e17 += b36.f.e(16, this.f114995v);
            }
            if (zArr[17]) {
                e17 += b36.f.e(17, this.f114996w);
            }
            java.lang.String str28 = this.f114997x;
            if (str28 != null && zArr[18]) {
                e17 += b36.f.j(18, str28);
            }
            if (zArr[19]) {
                e17 += b36.f.e(19, this.f114998y);
            }
            if (zArr[20]) {
                e17 += b36.f.e(20, this.f114999z);
            }
            java.lang.String str29 = this.A;
            if (str29 != null && zArr[21]) {
                e17 += b36.f.j(21, str29);
            }
            java.lang.String str30 = this.B;
            if (str30 != null && zArr[22]) {
                e17 += b36.f.j(22, str30);
            }
            if (zArr[23]) {
                e17 += b36.f.e(23, this.C);
            }
            java.lang.String str31 = this.D;
            if (str31 != null && zArr[24]) {
                e17 += b36.f.j(24, str31);
            }
            java.lang.String str32 = this.E;
            if (str32 != null && zArr[25]) {
                e17 += b36.f.j(25, str32);
            }
            java.lang.String str33 = this.F;
            if (str33 != null && zArr[26]) {
                e17 += b36.f.j(26, str33);
            }
            java.lang.String str34 = this.G;
            if (str34 != null && zArr[27]) {
                e17 += b36.f.j(27, str34);
            }
            java.lang.String str35 = this.H;
            if (str35 != null && zArr[28]) {
                e17 += b36.f.j(28, str35);
            }
            java.lang.String str36 = this.I;
            if (str36 != null && zArr[29]) {
                e17 += b36.f.j(29, str36);
            }
            if (zArr[30]) {
                e17 += b36.f.e(30, this.f114979J);
            }
            java.lang.String str37 = this.K;
            if (str37 != null && zArr[31]) {
                e17 += b36.f.j(31, str37);
            }
            if (zArr[32]) {
                e17 += b36.f.e(32, this.L);
            }
            if (zArr[33]) {
                e17 += b36.f.e(33, this.M);
            }
            java.lang.String str38 = this.N;
            if (str38 != null && zArr[34]) {
                e17 += b36.f.j(34, str38);
            }
            if (zArr[35]) {
                e17 += b36.f.e(35, this.P);
            }
            java.lang.String str39 = this.Q;
            if (str39 != null && zArr[36]) {
                e17 += b36.f.j(36, str39);
            }
            java.lang.String str40 = this.R;
            if (str40 != null && zArr[37]) {
                e17 += b36.f.j(37, str40);
            }
            java.lang.String str41 = this.S;
            if (str41 != null && zArr[38]) {
                e17 += b36.f.j(38, str41);
            }
            java.lang.String str42 = this.T;
            return (str42 == null || !zArr[39]) ? e17 : e17 + b36.f.j(39, str42);
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
        switch (intValue) {
            case 1:
                this.f114980d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114981e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114982f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114983g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114984h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114985i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f114986m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f114987n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f114988o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f114989p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f114990q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f114991r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f114992s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f114993t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f114994u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f114995v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f114996w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f114997x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f114998y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f114999z = aVar2.g(intValue);
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
                this.C = aVar2.g(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.k(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.k(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.k(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.k(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.k(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.k(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                this.f114979J = aVar2.g(intValue);
                zArr[30] = true;
                return 0;
            case 31:
                this.K = aVar2.k(intValue);
                zArr[31] = true;
                return 0;
            case 32:
                this.L = aVar2.g(intValue);
                zArr[32] = true;
                return 0;
            case 33:
                this.M = aVar2.g(intValue);
                zArr[33] = true;
                return 0;
            case 34:
                this.N = aVar2.k(intValue);
                zArr[34] = true;
                return 0;
            case 35:
                this.P = aVar2.g(intValue);
                zArr[35] = true;
                return 0;
            case 36:
                this.Q = aVar2.k(intValue);
                zArr[36] = true;
                return 0;
            case 37:
                this.R = aVar2.k(intValue);
                zArr[37] = true;
                return 0;
            case 38:
                this.S = aVar2.k(intValue);
                zArr[38] = true;
                return 0;
            case 39:
                this.T = aVar2.k(intValue);
                zArr[39] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.ti0) super.mo11468x92b714fd(bArr);
    }
}
