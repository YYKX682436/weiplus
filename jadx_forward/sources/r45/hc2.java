package r45;

/* loaded from: classes9.dex */
public class hc2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457568d;

    /* renamed from: e, reason: collision with root package name */
    public long f457569e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f457570f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.qx1 f457571g;

    /* renamed from: h, reason: collision with root package name */
    public int f457572h;

    /* renamed from: i, reason: collision with root package name */
    public int f457573i;

    /* renamed from: m, reason: collision with root package name */
    public int f457574m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hc2)) {
            return false;
        }
        r45.hc2 hc2Var = (r45.hc2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457568d), java.lang.Integer.valueOf(hc2Var.f457568d)) && n51.f.a(java.lang.Long.valueOf(this.f457569e), java.lang.Long.valueOf(hc2Var.f457569e)) && n51.f.a(this.f457570f, hc2Var.f457570f) && n51.f.a(this.f457571g, hc2Var.f457571g) && n51.f.a(java.lang.Integer.valueOf(this.f457572h), java.lang.Integer.valueOf(hc2Var.f457572h)) && n51.f.a(java.lang.Integer.valueOf(this.f457573i), java.lang.Integer.valueOf(hc2Var.f457573i)) && n51.f.a(java.lang.Integer.valueOf(this.f457574m), java.lang.Integer.valueOf(hc2Var.f457574m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457570f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457568d);
            fVar.h(2, this.f457569e);
            fVar.g(3, 8, linkedList);
            r45.qx1 qx1Var = this.f457571g;
            if (qx1Var != null) {
                fVar.i(4, qx1Var.mo75928xcd1e8d8());
                this.f457571g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f457572h);
            fVar.e(6, this.f457573i);
            fVar.e(7, this.f457574m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457568d) + 0 + b36.f.h(2, this.f457569e) + b36.f.g(3, 8, linkedList);
            r45.qx1 qx1Var2 = this.f457571g;
            if (qx1Var2 != null) {
                e17 += b36.f.i(4, qx1Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(5, this.f457572h) + b36.f.e(6, this.f457573i) + b36.f.e(7, this.f457574m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.hc2 hc2Var = (r45.hc2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hc2Var.f457568d = aVar2.g(intValue);
                return 0;
            case 2:
                hc2Var.f457569e = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.yx1 yx1Var = new r45.yx1();
                    if (bArr2 != null && bArr2.length > 0) {
                        yx1Var.mo11468x92b714fd(bArr2);
                    }
                    hc2Var.f457570f.add(yx1Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.qx1 qx1Var3 = new r45.qx1();
                    if (bArr3 != null && bArr3.length > 0) {
                        qx1Var3.mo11468x92b714fd(bArr3);
                    }
                    hc2Var.f457571g = qx1Var3;
                }
                return 0;
            case 5:
                hc2Var.f457572h = aVar2.g(intValue);
                return 0;
            case 6:
                hc2Var.f457573i = aVar2.g(intValue);
                return 0;
            case 7:
                hc2Var.f457574m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
