package r45;

/* loaded from: classes8.dex */
public class uc3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f468744d;

    /* renamed from: e, reason: collision with root package name */
    public int f468745e;

    /* renamed from: f, reason: collision with root package name */
    public int f468746f;

    /* renamed from: g, reason: collision with root package name */
    public int f468747g;

    /* renamed from: h, reason: collision with root package name */
    public int f468748h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f468749i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uc3)) {
            return false;
        }
        r45.uc3 uc3Var = (r45.uc3) fVar;
        return n51.f.a(this.f468744d, uc3Var.f468744d) && n51.f.a(java.lang.Integer.valueOf(this.f468745e), java.lang.Integer.valueOf(uc3Var.f468745e)) && n51.f.a(java.lang.Integer.valueOf(this.f468746f), java.lang.Integer.valueOf(uc3Var.f468746f)) && n51.f.a(java.lang.Integer.valueOf(this.f468747g), java.lang.Integer.valueOf(uc3Var.f468747g)) && n51.f.a(java.lang.Integer.valueOf(this.f468748h), java.lang.Integer.valueOf(uc3Var.f468748h)) && n51.f.a(java.lang.Integer.valueOf(this.f468749i), java.lang.Integer.valueOf(uc3Var.f468749i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f468744d;
            if (du5Var != null) {
                fVar.i(1, du5Var.mo75928xcd1e8d8());
                this.f468744d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f468745e);
            fVar.e(3, this.f468746f);
            fVar.e(4, this.f468747g);
            fVar.e(5, this.f468748h);
            fVar.e(6, this.f468749i);
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var2 = this.f468744d;
            return (du5Var2 != null ? 0 + b36.f.i(1, du5Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f468745e) + b36.f.e(3, this.f468746f) + b36.f.e(4, this.f468747g) + b36.f.e(5, this.f468748h) + b36.f.e(6, this.f468749i);
        }
        if (i17 == 2) {
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
        r45.uc3 uc3Var = (r45.uc3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var3.b(bArr);
                    }
                    uc3Var.f468744d = du5Var3;
                }
                return 0;
            case 2:
                uc3Var.f468745e = aVar2.g(intValue);
                return 0;
            case 3:
                uc3Var.f468746f = aVar2.g(intValue);
                return 0;
            case 4:
                uc3Var.f468747g = aVar2.g(intValue);
                return 0;
            case 5:
                uc3Var.f468748h = aVar2.g(intValue);
                return 0;
            case 6:
                uc3Var.f468749i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
