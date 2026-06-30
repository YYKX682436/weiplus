package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class g1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: v, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g1 f300976v = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g1();

    /* renamed from: d, reason: collision with root package name */
    public long f300977d;

    /* renamed from: e, reason: collision with root package name */
    public long f300978e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f300979f;

    /* renamed from: g, reason: collision with root package name */
    public long f300980g;

    /* renamed from: h, reason: collision with root package name */
    public long f300981h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f300982i;

    /* renamed from: m, reason: collision with root package name */
    public int f300983m;

    /* renamed from: n, reason: collision with root package name */
    public int f300984n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f300985o;

    /* renamed from: p, reason: collision with root package name */
    public int f300986p;

    /* renamed from: q, reason: collision with root package name */
    public int f300987q;

    /* renamed from: r, reason: collision with root package name */
    public int f300988r;

    /* renamed from: s, reason: collision with root package name */
    public int f300989s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f300990t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f300991u = new boolean[15];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g1 g1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f300977d), java.lang.Long.valueOf(g1Var.f300977d)) && n51.f.a(java.lang.Long.valueOf(this.f300978e), java.lang.Long.valueOf(g1Var.f300978e)) && n51.f.a(this.f300979f, g1Var.f300979f) && n51.f.a(java.lang.Long.valueOf(this.f300980g), java.lang.Long.valueOf(g1Var.f300980g)) && n51.f.a(java.lang.Long.valueOf(this.f300981h), java.lang.Long.valueOf(g1Var.f300981h)) && n51.f.a(this.f300982i, g1Var.f300982i) && n51.f.a(java.lang.Integer.valueOf(this.f300983m), java.lang.Integer.valueOf(g1Var.f300983m)) && n51.f.a(java.lang.Integer.valueOf(this.f300984n), java.lang.Integer.valueOf(g1Var.f300984n)) && n51.f.a(this.f300985o, g1Var.f300985o) && n51.f.a(java.lang.Integer.valueOf(this.f300986p), java.lang.Integer.valueOf(g1Var.f300986p)) && n51.f.a(java.lang.Integer.valueOf(this.f300987q), java.lang.Integer.valueOf(g1Var.f300987q)) && n51.f.a(java.lang.Integer.valueOf(this.f300988r), java.lang.Integer.valueOf(g1Var.f300988r)) && n51.f.a(java.lang.Integer.valueOf(this.f300989s), java.lang.Integer.valueOf(g1Var.f300989s)) && n51.f.a(this.f300990t, g1Var.f300990t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f300991u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f300977d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f300978e);
            }
            java.lang.String str = this.f300979f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f300980g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f300981h);
            }
            java.lang.String str2 = this.f300982i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            if (zArr[7]) {
                fVar.e(7, this.f300983m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f300984n);
            }
            java.lang.String str3 = this.f300985o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.e(10, this.f300986p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f300987q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f300988r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f300989s);
            }
            java.lang.String str4 = this.f300990t;
            if (str4 != null && zArr[14]) {
                fVar.j(14, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f300977d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f300978e);
            }
            java.lang.String str5 = this.f300979f;
            if (str5 != null && zArr[3]) {
                h17 += b36.f.j(3, str5);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f300980g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f300981h);
            }
            java.lang.String str6 = this.f300982i;
            if (str6 != null && zArr[6]) {
                h17 += b36.f.j(6, str6);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f300983m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f300984n);
            }
            java.lang.String str7 = this.f300985o;
            if (str7 != null && zArr[9]) {
                h17 += b36.f.j(9, str7);
            }
            if (zArr[10]) {
                h17 += b36.f.e(10, this.f300986p);
            }
            if (zArr[11]) {
                h17 += b36.f.e(11, this.f300987q);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f300988r);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f300989s);
            }
            java.lang.String str8 = this.f300990t;
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
                this.f300977d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f300978e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f300979f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f300980g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f300981h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f300982i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f300983m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f300984n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f300985o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f300986p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f300987q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f300988r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f300989s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f300990t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.g1) super.mo11468x92b714fd(bArr);
    }
}
