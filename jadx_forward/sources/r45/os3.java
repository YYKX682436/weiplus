package r45;

/* loaded from: classes7.dex */
public class os3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f464013d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464014e;

    /* renamed from: f, reason: collision with root package name */
    public int f464015f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464016g;

    /* renamed from: h, reason: collision with root package name */
    public int f464017h;

    /* renamed from: i, reason: collision with root package name */
    public int f464018i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464019m;

    /* renamed from: n, reason: collision with root package name */
    public r45.q35 f464020n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f464021o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public int f464022p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f464023q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f464024r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f464025s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f464026t;

    /* renamed from: u, reason: collision with root package name */
    public int f464027u;

    /* renamed from: v, reason: collision with root package name */
    public r45.y50 f464028v;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.os3)) {
            return false;
        }
        r45.os3 os3Var = (r45.os3) fVar;
        return n51.f.a(this.f76494x2de60e5e, os3Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f464013d), java.lang.Integer.valueOf(os3Var.f464013d)) && n51.f.a(this.f464014e, os3Var.f464014e) && n51.f.a(java.lang.Integer.valueOf(this.f464015f), java.lang.Integer.valueOf(os3Var.f464015f)) && n51.f.a(this.f464016g, os3Var.f464016g) && n51.f.a(java.lang.Integer.valueOf(this.f464017h), java.lang.Integer.valueOf(os3Var.f464017h)) && n51.f.a(java.lang.Integer.valueOf(this.f464018i), java.lang.Integer.valueOf(os3Var.f464018i)) && n51.f.a(this.f464019m, os3Var.f464019m) && n51.f.a(this.f464020n, os3Var.f464020n) && n51.f.a(this.f464021o, os3Var.f464021o) && n51.f.a(java.lang.Integer.valueOf(this.f464022p), java.lang.Integer.valueOf(os3Var.f464022p)) && n51.f.a(this.f464023q, os3Var.f464023q) && n51.f.a(this.f464024r, os3Var.f464024r) && n51.f.a(java.lang.Boolean.valueOf(this.f464025s), java.lang.Boolean.valueOf(os3Var.f464025s)) && n51.f.a(java.lang.Boolean.valueOf(this.f464026t), java.lang.Boolean.valueOf(os3Var.f464026t)) && n51.f.a(java.lang.Integer.valueOf(this.f464027u), java.lang.Integer.valueOf(os3Var.f464027u)) && n51.f.a(this.f464028v, os3Var.f464028v);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464021o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f464013d);
            java.lang.String str = this.f464014e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f464015f);
            java.lang.String str2 = this.f464016g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f464017h);
            fVar.e(7, this.f464018i);
            java.lang.String str3 = this.f464019m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            r45.q35 q35Var = this.f464020n;
            if (q35Var != null) {
                fVar.i(10, q35Var.mo75928xcd1e8d8());
                this.f464020n.mo75956x3d5d1f78(fVar);
            }
            fVar.g(12, 8, linkedList);
            fVar.e(13, this.f464022p);
            java.lang.String str4 = this.f464023q;
            if (str4 != null) {
                fVar.j(14, str4);
            }
            java.lang.String str5 = this.f464024r;
            if (str5 != null) {
                fVar.j(15, str5);
            }
            fVar.a(16, this.f464025s);
            fVar.a(17, this.f464026t);
            fVar.e(18, this.f464027u);
            r45.y50 y50Var = this.f464028v;
            if (y50Var != null) {
                fVar.i(19, y50Var.mo75928xcd1e8d8());
                this.f464028v.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f464013d);
            java.lang.String str6 = this.f464014e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f464015f);
            java.lang.String str7 = this.f464016g;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            int e18 = e17 + b36.f.e(6, this.f464017h) + b36.f.e(7, this.f464018i);
            java.lang.String str8 = this.f464019m;
            if (str8 != null) {
                e18 += b36.f.j(8, str8);
            }
            r45.q35 q35Var2 = this.f464020n;
            if (q35Var2 != null) {
                e18 += b36.f.i(10, q35Var2.mo75928xcd1e8d8());
            }
            int g17 = e18 + b36.f.g(12, 8, linkedList) + b36.f.e(13, this.f464022p);
            java.lang.String str9 = this.f464023q;
            if (str9 != null) {
                g17 += b36.f.j(14, str9);
            }
            java.lang.String str10 = this.f464024r;
            if (str10 != null) {
                g17 += b36.f.j(15, str10);
            }
            int a17 = g17 + b36.f.a(16, this.f464025s) + b36.f.a(17, this.f464026t) + b36.f.e(18, this.f464027u);
            r45.y50 y50Var2 = this.f464028v;
            return y50Var2 != null ? a17 + b36.f.i(19, y50Var2.mo75928xcd1e8d8()) : a17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.os3 os3Var = (r45.os3) objArr[1];
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
                    os3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                os3Var.f464013d = aVar2.g(intValue);
                return 0;
            case 3:
                os3Var.f464014e = aVar2.k(intValue);
                return 0;
            case 4:
                os3Var.f464015f = aVar2.g(intValue);
                return 0;
            case 5:
                os3Var.f464016g = aVar2.k(intValue);
                return 0;
            case 6:
                os3Var.f464017h = aVar2.g(intValue);
                return 0;
            case 7:
                os3Var.f464018i = aVar2.g(intValue);
                return 0;
            case 8:
                os3Var.f464019m = aVar2.k(intValue);
                return 0;
            case 9:
            case 11:
            default:
                return -1;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.q35 q35Var3 = new r45.q35();
                    if (bArr3 != null && bArr3.length > 0) {
                        q35Var3.mo11468x92b714fd(bArr3);
                    }
                    os3Var.f464020n = q35Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.yp4 yp4Var = new r45.yp4();
                    if (bArr4 != null && bArr4.length > 0) {
                        yp4Var.mo11468x92b714fd(bArr4);
                    }
                    os3Var.f464021o.add(yp4Var);
                }
                return 0;
            case 13:
                os3Var.f464022p = aVar2.g(intValue);
                return 0;
            case 14:
                os3Var.f464023q = aVar2.k(intValue);
                return 0;
            case 15:
                os3Var.f464024r = aVar2.k(intValue);
                return 0;
            case 16:
                os3Var.f464025s = aVar2.c(intValue);
                return 0;
            case 17:
                os3Var.f464026t = aVar2.c(intValue);
                return 0;
            case 18:
                os3Var.f464027u = aVar2.g(intValue);
                return 0;
            case 19:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.y50 y50Var3 = new r45.y50();
                    if (bArr5 != null && bArr5.length > 0) {
                        y50Var3.mo11468x92b714fd(bArr5);
                    }
                    os3Var.f464028v = y50Var3;
                }
                return 0;
        }
    }
}
