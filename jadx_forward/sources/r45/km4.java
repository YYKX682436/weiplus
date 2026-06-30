package r45;

/* loaded from: classes10.dex */
public class km4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460354d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460355e;

    /* renamed from: f, reason: collision with root package name */
    public int f460356f;

    /* renamed from: g, reason: collision with root package name */
    public int f460357g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460358h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460359i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460360m;

    /* renamed from: n, reason: collision with root package name */
    public r45.vl4 f460361n;

    /* renamed from: o, reason: collision with root package name */
    public r45.hm4 f460362o;

    /* renamed from: p, reason: collision with root package name */
    public r45.jm4 f460363p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.km4)) {
            return false;
        }
        r45.km4 km4Var = (r45.km4) fVar;
        return n51.f.a(this.f460354d, km4Var.f460354d) && n51.f.a(this.f460355e, km4Var.f460355e) && n51.f.a(java.lang.Integer.valueOf(this.f460356f), java.lang.Integer.valueOf(km4Var.f460356f)) && n51.f.a(java.lang.Integer.valueOf(this.f460357g), java.lang.Integer.valueOf(km4Var.f460357g)) && n51.f.a(this.f460358h, km4Var.f460358h) && n51.f.a(this.f460359i, km4Var.f460359i) && n51.f.a(this.f460360m, km4Var.f460360m) && n51.f.a(this.f460361n, km4Var.f460361n) && n51.f.a(this.f460362o, km4Var.f460362o) && n51.f.a(this.f460363p, km4Var.f460363p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460354d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460355e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f460356f);
            fVar.e(4, this.f460357g);
            java.lang.String str3 = this.f460358h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f460359i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f460360m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            r45.vl4 vl4Var = this.f460361n;
            if (vl4Var != null) {
                fVar.i(8, vl4Var.mo75928xcd1e8d8());
                this.f460361n.mo75956x3d5d1f78(fVar);
            }
            r45.hm4 hm4Var = this.f460362o;
            if (hm4Var != null) {
                fVar.i(9, hm4Var.mo75928xcd1e8d8());
                this.f460362o.mo75956x3d5d1f78(fVar);
            }
            r45.jm4 jm4Var = this.f460363p;
            if (jm4Var != null) {
                fVar.i(10, jm4Var.mo75928xcd1e8d8());
                this.f460363p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f460354d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f460355e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f460356f) + b36.f.e(4, this.f460357g);
            java.lang.String str8 = this.f460358h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f460359i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f460360m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            r45.vl4 vl4Var2 = this.f460361n;
            if (vl4Var2 != null) {
                e17 += b36.f.i(8, vl4Var2.mo75928xcd1e8d8());
            }
            r45.hm4 hm4Var2 = this.f460362o;
            if (hm4Var2 != null) {
                e17 += b36.f.i(9, hm4Var2.mo75928xcd1e8d8());
            }
            r45.jm4 jm4Var2 = this.f460363p;
            return jm4Var2 != null ? e17 + b36.f.i(10, jm4Var2.mo75928xcd1e8d8()) : e17;
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
        r45.km4 km4Var = (r45.km4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                km4Var.f460354d = aVar2.k(intValue);
                return 0;
            case 2:
                km4Var.f460355e = aVar2.k(intValue);
                return 0;
            case 3:
                km4Var.f460356f = aVar2.g(intValue);
                return 0;
            case 4:
                km4Var.f460357g = aVar2.g(intValue);
                return 0;
            case 5:
                km4Var.f460358h = aVar2.k(intValue);
                return 0;
            case 6:
                km4Var.f460359i = aVar2.k(intValue);
                return 0;
            case 7:
                km4Var.f460360m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.vl4 vl4Var3 = new r45.vl4();
                    if (bArr != null && bArr.length > 0) {
                        vl4Var3.mo11468x92b714fd(bArr);
                    }
                    km4Var.f460361n = vl4Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.hm4 hm4Var3 = new r45.hm4();
                    if (bArr2 != null && bArr2.length > 0) {
                        hm4Var3.mo11468x92b714fd(bArr2);
                    }
                    km4Var.f460362o = hm4Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.jm4 jm4Var3 = new r45.jm4();
                    if (bArr3 != null && bArr3.length > 0) {
                        jm4Var3.mo11468x92b714fd(bArr3);
                    }
                    km4Var.f460363p = jm4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
