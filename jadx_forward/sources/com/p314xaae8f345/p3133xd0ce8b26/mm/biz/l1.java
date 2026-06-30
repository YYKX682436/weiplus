package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes9.dex */
public class l1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: w, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l1 f299794w = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l1();

    /* renamed from: d, reason: collision with root package name */
    public long f299795d;

    /* renamed from: e, reason: collision with root package name */
    public int f299796e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299797f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f299798g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f299799h;

    /* renamed from: i, reason: collision with root package name */
    public int f299800i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f299801m;

    /* renamed from: n, reason: collision with root package name */
    public int f299802n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f299803o;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k1 f299806r;

    /* renamed from: s, reason: collision with root package name */
    public int f299807s;

    /* renamed from: t, reason: collision with root package name */
    public int f299808t;

    /* renamed from: u, reason: collision with root package name */
    public int f299809u;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f299804p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f299805q = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f299810v = new boolean[16];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l1 l1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f299795d), java.lang.Long.valueOf(l1Var.f299795d)) && n51.f.a(java.lang.Integer.valueOf(this.f299796e), java.lang.Integer.valueOf(l1Var.f299796e)) && n51.f.a(this.f299797f, l1Var.f299797f) && n51.f.a(this.f299798g, l1Var.f299798g) && n51.f.a(java.lang.Boolean.valueOf(this.f299799h), java.lang.Boolean.valueOf(l1Var.f299799h)) && n51.f.a(java.lang.Integer.valueOf(this.f299800i), java.lang.Integer.valueOf(l1Var.f299800i)) && n51.f.a(this.f299801m, l1Var.f299801m) && n51.f.a(java.lang.Integer.valueOf(this.f299802n), java.lang.Integer.valueOf(l1Var.f299802n)) && n51.f.a(this.f299803o, l1Var.f299803o) && n51.f.a(this.f299804p, l1Var.f299804p) && n51.f.a(this.f299805q, l1Var.f299805q) && n51.f.a(this.f299806r, l1Var.f299806r) && n51.f.a(java.lang.Integer.valueOf(this.f299807s), java.lang.Integer.valueOf(l1Var.f299807s)) && n51.f.a(java.lang.Integer.valueOf(this.f299808t), java.lang.Integer.valueOf(l1Var.f299808t)) && n51.f.a(java.lang.Integer.valueOf(this.f299809u), java.lang.Integer.valueOf(l1Var.f299809u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f299805q;
        java.util.LinkedList linkedList2 = this.f299804p;
        boolean[] zArr = this.f299810v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f299795d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f299796e);
            }
            java.lang.String str = this.f299797f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f299798g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.a(5, this.f299799h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f299800i);
            }
            java.lang.String str3 = this.f299801m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f299802n);
            }
            java.lang.String str4 = this.f299803o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 8, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k1 k1Var = this.f299806r;
            if (k1Var != null && zArr[12]) {
                fVar.i(12, k1Var.mo75928xcd1e8d8());
                this.f299806r.mo75956x3d5d1f78(fVar);
            }
            if (zArr[13]) {
                fVar.e(13, this.f299807s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f299808t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f299809u);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f299795d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f299796e);
            }
            java.lang.String str5 = this.f299797f;
            if (str5 != null && zArr[3]) {
                h17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f299798g;
            if (str6 != null && zArr[4]) {
                h17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                h17 += b36.f.a(5, this.f299799h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f299800i);
            }
            java.lang.String str7 = this.f299801m;
            if (str7 != null && zArr[7]) {
                h17 += b36.f.j(7, str7);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f299802n);
            }
            java.lang.String str8 = this.f299803o;
            if (str8 != null && zArr[9]) {
                h17 += b36.f.j(9, str8);
            }
            int g17 = h17 + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 8, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k1 k1Var2 = this.f299806r;
            if (k1Var2 != null && zArr[12]) {
                g17 += b36.f.i(12, k1Var2.mo75928xcd1e8d8());
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f299807s);
            }
            if (zArr[14]) {
                g17 += b36.f.e(14, this.f299808t);
            }
            return zArr[15] ? g17 + b36.f.e(15, this.f299809u) : g17;
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
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
                this.f299795d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f299796e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f299797f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f299798g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f299799h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f299800i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f299801m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f299802n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f299803o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m1 m1Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m1();
                    if (bArr != null && bArr.length > 0) {
                        m1Var.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(m1Var);
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m1 m1Var2 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.m1();
                    if (bArr2 != null && bArr2.length > 0) {
                        m1Var2.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(m1Var2);
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k1 k1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k1();
                    if (bArr3 != null && bArr3.length > 0) {
                        k1Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f299806r = k1Var3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f299807s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f299808t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f299809u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l1) super.mo11468x92b714fd(bArr);
    }
}
