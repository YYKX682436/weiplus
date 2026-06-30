package bw5;

/* loaded from: classes2.dex */
public class i00 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public java.lang.String B;
    public java.lang.String C;
    public bw5.d00 D;
    public bw5.c00 E;
    public final boolean[] F = new boolean[29];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109936d;

    /* renamed from: e, reason: collision with root package name */
    public int f109937e;

    /* renamed from: f, reason: collision with root package name */
    public int f109938f;

    /* renamed from: g, reason: collision with root package name */
    public int f109939g;

    /* renamed from: h, reason: collision with root package name */
    public int f109940h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.h00 f109941i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f109942m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.f00 f109943n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f109944o;

    /* renamed from: p, reason: collision with root package name */
    public int f109945p;

    /* renamed from: q, reason: collision with root package name */
    public long f109946q;

    /* renamed from: r, reason: collision with root package name */
    public int f109947r;

    /* renamed from: s, reason: collision with root package name */
    public int f109948s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f109949t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f109950u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f109951v;

    /* renamed from: w, reason: collision with root package name */
    public int f109952w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.g00 f109953x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.e00 f109954y;

    /* renamed from: z, reason: collision with root package name */
    public int f109955z;

    static {
        new bw5.i00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.i00 mo11468x92b714fd(byte[] bArr) {
        return (bw5.i00) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.i00)) {
            return false;
        }
        bw5.i00 i00Var = (bw5.i00) fVar;
        return n51.f.a(this.f109936d, i00Var.f109936d) && n51.f.a(java.lang.Integer.valueOf(this.f109937e), java.lang.Integer.valueOf(i00Var.f109937e)) && n51.f.a(java.lang.Integer.valueOf(this.f109938f), java.lang.Integer.valueOf(i00Var.f109938f)) && n51.f.a(java.lang.Integer.valueOf(this.f109939g), java.lang.Integer.valueOf(i00Var.f109939g)) && n51.f.a(java.lang.Integer.valueOf(this.f109940h), java.lang.Integer.valueOf(i00Var.f109940h)) && n51.f.a(this.f109941i, i00Var.f109941i) && n51.f.a(this.f109942m, i00Var.f109942m) && n51.f.a(this.f109943n, i00Var.f109943n) && n51.f.a(this.f109944o, i00Var.f109944o) && n51.f.a(java.lang.Integer.valueOf(this.f109945p), java.lang.Integer.valueOf(i00Var.f109945p)) && n51.f.a(java.lang.Long.valueOf(this.f109946q), java.lang.Long.valueOf(i00Var.f109946q)) && n51.f.a(java.lang.Integer.valueOf(this.f109947r), java.lang.Integer.valueOf(i00Var.f109947r)) && n51.f.a(java.lang.Integer.valueOf(this.f109948s), java.lang.Integer.valueOf(i00Var.f109948s)) && n51.f.a(this.f109949t, i00Var.f109949t) && n51.f.a(this.f109950u, i00Var.f109950u) && n51.f.a(this.f109951v, i00Var.f109951v) && n51.f.a(java.lang.Integer.valueOf(this.f109952w), java.lang.Integer.valueOf(i00Var.f109952w)) && n51.f.a(this.f109953x, i00Var.f109953x) && n51.f.a(this.f109954y, i00Var.f109954y) && n51.f.a(java.lang.Integer.valueOf(this.f109955z), java.lang.Integer.valueOf(i00Var.f109955z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(i00Var.A)) && n51.f.a(this.B, i00Var.B) && n51.f.a(this.C, i00Var.C) && n51.f.a(this.D, i00Var.D) && n51.f.a(this.E, i00Var.E);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.i00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.F;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109936d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109937e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f109938f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f109939g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f109940h);
            }
            bw5.h00 h00Var = this.f109941i;
            if (h00Var != null && zArr[6]) {
                fVar.i(6, h00Var.mo75928xcd1e8d8());
                this.f109941i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f109942m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            bw5.f00 f00Var = this.f109943n;
            if (f00Var != null && zArr[8]) {
                fVar.i(8, f00Var.mo75928xcd1e8d8());
                this.f109943n.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f109944o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.e(10, this.f109945p);
            }
            if (zArr[11]) {
                fVar.h(11, this.f109946q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f109947r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f109948s);
            }
            java.lang.String str4 = this.f109949t;
            if (str4 != null && zArr[14]) {
                fVar.j(14, str4);
            }
            java.lang.String str5 = this.f109950u;
            if (str5 != null && zArr[15]) {
                fVar.j(15, str5);
            }
            java.lang.String str6 = this.f109951v;
            if (str6 != null && zArr[16]) {
                fVar.j(16, str6);
            }
            if (zArr[17]) {
                fVar.e(17, this.f109952w);
            }
            bw5.g00 g00Var = this.f109953x;
            if (g00Var != null && zArr[18]) {
                fVar.i(18, g00Var.mo75928xcd1e8d8());
                this.f109953x.mo75956x3d5d1f78(fVar);
            }
            bw5.e00 e00Var = this.f109954y;
            if (e00Var != null && zArr[19]) {
                fVar.i(19, e00Var.mo75928xcd1e8d8());
                this.f109954y.mo75956x3d5d1f78(fVar);
            }
            if (zArr[23]) {
                fVar.e(23, this.f109955z);
            }
            if (zArr[24]) {
                fVar.e(24, this.A);
            }
            java.lang.String str7 = this.B;
            if (str7 != null && zArr[25]) {
                fVar.j(25, str7);
            }
            java.lang.String str8 = this.C;
            if (str8 != null && zArr[26]) {
                fVar.j(26, str8);
            }
            bw5.d00 d00Var = this.D;
            if (d00Var != null && zArr[27]) {
                fVar.i(27, d00Var.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            bw5.c00 c00Var = this.E;
            if (c00Var != null && zArr[28]) {
                fVar.i(28, c00Var.mo75928xcd1e8d8());
                this.E.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f109936d;
            if (str9 != null && zArr[1]) {
                i18 = b36.f.j(1, str9) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f109937e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f109938f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f109939g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f109940h);
            }
            bw5.h00 h00Var2 = this.f109941i;
            if (h00Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, h00Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f109942m;
            if (str10 != null && zArr[7]) {
                i18 += b36.f.j(7, str10);
            }
            bw5.f00 f00Var2 = this.f109943n;
            if (f00Var2 != null && zArr[8]) {
                i18 += b36.f.i(8, f00Var2.mo75928xcd1e8d8());
            }
            java.lang.String str11 = this.f109944o;
            if (str11 != null && zArr[9]) {
                i18 += b36.f.j(9, str11);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f109945p);
            }
            if (zArr[11]) {
                i18 += b36.f.h(11, this.f109946q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f109947r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f109948s);
            }
            java.lang.String str12 = this.f109949t;
            if (str12 != null && zArr[14]) {
                i18 += b36.f.j(14, str12);
            }
            java.lang.String str13 = this.f109950u;
            if (str13 != null && zArr[15]) {
                i18 += b36.f.j(15, str13);
            }
            java.lang.String str14 = this.f109951v;
            if (str14 != null && zArr[16]) {
                i18 += b36.f.j(16, str14);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f109952w);
            }
            bw5.g00 g00Var2 = this.f109953x;
            if (g00Var2 != null && zArr[18]) {
                i18 += b36.f.i(18, g00Var2.mo75928xcd1e8d8());
            }
            bw5.e00 e00Var2 = this.f109954y;
            if (e00Var2 != null && zArr[19]) {
                i18 += b36.f.i(19, e00Var2.mo75928xcd1e8d8());
            }
            if (zArr[23]) {
                i18 += b36.f.e(23, this.f109955z);
            }
            if (zArr[24]) {
                i18 += b36.f.e(24, this.A);
            }
            java.lang.String str15 = this.B;
            if (str15 != null && zArr[25]) {
                i18 += b36.f.j(25, str15);
            }
            java.lang.String str16 = this.C;
            if (str16 != null && zArr[26]) {
                i18 += b36.f.j(26, str16);
            }
            bw5.d00 d00Var2 = this.D;
            if (d00Var2 != null && zArr[27]) {
                i18 += b36.f.i(27, d00Var2.mo75928xcd1e8d8());
            }
            bw5.c00 c00Var2 = this.E;
            return (c00Var2 == null || !zArr[28]) ? i18 : i18 + b36.f.i(28, c00Var2.mo75928xcd1e8d8());
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
                this.f109936d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109937e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109938f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109939g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109940h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.h00 h00Var3 = new bw5.h00();
                    if (bArr != null && bArr.length > 0) {
                        h00Var3.mo11468x92b714fd(bArr);
                    }
                    this.f109941i = h00Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f109942m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.f00 f00Var3 = new bw5.f00();
                    if (bArr2 != null && bArr2.length > 0) {
                        f00Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f109943n = f00Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f109944o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f109945p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f109946q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f109947r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f109948s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f109949t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f109950u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f109951v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f109952w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.g00 g00Var3 = new bw5.g00();
                    if (bArr3 != null && bArr3.length > 0) {
                        g00Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f109953x = g00Var3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.e00 e00Var3 = new bw5.e00();
                    if (bArr4 != null && bArr4.length > 0) {
                        e00Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f109954y = e00Var3;
                }
                zArr[19] = true;
                return 0;
            case 20:
            case 21:
            case 22:
            default:
                return -1;
            case 23:
                this.f109955z = aVar2.g(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.A = aVar2.g(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.B = aVar2.k(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.C = aVar2.k(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.d00 d00Var3 = new bw5.d00();
                    if (bArr5 != null && bArr5.length > 0) {
                        d00Var3.mo11468x92b714fd(bArr5);
                    }
                    this.D = d00Var3;
                }
                zArr[27] = true;
                return 0;
            case 28:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.c00 c00Var3 = new bw5.c00();
                    if (bArr6 != null && bArr6.length > 0) {
                        c00Var3.mo11468x92b714fd(bArr6);
                    }
                    this.E = c00Var3;
                }
                zArr[28] = true;
                return 0;
        }
    }
}
