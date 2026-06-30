package r45;

/* loaded from: classes14.dex */
public class v53 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f469426d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f469427e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f469428f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469429g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469430h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469431i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469432m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f469433n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f469434o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v53)) {
            return false;
        }
        r45.v53 v53Var = (r45.v53) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f469426d), java.lang.Boolean.valueOf(v53Var.f469426d)) && n51.f.a(java.lang.Boolean.valueOf(this.f469427e), java.lang.Boolean.valueOf(v53Var.f469427e)) && n51.f.a(java.lang.Boolean.valueOf(this.f469428f), java.lang.Boolean.valueOf(v53Var.f469428f)) && n51.f.a(this.f469429g, v53Var.f469429g) && n51.f.a(this.f469430h, v53Var.f469430h) && n51.f.a(this.f469431i, v53Var.f469431i) && n51.f.a(this.f469432m, v53Var.f469432m) && n51.f.a(this.f469433n, v53Var.f469433n) && n51.f.a(this.f469434o, v53Var.f469434o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f469426d);
            fVar.a(2, this.f469427e);
            fVar.a(3, this.f469428f);
            java.lang.String str = this.f469429g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f469430h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f469431i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f469432m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f469433n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f469434o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f469426d) + 0 + b36.f.a(2, this.f469427e) + b36.f.a(3, this.f469428f);
            java.lang.String str7 = this.f469429g;
            if (str7 != null) {
                a17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f469430h;
            if (str8 != null) {
                a17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f469431i;
            if (str9 != null) {
                a17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f469432m;
            if (str10 != null) {
                a17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f469433n;
            if (str11 != null) {
                a17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f469434o;
            return str12 != null ? a17 + b36.f.j(9, str12) : a17;
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
        r45.v53 v53Var = (r45.v53) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v53Var.f469426d = aVar2.c(intValue);
                return 0;
            case 2:
                v53Var.f469427e = aVar2.c(intValue);
                return 0;
            case 3:
                v53Var.f469428f = aVar2.c(intValue);
                return 0;
            case 4:
                v53Var.f469429g = aVar2.k(intValue);
                return 0;
            case 5:
                v53Var.f469430h = aVar2.k(intValue);
                return 0;
            case 6:
                v53Var.f469431i = aVar2.k(intValue);
                return 0;
            case 7:
                v53Var.f469432m = aVar2.k(intValue);
                return 0;
            case 8:
                v53Var.f469433n = aVar2.k(intValue);
                return 0;
            case 9:
                v53Var.f469434o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
