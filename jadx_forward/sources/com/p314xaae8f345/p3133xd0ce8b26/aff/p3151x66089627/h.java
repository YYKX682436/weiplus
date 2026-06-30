package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* loaded from: classes9.dex */
public class h extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f298571d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f298572e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f298573f;

    /* renamed from: g, reason: collision with root package name */
    public int f298574g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f298575h;

    /* renamed from: i, reason: collision with root package name */
    public int f298576i;

    /* renamed from: m, reason: collision with root package name */
    public int f298577m;

    /* renamed from: n, reason: collision with root package name */
    public int f298578n;

    /* renamed from: o, reason: collision with root package name */
    public int f298579o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f298580p = new boolean[10];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h hVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h) fVar;
        return n51.f.a(this.f298571d, hVar.f298571d) && n51.f.a(this.f298572e, hVar.f298572e) && n51.f.a(java.lang.Boolean.valueOf(this.f298573f), java.lang.Boolean.valueOf(hVar.f298573f)) && n51.f.a(java.lang.Integer.valueOf(this.f298574g), java.lang.Integer.valueOf(hVar.f298574g)) && n51.f.a(this.f298575h, hVar.f298575h) && n51.f.a(java.lang.Integer.valueOf(this.f298576i), java.lang.Integer.valueOf(hVar.f298576i)) && n51.f.a(java.lang.Integer.valueOf(this.f298577m), java.lang.Integer.valueOf(hVar.f298577m)) && n51.f.a(java.lang.Integer.valueOf(this.f298578n), java.lang.Integer.valueOf(hVar.f298578n)) && n51.f.a(java.lang.Integer.valueOf(this.f298579o), java.lang.Integer.valueOf(hVar.f298579o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f298580p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f298571d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f298572e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.a(3, this.f298573f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f298574g);
            }
            java.lang.String str3 = this.f298575h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f298576i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f298577m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f298578n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f298579o);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f298571d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f298572e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f298573f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f298574g);
            }
            java.lang.String str6 = this.f298575h;
            if (str6 != null && zArr[5]) {
                i18 += b36.f.j(5, str6);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f298576i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f298577m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f298578n);
            }
            return zArr[9] ? i18 + b36.f.e(9, this.f298579o) : i18;
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
                this.f298571d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f298572e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f298573f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f298574g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f298575h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f298576i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f298577m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f298578n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f298579o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h) super.mo11468x92b714fd(bArr);
    }
}
