package r45;

/* loaded from: classes14.dex */
public class t37 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.s37 f467645d;

    /* renamed from: e, reason: collision with root package name */
    public r45.s37 f467646e;

    /* renamed from: f, reason: collision with root package name */
    public r45.s37 f467647f;

    /* renamed from: g, reason: collision with root package name */
    public r45.s37 f467648g;

    /* renamed from: h, reason: collision with root package name */
    public long f467649h;

    /* renamed from: i, reason: collision with root package name */
    public r45.s37 f467650i;

    /* renamed from: m, reason: collision with root package name */
    public int f467651m;

    /* renamed from: o, reason: collision with root package name */
    public int f467653o;

    /* renamed from: q, reason: collision with root package name */
    public int f467655q;

    /* renamed from: s, reason: collision with root package name */
    public int f467657s;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f467652n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f467654p = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public java.util.LinkedList f467656r = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f467658t = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t37)) {
            return false;
        }
        r45.t37 t37Var = (r45.t37) fVar;
        return n51.f.a(this.f76494x2de60e5e, t37Var.f76494x2de60e5e) && n51.f.a(this.f467645d, t37Var.f467645d) && n51.f.a(this.f467646e, t37Var.f467646e) && n51.f.a(this.f467647f, t37Var.f467647f) && n51.f.a(this.f467648g, t37Var.f467648g) && n51.f.a(java.lang.Long.valueOf(this.f467649h), java.lang.Long.valueOf(t37Var.f467649h)) && n51.f.a(this.f467650i, t37Var.f467650i) && n51.f.a(java.lang.Integer.valueOf(this.f467651m), java.lang.Integer.valueOf(t37Var.f467651m)) && n51.f.a(this.f467652n, t37Var.f467652n) && n51.f.a(java.lang.Integer.valueOf(this.f467653o), java.lang.Integer.valueOf(t37Var.f467653o)) && n51.f.a(this.f467654p, t37Var.f467654p) && n51.f.a(java.lang.Integer.valueOf(this.f467655q), java.lang.Integer.valueOf(t37Var.f467655q)) && n51.f.a(this.f467656r, t37Var.f467656r) && n51.f.a(java.lang.Integer.valueOf(this.f467657s), java.lang.Integer.valueOf(t37Var.f467657s)) && n51.f.a(this.f467658t, t37Var.f467658t);
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
            r45.s37 s37Var = this.f467645d;
            if (s37Var != null) {
                fVar.i(2, s37Var.mo75928xcd1e8d8());
                this.f467645d.mo75956x3d5d1f78(fVar);
            }
            r45.s37 s37Var2 = this.f467646e;
            if (s37Var2 != null) {
                fVar.i(3, s37Var2.mo75928xcd1e8d8());
                this.f467646e.mo75956x3d5d1f78(fVar);
            }
            r45.s37 s37Var3 = this.f467647f;
            if (s37Var3 != null) {
                fVar.i(4, s37Var3.mo75928xcd1e8d8());
                this.f467647f.mo75956x3d5d1f78(fVar);
            }
            r45.s37 s37Var4 = this.f467648g;
            if (s37Var4 != null) {
                fVar.i(5, s37Var4.mo75928xcd1e8d8());
                this.f467648g.mo75956x3d5d1f78(fVar);
            }
            fVar.h(6, this.f467649h);
            r45.s37 s37Var5 = this.f467650i;
            if (s37Var5 != null) {
                fVar.i(7, s37Var5.mo75928xcd1e8d8());
                this.f467650i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f467651m);
            fVar.g(9, 8, this.f467652n);
            fVar.e(10, this.f467653o);
            fVar.g(11, 8, this.f467654p);
            fVar.e(12, this.f467655q);
            fVar.g(13, 8, this.f467656r);
            fVar.e(14, this.f467657s);
            fVar.g(15, 8, this.f467658t);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            r45.s37 s37Var6 = this.f467645d;
            if (s37Var6 != null) {
                i18 += b36.f.i(2, s37Var6.mo75928xcd1e8d8());
            }
            r45.s37 s37Var7 = this.f467646e;
            if (s37Var7 != null) {
                i18 += b36.f.i(3, s37Var7.mo75928xcd1e8d8());
            }
            r45.s37 s37Var8 = this.f467647f;
            if (s37Var8 != null) {
                i18 += b36.f.i(4, s37Var8.mo75928xcd1e8d8());
            }
            r45.s37 s37Var9 = this.f467648g;
            if (s37Var9 != null) {
                i18 += b36.f.i(5, s37Var9.mo75928xcd1e8d8());
            }
            int h17 = i18 + b36.f.h(6, this.f467649h);
            r45.s37 s37Var10 = this.f467650i;
            if (s37Var10 != null) {
                h17 += b36.f.i(7, s37Var10.mo75928xcd1e8d8());
            }
            return h17 + b36.f.e(8, this.f467651m) + b36.f.g(9, 8, this.f467652n) + b36.f.e(10, this.f467653o) + b36.f.g(11, 8, this.f467654p) + b36.f.e(12, this.f467655q) + b36.f.g(13, 8, this.f467656r) + b36.f.e(14, this.f467657s) + b36.f.g(15, 8, this.f467658t);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f467652n.clear();
            this.f467654p.clear();
            this.f467656r.clear();
            this.f467658t.clear();
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
        r45.t37 t37Var = (r45.t37) objArr[1];
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
                    t37Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.s37 s37Var11 = new r45.s37();
                    if (bArr3 != null && bArr3.length > 0) {
                        s37Var11.mo11468x92b714fd(bArr3);
                    }
                    t37Var.f467645d = s37Var11;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.s37 s37Var12 = new r45.s37();
                    if (bArr4 != null && bArr4.length > 0) {
                        s37Var12.mo11468x92b714fd(bArr4);
                    }
                    t37Var.f467646e = s37Var12;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.s37 s37Var13 = new r45.s37();
                    if (bArr5 != null && bArr5.length > 0) {
                        s37Var13.mo11468x92b714fd(bArr5);
                    }
                    t37Var.f467647f = s37Var13;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.s37 s37Var14 = new r45.s37();
                    if (bArr6 != null && bArr6.length > 0) {
                        s37Var14.mo11468x92b714fd(bArr6);
                    }
                    t37Var.f467648g = s37Var14;
                }
                return 0;
            case 6:
                t37Var.f467649h = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.s37 s37Var15 = new r45.s37();
                    if (bArr7 != null && bArr7.length > 0) {
                        s37Var15.mo11468x92b714fd(bArr7);
                    }
                    t37Var.f467650i = s37Var15;
                }
                return 0;
            case 8:
                t37Var.f467651m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr8 != null && bArr8.length > 0) {
                        du5Var.b(bArr8);
                    }
                    t37Var.f467652n.add(du5Var);
                }
                return 0;
            case 10:
                t37Var.f467653o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr9 != null && bArr9.length > 0) {
                        du5Var2.b(bArr9);
                    }
                    t37Var.f467654p.add(du5Var2);
                }
                return 0;
            case 12:
                t37Var.f467655q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr10 != null && bArr10.length > 0) {
                        du5Var3.b(bArr10);
                    }
                    t37Var.f467656r.add(du5Var3);
                }
                return 0;
            case 14:
                t37Var.f467657s = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.du5 du5Var4 = new r45.du5();
                    if (bArr11 != null && bArr11.length > 0) {
                        du5Var4.b(bArr11);
                    }
                    t37Var.f467658t.add(du5Var4);
                }
                return 0;
            default:
                return -1;
        }
    }
}
