package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class t4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f300175d;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k4 f300177f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f300178g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s4 f300179h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f300176e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f300180i = new boolean[6];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t4 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t4)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t4 t4Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f300175d), java.lang.Integer.valueOf(t4Var.f300175d)) && n51.f.a(this.f300176e, t4Var.f300176e) && n51.f.a(this.f300177f, t4Var.f300177f) && n51.f.a(this.f300178g, t4Var.f300178g) && n51.f.a(this.f300179h, t4Var.f300179h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f300176e;
        boolean[] zArr = this.f300180i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f300175d);
            }
            fVar.g(2, 8, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k4 k4Var = this.f300177f;
            if (k4Var != null && zArr[3]) {
                fVar.i(3, k4Var.mo75928xcd1e8d8());
                this.f300177f.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f300178g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s4 s4Var = this.f300179h;
            if (s4Var != null && zArr[5]) {
                fVar.e(5, s4Var.f300154d);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f300175d) : 0) + b36.f.g(2, 8, linkedList);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k4 k4Var2 = this.f300177f;
            if (k4Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, k4Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f300178g;
            if (gVar2 != null && zArr[4]) {
                e17 += b36.f.b(4, gVar2);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s4 s4Var2 = this.f300179h;
            return (s4Var2 == null || !zArr[5]) ? e17 : e17 + b36.f.e(5, s4Var2.f300154d);
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
            this.f300175d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h4 h4Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h4();
                if (bArr != null && bArr.length > 0) {
                    h4Var.mo11468x92b714fd(bArr);
                }
                linkedList.add(h4Var);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f300178g = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            int g17 = aVar2.g(intValue);
            this.f300179h = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s4.FinderShowType_FINDER_RECOMMEND_HORIZON : com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s4.FinderShowType_FINDER_NORMAL : com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s4.FinderShowType_DEFAULT;
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k4 k4Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.k4();
            if (bArr2 != null && bArr2.length > 0) {
                k4Var3.mo11468x92b714fd(bArr2);
            }
            this.f300177f = k4Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
