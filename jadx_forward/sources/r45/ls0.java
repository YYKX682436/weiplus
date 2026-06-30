package r45;

/* loaded from: classes4.dex */
public class ls0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461330d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f461331e = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ls0)) {
            return false;
        }
        r45.ls0 ls0Var = (r45.ls0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461330d), java.lang.Integer.valueOf(ls0Var.f461330d)) && n51.f.a(this.f461331e, ls0Var.f461331e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461330d);
            fVar.g(2, 8, this.f461331e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f461330d) + 0 + b36.f.g(2, 8, this.f461331e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f461331e.clear();
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
        r45.ls0 ls0Var = (r45.ls0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ls0Var.f461330d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.os0 os0Var = new r45.os0();
            if (bArr2 != null && bArr2.length > 0) {
                os0Var.mo11468x92b714fd(bArr2);
            }
            ls0Var.f461331e.add(os0Var);
        }
        return 0;
    }
}
