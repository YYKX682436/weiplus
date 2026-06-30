package r45;

/* loaded from: classes7.dex */
public class ze5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f473486d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473487e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473488f;

    /* renamed from: g, reason: collision with root package name */
    public int f473489g;

    /* renamed from: h, reason: collision with root package name */
    public int f473490h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f473491i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f473492m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ze5)) {
            return false;
        }
        r45.ze5 ze5Var = (r45.ze5) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f473486d), java.lang.Boolean.valueOf(ze5Var.f473486d)) && n51.f.a(this.f473487e, ze5Var.f473487e) && n51.f.a(this.f473488f, ze5Var.f473488f) && n51.f.a(java.lang.Integer.valueOf(this.f473489g), java.lang.Integer.valueOf(ze5Var.f473489g)) && n51.f.a(java.lang.Integer.valueOf(this.f473490h), java.lang.Integer.valueOf(ze5Var.f473490h)) && n51.f.a(this.f473491i, ze5Var.f473491i) && n51.f.a(java.lang.Boolean.valueOf(this.f473492m), java.lang.Boolean.valueOf(ze5Var.f473492m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f473486d);
            java.lang.String str = this.f473487e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f473488f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f473489g);
            fVar.e(5, this.f473490h);
            java.lang.String str3 = this.f473491i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.a(7, this.f473492m);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f473486d) + 0;
            java.lang.String str4 = this.f473487e;
            if (str4 != null) {
                a17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f473488f;
            if (str5 != null) {
                a17 += b36.f.j(3, str5);
            }
            int e17 = a17 + b36.f.e(4, this.f473489g) + b36.f.e(5, this.f473490h);
            java.lang.String str6 = this.f473491i;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            return e17 + b36.f.a(7, this.f473492m);
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
        r45.ze5 ze5Var = (r45.ze5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ze5Var.f473486d = aVar2.c(intValue);
                return 0;
            case 2:
                ze5Var.f473487e = aVar2.k(intValue);
                return 0;
            case 3:
                ze5Var.f473488f = aVar2.k(intValue);
                return 0;
            case 4:
                ze5Var.f473489g = aVar2.g(intValue);
                return 0;
            case 5:
                ze5Var.f473490h = aVar2.g(intValue);
                return 0;
            case 6:
                ze5Var.f473491i = aVar2.k(intValue);
                return 0;
            case 7:
                ze5Var.f473492m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
