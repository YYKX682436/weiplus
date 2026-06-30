package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* loaded from: classes9.dex */
public class p extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f298647d;

    /* renamed from: e, reason: collision with root package name */
    public float f298648e;

    /* renamed from: f, reason: collision with root package name */
    public float f298649f;

    /* renamed from: g, reason: collision with root package name */
    public float f298650g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f298651h = new boolean[5];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.p();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.p)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.p pVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.p) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f298647d), java.lang.Float.valueOf(pVar.f298647d)) && n51.f.a(java.lang.Float.valueOf(this.f298648e), java.lang.Float.valueOf(pVar.f298648e)) && n51.f.a(java.lang.Float.valueOf(this.f298649f), java.lang.Float.valueOf(pVar.f298649f)) && n51.f.a(java.lang.Float.valueOf(this.f298650g), java.lang.Float.valueOf(pVar.f298650g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.p();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298651h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f298647d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f298648e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f298649f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f298650g);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f298647d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f298648e);
            }
            if (zArr[3]) {
                d17 += b36.f.d(3, this.f298649f);
            }
            return zArr[4] ? d17 + b36.f.d(4, this.f298650g) : d17;
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
            this.f298647d = aVar2.f(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f298648e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f298649f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f298650g = aVar2.f(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.p) super.mo11468x92b714fd(bArr);
    }
}
