package r45;

/* loaded from: classes2.dex */
public class xz2 extends r45.mr5 {
    public r45.o72 A;
    public java.lang.String B;
    public java.lang.String C;
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g D;
    public int E;

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f472143d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472144e;

    /* renamed from: f, reason: collision with root package name */
    public float f472145f;

    /* renamed from: g, reason: collision with root package name */
    public float f472146g;

    /* renamed from: h, reason: collision with root package name */
    public r45.dx0 f472147h;

    /* renamed from: i, reason: collision with root package name */
    public r45.rn1 f472148i;

    /* renamed from: m, reason: collision with root package name */
    public int f472149m;

    /* renamed from: n, reason: collision with root package name */
    public r45.fy2 f472150n;

    /* renamed from: q, reason: collision with root package name */
    public int f472153q;

    /* renamed from: r, reason: collision with root package name */
    public r45.kd1 f472154r;

    /* renamed from: s, reason: collision with root package name */
    public int f472155s;

    /* renamed from: t, reason: collision with root package name */
    public r45.yq2 f472156t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f472157u;

    /* renamed from: v, reason: collision with root package name */
    public r45.om1 f472158v;

    /* renamed from: w, reason: collision with root package name */
    public int f472159w;

    /* renamed from: x, reason: collision with root package name */
    public long f472160x;

    /* renamed from: z, reason: collision with root package name */
    public r45.dd2 f472162z;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f472151o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f472152p = new java.util.LinkedList();

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f472161y = new java.util.LinkedList();

