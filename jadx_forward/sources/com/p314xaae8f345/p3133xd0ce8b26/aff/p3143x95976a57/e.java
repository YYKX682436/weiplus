package com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57;

/* loaded from: classes4.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.e f298287g = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.e();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d f298288d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f298289e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f298290f = new boolean[3];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.e)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.e eVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.e) fVar;
        return n51.f.a(this.f298288d, eVar.f298288d) && n51.f.a(java.lang.Boolean.valueOf(this.f298289e), java.lang.Boolean.valueOf(eVar.f298289e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298290f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d dVar = this.f298288d;
            if (dVar != null && zArr[1]) {
                fVar.i(1, dVar.mo75928xcd1e8d8());
                this.f298288d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.a(2, this.f298289e);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d dVar2 = this.f298288d;
            if (dVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, dVar2.mo75928xcd1e8d8());
            }
            return zArr[2] ? i18 + b36.f.a(2, this.f298289e) : i18;
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
            if (intValue != 2) {
                return -1;
            }
            this.f298289e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d dVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.d();
            if (bArr != null && bArr.length > 0) {
                dVar3.mo11468x92b714fd(bArr);
            }
            this.f298288d = dVar3;
        }
        zArr[1] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.e) super.mo11468x92b714fd(bArr);
    }
}
