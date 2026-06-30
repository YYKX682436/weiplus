package r45;

/* loaded from: classes8.dex */
public class y83 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f472387d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f472388e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f472389f;

    /* renamed from: g, reason: collision with root package name */
    public int f472390g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y83)) {
            return false;
        }
        r45.y83 y83Var = (r45.y83) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f472387d), java.lang.Integer.valueOf(y83Var.f472387d)) && n51.f.a(this.f472388e, y83Var.f472388e) && n51.f.a(java.lang.Integer.valueOf(this.f472389f), java.lang.Integer.valueOf(y83Var.f472389f)) && n51.f.a(java.lang.Integer.valueOf(this.f472390g), java.lang.Integer.valueOf(y83Var.f472390g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f472387d);
            fVar.g(2, 8, this.f472388e);
            fVar.e(3, this.f472389f);
            fVar.e(4, this.f472390g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f472387d) + 0 + b36.f.g(2, 8, this.f472388e) + b36.f.e(3, this.f472389f) + b36.f.e(4, this.f472390g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f472388e.clear();
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
        r45.y83 y83Var = (r45.y83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y83Var.f472387d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                y83Var.f472389f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            y83Var.f472390g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.zl0 zl0Var = new r45.zl0();
            if (bArr2 != null && bArr2.length > 0) {
                zl0Var.mo11468x92b714fd(bArr2);
            }
            y83Var.f472388e.add(zl0Var);
        }
        return 0;
    }
}