    public com.p314xaae8f345.mm.p944x882e457a.i b() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 10200;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderthemelivestream";
        lVar.f152197a = this;
        lVar.f152198b = new r45.yz2();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xz2)) {
            return false;
        }
        r45.xz2 xz2Var = (r45.xz2) fVar;
        return n51.f.a(this.f76494x2de60e5e, xz2Var.f76494x2de60e5e) && n51.f.a(this.f472143d, xz2Var.f472143d) && n51.f.a(this.f472144e, xz2Var.f472144e) && n51.f.a(java.lang.Float.valueOf(this.f472145f), java.lang.Float.valueOf(xz2Var.f472145f)) && n51.f.a(java.lang.Float.valueOf(this.f472146g), java.lang.Float.valueOf(xz2Var.f472146g)) && n51.f.a(this.f472147h, xz2Var.f472147h) && n51.f.a(this.f472148i, xz2Var.f472148i) && n51.f.a(java.lang.Integer.valueOf(this.f472149m), java.lang.Integer.valueOf(xz2Var.f472149m)) && n51.f.a(this.f472150n, xz2Var.f472150n) && n51.f.a(this.f472151o, xz2Var.f472151o) && n51.f.a(this.f472152p, xz2Var.f472152p) && n51.f.a(java.lang.Integer.valueOf(this.f472153q), java.lang.Integer.valueOf(xz2Var.f472153q)) && n51.f.a(this.f472154r, xz2Var.f472154r) && n51.f.a(java.lang.Integer.valueOf(this.f472155s), java.lang.Integer.valueOf(xz2Var.f472155s)) && n51.f.a(this.f472156t, xz2Var.f472156t) && n51.f.a(this.f472157u, xz2Var.f472157u) && n51.f.a(this.f472158v, xz2Var.f472158v) && n51.f.a(java.lang.Integer.valueOf(this.f472159w), java.lang.Integer.valueOf(xz2Var.f472159w)) && n51.f.a(java.lang.Long.valueOf(this.f472160x), java.lang.Long.valueOf(xz2Var.f472160x)) && n51.f.a(this.f472161y, xz2Var.f472161y) && n51.f.a(this.f472162z, xz2Var.f472162z) && n51.f.a(this.A, xz2Var.A) && n51.f.a(this.B, xz2Var.B) && n51.f.a(this.C, xz2Var.C) && n51.f.a(this.D, xz2Var.D) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(xz2Var.E));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472152p;
        java.util.LinkedList linkedList2 = this.f472151o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            r45.kv0 kv0Var = this.f472143d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f472143d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f472144e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.d(4, this.f472145f);
            fVar.d(5, this.f472146g);
            r45.dx0 dx0Var = this.f472147h;
            if (dx0Var != null) {
                fVar.i(6, dx0Var.mo75928xcd1e8d8());
                this.f472147h.mo75956x3d5d1f78(fVar);
            }
            r45.rn1 rn1Var = this.f472148i;
            if (rn1Var != null) {
                fVar.i(7, rn1Var.mo75928xcd1e8d8());
                this.f472148i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f472149m);
            r45.fy2 fy2Var = this.f472150n;
            if (fy2Var != null) {
                fVar.i(9, fy2Var.mo75928xcd1e8d8());
                this.f472150n.mo75956x3d5d1f78(fVar);
            }
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 8, linkedList);
            fVar.e(12, this.f472153q);
            r45.kd1 kd1Var = this.f472154r;
            if (kd1Var != null) {
                fVar.i(13, kd1Var.mo75928xcd1e8d8());
                this.f472154r.mo75956x3d5d1f78(fVar);
            }
            fVar.e(14, this.f472155s);
            r45.yq2 yq2Var = this.f472156t;
            if (yq2Var != null) {
                fVar.i(15, yq2Var.mo75928xcd1e8d8());
                this.f472156t.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f472157u;
            if (str != null) {
                fVar.j(16, str);
            }
            r45.om1 om1Var = this.f472158v;
            if (om1Var != null) {
                fVar.i(17, om1Var.mo75928xcd1e8d8());
                this.f472158v.mo75956x3d5d1f78(fVar);
            }
            fVar.e(18, this.f472159w);
            fVar.h(19, this.f472160x);
            fVar.g(20, 8, this.f472161y);
            r45.dd2 dd2Var = this.f472162z;
            if (dd2Var != null) {
                fVar.i(21, dd2Var.mo75928xcd1e8d8());
                this.f472162z.mo75956x3d5d1f78(fVar);
            }
            r45.o72 o72Var = this.A;
            if (o72Var != null) {
                fVar.i(22, o72Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.B;
            if (str2 != null) {
                fVar.j(23, str2);
            }
            java.lang.String str3 = this.C;
            if (str3 != null) {
                fVar.j(24, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.D;
            if (gVar2 != null) {
                fVar.b(25, gVar2);
            }
            fVar.e(26, this.E);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            r45.kv0 kv0Var2 = this.f472143d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f472144e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            int d17 = i18 + b36.f.d(4, this.f472145f) + b36.f.d(5, this.f472146g);
            r45.dx0 dx0Var2 = this.f472147h;
            if (dx0Var2 != null) {
                d17 += b36.f.i(6, dx0Var2.mo75928xcd1e8d8());
            }
            r45.rn1 rn1Var2 = this.f472148i;
            if (rn1Var2 != null) {
                d17 += b36.f.i(7, rn1Var2.mo75928xcd1e8d8());
            }
            int e17 = d17 + b36.f.e(8, this.f472149m);
            r45.fy2 fy2Var2 = this.f472150n;
            if (fy2Var2 != null) {
                e17 += b36.f.i(9, fy2Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 8, linkedList) + b36.f.e(12, this.f472153q);
            r45.kd1 kd1Var2 = this.f472154r;
            if (kd1Var2 != null) {
                g17 += b36.f.i(13, kd1Var2.mo75928xcd1e8d8());
            }
            int e18 = g17 + b36.f.e(14, this.f472155s);
            r45.yq2 yq2Var2 = this.f472156t;
            if (yq2Var2 != null) {
                e18 += b36.f.i(15, yq2Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f472157u;
            if (str4 != null) {
                e18 += b36.f.j(16, str4);
            }
            r45.om1 om1Var2 = this.f472158v;
            if (om1Var2 != null) {
                e18 += b36.f.i(17, om1Var2.mo75928xcd1e8d8());
            }
            int e19 = e18 + b36.f.e(18, this.f472159w) + b36.f.h(19, this.f472160x) + b36.f.g(20, 8, this.f472161y);
            r45.dd2 dd2Var2 = this.f472162z;
            if (dd2Var2 != null) {
                e19 += b36.f.i(21, dd2Var2.mo75928xcd1e8d8());
            }
            r45.o72 o72Var2 = this.A;
            if (o72Var2 != null) {
                e19 += b36.f.i(22, o72Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.B;
            if (str5 != null) {
                e19 += b36.f.j(23, str5);
            }
            java.lang.String str6 = this.C;
            if (str6 != null) {
                e19 += b36.f.j(24, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.D;
            if (gVar4 != null) {
                e19 += b36.f.b(25, gVar4);
            }
            return e19 + b36.f.e(26, this.E);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            this.f472161y.clear();
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
        r45.xz2 xz2Var = (r45.xz2) objArr[1];
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
                    xz2Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr3 != null && bArr3.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr3);
                    }
                    xz2Var.f472143d = kv0Var3;
                }
                return 0;
            case 3:
                xz2Var.f472144e = aVar2.d(intValue);
                return 0;
            case 4:
                xz2Var.f472145f = aVar2.f(intValue);
                return 0;
            case 5:
                xz2Var.f472146g = aVar2.f(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.dx0 dx0Var3 = new r45.dx0();
                    if (bArr4 != null && bArr4.length > 0) {
                        dx0Var3.mo11468x92b714fd(bArr4);
                    }
                    xz2Var.f472147h = dx0Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.rn1 rn1Var3 = new r45.rn1();
                    if (bArr5 != null && bArr5.length > 0) {
                        rn1Var3.mo11468x92b714fd(bArr5);
                    }
                    xz2Var.f472148i = rn1Var3;
                }
                return 0;
            case 8:
                xz2Var.f472149m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.fy2 fy2Var3 = new r45.fy2();
                    if (bArr6 != null && bArr6.length > 0) {
                        fy2Var3.mo11468x92b714fd(bArr6);
                    }
                    xz2Var.f472150n = fy2Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.ni4 ni4Var = new r45.ni4();
                    if (bArr7 != null && bArr7.length > 0) {
                        ni4Var.mo11468x92b714fd(bArr7);
                    }
                    xz2Var.f472151o.add(ni4Var);
                }
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.e13 e13Var = new r45.e13();
                    if (bArr8 != null && bArr8.length > 0) {
                        e13Var.mo11468x92b714fd(bArr8);
                    }
                    xz2Var.f472152p.add(e13Var);
                }
                return 0;
            case 12:
                xz2Var.f472153q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.kd1 kd1Var3 = new r45.kd1();
                    if (bArr9 != null && bArr9.length > 0) {
                        kd1Var3.mo11468x92b714fd(bArr9);
                    }
                    xz2Var.f472154r = kd1Var3;
                }
                return 0;
            case 14:
                xz2Var.f472155s = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.yq2 yq2Var3 = new r45.yq2();
                    if (bArr10 != null && bArr10.length > 0) {
                        yq2Var3.mo11468x92b714fd(bArr10);
                    }
                    xz2Var.f472156t = yq2Var3;
                }
                return 0;
            case 16:
                xz2Var.f472157u = aVar2.k(intValue);
                return 0;
            case 17:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.om1 om1Var3 = new r45.om1();
                    if (bArr11 != null && bArr11.length > 0) {
                        om1Var3.mo11468x92b714fd(bArr11);
                    }
                    xz2Var.f472158v = om1Var3;
                }
                return 0;
            case 18:
                xz2Var.f472159w = aVar2.g(intValue);
                return 0;
            case 19:
                xz2Var.f472160x = aVar2.i(intValue);
                return 0;
            case 20:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.u80 u80Var = new r45.u80();
                    if (bArr12 != null && bArr12.length > 0) {
                        u80Var.mo11468x92b714fd(bArr12);
                    }
                    xz2Var.f472161y.add(u80Var);
                }
                return 0;
            case 21:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr13 = (byte[]) j49.get(i58);
                    r45.dd2 dd2Var3 = new r45.dd2();
                    if (bArr13 != null && bArr13.length > 0) {
                        dd2Var3.mo11468x92b714fd(bArr13);
                    }
                    xz2Var.f472162z = dd2Var3;
                }
                return 0;
            case 22:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr14 = (byte[]) j57.get(i59);
                    r45.o72 o72Var3 = new r45.o72();
                    if (bArr14 != null && bArr14.length > 0) {
                        o72Var3.mo11468x92b714fd(bArr14);
                    }
                    xz2Var.A = o72Var3;
                }
                return 0;
            case 23:
                xz2Var.B = aVar2.k(intValue);
                return 0;
            case 24:
                xz2Var.C = aVar2.k(intValue);
                return 0;
            case 25:
                xz2Var.D = aVar2.d(intValue);
                return 0;
            case 26:
                xz2Var.E = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
