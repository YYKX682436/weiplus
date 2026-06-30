package r45;

/* loaded from: classes9.dex */
public class sx3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f467537d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467538e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467539f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467540g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467541h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sx3)) {
            return false;
        }
        r45.sx3 sx3Var = (r45.sx3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f467537d), java.lang.Integer.valueOf(sx3Var.f467537d)) && n51.f.a(this.f467538e, sx3Var.f467538e) && n51.f.a(this.f467539f, sx3Var.f467539f) && n51.f.a(this.f467540g, sx3Var.f467540g) && n51.f.a(this.f467541h, sx3Var.f467541h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f467537d);
            java.lang.String str = this.f467538e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f467539f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f467540g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f467541h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f467537d) + 0;
            java.lang.String str5 = this.f467538e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f467539f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f467540g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f467541h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        r45.sx3 sx3Var = (r45.sx3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sx3Var.f467537d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            sx3Var.f467538e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            sx3Var.f467539f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            sx3Var.f467540g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        sx3Var.f467541h = aVar2.k(intValue);
        return 0;
    }
}
