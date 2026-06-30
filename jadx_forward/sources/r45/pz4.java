package r45;

/* loaded from: classes9.dex */
public class pz4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465024d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465025e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465026f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465027g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465028h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f465029i;

    /* renamed from: m, reason: collision with root package name */
    public int f465030m;

    /* renamed from: n, reason: collision with root package name */
    public int f465031n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f465032o;

    /* renamed from: p, reason: collision with root package name */
    public int f465033p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f465034q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pz4)) {
            return false;
        }
        r45.pz4 pz4Var = (r45.pz4) fVar;
        return n51.f.a(this.f76494x2de60e5e, pz4Var.f76494x2de60e5e) && n51.f.a(this.f465024d, pz4Var.f465024d) && n51.f.a(this.f465025e, pz4Var.f465025e) && n51.f.a(this.f465026f, pz4Var.f465026f) && n51.f.a(this.f465027g, pz4Var.f465027g) && n51.f.a(this.f465028h, pz4Var.f465028h) && n51.f.a(this.f465029i, pz4Var.f465029i) && n51.f.a(java.lang.Integer.valueOf(this.f465030m), java.lang.Integer.valueOf(pz4Var.f465030m)) && n51.f.a(java.lang.Integer.valueOf(this.f465031n), java.lang.Integer.valueOf(pz4Var.f465031n)) && n51.f.a(java.lang.Boolean.valueOf(this.f465032o), java.lang.Boolean.valueOf(pz4Var.f465032o)) && n51.f.a(java.lang.Integer.valueOf(this.f465033p), java.lang.Integer.valueOf(pz4Var.f465033p)) && n51.f.a(this.f465034q, pz4Var.f465034q);
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
            java.lang.String str = this.f465024d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f465025e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f465026f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f465027g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f465028h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f465029i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.e(8, this.f465030m);
            fVar.e(9, this.f465031n);
            fVar.a(10, this.f465032o);
            fVar.e(11, this.f465033p);
            java.lang.String str7 = this.f465034q;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str8 = this.f465024d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f465025e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f465026f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f465027g;
            if (str11 != null) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f465028h;
            if (str12 != null) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f465029i;
            if (str13 != null) {
                i18 += b36.f.j(7, str13);
            }
            int e17 = i18 + b36.f.e(8, this.f465030m) + b36.f.e(9, this.f465031n) + b36.f.a(10, this.f465032o) + b36.f.e(11, this.f465033p);
            java.lang.String str14 = this.f465034q;
            return str14 != null ? e17 + b36.f.j(12, str14) : e17;
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
        r45.pz4 pz4Var = (r45.pz4) objArr[1];
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
                    pz4Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                pz4Var.f465024d = aVar2.k(intValue);
                return 0;
            case 3:
                pz4Var.f465025e = aVar2.k(intValue);
                return 0;
            case 4:
                pz4Var.f465026f = aVar2.k(intValue);
                return 0;
            case 5:
                pz4Var.f465027g = aVar2.k(intValue);
                return 0;
            case 6:
                pz4Var.f465028h = aVar2.k(intValue);
                return 0;
            case 7:
                pz4Var.f465029i = aVar2.k(intValue);
                return 0;
            case 8:
                pz4Var.f465030m = aVar2.g(intValue);
                return 0;
            case 9:
                pz4Var.f465031n = aVar2.g(intValue);
                return 0;
            case 10:
                pz4Var.f465032o = aVar2.c(intValue);
                return 0;
            case 11:
                pz4Var.f465033p = aVar2.g(intValue);
                return 0;
            case 12:
                pz4Var.f465034q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
