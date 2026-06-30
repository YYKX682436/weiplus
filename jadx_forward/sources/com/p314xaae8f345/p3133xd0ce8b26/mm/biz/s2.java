package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes9.dex */
public class s2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e5 A;
    public final boolean[] B = new boolean[22];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f300128d;

    /* renamed from: e, reason: collision with root package name */
    public int f300129e;

    /* renamed from: f, reason: collision with root package name */
    public int f300130f;

    /* renamed from: g, reason: collision with root package name */
    public long f300131g;

    /* renamed from: h, reason: collision with root package name */
    public int f300132h;

    /* renamed from: i, reason: collision with root package name */
    public int f300133i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f300134m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f300135n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f300136o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f300137p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f300138q;

    /* renamed from: r, reason: collision with root package name */
    public int f300139r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f300140s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f300141t;

    /* renamed from: u, reason: collision with root package name */
    public int f300142u;

    /* renamed from: v, reason: collision with root package name */
    public int f300143v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q2 f300144w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f300145x;

    /* renamed from: y, reason: collision with root package name */
    public int f300146y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f300147z;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s2 s2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s2) fVar;
        return n51.f.a(this.f300128d, s2Var.f300128d) && n51.f.a(java.lang.Integer.valueOf(this.f300129e), java.lang.Integer.valueOf(s2Var.f300129e)) && n51.f.a(java.lang.Integer.valueOf(this.f300130f), java.lang.Integer.valueOf(s2Var.f300130f)) && n51.f.a(java.lang.Long.valueOf(this.f300131g), java.lang.Long.valueOf(s2Var.f300131g)) && n51.f.a(java.lang.Integer.valueOf(this.f300132h), java.lang.Integer.valueOf(s2Var.f300132h)) && n51.f.a(java.lang.Integer.valueOf(this.f300133i), java.lang.Integer.valueOf(s2Var.f300133i)) && n51.f.a(this.f300134m, s2Var.f300134m) && n51.f.a(this.f300135n, s2Var.f300135n) && n51.f.a(this.f300136o, s2Var.f300136o) && n51.f.a(this.f300137p, s2Var.f300137p) && n51.f.a(this.f300138q, s2Var.f300138q) && n51.f.a(java.lang.Integer.valueOf(this.f300139r), java.lang.Integer.valueOf(s2Var.f300139r)) && n51.f.a(this.f300140s, s2Var.f300140s) && n51.f.a(this.f300141t, s2Var.f300141t) && n51.f.a(java.lang.Integer.valueOf(this.f300142u), java.lang.Integer.valueOf(s2Var.f300142u)) && n51.f.a(java.lang.Integer.valueOf(this.f300143v), java.lang.Integer.valueOf(s2Var.f300143v)) && n51.f.a(this.f300144w, s2Var.f300144w) && n51.f.a(this.f300145x, s2Var.f300145x) && n51.f.a(java.lang.Integer.valueOf(this.f300146y), java.lang.Integer.valueOf(s2Var.f300146y)) && n51.f.a(java.lang.Boolean.valueOf(this.f300147z), java.lang.Boolean.valueOf(s2Var.f300147z)) && n51.f.a(this.A, s2Var.A);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.B;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f300128d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f300129e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f300130f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f300131g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f300132h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f300133i);
            }
            java.lang.String str2 = this.f300134m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f300135n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f300136o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f300137p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f300138q;
            if (str6 != null && zArr[11]) {
                fVar.j(11, str6);
            }
            if (zArr[12]) {
                fVar.e(12, this.f300139r);
            }
            java.lang.String str7 = this.f300140s;
            if (str7 != null && zArr[13]) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f300141t;
            if (str8 != null && zArr[14]) {
                fVar.j(14, str8);
            }
            if (zArr[15]) {
                fVar.e(15, this.f300142u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f300143v);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q2 q2Var = this.f300144w;
            if (q2Var != null && zArr[17]) {
                fVar.i(17, q2Var.mo75928xcd1e8d8());
                this.f300144w.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str9 = this.f300145x;
            if (str9 != null && zArr[18]) {
                fVar.j(18, str9);
            }
            if (zArr[19]) {
                fVar.e(19, this.f300146y);
            }
            if (zArr[20]) {
                fVar.a(20, this.f300147z);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e5 e5Var = this.A;
            if (e5Var != null && zArr[21]) {
                fVar.i(21, e5Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f300128d;
            if (str10 != null && zArr[1]) {
                i18 = b36.f.j(1, str10) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f300129e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f300130f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f300131g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f300132h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f300133i);
            }
            java.lang.String str11 = this.f300134m;
            if (str11 != null && zArr[7]) {
                i18 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f300135n;
            if (str12 != null && zArr[8]) {
                i18 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f300136o;
            if (str13 != null && zArr[9]) {
                i18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f300137p;
            if (str14 != null && zArr[10]) {
                i18 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f300138q;
            if (str15 != null && zArr[11]) {
                i18 += b36.f.j(11, str15);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f300139r);
            }
            java.lang.String str16 = this.f300140s;
            if (str16 != null && zArr[13]) {
                i18 += b36.f.j(13, str16);
            }
            java.lang.String str17 = this.f300141t;
            if (str17 != null && zArr[14]) {
                i18 += b36.f.j(14, str17);
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f300142u);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f300143v);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q2 q2Var2 = this.f300144w;
            if (q2Var2 != null && zArr[17]) {
                i18 += b36.f.i(17, q2Var2.mo75928xcd1e8d8());
            }
            java.lang.String str18 = this.f300145x;
            if (str18 != null && zArr[18]) {
                i18 += b36.f.j(18, str18);
            }
            if (zArr[19]) {
                i18 += b36.f.e(19, this.f300146y);
            }
            if (zArr[20]) {
                i18 += b36.f.a(20, this.f300147z);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e5 e5Var2 = this.A;
            return (e5Var2 == null || !zArr[21]) ? i18 : i18 + b36.f.i(21, e5Var2.mo75928xcd1e8d8());
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
                this.f300128d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f300129e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f300130f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f300131g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f300132h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f300133i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f300134m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f300135n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f300136o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f300137p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f300138q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f300139r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f300140s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f300141t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f300142u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f300143v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q2 q2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q2();
                    if (bArr != null && bArr.length > 0) {
                        q2Var3.mo11468x92b714fd(bArr);
                    }
                    this.f300144w = q2Var3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                this.f300145x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f300146y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f300147z = aVar2.c(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e5 e5Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e5();
                    if (bArr2 != null && bArr2.length > 0) {
                        e5Var3.mo11468x92b714fd(bArr2);
                    }
                    this.A = e5Var3;
                }
                zArr[21] = true;
                return 0;
            default:
                return -1;
        }
    }
}
