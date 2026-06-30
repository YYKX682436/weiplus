package r45;

/* loaded from: classes12.dex */
public class tc extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f467816d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f467817e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467818f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467819g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467820h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f467821i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f467822m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f467823n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f467824o;

    /* renamed from: p, reason: collision with root package name */
    public int f467825p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cu5 f467826q;

    /* renamed from: r, reason: collision with root package name */
    public r45.cu5 f467827r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tc)) {
            return false;
        }
        r45.tc tcVar = (r45.tc) fVar;
        return n51.f.a(this.f76494x2de60e5e, tcVar.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f467816d), java.lang.Integer.valueOf(tcVar.f467816d)) && n51.f.a(this.f467817e, tcVar.f467817e) && n51.f.a(this.f467818f, tcVar.f467818f) && n51.f.a(this.f467819g, tcVar.f467819g) && n51.f.a(this.f467820h, tcVar.f467820h) && n51.f.a(this.f467821i, tcVar.f467821i) && n51.f.a(this.f467822m, tcVar.f467822m) && n51.f.a(this.f467823n, tcVar.f467823n) && n51.f.a(this.f467824o, tcVar.f467824o) && n51.f.a(java.lang.Integer.valueOf(this.f467825p), java.lang.Integer.valueOf(tcVar.f467825p)) && n51.f.a(this.f467826q, tcVar.f467826q) && n51.f.a(this.f467827r, tcVar.f467827r);
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
            fVar.e(2, this.f467816d);
            r45.cu5 cu5Var = this.f467817e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f467817e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f467818f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f467819g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f467820h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f467821i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f467822m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f467823n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f467824o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            fVar.e(11, this.f467825p);
            r45.cu5 cu5Var2 = this.f467826q;
            if (cu5Var2 != null) {
                fVar.i(12, cu5Var2.mo75928xcd1e8d8());
                this.f467826q.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var3 = this.f467827r;
            if (cu5Var3 == null) {
                return 0;
            }
            fVar.i(13, cu5Var3.mo75928xcd1e8d8());
            this.f467827r.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f467816d);
            r45.cu5 cu5Var4 = this.f467817e;
            if (cu5Var4 != null) {
                i18 += b36.f.i(3, cu5Var4.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f467818f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f467819g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f467820h;
            if (str10 != null) {
                i18 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f467821i;
            if (str11 != null) {
                i18 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f467822m;
            if (str12 != null) {
                i18 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f467823n;
            if (str13 != null) {
                i18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f467824o;
            if (str14 != null) {
                i18 += b36.f.j(10, str14);
            }
            int e17 = i18 + b36.f.e(11, this.f467825p);
            r45.cu5 cu5Var5 = this.f467826q;
            if (cu5Var5 != null) {
                e17 += b36.f.i(12, cu5Var5.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var6 = this.f467827r;
            return cu5Var6 != null ? e17 + b36.f.i(13, cu5Var6.mo75928xcd1e8d8()) : e17;
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
        r45.tc tcVar = (r45.tc) objArr[1];
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
                    tcVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                tcVar.f467816d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var7 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var7.b(bArr2);
                    }
                    tcVar.f467817e = cu5Var7;
                }
                return 0;
            case 4:
                tcVar.f467818f = aVar2.k(intValue);
                return 0;
            case 5:
                tcVar.f467819g = aVar2.k(intValue);
                return 0;
            case 6:
                tcVar.f467820h = aVar2.k(intValue);
                return 0;
            case 7:
                tcVar.f467821i = aVar2.k(intValue);
                return 0;
            case 8:
                tcVar.f467822m = aVar2.k(intValue);
                return 0;
            case 9:
                tcVar.f467823n = aVar2.k(intValue);
                return 0;
            case 10:
                tcVar.f467824o = aVar2.k(intValue);
                return 0;
            case 11:
                tcVar.f467825p = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var8 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var8.b(bArr3);
                    }
                    tcVar.f467826q = cu5Var8;
                }
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var9.b(bArr4);
                    }
                    tcVar.f467827r = cu5Var9;
                }
                return 0;
            default:
                return -1;
        }
    }
}
