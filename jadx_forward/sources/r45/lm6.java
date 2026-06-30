package r45;

/* loaded from: classes9.dex */
public class lm6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461170d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461171e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461172f;

    /* renamed from: g, reason: collision with root package name */
    public int f461173g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461174h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461175i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f461176m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f461177n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f461178o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f461179p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lm6)) {
            return false;
        }
        r45.lm6 lm6Var = (r45.lm6) fVar;
        return n51.f.a(this.f461170d, lm6Var.f461170d) && n51.f.a(this.f461171e, lm6Var.f461171e) && n51.f.a(this.f461172f, lm6Var.f461172f) && n51.f.a(java.lang.Integer.valueOf(this.f461173g), java.lang.Integer.valueOf(lm6Var.f461173g)) && n51.f.a(this.f461174h, lm6Var.f461174h) && n51.f.a(this.f461175i, lm6Var.f461175i) && n51.f.a(this.f461176m, lm6Var.f461176m) && n51.f.a(this.f461177n, lm6Var.f461177n) && n51.f.a(this.f461178o, lm6Var.f461178o) && n51.f.a(java.lang.Boolean.valueOf(this.f461179p), java.lang.Boolean.valueOf(lm6Var.f461179p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461177n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461170d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f461171e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f461172f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f461173g);
            java.lang.String str4 = this.f461174h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f461175i;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f461176m;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.g(10, 1, linkedList);
            java.lang.String str7 = this.f461178o;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            fVar.a(12, this.f461179p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f461170d;
            int j17 = str8 != null ? 0 + b36.f.j(2, str8) : 0;
            java.lang.String str9 = this.f461171e;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f461172f;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            int e17 = j17 + b36.f.e(5, this.f461173g);
            java.lang.String str11 = this.f461174h;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f461175i;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f461176m;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            int g17 = e17 + b36.f.g(10, 1, linkedList);
            java.lang.String str14 = this.f461178o;
            if (str14 != null) {
                g17 += b36.f.j(11, str14);
            }
            return g17 + b36.f.a(12, this.f461179p);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.lm6 lm6Var = (r45.lm6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 2:
                lm6Var.f461170d = aVar2.k(intValue);
                return 0;
            case 3:
                lm6Var.f461171e = aVar2.k(intValue);
                return 0;
            case 4:
                lm6Var.f461172f = aVar2.k(intValue);
                return 0;
            case 5:
                lm6Var.f461173g = aVar2.g(intValue);
                return 0;
            case 6:
                lm6Var.f461174h = aVar2.k(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                lm6Var.f461175i = aVar2.k(intValue);
                return 0;
            case 9:
                lm6Var.f461176m = aVar2.k(intValue);
                return 0;
            case 10:
                lm6Var.f461177n.add(aVar2.k(intValue));
                return 0;
            case 11:
                lm6Var.f461178o = aVar2.k(intValue);
                return 0;
            case 12:
                lm6Var.f461179p = aVar2.c(intValue);
                return 0;
        }
    }
}
