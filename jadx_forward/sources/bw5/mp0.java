package bw5;

/* loaded from: classes8.dex */
public class mp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public boolean A;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public java.lang.String H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public bw5.hp0 f111870J;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111871d;

    /* renamed from: e, reason: collision with root package name */
    public int f111872e;

    /* renamed from: f, reason: collision with root package name */
    public int f111873f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f111874g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f111875h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f111876i;

    /* renamed from: m, reason: collision with root package name */
    public int f111877m;

    /* renamed from: n, reason: collision with root package name */
    public int f111878n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f111879o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f111880p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f111881q;

    /* renamed from: r, reason: collision with root package name */
    public int f111882r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f111883s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f111884t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f111885u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f111886v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f111887w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f111888x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.s f111889y;

    /* renamed from: z, reason: collision with root package name */
    public int f111890z;
    public final java.util.LinkedList B = new java.util.LinkedList();
    public final java.util.LinkedList C = new java.util.LinkedList();
    public final boolean[] K = new boolean[31];

    static {
        new bw5.mp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mp0)) {
            return false;
        }
        bw5.mp0 mp0Var = (bw5.mp0) fVar;
        return n51.f.a(this.f111871d, mp0Var.f111871d) && n51.f.a(java.lang.Integer.valueOf(this.f111872e), java.lang.Integer.valueOf(mp0Var.f111872e)) && n51.f.a(java.lang.Integer.valueOf(this.f111873f), java.lang.Integer.valueOf(mp0Var.f111873f)) && n51.f.a(java.lang.Boolean.valueOf(this.f111874g), java.lang.Boolean.valueOf(mp0Var.f111874g)) && n51.f.a(this.f111875h, mp0Var.f111875h) && n51.f.a(this.f111876i, mp0Var.f111876i) && n51.f.a(java.lang.Integer.valueOf(this.f111877m), java.lang.Integer.valueOf(mp0Var.f111877m)) && n51.f.a(java.lang.Integer.valueOf(this.f111878n), java.lang.Integer.valueOf(mp0Var.f111878n)) && n51.f.a(java.lang.Boolean.valueOf(this.f111879o), java.lang.Boolean.valueOf(mp0Var.f111879o)) && n51.f.a(java.lang.Boolean.valueOf(this.f111880p), java.lang.Boolean.valueOf(mp0Var.f111880p)) && n51.f.a(this.f111881q, mp0Var.f111881q) && n51.f.a(java.lang.Integer.valueOf(this.f111882r), java.lang.Integer.valueOf(mp0Var.f111882r)) && n51.f.a(java.lang.Boolean.valueOf(this.f111883s), java.lang.Boolean.valueOf(mp0Var.f111883s)) && n51.f.a(this.f111884t, mp0Var.f111884t) && n51.f.a(this.f111885u, mp0Var.f111885u) && n51.f.a(this.f111886v, mp0Var.f111886v) && n51.f.a(java.lang.Boolean.valueOf(this.f111887w), java.lang.Boolean.valueOf(mp0Var.f111887w)) && n51.f.a(java.lang.Boolean.valueOf(this.f111888x), java.lang.Boolean.valueOf(mp0Var.f111888x)) && n51.f.a(this.f111889y, mp0Var.f111889y) && n51.f.a(java.lang.Integer.valueOf(this.f111890z), java.lang.Integer.valueOf(mp0Var.f111890z)) && n51.f.a(java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(mp0Var.A)) && n51.f.a(this.B, mp0Var.B) && n51.f.a(this.C, mp0Var.C) && n51.f.a(java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(mp0Var.D)) && n51.f.a(java.lang.Boolean.valueOf(this.E), java.lang.Boolean.valueOf(mp0Var.E)) && n51.f.a(java.lang.Boolean.valueOf(this.F), java.lang.Boolean.valueOf(mp0Var.F)) && n51.f.a(java.lang.Boolean.valueOf(this.G), java.lang.Boolean.valueOf(mp0Var.G)) && n51.f.a(this.H, mp0Var.H) && n51.f.a(java.lang.Integer.valueOf(this.I), java.lang.Integer.valueOf(mp0Var.I)) && n51.f.a(this.f111870J, mp0Var.f111870J);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.mp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.K;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f111871d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111872e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f111873f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f111874g);
            }
            java.lang.String str2 = this.f111875h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f111876i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            if (zArr[7]) {
                fVar.e(7, this.f111877m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f111878n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f111879o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f111880p);
            }
            java.lang.String str4 = this.f111881q;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            if (zArr[12]) {
                fVar.e(12, this.f111882r);
            }
            if (zArr[13]) {
                fVar.a(13, this.f111883s);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f111884t;
            if (gVar != null && zArr[14]) {
                fVar.b(14, gVar);
            }
            java.lang.String str5 = this.f111885u;
            if (str5 != null && zArr[15]) {
                fVar.j(15, str5);
            }
            java.lang.String str6 = this.f111886v;
            if (str6 != null && zArr[16]) {
                fVar.j(16, str6);
            }
            if (zArr[17]) {
                fVar.a(17, this.f111887w);
            }
            if (zArr[18]) {
                fVar.a(18, this.f111888x);
            }
            bw5.s sVar = this.f111889y;
            if (sVar != null && zArr[19]) {
                fVar.i(19, sVar.mo75928xcd1e8d8());
                this.f111889y.mo75956x3d5d1f78(fVar);
            }
            if (zArr[20]) {
                fVar.e(20, this.f111890z);
            }
            if (zArr[21]) {
                fVar.a(21, this.A);
            }
            fVar.g(22, 1, this.B);
            fVar.g(23, 1, this.C);
            if (zArr[24]) {
                fVar.a(24, this.D);
            }
            if (zArr[25]) {
                fVar.a(25, this.E);
            }
            if (zArr[26]) {
                fVar.a(26, this.F);
            }
            if (zArr[27]) {
                fVar.a(27, this.G);
            }
            java.lang.String str7 = this.H;
            if (str7 != null && zArr[28]) {
                fVar.j(28, str7);
            }
            if (zArr[29]) {
                fVar.e(29, this.I);
            }
            bw5.hp0 hp0Var = this.f111870J;
            if (hp0Var != null && zArr[30]) {
                fVar.i(30, hp0Var.mo75928xcd1e8d8());
                this.f111870J.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f111871d;
            if (str8 != null && zArr[1]) {
                i18 = b36.f.j(1, str8) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f111872e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f111873f);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f111874g);
            }
            java.lang.String str9 = this.f111875h;
            if (str9 != null && zArr[5]) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f111876i;
            if (str10 != null && zArr[6]) {
                i18 += b36.f.j(6, str10);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f111877m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f111878n);
            }
            if (zArr[9]) {
                i18 += b36.f.a(9, this.f111879o);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f111880p);
            }
            java.lang.String str11 = this.f111881q;
            if (str11 != null && zArr[11]) {
                i18 += b36.f.j(11, str11);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f111882r);
            }
            if (zArr[13]) {
                i18 += b36.f.a(13, this.f111883s);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f111884t;
            if (gVar2 != null && zArr[14]) {
                i18 += b36.f.b(14, gVar2);
            }
            java.lang.String str12 = this.f111885u;
            if (str12 != null && zArr[15]) {
                i18 += b36.f.j(15, str12);
            }
            java.lang.String str13 = this.f111886v;
            if (str13 != null && zArr[16]) {
                i18 += b36.f.j(16, str13);
            }
            if (zArr[17]) {
                i18 += b36.f.a(17, this.f111887w);
            }
            if (zArr[18]) {
                i18 += b36.f.a(18, this.f111888x);
            }
            bw5.s sVar2 = this.f111889y;
            if (sVar2 != null && zArr[19]) {
                i18 += b36.f.i(19, sVar2.mo75928xcd1e8d8());
            }
            if (zArr[20]) {
                i18 += b36.f.e(20, this.f111890z);
            }
            if (zArr[21]) {
                i18 += b36.f.a(21, this.A);
            }
            int g17 = i18 + b36.f.g(22, 1, this.B) + b36.f.g(23, 1, this.C);
            if (zArr[24]) {
                g17 += b36.f.a(24, this.D);
            }
            if (zArr[25]) {
                g17 += b36.f.a(25, this.E);
            }
            if (zArr[26]) {
                g17 += b36.f.a(26, this.F);
            }
            if (zArr[27]) {
                g17 += b36.f.a(27, this.G);
            }
            java.lang.String str14 = this.H;
            if (str14 != null && zArr[28]) {
                g17 += b36.f.j(28, str14);
            }
            if (zArr[29]) {
                g17 += b36.f.e(29, this.I);
            }
            bw5.hp0 hp0Var2 = this.f111870J;
            return (hp0Var2 == null || !zArr[30]) ? g17 : g17 + b36.f.i(30, hp0Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.B.clear();
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
                this.f111871d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111872e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111873f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111874g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111875h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111876i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111877m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111878n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f111879o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f111880p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f111881q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f111882r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f111883s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f111884t = aVar2.d(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f111885u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f111886v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f111887w = aVar2.c(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f111888x = aVar2.c(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.s sVar3 = new bw5.s();
                    if (bArr != null && bArr.length > 0) {
                        sVar3.mo11468x92b714fd(bArr);
                    }
                    this.f111889y = sVar3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                this.f111890z = aVar2.g(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.c(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B.add(aVar2.k(intValue));
                zArr[22] = true;
                return 0;
            case 23:
                this.C.add(aVar2.k(intValue));
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.c(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.c(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.c(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.c(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.k(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.g(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.hp0 hp0Var3 = new bw5.hp0();
                    if (bArr2 != null && bArr2.length > 0) {
                        hp0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f111870J = hp0Var3;
                }
                zArr[30] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.mp0) super.mo11468x92b714fd(bArr);
    }
}
