package r45;

/* loaded from: classes9.dex */
public class ef5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454930d;

    /* renamed from: e, reason: collision with root package name */
    public int f454931e;

    /* renamed from: f, reason: collision with root package name */
    public int f454932f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454933g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454934h;

    /* renamed from: i, reason: collision with root package name */
    public int f454935i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f454936m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f454937n;

    /* renamed from: o, reason: collision with root package name */
    public int f454938o;

    /* renamed from: p, reason: collision with root package name */
    public int f454939p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f454940q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ef5)) {
            return false;
        }
        r45.ef5 ef5Var = (r45.ef5) fVar;
        return n51.f.a(this.f76494x2de60e5e, ef5Var.f76494x2de60e5e) && n51.f.a(this.f454930d, ef5Var.f454930d) && n51.f.a(java.lang.Integer.valueOf(this.f454931e), java.lang.Integer.valueOf(ef5Var.f454931e)) && n51.f.a(java.lang.Integer.valueOf(this.f454932f), java.lang.Integer.valueOf(ef5Var.f454932f)) && n51.f.a(this.f454933g, ef5Var.f454933g) && n51.f.a(this.f454934h, ef5Var.f454934h) && n51.f.a(java.lang.Integer.valueOf(this.f454935i), java.lang.Integer.valueOf(ef5Var.f454935i)) && n51.f.a(this.f454936m, ef5Var.f454936m) && n51.f.a(this.f454937n, ef5Var.f454937n) && n51.f.a(java.lang.Integer.valueOf(this.f454938o), java.lang.Integer.valueOf(ef5Var.f454938o)) && n51.f.a(java.lang.Integer.valueOf(this.f454939p), java.lang.Integer.valueOf(ef5Var.f454939p)) && n51.f.a(this.f454940q, ef5Var.f454940q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f454930d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f454931e);
            fVar.e(4, this.f454932f);
            java.lang.String str2 = this.f454933g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f454934h;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f454935i);
            java.lang.String str4 = this.f454936m;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f454937n;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            fVar.e(11, this.f454938o);
            fVar.e(12, this.f454939p);
            java.lang.String str6 = this.f454940q;
            if (str6 != null) {
                fVar.j(100, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f454930d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            int e17 = i18 + b36.f.e(3, this.f454931e) + b36.f.e(4, this.f454932f);
            java.lang.String str8 = this.f454933g;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f454934h;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            int e18 = e17 + b36.f.e(8, this.f454935i);
            java.lang.String str10 = this.f454936m;
            if (str10 != null) {
                e18 += b36.f.j(9, str10);
            }
            java.lang.String str11 = this.f454937n;
            if (str11 != null) {
                e18 += b36.f.j(10, str11);
            }
            int e19 = e18 + b36.f.e(11, this.f454938o) + b36.f.e(12, this.f454939p);
            java.lang.String str12 = this.f454940q;
            return str12 != null ? e19 + b36.f.j(100, str12) : e19;
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
        r45.ef5 ef5Var = (r45.ef5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                ef5Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ef5Var.f454930d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ef5Var.f454931e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ef5Var.f454932f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            ef5Var.f454933g = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 100) {
            ef5Var.f454940q = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 7:
                ef5Var.f454934h = aVar2.k(intValue);
                return 0;
            case 8:
                ef5Var.f454935i = aVar2.g(intValue);
                return 0;
            case 9:
                ef5Var.f454936m = aVar2.k(intValue);
                return 0;
            case 10:
                ef5Var.f454937n = aVar2.k(intValue);
                return 0;
            case 11:
                ef5Var.f454938o = aVar2.g(intValue);
                return 0;
            case 12:
                ef5Var.f454939p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
