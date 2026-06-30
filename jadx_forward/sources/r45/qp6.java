package r45;

/* loaded from: classes9.dex */
public class qp6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465725d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465726e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465727f;

    /* renamed from: g, reason: collision with root package name */
    public int f465728g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465729h;

    /* renamed from: i, reason: collision with root package name */
    public int f465730i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f465731m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f465732n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f465733o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qp6)) {
            return false;
        }
        r45.qp6 qp6Var = (r45.qp6) fVar;
        return n51.f.a(this.f76494x2de60e5e, qp6Var.f76494x2de60e5e) && n51.f.a(this.f465725d, qp6Var.f465725d) && n51.f.a(this.f465726e, qp6Var.f465726e) && n51.f.a(this.f465727f, qp6Var.f465727f) && n51.f.a(java.lang.Integer.valueOf(this.f465728g), java.lang.Integer.valueOf(qp6Var.f465728g)) && n51.f.a(this.f465729h, qp6Var.f465729h) && n51.f.a(java.lang.Integer.valueOf(this.f465730i), java.lang.Integer.valueOf(qp6Var.f465730i)) && n51.f.a(this.f465731m, qp6Var.f465731m) && n51.f.a(this.f465732n, qp6Var.f465732n) && n51.f.a(this.f465733o, qp6Var.f465733o);
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
            java.lang.String str = this.f465725d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f465726e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f465727f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f465728g);
            java.lang.String str4 = this.f465729h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f465730i);
            java.lang.String str5 = this.f465731m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f465732n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f465733o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str8 = this.f465725d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f465726e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f465727f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            int e17 = i18 + b36.f.e(5, this.f465728g);
            java.lang.String str11 = this.f465729h;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            int e18 = e17 + b36.f.e(7, this.f465730i);
            java.lang.String str12 = this.f465731m;
            if (str12 != null) {
                e18 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f465732n;
            if (str13 != null) {
                e18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f465733o;
            return str14 != null ? e18 + b36.f.j(10, str14) : e18;
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
        r45.qp6 qp6Var = (r45.qp6) objArr[1];
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
                    qp6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                qp6Var.f465725d = aVar2.k(intValue);
                return 0;
            case 3:
                qp6Var.f465726e = aVar2.k(intValue);
                return 0;
            case 4:
                qp6Var.f465727f = aVar2.k(intValue);
                return 0;
            case 5:
                qp6Var.f465728g = aVar2.g(intValue);
                return 0;
            case 6:
                qp6Var.f465729h = aVar2.k(intValue);
                return 0;
            case 7:
                qp6Var.f465730i = aVar2.g(intValue);
                return 0;
            case 8:
                qp6Var.f465731m = aVar2.k(intValue);
                return 0;
            case 9:
                qp6Var.f465732n = aVar2.k(intValue);
                return 0;
            case 10:
                qp6Var.f465733o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
