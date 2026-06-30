package m53;

/* loaded from: classes8.dex */
public class i3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f405320d;

    /* renamed from: e, reason: collision with root package name */
    public int f405321e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405322f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405323g;

    /* renamed from: h, reason: collision with root package name */
    public m53.p3 f405324h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.i3)) {
            return false;
        }
        m53.i3 i3Var = (m53.i3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f405320d), java.lang.Integer.valueOf(i3Var.f405320d)) && n51.f.a(java.lang.Integer.valueOf(this.f405321e), java.lang.Integer.valueOf(i3Var.f405321e)) && n51.f.a(this.f405322f, i3Var.f405322f) && n51.f.a(this.f405323g, i3Var.f405323g) && n51.f.a(this.f405324h, i3Var.f405324h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f405320d);
            fVar.e(2, this.f405321e);
            java.lang.String str = this.f405322f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f405323g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            m53.p3 p3Var = this.f405324h;
            if (p3Var != null) {
                fVar.i(5, p3Var.mo75928xcd1e8d8());
                this.f405324h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f405320d) + 0 + b36.f.e(2, this.f405321e);
            java.lang.String str3 = this.f405322f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f405323g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            m53.p3 p3Var2 = this.f405324h;
            return p3Var2 != null ? e17 + b36.f.i(5, p3Var2.mo75928xcd1e8d8()) : e17;
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
        m53.i3 i3Var = (m53.i3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i3Var.f405320d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            i3Var.f405321e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            i3Var.f405322f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            i3Var.f405323g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.p3 p3Var3 = new m53.p3();
            if (bArr != null && bArr.length > 0) {
                p3Var3.mo11468x92b714fd(bArr);
            }
            i3Var.f405324h = p3Var3;
        }
        return 0;
    }
}
