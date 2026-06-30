package r45;

/* loaded from: classes9.dex */
public class ea3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454718d;

    /* renamed from: e, reason: collision with root package name */
    public int f454719e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454720f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454721g;

    /* renamed from: h, reason: collision with root package name */
    public int f454722h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454723i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f454724m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f454725n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454726o;

    /* renamed from: p, reason: collision with root package name */
    public int f454727p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ea3)) {
            return false;
        }
        r45.ea3 ea3Var = (r45.ea3) fVar;
        return n51.f.a(this.f76494x2de60e5e, ea3Var.f76494x2de60e5e) && n51.f.a(this.f454718d, ea3Var.f454718d) && n51.f.a(java.lang.Integer.valueOf(this.f454719e), java.lang.Integer.valueOf(ea3Var.f454719e)) && n51.f.a(this.f454720f, ea3Var.f454720f) && n51.f.a(this.f454721g, ea3Var.f454721g) && n51.f.a(java.lang.Integer.valueOf(this.f454722h), java.lang.Integer.valueOf(ea3Var.f454722h)) && n51.f.a(this.f454723i, ea3Var.f454723i) && n51.f.a(this.f454724m, ea3Var.f454724m) && n51.f.a(this.f454725n, ea3Var.f454725n) && n51.f.a(this.f454726o, ea3Var.f454726o) && n51.f.a(java.lang.Integer.valueOf(this.f454727p), java.lang.Integer.valueOf(ea3Var.f454727p));
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
            java.lang.String str = this.f454718d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f454719e);
            java.lang.String str2 = this.f454720f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f454721g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f454722h);
            java.lang.String str4 = this.f454723i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f454724m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f454725n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f454726o;
            if (gVar != null) {
                fVar.b(10, gVar);
            }
            fVar.e(11, this.f454727p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f454718d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            int e17 = i18 + b36.f.e(3, this.f454719e);
            java.lang.String str8 = this.f454720f;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f454721g;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            int e18 = e17 + b36.f.e(6, this.f454722h);
            java.lang.String str10 = this.f454723i;
            if (str10 != null) {
                e18 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f454724m;
            if (str11 != null) {
                e18 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f454725n;
            if (str12 != null) {
                e18 += b36.f.j(9, str12);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f454726o;
            if (gVar2 != null) {
                e18 += b36.f.b(10, gVar2);
            }
            return e18 + b36.f.e(11, this.f454727p);
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
        r45.ea3 ea3Var = (r45.ea3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    ea3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                ea3Var.f454718d = aVar2.k(intValue);
                return 0;
            case 3:
                ea3Var.f454719e = aVar2.g(intValue);
                return 0;
            case 4:
                ea3Var.f454720f = aVar2.k(intValue);
                return 0;
            case 5:
                ea3Var.f454721g = aVar2.k(intValue);
                return 0;
            case 6:
                ea3Var.f454722h = aVar2.g(intValue);
                return 0;
            case 7:
                ea3Var.f454723i = aVar2.k(intValue);
                return 0;
            case 8:
                ea3Var.f454724m = aVar2.k(intValue);
                return 0;
            case 9:
                ea3Var.f454725n = aVar2.k(intValue);
                return 0;
            case 10:
                ea3Var.f454726o = aVar2.d(intValue);
                return 0;
            case 11:
                ea3Var.f454727p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
