package com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f298895d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f298896e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298897f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f298898g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f298899h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f298900i;

    /* renamed from: m, reason: collision with root package name */
    public long f298901m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f298902n = new boolean[8];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.a) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.a)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.a aVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.a) fVar;
        return n51.f.a(this.f298895d, aVar.f298895d) && n51.f.a(this.f298896e, aVar.f298896e) && n51.f.a(this.f298897f, aVar.f298897f) && n51.f.a(this.f298898g, aVar.f298898g) && n51.f.a(this.f298899h, aVar.f298899h) && n51.f.a(this.f298900i, aVar.f298900i) && n51.f.a(java.lang.Long.valueOf(this.f298901m), java.lang.Long.valueOf(aVar.f298901m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3154x5dc4f1ad.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f298902n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f298895d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f298896e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f298897f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f298898g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f298899h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f298900i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            if (zArr[7]) {
                fVar.h(7, this.f298901m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f298895d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f298896e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f298897f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f298898g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f298899h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f298900i;
            if (str12 != null && zArr[6]) {
                i18 += b36.f.j(6, str12);
            }
            return zArr[7] ? i18 + b36.f.h(7, this.f298901m) : i18;
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
                this.f298895d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f298896e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f298897f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f298898g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f298899h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f298900i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f298901m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
