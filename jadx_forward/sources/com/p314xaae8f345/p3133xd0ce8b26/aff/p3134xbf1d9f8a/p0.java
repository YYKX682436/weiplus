package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes7.dex */
public class p0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p0 f297478m = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p0();

    /* renamed from: d, reason: collision with root package name */
    public long f297479d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f297480e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f297481f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f297482g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f297483h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f297484i = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p0 p0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f297479d), java.lang.Long.valueOf(p0Var.f297479d)) && n51.f.a(java.lang.Long.valueOf(this.f297480e), java.lang.Long.valueOf(p0Var.f297480e)) && n51.f.a(java.lang.Long.valueOf(this.f297481f), java.lang.Long.valueOf(p0Var.f297481f)) && n51.f.a(java.lang.Long.valueOf(this.f297482g), java.lang.Long.valueOf(p0Var.f297482g)) && n51.f.a(java.lang.Long.valueOf(this.f297483h), java.lang.Long.valueOf(p0Var.f297483h)) && n51.f.a(java.lang.Long.valueOf(this.f297484i), java.lang.Long.valueOf(p0Var.f297484i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f297479d);
            fVar.h(2, this.f297480e);
            fVar.h(3, this.f297481f);
            fVar.h(4, this.f297482g);
            fVar.h(5, this.f297483h);
            fVar.h(6, this.f297484i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f297479d) + 0 + b36.f.h(2, this.f297480e) + b36.f.h(3, this.f297481f) + b36.f.h(4, this.f297482g) + b36.f.h(5, this.f297483h) + b36.f.h(6, this.f297484i);
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
                this.f297479d = aVar2.i(intValue);
                return 0;
            case 2:
                this.f297480e = aVar2.i(intValue);
                return 0;
            case 3:
                this.f297481f = aVar2.i(intValue);
                return 0;
            case 4:
                this.f297482g = aVar2.i(intValue);
                return 0;
            case 5:
                this.f297483h = aVar2.i(intValue);
                return 0;
            case 6:
                this.f297484i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p0) super.mo11468x92b714fd(bArr);
    }
}
