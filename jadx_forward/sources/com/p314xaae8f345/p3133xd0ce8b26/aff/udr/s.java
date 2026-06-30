package com.p314xaae8f345.p3133xd0ce8b26.aff.udr;

/* loaded from: classes15.dex */
public class s extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f299092d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299093e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299094f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f299095g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f299096h;

    /* renamed from: i, reason: collision with root package name */
    public int f299097i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f299098m;

    /* renamed from: n, reason: collision with root package name */
    public int f299099n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f299100o;

    /* renamed from: p, reason: collision with root package name */
    public int f299101p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f299102q;

    /* renamed from: r, reason: collision with root package name */
    public int f299103r;

    /* renamed from: s, reason: collision with root package name */
    public int f299104s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f299105t = new boolean[14];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.s();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.udr.s)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.s sVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.s) fVar;
        return n51.f.a(this.f299092d, sVar.f299092d) && n51.f.a(this.f299093e, sVar.f299093e) && n51.f.a(this.f299094f, sVar.f299094f) && n51.f.a(this.f299095g, sVar.f299095g) && n51.f.a(this.f299096h, sVar.f299096h) && n51.f.a(java.lang.Integer.valueOf(this.f299097i), java.lang.Integer.valueOf(sVar.f299097i)) && n51.f.a(this.f299098m, sVar.f299098m) && n51.f.a(java.lang.Integer.valueOf(this.f299099n), java.lang.Integer.valueOf(sVar.f299099n)) && n51.f.a(this.f299100o, sVar.f299100o) && n51.f.a(java.lang.Integer.valueOf(this.f299101p), java.lang.Integer.valueOf(sVar.f299101p)) && n51.f.a(this.f299102q, sVar.f299102q) && n51.f.a(java.lang.Integer.valueOf(this.f299103r), java.lang.Integer.valueOf(sVar.f299103r)) && n51.f.a(java.lang.Integer.valueOf(this.f299104s), java.lang.Integer.valueOf(sVar.f299104s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.s();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299105t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f299092d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f299093e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f299094f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f299095g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f299096h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f299097i);
            }
            java.lang.String str6 = this.f299098m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            if (zArr[8]) {
                fVar.e(8, this.f299099n);
            }
            java.lang.String str7 = this.f299100o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            if (zArr[10]) {
                fVar.e(10, this.f299101p);
            }
            java.lang.String str8 = this.f299102q;
            if (str8 != null && zArr[11]) {
                fVar.j(11, str8);
            }
            if (zArr[12]) {
                fVar.e(12, this.f299103r);
            }
            if (!zArr[13]) {
                return 0;
            }
            fVar.e(13, this.f299104s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f299092d;
            int j17 = (str9 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str9);
            java.lang.String str10 = this.f299093e;
            if (str10 != null && zArr[2]) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f299094f;
            if (str11 != null && zArr[3]) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f299095g;
            if (str12 != null && zArr[4]) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f299096h;
            if (str13 != null && zArr[5]) {
                j17 += b36.f.j(5, str13);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f299097i);
            }
            java.lang.String str14 = this.f299098m;
            if (str14 != null && zArr[7]) {
                j17 += b36.f.j(7, str14);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f299099n);
            }
            java.lang.String str15 = this.f299100o;
            if (str15 != null && zArr[9]) {
                j17 += b36.f.j(9, str15);
            }
            if (zArr[10]) {
                j17 += b36.f.e(10, this.f299101p);
            }
            java.lang.String str16 = this.f299102q;
            if (str16 != null && zArr[11]) {
                j17 += b36.f.j(11, str16);
            }
            if (zArr[12]) {
                j17 += b36.f.e(12, this.f299103r);
            }
            return zArr[13] ? j17 + b36.f.e(13, this.f299104s) : j17;
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
                this.f299092d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f299093e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299094f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299095g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f299096h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f299097i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f299098m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f299099n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f299100o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f299101p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f299102q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f299103r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f299104s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.s) super.mo11468x92b714fd(bArr);
    }
}
