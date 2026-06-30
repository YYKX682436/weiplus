package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class s2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f301345d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f301346e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301347f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f301348g;

    /* renamed from: h, reason: collision with root package name */
    public int f301349h;

    /* renamed from: i, reason: collision with root package name */
    public int f301350i;

    /* renamed from: m, reason: collision with root package name */
    public int f301351m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f301352n = new boolean[8];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s2 s2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f301345d), java.lang.Integer.valueOf(s2Var.f301345d)) && n51.f.a(this.f301346e, s2Var.f301346e) && n51.f.a(this.f301347f, s2Var.f301347f) && n51.f.a(this.f301348g, s2Var.f301348g) && n51.f.a(java.lang.Integer.valueOf(this.f301349h), java.lang.Integer.valueOf(s2Var.f301349h)) && n51.f.a(java.lang.Integer.valueOf(this.f301350i), java.lang.Integer.valueOf(s2Var.f301350i)) && n51.f.a(java.lang.Integer.valueOf(this.f301351m), java.lang.Integer.valueOf(s2Var.f301351m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.s2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f301352n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f301345d);
            }
            java.lang.String str = this.f301346e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f301347f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f301348g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f301349h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f301350i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f301351m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f301345d) : 0;
            java.lang.String str4 = this.f301346e;
            if (str4 != null && zArr[2]) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f301347f;
            if (str5 != null && zArr[3]) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f301348g;
            if (str6 != null && zArr[4]) {
                e17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f301349h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f301350i);
            }
            return zArr[7] ? e17 + b36.f.e(7, this.f301351m) : e17;
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
                this.f301345d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f301346e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f301347f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f301348g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f301349h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f301350i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f301351m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
