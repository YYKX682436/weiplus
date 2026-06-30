package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class o2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f301229d;

    /* renamed from: e, reason: collision with root package name */
    public int f301230e;

    /* renamed from: f, reason: collision with root package name */
    public int f301231f;

    /* renamed from: g, reason: collision with root package name */
    public int f301232g;

    /* renamed from: h, reason: collision with root package name */
    public int f301233h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f301234i = new boolean[6];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o2 o2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f301229d), java.lang.Integer.valueOf(o2Var.f301229d)) && n51.f.a(java.lang.Integer.valueOf(this.f301230e), java.lang.Integer.valueOf(o2Var.f301230e)) && n51.f.a(java.lang.Integer.valueOf(this.f301231f), java.lang.Integer.valueOf(o2Var.f301231f)) && n51.f.a(java.lang.Integer.valueOf(this.f301232g), java.lang.Integer.valueOf(o2Var.f301232g)) && n51.f.a(java.lang.Integer.valueOf(this.f301233h), java.lang.Integer.valueOf(o2Var.f301233h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.o2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f301234i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f301229d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f301230e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f301231f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f301232g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f301233h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f301229d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f301230e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f301231f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f301232g);
            }
            return zArr[5] ? e17 + b36.f.e(5, this.f301233h) : e17;
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
            this.f301229d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f301230e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f301231f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f301232g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f301233h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
