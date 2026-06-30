package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes7.dex */
public class l0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: o, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l0 f297419o = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l0();

    /* renamed from: d, reason: collision with root package name */
    public long f297420d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f297421e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f297422f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f297423g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f297424h = false;

    /* renamed from: i, reason: collision with root package name */
    public long f297425i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f297426m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f297427n = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l0 l0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f297420d), java.lang.Long.valueOf(l0Var.f297420d)) && n51.f.a(java.lang.Long.valueOf(this.f297421e), java.lang.Long.valueOf(l0Var.f297421e)) && n51.f.a(java.lang.Long.valueOf(this.f297422f), java.lang.Long.valueOf(l0Var.f297422f)) && n51.f.a(java.lang.Long.valueOf(this.f297423g), java.lang.Long.valueOf(l0Var.f297423g)) && n51.f.a(java.lang.Boolean.valueOf(this.f297424h), java.lang.Boolean.valueOf(l0Var.f297424h)) && n51.f.a(java.lang.Long.valueOf(this.f297425i), java.lang.Long.valueOf(l0Var.f297425i)) && n51.f.a(java.lang.Long.valueOf(this.f297426m), java.lang.Long.valueOf(l0Var.f297426m)) && n51.f.a(java.lang.Long.valueOf(this.f297427n), java.lang.Long.valueOf(l0Var.f297427n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f297420d);
            fVar.h(2, this.f297421e);
            fVar.h(3, this.f297422f);
            fVar.h(4, this.f297423g);
            fVar.a(5, this.f297424h);
            fVar.h(6, this.f297425i);
            fVar.h(7, this.f297426m);
            fVar.h(8, this.f297427n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f297420d) + 0 + b36.f.h(2, this.f297421e) + b36.f.h(3, this.f297422f) + b36.f.h(4, this.f297423g) + b36.f.a(5, this.f297424h) + b36.f.h(6, this.f297425i) + b36.f.h(7, this.f297426m) + b36.f.h(8, this.f297427n);
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
                this.f297420d = aVar2.i(intValue);
                return 0;
            case 2:
                this.f297421e = aVar2.i(intValue);
                return 0;
            case 3:
                this.f297422f = aVar2.i(intValue);
                return 0;
            case 4:
                this.f297423g = aVar2.i(intValue);
                return 0;
            case 5:
                this.f297424h = aVar2.c(intValue);
                return 0;
            case 6:
                this.f297425i = aVar2.i(intValue);
                return 0;
            case 7:
                this.f297426m = aVar2.i(intValue);
                return 0;
            case 8:
                this.f297427n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l0) super.mo11468x92b714fd(bArr);
    }
}
