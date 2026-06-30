package r45;

/* loaded from: classes12.dex */
public class m87 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461783d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461784e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461785f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461786g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461787h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461788i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f461789m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f461790n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f461791o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m87)) {
            return false;
        }
        r45.m87 m87Var = (r45.m87) fVar;
        return n51.f.a(this.f461783d, m87Var.f461783d) && n51.f.a(this.f461784e, m87Var.f461784e) && n51.f.a(this.f461785f, m87Var.f461785f) && n51.f.a(this.f461786g, m87Var.f461786g) && n51.f.a(this.f461787h, m87Var.f461787h) && n51.f.a(this.f461788i, m87Var.f461788i) && n51.f.a(this.f461789m, m87Var.f461789m) && n51.f.a(this.f461790n, m87Var.f461790n) && n51.f.a(this.f461791o, m87Var.f461791o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461783d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f461784e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f461785f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f461786g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f461787h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f461788i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f461789m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f461790n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f461791o;
            if (str9 != null) {
                fVar.j(9, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f461783d;
            int j17 = str10 != null ? 0 + b36.f.j(1, str10) : 0;
            java.lang.String str11 = this.f461784e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f461785f;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f461786g;
            if (str13 != null) {
                j17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f461787h;
            if (str14 != null) {
                j17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f461788i;
            if (str15 != null) {
                j17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f461789m;
            if (str16 != null) {
                j17 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f461790n;
            if (str17 != null) {
                j17 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f461791o;
            return str18 != null ? j17 + b36.f.j(9, str18) : j17;
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
        r45.m87 m87Var = (r45.m87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m87Var.f461783d = aVar2.k(intValue);
                return 0;
            case 2:
                m87Var.f461784e = aVar2.k(intValue);
                return 0;
            case 3:
                m87Var.f461785f = aVar2.k(intValue);
                return 0;
            case 4:
                m87Var.f461786g = aVar2.k(intValue);
                return 0;
            case 5:
                m87Var.f461787h = aVar2.k(intValue);
                return 0;
            case 6:
                m87Var.f461788i = aVar2.k(intValue);
                return 0;
            case 7:
                m87Var.f461789m = aVar2.k(intValue);
                return 0;
            case 8:
                m87Var.f461790n = aVar2.k(intValue);
                return 0;
            case 9:
                m87Var.f461791o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
