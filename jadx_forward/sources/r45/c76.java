package r45;

/* loaded from: classes4.dex */
public class c76 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.l76 f452884d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452885e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f452886f;

    /* renamed from: g, reason: collision with root package name */
    public int f452887g;

    /* renamed from: h, reason: collision with root package name */
    public r45.du5 f452888h;

    /* renamed from: i, reason: collision with root package name */
    public int f452889i;

    /* renamed from: m, reason: collision with root package name */
    public int f452890m;

    /* renamed from: n, reason: collision with root package name */
    public int f452891n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f452892o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f452893p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c76)) {
            return false;
        }
        r45.c76 c76Var = (r45.c76) fVar;
        return n51.f.a(this.f76494x2de60e5e, c76Var.f76494x2de60e5e) && n51.f.a(this.f452884d, c76Var.f452884d) && n51.f.a(this.f452885e, c76Var.f452885e) && n51.f.a(this.f452886f, c76Var.f452886f) && n51.f.a(java.lang.Integer.valueOf(this.f452887g), java.lang.Integer.valueOf(c76Var.f452887g)) && n51.f.a(this.f452888h, c76Var.f452888h) && n51.f.a(java.lang.Integer.valueOf(this.f452889i), java.lang.Integer.valueOf(c76Var.f452889i)) && n51.f.a(java.lang.Integer.valueOf(this.f452890m), java.lang.Integer.valueOf(c76Var.f452890m)) && n51.f.a(java.lang.Integer.valueOf(this.f452891n), java.lang.Integer.valueOf(c76Var.f452891n)) && n51.f.a(this.f452892o, c76Var.f452892o) && n51.f.a(this.f452893p, c76Var.f452893p);
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
            r45.l76 l76Var = this.f452884d;
            if (l76Var != null) {
                fVar.i(2, l76Var.mo75928xcd1e8d8());
                this.f452884d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f452885e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.du5 du5Var = this.f452886f;
            if (du5Var != null) {
                fVar.i(4, du5Var.mo75928xcd1e8d8());
                this.f452886f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f452887g);
            r45.du5 du5Var2 = this.f452888h;
            if (du5Var2 != null) {
                fVar.i(6, du5Var2.mo75928xcd1e8d8());
                this.f452888h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f452889i);
            fVar.e(8, this.f452890m);
            fVar.e(9, this.f452891n);
            java.lang.String str2 = this.f452892o;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f452893p;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.l76 l76Var2 = this.f452884d;
            if (l76Var2 != null) {
                i18 += b36.f.i(2, l76Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f452885e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            r45.du5 du5Var3 = this.f452886f;
            if (du5Var3 != null) {
                i18 += b36.f.i(4, du5Var3.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(5, this.f452887g);
            r45.du5 du5Var4 = this.f452888h;
            if (du5Var4 != null) {
                e17 += b36.f.i(6, du5Var4.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(7, this.f452889i) + b36.f.e(8, this.f452890m) + b36.f.e(9, this.f452891n);
            java.lang.String str5 = this.f452892o;
            if (str5 != null) {
                e18 += b36.f.j(10, str5);
            }
            java.lang.String str6 = this.f452893p;
            return str6 != null ? e18 + b36.f.j(11, str6) : e18;
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
        r45.c76 c76Var = (r45.c76) objArr[1];
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
                    c76Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.l76 l76Var3 = new r45.l76();
                    if (bArr2 != null && bArr2.length > 0) {
                        l76Var3.mo11468x92b714fd(bArr2);
                    }
                    c76Var.f452884d = l76Var3;
                }
                return 0;
            case 3:
                c76Var.f452885e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var5.b(bArr3);
                    }
                    c76Var.f452886f = du5Var5;
                }
                return 0;
            case 5:
                c76Var.f452887g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var6.b(bArr4);
                    }
                    c76Var.f452888h = du5Var6;
                }
                return 0;
            case 7:
                c76Var.f452889i = aVar2.g(intValue);
                return 0;
            case 8:
                c76Var.f452890m = aVar2.g(intValue);
                return 0;
            case 9:
                c76Var.f452891n = aVar2.g(intValue);
                return 0;
            case 10:
                c76Var.f452892o = aVar2.k(intValue);
                return 0;
            case 11:
                c76Var.f452893p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
