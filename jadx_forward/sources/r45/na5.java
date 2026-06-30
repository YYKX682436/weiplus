package r45;

/* loaded from: classes9.dex */
public class na5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462732d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462733e;

    /* renamed from: f, reason: collision with root package name */
    public int f462734f;

    /* renamed from: g, reason: collision with root package name */
    public r45.c70 f462735g;

    /* renamed from: h, reason: collision with root package name */
    public r45.bq f462736h;

    /* renamed from: i, reason: collision with root package name */
    public r45.bq f462737i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462738m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f462739n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f462740o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f462741p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f462742q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.na5)) {
            return false;
        }
        r45.na5 na5Var = (r45.na5) fVar;
        return n51.f.a(this.f462732d, na5Var.f462732d) && n51.f.a(this.f462733e, na5Var.f462733e) && n51.f.a(java.lang.Integer.valueOf(this.f462734f), java.lang.Integer.valueOf(na5Var.f462734f)) && n51.f.a(this.f462735g, na5Var.f462735g) && n51.f.a(this.f462736h, na5Var.f462736h) && n51.f.a(this.f462737i, na5Var.f462737i) && n51.f.a(this.f462738m, na5Var.f462738m) && n51.f.a(this.f462739n, na5Var.f462739n) && n51.f.a(this.f462740o, na5Var.f462740o) && n51.f.a(this.f462741p, na5Var.f462741p) && n51.f.a(this.f462742q, na5Var.f462742q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462732d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462733e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f462734f);
            r45.c70 c70Var = this.f462735g;
            if (c70Var != null) {
                fVar.i(4, c70Var.mo75928xcd1e8d8());
                this.f462735g.mo75956x3d5d1f78(fVar);
            }
            r45.bq bqVar = this.f462736h;
            if (bqVar != null) {
                fVar.i(5, bqVar.mo75928xcd1e8d8());
                this.f462736h.mo75956x3d5d1f78(fVar);
            }
            r45.bq bqVar2 = this.f462737i;
            if (bqVar2 != null) {
                fVar.i(6, bqVar2.mo75928xcd1e8d8());
                this.f462737i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f462738m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f462739n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f462740o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f462741p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f462742q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f462732d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f462733e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int e17 = j17 + b36.f.e(3, this.f462734f);
            r45.c70 c70Var2 = this.f462735g;
            if (c70Var2 != null) {
                e17 += b36.f.i(4, c70Var2.mo75928xcd1e8d8());
            }
            r45.bq bqVar3 = this.f462736h;
            if (bqVar3 != null) {
                e17 += b36.f.i(5, bqVar3.mo75928xcd1e8d8());
            }
            r45.bq bqVar4 = this.f462737i;
            if (bqVar4 != null) {
                e17 += b36.f.i(6, bqVar4.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f462738m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f462739n;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f462740o;
            if (str12 != null) {
                e17 += b36.f.j(9, str12);
            }
            java.lang.String str13 = this.f462741p;
            if (str13 != null) {
                e17 += b36.f.j(10, str13);
            }
            java.lang.String str14 = this.f462742q;
            return str14 != null ? e17 + b36.f.j(11, str14) : e17;
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
        r45.na5 na5Var = (r45.na5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                na5Var.f462732d = aVar2.k(intValue);
                return 0;
            case 2:
                na5Var.f462733e = aVar2.k(intValue);
                return 0;
            case 3:
                na5Var.f462734f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.c70 c70Var3 = new r45.c70();
                    if (bArr != null && bArr.length > 0) {
                        c70Var3.mo11468x92b714fd(bArr);
                    }
                    na5Var.f462735g = c70Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.bq bqVar5 = new r45.bq();
                    if (bArr2 != null && bArr2.length > 0) {
                        bqVar5.mo11468x92b714fd(bArr2);
                    }
                    na5Var.f462736h = bqVar5;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.bq bqVar6 = new r45.bq();
                    if (bArr3 != null && bArr3.length > 0) {
                        bqVar6.mo11468x92b714fd(bArr3);
                    }
                    na5Var.f462737i = bqVar6;
                }
                return 0;
            case 7:
                na5Var.f462738m = aVar2.k(intValue);
                return 0;
            case 8:
                na5Var.f462739n = aVar2.k(intValue);
                return 0;
            case 9:
                na5Var.f462740o = aVar2.k(intValue);
                return 0;
            case 10:
                na5Var.f462741p = aVar2.k(intValue);
                return 0;
            case 11:
                na5Var.f462742q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
