package bw5;

/* loaded from: classes2.dex */
public class l60 extends com.tencent.mm.protobuf.f {
    public bw5.k60 A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29650d;

    /* renamed from: e, reason: collision with root package name */
    public int f29651e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29652f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f29653g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.mc0 f29654h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.xa0 f29655i;

    /* renamed from: m, reason: collision with root package name */
    public int f29656m;

    /* renamed from: n, reason: collision with root package name */
    public int f29657n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f29658o;

    /* renamed from: p, reason: collision with root package name */
    public int f29659p;

    /* renamed from: s, reason: collision with root package name */
    public bw5.e80 f29662s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.n60 f29663t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.v70 f29664u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.tb0 f29665v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.o50 f29666w;

    /* renamed from: y, reason: collision with root package name */
    public bw5.p60 f29668y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.j60 f29669z;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f29660q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f29661r = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f29667x = new java.util.LinkedList();
    public final android.util.ArrayMap B = new android.util.ArrayMap();

    static {
        new bw5.l60();
    }

    public bw5.o50 b() {
        return hasFieldNumber(103) ? this.f29666w : new bw5.o50();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.l60 parseFrom(byte[] bArr) {
        return (bw5.l60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l60)) {
            return false;
        }
        bw5.l60 l60Var = (bw5.l60) fVar;
        return n51.f.a(this.f29650d, l60Var.f29650d) && n51.f.a(java.lang.Integer.valueOf(this.f29651e), java.lang.Integer.valueOf(l60Var.f29651e)) && n51.f.a(this.f29652f, l60Var.f29652f) && n51.f.a(this.f29653g, l60Var.f29653g) && n51.f.a(this.f29654h, l60Var.f29654h) && n51.f.a(this.f29655i, l60Var.f29655i) && n51.f.a(java.lang.Integer.valueOf(this.f29656m), java.lang.Integer.valueOf(l60Var.f29656m)) && n51.f.a(java.lang.Integer.valueOf(this.f29657n), java.lang.Integer.valueOf(l60Var.f29657n)) && n51.f.a(this.f29658o, l60Var.f29658o) && n51.f.a(java.lang.Integer.valueOf(this.f29659p), java.lang.Integer.valueOf(l60Var.f29659p)) && n51.f.a(this.f29660q, l60Var.f29660q) && n51.f.a(this.f29661r, l60Var.f29661r) && n51.f.a(this.f29662s, l60Var.f29662s) && n51.f.a(this.f29663t, l60Var.f29663t) && n51.f.a(this.f29664u, l60Var.f29664u) && n51.f.a(this.f29665v, l60Var.f29665v) && n51.f.a(this.f29666w, l60Var.f29666w) && n51.f.a(this.f29667x, l60Var.f29667x) && n51.f.a(this.f29668y, l60Var.f29668y) && n51.f.a(this.f29669z, l60Var.f29669z) && n51.f.a(this.A, l60Var.A);
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.B.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.l60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29661r;
        java.util.LinkedList linkedList2 = this.f29660q;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f29650d != null && hasFieldNumber(1)) {
                fVar.j(1, this.f29650d);
            }
            if (hasFieldNumber(2)) {
                fVar.e(2, this.f29651e);
            }
            if (this.f29652f != null && hasFieldNumber(3)) {
                fVar.j(3, this.f29652f);
            }
            if (this.f29653g != null && hasFieldNumber(4)) {
                fVar.j(4, this.f29653g);
            }
            if (this.f29654h != null && hasFieldNumber(5)) {
                fVar.i(5, this.f29654h.computeSize());
                this.f29654h.writeFields(fVar);
            }
            if (this.f29655i != null && hasFieldNumber(6)) {
                fVar.i(6, this.f29655i.computeSize());
                this.f29655i.writeFields(fVar);
            }
            if (hasFieldNumber(7)) {
                fVar.e(7, this.f29656m);
            }
            if (hasFieldNumber(8)) {
                fVar.e(8, this.f29657n);
            }
            if (this.f29658o != null && hasFieldNumber(9)) {
                fVar.j(9, this.f29658o);
            }
            if (hasFieldNumber(10)) {
                fVar.e(10, this.f29659p);
            }
            fVar.g(11, 1, linkedList2);
            fVar.g(12, 1, linkedList);
            if (this.f29662s != null && hasFieldNumber(13)) {
                fVar.i(13, this.f29662s.computeSize());
                this.f29662s.writeFields(fVar);
            }
            if (this.f29663t != null && hasFieldNumber(14)) {
                fVar.i(14, this.f29663t.computeSize());
                this.f29663t.writeFields(fVar);
            }
            if (this.f29664u != null && hasFieldNumber(101)) {
                fVar.i(101, this.f29664u.computeSize());
                this.f29664u.writeFields(fVar);
            }
            if (this.f29665v != null && hasFieldNumber(102)) {
                fVar.i(102, this.f29665v.computeSize());
                this.f29665v.writeFields(fVar);
            }
            if (this.f29666w != null && hasFieldNumber(103)) {
                fVar.i(103, this.f29666w.computeSize());
                this.f29666w.writeFields(fVar);
            }
            fVar.g(104, 8, this.f29667x);
            if (this.f29668y != null && hasFieldNumber(107)) {
                fVar.i(107, this.f29668y.computeSize());
                this.f29668y.writeFields(fVar);
            }
            if (this.f29669z != null && hasFieldNumber(108)) {
                fVar.i(108, this.f29669z.computeSize());
                this.f29669z.writeFields(fVar);
            }
            if (this.A != null && hasFieldNumber(109)) {
                fVar.i(109, this.A.computeSize());
                this.A.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f29650d != null && hasFieldNumber(1)) {
                i18 = b36.f.j(1, this.f29650d) + 0;
            }
            if (hasFieldNumber(2)) {
                i18 += b36.f.e(2, this.f29651e);
            }
            if (this.f29652f != null && hasFieldNumber(3)) {
                i18 += b36.f.j(3, this.f29652f);
            }
            if (this.f29653g != null && hasFieldNumber(4)) {
                i18 += b36.f.j(4, this.f29653g);
            }
            if (this.f29654h != null && hasFieldNumber(5)) {
                i18 += b36.f.i(5, this.f29654h.computeSize());
            }
            if (this.f29655i != null && hasFieldNumber(6)) {
                i18 += b36.f.i(6, this.f29655i.computeSize());
            }
            if (hasFieldNumber(7)) {
                i18 += b36.f.e(7, this.f29656m);
            }
            if (hasFieldNumber(8)) {
                i18 += b36.f.e(8, this.f29657n);
            }
            if (this.f29658o != null && hasFieldNumber(9)) {
                i18 += b36.f.j(9, this.f29658o);
            }
            if (hasFieldNumber(10)) {
                i18 += b36.f.e(10, this.f29659p);
            }
            int g17 = i18 + b36.f.g(11, 1, linkedList2) + b36.f.g(12, 1, linkedList);
            if (this.f29662s != null && hasFieldNumber(13)) {
                g17 += b36.f.i(13, this.f29662s.computeSize());
            }
            if (this.f29663t != null && hasFieldNumber(14)) {
                g17 += b36.f.i(14, this.f29663t.computeSize());
            }
            if (this.f29664u != null && hasFieldNumber(101)) {
                g17 += b36.f.i(101, this.f29664u.computeSize());
            }
            if (this.f29665v != null && hasFieldNumber(102)) {
                g17 += b36.f.i(102, this.f29665v.computeSize());
            }
            if (this.f29666w != null && hasFieldNumber(103)) {
                g17 += b36.f.i(103, this.f29666w.computeSize());
            }
            int g18 = g17 + b36.f.g(104, 8, this.f29667x);
            if (this.f29668y != null && hasFieldNumber(107)) {
                g18 += b36.f.i(107, this.f29668y.computeSize());
            }
            if (this.f29669z != null && hasFieldNumber(108)) {
                g18 += b36.f.i(108, this.f29669z.computeSize());
            }
            return (this.A == null || !hasFieldNumber(109)) ? g18 : g18 + b36.f.i(109, this.A.computeSize());
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
            this.f29667x.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
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
                this.f29650d = aVar2.k(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f29651e = aVar2.g(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f29652f = aVar2.k(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f29653g = aVar2.k(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mc0 mc0Var = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var.parseFrom(bArr);
                    }
                    this.f29654h = mc0Var;
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
                        xa0Var.parseFrom(bArr2);
                    }
                    this.f29655i = xa0Var;
                }
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f29656m = aVar2.g(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f29657n = aVar2.g(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            case 9:
                this.f29658o = aVar2.k(intValue);
                arrayMap.put(9, java.lang.Boolean.TRUE);
                return 0;
            case 10:
                this.f29659p = aVar2.g(intValue);
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
                        e80Var.parseFrom(bArr3);
                    }
                    this.f29662s = e80Var;
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
                        n60Var.parseFrom(bArr4);
                    }
                    this.f29663t = n60Var;
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
                                v70Var.parseFrom(bArr5);
                            }
                            this.f29664u = v70Var;
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
                                tb0Var.parseFrom(bArr6);
                            }
                            this.f29665v = tb0Var;
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
                                o50Var.parseFrom(bArr7);
                            }
                            this.f29666w = o50Var;
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
                                v70Var2.parseFrom(bArr8);
                            }
                            this.f29667x.add(v70Var2);
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
                                        p60Var.parseFrom(bArr9);
                                    }
                                    this.f29668y = p60Var;
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
                                        j60Var.parseFrom(bArr10);
                                    }
                                    this.f29669z = j60Var;
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
                                        k60Var.parseFrom(bArr11);
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
