package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes7.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f297347d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f297348e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f297349f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f297350g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f297351h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f297352i = 0;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e eVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f297347d), java.lang.Long.valueOf(eVar.f297347d)) && n51.f.a(java.lang.Long.valueOf(this.f297348e), java.lang.Long.valueOf(eVar.f297348e)) && n51.f.a(java.lang.Long.valueOf(this.f297349f), java.lang.Long.valueOf(eVar.f297349f)) && n51.f.a(java.lang.Long.valueOf(this.f297350g), java.lang.Long.valueOf(eVar.f297350g)) && n51.f.a(java.lang.Integer.valueOf(this.f297351h), java.lang.Integer.valueOf(eVar.f297351h)) && n51.f.a(java.lang.Long.valueOf(this.f297352i), java.lang.Long.valueOf(eVar.f297352i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f297347d);
            fVar.h(2, this.f297348e);
            fVar.h(3, this.f297349f);
            fVar.h(4, this.f297350g);
            fVar.e(5, this.f297351h);
            fVar.h(6, this.f297352i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f297347d) + 0 + b36.f.h(2, this.f297348e) + b36.f.h(3, this.f297349f) + b36.f.h(4, this.f297350g) + b36.f.e(5, this.f297351h) + b36.f.h(6, this.f297352i);
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
                this.f297347d = aVar2.i(intValue);
                return 0;
            case 2:
                this.f297348e = aVar2.i(intValue);
                return 0;
            case 3:
                this.f297349f = aVar2.i(intValue);
                return 0;
            case 4:
                this.f297350g = aVar2.i(intValue);
                return 0;
            case 5:
                this.f297351h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f297352i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.e) super.mo11468x92b714fd(bArr);
    }
}
