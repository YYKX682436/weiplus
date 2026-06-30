package r45;

/* loaded from: classes10.dex */
public class bx5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452665d;

    /* renamed from: e, reason: collision with root package name */
    public int f452666e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452667f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vm4 f452668g;

    /* renamed from: h, reason: collision with root package name */
    public r45.u2 f452669h;

    /* renamed from: i, reason: collision with root package name */
    public r45.nu3 f452670i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bx5)) {
            return false;
        }
        r45.bx5 bx5Var = (r45.bx5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452665d), java.lang.Integer.valueOf(bx5Var.f452665d)) && n51.f.a(java.lang.Integer.valueOf(this.f452666e), java.lang.Integer.valueOf(bx5Var.f452666e)) && n51.f.a(this.f452667f, bx5Var.f452667f) && n51.f.a(this.f452668g, bx5Var.f452668g) && n51.f.a(this.f452669h, bx5Var.f452669h) && n51.f.a(this.f452670i, bx5Var.f452670i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452665d);
            fVar.e(2, this.f452666e);
            java.lang.String str = this.f452667f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.vm4 vm4Var = this.f452668g;
            if (vm4Var != null) {
                fVar.i(4, vm4Var.mo75928xcd1e8d8());
                this.f452668g.mo75956x3d5d1f78(fVar);
            }
            r45.u2 u2Var = this.f452669h;
            if (u2Var != null) {
                fVar.i(5, u2Var.mo75928xcd1e8d8());
                this.f452669h.mo75956x3d5d1f78(fVar);
            }
            r45.nu3 nu3Var = this.f452670i;
            if (nu3Var != null) {
                fVar.i(6, nu3Var.mo75928xcd1e8d8());
                this.f452670i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452665d) + 0 + b36.f.e(2, this.f452666e);
            java.lang.String str2 = this.f452667f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            r45.vm4 vm4Var2 = this.f452668g;
            if (vm4Var2 != null) {
                e17 += b36.f.i(4, vm4Var2.mo75928xcd1e8d8());
            }
            r45.u2 u2Var2 = this.f452669h;
            if (u2Var2 != null) {
                e17 += b36.f.i(5, u2Var2.mo75928xcd1e8d8());
            }
            r45.nu3 nu3Var2 = this.f452670i;
            return nu3Var2 != null ? e17 + b36.f.i(6, nu3Var2.mo75928xcd1e8d8()) : e17;
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
        r45.bx5 bx5Var = (r45.bx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bx5Var.f452665d = aVar2.g(intValue);
                return 0;
            case 2:
                bx5Var.f452666e = aVar2.g(intValue);
                return 0;
            case 3:
                bx5Var.f452667f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.vm4 vm4Var3 = new r45.vm4();
                    if (bArr != null && bArr.length > 0) {
                        vm4Var3.mo11468x92b714fd(bArr);
                    }
                    bx5Var.f452668g = vm4Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.u2 u2Var3 = new r45.u2();
                    if (bArr2 != null && bArr2.length > 0) {
                        u2Var3.mo11468x92b714fd(bArr2);
                    }
                    bx5Var.f452669h = u2Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.nu3 nu3Var3 = new r45.nu3();
                    if (bArr3 != null && bArr3.length > 0) {
                        nu3Var3.mo11468x92b714fd(bArr3);
                    }
                    bx5Var.f452670i = nu3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
