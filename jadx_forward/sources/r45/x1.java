package r45;

/* loaded from: classes15.dex */
public class x1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f471156d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f471157e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f471158f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f471159g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471160h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471161i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471162m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f471163n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f471164o = -1;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f471165p = "";

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x1)) {
            return false;
        }
        r45.x1 x1Var = (r45.x1) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f471156d), java.lang.Boolean.valueOf(x1Var.f471156d)) && n51.f.a(java.lang.Boolean.valueOf(this.f471157e), java.lang.Boolean.valueOf(x1Var.f471157e)) && n51.f.a(java.lang.Boolean.valueOf(this.f471158f), java.lang.Boolean.valueOf(x1Var.f471158f)) && n51.f.a(java.lang.Boolean.valueOf(this.f471159g), java.lang.Boolean.valueOf(x1Var.f471159g)) && n51.f.a(this.f471160h, x1Var.f471160h) && n51.f.a(this.f471161i, x1Var.f471161i) && n51.f.a(this.f471162m, x1Var.f471162m) && n51.f.a(this.f471163n, x1Var.f471163n) && n51.f.a(java.lang.Integer.valueOf(this.f471164o), java.lang.Integer.valueOf(x1Var.f471164o)) && n51.f.a(this.f471165p, x1Var.f471165p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f471156d);
            fVar.a(2, this.f471157e);
            fVar.a(3, this.f471158f);
            fVar.a(4, this.f471159g);
            java.lang.String str = this.f471160h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f471161i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f471162m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f471163n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f471164o);
            java.lang.String str5 = this.f471165p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f471156d) + 0 + b36.f.a(2, this.f471157e) + b36.f.a(3, this.f471158f) + b36.f.a(4, this.f471159g);
            java.lang.String str6 = this.f471160h;
            if (str6 != null) {
                a17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f471161i;
            if (str7 != null) {
                a17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f471162m;
            if (str8 != null) {
                a17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f471163n;
            if (str9 != null) {
                a17 += b36.f.j(8, str9);
            }
            int e17 = a17 + b36.f.e(9, this.f471164o);
            java.lang.String str10 = this.f471165p;
            return str10 != null ? e17 + b36.f.j(10, str10) : e17;
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
        r45.x1 x1Var = (r45.x1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x1Var.f471156d = aVar2.c(intValue);
                return 0;
            case 2:
                x1Var.f471157e = aVar2.c(intValue);
                return 0;
            case 3:
                x1Var.f471158f = aVar2.c(intValue);
                return 0;
            case 4:
                x1Var.f471159g = aVar2.c(intValue);
                return 0;
            case 5:
                x1Var.f471160h = aVar2.k(intValue);
                return 0;
            case 6:
                x1Var.f471161i = aVar2.k(intValue);
                return 0;
            case 7:
                x1Var.f471162m = aVar2.k(intValue);
                return 0;
            case 8:
                x1Var.f471163n = aVar2.k(intValue);
                return 0;
            case 9:
                x1Var.f471164o = aVar2.g(intValue);
                return 0;
            case 10:
                x1Var.f471165p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
