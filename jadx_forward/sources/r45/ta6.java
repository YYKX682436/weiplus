package r45;

/* loaded from: classes4.dex */
public class ta6 extends r45.mr5 {
    public int A;
    public int B;
    public int D;
    public int E;
    public r45.cu5 F;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467772d;

    /* renamed from: e, reason: collision with root package name */
    public long f467773e;

    /* renamed from: f, reason: collision with root package name */
    public long f467774f;

    /* renamed from: g, reason: collision with root package name */
    public int f467775g;

    /* renamed from: h, reason: collision with root package name */
    public long f467776h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f467777i;

    /* renamed from: m, reason: collision with root package name */
    public int f467778m;

    /* renamed from: n, reason: collision with root package name */
    public int f467779n;

    /* renamed from: p, reason: collision with root package name */
    public int f467781p;

    /* renamed from: q, reason: collision with root package name */
    public int f467782q;

    /* renamed from: r, reason: collision with root package name */
    public long f467783r;

    /* renamed from: s, reason: collision with root package name */
    public long f467784s;

    /* renamed from: t, reason: collision with root package name */
    public long f467785t;

    /* renamed from: u, reason: collision with root package name */
    public int f467786u;

    /* renamed from: v, reason: collision with root package name */
    public long f467787v;

    /* renamed from: w, reason: collision with root package name */
    public r45.cu5 f467788w;

    /* renamed from: x, reason: collision with root package name */
    public int f467789x;

