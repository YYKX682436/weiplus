package com.p314xaae8f345.mm.p1006xc5476f33.vqm;

/* loaded from: classes2.dex */
public class y extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.vqm.y f259049n = new com.p314xaae8f345.mm.p1006xc5476f33.vqm.y();

    /* renamed from: d, reason: collision with root package name */
    public long f259050d;

    /* renamed from: e, reason: collision with root package name */
    public long f259051e;

    /* renamed from: f, reason: collision with root package name */
    public int f259052f;

    /* renamed from: g, reason: collision with root package name */
    public long f259053g;

    /* renamed from: h, reason: collision with root package name */
    public long f259054h;

    /* renamed from: i, reason: collision with root package name */
    public int f259055i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f259056m = new boolean[7];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.vqm.y)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.vqm.y) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f259050d), java.lang.Long.valueOf(yVar.f259050d)) && n51.f.a(java.lang.Long.valueOf(this.f259051e), java.lang.Long.valueOf(yVar.f259051e)) && n51.f.a(java.lang.Integer.valueOf(this.f259052f), java.lang.Integer.valueOf(yVar.f259052f)) && n51.f.a(java.lang.Long.valueOf(this.f259053g), java.lang.Long.valueOf(yVar.f259053g)) && n51.f.a(java.lang.Long.valueOf(this.f259054h), java.lang.Long.valueOf(yVar.f259054h)) && n51.f.a(java.lang.Integer.valueOf(this.f259055i), java.lang.Integer.valueOf(yVar.f259055i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.vqm.y();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f259056m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f259050d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f259051e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f259052f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f259053g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f259054h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f259055i);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f259050d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f259051e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f259052f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f259053g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f259054h);
            }
            return zArr[6] ? h17 + b36.f.e(6, this.f259055i) : h17;
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
        switch (intValue) {
            case 1:
                this.f259050d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f259051e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f259052f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f259053g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f259054h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f259055i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.vqm.y) super.mo11468x92b714fd(bArr);
    }
}
