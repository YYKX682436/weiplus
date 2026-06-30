package r45;

/* loaded from: classes8.dex */
public class da0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453794d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453795e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453796f;

    /* renamed from: g, reason: collision with root package name */
    public r45.d64 f453797g;

    /* renamed from: h, reason: collision with root package name */
    public int f453798h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f453799i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f453800m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f453801n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.da0)) {
            return false;
        }
        r45.da0 da0Var = (r45.da0) fVar;
        return n51.f.a(this.f76494x2de60e5e, da0Var.f76494x2de60e5e) && n51.f.a(this.f453794d, da0Var.f453794d) && n51.f.a(this.f453795e, da0Var.f453795e) && n51.f.a(this.f453796f, da0Var.f453796f) && n51.f.a(this.f453797g, da0Var.f453797g) && n51.f.a(java.lang.Integer.valueOf(this.f453798h), java.lang.Integer.valueOf(da0Var.f453798h)) && n51.f.a(this.f453799i, da0Var.f453799i) && n51.f.a(this.f453800m, da0Var.f453800m) && n51.f.a(this.f453801n, da0Var.f453801n);
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
            java.lang.String str = this.f453794d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f453795e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f453796f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            r45.d64 d64Var = this.f453797g;
            if (d64Var != null) {
                fVar.i(5, d64Var.mo75928xcd1e8d8());
                this.f453797g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f453798h);
            fVar.g(7, 8, this.f453799i);
            java.lang.String str4 = this.f453800m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f453801n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str6 = this.f453794d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f453795e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f453796f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            r45.d64 d64Var2 = this.f453797g;
            if (d64Var2 != null) {
                i18 += b36.f.i(5, d64Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(6, this.f453798h) + b36.f.g(7, 8, this.f453799i);
            java.lang.String str9 = this.f453800m;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f453801n;
            return str10 != null ? e17 + b36.f.j(9, str10) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f453799i.clear();
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
        r45.da0 da0Var = (r45.da0) objArr[1];
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
                    da0Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                da0Var.f453794d = aVar2.k(intValue);
                return 0;
            case 3:
                da0Var.f453795e = aVar2.k(intValue);
                return 0;
            case 4:
                da0Var.f453796f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.d64 d64Var3 = new r45.d64();
                    if (bArr3 != null && bArr3.length > 0) {
                        d64Var3.mo11468x92b714fd(bArr3);
                    }
                    da0Var.f453797g = d64Var3;
                }
                return 0;
            case 6:
                da0Var.f453798h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var.b(bArr4);
                    }
                    da0Var.f453799i.add(du5Var);
                }
                return 0;
            case 8:
                da0Var.f453800m = aVar2.k(intValue);
                return 0;
            case 9:
                da0Var.f453801n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
