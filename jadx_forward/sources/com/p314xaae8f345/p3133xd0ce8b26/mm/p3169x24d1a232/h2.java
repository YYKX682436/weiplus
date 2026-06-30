package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class h2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f301013d;

    /* renamed from: e, reason: collision with root package name */
    public int f301014e;

    /* renamed from: f, reason: collision with root package name */
    public int f301015f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f301016g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f301017h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f301018i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f301019m = new boolean[7];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h2 h2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f301013d), java.lang.Integer.valueOf(h2Var.f301013d)) && n51.f.a(java.lang.Integer.valueOf(this.f301014e), java.lang.Integer.valueOf(h2Var.f301014e)) && n51.f.a(java.lang.Integer.valueOf(this.f301015f), java.lang.Integer.valueOf(h2Var.f301015f)) && n51.f.a(this.f301016g, h2Var.f301016g) && n51.f.a(this.f301017h, h2Var.f301017h) && n51.f.a(this.f301018i, h2Var.f301018i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f301019m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f301013d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f301014e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f301015f);
            }
            java.lang.String str = this.f301016g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f301017h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f301018i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f301013d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f301014e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f301015f);
            }
            java.lang.String str4 = this.f301016g;
            if (str4 != null && zArr[4]) {
                e17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f301017h;
            if (str5 != null && zArr[5]) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f301018i;
            return (str6 == null || !zArr[6]) ? e17 : e17 + b36.f.j(6, str6);
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
                this.f301013d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f301014e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f301015f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f301016g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f301017h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f301018i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
