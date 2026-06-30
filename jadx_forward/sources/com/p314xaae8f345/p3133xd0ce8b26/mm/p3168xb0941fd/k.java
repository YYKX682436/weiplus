package com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd;

/* loaded from: classes11.dex */
public class k extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k f300530h = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f300531d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f300532e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f300533f = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k1 f300534g = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k1();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k kVar = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k) fVar;
        return n51.f.a(this.f300531d, kVar.f300531d) && n51.f.a(java.lang.Boolean.valueOf(this.f300532e), java.lang.Boolean.valueOf(kVar.f300532e)) && n51.f.a(java.lang.Integer.valueOf(this.f300533f), java.lang.Integer.valueOf(kVar.f300533f)) && n51.f.a(this.f300534g, kVar.f300534g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f300531d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.a(2, this.f300532e);
            fVar.e(3, this.f300533f);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k1 k1Var = this.f300534g;
            if (k1Var != null) {
                fVar.i(4, k1Var.mo75928xcd1e8d8());
                this.f300534g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.a(2, this.f300532e) + b36.f.e(3, this.f300533f);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k1 k1Var2 = this.f300534g;
            return k1Var2 != null ? g17 + b36.f.i(4, k1Var2.mo75928xcd1e8d8()) : g17;
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
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j();
                if (bArr != null && bArr.length > 0) {
                    jVar.mo11468x92b714fd(bArr);
                }
                linkedList.add(jVar);
            }
            return 0;
        }
        if (intValue == 2) {
            this.f300532e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f300533f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k1 k1Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k1();
            if (bArr2 != null && bArr2.length > 0) {
                k1Var3.mo11468x92b714fd(bArr2);
            }
            this.f300534g = k1Var3;
        }
        return 0;
    }
}
