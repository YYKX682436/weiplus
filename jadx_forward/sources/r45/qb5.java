package r45;

/* loaded from: classes9.dex */
public class qb5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465336d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465337e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465338f;

    /* renamed from: g, reason: collision with root package name */
    public r45.na5 f465339g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ce4 f465340h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f465341i;

    /* renamed from: m, reason: collision with root package name */
    public r45.oe0 f465342m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qb5)) {
            return false;
        }
        r45.qb5 qb5Var = (r45.qb5) fVar;
        return n51.f.a(this.f76492x92037252, qb5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f465336d), java.lang.Integer.valueOf(qb5Var.f465336d)) && n51.f.a(this.f465337e, qb5Var.f465337e) && n51.f.a(this.f465338f, qb5Var.f465338f) && n51.f.a(this.f465339g, qb5Var.f465339g) && n51.f.a(this.f465340h, qb5Var.f465340h) && n51.f.a(this.f465341i, qb5Var.f465341i) && n51.f.a(this.f465342m, qb5Var.f465342m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f465336d);
            java.lang.String str = this.f465337e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f465338f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.na5 na5Var = this.f465339g;
            if (na5Var != null) {
                fVar.i(98, na5Var.mo75928xcd1e8d8());
                this.f465339g.mo75956x3d5d1f78(fVar);
            }
            r45.ce4 ce4Var = this.f465340h;
            if (ce4Var != null) {
                fVar.i(99, ce4Var.mo75928xcd1e8d8());
                this.f465340h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f465341i;
            if (str3 != null) {
                fVar.j(100, str3);
            }
            r45.oe0 oe0Var = this.f465342m;
            if (oe0Var != null) {
                fVar.i(101, oe0Var.mo75928xcd1e8d8());
                this.f465342m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465336d);
            java.lang.String str4 = this.f465337e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f465338f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            r45.na5 na5Var2 = this.f465339g;
            if (na5Var2 != null) {
                i18 += b36.f.i(98, na5Var2.mo75928xcd1e8d8());
            }
            r45.ce4 ce4Var2 = this.f465340h;
            if (ce4Var2 != null) {
                i18 += b36.f.i(99, ce4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f465341i;
            if (str6 != null) {
                i18 += b36.f.j(100, str6);
            }
            r45.oe0 oe0Var2 = this.f465342m;
            return oe0Var2 != null ? i18 + b36.f.i(101, oe0Var2.mo75928xcd1e8d8()) : i18;
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
        r45.qb5 qb5Var = (r45.qb5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                qb5Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            qb5Var.f465336d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            qb5Var.f465337e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            qb5Var.f465338f = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 98:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.na5 na5Var3 = new r45.na5();
                    if (bArr2 != null && bArr2.length > 0) {
                        na5Var3.mo11468x92b714fd(bArr2);
                    }
                    qb5Var.f465339g = na5Var3;
                }
                return 0;
            case 99:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ce4 ce4Var3 = new r45.ce4();
                    if (bArr3 != null && bArr3.length > 0) {
                        ce4Var3.mo11468x92b714fd(bArr3);
                    }
                    qb5Var.f465340h = ce4Var3;
                }
                return 0;
            case 100:
                qb5Var.f465341i = aVar2.k(intValue);
                return 0;
            case 101:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.oe0 oe0Var3 = new r45.oe0();
                    if (bArr4 != null && bArr4.length > 0) {
                        oe0Var3.mo11468x92b714fd(bArr4);
                    }
                    qb5Var.f465342m = oe0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
