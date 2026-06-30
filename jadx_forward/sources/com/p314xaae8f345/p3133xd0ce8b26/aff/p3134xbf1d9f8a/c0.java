package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes7.dex */
public class c0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f297334d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f297335e = false;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f297336f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f297337g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f297338h = 0;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.c0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.c0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.c0 c0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.c0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f297334d), java.lang.Integer.valueOf(c0Var.f297334d)) && n51.f.a(java.lang.Boolean.valueOf(this.f297335e), java.lang.Boolean.valueOf(c0Var.f297335e)) && n51.f.a(this.f297336f, c0Var.f297336f) && n51.f.a(java.lang.Boolean.valueOf(this.f297337g), java.lang.Boolean.valueOf(c0Var.f297337g)) && n51.f.a(java.lang.Integer.valueOf(this.f297338h), java.lang.Integer.valueOf(c0Var.f297338h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.c0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f297334d);
            fVar.a(2, this.f297335e);
            java.lang.String str = this.f297336f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(4, this.f297337g);
            fVar.e(5, this.f297338h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f297334d) + 0 + b36.f.a(2, this.f297335e);
            java.lang.String str2 = this.f297336f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.a(4, this.f297337g) + b36.f.e(5, this.f297338h);
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
            this.f297334d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f297335e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f297336f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f297337g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f297338h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.c0) super.mo11468x92b714fd(bArr);
    }
}
