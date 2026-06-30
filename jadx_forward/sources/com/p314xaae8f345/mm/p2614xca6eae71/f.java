package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes2.dex */
public class f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f274781d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f274782e = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2614xca6eae71.f)) {
            return false;
        }
        com.p314xaae8f345.mm.p2614xca6eae71.f fVar2 = (com.p314xaae8f345.mm.p2614xca6eae71.f) fVar;
        return n51.f.a(this.f274781d, fVar2.f274781d) && n51.f.a(this.f274782e, fVar2.f274782e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f274782e;
        java.util.LinkedList linkedList2 = this.f274781d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(3, 8, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(3, 8, linkedList2) + 0 + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        com.p314xaae8f345.mm.p2614xca6eae71.f fVar2 = (com.p314xaae8f345.mm.p2614xca6eae71.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                com.p314xaae8f345.mm.p2614xca6eae71.d0 d0Var = new com.p314xaae8f345.mm.p2614xca6eae71.d0();
                if (bArr2 != null && bArr2.length > 0) {
                    d0Var.mo11468x92b714fd(bArr2);
                }
                fVar2.f274781d.add(d0Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            com.p314xaae8f345.mm.p2614xca6eae71.k kVar = new com.p314xaae8f345.mm.p2614xca6eae71.k();
            if (bArr3 != null && bArr3.length > 0) {
                kVar.mo11468x92b714fd(bArr3);
            }
            fVar2.f274782e.add(kVar);
        }
        return 0;
    }
}
