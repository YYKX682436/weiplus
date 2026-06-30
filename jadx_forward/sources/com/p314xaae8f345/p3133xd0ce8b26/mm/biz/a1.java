package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes11.dex */
public class a1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1 f299385h = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f299386d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299387e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z0 f299388f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f299389g = new boolean[4];

    public java.lang.String b() {
        return this.f299389g[2] ? this.f299387e : "";
    }

    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z0 c() {
        return this.f299389g[3] ? this.f299388f : com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z0.ModeHide;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1 a1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1) fVar;
        return n51.f.a(this.f299386d, a1Var.f299386d) && n51.f.a(this.f299387e, a1Var.f299387e) && n51.f.a(this.f299388f, a1Var.f299388f);
    }

    /* renamed from: getNickname */
    public java.lang.String m118661x8010e5e4() {
        return this.f299389g[1] ? this.f299386d : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299389g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f299386d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f299387e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z0 z0Var = this.f299388f;
            if (z0Var != null && zArr[3]) {
                fVar.e(3, z0Var.f300357d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f299386d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f299387e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z0 z0Var2 = this.f299388f;
            return (z0Var2 == null || !zArr[3]) ? i18 : i18 + b36.f.e(3, z0Var2.f300357d);
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
            this.f299386d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f299387e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f299388f = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z0.ModeLiving : com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z0.ModeLiveEnd : com.p314xaae8f345.p3133xd0ce8b26.mm.biz.z0.ModeHide;
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a1) super.mo11468x92b714fd(bArr);
    }
}
