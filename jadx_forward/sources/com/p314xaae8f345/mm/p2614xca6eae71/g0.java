package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes9.dex */
public class g0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f274789d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f274790e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f274791f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p2614xca6eae71.g0)) {
            return false;
        }
        com.p314xaae8f345.mm.p2614xca6eae71.g0 g0Var = (com.p314xaae8f345.mm.p2614xca6eae71.g0) fVar;
        return n51.f.a(this.f274789d, g0Var.f274789d) && n51.f.a(this.f274790e, g0Var.f274790e) && n51.f.a(this.f274791f, g0Var.f274791f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f274789d);
            fVar.g(2, 8, this.f274790e);
            fVar.g(3, 8, this.f274791f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f274789d) + 0 + b36.f.g(2, 8, this.f274790e) + b36.f.g(3, 8, this.f274791f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f274789d.clear();
            this.f274790e.clear();
            this.f274791f.clear();
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
        com.p314xaae8f345.mm.p2614xca6eae71.g0 g0Var = (com.p314xaae8f345.mm.p2614xca6eae71.g0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                com.p314xaae8f345.mm.p2614xca6eae71.c cVar = new com.p314xaae8f345.mm.p2614xca6eae71.c();
                if (bArr2 != null && bArr2.length > 0) {
                    cVar.mo11468x92b714fd(bArr2);
                }
                g0Var.f274789d.add(cVar);
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                com.p314xaae8f345.mm.p2614xca6eae71.a2 a2Var = new com.p314xaae8f345.mm.p2614xca6eae71.a2();
                if (bArr3 != null && bArr3.length > 0) {
                    a2Var.mo11468x92b714fd(bArr3);
                }
                g0Var.f274790e.add(a2Var);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            com.p314xaae8f345.mm.p2614xca6eae71.f1 f1Var = new com.p314xaae8f345.mm.p2614xca6eae71.f1();
            if (bArr4 != null && bArr4.length > 0) {
                f1Var.mo11468x92b714fd(bArr4);
            }
            g0Var.f274791f.add(f1Var);
        }
        return 0;
    }
}
