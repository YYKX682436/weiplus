package r45;

/* loaded from: classes9.dex */
public class by6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452683d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f452684e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452685f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452686g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452687h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452688i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f452689m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f452690n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f452691o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.by6)) {
            return false;
        }
        r45.by6 by6Var = (r45.by6) fVar;
        return n51.f.a(this.f76494x2de60e5e, by6Var.f76494x2de60e5e) && n51.f.a(this.f452683d, by6Var.f452683d) && n51.f.a(this.f452684e, by6Var.f452684e) && n51.f.a(this.f452685f, by6Var.f452685f) && n51.f.a(this.f452686g, by6Var.f452686g) && n51.f.a(this.f452687h, by6Var.f452687h) && n51.f.a(this.f452688i, by6Var.f452688i) && n51.f.a(this.f452689m, by6Var.f452689m) && n51.f.a(this.f452690n, by6Var.f452690n) && n51.f.a(this.f452691o, by6Var.f452691o);
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
            java.lang.String str = this.f452683d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 2, this.f452684e);
            java.lang.String str2 = this.f452685f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f452686g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f452687h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f452688i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f452689m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f452690n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f452691o;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str9 = this.f452683d;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            int g17 = i18 + b36.f.g(3, 2, this.f452684e);
            java.lang.String str10 = this.f452685f;
            if (str10 != null) {
                g17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f452686g;
            if (str11 != null) {
                g17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f452687h;
            if (str12 != null) {
                g17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f452688i;
            if (str13 != null) {
                g17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f452689m;
            if (str14 != null) {
                g17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f452690n;
            if (str15 != null) {
                g17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f452691o;
            return str16 != null ? g17 + b36.f.j(10, str16) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f452684e.clear();
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
        r45.by6 by6Var = (r45.by6) objArr[1];
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
                    by6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                by6Var.f452683d = aVar2.k(intValue);
                return 0;
            case 3:
                by6Var.f452684e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 4:
                by6Var.f452685f = aVar2.k(intValue);
                return 0;
            case 5:
                by6Var.f452686g = aVar2.k(intValue);
                return 0;
            case 6:
                by6Var.f452687h = aVar2.k(intValue);
                return 0;
            case 7:
                by6Var.f452688i = aVar2.k(intValue);
                return 0;
            case 8:
                by6Var.f452689m = aVar2.k(intValue);
                return 0;
            case 9:
                by6Var.f452690n = aVar2.k(intValue);
                return 0;
            case 10:
                by6Var.f452691o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
