package r45;

/* loaded from: classes7.dex */
public class rd5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466274d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466275e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466276f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466277g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f466278h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f466279i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f466280m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f466281n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f466282o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f466283p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f466284q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rd5)) {
            return false;
        }
        r45.rd5 rd5Var = (r45.rd5) fVar;
        return n51.f.a(this.f466274d, rd5Var.f466274d) && n51.f.a(this.f466275e, rd5Var.f466275e) && n51.f.a(this.f466276f, rd5Var.f466276f) && n51.f.a(this.f466277g, rd5Var.f466277g) && n51.f.a(java.lang.Boolean.valueOf(this.f466278h), java.lang.Boolean.valueOf(rd5Var.f466278h)) && n51.f.a(this.f466279i, rd5Var.f466279i) && n51.f.a(this.f466280m, rd5Var.f466280m) && n51.f.a(this.f466281n, rd5Var.f466281n) && n51.f.a(java.lang.Boolean.valueOf(this.f466282o), java.lang.Boolean.valueOf(rd5Var.f466282o)) && n51.f.a(this.f466283p, rd5Var.f466283p) && n51.f.a(this.f466284q, rd5Var.f466284q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466274d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466275e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f466276f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f466277g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.a(5, this.f466278h);
            java.lang.String str5 = this.f466279i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f466280m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f466281n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.a(9, this.f466282o);
            java.lang.String str8 = this.f466283p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f466284q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f466274d;
            int j17 = str10 != null ? 0 + b36.f.j(1, str10) : 0;
            java.lang.String str11 = this.f466275e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f466276f;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f466277g;
            if (str13 != null) {
                j17 += b36.f.j(4, str13);
            }
            int a17 = j17 + b36.f.a(5, this.f466278h);
            java.lang.String str14 = this.f466279i;
            if (str14 != null) {
                a17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f466280m;
            if (str15 != null) {
                a17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f466281n;
            if (str16 != null) {
                a17 += b36.f.j(8, str16);
            }
            int a18 = a17 + b36.f.a(9, this.f466282o);
            java.lang.String str17 = this.f466283p;
            if (str17 != null) {
                a18 += b36.f.j(10, str17);
            }
            java.lang.String str18 = this.f466284q;
            return str18 != null ? a18 + b36.f.j(11, str18) : a18;
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
        r45.rd5 rd5Var = (r45.rd5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rd5Var.f466274d = aVar2.k(intValue);
                return 0;
            case 2:
                rd5Var.f466275e = aVar2.k(intValue);
                return 0;
            case 3:
                rd5Var.f466276f = aVar2.k(intValue);
                return 0;
            case 4:
                rd5Var.f466277g = aVar2.k(intValue);
                return 0;
            case 5:
                rd5Var.f466278h = aVar2.c(intValue);
                return 0;
            case 6:
                rd5Var.f466279i = aVar2.k(intValue);
                return 0;
            case 7:
                rd5Var.f466280m = aVar2.k(intValue);
                return 0;
            case 8:
                rd5Var.f466281n = aVar2.k(intValue);
                return 0;
            case 9:
                rd5Var.f466282o = aVar2.c(intValue);
                return 0;
            case 10:
                rd5Var.f466283p = aVar2.k(intValue);
                return 0;
            case 11:
                rd5Var.f466284q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
