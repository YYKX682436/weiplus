package com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd;

/* loaded from: classes2.dex */
public class c1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f300395d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f300396e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.a1 f300397f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f300398g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.b1 f300399h;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c1 c1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f300395d), java.lang.Integer.valueOf(c1Var.f300395d)) && n51.f.a(this.f300396e, c1Var.f300396e) && n51.f.a(this.f300397f, c1Var.f300397f) && n51.f.a(this.f300398g, c1Var.f300398g) && n51.f.a(this.f300399h, c1Var.f300399h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f300396e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f300395d);
            fVar.g(2, 8, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.a1 a1Var = this.f300397f;
            if (a1Var != null) {
                fVar.i(3, a1Var.mo75928xcd1e8d8());
                this.f300397f.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f300398g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.b1 b1Var = this.f300399h;
            if (b1Var != null) {
                fVar.e(5, b1Var.f300389d);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f300395d) + 0 + b36.f.g(2, 8, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.a1 a1Var2 = this.f300397f;
            if (a1Var2 != null) {
                e17 += b36.f.i(3, a1Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f300398g;
            if (gVar2 != null) {
                e17 += b36.f.b(4, gVar2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.b1 b1Var2 = this.f300399h;
            return b1Var2 != null ? e17 + b36.f.e(5, b1Var2.f300389d) : e17;
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
        if (intValue == 1) {
            this.f300395d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x0 x0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.x0();
                if (bArr != null && bArr.length > 0) {
                    x0Var.mo11468x92b714fd(bArr);
                }
                linkedList.add(x0Var);
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f300398g = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            int g17 = aVar2.g(intValue);
            this.f300399h = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.b1.FinderShowType_FINDER_RECOMMEND_HORIZON : com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.b1.FinderShowType_FINDER_NORMAL : com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.b1.FinderShowType_DEFAULT;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.a1 a1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.a1();
            if (bArr2 != null && bArr2.length > 0) {
                a1Var3.mo11468x92b714fd(bArr2);
            }
            this.f300397f = a1Var3;
        }
        return 0;
    }
}
