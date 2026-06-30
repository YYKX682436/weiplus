package com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c;

/* loaded from: classes9.dex */
public class f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.f f298967g = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.f();

    /* renamed from: d, reason: collision with root package name */
    public long f298968d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c f298969e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f298970f = new boolean[3];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.f)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.f fVar2 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.f) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f298968d), java.lang.Long.valueOf(fVar2.f298968d)) && n51.f.a(this.f298969e, fVar2.f298969e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298970f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f298968d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c cVar = this.f298969e;
            if (cVar != null && zArr[2]) {
                fVar.i(2, cVar.mo75928xcd1e8d8());
                this.f298969e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f298968d) : 0;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c cVar2 = this.f298969e;
            return (cVar2 == null || !zArr[2]) ? h17 : h17 + b36.f.i(2, cVar2.mo75928xcd1e8d8());
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
            this.f298968d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c cVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.c();
            if (bArr != null && bArr.length > 0) {
                cVar3.mo11468x92b714fd(bArr);
            }
            this.f298969e = cVar3;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3159x34354c.f) super.mo11468x92b714fd(bArr);
    }
}
