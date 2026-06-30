package r45;

/* loaded from: classes2.dex */
public class gg4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456754d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456755e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456756f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456757g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456758h;

    /* renamed from: i, reason: collision with root package name */
    public int f456759i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456760m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f456761n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f456762o;

    /* renamed from: p, reason: collision with root package name */
    public r45.ag4 f456763p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f456764q;

    /* renamed from: r, reason: collision with root package name */
    public int f456765r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gg4)) {
            return false;
        }
        r45.gg4 gg4Var = (r45.gg4) fVar;
        return n51.f.a(this.f456754d, gg4Var.f456754d) && n51.f.a(this.f456755e, gg4Var.f456755e) && n51.f.a(this.f456756f, gg4Var.f456756f) && n51.f.a(this.f456757g, gg4Var.f456757g) && n51.f.a(this.f456758h, gg4Var.f456758h) && n51.f.a(java.lang.Integer.valueOf(this.f456759i), java.lang.Integer.valueOf(gg4Var.f456759i)) && n51.f.a(this.f456760m, gg4Var.f456760m) && n51.f.a(this.f456761n, gg4Var.f456761n) && n51.f.a(java.lang.Boolean.valueOf(this.f456762o), java.lang.Boolean.valueOf(gg4Var.f456762o)) && n51.f.a(this.f456763p, gg4Var.f456763p) && n51.f.a(this.f456764q, gg4Var.f456764q) && n51.f.a(java.lang.Integer.valueOf(this.f456765r), java.lang.Integer.valueOf(gg4Var.f456765r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456754d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f456755e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f456756f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f456757g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f456758h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f456759i);
            java.lang.String str6 = this.f456760m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f456761n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.a(9, this.f456762o);
            r45.ag4 ag4Var = this.f456763p;
            if (ag4Var != null) {
                fVar.i(10, ag4Var.mo75928xcd1e8d8());
                this.f456763p.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f456764q;
            if (gVar != null) {
                fVar.b(11, gVar);
            }
            fVar.e(22, this.f456765r);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f456754d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f456755e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f456756f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f456757g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f456758h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            int e17 = j17 + b36.f.e(6, this.f456759i);
            java.lang.String str13 = this.f456760m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f456761n;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            int a17 = e17 + b36.f.a(9, this.f456762o);
            r45.ag4 ag4Var2 = this.f456763p;
            if (ag4Var2 != null) {
                a17 += b36.f.i(10, ag4Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f456764q;
            if (gVar2 != null) {
                a17 += b36.f.b(11, gVar2);
            }
            return a17 + b36.f.e(22, this.f456765r);
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
        r45.gg4 gg4Var = (r45.gg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 22) {
            gg4Var.f456765r = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                gg4Var.f456754d = aVar2.k(intValue);
                return 0;
            case 2:
                gg4Var.f456755e = aVar2.k(intValue);
                return 0;
            case 3:
                gg4Var.f456756f = aVar2.k(intValue);
                return 0;
            case 4:
                gg4Var.f456757g = aVar2.k(intValue);
                return 0;
            case 5:
                gg4Var.f456758h = aVar2.k(intValue);
                return 0;
            case 6:
                gg4Var.f456759i = aVar2.g(intValue);
                return 0;
            case 7:
                gg4Var.f456760m = aVar2.k(intValue);
                return 0;
            case 8:
                gg4Var.f456761n = aVar2.k(intValue);
                return 0;
            case 9:
                gg4Var.f456762o = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.ag4 ag4Var3 = new r45.ag4();
                    if (bArr != null && bArr.length > 0) {
                        ag4Var3.mo11468x92b714fd(bArr);
                    }
                    gg4Var.f456763p = ag4Var3;
                }
                return 0;
            case 11:
                gg4Var.f456764q = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
