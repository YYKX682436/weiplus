package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class j3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: s, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j3 f301085s = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j3();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h f301086d = new com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h();

    /* renamed from: e, reason: collision with root package name */
    public int f301087e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f301088f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f301089g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f301090h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f301091i = 0;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m2 f301092m = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m2();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f301093n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i2 f301094o = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i2();

    /* renamed from: p, reason: collision with root package name */
    public int f301095p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f301096q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f301097r = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j3 j3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j3) fVar;
        return n51.f.a(this.f301086d, j3Var.f301086d) && n51.f.a(java.lang.Integer.valueOf(this.f301087e), java.lang.Integer.valueOf(j3Var.f301087e)) && n51.f.a(java.lang.Integer.valueOf(this.f301088f), java.lang.Integer.valueOf(j3Var.f301088f)) && n51.f.a(java.lang.Integer.valueOf(this.f301089g), java.lang.Integer.valueOf(j3Var.f301089g)) && n51.f.a(java.lang.Integer.valueOf(this.f301090h), java.lang.Integer.valueOf(j3Var.f301090h)) && n51.f.a(java.lang.Integer.valueOf(this.f301091i), java.lang.Integer.valueOf(j3Var.f301091i)) && n51.f.a(this.f301092m, j3Var.f301092m) && n51.f.a(this.f301093n, j3Var.f301093n) && n51.f.a(this.f301094o, j3Var.f301094o) && n51.f.a(java.lang.Integer.valueOf(this.f301095p), java.lang.Integer.valueOf(j3Var.f301095p)) && n51.f.a(java.lang.Integer.valueOf(this.f301096q), java.lang.Integer.valueOf(j3Var.f301096q)) && n51.f.a(java.lang.Integer.valueOf(this.f301097r), java.lang.Integer.valueOf(j3Var.f301097r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f301093n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h hVar = this.f301086d;
            if (hVar != null) {
                fVar.i(1, hVar.mo75928xcd1e8d8());
                this.f301086d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f301087e);
            fVar.e(3, this.f301088f);
            fVar.e(4, this.f301089g);
            fVar.e(5, this.f301090h);
            fVar.e(6, this.f301091i);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m2 m2Var = this.f301092m;
            if (m2Var != null) {
                fVar.i(7, m2Var.mo75928xcd1e8d8());
                this.f301092m.mo75956x3d5d1f78(fVar);
            }
            fVar.g(8, 2, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i2 i2Var = this.f301094o;
            if (i2Var != null) {
                fVar.i(9, i2Var.mo75928xcd1e8d8());
                this.f301094o.mo75956x3d5d1f78(fVar);
            }
            fVar.e(10, this.f301095p);
            fVar.e(11, this.f301096q);
            fVar.e(12, this.f301097r);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h hVar2 = this.f301086d;
            int i18 = (hVar2 != null ? 0 + b36.f.i(1, hVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f301087e) + b36.f.e(3, this.f301088f) + b36.f.e(4, this.f301089g) + b36.f.e(5, this.f301090h) + b36.f.e(6, this.f301091i);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m2 m2Var2 = this.f301092m;
            if (m2Var2 != null) {
                i18 += b36.f.i(7, m2Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(8, 2, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i2 i2Var2 = this.f301094o;
            if (i2Var2 != null) {
                g17 += b36.f.i(9, i2Var2.mo75928xcd1e8d8());
            }
            return g17 + b36.f.e(10, this.f301095p) + b36.f.e(11, this.f301096q) + b36.f.e(12, this.f301097r);
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
                    com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h hVar3 = new com.p314xaae8f345.p3133xd0ce8b26.iam.p3167x24d1a232.h();
                    if (bArr != null && bArr.length > 0) {
                        hVar3.mo11468x92b714fd(bArr);
                    }
                    this.f301086d = hVar3;
                }
                return 0;
            case 2:
                this.f301087e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f301088f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f301089g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f301090h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f301091i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m2 m2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.m2();
                    if (bArr2 != null && bArr2.length > 0) {
                        m2Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f301092m = m2Var3;
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
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i2 i2Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.i2();
                    if (bArr3 != null && bArr3.length > 0) {
                        i2Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f301094o = i2Var3;
                }
                return 0;
            case 10:
                this.f301095p = aVar2.g(intValue);
                return 0;
            case 11:
                this.f301096q = aVar2.g(intValue);
                return 0;
            case 12:
                this.f301097r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.j3) super.mo11468x92b714fd(bArr);
    }
}
