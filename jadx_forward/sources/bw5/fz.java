package bw5;

/* loaded from: classes7.dex */
public class fz extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public java.lang.String B;
    public long C;
    public boolean D;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109097d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109098e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109099f;

    /* renamed from: g, reason: collision with root package name */
    public int f109100g;

    /* renamed from: h, reason: collision with root package name */
    public long f109101h;

    /* renamed from: i, reason: collision with root package name */
    public long f109102i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f109103m;

    /* renamed from: n, reason: collision with root package name */
    public int f109104n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f109105o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f109106p;

    /* renamed from: q, reason: collision with root package name */
    public int f109107q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f109108r;

    /* renamed from: s, reason: collision with root package name */
    public int f109109s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f109110t;

    /* renamed from: u, reason: collision with root package name */
    public int f109111u;

    /* renamed from: v, reason: collision with root package name */
    public int f109112v;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f109114x;

    /* renamed from: y, reason: collision with root package name */
    public float f109115y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f109116z;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f109113w = new java.util.LinkedList();
    public final boolean[] E = new boolean[26];

    static {
        new bw5.fz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fz mo11468x92b714fd(byte[] bArr) {
        return (bw5.fz) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fz)) {
            return false;
        }
        bw5.fz fzVar = (bw5.fz) fVar;
        return n51.f.a(this.f109097d, fzVar.f109097d) && n51.f.a(this.f109098e, fzVar.f109098e) && n51.f.a(this.f109099f, fzVar.f109099f) && n51.f.a(java.lang.Integer.valueOf(this.f109100g), java.lang.Integer.valueOf(fzVar.f109100g)) && n51.f.a(java.lang.Long.valueOf(this.f109101h), java.lang.Long.valueOf(fzVar.f109101h)) && n51.f.a(java.lang.Long.valueOf(this.f109102i), java.lang.Long.valueOf(fzVar.f109102i)) && n51.f.a(java.lang.Boolean.valueOf(this.f109103m), java.lang.Boolean.valueOf(fzVar.f109103m)) && n51.f.a(java.lang.Integer.valueOf(this.f109104n), java.lang.Integer.valueOf(fzVar.f109104n)) && n51.f.a(java.lang.Boolean.valueOf(this.f109105o), java.lang.Boolean.valueOf(fzVar.f109105o)) && n51.f.a(java.lang.Boolean.valueOf(this.f109106p), java.lang.Boolean.valueOf(fzVar.f109106p)) && n51.f.a(java.lang.Integer.valueOf(this.f109107q), java.lang.Integer.valueOf(fzVar.f109107q)) && n51.f.a(java.lang.Boolean.valueOf(this.f109108r), java.lang.Boolean.valueOf(fzVar.f109108r)) && n51.f.a(java.lang.Integer.valueOf(this.f109109s), java.lang.Integer.valueOf(fzVar.f109109s)) && n51.f.a(java.lang.Boolean.valueOf(this.f109110t), java.lang.Boolean.valueOf(fzVar.f109110t)) && n51.f.a(java.lang.Integer.valueOf(this.f109111u), java.lang.Integer.valueOf(fzVar.f109111u)) && n51.f.a(java.lang.Integer.valueOf(this.f109112v), java.lang.Integer.valueOf(fzVar.f109112v)) && n51.f.a(this.f109113w, fzVar.f109113w) && n51.f.a(this.f109114x, fzVar.f109114x) && n51.f.a(java.lang.Float.valueOf(this.f109115y), java.lang.Float.valueOf(fzVar.f109115y)) && n51.f.a(this.f109116z, fzVar.f109116z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(fzVar.A)) && n51.f.a(this.B, fzVar.B) && n51.f.a(java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(fzVar.C)) && n51.f.a(java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(fzVar.D));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109097d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f109098e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f109099f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f109100g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f109101h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f109102i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f109103m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f109104n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f109105o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f109106p);
            }
            if (zArr[12]) {
                fVar.e(12, this.f109107q);
            }
            if (zArr[13]) {
                fVar.a(13, this.f109108r);
            }
            if (zArr[14]) {
                fVar.e(14, this.f109109s);
            }
            if (zArr[15]) {
                fVar.a(15, this.f109110t);
            }
            if (zArr[16]) {
                fVar.e(16, this.f109111u);
            }
            if (zArr[17]) {
                fVar.e(17, this.f109112v);
            }
            fVar.g(18, 1, this.f109113w);
            java.lang.String str3 = this.f109114x;
            if (str3 != null && zArr[19]) {
                fVar.j(19, str3);
            }
            if (zArr[20]) {
                fVar.d(20, this.f109115y);
            }
            java.lang.String str4 = this.f109116z;
            if (str4 != null && zArr[21]) {
                fVar.j(21, str4);
            }
            if (zArr[22]) {
                fVar.e(22, this.A);
            }
            java.lang.String str5 = this.B;
            if (str5 != null && zArr[23]) {
                fVar.j(23, str5);
            }
            if (zArr[24]) {
                fVar.h(24, this.C);
            }
            if (zArr[25]) {
                fVar.a(25, this.D);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f109097d;
            if (str6 != null && zArr[1]) {
                i18 = b36.f.j(1, str6) + 0;
            }
            java.lang.String str7 = this.f109098e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f109099f;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f109100g);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f109101h);
            }
            if (zArr[6]) {
                i18 += b36.f.h(6, this.f109102i);
            }
            if (zArr[7]) {
                i18 += b36.f.a(7, this.f109103m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f109104n);
            }
            if (zArr[9]) {
                i18 += b36.f.a(9, this.f109105o);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f109106p);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f109107q);
            }
            if (zArr[13]) {
                i18 += b36.f.a(13, this.f109108r);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f109109s);
            }
            if (zArr[15]) {
                i18 += b36.f.a(15, this.f109110t);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f109111u);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f109112v);
            }
            int g17 = i18 + b36.f.g(18, 1, this.f109113w);
            java.lang.String str8 = this.f109114x;
            if (str8 != null && zArr[19]) {
                g17 += b36.f.j(19, str8);
            }
            if (zArr[20]) {
                g17 += b36.f.d(20, this.f109115y);
            }
            java.lang.String str9 = this.f109116z;
            if (str9 != null && zArr[21]) {
                g17 += b36.f.j(21, str9);
            }
            if (zArr[22]) {
                g17 += b36.f.e(22, this.A);
            }
            java.lang.String str10 = this.B;
            if (str10 != null && zArr[23]) {
                g17 += b36.f.j(23, str10);
            }
            if (zArr[24]) {
                g17 += b36.f.h(24, this.C);
            }
            return zArr[25] ? g17 + b36.f.a(25, this.D) : g17;
        }
        if (i17 == 2) {
            this.f109113w.clear();
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
                this.f109097d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109098e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109099f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109100g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109101h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109102i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109103m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f109104n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f109105o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f109106p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
            default:
                return -1;
            case 12:
                this.f109107q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f109108r = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f109109s = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f109110t = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f109111u = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f109112v = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f109113w.add(aVar2.k(intValue));
                zArr[18] = true;
                return 0;
            case 19:
                this.f109114x = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f109115y = aVar2.f(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.f109116z = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.A = aVar2.g(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.B = aVar2.k(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.C = aVar2.i(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.D = aVar2.c(intValue);
                zArr[25] = true;
                return 0;
        }
    }
}
