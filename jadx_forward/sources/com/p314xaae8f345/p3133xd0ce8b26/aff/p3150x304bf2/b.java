package com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2;

/* loaded from: classes8.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f298448d;

    /* renamed from: e, reason: collision with root package name */
    public long f298449e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298450f;

    /* renamed from: g, reason: collision with root package name */
    public int f298451g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f298452h = new boolean[5];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.b mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.b) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.b)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.b bVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f298448d), java.lang.Integer.valueOf(bVar.f298448d)) && n51.f.a(java.lang.Long.valueOf(this.f298449e), java.lang.Long.valueOf(bVar.f298449e)) && n51.f.a(this.f298450f, bVar.f298450f) && n51.f.a(java.lang.Integer.valueOf(this.f298451g), java.lang.Integer.valueOf(bVar.f298451g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298452h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f298448d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f298449e);
            }
            java.lang.String str = this.f298450f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f298451g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f298448d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f298449e);
            }
            java.lang.String str2 = this.f298450f;
            if (str2 != null && zArr[3]) {
                e17 += b36.f.j(3, str2);
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f298451g) : e17;
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
            this.f298448d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f298449e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f298450f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f298451g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
