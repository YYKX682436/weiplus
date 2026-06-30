package r45;

/* loaded from: classes7.dex */
public class lx4 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461468e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461469f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461470g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f461471h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f461472i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f461473m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f461475o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f461476p;

    /* renamed from: q, reason: collision with root package name */
    public int f461477q;

    /* renamed from: r, reason: collision with root package name */
    public int f461478r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f461479s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f461480t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f461481u;

    /* renamed from: v, reason: collision with root package name */
    public r45.qx4 f461482v;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f461467d = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f461474n = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lx4)) {
            return false;
        }
        r45.lx4 lx4Var = (r45.lx4) fVar;
        return n51.f.a(this.f76492x92037252, lx4Var.f76492x92037252) && n51.f.a(this.f461467d, lx4Var.f461467d) && n51.f.a(this.f461468e, lx4Var.f461468e) && n51.f.a(this.f461469f, lx4Var.f461469f) && n51.f.a(this.f461470g, lx4Var.f461470g) && n51.f.a(java.lang.Boolean.valueOf(this.f461471h), java.lang.Boolean.valueOf(lx4Var.f461471h)) && n51.f.a(java.lang.Boolean.valueOf(this.f461472i), java.lang.Boolean.valueOf(lx4Var.f461472i)) && n51.f.a(java.lang.Boolean.valueOf(this.f461473m), java.lang.Boolean.valueOf(lx4Var.f461473m)) && n51.f.a(this.f461474n, lx4Var.f461474n) && n51.f.a(java.lang.Boolean.valueOf(this.f461475o), java.lang.Boolean.valueOf(lx4Var.f461475o)) && n51.f.a(java.lang.Boolean.valueOf(this.f461476p), java.lang.Boolean.valueOf(lx4Var.f461476p)) && n51.f.a(java.lang.Integer.valueOf(this.f461477q), java.lang.Integer.valueOf(lx4Var.f461477q)) && n51.f.a(java.lang.Integer.valueOf(this.f461478r), java.lang.Integer.valueOf(lx4Var.f461478r)) && n51.f.a(this.f461479s, lx4Var.f461479s) && n51.f.a(this.f461480t, lx4Var.f461480t) && n51.f.a(java.lang.Boolean.valueOf(this.f461481u), java.lang.Boolean.valueOf(lx4Var.f461481u)) && n51.f.a(this.f461482v, lx4Var.f461482v);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461474n;
        java.util.LinkedList linkedList2 = this.f461467d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList2);
            java.lang.String str = this.f461468e;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f461469f;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f461470g;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.a(8, this.f461471h);
            fVar.a(9, this.f461472i);
            fVar.a(10, this.f461473m);
            fVar.g(11, 8, linkedList);
            fVar.a(12, this.f461475o);
            fVar.a(13, this.f461476p);
            fVar.e(14, this.f461477q);
            fVar.e(15, this.f461478r);
            java.lang.String str4 = this.f461479s;
            if (str4 != null) {
                fVar.j(16, str4);
            }
            java.lang.String str5 = this.f461480t;
            if (str5 != null) {
                fVar.j(17, str5);
            }
            fVar.a(18, this.f461481u);
            r45.qx4 qx4Var = this.f461482v;
            if (qx4Var != null) {
                fVar.i(19, qx4Var.mo75928xcd1e8d8());
                this.f461482v.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.g(3, 8, linkedList2);
            java.lang.String str6 = this.f461468e;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f461469f;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f461470g;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            int a17 = i18 + b36.f.a(8, this.f461471h) + b36.f.a(9, this.f461472i) + b36.f.a(10, this.f461473m) + b36.f.g(11, 8, linkedList) + b36.f.a(12, this.f461475o) + b36.f.a(13, this.f461476p) + b36.f.e(14, this.f461477q) + b36.f.e(15, this.f461478r);
            java.lang.String str9 = this.f461479s;
            if (str9 != null) {
                a17 += b36.f.j(16, str9);
            }
            java.lang.String str10 = this.f461480t;
            if (str10 != null) {
                a17 += b36.f.j(17, str10);
            }
            int a18 = a17 + b36.f.a(18, this.f461481u);
            r45.qx4 qx4Var2 = this.f461482v;
            return qx4Var2 != null ? a18 + b36.f.i(19, qx4Var2.mo75928xcd1e8d8()) : a18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.lx4 lx4Var = (r45.lx4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    lx4Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
            case 7:
            default:
                return -1;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.px4 px4Var = new r45.px4();
                    if (bArr3 != null && bArr3.length > 0) {
                        px4Var.mo11468x92b714fd(bArr3);
                    }
                    lx4Var.f461467d.add(px4Var);
                }
                return 0;
            case 4:
                lx4Var.f461468e = aVar2.k(intValue);
                return 0;
            case 5:
                lx4Var.f461469f = aVar2.k(intValue);
                return 0;
            case 6:
                lx4Var.f461470g = aVar2.k(intValue);
                return 0;
            case 8:
                lx4Var.f461471h = aVar2.c(intValue);
                return 0;
            case 9:
                lx4Var.f461472i = aVar2.c(intValue);
                return 0;
            case 10:
                lx4Var.f461473m = aVar2.c(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.mx4 mx4Var = new r45.mx4();
                    if (bArr4 != null && bArr4.length > 0) {
                        mx4Var.mo11468x92b714fd(bArr4);
                    }
                    lx4Var.f461474n.add(mx4Var);
                }
                return 0;
            case 12:
                lx4Var.f461475o = aVar2.c(intValue);
                return 0;
            case 13:
                lx4Var.f461476p = aVar2.c(intValue);
                return 0;
            case 14:
                lx4Var.f461477q = aVar2.g(intValue);
                return 0;
            case 15:
                lx4Var.f461478r = aVar2.g(intValue);
                return 0;
            case 16:
                lx4Var.f461479s = aVar2.k(intValue);
                return 0;
            case 17:
                lx4Var.f461480t = aVar2.k(intValue);
                return 0;
            case 18:
                lx4Var.f461481u = aVar2.c(intValue);
                return 0;
            case 19:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.qx4 qx4Var3 = new r45.qx4();
                    if (bArr5 != null && bArr5.length > 0) {
                        qx4Var3.mo11468x92b714fd(bArr5);
                    }
                    lx4Var.f461482v = qx4Var3;
                }
                return 0;
        }
    }
}
