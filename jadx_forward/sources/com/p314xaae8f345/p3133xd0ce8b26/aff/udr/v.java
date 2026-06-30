package com.p314xaae8f345.p3133xd0ce8b26.aff.udr;

/* loaded from: classes7.dex */
public class v extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f299111d;

    /* renamed from: e, reason: collision with root package name */
    public int f299112e;

    /* renamed from: f, reason: collision with root package name */
    public int f299113f;

    /* renamed from: g, reason: collision with root package name */
    public long f299114g;

    /* renamed from: h, reason: collision with root package name */
    public double f299115h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f299116i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f299117m = new boolean[7];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v) super.mo11468x92b714fd(bArr);
    }

    public com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v c(int i17) {
        this.f299113f = i17;
        this.f299117m[3] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v vVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v) fVar;
        return n51.f.a(this.f299111d, vVar.f299111d) && n51.f.a(java.lang.Integer.valueOf(this.f299112e), java.lang.Integer.valueOf(vVar.f299112e)) && n51.f.a(java.lang.Integer.valueOf(this.f299113f), java.lang.Integer.valueOf(vVar.f299113f)) && n51.f.a(java.lang.Long.valueOf(this.f299114g), java.lang.Long.valueOf(vVar.f299114g)) && n51.f.a(java.lang.Double.valueOf(this.f299115h), java.lang.Double.valueOf(vVar.f299115h)) && n51.f.a(this.f299116i, vVar.f299116i);
    }

    public com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v d(java.lang.String str) {
        this.f299111d = str;
        this.f299117m[1] = true;
        return this;
    }

    public com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v e(int i17) {
        this.f299112e = i17;
        this.f299117m[2] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f299117m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f299111d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f299112e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f299113f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f299114g);
            }
            if (zArr[5]) {
                fVar.c(5, this.f299115h);
            }
            java.lang.String str2 = this.f299116i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f299111d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f299112e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f299113f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f299114g);
            }
            if (zArr[5]) {
                i18 += b36.f.c(5, this.f299115h);
            }
            java.lang.String str4 = this.f299116i;
            return (str4 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str4);
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
                this.f299111d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f299112e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299113f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299114g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f299115h = aVar2.e(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f299116i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
