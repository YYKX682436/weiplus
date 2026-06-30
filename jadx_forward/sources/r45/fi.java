package r45;

/* loaded from: classes11.dex */
public class fi extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f455895d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455896e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455897f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455898g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455899h;

    /* renamed from: i, reason: collision with root package name */
    public int f455900i;

    /* renamed from: m, reason: collision with root package name */
    public r45.du5 f455901m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cu5 f455902n;

    /* renamed from: o, reason: collision with root package name */
    public int f455903o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f455904p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f455905q;

    /* renamed from: r, reason: collision with root package name */
    public r45.cu5 f455906r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fi)) {
            return false;
        }
        r45.fi fiVar = (r45.fi) fVar;
        return n51.f.a(this.f76494x2de60e5e, fiVar.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f455895d), java.lang.Integer.valueOf(fiVar.f455895d)) && n51.f.a(this.f455896e, fiVar.f455896e) && n51.f.a(this.f455897f, fiVar.f455897f) && n51.f.a(this.f455898g, fiVar.f455898g) && n51.f.a(this.f455899h, fiVar.f455899h) && n51.f.a(java.lang.Integer.valueOf(this.f455900i), java.lang.Integer.valueOf(fiVar.f455900i)) && n51.f.a(this.f455901m, fiVar.f455901m) && n51.f.a(this.f455902n, fiVar.f455902n) && n51.f.a(java.lang.Integer.valueOf(this.f455903o), java.lang.Integer.valueOf(fiVar.f455903o)) && n51.f.a(this.f455904p, fiVar.f455904p) && n51.f.a(this.f455905q, fiVar.f455905q) && n51.f.a(this.f455906r, fiVar.f455906r);
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
            fVar.e(2, this.f455895d);
            java.lang.String str = this.f455896e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f455897f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f455898g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f455899h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f455900i);
            r45.du5 du5Var = this.f455901m;
            if (du5Var != null) {
                fVar.i(8, du5Var.mo75928xcd1e8d8());
                this.f455901m.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var = this.f455902n;
            if (cu5Var != null) {
                fVar.i(9, cu5Var.mo75928xcd1e8d8());
                this.f455902n.mo75956x3d5d1f78(fVar);
            }
            fVar.e(10, this.f455903o);
            java.lang.String str5 = this.f455904p;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f455905q;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            r45.cu5 cu5Var2 = this.f455906r;
            if (cu5Var2 == null) {
                return 0;
            }
            fVar.i(13, cu5Var2.mo75928xcd1e8d8());
            this.f455906r.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f455895d);
            java.lang.String str7 = this.f455896e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f455897f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f455898g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f455899h;
            if (str10 != null) {
                i18 += b36.f.j(6, str10);
            }
            int e17 = i18 + b36.f.e(7, this.f455900i);
            r45.du5 du5Var2 = this.f455901m;
            if (du5Var2 != null) {
                e17 += b36.f.i(8, du5Var2.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var3 = this.f455902n;
            if (cu5Var3 != null) {
                e17 += b36.f.i(9, cu5Var3.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(10, this.f455903o);
            java.lang.String str11 = this.f455904p;
            if (str11 != null) {
                e18 += b36.f.j(11, str11);
            }
            java.lang.String str12 = this.f455905q;
            if (str12 != null) {
                e18 += b36.f.j(12, str12);
            }
            r45.cu5 cu5Var4 = this.f455906r;
            return cu5Var4 != null ? e18 + b36.f.i(13, cu5Var4.mo75928xcd1e8d8()) : e18;
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
        r45.fi fiVar = (r45.fi) objArr[1];
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
                    fiVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                fiVar.f455895d = aVar2.g(intValue);
                return 0;
            case 3:
                fiVar.f455896e = aVar2.k(intValue);
                return 0;
            case 4:
                fiVar.f455897f = aVar2.k(intValue);
                return 0;
            case 5:
                fiVar.f455898g = aVar2.k(intValue);
                return 0;
            case 6:
                fiVar.f455899h = aVar2.k(intValue);
                return 0;
            case 7:
                fiVar.f455900i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var3.b(bArr2);
                    }
                    fiVar.f455901m = du5Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var5.b(bArr3);
                    }
                    fiVar.f455902n = cu5Var5;
                }
                return 0;
            case 10:
                fiVar.f455903o = aVar2.g(intValue);
                return 0;
            case 11:
                fiVar.f455904p = aVar2.k(intValue);
                return 0;
            case 12:
                fiVar.f455905q = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var6.b(bArr4);
                    }
                    fiVar.f455906r = cu5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
