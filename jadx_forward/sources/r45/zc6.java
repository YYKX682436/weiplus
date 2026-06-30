package r45;

/* loaded from: classes12.dex */
public class zc6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f473443d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473444e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473445f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f473446g;

    /* renamed from: h, reason: collision with root package name */
    public int f473447h;

    /* renamed from: i, reason: collision with root package name */
    public int f473448i;

    /* renamed from: m, reason: collision with root package name */
    public int f473449m;

    /* renamed from: n, reason: collision with root package name */
    public int f473450n;

    /* renamed from: o, reason: collision with root package name */
    public r45.wc6 f473451o;

    /* renamed from: p, reason: collision with root package name */
    public r45.wc6 f473452p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zc6)) {
            return false;
        }
        r45.zc6 zc6Var = (r45.zc6) fVar;
        return n51.f.a(this.f76494x2de60e5e, zc6Var.f76494x2de60e5e) && n51.f.a(this.f473443d, zc6Var.f473443d) && n51.f.a(this.f473444e, zc6Var.f473444e) && n51.f.a(this.f473445f, zc6Var.f473445f) && n51.f.a(this.f473446g, zc6Var.f473446g) && n51.f.a(java.lang.Integer.valueOf(this.f473447h), java.lang.Integer.valueOf(zc6Var.f473447h)) && n51.f.a(java.lang.Integer.valueOf(this.f473448i), java.lang.Integer.valueOf(zc6Var.f473448i)) && n51.f.a(java.lang.Integer.valueOf(this.f473449m), java.lang.Integer.valueOf(zc6Var.f473449m)) && n51.f.a(java.lang.Integer.valueOf(this.f473450n), java.lang.Integer.valueOf(zc6Var.f473450n)) && n51.f.a(this.f473451o, zc6Var.f473451o) && n51.f.a(this.f473452p, zc6Var.f473452p);
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
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f473443d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f473444e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f473445f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f473446g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f473447h);
            fVar.e(7, this.f473448i);
            fVar.e(8, this.f473449m);
            fVar.e(9, this.f473450n);
            r45.wc6 wc6Var = this.f473451o;
            if (wc6Var != null) {
                fVar.i(10, wc6Var.mo75928xcd1e8d8());
                this.f473451o.mo75956x3d5d1f78(fVar);
            }
            r45.wc6 wc6Var2 = this.f473452p;
            if (wc6Var2 != null) {
                fVar.i(11, wc6Var2.mo75928xcd1e8d8());
                this.f473452p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f473443d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            java.lang.String str4 = this.f473444e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f473445f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f473446g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            int e17 = i18 + b36.f.e(6, this.f473447h) + b36.f.e(7, this.f473448i) + b36.f.e(8, this.f473449m) + b36.f.e(9, this.f473450n);
            r45.wc6 wc6Var3 = this.f473451o;
            if (wc6Var3 != null) {
                e17 += b36.f.i(10, wc6Var3.mo75928xcd1e8d8());
            }
            r45.wc6 wc6Var4 = this.f473452p;
            return wc6Var4 != null ? e17 + b36.f.i(11, wc6Var4.mo75928xcd1e8d8()) : e17;
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
        r45.zc6 zc6Var = (r45.zc6) objArr[1];
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
                    zc6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                zc6Var.f473443d = aVar2.d(intValue);
                return 0;
            case 3:
                zc6Var.f473444e = aVar2.k(intValue);
                return 0;
            case 4:
                zc6Var.f473445f = aVar2.k(intValue);
                return 0;
            case 5:
                zc6Var.f473446g = aVar2.k(intValue);
                return 0;
            case 6:
                zc6Var.f473447h = aVar2.g(intValue);
                return 0;
            case 7:
                zc6Var.f473448i = aVar2.g(intValue);
                return 0;
            case 8:
                zc6Var.f473449m = aVar2.g(intValue);
                return 0;
            case 9:
                zc6Var.f473450n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.wc6 wc6Var5 = new r45.wc6();
                    if (bArr2 != null && bArr2.length > 0) {
                        wc6Var5.mo11468x92b714fd(bArr2);
                    }
                    zc6Var.f473451o = wc6Var5;
                }
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.wc6 wc6Var6 = new r45.wc6();
                    if (bArr3 != null && bArr3.length > 0) {
                        wc6Var6.mo11468x92b714fd(bArr3);
                    }
                    zc6Var.f473452p = wc6Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
