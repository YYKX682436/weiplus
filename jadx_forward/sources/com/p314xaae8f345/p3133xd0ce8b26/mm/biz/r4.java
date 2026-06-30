package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class r4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: v, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.r4 f300057v = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.r4();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t f300058d = new com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t();

    /* renamed from: e, reason: collision with root package name */
    public int f300059e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f300060f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f300061g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f300062h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f300063i = 0;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k3 f300064m = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k3();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f300065n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e3 f300066o = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e3();

    /* renamed from: p, reason: collision with root package name */
    public int f300067p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f300068q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f300069r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f300070s = 0;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w4 f300071t = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w4();

    /* renamed from: u, reason: collision with root package name */
    public int f300072u = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.r4)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.r4 r4Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.r4) fVar;
        return n51.f.a(this.f300058d, r4Var.f300058d) && n51.f.a(java.lang.Integer.valueOf(this.f300059e), java.lang.Integer.valueOf(r4Var.f300059e)) && n51.f.a(java.lang.Integer.valueOf(this.f300060f), java.lang.Integer.valueOf(r4Var.f300060f)) && n51.f.a(java.lang.Integer.valueOf(this.f300061g), java.lang.Integer.valueOf(r4Var.f300061g)) && n51.f.a(java.lang.Integer.valueOf(this.f300062h), java.lang.Integer.valueOf(r4Var.f300062h)) && n51.f.a(java.lang.Integer.valueOf(this.f300063i), java.lang.Integer.valueOf(r4Var.f300063i)) && n51.f.a(this.f300064m, r4Var.f300064m) && n51.f.a(this.f300065n, r4Var.f300065n) && n51.f.a(this.f300066o, r4Var.f300066o) && n51.f.a(java.lang.Integer.valueOf(this.f300067p), java.lang.Integer.valueOf(r4Var.f300067p)) && n51.f.a(java.lang.Integer.valueOf(this.f300068q), java.lang.Integer.valueOf(r4Var.f300068q)) && n51.f.a(java.lang.Integer.valueOf(this.f300069r), java.lang.Integer.valueOf(r4Var.f300069r)) && n51.f.a(java.lang.Integer.valueOf(this.f300070s), java.lang.Integer.valueOf(r4Var.f300070s)) && n51.f.a(this.f300071t, r4Var.f300071t) && n51.f.a(java.lang.Integer.valueOf(this.f300072u), java.lang.Integer.valueOf(r4Var.f300072u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.r4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f300065n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t tVar = this.f300058d;
            if (tVar != null) {
                fVar.i(1, tVar.mo75928xcd1e8d8());
                this.f300058d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f300059e);
            fVar.e(3, this.f300060f);
            fVar.e(4, this.f300061g);
            fVar.e(5, this.f300062h);
            fVar.e(6, this.f300063i);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k3 k3Var = this.f300064m;
            if (k3Var != null) {
                fVar.i(7, k3Var.mo75928xcd1e8d8());
                this.f300064m.mo75956x3d5d1f78(fVar);
            }
            fVar.g(8, 2, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e3 e3Var = this.f300066o;
            if (e3Var != null) {
                fVar.i(9, e3Var.mo75928xcd1e8d8());
                this.f300066o.mo75956x3d5d1f78(fVar);
            }
            fVar.e(10, this.f300067p);
            fVar.e(11, this.f300068q);
            fVar.e(12, this.f300069r);
            fVar.e(13, this.f300070s);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w4 w4Var = this.f300071t;
            if (w4Var != null) {
                fVar.i(14, w4Var.mo75928xcd1e8d8());
                this.f300071t.mo75956x3d5d1f78(fVar);
            }
            fVar.e(15, this.f300072u);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t tVar2 = this.f300058d;
            int i18 = (tVar2 != null ? b36.f.i(1, tVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f300059e) + b36.f.e(3, this.f300060f) + b36.f.e(4, this.f300061g) + b36.f.e(5, this.f300062h) + b36.f.e(6, this.f300063i);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k3 k3Var2 = this.f300064m;
            if (k3Var2 != null) {
                i18 += b36.f.i(7, k3Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(8, 2, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e3 e3Var2 = this.f300066o;
            if (e3Var2 != null) {
                g17 += b36.f.i(9, e3Var2.mo75928xcd1e8d8());
            }
            int e17 = g17 + b36.f.e(10, this.f300067p) + b36.f.e(11, this.f300068q) + b36.f.e(12, this.f300069r) + b36.f.e(13, this.f300070s);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w4 w4Var2 = this.f300071t;
            if (w4Var2 != null) {
                e17 += b36.f.i(14, w4Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(15, this.f300072u);
        }
        if (i17 == 2) {
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t tVar3 = new com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t();
                    if (bArr != null && bArr.length > 0) {
                        tVar3.mo11468x92b714fd(bArr);
                    }
                    this.f300058d = tVar3;
                }
                return 0;
            case 2:
                this.f300059e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f300060f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f300061g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f300062h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f300063i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k3 k3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k3();
                    if (bArr2 != null && bArr2.length > 0) {
                        k3Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f300064m = k3Var3;
                }
                return 0;
            case 8:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e3 e3Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e3();
                    if (bArr3 != null && bArr3.length > 0) {
                        e3Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f300066o = e3Var3;
                }
                return 0;
            case 10:
                this.f300067p = aVar2.g(intValue);
                return 0;
            case 11:
                this.f300068q = aVar2.g(intValue);
                return 0;
            case 12:
                this.f300069r = aVar2.g(intValue);
                return 0;
            case 13:
                this.f300070s = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w4 w4Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.w4();
                    if (bArr4 != null && bArr4.length > 0) {
                        w4Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f300071t = w4Var3;
                }
                return 0;
            case 15:
                this.f300072u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.r4) super.mo11468x92b714fd(bArr);
    }
}
