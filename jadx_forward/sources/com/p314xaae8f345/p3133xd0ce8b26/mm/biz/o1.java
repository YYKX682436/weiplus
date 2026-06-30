package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class o1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: v, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o1 f299932v = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o1();

    /* renamed from: d, reason: collision with root package name */
    public long f299933d;

    /* renamed from: e, reason: collision with root package name */
    public long f299934e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299935f;

    /* renamed from: g, reason: collision with root package name */
    public long f299936g;

    /* renamed from: h, reason: collision with root package name */
    public long f299937h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f299938i;

    /* renamed from: m, reason: collision with root package name */
    public int f299939m;

    /* renamed from: n, reason: collision with root package name */
    public int f299940n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f299941o;

    /* renamed from: p, reason: collision with root package name */
    public int f299942p;

    /* renamed from: q, reason: collision with root package name */
    public int f299943q;

    /* renamed from: r, reason: collision with root package name */
    public int f299944r;

    /* renamed from: s, reason: collision with root package name */
    public int f299945s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f299946t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f299947u = new boolean[15];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o1 o1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f299933d), java.lang.Long.valueOf(o1Var.f299933d)) && n51.f.a(java.lang.Long.valueOf(this.f299934e), java.lang.Long.valueOf(o1Var.f299934e)) && n51.f.a(this.f299935f, o1Var.f299935f) && n51.f.a(java.lang.Long.valueOf(this.f299936g), java.lang.Long.valueOf(o1Var.f299936g)) && n51.f.a(java.lang.Long.valueOf(this.f299937h), java.lang.Long.valueOf(o1Var.f299937h)) && n51.f.a(this.f299938i, o1Var.f299938i) && n51.f.a(java.lang.Integer.valueOf(this.f299939m), java.lang.Integer.valueOf(o1Var.f299939m)) && n51.f.a(java.lang.Integer.valueOf(this.f299940n), java.lang.Integer.valueOf(o1Var.f299940n)) && n51.f.a(this.f299941o, o1Var.f299941o) && n51.f.a(java.lang.Integer.valueOf(this.f299942p), java.lang.Integer.valueOf(o1Var.f299942p)) && n51.f.a(java.lang.Integer.valueOf(this.f299943q), java.lang.Integer.valueOf(o1Var.f299943q)) && n51.f.a(java.lang.Integer.valueOf(this.f299944r), java.lang.Integer.valueOf(o1Var.f299944r)) && n51.f.a(java.lang.Integer.valueOf(this.f299945s), java.lang.Integer.valueOf(o1Var.f299945s)) && n51.f.a(this.f299946t, o1Var.f299946t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f299947u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f299933d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f299934e);
            }
            java.lang.String str = this.f299935f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f299936g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f299937h);
            }
            java.lang.String str2 = this.f299938i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            if (zArr[7]) {
                fVar.e(7, this.f299939m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f299940n);
            }
            java.lang.String str3 = this.f299941o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.e(10, this.f299942p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f299943q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f299944r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f299945s);
            }
            java.lang.String str4 = this.f299946t;
            if (str4 != null && zArr[14]) {
                fVar.j(14, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f299933d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f299934e);
            }
            java.lang.String str5 = this.f299935f;
            if (str5 != null && zArr[3]) {
                h17 += b36.f.j(3, str5);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f299936g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f299937h);
            }
            java.lang.String str6 = this.f299938i;
            if (str6 != null && zArr[6]) {
                h17 += b36.f.j(6, str6);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f299939m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f299940n);
            }
            java.lang.String str7 = this.f299941o;
            if (str7 != null && zArr[9]) {
                h17 += b36.f.j(9, str7);
            }
            if (zArr[10]) {
                h17 += b36.f.e(10, this.f299942p);
            }
            if (zArr[11]) {
                h17 += b36.f.e(11, this.f299943q);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f299944r);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f299945s);
            }
            java.lang.String str8 = this.f299946t;
            return (str8 == null || !zArr[14]) ? h17 : h17 + b36.f.j(14, str8);
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
                this.f299933d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f299934e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299935f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299936g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f299937h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f299938i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f299939m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f299940n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f299941o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f299942p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f299943q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f299944r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f299945s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f299946t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o1) super.mo11468x92b714fd(bArr);
    }
}
