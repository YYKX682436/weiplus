package com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57;

/* loaded from: classes8.dex */
public class m extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m f298365i = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.l f298366d;

    /* renamed from: e, reason: collision with root package name */
    public int f298367e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298368f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f298369g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f298370h = new boolean[5];

    public java.lang.String b() {
        return this.f298370h[3] ? this.f298368f : "";
    }

    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.l c() {
        return this.f298370h[1] ? this.f298366d : new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.l();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m mVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m) fVar;
        return n51.f.a(this.f298366d, mVar.f298366d) && n51.f.a(java.lang.Integer.valueOf(this.f298367e), java.lang.Integer.valueOf(mVar.f298367e)) && n51.f.a(this.f298368f, mVar.f298368f) && n51.f.a(java.lang.Boolean.valueOf(this.f298369g), java.lang.Boolean.valueOf(mVar.f298369g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f298370h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.l lVar = this.f298366d;
            if (lVar != null && zArr[1]) {
                fVar.i(1, lVar.mo75928xcd1e8d8());
                this.f298366d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f298367e);
            }
            java.lang.String str = this.f298368f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.a(4, this.f298369g);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.l lVar2 = this.f298366d;
            if (lVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, lVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f298367e);
            }
            java.lang.String str2 = this.f298368f;
            if (str2 != null && zArr[3]) {
                i18 += b36.f.j(3, str2);
            }
            return zArr[4] ? i18 + b36.f.a(4, this.f298369g) : i18;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f298367e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f298368f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f298369g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.l lVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.l();
            if (bArr != null && bArr.length > 0) {
                lVar3.mo11468x92b714fd(bArr);
            }
            this.f298366d = lVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
