package r45;

/* loaded from: classes8.dex */
public class xg5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f471609d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471610e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f471611f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471612g;

    /* renamed from: h, reason: collision with root package name */
    public r45.e1 f471613h;

    /* renamed from: i, reason: collision with root package name */
    public r45.bm6 f471614i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ra5 f471615m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f471616n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f471617o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xg5)) {
            return false;
        }
        r45.xg5 xg5Var = (r45.xg5) fVar;
        return n51.f.a(this.f76492x92037252, xg5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f471609d), java.lang.Integer.valueOf(xg5Var.f471609d)) && n51.f.a(this.f471610e, xg5Var.f471610e) && n51.f.a(this.f471611f, xg5Var.f471611f) && n51.f.a(this.f471612g, xg5Var.f471612g) && n51.f.a(this.f471613h, xg5Var.f471613h) && n51.f.a(this.f471614i, xg5Var.f471614i) && n51.f.a(this.f471615m, xg5Var.f471615m) && n51.f.a(this.f471616n, xg5Var.f471616n) && n51.f.a(this.f471617o, xg5Var.f471617o);
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
            fVar.e(2, this.f471609d);
            java.lang.String str = this.f471610e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f471611f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f471612g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.e1 e1Var = this.f471613h;
            if (e1Var != null) {
                fVar.i(6, e1Var.mo75928xcd1e8d8());
                this.f471613h.mo75956x3d5d1f78(fVar);
            }
            r45.bm6 bm6Var = this.f471614i;
            if (bm6Var != null) {
                fVar.i(7, bm6Var.mo75928xcd1e8d8());
                this.f471614i.mo75956x3d5d1f78(fVar);
            }
            r45.ra5 ra5Var = this.f471615m;
            if (ra5Var != null) {
                fVar.i(8, ra5Var.mo75928xcd1e8d8());
                this.f471615m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f471616n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f471617o;
            if (str5 != null) {
                fVar.j(100, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f471609d);
            java.lang.String str6 = this.f471610e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f471611f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f471612g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            r45.e1 e1Var2 = this.f471613h;
            if (e1Var2 != null) {
                i18 += b36.f.i(6, e1Var2.mo75928xcd1e8d8());
            }
            r45.bm6 bm6Var2 = this.f471614i;
            if (bm6Var2 != null) {
                i18 += b36.f.i(7, bm6Var2.mo75928xcd1e8d8());
            }
            r45.ra5 ra5Var2 = this.f471615m;
            if (ra5Var2 != null) {
                i18 += b36.f.i(8, ra5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f471616n;
            if (str9 != null) {
                i18 += b36.f.j(9, str9);
            }
            java.lang.String str10 = this.f471617o;
            return str10 != null ? i18 + b36.f.j(100, str10) : i18;
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
        r45.xg5 xg5Var = (r45.xg5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            xg5Var.f471617o = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    xg5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                xg5Var.f471609d = aVar2.g(intValue);
                return 0;
            case 3:
                xg5Var.f471610e = aVar2.k(intValue);
                return 0;
            case 4:
                xg5Var.f471611f = aVar2.k(intValue);
                return 0;
            case 5:
                xg5Var.f471612g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.e1 e1Var3 = new r45.e1();
                    if (bArr2 != null && bArr2.length > 0) {
                        e1Var3.mo11468x92b714fd(bArr2);
                    }
                    xg5Var.f471613h = e1Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.bm6 bm6Var3 = new r45.bm6();
                    if (bArr3 != null && bArr3.length > 0) {
                        bm6Var3.mo11468x92b714fd(bArr3);
                    }
                    xg5Var.f471614i = bm6Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.ra5 ra5Var3 = new r45.ra5();
                    if (bArr4 != null && bArr4.length > 0) {
                        ra5Var3.mo11468x92b714fd(bArr4);
                    }
                    xg5Var.f471615m = ra5Var3;
                }
                return 0;
            case 9:
                xg5Var.f471616n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
