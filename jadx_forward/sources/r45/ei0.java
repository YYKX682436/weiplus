package r45;

/* loaded from: classes10.dex */
public class ei0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f455062d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f455063e = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ei0)) {
            return false;
        }
        r45.ei0 ei0Var = (r45.ei0) fVar;
        return n51.f.a(this.f455062d, ei0Var.f455062d) && n51.f.a(this.f455063e, ei0Var.f455063e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f455062d);
            fVar.g(2, 8, this.f455063e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f455062d) + 0 + b36.f.g(2, 8, this.f455063e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f455062d.clear();
            this.f455063e.clear();
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
        r45.ei0 ei0Var = (r45.ei0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ji0 ji0Var = new r45.ji0();
                if (bArr2 != null && bArr2.length > 0) {
                    ji0Var.mo11468x92b714fd(bArr2);
                }
                ei0Var.f455062d.add(ji0Var);
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
            r45.gi0 gi0Var = new r45.gi0();
            if (bArr3 != null && bArr3.length > 0) {
                gi0Var.mo11468x92b714fd(bArr3);
            }
            ei0Var.f455063e.add(gi0Var);
        }
        return 0;
    }
}
