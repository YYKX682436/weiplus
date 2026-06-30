package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class o0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f299927d;

    /* renamed from: e, reason: collision with root package name */
    public int f299928e;

    /* renamed from: f, reason: collision with root package name */
    public int f299929f;

    /* renamed from: g, reason: collision with root package name */
    public int f299930g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f299931h = new boolean[5];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o0 o0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f299927d), java.lang.Integer.valueOf(o0Var.f299927d)) && n51.f.a(java.lang.Integer.valueOf(this.f299928e), java.lang.Integer.valueOf(o0Var.f299928e)) && n51.f.a(java.lang.Integer.valueOf(this.f299929f), java.lang.Integer.valueOf(o0Var.f299929f)) && n51.f.a(java.lang.Integer.valueOf(this.f299930g), java.lang.Integer.valueOf(o0Var.f299930g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299931h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f299927d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f299928e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f299929f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f299930g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f299927d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f299928e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f299929f);
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f299930g) : e17;
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
            this.f299927d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f299928e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f299929f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f299930g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