    /* renamed from: z, reason: collision with root package name */
    public long f467791z;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f467780o = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f467790y = new java.util.LinkedList();
    public java.util.LinkedList C = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ta6)) {
            return false;
        }
        r45.ta6 ta6Var = (r45.ta6) fVar;
        return n51.f.a(this.f76494x2de60e5e, ta6Var.f76494x2de60e5e) && n51.f.a(this.f467772d, ta6Var.f467772d) && n51.f.a(java.lang.Long.valueOf(this.f467773e), java.lang.Long.valueOf(ta6Var.f467773e)) && n51.f.a(java.lang.Long.valueOf(this.f467774f), java.lang.Long.valueOf(ta6Var.f467774f)) && n51.f.a(java.lang.Integer.valueOf(this.f467775g), java.lang.Integer.valueOf(ta6Var.f467775g)) && n51.f.a(java.lang.Long.valueOf(this.f467776h), java.lang.Long.valueOf(ta6Var.f467776h)) && n51.f.a(this.f467777i, ta6Var.f467777i) && n51.f.a(java.lang.Integer.valueOf(this.f467778m), java.lang.Integer.valueOf(ta6Var.f467778m)) && n51.f.a(java.lang.Integer.valueOf(this.f467779n), java.lang.Integer.valueOf(ta6Var.f467779n)) && n51.f.a(this.f467780o, ta6Var.f467780o) && n51.f.a(java.lang.Integer.valueOf(this.f467781p), java.lang.Integer.valueOf(ta6Var.f467781p)) && n51.f.a(java.lang.Integer.valueOf(this.f467782q), java.lang.Integer.valueOf(ta6Var.f467782q)) && n51.f.a(java.lang.Long.valueOf(this.f467783r), java.lang.Long.valueOf(ta6Var.f467783r)) && n51.f.a(java.lang.Long.valueOf(this.f467784s), java.lang.Long.valueOf(ta6Var.f467784s)) && n51.f.a(java.lang.Long.valueOf(this.f467785t), java.lang.Long.valueOf(ta6Var.f467785t)) && n51.f.a(java.lang.Integer.valueOf(this.f467786u), java.lang.Integer.valueOf(ta6Var.f467786u)) && n51.f.a(java.lang.Long.valueOf(this.f467787v), java.lang.Long.valueOf(ta6Var.f467787v)) && n51.f.a(this.f467788w, ta6Var.f467788w) && n51.f.a(java.lang.Integer.valueOf(this.f467789x), java.lang.Integer.valueOf(ta6Var.f467789x)) && n51.f.a(this.f467790y, ta6Var.f467790y) && n51.f.a(java.lang.Long.valueOf(this.f467791z), java.lang.Long.valueOf(ta6Var.f467791z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(ta6Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(ta6Var.B)) && n51.f.a(this.C, ta6Var.C) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(ta6Var.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(ta6Var.E)) && n51.f.a(this.F, ta6Var.F);
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
            java.lang.String str = this.f467772d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f467773e);
            fVar.h(4, this.f467774f);
            fVar.e(5, this.f467775g);
            fVar.h(6, this.f467776h);
            r45.cu5 cu5Var = this.f467777i;
            if (cu5Var != null) {
                fVar.i(7, cu5Var.mo75928xcd1e8d8());
                this.f467777i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f467778m);
            fVar.e(11, this.f467779n);
            fVar.k(12, 3, this.f467780o);
            fVar.e(13, this.f467781p);
            fVar.e(14, this.f467782q);
            fVar.h(15, this.f467783r);
            fVar.h(16, this.f467784s);
            fVar.h(17, this.f467785t);
            fVar.e(18, this.f467786u);
            fVar.h(19, this.f467787v);
            r45.cu5 cu5Var2 = this.f467788w;
            if (cu5Var2 != null) {
                fVar.i(20, cu5Var2.mo75928xcd1e8d8());
                this.f467788w.mo75956x3d5d1f78(fVar);
            }
            fVar.e(21, this.f467789x);
            fVar.k(22, 3, this.f467790y);
            fVar.h(23, this.f467791z);
            fVar.e(24, this.A);
            fVar.e(25, this.B);
            fVar.g(26, 8, this.C);
            fVar.e(27, this.D);
            fVar.e(28, this.E);
            r45.cu5 cu5Var3 = this.F;
            if (cu5Var3 == null) {
                return 0;
            }
            fVar.i(29, cu5Var3.mo75928xcd1e8d8());
            this.F.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f467772d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int h17 = i18 + b36.f.h(3, this.f467773e) + b36.f.h(4, this.f467774f) + b36.f.e(5, this.f467775g) + b36.f.h(6, this.f467776h);
            r45.cu5 cu5Var4 = this.f467777i;
            if (cu5Var4 != null) {
                h17 += b36.f.i(7, cu5Var4.mo75928xcd1e8d8());
            }
            int e17 = h17 + b36.f.e(8, this.f467778m) + b36.f.e(11, this.f467779n) + b36.f.k(12, 3, this.f467780o) + b36.f.e(13, this.f467781p) + b36.f.e(14, this.f467782q) + b36.f.h(15, this.f467783r) + b36.f.h(16, this.f467784s) + b36.f.h(17, this.f467785t) + b36.f.e(18, this.f467786u) + b36.f.h(19, this.f467787v);
            r45.cu5 cu5Var5 = this.f467788w;
            if (cu5Var5 != null) {
                e17 += b36.f.i(20, cu5Var5.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(21, this.f467789x) + b36.f.k(22, 3, this.f467790y) + b36.f.h(23, this.f467791z) + b36.f.e(24, this.A) + b36.f.e(25, this.B) + b36.f.g(26, 8, this.C) + b36.f.e(27, this.D) + b36.f.e(28, this.E);
            r45.cu5 cu5Var6 = this.F;
            return cu5Var6 != null ? e18 + b36.f.i(29, cu5Var6.mo75928xcd1e8d8()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f467780o.clear();
            this.f467790y.clear();
            this.C.clear();
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
        r45.ta6 ta6Var = (r45.ta6) objArr[1];
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
                    ta6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                ta6Var.f467772d = aVar2.k(intValue);
                return 0;
            case 3:
                ta6Var.f467773e = aVar2.i(intValue);
                return 0;
            case 4:
                ta6Var.f467774f = aVar2.i(intValue);
                return 0;
            case 5:
                ta6Var.f467775g = aVar2.g(intValue);
                return 0;
            case 6:
                ta6Var.f467776h = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var7 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var7.b(bArr3);
                    }
                    ta6Var.f467777i = cu5Var7;
                }
                return 0;
            case 8:
                ta6Var.f467778m = aVar2.g(intValue);
                return 0;
            case 9:
            case 10:
            default:
                return -1;
            case 11:
                ta6Var.f467779n = aVar2.g(intValue);
                return 0;
            case 12:
                byte[] bArr4 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr4, 0, bArr4.length);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (aVar3.f329129c < aVar3.f329128b) {
                    linkedList.add(java.lang.Long.valueOf(aVar3.g()));
                }
                ta6Var.f467780o = linkedList;
                return 0;
            case 13:
                ta6Var.f467781p = aVar2.g(intValue);
                return 0;
            case 14:
                ta6Var.f467782q = aVar2.g(intValue);
                return 0;
            case 15:
                ta6Var.f467783r = aVar2.i(intValue);
                return 0;
            case 16:
                ta6Var.f467784s = aVar2.i(intValue);
                return 0;
            case 17:
                ta6Var.f467785t = aVar2.i(intValue);
                return 0;
            case 18:
                ta6Var.f467786u = aVar2.g(intValue);
                return 0;
            case 19:
                ta6Var.f467787v = aVar2.i(intValue);
                return 0;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr5 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var8 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var8.b(bArr5);
                    }
                    ta6Var.f467788w = cu5Var8;
                }
                return 0;
            case 21:
                ta6Var.f467789x = aVar2.g(intValue);
                return 0;
            case 22:
                byte[] bArr6 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler2 = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler2, "unknownTagHandler");
                e36.a aVar4 = new e36.a(bArr6, 0, bArr6.length);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                while (aVar4.f329129c < aVar4.f329128b) {
                    linkedList2.add(java.lang.Long.valueOf(aVar4.g()));
                }
                ta6Var.f467790y = linkedList2;
                return 0;
            case 23:
                ta6Var.f467791z = aVar2.i(intValue);
                return 0;
            case 24:
                ta6Var.A = aVar2.g(intValue);
                return 0;
            case 25:
                ta6Var.B = aVar2.g(intValue);
                return 0;
            case 26:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr7 = (byte[]) j27.get(i29);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr7 != null && bArr7.length > 0) {
                        du5Var.b(bArr7);
                    }
                    ta6Var.C.add(du5Var);
                }
                return 0;
            case 27:
                ta6Var.D = aVar2.g(intValue);
                return 0;
            case 28:
                ta6Var.E = aVar2.g(intValue);
                return 0;
            case 29:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr8 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr8 != null && bArr8.length > 0) {
                        cu5Var9.b(bArr8);
                    }
                    ta6Var.F = cu5Var9;
                }
                return 0;
        }
    }
}
