package r45;

/* loaded from: classes9.dex */
public class q74 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465267d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465268e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465269f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465270g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f465271h;

    /* renamed from: i, reason: collision with root package name */
    public float f465272i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f465273m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f465274n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f465275o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f465276p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q74)) {
            return false;
        }
        r45.q74 q74Var = (r45.q74) fVar;
        return n51.f.a(this.f465267d, q74Var.f465267d) && n51.f.a(this.f465268e, q74Var.f465268e) && n51.f.a(this.f465269f, q74Var.f465269f) && n51.f.a(this.f465270g, q74Var.f465270g) && n51.f.a(java.lang.Boolean.valueOf(this.f465271h), java.lang.Boolean.valueOf(q74Var.f465271h)) && n51.f.a(java.lang.Float.valueOf(this.f465272i), java.lang.Float.valueOf(q74Var.f465272i)) && n51.f.a(java.lang.Boolean.valueOf(this.f465273m), java.lang.Boolean.valueOf(q74Var.f465273m)) && n51.f.a(this.f465274n, q74Var.f465274n) && n51.f.a(this.f465275o, q74Var.f465275o) && n51.f.a(this.f465276p, q74Var.f465276p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465267d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465268e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f465269f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f465270g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.a(5, this.f465271h);
            fVar.d(6, this.f465272i);
            fVar.a(7, this.f465273m);
            java.lang.String str5 = this.f465274n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f465275o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f465276p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f465267d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f465268e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f465269f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f465270g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            int a17 = j17 + b36.f.a(5, this.f465271h) + b36.f.d(6, this.f465272i) + b36.f.a(7, this.f465273m);
            java.lang.String str12 = this.f465274n;
            if (str12 != null) {
                a17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f465275o;
            if (str13 != null) {
                a17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f465276p;
            return str14 != null ? a17 + b36.f.j(10, str14) : a17;
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
        r45.q74 q74Var = (r45.q74) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q74Var.f465267d = aVar2.k(intValue);
                return 0;
            case 2:
                q74Var.f465268e = aVar2.k(intValue);
                return 0;
            case 3:
                q74Var.f465269f = aVar2.k(intValue);
                return 0;
            case 4:
                q74Var.f465270g = aVar2.k(intValue);
                return 0;
            case 5:
                q74Var.f465271h = aVar2.c(intValue);
                return 0;
            case 6:
                q74Var.f465272i = aVar2.f(intValue);
                return 0;
            case 7:
                q74Var.f465273m = aVar2.c(intValue);
                return 0;
            case 8:
                q74Var.f465274n = aVar2.k(intValue);
                return 0;
            case 9:
                q74Var.f465275o = aVar2.k(intValue);
                return 0;
            case 10:
                q74Var.f465276p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
