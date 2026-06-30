package r45;

/* loaded from: classes4.dex */
public class eb6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454772d;

    /* renamed from: e, reason: collision with root package name */
    public int f454773e;

    /* renamed from: g, reason: collision with root package name */
    public int f454775g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cb6 f454776h;

    /* renamed from: i, reason: collision with root package name */
    public int f454777i;

    /* renamed from: m, reason: collision with root package name */
    public int f454778m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ga6 f454779n;

    /* renamed from: o, reason: collision with root package name */
    public long f454780o;

    /* renamed from: p, reason: collision with root package name */
    public long f454781p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f454782q;

    /* renamed from: r, reason: collision with root package name */
    public int f454783r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f454785t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f454786u;

    /* renamed from: v, reason: collision with root package name */
    public int f454787v;

    /* renamed from: w, reason: collision with root package name */
    public int f454788w;

    /* renamed from: y, reason: collision with root package name */
    public long f454790y;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f454774f = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f454784s = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f454789x = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eb6)) {
            return false;
        }
        r45.eb6 eb6Var = (r45.eb6) fVar;
        return n51.f.a(this.f76492x92037252, eb6Var.f76492x92037252) && n51.f.a(this.f454772d, eb6Var.f454772d) && n51.f.a(java.lang.Integer.valueOf(this.f454773e), java.lang.Integer.valueOf(eb6Var.f454773e)) && n51.f.a(this.f454774f, eb6Var.f454774f) && n51.f.a(java.lang.Integer.valueOf(this.f454775g), java.lang.Integer.valueOf(eb6Var.f454775g)) && n51.f.a(this.f454776h, eb6Var.f454776h) && n51.f.a(java.lang.Integer.valueOf(this.f454777i), java.lang.Integer.valueOf(eb6Var.f454777i)) && n51.f.a(java.lang.Integer.valueOf(this.f454778m), java.lang.Integer.valueOf(eb6Var.f454778m)) && n51.f.a(this.f454779n, eb6Var.f454779n) && n51.f.a(java.lang.Long.valueOf(this.f454780o), java.lang.Long.valueOf(eb6Var.f454780o)) && n51.f.a(java.lang.Long.valueOf(this.f454781p), java.lang.Long.valueOf(eb6Var.f454781p)) && n51.f.a(this.f454782q, eb6Var.f454782q) && n51.f.a(java.lang.Integer.valueOf(this.f454783r), java.lang.Integer.valueOf(eb6Var.f454783r)) && n51.f.a(this.f454784s, eb6Var.f454784s) && n51.f.a(java.lang.Boolean.valueOf(this.f454785t), java.lang.Boolean.valueOf(eb6Var.f454785t)) && n51.f.a(this.f454786u, eb6Var.f454786u) && n51.f.a(java.lang.Integer.valueOf(this.f454787v), java.lang.Integer.valueOf(eb6Var.f454787v)) && n51.f.a(java.lang.Integer.valueOf(this.f454788w), java.lang.Integer.valueOf(eb6Var.f454788w)) && n51.f.a(this.f454789x, eb6Var.f454789x) && n51.f.a(java.lang.Long.valueOf(this.f454790y), java.lang.Long.valueOf(eb6Var.f454790y));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f454789x;
        java.util.LinkedList linkedList2 = this.f454784s;
        java.util.LinkedList linkedList3 = this.f454774f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f454772d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f454773e);
            fVar.g(4, 8, linkedList3);
            fVar.e(5, this.f454775g);
            r45.cb6 cb6Var = this.f454776h;
            if (cb6Var != null) {
                fVar.i(6, cb6Var.mo75928xcd1e8d8());
                this.f454776h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f454777i);
            fVar.e(8, this.f454778m);
            r45.ga6 ga6Var = this.f454779n;
            if (ga6Var != null) {
                fVar.i(9, ga6Var.mo75928xcd1e8d8());
                this.f454779n.mo75956x3d5d1f78(fVar);
            }
            fVar.h(10, this.f454780o);
            fVar.h(11, this.f454781p);
            java.lang.String str2 = this.f454782q;
            if (str2 != null) {
                fVar.j(12, str2);
            }
            fVar.e(13, this.f454783r);
            fVar.g(14, 8, linkedList2);
            fVar.a(15, this.f454785t);
            java.lang.String str3 = this.f454786u;
            if (str3 != null) {
                fVar.j(16, str3);
            }
            fVar.e(17, this.f454787v);
            fVar.e(18, this.f454788w);
            fVar.g(19, 8, linkedList);
            fVar.h(20, this.f454790y);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0;
            java.lang.String str4 = this.f454772d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f454773e) + b36.f.g(4, 8, linkedList3) + b36.f.e(5, this.f454775g);
            r45.cb6 cb6Var2 = this.f454776h;
            if (cb6Var2 != null) {
                e17 += b36.f.i(6, cb6Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(7, this.f454777i) + b36.f.e(8, this.f454778m);
            r45.ga6 ga6Var2 = this.f454779n;
            if (ga6Var2 != null) {
                e18 += b36.f.i(9, ga6Var2.mo75928xcd1e8d8());
            }
            int h17 = e18 + b36.f.h(10, this.f454780o) + b36.f.h(11, this.f454781p);
            java.lang.String str5 = this.f454782q;
            if (str5 != null) {
                h17 += b36.f.j(12, str5);
            }
            int e19 = h17 + b36.f.e(13, this.f454783r) + b36.f.g(14, 8, linkedList2) + b36.f.a(15, this.f454785t);
            java.lang.String str6 = this.f454786u;
            if (str6 != null) {
                e19 += b36.f.j(16, str6);
            }
            return e19 + b36.f.e(17, this.f454787v) + b36.f.e(18, this.f454788w) + b36.f.g(19, 8, linkedList) + b36.f.h(20, this.f454790y);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.eb6 eb6Var = (r45.eb6) objArr[1];
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
                    eb6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                eb6Var.f454772d = aVar2.k(intValue);
                return 0;
            case 3:
                eb6Var.f454773e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7();
                    if (bArr3 != null && bArr3.length > 0) {
                        c19806x4c372b7.mo11468x92b714fd(bArr3);
                    }
                    eb6Var.f454774f.add(c19806x4c372b7);
                }
                return 0;
            case 5:
                eb6Var.f454775g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.cb6 cb6Var3 = new r45.cb6();
                    if (bArr4 != null && bArr4.length > 0) {
                        cb6Var3.mo11468x92b714fd(bArr4);
                    }
                    eb6Var.f454776h = cb6Var3;
                }
                return 0;
            case 7:
                eb6Var.f454777i = aVar2.g(intValue);
                return 0;
            case 8:
                eb6Var.f454778m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.ga6 ga6Var3 = new r45.ga6();
                    if (bArr5 != null && bArr5.length > 0) {
                        ga6Var3.mo11468x92b714fd(bArr5);
                    }
                    eb6Var.f454779n = ga6Var3;
                }
                return 0;
            case 10:
                eb6Var.f454780o = aVar2.i(intValue);
                return 0;
            case 11:
                eb6Var.f454781p = aVar2.i(intValue);
                return 0;
            case 12:
                eb6Var.f454782q = aVar2.k(intValue);
                return 0;
            case 13:
                eb6Var.f454783r = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.yb6 yb6Var = new r45.yb6();
                    if (bArr6 != null && bArr6.length > 0) {
                        yb6Var.mo11468x92b714fd(bArr6);
                    }
                    eb6Var.f454784s.add(yb6Var);
                }
                return 0;
            case 15:
                eb6Var.f454785t = aVar2.c(intValue);
                return 0;
            case 16:
                eb6Var.f454786u = aVar2.k(intValue);
                return 0;
            case 17:
                eb6Var.f454787v = aVar2.g(intValue);
                return 0;
            case 18:
                eb6Var.f454788w = aVar2.g(intValue);
                return 0;
            case 19:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7();
                    if (bArr7 != null && bArr7.length > 0) {
                        c19806x4c372b72.mo11468x92b714fd(bArr7);
                    }
                    eb6Var.f454789x.add(c19806x4c372b72);
                }
                return 0;
            case 20:
                eb6Var.f454790y = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
