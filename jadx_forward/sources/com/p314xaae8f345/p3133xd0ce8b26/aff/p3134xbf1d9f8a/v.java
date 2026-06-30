package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes7.dex */
public class v extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.v f297525i = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.v();

    /* renamed from: d, reason: collision with root package name */
    public long f297526d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f297527e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f297528f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f297529g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f297530h = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.v)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.v vVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.v) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f297526d), java.lang.Long.valueOf(vVar.f297526d)) && n51.f.a(java.lang.Long.valueOf(this.f297527e), java.lang.Long.valueOf(vVar.f297527e)) && n51.f.a(java.lang.Long.valueOf(this.f297528f), java.lang.Long.valueOf(vVar.f297528f)) && n51.f.a(java.lang.Long.valueOf(this.f297529g), java.lang.Long.valueOf(vVar.f297529g)) && n51.f.a(java.lang.Boolean.valueOf(this.f297530h), java.lang.Boolean.valueOf(vVar.f297530h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.v();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f297526d);
            fVar.h(2, this.f297527e);
            fVar.h(3, this.f297528f);
            fVar.h(4, this.f297529g);
            fVar.a(5, this.f297530h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f297526d) + 0 + b36.f.h(2, this.f297527e) + b36.f.h(3, this.f297528f) + b36.f.h(4, this.f297529g) + b36.f.a(5, this.f297530h);
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
            this.f297526d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f297527e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f297528f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f297529g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f297530h = aVar2.c(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.v) super.mo11468x92b714fd(bArr);
    }
}
