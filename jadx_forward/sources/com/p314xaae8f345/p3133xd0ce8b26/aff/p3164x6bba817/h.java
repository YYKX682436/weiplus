package com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817;

/* loaded from: classes8.dex */
public class h extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: p, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.h f299193p = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.h();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f299194d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299195e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299196f;

    /* renamed from: g, reason: collision with root package name */
    public int f299197g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f299198h;

    /* renamed from: i, reason: collision with root package name */
    public float f299199i;

    /* renamed from: m, reason: collision with root package name */
    public float f299200m;

    /* renamed from: n, reason: collision with root package name */
    public int f299201n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f299202o = new boolean[9];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.h)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.h hVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.h) fVar;
        return n51.f.a(this.f299194d, hVar.f299194d) && n51.f.a(this.f299195e, hVar.f299195e) && n51.f.a(this.f299196f, hVar.f299196f) && n51.f.a(java.lang.Integer.valueOf(this.f299197g), java.lang.Integer.valueOf(hVar.f299197g)) && n51.f.a(this.f299198h, hVar.f299198h) && n51.f.a(java.lang.Float.valueOf(this.f299199i), java.lang.Float.valueOf(hVar.f299199i)) && n51.f.a(java.lang.Float.valueOf(this.f299200m), java.lang.Float.valueOf(hVar.f299200m)) && n51.f.a(java.lang.Integer.valueOf(this.f299201n), java.lang.Integer.valueOf(hVar.f299201n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.h();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f299202o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f299194d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f299195e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f299196f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f299197g);
            }
            java.lang.String str4 = this.f299198h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.d(6, this.f299199i);
            }
            if (zArr[7]) {
                fVar.d(7, this.f299200m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f299201n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f299194d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f299195e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f299196f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f299197g);
            }
            java.lang.String str8 = this.f299198h;
            if (str8 != null && zArr[5]) {
                i18 += b36.f.j(5, str8);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f299199i);
            }
            if (zArr[7]) {
                i18 += b36.f.d(7, this.f299200m);
            }
            return zArr[8] ? i18 + b36.f.e(8, this.f299201n) : i18;
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
                this.f299194d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f299195e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299196f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299197g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f299198h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f299199i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f299200m = aVar2.f(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f299201n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3164x6bba817.h) super.mo11468x92b714fd(bArr);
    }
}
