package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class g1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g1 f299598i = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g1();

    /* renamed from: e, reason: collision with root package name */
    public boolean f299600e;

    /* renamed from: f, reason: collision with root package name */
    public int f299601f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o5 f299602g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f299599d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f299603h = new boolean[5];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g1 g1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g1) fVar;
        return n51.f.a(this.f299599d, g1Var.f299599d) && n51.f.a(java.lang.Boolean.valueOf(this.f299600e), java.lang.Boolean.valueOf(g1Var.f299600e)) && n51.f.a(java.lang.Integer.valueOf(this.f299601f), java.lang.Integer.valueOf(g1Var.f299601f)) && n51.f.a(this.f299602g, g1Var.f299602g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f299599d;
        boolean[] zArr = this.f299603h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.a(2, this.f299600e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f299601f);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o5 o5Var = this.f299602g;
            if (o5Var != null && zArr[4]) {
                fVar.i(4, o5Var.mo75928xcd1e8d8());
                this.f299602g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.a(2, this.f299600e);
            }
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f299601f);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o5 o5Var2 = this.f299602g;
            return (o5Var2 == null || !zArr[4]) ? g17 : g17 + b36.f.i(4, o5Var2.mo75928xcd1e8d8());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f1 f1Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f1();
                if (bArr != null && bArr.length > 0) {
                    f1Var.mo11468x92b714fd(bArr);
                }
                linkedList.add(f1Var);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f299600e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f299601f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o5 o5Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o5();
            if (bArr2 != null && bArr2.length > 0) {
                o5Var3.mo11468x92b714fd(bArr2);
            }
            this.f299602g = o5Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g1) super.mo11468x92b714fd(bArr);
    }
}
