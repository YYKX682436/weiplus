package com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57;

/* loaded from: classes4.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.b f298270h = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.b();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.a f298271d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f298272e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f298273f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f298274g = new boolean[4];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.b)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.b bVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.b) fVar;
        return n51.f.a(this.f298271d, bVar.f298271d) && n51.f.a(java.lang.Boolean.valueOf(this.f298272e), java.lang.Boolean.valueOf(bVar.f298272e)) && n51.f.a(java.lang.Boolean.valueOf(this.f298273f), java.lang.Boolean.valueOf(bVar.f298273f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298274g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.a aVar = this.f298271d;
            if (aVar != null && zArr[1]) {
                fVar.i(1, aVar.mo75928xcd1e8d8());
                this.f298271d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.a(2, this.f298272e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f298273f);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.a aVar2 = this.f298271d;
            if (aVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, aVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f298272e);
            }
            return zArr[3] ? i18 + b36.f.a(3, this.f298273f) : i18;
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3)) {
                if (!super.mo75949x4476b383(aVar3, this, m75958x5767edba)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                this.f298272e = aVar4.c(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f298273f = aVar4.c(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar4.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.a aVar5 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.a();
            if (bArr != null && bArr.length > 0) {
                aVar5.mo11468x92b714fd(bArr);
            }
            this.f298271d = aVar5;
        }
        zArr[1] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.b) super.mo11468x92b714fd(bArr);
    }
}
