package r45;

/* loaded from: classes9.dex */
public class f00 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f455402d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455403e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455404f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455405g;

    /* renamed from: h, reason: collision with root package name */
    public int f455406h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f455407i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f455408m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f455409n;

    /* renamed from: o, reason: collision with root package name */
    public int f455410o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f00)) {
            return false;
        }
        r45.f00 f00Var = (r45.f00) fVar;
        return n51.f.a(this.f76494x2de60e5e, f00Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f455402d), java.lang.Integer.valueOf(f00Var.f455402d)) && n51.f.a(this.f455403e, f00Var.f455403e) && n51.f.a(this.f455404f, f00Var.f455404f) && n51.f.a(this.f455405g, f00Var.f455405g) && n51.f.a(java.lang.Integer.valueOf(this.f455406h), java.lang.Integer.valueOf(f00Var.f455406h)) && n51.f.a(this.f455407i, f00Var.f455407i) && n51.f.a(this.f455408m, f00Var.f455408m) && n51.f.a(this.f455409n, f00Var.f455409n) && n51.f.a(java.lang.Integer.valueOf(this.f455410o), java.lang.Integer.valueOf(f00Var.f455410o));
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
            fVar.e(2, this.f455402d);
            java.lang.String str = this.f455403e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f455404f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f455405g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f455406h);
            fVar.g(7, 8, this.f455407i);
            java.lang.String str4 = this.f455408m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f455409n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f455410o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f455402d);
            java.lang.String str6 = this.f455403e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f455404f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f455405g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            int e17 = i18 + b36.f.e(6, this.f455406h) + b36.f.g(7, 8, this.f455407i);
            java.lang.String str9 = this.f455408m;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f455409n;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            return e17 + b36.f.e(10, this.f455410o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f455407i.clear();
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
        r45.f00 f00Var = (r45.f00) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    f00Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                f00Var.f455402d = aVar2.g(intValue);
                return 0;
            case 3:
                f00Var.f455403e = aVar2.k(intValue);
                return 0;
            case 4:
                f00Var.f455404f = aVar2.k(intValue);
                return 0;
            case 5:
                f00Var.f455405g = aVar2.k(intValue);
                return 0;
            case 6:
                f00Var.f455406h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    f00Var.f455407i.add(du5Var);
                }
                return 0;
            case 8:
                f00Var.f455408m = aVar2.k(intValue);
                return 0;
            case 9:
                f00Var.f455409n = aVar2.k(intValue);
                return 0;
            case 10:
                f00Var.f455410o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
