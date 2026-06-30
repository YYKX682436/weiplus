package r45;

/* loaded from: classes2.dex */
public class xt5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471933d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f471934e;

    /* renamed from: f, reason: collision with root package name */
    public r45.t35 f471935f;

    /* renamed from: g, reason: collision with root package name */
    public float f471936g;

    /* renamed from: h, reason: collision with root package name */
    public long f471937h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cg0 f471938i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xt5)) {
            return false;
        }
        r45.xt5 xt5Var = (r45.xt5) fVar;
        return n51.f.a(this.f471933d, xt5Var.f471933d) && n51.f.a(this.f471934e, xt5Var.f471934e) && n51.f.a(this.f471935f, xt5Var.f471935f) && n51.f.a(java.lang.Float.valueOf(this.f471936g), java.lang.Float.valueOf(xt5Var.f471936g)) && n51.f.a(java.lang.Long.valueOf(this.f471937h), java.lang.Long.valueOf(xt5Var.f471937h)) && n51.f.a(this.f471938i, xt5Var.f471938i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471933d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.rl6 rl6Var = this.f471934e;
            if (rl6Var != null) {
                fVar.i(2, rl6Var.mo75928xcd1e8d8());
                this.f471934e.mo75956x3d5d1f78(fVar);
            }
            r45.t35 t35Var = this.f471935f;
            if (t35Var != null) {
                fVar.i(3, t35Var.mo75928xcd1e8d8());
                this.f471935f.mo75956x3d5d1f78(fVar);
            }
            fVar.d(4, this.f471936g);
            fVar.h(5, this.f471937h);
            r45.cg0 cg0Var = this.f471938i;
            if (cg0Var != null) {
                fVar.i(8, cg0Var.mo75928xcd1e8d8());
                this.f471938i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f471933d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.rl6 rl6Var2 = this.f471934e;
            if (rl6Var2 != null) {
                j17 += b36.f.i(2, rl6Var2.mo75928xcd1e8d8());
            }
            r45.t35 t35Var2 = this.f471935f;
            if (t35Var2 != null) {
                j17 += b36.f.i(3, t35Var2.mo75928xcd1e8d8());
            }
            int d17 = j17 + b36.f.d(4, this.f471936g) + b36.f.h(5, this.f471937h);
            r45.cg0 cg0Var2 = this.f471938i;
            return cg0Var2 != null ? d17 + b36.f.i(8, cg0Var2.mo75928xcd1e8d8()) : d17;
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
        r45.xt5 xt5Var = (r45.xt5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xt5Var.f471933d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.rl6 rl6Var3 = new r45.rl6();
                if (bArr != null && bArr.length > 0) {
                    rl6Var3.mo11468x92b714fd(bArr);
                }
                xt5Var.f471934e = rl6Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j19.get(i19);
                r45.t35 t35Var3 = new r45.t35();
                if (bArr2 != null && bArr2.length > 0) {
                    t35Var3.mo11468x92b714fd(bArr2);
                }
                xt5Var.f471935f = t35Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            xt5Var.f471936g = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 5) {
            xt5Var.f471937h = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 8) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j27.get(i27);
            r45.cg0 cg0Var3 = new r45.cg0();
            if (bArr3 != null && bArr3.length > 0) {
                cg0Var3.mo11468x92b714fd(bArr3);
            }
            xt5Var.f471938i = cg0Var3;
        }
        return 0;
    }
}
