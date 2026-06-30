package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes4.dex */
public class g extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: s, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g f297741s = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f297742d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h f297743e;

    /* renamed from: f, reason: collision with root package name */
    public long f297744f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f297745g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f297746h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f297747i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f297748m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f297749n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f297750o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f297751p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f297752q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f297753r = new boolean[12];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g gVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g) fVar;
        return n51.f.a(this.f297742d, gVar.f297742d) && n51.f.a(this.f297743e, gVar.f297743e) && n51.f.a(java.lang.Long.valueOf(this.f297744f), java.lang.Long.valueOf(gVar.f297744f)) && n51.f.a(this.f297745g, gVar.f297745g) && n51.f.a(this.f297746h, gVar.f297746h) && n51.f.a(this.f297747i, gVar.f297747i) && n51.f.a(this.f297748m, gVar.f297748m) && n51.f.a(this.f297749n, gVar.f297749n) && n51.f.a(this.f297750o, gVar.f297750o) && n51.f.a(this.f297751p, gVar.f297751p) && n51.f.a(java.lang.Boolean.valueOf(this.f297752q), java.lang.Boolean.valueOf(gVar.f297752q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f297753r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f297742d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h hVar = this.f297743e;
            if (hVar != null && zArr[2]) {
                fVar.e(2, hVar.f297775d);
            }
            if (zArr[3]) {
                fVar.h(3, this.f297744f);
            }
            java.lang.String str2 = this.f297745g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f297746h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f297747i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f297748m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f297749n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f297750o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f297751p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            if (!zArr[11]) {
                return 0;
            }
            fVar.a(11, this.f297752q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f297742d;
            int j17 = (str9 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str9);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h hVar2 = this.f297743e;
            if (hVar2 != null && zArr[2]) {
                j17 += b36.f.e(2, hVar2.f297775d);
            }
            if (zArr[3]) {
                j17 += b36.f.h(3, this.f297744f);
            }
            java.lang.String str10 = this.f297745g;
            if (str10 != null && zArr[4]) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f297746h;
            if (str11 != null && zArr[5]) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f297747i;
            if (str12 != null && zArr[6]) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f297748m;
            if (str13 != null && zArr[7]) {
                j17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f297749n;
            if (str14 != null && zArr[8]) {
                j17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f297750o;
            if (str15 != null && zArr[9]) {
                j17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f297751p;
            if (str16 != null && zArr[10]) {
                j17 += b36.f.j(10, str16);
            }
            return zArr[11] ? j17 + b36.f.a(11, this.f297752q) : j17;
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
                this.f297742d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                int g17 = aVar2.g(intValue);
                this.f297743e = g17 != 0 ? g17 != 1 ? null : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h.AIWeAppProcessDataType_SubTitle : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.h.AIWeAppProcessDataType_Title;
                zArr[2] = true;
                return 0;
            case 3:
                this.f297744f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f297745g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f297746h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f297747i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f297748m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f297749n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f297750o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f297751p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f297752q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g) super.mo11468x92b714fd(bArr);
    }
}
