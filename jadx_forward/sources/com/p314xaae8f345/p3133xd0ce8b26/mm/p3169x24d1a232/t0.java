package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes11.dex */
public class t0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.t0 f301355h = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.t0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f301356d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f301357e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s0 f301358f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f301359g = new boolean[4];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.t0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.t0 t0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.t0) fVar;
        return n51.f.a(this.f301356d, t0Var.f301356d) && n51.f.a(this.f301357e, t0Var.f301357e) && n51.f.a(this.f301358f, t0Var.f301358f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.t0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f301359g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f301356d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f301357e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s0 s0Var = this.f301358f;
            if (s0Var != null && zArr[3]) {
                fVar.e(3, s0Var.f301329d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f301356d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f301357e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s0 s0Var2 = this.f301358f;
            return (s0Var2 == null || !zArr[3]) ? i18 : i18 + b36.f.e(3, s0Var2.f301329d);
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
            this.f301356d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f301357e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f301358f = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s0.BoxModeLiving : com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s0.BoxModeLiveEnd : com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s0.BoxModeHide;
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.t0) super.mo11468x92b714fd(bArr);
    }
}
