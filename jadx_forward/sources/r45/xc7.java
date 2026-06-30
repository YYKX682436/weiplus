package r45;

/* loaded from: classes7.dex */
public class xc7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471515d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471516e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f471517f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471518g;

    /* renamed from: h, reason: collision with root package name */
    public int f471519h;

    /* renamed from: i, reason: collision with root package name */
    public r45.y50 f471520i;

    /* renamed from: m, reason: collision with root package name */
    public r45.fd7 f471521m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f471522n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f471523o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f471524p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f471525q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xc7)) {
            return false;
        }
        r45.xc7 xc7Var = (r45.xc7) fVar;
        return n51.f.a(this.f76494x2de60e5e, xc7Var.f76494x2de60e5e) && n51.f.a(this.f471515d, xc7Var.f471515d) && n51.f.a(this.f471516e, xc7Var.f471516e) && n51.f.a(this.f471517f, xc7Var.f471517f) && n51.f.a(this.f471518g, xc7Var.f471518g) && n51.f.a(java.lang.Integer.valueOf(this.f471519h), java.lang.Integer.valueOf(xc7Var.f471519h)) && n51.f.a(this.f471520i, xc7Var.f471520i) && n51.f.a(this.f471521m, xc7Var.f471521m) && n51.f.a(this.f471522n, xc7Var.f471522n) && n51.f.a(this.f471523o, xc7Var.f471523o) && n51.f.a(this.f471524p, xc7Var.f471524p) && n51.f.a(this.f471525q, xc7Var.f471525q);
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
            java.lang.String str = this.f471515d;
            if (str != null) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f471516e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str2 = this.f471517f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f471518g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f471519h);
            r45.y50 y50Var = this.f471520i;
            if (y50Var != null) {
                fVar.i(7, y50Var.mo75928xcd1e8d8());
                this.f471520i.mo75956x3d5d1f78(fVar);
            }
            r45.fd7 fd7Var = this.f471521m;
            if (fd7Var != null) {
                fVar.i(8, fd7Var.mo75928xcd1e8d8());
                this.f471521m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f471522n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f471523o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f471524p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f471525q;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str8 = this.f471515d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f471516e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            java.lang.String str9 = this.f471517f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f471518g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            int e17 = i18 + b36.f.e(6, this.f471519h);
            r45.y50 y50Var2 = this.f471520i;
            if (y50Var2 != null) {
                e17 += b36.f.i(7, y50Var2.mo75928xcd1e8d8());
            }
            r45.fd7 fd7Var2 = this.f471521m;
            if (fd7Var2 != null) {
                e17 += b36.f.i(8, fd7Var2.mo75928xcd1e8d8());
            }
            java.lang.String str11 = this.f471522n;
            if (str11 != null) {
                e17 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f471523o;
            if (str12 != null) {
                e17 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f471524p;
            if (str13 != null) {
                e17 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f471525q;
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
        r45.xc7 xc7Var = (r45.xc7) objArr[1];
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
                    xc7Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                xc7Var.f471515d = aVar2.k(intValue);
                return 0;
            case 3:
                xc7Var.f471516e = aVar2.d(intValue);
                return 0;
            case 4:
                xc7Var.f471517f = aVar2.k(intValue);
                return 0;
            case 5:
                xc7Var.f471518g = aVar2.k(intValue);
                return 0;
            case 6:
                xc7Var.f471519h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.y50 y50Var3 = new r45.y50();
                    if (bArr2 != null && bArr2.length > 0) {
                        y50Var3.mo11468x92b714fd(bArr2);
                    }
                    xc7Var.f471520i = y50Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.fd7 fd7Var3 = new r45.fd7();
                    if (bArr3 != null && bArr3.length > 0) {
                        fd7Var3.mo11468x92b714fd(bArr3);
                    }
                    xc7Var.f471521m = fd7Var3;
                }
                return 0;
            case 9:
                xc7Var.f471522n = aVar2.k(intValue);
                return 0;
            case 10:
                xc7Var.f471523o = aVar2.k(intValue);
                return 0;
            case 11:
                xc7Var.f471524p = aVar2.k(intValue);
                return 0;
            case 12:
                xc7Var.f471525q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
