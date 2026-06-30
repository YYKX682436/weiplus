package com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2;

/* loaded from: classes8.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.b f298453d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.a f298454e;

    /* renamed from: f, reason: collision with root package name */
    public int f298455f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f298456g = new boolean[4];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.c)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.c cVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.c) fVar;
        return n51.f.a(this.f298453d, cVar.f298453d) && n51.f.a(this.f298454e, cVar.f298454e) && n51.f.a(java.lang.Integer.valueOf(this.f298455f), java.lang.Integer.valueOf(cVar.f298455f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298456g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.b bVar = this.f298453d;
            if (bVar != null && zArr[1]) {
                fVar.i(1, bVar.mo75928xcd1e8d8());
                this.f298453d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.a aVar = this.f298454e;
            if (aVar != null && zArr[2]) {
                fVar.i(2, aVar.mo75928xcd1e8d8());
                this.f298454e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f298455f);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.b bVar2 = this.f298453d;
            if (bVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, bVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.a aVar2 = this.f298454e;
            if (aVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, aVar2.mo75928xcd1e8d8());
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f298455f) : i18;
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar4.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.b bVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.b();
                if (bArr != null && bArr.length > 0) {
                    bVar3.mo11468x92b714fd(bArr);
                }
                this.f298453d = bVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f298455f = aVar4.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar4.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.a aVar5 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.a();
            if (bArr2 != null && bArr2.length > 0) {
                aVar5.mo11468x92b714fd(bArr2);
            }
            this.f298454e = aVar5;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.c) super.mo11468x92b714fd(bArr);
    }
}
