package bw5;

/* loaded from: classes2.dex */
public class dz extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public bw5.cz A;
    public bw5.gr B;
    public bw5.h10 C;
    public bw5.j00 D;
    public bw5.sr E;
    public int F;
    public bw5.nd G;
    public final boolean[] H = new boolean[28];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108177d;

    /* renamed from: e, reason: collision with root package name */
    public long f108178e;

    /* renamed from: f, reason: collision with root package name */
    public int f108179f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108180g;

    /* renamed from: h, reason: collision with root package name */
    public int f108181h;

    /* renamed from: i, reason: collision with root package name */
    public int f108182i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f108183m;

    /* renamed from: n, reason: collision with root package name */
    public int f108184n;

    /* renamed from: o, reason: collision with root package name */
    public int f108185o;

    /* renamed from: p, reason: collision with root package name */
    public int f108186p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.fr f108187q;

    /* renamed from: r, reason: collision with root package name */
    public int f108188r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.yy f108189s;

    /* renamed from: t, reason: collision with root package name */
    public int f108190t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.ny f108191u;

    /* renamed from: v, reason: collision with root package name */
    public int f108192v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.bf f108193w;

    /* renamed from: x, reason: collision with root package name */
    public int f108194x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f108195y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.kr f108196z;

    static {
        new bw5.dz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dz mo11468x92b714fd(byte[] bArr) {
        return (bw5.dz) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dz)) {
            return false;
        }
        bw5.dz dzVar = (bw5.dz) fVar;
        return n51.f.a(this.f108177d, dzVar.f108177d) && n51.f.a(java.lang.Long.valueOf(this.f108178e), java.lang.Long.valueOf(dzVar.f108178e)) && n51.f.a(java.lang.Integer.valueOf(this.f108179f), java.lang.Integer.valueOf(dzVar.f108179f)) && n51.f.a(this.f108180g, dzVar.f108180g) && n51.f.a(java.lang.Integer.valueOf(this.f108181h), java.lang.Integer.valueOf(dzVar.f108181h)) && n51.f.a(java.lang.Integer.valueOf(this.f108182i), java.lang.Integer.valueOf(dzVar.f108182i)) && n51.f.a(this.f108183m, dzVar.f108183m) && n51.f.a(java.lang.Integer.valueOf(this.f108184n), java.lang.Integer.valueOf(dzVar.f108184n)) && n51.f.a(java.lang.Integer.valueOf(this.f108185o), java.lang.Integer.valueOf(dzVar.f108185o)) && n51.f.a(java.lang.Integer.valueOf(this.f108186p), java.lang.Integer.valueOf(dzVar.f108186p)) && n51.f.a(this.f108187q, dzVar.f108187q) && n51.f.a(java.lang.Integer.valueOf(this.f108188r), java.lang.Integer.valueOf(dzVar.f108188r)) && n51.f.a(this.f108189s, dzVar.f108189s) && n51.f.a(java.lang.Integer.valueOf(this.f108190t), java.lang.Integer.valueOf(dzVar.f108190t)) && n51.f.a(this.f108191u, dzVar.f108191u) && n51.f.a(java.lang.Integer.valueOf(this.f108192v), java.lang.Integer.valueOf(dzVar.f108192v)) && n51.f.a(this.f108193w, dzVar.f108193w) && n51.f.a(java.lang.Integer.valueOf(this.f108194x), java.lang.Integer.valueOf(dzVar.f108194x)) && n51.f.a(this.f108195y, dzVar.f108195y) && n51.f.a(this.f108196z, dzVar.f108196z) && n51.f.a(this.A, dzVar.A) && n51.f.a(this.B, dzVar.B) && n51.f.a(this.C, dzVar.C) && n51.f.a(this.D, dzVar.D) && n51.f.a(this.E, dzVar.E) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(dzVar.F)) && n51.f.a(this.G, dzVar.G);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.dz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.H;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108177d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f108178e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f108179f);
            }
            java.lang.String str2 = this.f108180g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f108181h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f108182i);
            }
            java.lang.String str3 = this.f108183m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f108184n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f108185o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f108186p);
            }
            bw5.fr frVar = this.f108187q;
            if (frVar != null && zArr[11]) {
                fVar.i(11, frVar.mo75928xcd1e8d8());
                this.f108187q.mo75956x3d5d1f78(fVar);
            }
            if (zArr[12]) {
                fVar.e(12, this.f108188r);
            }
            bw5.yy yyVar = this.f108189s;
            if (yyVar != null && zArr[13]) {
                fVar.i(13, yyVar.mo75928xcd1e8d8());
                this.f108189s.mo75956x3d5d1f78(fVar);
            }
            if (zArr[14]) {
                fVar.e(14, this.f108190t);
            }
            bw5.ny nyVar = this.f108191u;
            if (nyVar != null && zArr[15]) {
                fVar.i(15, nyVar.mo75928xcd1e8d8());
                this.f108191u.mo75956x3d5d1f78(fVar);
            }
            if (zArr[16]) {
                fVar.e(16, this.f108192v);
            }
            bw5.bf bfVar = this.f108193w;
            if (bfVar != null && zArr[17]) {
                fVar.i(17, bfVar.mo75928xcd1e8d8());
                this.f108193w.mo75956x3d5d1f78(fVar);
            }
            if (zArr[18]) {
                fVar.e(18, this.f108194x);
            }
            java.lang.String str4 = this.f108195y;
            if (str4 != null && zArr[19]) {
                fVar.j(19, str4);
            }
            bw5.kr krVar = this.f108196z;
            if (krVar != null && zArr[20]) {
                fVar.i(20, krVar.mo75928xcd1e8d8());
                this.f108196z.mo75956x3d5d1f78(fVar);
            }
            bw5.cz czVar = this.A;
            if (czVar != null && zArr[21]) {
                fVar.i(21, czVar.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            bw5.gr grVar = this.B;
            if (grVar != null && zArr[22]) {
                fVar.i(22, grVar.mo75928xcd1e8d8());
                this.B.mo75956x3d5d1f78(fVar);
            }
            bw5.h10 h10Var = this.C;
            if (h10Var != null && zArr[23]) {
                fVar.i(23, h10Var.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            bw5.j00 j00Var = this.D;
            if (j00Var != null && zArr[24]) {
                fVar.i(24, j00Var.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            bw5.sr srVar = this.E;
            if (srVar != null && zArr[25]) {
                fVar.i(25, srVar.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            if (zArr[26]) {
                fVar.e(26, this.F);
            }
            bw5.nd ndVar = this.G;
            if (ndVar != null && zArr[27]) {
                fVar.i(27, ndVar.mo75928xcd1e8d8());
                this.G.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f108177d;
            if (str5 != null && zArr[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f108178e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f108179f);
            }
            java.lang.String str6 = this.f108180g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f108181h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f108182i);
            }
            java.lang.String str7 = this.f108183m;
            if (str7 != null && zArr[7]) {
                i18 += b36.f.j(7, str7);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f108184n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f108185o);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f108186p);
            }
            bw5.fr frVar2 = this.f108187q;
            if (frVar2 != null && zArr[11]) {
                i18 += b36.f.i(11, frVar2.mo75928xcd1e8d8());
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f108188r);
            }
            bw5.yy yyVar2 = this.f108189s;
            if (yyVar2 != null && zArr[13]) {
                i18 += b36.f.i(13, yyVar2.mo75928xcd1e8d8());
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f108190t);
            }
            bw5.ny nyVar2 = this.f108191u;
            if (nyVar2 != null && zArr[15]) {
                i18 += b36.f.i(15, nyVar2.mo75928xcd1e8d8());
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f108192v);
            }
            bw5.bf bfVar2 = this.f108193w;
            if (bfVar2 != null && zArr[17]) {
                i18 += b36.f.i(17, bfVar2.mo75928xcd1e8d8());
            }
            if (zArr[18]) {
                i18 += b36.f.e(18, this.f108194x);
            }
            java.lang.String str8 = this.f108195y;
            if (str8 != null && zArr[19]) {
                i18 += b36.f.j(19, str8);
            }
            bw5.kr krVar2 = this.f108196z;
            if (krVar2 != null && zArr[20]) {
                i18 += b36.f.i(20, krVar2.mo75928xcd1e8d8());
            }
            bw5.cz czVar2 = this.A;
            if (czVar2 != null && zArr[21]) {
                i18 += b36.f.i(21, czVar2.mo75928xcd1e8d8());
            }
            bw5.gr grVar2 = this.B;
            if (grVar2 != null && zArr[22]) {
                i18 += b36.f.i(22, grVar2.mo75928xcd1e8d8());
            }
            bw5.h10 h10Var2 = this.C;
            if (h10Var2 != null && zArr[23]) {
                i18 += b36.f.i(23, h10Var2.mo75928xcd1e8d8());
            }
            bw5.j00 j00Var2 = this.D;
            if (j00Var2 != null && zArr[24]) {
                i18 += b36.f.i(24, j00Var2.mo75928xcd1e8d8());
            }
            bw5.sr srVar2 = this.E;
            if (srVar2 != null && zArr[25]) {
                i18 += b36.f.i(25, srVar2.mo75928xcd1e8d8());
            }
            if (zArr[26]) {
                i18 += b36.f.e(26, this.F);
            }
            bw5.nd ndVar2 = this.G;
            return (ndVar2 == null || !zArr[27]) ? i18 : i18 + b36.f.i(27, ndVar2.mo75928xcd1e8d8());
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
                this.f108177d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108178e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108179f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108180g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108181h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108182i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108183m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108184n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f108185o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f108186p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.fr frVar3 = new bw5.fr();
                    if (bArr != null && bArr.length > 0) {
                        frVar3.mo11468x92b714fd(bArr);
                    }
                    this.f108187q = frVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f108188r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.yy yyVar3 = new bw5.yy();
                    if (bArr2 != null && bArr2.length > 0) {
                        yyVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f108189s = yyVar3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                this.f108190t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.ny nyVar3 = new bw5.ny();
                    if (bArr3 != null && bArr3.length > 0) {
                        nyVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f108191u = nyVar3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                this.f108192v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.bf bfVar3 = new bw5.bf();
                    if (bArr4 != null && bArr4.length > 0) {
                        bfVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f108193w = bfVar3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                this.f108194x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f108195y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.kr krVar3 = new bw5.kr();
                    if (bArr5 != null && bArr5.length > 0) {
                        krVar3.mo11468x92b714fd(bArr5);
                    }
                    this.f108196z = krVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.cz czVar3 = new bw5.cz();
                    if (bArr6 != null && bArr6.length > 0) {
                        czVar3.mo11468x92b714fd(bArr6);
                    }
                    this.A = czVar3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.gr grVar3 = new bw5.gr();
                    if (bArr7 != null && bArr7.length > 0) {
                        grVar3.mo11468x92b714fd(bArr7);
                    }
                    this.B = grVar3;
                }
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.h10 h10Var3 = new bw5.h10();
                    if (bArr8 != null && bArr8.length > 0) {
                        h10Var3.mo11468x92b714fd(bArr8);
                    }
                    this.C = h10Var3;
                }
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.j00 j00Var3 = new bw5.j00();
                    if (bArr9 != null && bArr9.length > 0) {
                        j00Var3.mo11468x92b714fd(bArr9);
                    }
                    this.D = j00Var3;
                }
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.sr srVar3 = new bw5.sr();
                    if (bArr10 != null && bArr10.length > 0) {
                        srVar3.mo11468x92b714fd(bArr10);
                    }
                    this.E = srVar3;
                }
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.g(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.nd ndVar3 = new bw5.nd();
                    if (bArr11 != null && bArr11.length > 0) {
                        ndVar3.mo11468x92b714fd(bArr11);
                    }
                    this.G = ndVar3;
                }
                zArr[27] = true;
                return 0;
            default:
                return -1;
        }
    }
}
