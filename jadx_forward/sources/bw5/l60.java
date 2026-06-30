package bw5;

/* loaded from: classes2.dex */
public class l60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public bw5.k60 A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111183d;

    /* renamed from: e, reason: collision with root package name */
    public int f111184e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111185f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f111186g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.mc0 f111187h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.xa0 f111188i;

    /* renamed from: m, reason: collision with root package name */
    public int f111189m;

    /* renamed from: n, reason: collision with root package name */
    public int f111190n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f111191o;

    /* renamed from: p, reason: collision with root package name */
    public int f111192p;

    /* renamed from: s, reason: collision with root package name */
    public bw5.e80 f111195s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.n60 f111196t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.v70 f111197u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.tb0 f111198v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.o50 f111199w;

    /* renamed from: y, reason: collision with root package name */
    public bw5.p60 f111201y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.j60 f111202z;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f111193q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f111194r = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f111200x = new java.util.LinkedList();
    public final android.util.ArrayMap B = new android.util.ArrayMap();

    static {
        new bw5.l60();
    }

    public bw5.o50 b() {
        return m12381x6e095e9(103) ? this.f111199w : new bw5.o50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.l60 mo11468x92b714fd(byte[] bArr) {
        return (bw5.l60) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l60)) {
            return false;
        }
        bw5.l60 l60Var = (bw5.l60) fVar;
        return n51.f.a(this.f111183d, l60Var.f111183d) && n51.f.a(java.lang.Integer.valueOf(this.f111184e), java.lang.Integer.valueOf(l60Var.f111184e)) && n51.f.a(this.f111185f, l60Var.f111185f) && n51.f.a(this.f111186g, l60Var.f111186g) && n51.f.a(this.f111187h, l60Var.f111187h) && n51.f.a(this.f111188i, l60Var.f111188i) && n51.f.a(java.lang.Integer.valueOf(this.f111189m), java.lang.Integer.valueOf(l60Var.f111189m)) && n51.f.a(java.lang.Integer.valueOf(this.f111190n), java.lang.Integer.valueOf(l60Var.f111190n)) && n51.f.a(this.f111191o, l60Var.f111191o) && n51.f.a(java.lang.Integer.valueOf(this.f111192p), java.lang.Integer.valueOf(l60Var.f111192p)) && n51.f.a(this.f111193q, l60Var.f111193q) && n51.f.a(this.f111194r, l60Var.f111194r) && n51.f.a(this.f111195s, l60Var.f111195s) && n51.f.a(this.f111196t, l60Var.f111196t) && n51.f.a(this.f111197u, l60Var.f111197u) && n51.f.a(this.f111198v, l60Var.f111198v) && n51.f.a(this.f111199w, l60Var.f111199w) && n51.f.a(this.f111200x, l60Var.f111200x) && n51.f.a(this.f111201y, l60Var.f111201y) && n51.f.a(this.f111202z, l60Var.f111202z) && n51.f.a(this.A, l60Var.A);
    }

    /* renamed from: hasFieldNumber */
    public boolean m12381x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.B.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.l60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f111194r;
        java.util.LinkedList linkedList2 = this.f111193q;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f111183d != null && m12381x6e095e9(1)) {
                fVar.j(1, this.f111183d);
            }
            if (m12381x6e095e9(2)) {
                fVar.e(2, this.f111184e);
            }
            if (this.f111185f != null && m12381x6e095e9(3)) {
                fVar.j(3, this.f111185f);
            }
            if (this.f111186g != null && m12381x6e095e9(4)) {
                fVar.j(4, this.f111186g);
            }
            if (this.f111187h != null && m12381x6e095e9(5)) {
                fVar.i(5, this.f111187h.mo75928xcd1e8d8());
                this.f111187h.mo75956x3d5d1f78(fVar);
            }
            if (this.f111188i != null && m12381x6e095e9(6)) {
                fVar.i(6, this.f111188i.mo75928xcd1e8d8());
                this.f111188i.mo75956x3d5d1f78(fVar);
            }
            if (m12381x6e095e9(7)) {
                fVar.e(7, this.f111189m);
            }
            if (m12381x6e095e9(8)) {
                fVar.e(8, this.f111190n);
            }
            if (this.f111191o != null && m12381x6e095e9(9)) {
                fVar.j(9, this.f111191o);
            }
            if (m12381x6e095e9(10)) {
                fVar.e(10, this.f111192p);
            }
            fVar.g(11, 1, linkedList2);
            fVar.g(12, 1, linkedList);
            if (this.f111195s != null && m12381x6e095e9(13)) {
                fVar.i(13, this.f111195s.mo75928xcd1e8d8());
                this.f111195s.mo75956x3d5d1f78(fVar);
            }
            if (this.f111196t != null && m12381x6e095e9(14)) {
                fVar.i(14, this.f111196t.mo75928xcd1e8d8());
                this.f111196t.mo75956x3d5d1f78(fVar);
            }
            if (this.f111197u != null && m12381x6e095e9(101)) {
                fVar.i(101, this.f111197u.mo75928xcd1e8d8());
                this.f111197u.mo75956x3d5d1f78(fVar);
            }
            if (this.f111198v != null && m12381x6e095e9(102)) {
                fVar.i(102, this.f111198v.mo75928xcd1e8d8());
                this.f111198v.mo75956x3d5d1f78(fVar);
            }
            if (this.f111199w != null && m12381x6e095e9(103)) {
                fVar.i(103, this.f111199w.mo75928xcd1e8d8());
                this.f111199w.mo75956x3d5d1f78(fVar);
            }
            fVar.g(104, 8, this.f111200x);
            if (this.f111201y != null && m12381x6e095e9(107)) {
                fVar.i(107, this.f111201y.mo75928xcd1e8d8());
                this.f111201y.mo75956x3d5d1f78(fVar);
            }
            if (this.f111202z != null && m12381x6e095e9(108)) {
                fVar.i(108, this.f111202z.mo75928xcd1e8d8());
                this.f111202z.mo75956x3d5d1f78(fVar);
            }
            if (this.A != null && m12381x6e095e9(109)) {
                fVar.i(109, this.A.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f111183d != null && m12381x6e095e9(1)) {
                i18 = b36.f.j(1, this.f111183d) + 0;
            }
            if (m12381x6e095e9(2)) {
                i18 += b36.f.e(2, this.f111184e);
            }
            if (this.f111185f != null && m12381x6e095e9(3)) {
                i18 += b36.f.j(3, this.f111185f);
            }
            if (this.f111186g != null && m12381x6e095e9(4)) {
                i18 += b36.f.j(4, this.f111186g);
            }
            if (this.f111187h != null && m12381x6e095e9(5)) {
                i18 += b36.f.i(5, this.f111187h.mo75928xcd1e8d8());
            }
            if (this.f111188i != null && m12381x6e095e9(6)) {
                i18 += b36.f.i(6, this.f111188i.mo75928xcd1e8d8());
            }
            if (m12381x6e095e9(7)) {
                i18 += b36.f.e(7, this.f111189m);
            }
            if (m12381x6e095e9(8)) {
                i18 += b36.f.e(8, this.f111190n);
            }
            if (this.f111191o != null && m12381x6e095e9(9)) {
                i18 += b36.f.j(9, this.f111191o);
            }
            if (m12381x6e095e9(10)) {
                i18 += b36.f.e(10, this.f111192p);
            }
            int g17 = i18 + b36.f.g(11, 1, linkedList2) + b36.f.g(12, 1, linkedList);
            if (this.f111195s != null && m12381x6e095e9(13)) {
                g17 += b36.f.i(13, this.f111195s.mo75928xcd1e8d8());
            }
            if (this.f111196t != null && m12381x6e095e9(14)) {
                g17 += b36.f.i(14, this.f111196t.mo75928xcd1e8d8());
            }
            if (this.f111197u != null && m12381x6e095e9(101)) {
                g17 += b36.f.i(101, this.f111197u.mo75928xcd1e8d8());
            }
            if (this.f111198v != null && m12381x6e095e9(102)) {
                g17 += b36.f.i(102, this.f111198v.mo75928xcd1e8d8());
            }
            if (this.f111199w != null && m12381x6e095e9(103)) {
                g17 += b36.f.i(103, this.f111199w.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(104, 8, this.f111200x);
            if (this.f111201y != null && m12381x6e095e9(107)) {
                g18 += b36.f.i(107, this.f111201y.mo75928xcd1e8d8());
            }
            if (this.f111202z != null && m12381x6e095e9(108)) {
                g18 += b36.f.i(108, this.f111202z.mo75928xcd1e8d8());
            }
            return (this.A == null || !m12381x6e095e9(109)) ? g18 : g18 + b36.f.i(109, this.A.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
            this.f111200x.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        android.util.ArrayMap arrayMap = this.B;
        switch (intValue) {
            case 1:
                this.f111183d = aVar2.k(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f111184e = aVar2.g(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f111185f = aVar2.k(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f111186g = aVar2.k(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mc0 mc0Var = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var.mo11468x92b714fd(bArr);
                    }
                    this.f111187h = mc0Var;
                }
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.xa0 xa0Var = new bw5.xa0();
                    if (bArr2 != null && bArr2.length > 0) {
                        xa0Var.mo11468x92b714fd(bArr2);
                    }
                    this.f111188i = xa0Var;
                }
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f111189m = aVar2.g(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f111190n = aVar2.g(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            case 9:
                this.f111191o = aVar2.k(intValue);
                arrayMap.put(9, java.lang.Boolean.TRUE);
                return 0;
            case 10:
                this.f111192p = aVar2.g(intValue);
                arrayMap.put(10, java.lang.Boolean.TRUE);
                return 0;
            case 11:
                linkedList2.add(aVar2.k(intValue));
                arrayMap.put(11, java.lang.Boolean.TRUE);
                return 0;
            case 12:
                linkedList.add(aVar2.k(intValue));
                arrayMap.put(12, java.lang.Boolean.TRUE);
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.e80 e80Var = new bw5.e80();
                    if (bArr3 != null && bArr3.length > 0) {
                        e80Var.mo11468x92b714fd(bArr3);
                    }
                    this.f111195s = e80Var;
                }
                arrayMap.put(13, java.lang.Boolean.TRUE);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.n60 n60Var = new bw5.n60();
                    if (bArr4 != null && bArr4.length > 0) {
                        n60Var.mo11468x92b714fd(bArr4);
                    }
                    this.f111196t = n60Var;
                }
                arrayMap.put(14, java.lang.Boolean.TRUE);
                return 0;
            default:
                switch (intValue) {
                    case 101:
                        java.util.LinkedList j28 = aVar2.j(intValue);
                        int size5 = j28.size();
                        for (int i37 = 0; i37 < size5; i37++) {
                            byte[] bArr5 = (byte[]) j28.get(i37);
                            bw5.v70 v70Var = new bw5.v70();
                            if (bArr5 != null && bArr5.length > 0) {
                                v70Var.mo11468x92b714fd(bArr5);
                            }
                            this.f111197u = v70Var;
                        }
                        arrayMap.put(101, java.lang.Boolean.TRUE);
                        return 0;
                    case 102:
                        java.util.LinkedList j29 = aVar2.j(intValue);
                        int size6 = j29.size();
                        for (int i38 = 0; i38 < size6; i38++) {
                            byte[] bArr6 = (byte[]) j29.get(i38);
                            bw5.tb0 tb0Var = new bw5.tb0();
                            if (bArr6 != null && bArr6.length > 0) {
                                tb0Var.mo11468x92b714fd(bArr6);
                            }
                            this.f111198v = tb0Var;
                        }
                        arrayMap.put(102, java.lang.Boolean.TRUE);
                        return 0;
                    case 103:
                        java.util.LinkedList j37 = aVar2.j(intValue);
                        int size7 = j37.size();
                        for (int i39 = 0; i39 < size7; i39++) {
                            byte[] bArr7 = (byte[]) j37.get(i39);
                            bw5.o50 o50Var = new bw5.o50();
                            if (bArr7 != null && bArr7.length > 0) {
                                o50Var.mo11468x92b714fd(bArr7);
                            }
                            this.f111199w = o50Var;
                        }
                        arrayMap.put(103, java.lang.Boolean.TRUE);
                        return 0;
                    case 104:
                        java.util.LinkedList j38 = aVar2.j(intValue);
                        int size8 = j38.size();
                        for (int i47 = 0; i47 < size8; i47++) {
                            byte[] bArr8 = (byte[]) j38.get(i47);
                            bw5.v70 v70Var2 = new bw5.v70();
                            if (bArr8 != null && bArr8.length > 0) {
                                v70Var2.mo11468x92b714fd(bArr8);
                            }
                            this.f111200x.add(v70Var2);
                        }
                        arrayMap.put(104, java.lang.Boolean.TRUE);
                        return 0;
                    default:
                        switch (intValue) {
                            case 107:
                                java.util.LinkedList j39 = aVar2.j(intValue);
                                int size9 = j39.size();
                                for (int i48 = 0; i48 < size9; i48++) {
                                    byte[] bArr9 = (byte[]) j39.get(i48);
                                    bw5.p60 p60Var = new bw5.p60();
                                    if (bArr9 != null && bArr9.length > 0) {
                                        p60Var.mo11468x92b714fd(bArr9);
                                    }
                                    this.f111201y = p60Var;
                                }
                                arrayMap.put(107, java.lang.Boolean.TRUE);
                                return 0;
                            case 108:
                                java.util.LinkedList j47 = aVar2.j(intValue);
                                int size10 = j47.size();
                                for (int i49 = 0; i49 < size10; i49++) {
                                    byte[] bArr10 = (byte[]) j47.get(i49);
                                    bw5.j60 j60Var = new bw5.j60();
                                    if (bArr10 != null && bArr10.length > 0) {
                                        j60Var.mo11468x92b714fd(bArr10);
                                    }
                                    this.f111202z = j60Var;
                                }
                                arrayMap.put(108, java.lang.Boolean.TRUE);
                                return 0;
                            case 109:
                                java.util.LinkedList j48 = aVar2.j(intValue);
                                int size11 = j48.size();
                                for (int i57 = 0; i57 < size11; i57++) {
                                    byte[] bArr11 = (byte[]) j48.get(i57);
                                    bw5.k60 k60Var = new bw5.k60();
                                    if (bArr11 != null && bArr11.length > 0) {
                                        k60Var.mo11468x92b714fd(bArr11);
                                    }
                                    this.A = k60Var;
                                }
                                arrayMap.put(109, java.lang.Boolean.TRUE);
                                return 0;
                            default:
                                return -1;
                        }
                }
        }
    }
}
