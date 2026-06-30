package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes9.dex */
public class q2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f301288d;

    /* renamed from: e, reason: collision with root package name */
    public int f301289e;

    /* renamed from: f, reason: collision with root package name */
    public int f301290f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f301291g = new boolean[4];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.q2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.q2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.q2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.q2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.q2 q2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.q2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f301288d), java.lang.Integer.valueOf(q2Var.f301288d)) && n51.f.a(java.lang.Integer.valueOf(this.f301289e), java.lang.Integer.valueOf(q2Var.f301289e)) && n51.f.a(java.lang.Integer.valueOf(this.f301290f), java.lang.Integer.valueOf(q2Var.f301290f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.q2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f301291g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f301288d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f301289e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f301290f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f301288d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f301289e);
            }
            return zArr[3] ? e17 + b36.f.e(3, this.f301290f) : e17;
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
            this.f301288d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f301289e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f301290f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
