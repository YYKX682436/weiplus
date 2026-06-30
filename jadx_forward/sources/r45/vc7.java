package r45;

/* loaded from: classes9.dex */
public class vc7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469646d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469647e;

    /* renamed from: f, reason: collision with root package name */
    public r45.k46 f469648f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f469649g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f469650h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ym6 f469651i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f469652m;

    /* renamed from: n, reason: collision with root package name */
    public int f469653n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f469654o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cz f469655p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vc7)) {
            return false;
        }
        r45.vc7 vc7Var = (r45.vc7) fVar;
        return n51.f.a(this.f469646d, vc7Var.f469646d) && n51.f.a(this.f469647e, vc7Var.f469647e) && n51.f.a(this.f469648f, vc7Var.f469648f) && n51.f.a(java.lang.Boolean.valueOf(this.f469649g), java.lang.Boolean.valueOf(vc7Var.f469649g)) && n51.f.a(java.lang.Boolean.valueOf(this.f469650h), java.lang.Boolean.valueOf(vc7Var.f469650h)) && n51.f.a(this.f469651i, vc7Var.f469651i) && n51.f.a(java.lang.Boolean.valueOf(this.f469652m), java.lang.Boolean.valueOf(vc7Var.f469652m)) && n51.f.a(java.lang.Integer.valueOf(this.f469653n), java.lang.Integer.valueOf(vc7Var.f469653n)) && n51.f.a(java.lang.Boolean.valueOf(this.f469654o), java.lang.Boolean.valueOf(vc7Var.f469654o)) && n51.f.a(this.f469655p, vc7Var.f469655p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469646d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469647e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.k46 k46Var = this.f469648f;
            if (k46Var != null) {
                fVar.i(3, k46Var.mo75928xcd1e8d8());
                this.f469648f.mo75956x3d5d1f78(fVar);
            }
            fVar.a(4, this.f469649g);
            fVar.a(5, this.f469650h);
            r45.ym6 ym6Var = this.f469651i;
            if (ym6Var != null) {
                fVar.i(6, ym6Var.mo75928xcd1e8d8());
                this.f469651i.mo75956x3d5d1f78(fVar);
            }
            fVar.a(7, this.f469652m);
            fVar.e(8, this.f469653n);
            fVar.a(9, this.f469654o);
            r45.cz czVar = this.f469655p;
            if (czVar != null) {
                fVar.i(10, czVar.mo75928xcd1e8d8());
                this.f469655p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f469646d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f469647e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            r45.k46 k46Var2 = this.f469648f;
            if (k46Var2 != null) {
                j17 += b36.f.i(3, k46Var2.mo75928xcd1e8d8());
            }
            int a17 = j17 + b36.f.a(4, this.f469649g) + b36.f.a(5, this.f469650h);
            r45.ym6 ym6Var2 = this.f469651i;
            if (ym6Var2 != null) {
                a17 += b36.f.i(6, ym6Var2.mo75928xcd1e8d8());
            }
            int a18 = a17 + b36.f.a(7, this.f469652m) + b36.f.e(8, this.f469653n) + b36.f.a(9, this.f469654o);
            r45.cz czVar2 = this.f469655p;
            return czVar2 != null ? a18 + b36.f.i(10, czVar2.mo75928xcd1e8d8()) : a18;
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
        r45.vc7 vc7Var = (r45.vc7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vc7Var.f469646d = aVar2.k(intValue);
                return 0;
            case 2:
                vc7Var.f469647e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.k46 k46Var3 = new r45.k46();
                    if (bArr != null && bArr.length > 0) {
                        k46Var3.mo11468x92b714fd(bArr);
                    }
                    vc7Var.f469648f = k46Var3;
                }
                return 0;
            case 4:
                vc7Var.f469649g = aVar2.c(intValue);
                return 0;
            case 5:
                vc7Var.f469650h = aVar2.c(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.ym6 ym6Var3 = new r45.ym6();
                    if (bArr2 != null && bArr2.length > 0) {
                        ym6Var3.mo11468x92b714fd(bArr2);
                    }
                    vc7Var.f469651i = ym6Var3;
                }
                return 0;
            case 7:
                vc7Var.f469652m = aVar2.c(intValue);
                return 0;
            case 8:
                vc7Var.f469653n = aVar2.g(intValue);
                return 0;
            case 9:
                vc7Var.f469654o = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.cz czVar3 = new r45.cz();
                    if (bArr3 != null && bArr3.length > 0) {
                        czVar3.mo11468x92b714fd(bArr3);
                    }
                    vc7Var.f469655p = czVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
