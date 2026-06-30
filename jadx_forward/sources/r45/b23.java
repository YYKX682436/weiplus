package r45;

/* loaded from: classes2.dex */
public class b23 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f451982d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451983e;

    /* renamed from: f, reason: collision with root package name */
    public int f451984f;

    /* renamed from: g, reason: collision with root package name */
    public r45.sd1 f451985g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b23)) {
            return false;
        }
        r45.b23 b23Var = (r45.b23) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f451982d), java.lang.Integer.valueOf(b23Var.f451982d)) && n51.f.a(this.f451983e, b23Var.f451983e) && n51.f.a(java.lang.Integer.valueOf(this.f451984f), java.lang.Integer.valueOf(b23Var.f451984f)) && n51.f.a(this.f451985g, b23Var.f451985g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f451982d);
            java.lang.String str = this.f451983e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f451984f);
            r45.sd1 sd1Var = this.f451985g;
            if (sd1Var != null) {
                fVar.i(4, sd1Var.mo75928xcd1e8d8());
                this.f451985g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f451982d) + 0;
            java.lang.String str2 = this.f451983e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            int e18 = e17 + b36.f.e(3, this.f451984f);
            r45.sd1 sd1Var2 = this.f451985g;
            return sd1Var2 != null ? e18 + b36.f.i(4, sd1Var2.mo75928xcd1e8d8()) : e18;
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
        r45.b23 b23Var = (r45.b23) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            b23Var.f451982d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            b23Var.f451983e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            b23Var.f451984f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.sd1 sd1Var3 = new r45.sd1();
            if (bArr != null && bArr.length > 0) {
                sd1Var3.mo11468x92b714fd(bArr);
            }
            b23Var.f451985g = sd1Var3;
        }
        return 0;
    }
}
