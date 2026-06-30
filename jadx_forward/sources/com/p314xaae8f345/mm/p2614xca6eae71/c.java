package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f274756d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2614xca6eae71.g1 f274757e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2614xca6eae71.c)) {
            return false;
        }
        com.p314xaae8f345.mm.p2614xca6eae71.c cVar = (com.p314xaae8f345.mm.p2614xca6eae71.c) fVar;
        return n51.f.a(this.f274756d, cVar.f274756d) && n51.f.a(this.f274757e, cVar.f274757e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f274756d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 2, linkedList);
            com.p314xaae8f345.mm.p2614xca6eae71.g1 g1Var = this.f274757e;
            if (g1Var != null) {
                fVar.i(2, g1Var.mo75928xcd1e8d8());
                this.f274757e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 2, linkedList) + 0;
            com.p314xaae8f345.mm.p2614xca6eae71.g1 g1Var2 = this.f274757e;
            return g1Var2 != null ? g17 + b36.f.i(2, g1Var2.mo75928xcd1e8d8()) : g17;
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
        com.p314xaae8f345.mm.p2614xca6eae71.c cVar = (com.p314xaae8f345.mm.p2614xca6eae71.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cVar.f274756d.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.p314xaae8f345.mm.p2614xca6eae71.g1 g1Var3 = new com.p314xaae8f345.mm.p2614xca6eae71.g1();
            if (bArr2 != null && bArr2.length > 0) {
                g1Var3.mo11468x92b714fd(bArr2);
            }
            cVar.f274757e = g1Var3;
        }
        return 0;
    }
}
