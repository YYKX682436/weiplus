package r45;

/* loaded from: classes4.dex */
public class xb6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471481d;

    /* renamed from: e, reason: collision with root package name */
    public int f471482e;

    /* renamed from: g, reason: collision with root package name */
    public int f471484g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cb6 f471485h;

    /* renamed from: i, reason: collision with root package name */
    public int f471486i;

    /* renamed from: m, reason: collision with root package name */
    public int f471487m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ga6 f471488n;

    /* renamed from: o, reason: collision with root package name */
    public long f471489o;

    /* renamed from: p, reason: collision with root package name */
    public long f471490p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f471491q;

    /* renamed from: r, reason: collision with root package name */
    public int f471492r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f471494t;

    /* renamed from: u, reason: collision with root package name */
    public r45.vb6 f471495u;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f471483f = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f471493s = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xb6)) {
            return false;
        }
        r45.xb6 xb6Var = (r45.xb6) fVar;
        return n51.f.a(this.f76492x92037252, xb6Var.f76492x92037252) && n51.f.a(this.f471481d, xb6Var.f471481d) && n51.f.a(java.lang.Integer.valueOf(this.f471482e), java.lang.Integer.valueOf(xb6Var.f471482e)) && n51.f.a(this.f471483f, xb6Var.f471483f) && n51.f.a(java.lang.Integer.valueOf(this.f471484g), java.lang.Integer.valueOf(xb6Var.f471484g)) && n51.f.a(this.f471485h, xb6Var.f471485h) && n51.f.a(java.lang.Integer.valueOf(this.f471486i), java.lang.Integer.valueOf(xb6Var.f471486i)) && n51.f.a(java.lang.Integer.valueOf(this.f471487m), java.lang.Integer.valueOf(xb6Var.f471487m)) && n51.f.a(this.f471488n, xb6Var.f471488n) && n51.f.a(java.lang.Long.valueOf(this.f471489o), java.lang.Long.valueOf(xb6Var.f471489o)) && n51.f.a(java.lang.Long.valueOf(this.f471490p), java.lang.Long.valueOf(xb6Var.f471490p)) && n51.f.a(this.f471491q, xb6Var.f471491q) && n51.f.a(java.lang.Integer.valueOf(this.f471492r), java.lang.Integer.valueOf(xb6Var.f471492r)) && n51.f.a(this.f471493s, xb6Var.f471493s) && n51.f.a(java.lang.Boolean.valueOf(this.f471494t), java.lang.Boolean.valueOf(xb6Var.f471494t)) && n51.f.a(this.f471495u, xb6Var.f471495u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f471493s;
        java.util.LinkedList linkedList2 = this.f471483f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f471481d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f471482e);
            fVar.g(4, 8, linkedList2);
            fVar.e(5, this.f471484g);
            r45.cb6 cb6Var = this.f471485h;
            if (cb6Var != null) {
                fVar.i(6, cb6Var.mo75928xcd1e8d8());
                this.f471485h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f471486i);
            fVar.e(8, this.f471487m);
            r45.ga6 ga6Var = this.f471488n;
            if (ga6Var != null) {
                fVar.i(9, ga6Var.mo75928xcd1e8d8());
                this.f471488n.mo75956x3d5d1f78(fVar);
            }
            fVar.h(10, this.f471489o);
            fVar.h(11, this.f471490p);
            java.lang.String str2 = this.f471491q;
            if (str2 != null) {
                fVar.j(12, str2);
            }
            fVar.e(13, this.f471492r);
            fVar.g(14, 8, linkedList);
            fVar.a(15, this.f471494t);
            r45.vb6 vb6Var = this.f471495u;
            if (vb6Var != null) {
                fVar.i(16, vb6Var.mo75928xcd1e8d8());
                this.f471495u.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0;
            java.lang.String str3 = this.f471481d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f471482e) + b36.f.g(4, 8, linkedList2) + b36.f.e(5, this.f471484g);
            r45.cb6 cb6Var2 = this.f471485h;
            if (cb6Var2 != null) {
                e17 += b36.f.i(6, cb6Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(7, this.f471486i) + b36.f.e(8, this.f471487m);
            r45.ga6 ga6Var2 = this.f471488n;
            if (ga6Var2 != null) {
                e18 += b36.f.i(9, ga6Var2.mo75928xcd1e8d8());
            }
            int h17 = e18 + b36.f.h(10, this.f471489o) + b36.f.h(11, this.f471490p);
            java.lang.String str4 = this.f471491q;
            if (str4 != null) {
                h17 += b36.f.j(12, str4);
            }
            int e19 = h17 + b36.f.e(13, this.f471492r) + b36.f.g(14, 8, linkedList) + b36.f.a(15, this.f471494t);
            r45.vb6 vb6Var2 = this.f471495u;
            return vb6Var2 != null ? e19 + b36.f.i(16, vb6Var2.mo75928xcd1e8d8()) : e19;
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
        r45.xb6 xb6Var = (r45.xb6) objArr[1];
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
                    xb6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                xb6Var.f471481d = aVar2.k(intValue);
                return 0;
            case 3:
                xb6Var.f471482e = aVar2.g(intValue);
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
                    xb6Var.f471483f.add(c19806x4c372b7);
                }
                return 0;
            case 5:
                xb6Var.f471484g = aVar2.g(intValue);
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
                    xb6Var.f471485h = cb6Var3;
                }
                return 0;
            case 7:
                xb6Var.f471486i = aVar2.g(intValue);
                return 0;
            case 8:
                xb6Var.f471487m = aVar2.g(intValue);
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
                    xb6Var.f471488n = ga6Var3;
                }
                return 0;
            case 10:
                xb6Var.f471489o = aVar2.i(intValue);
                return 0;
            case 11:
                xb6Var.f471490p = aVar2.i(intValue);
                return 0;
            case 12:
                xb6Var.f471491q = aVar2.k(intValue);
                return 0;
            case 13:
                xb6Var.f471492r = aVar2.g(intValue);
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
                    xb6Var.f471493s.add(yb6Var);
                }
                return 0;
            case 15:
                xb6Var.f471494t = aVar2.c(intValue);
                return 0;
            case 16:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.vb6 vb6Var3 = new r45.vb6();
                    if (bArr7 != null && bArr7.length > 0) {
                        vb6Var3.mo11468x92b714fd(bArr7);
                    }
                    xb6Var.f471495u = vb6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
