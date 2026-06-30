package r45;

/* loaded from: classes12.dex */
public class ed6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454860d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454861e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454862f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454863g;

    /* renamed from: h, reason: collision with root package name */
    public int f454864h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454865i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f454866m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f454867n;

    /* renamed from: o, reason: collision with root package name */
    public int f454868o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f454869p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ed6)) {
            return false;
        }
        r45.ed6 ed6Var = (r45.ed6) fVar;
        return n51.f.a(this.f454860d, ed6Var.f454860d) && n51.f.a(this.f454861e, ed6Var.f454861e) && n51.f.a(this.f454862f, ed6Var.f454862f) && n51.f.a(this.f454863g, ed6Var.f454863g) && n51.f.a(java.lang.Integer.valueOf(this.f454864h), java.lang.Integer.valueOf(ed6Var.f454864h)) && n51.f.a(this.f454865i, ed6Var.f454865i) && n51.f.a(this.f454866m, ed6Var.f454866m) && n51.f.a(this.f454867n, ed6Var.f454867n) && n51.f.a(java.lang.Integer.valueOf(this.f454868o), java.lang.Integer.valueOf(ed6Var.f454868o)) && n51.f.a(this.f454869p, ed6Var.f454869p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454860d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454861e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f454862f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f454863g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f454864h);
            java.lang.String str5 = this.f454865i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f454866m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f454867n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f454868o);
            java.lang.String str8 = this.f454869p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f454860d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f454861e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f454862f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f454863g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            int e17 = j17 + b36.f.e(5, this.f454864h);
            java.lang.String str13 = this.f454865i;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f454866m;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f454867n;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            int e18 = e17 + b36.f.e(9, this.f454868o);
            java.lang.String str16 = this.f454869p;
            return str16 != null ? e18 + b36.f.j(10, str16) : e18;
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
        r45.ed6 ed6Var = (r45.ed6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ed6Var.f454860d = aVar2.k(intValue);
                return 0;
            case 2:
                ed6Var.f454861e = aVar2.k(intValue);
                return 0;
            case 3:
                ed6Var.f454862f = aVar2.k(intValue);
                return 0;
            case 4:
                ed6Var.f454863g = aVar2.k(intValue);
                return 0;
            case 5:
                ed6Var.f454864h = aVar2.g(intValue);
                return 0;
            case 6:
                ed6Var.f454865i = aVar2.k(intValue);
                return 0;
            case 7:
                ed6Var.f454866m = aVar2.k(intValue);
                return 0;
            case 8:
                ed6Var.f454867n = aVar2.k(intValue);
                return 0;
            case 9:
                ed6Var.f454868o = aVar2.g(intValue);
                return 0;
            case 10:
                ed6Var.f454869p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
