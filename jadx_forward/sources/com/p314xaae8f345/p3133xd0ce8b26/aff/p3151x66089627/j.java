package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* loaded from: classes4.dex */
public class j extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: q, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j f298597q = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j();

    /* renamed from: d, reason: collision with root package name */
    public long f298598d;

    /* renamed from: e, reason: collision with root package name */
    public long f298599e;

    /* renamed from: f, reason: collision with root package name */
    public long f298600f;

    /* renamed from: g, reason: collision with root package name */
    public long f298601g;

    /* renamed from: h, reason: collision with root package name */
    public int f298602h;

    /* renamed from: i, reason: collision with root package name */
    public int f298603i;

    /* renamed from: m, reason: collision with root package name */
    public int f298604m;

    /* renamed from: n, reason: collision with root package name */
    public int f298605n;

    /* renamed from: o, reason: collision with root package name */
    public int f298606o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f298607p = new boolean[11];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j jVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f298598d), java.lang.Long.valueOf(jVar.f298598d)) && n51.f.a(java.lang.Long.valueOf(this.f298599e), java.lang.Long.valueOf(jVar.f298599e)) && n51.f.a(java.lang.Long.valueOf(this.f298600f), java.lang.Long.valueOf(jVar.f298600f)) && n51.f.a(java.lang.Long.valueOf(this.f298601g), java.lang.Long.valueOf(jVar.f298601g)) && n51.f.a(java.lang.Integer.valueOf(this.f298602h), java.lang.Integer.valueOf(jVar.f298602h)) && n51.f.a(java.lang.Integer.valueOf(this.f298603i), java.lang.Integer.valueOf(jVar.f298603i)) && n51.f.a(java.lang.Integer.valueOf(this.f298604m), java.lang.Integer.valueOf(jVar.f298604m)) && n51.f.a(java.lang.Integer.valueOf(this.f298605n), java.lang.Integer.valueOf(jVar.f298605n)) && n51.f.a(java.lang.Integer.valueOf(this.f298606o), java.lang.Integer.valueOf(jVar.f298606o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298607p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f298598d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f298599e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f298600f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f298601g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f298602h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f298603i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f298604m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f298605n);
            }
            if (zArr[10]) {
                fVar.e(10, this.f298606o);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f298598d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f298599e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f298600f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f298601g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f298602h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f298603i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f298604m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f298605n);
            }
            return zArr[10] ? h17 + b36.f.e(10, this.f298606o) : h17;
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
                this.f298598d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f298599e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f298600f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f298601g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f298602h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f298603i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f298604m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f298605n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                this.f298606o = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j) super.mo11468x92b714fd(bArr);
    }
}
