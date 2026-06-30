package r45;

/* loaded from: classes12.dex */
public class kp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f460421d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f460422e = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kp0)) {
            return false;
        }
        r45.kp0 kp0Var = (r45.kp0) fVar;
        return n51.f.a(this.f460421d, kp0Var.f460421d) && n51.f.a(this.f460422e, kp0Var.f460422e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f460421d);
            fVar.g(2, 8, this.f460422e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f460421d) + 0 + b36.f.g(2, 8, this.f460422e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f460421d.clear();
            this.f460422e.clear();
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
        r45.kp0 kp0Var = (r45.kp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.bo4 bo4Var = new r45.bo4();
                if (bArr2 != null && bArr2.length > 0) {
                    bo4Var.mo11468x92b714fd(bArr2);
                }
                kp0Var.f460421d.add(bo4Var);
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
            r45.eo4 eo4Var = new r45.eo4();
            if (bArr3 != null && bArr3.length > 0) {
                eo4Var.mo11468x92b714fd(bArr3);
            }
            kp0Var.f460422e.add(eo4Var);
        }
        return 0;
    }
}
