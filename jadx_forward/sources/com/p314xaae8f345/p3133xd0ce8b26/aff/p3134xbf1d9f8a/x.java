package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes15.dex */
public class x extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x f297539i = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y f297540d = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y.kAffRoamDiskTypeUnknown;

    /* renamed from: e, reason: collision with root package name */
    public long f297541e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f297542f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f297543g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f297544h = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x xVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x) fVar;
        return n51.f.a(this.f297540d, xVar.f297540d) && n51.f.a(java.lang.Long.valueOf(this.f297541e), java.lang.Long.valueOf(xVar.f297541e)) && n51.f.a(java.lang.Long.valueOf(this.f297542f), java.lang.Long.valueOf(xVar.f297542f)) && n51.f.a(java.lang.Long.valueOf(this.f297543g), java.lang.Long.valueOf(xVar.f297543g)) && n51.f.a(java.lang.Boolean.valueOf(this.f297544h), java.lang.Boolean.valueOf(xVar.f297544h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y yVar = this.f297540d;
            if (yVar != null) {
                fVar.e(1, yVar.f297554d);
            }
            fVar.h(2, this.f297541e);
            fVar.h(3, this.f297542f);
            fVar.h(4, this.f297543g);
            fVar.a(5, this.f297544h);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y yVar2 = this.f297540d;
            return (yVar2 != null ? 0 + b36.f.e(1, yVar2.f297554d) : 0) + b36.f.h(2, this.f297541e) + b36.f.h(3, this.f297542f) + b36.f.h(4, this.f297543g) + b36.f.a(5, this.f297544h);
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
            int g17 = aVar2.g(intValue);
            this.f297540d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? g17 != 5 ? null : com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y.kAffRoamDiskTypePortableDisk : com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y.kAffRoamDiskTypeMacOS : com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y.kAffRoamDiskTypeWindows : com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y.kAffRoamDiskTypeICloud : com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y.kAffRoamDiskTypeNas : com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y.kAffRoamDiskTypeUnknown;
            return 0;
        }
        if (intValue == 2) {
            this.f297541e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f297542f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f297543g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f297544h = aVar2.c(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.x) super.mo11468x92b714fd(bArr);
    }
}
