package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes8.dex */
public class l extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f297874d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f297875e;

    /* renamed from: f, reason: collision with root package name */
    public long f297876f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f297877g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f297878h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f297879i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f297880m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f297881n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f297882o = new boolean[9];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l();
    }

    public java.lang.String b() {
        return this.f297882o[8] ? this.f297881n : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l lVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f297874d), java.lang.Long.valueOf(lVar.f297874d)) && n51.f.a(this.f297875e, lVar.f297875e) && n51.f.a(java.lang.Long.valueOf(this.f297876f), java.lang.Long.valueOf(lVar.f297876f)) && n51.f.a(this.f297877g, lVar.f297877g) && n51.f.a(this.f297878h, lVar.f297878h) && n51.f.a(java.lang.Boolean.valueOf(this.f297879i), java.lang.Boolean.valueOf(lVar.f297879i)) && n51.f.a(java.lang.Boolean.valueOf(this.f297880m), java.lang.Boolean.valueOf(lVar.f297880m)) && n51.f.a(this.f297881n, lVar.f297881n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.l();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f297882o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f297874d);
            }
            java.lang.String str = this.f297875e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f297876f);
            }
            java.lang.String str2 = this.f297877g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f297878h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.a(6, this.f297879i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f297880m);
            }
            java.lang.String str4 = this.f297881n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f297874d) : 0;
            java.lang.String str5 = this.f297875e;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f297876f);
            }
            java.lang.String str6 = this.f297877g;
            if (str6 != null && zArr[4]) {
                h17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f297878h;
            if (str7 != null && zArr[5]) {
                h17 += b36.f.j(5, str7);
            }
            if (zArr[6]) {
                h17 += b36.f.a(6, this.f297879i);
            }
            if (zArr[7]) {
                h17 += b36.f.a(7, this.f297880m);
            }
            java.lang.String str8 = this.f297881n;
            return (str8 == null || !zArr[8]) ? h17 : h17 + b36.f.j(8, str8);
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
                this.f297874d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f297875e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f297876f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f297877g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f297878h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f297879i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f297880m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f297881n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
