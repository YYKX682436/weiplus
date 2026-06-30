package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes11.dex */
public class i1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5 f299710e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f299709d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f299711f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f299712g = new boolean[4];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i1();
    }

    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5 b() {
        return this.f299712g[2] ? this.f299710e : new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i1 i1Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i1) fVar;
        return n51.f.a(this.f299709d, i1Var.f299709d) && n51.f.a(this.f299710e, i1Var.f299710e) && n51.f.a(this.f299711f, i1Var.f299711f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f299711f;
        java.util.LinkedList linkedList2 = this.f299709d;
        boolean[] zArr = this.f299712g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5 t5Var = this.f299710e;
            if (t5Var != null && zArr[2]) {
                fVar.i(2, t5Var.mo75928xcd1e8d8());
                this.f299710e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5 t5Var2 = this.f299710e;
            if (t5Var2 != null && zArr[2]) {
                g17 += b36.f.i(2, t5Var2.mo75928xcd1e8d8());
            }
            return g17 + b36.f.g(3, 8, linkedList);
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h1 h1Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h1();
                if (bArr != null && bArr.length > 0) {
                    h1Var.mo11468x92b714fd(bArr);
                }
                linkedList2.add(h1Var);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5 t5Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5();
                if (bArr2 != null && bArr2.length > 0) {
                    t5Var3.mo11468x92b714fd(bArr2);
                }
                this.f299710e = t5Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5 t5Var4 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t5();
            if (bArr3 != null && bArr3.length > 0) {
                t5Var4.mo11468x92b714fd(bArr3);
            }
            linkedList.add(t5Var4);
        }
        zArr[3] = true;
        return 0;
    }
}
