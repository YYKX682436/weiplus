package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* loaded from: classes8.dex */
public class l extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f298625d;

    /* renamed from: e, reason: collision with root package name */
    public long f298626e;

    /* renamed from: f, reason: collision with root package name */
    public long f298627f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f298628g = new boolean[4];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.l();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.l mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.l) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.l)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.l lVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.l) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f298625d), java.lang.Long.valueOf(lVar.f298625d)) && n51.f.a(java.lang.Long.valueOf(this.f298626e), java.lang.Long.valueOf(lVar.f298626e)) && n51.f.a(java.lang.Long.valueOf(this.f298627f), java.lang.Long.valueOf(lVar.f298627f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.l();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298628g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f298625d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f298626e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f298627f);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f298625d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f298626e);
            }
            return zArr[3] ? h17 + b36.f.h(3, this.f298627f) : h17;
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
            this.f298625d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f298626e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f298627f = aVar2.i(intValue);
        zArr[3] = true;
        return 0;
    }
}
