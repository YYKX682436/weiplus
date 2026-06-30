package r45;

/* loaded from: classes12.dex */
public class bu6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f452602d;

    /* renamed from: e, reason: collision with root package name */
    public int f452603e;

    /* renamed from: f, reason: collision with root package name */
    public int f452604f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f452605g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452606h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452607i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f452608m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f452609n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f452610o;

    /* renamed from: p, reason: collision with root package name */
    public int f452611p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bu6)) {
            return false;
        }
        r45.bu6 bu6Var = (r45.bu6) fVar;
        return n51.f.a(this.f76494x2de60e5e, bu6Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f452602d), java.lang.Integer.valueOf(bu6Var.f452602d)) && n51.f.a(java.lang.Integer.valueOf(this.f452603e), java.lang.Integer.valueOf(bu6Var.f452603e)) && n51.f.a(java.lang.Integer.valueOf(this.f452604f), java.lang.Integer.valueOf(bu6Var.f452604f)) && n51.f.a(this.f452605g, bu6Var.f452605g) && n51.f.a(this.f452606h, bu6Var.f452606h) && n51.f.a(this.f452607i, bu6Var.f452607i) && n51.f.a(this.f452608m, bu6Var.f452608m) && n51.f.a(this.f452609n, bu6Var.f452609n) && n51.f.a(this.f452610o, bu6Var.f452610o) && n51.f.a(java.lang.Integer.valueOf(this.f452611p), java.lang.Integer.valueOf(bu6Var.f452611p));
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
            fVar.e(2, this.f452602d);
            fVar.e(3, this.f452603e);
            fVar.e(4, this.f452604f);
            r45.cu5 cu5Var = this.f452605g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.mo75928xcd1e8d8());
                this.f452605g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f452606h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f452607i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            r45.cu5 cu5Var2 = this.f452608m;
            if (cu5Var2 != null) {
                fVar.i(8, cu5Var2.mo75928xcd1e8d8());
                this.f452608m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f452609n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f452610o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            fVar.e(11, this.f452611p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f452602d) + b36.f.e(3, this.f452603e) + b36.f.e(4, this.f452604f);
            r45.cu5 cu5Var3 = this.f452605g;
            if (cu5Var3 != null) {
                i18 += b36.f.i(5, cu5Var3.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f452606h;
            if (str5 != null) {
                i18 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f452607i;
            if (str6 != null) {
                i18 += b36.f.j(7, str6);
            }
            r45.cu5 cu5Var4 = this.f452608m;
            if (cu5Var4 != null) {
                i18 += b36.f.i(8, cu5Var4.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f452609n;
            if (str7 != null) {
                i18 += b36.f.j(9, str7);
            }
            java.lang.String str8 = this.f452610o;
            if (str8 != null) {
                i18 += b36.f.j(10, str8);
            }
            return i18 + b36.f.e(11, this.f452611p);
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
        r45.bu6 bu6Var = (r45.bu6) objArr[1];
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
                    bu6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                bu6Var.f452602d = aVar2.g(intValue);
                return 0;
            case 3:
                bu6Var.f452603e = aVar2.g(intValue);
                return 0;
            case 4:
                bu6Var.f452604f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    bu6Var.f452605g = cu5Var5;
                }
                return 0;
            case 6:
                bu6Var.f452606h = aVar2.k(intValue);
                return 0;
            case 7:
                bu6Var.f452607i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    bu6Var.f452608m = cu5Var6;
                }
                return 0;
            case 9:
                bu6Var.f452609n = aVar2.k(intValue);
                return 0;
            case 10:
                bu6Var.f452610o = aVar2.k(intValue);
                return 0;
            case 11:
                bu6Var.f452611p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
