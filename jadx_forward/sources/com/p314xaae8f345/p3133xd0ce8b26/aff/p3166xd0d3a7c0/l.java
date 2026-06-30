package com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0;

/* loaded from: classes9.dex */
public class l extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.l f299229h = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.l();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f299230d;

    /* renamed from: e, reason: collision with root package name */
    public long f299231e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299232f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f299233g = new boolean[4];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.l)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.l lVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.l) fVar;
        return n51.f.a(this.f299230d, lVar.f299230d) && n51.f.a(java.lang.Long.valueOf(this.f299231e), java.lang.Long.valueOf(lVar.f299231e)) && n51.f.a(this.f299232f, lVar.f299232f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.l();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299233g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f299230d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f299231e);
            }
            java.lang.String str2 = this.f299232f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f299230d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f299231e);
            }
            java.lang.String str4 = this.f299232f;
            return (str4 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str4);
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
        if (intValue == 1) {
            this.f299230d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f299231e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f299232f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.l) super.mo11468x92b714fd(bArr);
    }
}
