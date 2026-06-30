package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class w1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f300263d;

    /* renamed from: e, reason: collision with root package name */
    public long f300264e;

    /* renamed from: f, reason: collision with root package name */
    public int f300265f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f300266g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f300267h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f300268i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f300269m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f300270n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f300271o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f300272p = new boolean[10];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w1 w1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f300263d), java.lang.Long.valueOf(w1Var.f300263d)) && n51.f.a(java.lang.Long.valueOf(this.f300264e), java.lang.Long.valueOf(w1Var.f300264e)) && n51.f.a(java.lang.Integer.valueOf(this.f300265f), java.lang.Integer.valueOf(w1Var.f300265f)) && n51.f.a(this.f300266g, w1Var.f300266g) && n51.f.a(this.f300267h, w1Var.f300267h) && n51.f.a(this.f300268i, w1Var.f300268i) && n51.f.a(this.f300269m, w1Var.f300269m) && n51.f.a(this.f300270n, w1Var.f300270n) && n51.f.a(this.f300271o, w1Var.f300271o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f300272p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f300263d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f300264e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f300265f);
            }
            java.lang.String str = this.f300266g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f300267h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f300268i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f300269m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f300270n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f300271o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f300263d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f300264e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f300265f);
            }
            java.lang.String str7 = this.f300266g;
            if (str7 != null && zArr[4]) {
                h17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f300267h;
            if (str8 != null && zArr[5]) {
                h17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f300268i;
            if (str9 != null && zArr[6]) {
                h17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f300269m;
            if (str10 != null && zArr[7]) {
                h17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f300270n;
            if (str11 != null && zArr[8]) {
                h17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f300271o;
            return (str12 == null || !zArr[9]) ? h17 : h17 + b36.f.j(9, str12);
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
                this.f300263d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f300264e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f300265f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f300266g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f300267h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f300268i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f300269m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f300270n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f300271o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
