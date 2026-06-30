package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes9.dex */
public class q3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f300019d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f300020e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f300021f;

    /* renamed from: g, reason: collision with root package name */
    public int f300022g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f300023h;

    /* renamed from: i, reason: collision with root package name */
    public int f300024i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f300025m = new boolean[7];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q3 q3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f300019d), java.lang.Long.valueOf(q3Var.f300019d)) && n51.f.a(this.f300020e, q3Var.f300020e) && n51.f.a(this.f300021f, q3Var.f300021f) && n51.f.a(java.lang.Integer.valueOf(this.f300022g), java.lang.Integer.valueOf(q3Var.f300022g)) && n51.f.a(this.f300023h, q3Var.f300023h) && n51.f.a(java.lang.Integer.valueOf(this.f300024i), java.lang.Integer.valueOf(q3Var.f300024i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.q3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f300025m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f300019d);
            }
            java.lang.String str = this.f300020e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f300021f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f300022g);
            }
            java.lang.String str3 = this.f300023h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f300024i);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f300019d) : 0;
            java.lang.String str4 = this.f300020e;
            if (str4 != null && zArr[2]) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f300021f;
            if (str5 != null && zArr[3]) {
                h17 += b36.f.j(3, str5);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f300022g);
            }
            java.lang.String str6 = this.f300023h;
            if (str6 != null && zArr[5]) {
                h17 += b36.f.j(5, str6);
            }
            return zArr[6] ? h17 + b36.f.e(6, this.f300024i) : h17;
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
                this.f300019d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f300020e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f300021f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f300022g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f300023h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f300024i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
