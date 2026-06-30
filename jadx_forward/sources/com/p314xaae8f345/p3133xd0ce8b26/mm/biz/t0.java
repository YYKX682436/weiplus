package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes2.dex */
public class t0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n0 f300163d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f300165f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f300164e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f300166g = new boolean[7];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t0 t0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t0) fVar;
        return n51.f.a(this.f300163d, t0Var.f300163d) && n51.f.a(this.f300164e, t0Var.f300164e) && n51.f.a(this.f300165f, t0Var.f300165f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.t0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f300164e;
        boolean[] zArr = this.f300166g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n0 n0Var = this.f300163d;
            if (n0Var != null && zArr[1]) {
                fVar.i(1, n0Var.mo75928xcd1e8d8());
                this.f300163d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f300165f;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n0 n0Var2 = this.f300163d;
            if (n0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, n0Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f300165f;
            return (str2 == null || !zArr[6]) ? g17 : g17 + b36.f.j(6, str2);
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
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n0 n0Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.n0();
                if (bArr != null && bArr.length > 0) {
                    n0Var3.mo11468x92b714fd(bArr);
                }
                this.f300163d = n0Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 6) {
                return -1;
            }
            this.f300165f = aVar2.k(intValue);
            zArr[6] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s0 s0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s0();
            if (bArr2 != null && bArr2.length > 0) {
                s0Var.mo11468x92b714fd(bArr2);
            }
            linkedList.add(s0Var);
        }
        zArr[2] = true;
        return 0;
    }
}
