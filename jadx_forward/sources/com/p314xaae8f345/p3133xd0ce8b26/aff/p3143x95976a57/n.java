package com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57;

/* loaded from: classes8.dex */
public class n extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.n f298371h = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.n();

    /* renamed from: d, reason: collision with root package name */
    public int f298372d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f298373e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m f298374f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f298375g = new boolean[4];

    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m b() {
        return this.f298375g[3] ? this.f298374f : new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.n)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.n nVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.n) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f298372d), java.lang.Integer.valueOf(nVar.f298372d)) && n51.f.a(this.f298373e, nVar.f298373e) && n51.f.a(this.f298374f, nVar.f298374f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.n();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298375g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f298372d);
            }
            java.lang.String str = this.f298373e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m mVar = this.f298374f;
            if (mVar != null && zArr[3]) {
                fVar.i(3, mVar.mo75928xcd1e8d8());
                this.f298374f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f298372d) : 0;
            java.lang.String str2 = this.f298373e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m mVar2 = this.f298374f;
            return (mVar2 == null || !zArr[3]) ? e17 : e17 + b36.f.i(3, mVar2.mo75928xcd1e8d8());
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
            this.f298372d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f298373e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m mVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.m();
            if (bArr != null && bArr.length > 0) {
                mVar3.mo11468x92b714fd(bArr);
            }
            this.f298374f = mVar3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.n) super.mo11468x92b714fd(bArr);
    }
}
