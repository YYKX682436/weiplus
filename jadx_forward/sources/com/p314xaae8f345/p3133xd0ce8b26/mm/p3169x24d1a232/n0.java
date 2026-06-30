package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class n0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f301193d;

    /* renamed from: e, reason: collision with root package name */
    public int f301194e;

    /* renamed from: f, reason: collision with root package name */
    public int f301195f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f301196g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f301197h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f301198i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f301199m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f301200n = new boolean[8];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.n0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.n0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.n0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.n0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.n0 n0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.n0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f301193d), java.lang.Integer.valueOf(n0Var.f301193d)) && n51.f.a(java.lang.Integer.valueOf(this.f301194e), java.lang.Integer.valueOf(n0Var.f301194e)) && n51.f.a(java.lang.Integer.valueOf(this.f301195f), java.lang.Integer.valueOf(n0Var.f301195f)) && n51.f.a(this.f301196g, n0Var.f301196g) && n51.f.a(this.f301197h, n0Var.f301197h) && n51.f.a(this.f301198i, n0Var.f301198i) && n51.f.a(this.f301199m, n0Var.f301199m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.n0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f301200n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f301193d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f301194e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f301195f);
            }
            java.lang.String str = this.f301196g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f301197h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f301198i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f301199m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f301193d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f301194e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f301195f);
            }
            java.lang.String str5 = this.f301196g;
            if (str5 != null && zArr[4]) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f301197h;
            if (str6 != null && zArr[5]) {
                e17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f301198i;
            if (str7 != null && zArr[6]) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f301199m;
            return (str8 == null || !zArr[7]) ? e17 : e17 + b36.f.j(7, str8);
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
                this.f301193d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f301194e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f301195f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f301196g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f301197h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f301198i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f301199m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
