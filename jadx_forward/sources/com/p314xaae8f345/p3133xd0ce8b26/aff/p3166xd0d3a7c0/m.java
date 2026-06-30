package com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0;

/* loaded from: classes9.dex */
public class m extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: p, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.m f299234p = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.m();

    /* renamed from: d, reason: collision with root package name */
    public long f299235d;

    /* renamed from: e, reason: collision with root package name */
    public long f299236e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299237f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f299238g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f299239h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f299240i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f299241m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f299242n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f299243o = new boolean[9];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.m)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.m mVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.m) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f299235d), java.lang.Long.valueOf(mVar.f299235d)) && n51.f.a(java.lang.Long.valueOf(this.f299236e), java.lang.Long.valueOf(mVar.f299236e)) && n51.f.a(this.f299237f, mVar.f299237f) && n51.f.a(this.f299238g, mVar.f299238g) && n51.f.a(java.lang.Boolean.valueOf(this.f299239h), java.lang.Boolean.valueOf(mVar.f299239h)) && n51.f.a(java.lang.Boolean.valueOf(this.f299240i), java.lang.Boolean.valueOf(mVar.f299240i)) && n51.f.a(this.f299241m, mVar.f299241m) && n51.f.a(java.lang.Boolean.valueOf(this.f299242n), java.lang.Boolean.valueOf(mVar.f299242n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.m();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299243o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f299235d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f299236e);
            }
            java.lang.String str = this.f299237f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f299238g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.a(5, this.f299239h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f299240i);
            }
            java.lang.String str3 = this.f299241m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.a(8, this.f299242n);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f299235d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f299236e);
            }
            java.lang.String str4 = this.f299237f;
            if (str4 != null && zArr[3]) {
                h17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f299238g;
            if (str5 != null && zArr[4]) {
                h17 += b36.f.j(4, str5);
            }
            if (zArr[5]) {
                h17 += b36.f.a(5, this.f299239h);
            }
            if (zArr[6]) {
                h17 += b36.f.a(6, this.f299240i);
            }
            java.lang.String str6 = this.f299241m;
            if (str6 != null && zArr[7]) {
                h17 += b36.f.j(7, str6);
            }
            return zArr[8] ? h17 + b36.f.a(8, this.f299242n) : h17;
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
                this.f299235d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f299236e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299237f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299238g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f299239h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f299240i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f299241m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f299242n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.m) super.mo11468x92b714fd(bArr);
    }
}
