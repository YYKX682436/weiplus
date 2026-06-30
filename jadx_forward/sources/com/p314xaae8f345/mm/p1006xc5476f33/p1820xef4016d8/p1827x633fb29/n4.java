package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class n4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f227004d;

    /* renamed from: e, reason: collision with root package name */
    public long f227005e;

    /* renamed from: f, reason: collision with root package name */
    public int f227006f;

    /* renamed from: g, reason: collision with root package name */
    public long f227007g;

    /* renamed from: h, reason: collision with root package name */
    public int f227008h;

    /* renamed from: i, reason: collision with root package name */
    public int f227009i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f227010m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n4)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n4 n4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f227004d), java.lang.Integer.valueOf(n4Var.f227004d)) && n51.f.a(java.lang.Long.valueOf(this.f227005e), java.lang.Long.valueOf(n4Var.f227005e)) && n51.f.a(java.lang.Integer.valueOf(this.f227006f), java.lang.Integer.valueOf(n4Var.f227006f)) && n51.f.a(java.lang.Long.valueOf(this.f227007g), java.lang.Long.valueOf(n4Var.f227007g)) && n51.f.a(java.lang.Integer.valueOf(this.f227008h), java.lang.Integer.valueOf(n4Var.f227008h)) && n51.f.a(java.lang.Integer.valueOf(this.f227009i), java.lang.Integer.valueOf(n4Var.f227009i)) && n51.f.a(this.f227010m, n4Var.f227010m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f227004d);
            fVar.h(2, this.f227005e);
            fVar.e(3, this.f227006f);
            fVar.h(4, this.f227007g);
            fVar.e(5, this.f227008h);
            fVar.e(6, this.f227009i);
            fVar.g(7, 8, this.f227010m);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f227004d) + 0 + b36.f.h(2, this.f227005e) + b36.f.e(3, this.f227006f) + b36.f.h(4, this.f227007g) + b36.f.e(5, this.f227008h) + b36.f.e(6, this.f227009i) + b36.f.g(7, 8, this.f227010m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f227010m.clear();
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n4 n4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n4Var.f227004d = aVar2.g(intValue);
                return 0;
            case 2:
                n4Var.f227005e = aVar2.i(intValue);
                return 0;
            case 3:
                n4Var.f227006f = aVar2.g(intValue);
                return 0;
            case 4:
                n4Var.f227007g = aVar2.i(intValue);
                return 0;
            case 5:
                n4Var.f227008h = aVar2.g(intValue);
                return 0;
            case 6:
                n4Var.f227009i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o4 o4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.o4();
                    if (bArr2 != null && bArr2.length > 0) {
                        o4Var.mo11468x92b714fd(bArr2);
                    }
                    n4Var.f227010m.add(o4Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
