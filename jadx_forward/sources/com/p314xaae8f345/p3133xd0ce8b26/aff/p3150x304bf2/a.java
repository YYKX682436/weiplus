package com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f298445d;

    /* renamed from: e, reason: collision with root package name */
    public int f298446e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f298447f = new boolean[3];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.a) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.a)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.a aVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.a) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f298445d), java.lang.Boolean.valueOf(aVar.f298445d)) && n51.f.a(java.lang.Integer.valueOf(this.f298446e), java.lang.Integer.valueOf(aVar.f298446e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3150x304bf2.a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298447f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f298445d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f298446e);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f298445d) : 0;
            return zArr[2] ? a17 + b36.f.e(2, this.f298446e) : a17;
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
            this.f298445d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f298446e = aVar2.g(intValue);
        zArr[2] = true;
        return 0;
    }
}
