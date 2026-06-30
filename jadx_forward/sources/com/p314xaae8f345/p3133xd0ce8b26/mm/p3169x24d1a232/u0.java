package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class u0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f301387d;

    /* renamed from: e, reason: collision with root package name */
    public int f301388e;

    /* renamed from: f, reason: collision with root package name */
    public long f301389f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f301390g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f301391h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f301392i = new boolean[6];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.u0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.u0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.u0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.u0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.u0 u0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.u0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f301387d), java.lang.Integer.valueOf(u0Var.f301387d)) && n51.f.a(java.lang.Integer.valueOf(this.f301388e), java.lang.Integer.valueOf(u0Var.f301388e)) && n51.f.a(java.lang.Long.valueOf(this.f301389f), java.lang.Long.valueOf(u0Var.f301389f)) && n51.f.a(this.f301390g, u0Var.f301390g) && n51.f.a(this.f301391h, u0Var.f301391h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.u0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f301392i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f301387d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f301388e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f301389f);
            }
            java.lang.String str = this.f301390g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f301391h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f301387d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f301388e);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f301389f);
            }
            java.lang.String str3 = this.f301390g;
            if (str3 != null && zArr[4]) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f301391h;
            return (str4 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str4);
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
            this.f301387d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f301388e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f301389f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f301390g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f301391h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
