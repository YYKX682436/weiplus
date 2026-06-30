package r45;

/* loaded from: classes2.dex */
public class sj2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.qb1 f467308d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f467309e = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sj2)) {
            return false;
        }
        r45.sj2 sj2Var = (r45.sj2) fVar;
        return n51.f.a(this.f467308d, sj2Var.f467308d) && n51.f.a(this.f467309e, sj2Var.f467309e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467309e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.qb1 qb1Var = this.f467308d;
            if (qb1Var != null) {
                fVar.i(1, qb1Var.mo75928xcd1e8d8());
                this.f467308d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.qb1 qb1Var2 = this.f467308d;
            return (qb1Var2 != null ? 0 + b36.f.i(1, qb1Var2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList);
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
        r45.sj2 sj2Var = (r45.sj2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.qb1 qb1Var3 = new r45.qb1();
                if (bArr2 != null && bArr2.length > 0) {
                    qb1Var3.mo11468x92b714fd(bArr2);
                }
                sj2Var.f467308d = qb1Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.qj2 qj2Var = new r45.qj2();
            if (bArr3 != null && bArr3.length > 0) {
                qj2Var.mo11468x92b714fd(bArr3);
            }
            sj2Var.f467309e.add(qj2Var);
        }
        return 0;
    }
}
