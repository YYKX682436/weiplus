package bw5;

/* loaded from: classes2.dex */
public class e70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public java.lang.String B;
    public int C;
    public bw5.f70 D;
    public final boolean[] E = new boolean[26];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108291d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108292e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108293f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108294g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f108295h;

    /* renamed from: i, reason: collision with root package name */
    public int f108296i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f108297m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f108298n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f108299o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.k40 f108300p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108301q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f108302r;

    /* renamed from: s, reason: collision with root package name */
    public float f108303s;

    /* renamed from: t, reason: collision with root package name */
    public float f108304t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f108305u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f108306v;

    /* renamed from: w, reason: collision with root package name */
    public int f108307w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f108308x;

    /* renamed from: y, reason: collision with root package name */
    public long f108309y;

    /* renamed from: z, reason: collision with root package name */
    public long f108310z;

    static {
        new bw5.e70();
    }

    public java.lang.String b() {
        return this.E[2] ? this.f108292e : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.e70 mo11468x92b714fd(byte[] bArr) {
        return (bw5.e70) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e70)) {
            return false;
        }
        bw5.e70 e70Var = (bw5.e70) fVar;
        return n51.f.a(this.f108291d, e70Var.f108291d) && n51.f.a(this.f108292e, e70Var.f108292e) && n51.f.a(this.f108293f, e70Var.f108293f) && n51.f.a(this.f108294g, e70Var.f108294g) && n51.f.a(this.f108295h, e70Var.f108295h) && n51.f.a(java.lang.Integer.valueOf(this.f108296i), java.lang.Integer.valueOf(e70Var.f108296i)) && n51.f.a(this.f108297m, e70Var.f108297m) && n51.f.a(this.f108298n, e70Var.f108298n) && n51.f.a(java.lang.Boolean.valueOf(this.f108299o), java.lang.Boolean.valueOf(e70Var.f108299o)) && n51.f.a(this.f108300p, e70Var.f108300p) && n51.f.a(this.f108301q, e70Var.f108301q) && n51.f.a(this.f108302r, e70Var.f108302r) && n51.f.a(java.lang.Float.valueOf(this.f108303s), java.lang.Float.valueOf(e70Var.f108303s)) && n51.f.a(java.lang.Float.valueOf(this.f108304t), java.lang.Float.valueOf(e70Var.f108304t)) && n51.f.a(this.f108305u, e70Var.f108305u) && n51.f.a(this.f108306v, e70Var.f108306v) && n51.f.a(java.lang.Integer.valueOf(this.f108307w), java.lang.Integer.valueOf(e70Var.f108307w)) && n51.f.a(this.f108308x, e70Var.f108308x) && n51.f.a(java.lang.Long.valueOf(this.f108309y), java.lang.Long.valueOf(e70Var.f108309y)) && n51.f.a(java.lang.Long.valueOf(this.f108310z), java.lang.Long.valueOf(e70Var.f108310z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(e70Var.A)) && n51.f.a(this.B, e70Var.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(e70Var.C)) && n51.f.a(this.D, e70Var.D);
    }

    public bw5.e70 d(java.lang.String str) {
        this.f108292e = str;
        this.E[2] = true;
        return this;
    }

    public bw5.e70 e(java.lang.String str) {
        this.f108291d = str;
        this.E[1] = true;
        return this;
    }

    /* renamed from: getTid */
    public java.lang.String m11811xb5887159() {
        return this.E[1] ? this.f108291d : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.e70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108291d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f108292e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f108293f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f108294g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f108295h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f108296i);
            }
            java.lang.String str6 = this.f108297m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f108298n;
            if (str7 != null && zArr[8]) {
                fVar.j(8, str7);
            }
            if (zArr[9]) {
                fVar.a(9, this.f108299o);
            }
            bw5.k40 k40Var = this.f108300p;
            if (k40Var != null && zArr[10]) {
                fVar.i(10, k40Var.mo75928xcd1e8d8());
                this.f108300p.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f108301q;
            if (gVar != null && zArr[11]) {
                fVar.b(11, gVar);
            }
            java.lang.String str8 = this.f108302r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            if (zArr[13]) {
                fVar.d(13, this.f108303s);
            }
            if (zArr[14]) {
                fVar.d(14, this.f108304t);
            }
            java.lang.String str9 = this.f108305u;
            if (str9 != null && zArr[15]) {
                fVar.j(15, str9);
            }
            java.lang.String str10 = this.f108306v;
            if (str10 != null && zArr[16]) {
                fVar.j(16, str10);
            }
            if (zArr[17]) {
                fVar.e(17, this.f108307w);
            }
            java.lang.String str11 = this.f108308x;
            if (str11 != null && zArr[18]) {
                fVar.j(18, str11);
            }
            if (zArr[20]) {
                fVar.h(20, this.f108309y);
            }
            if (zArr[21]) {
                fVar.h(21, this.f108310z);
            }
            if (zArr[22]) {
                fVar.e(22, this.A);
            }
            java.lang.String str12 = this.B;
            if (str12 != null && zArr[23]) {
                fVar.j(23, str12);
            }
            if (zArr[24]) {
                fVar.e(24, this.C);
            }
            bw5.f70 f70Var = this.D;
            if (f70Var != null && zArr[25]) {
                fVar.i(25, f70Var.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f108291d;
            if (str13 != null && zArr[1]) {
                i18 = b36.f.j(1, str13) + 0;
            }
            java.lang.String str14 = this.f108292e;
            if (str14 != null && zArr[2]) {
                i18 += b36.f.j(2, str14);
            }
            java.lang.String str15 = this.f108293f;
            if (str15 != null && zArr[3]) {
                i18 += b36.f.j(3, str15);
            }
            java.lang.String str16 = this.f108294g;
            if (str16 != null && zArr[4]) {
                i18 += b36.f.j(4, str16);
            }
            java.lang.String str17 = this.f108295h;
            if (str17 != null && zArr[5]) {
                i18 += b36.f.j(5, str17);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f108296i);
            }
            java.lang.String str18 = this.f108297m;
            if (str18 != null && zArr[7]) {
                i18 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f108298n;
            if (str19 != null && zArr[8]) {
                i18 += b36.f.j(8, str19);
            }
            if (zArr[9]) {
                i18 += b36.f.a(9, this.f108299o);
            }
            bw5.k40 k40Var2 = this.f108300p;
            if (k40Var2 != null && zArr[10]) {
                i18 += b36.f.i(10, k40Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f108301q;
            if (gVar2 != null && zArr[11]) {
                i18 += b36.f.b(11, gVar2);
            }
            java.lang.String str20 = this.f108302r;
            if (str20 != null && zArr[12]) {
                i18 += b36.f.j(12, str20);
            }
            if (zArr[13]) {
                i18 += b36.f.d(13, this.f108303s);
            }
            if (zArr[14]) {
                i18 += b36.f.d(14, this.f108304t);
            }
            java.lang.String str21 = this.f108305u;
            if (str21 != null && zArr[15]) {
                i18 += b36.f.j(15, str21);
            }
            java.lang.String str22 = this.f108306v;
            if (str22 != null && zArr[16]) {
                i18 += b36.f.j(16, str22);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f108307w);
            }
            java.lang.String str23 = this.f108308x;
            if (str23 != null && zArr[18]) {
                i18 += b36.f.j(18, str23);
            }
            if (zArr[20]) {
                i18 += b36.f.h(20, this.f108309y);
            }
            if (zArr[21]) {
                i18 += b36.f.h(21, this.f108310z);
            }
            if (zArr[22]) {
                i18 += b36.f.e(22, this.A);
            }
            java.lang.String str24 = this.B;
            if (str24 != null && zArr[23]) {
                i18 += b36.f.j(23, str24);
            }
            if (zArr[24]) {
                i18 += b36.f.e(24, this.C);
            }
            bw5.f70 f70Var2 = this.D;
            return (f70Var2 == null || !zArr[25]) ? i18 : i18 + b36.f.i(25, f70Var2.mo75928xcd1e8d8());
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
                this.f108291d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108292e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108293f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108294g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108295h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108296i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108297m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f108298n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f108299o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.k40 k40Var3 = new bw5.k40();
                    if (bArr != null && bArr.length > 0) {
                        k40Var3.mo11468x92b714fd(bArr);
                    }
                    this.f108300p = k40Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f108301q = aVar2.d(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f108302r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f108303s = aVar2.f(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f108304t = aVar2.f(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f108305u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f108306v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f108307w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f108308x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
            default:
                return -1;
            case 20:
                this.f108309y = aVar2.i(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.f108310z = aVar2.i(intValue);
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
                this.C = aVar2.g(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.f70 f70Var3 = new bw5.f70();
                    if (bArr2 != null && bArr2.length > 0) {
                        f70Var3.mo11468x92b714fd(bArr2);
                    }
                    this.D = f70Var3;
                }
                zArr[25] = true;
                return 0;
        }
    }
}
