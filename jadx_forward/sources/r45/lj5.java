package r45;

/* loaded from: classes9.dex */
public class lj5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461056d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461057e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461058f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461059g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461060h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461061i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lj5)) {
            return false;
        }
        r45.lj5 lj5Var = (r45.lj5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461056d), java.lang.Integer.valueOf(lj5Var.f461056d)) && n51.f.a(this.f461057e, lj5Var.f461057e) && n51.f.a(this.f461058f, lj5Var.f461058f) && n51.f.a(this.f461059g, lj5Var.f461059g) && n51.f.a(this.f461060h, lj5Var.f461060h) && n51.f.a(this.f461061i, lj5Var.f461061i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461056d);
            java.lang.String str = this.f461057e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f461058f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f461059g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f461060h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f461061i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461056d) + 0;
            java.lang.String str6 = this.f461057e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f461058f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f461059g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f461060h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f461061i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        r45.lj5 lj5Var = (r45.lj5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lj5Var.f461056d = aVar2.g(intValue);
                return 0;
            case 2:
                lj5Var.f461057e = aVar2.k(intValue);
                return 0;
            case 3:
                lj5Var.f461058f = aVar2.k(intValue);
                return 0;
            case 4:
                lj5Var.f461059g = aVar2.k(intValue);
                return 0;
            case 5:
                lj5Var.f461060h = aVar2.k(intValue);
                return 0;
            case 6:
                lj5Var.f461061i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
