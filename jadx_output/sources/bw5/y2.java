package bw5;

/* loaded from: classes2.dex */
public class y2 extends com.tencent.mm.protobuf.f {
    public int A;
    public int B;
    public java.lang.String C;
    public java.lang.String D;
    public final android.util.ArrayMap E = new android.util.ArrayMap();

    /* renamed from: d, reason: collision with root package name */
    public long f35312d;

    /* renamed from: e, reason: collision with root package name */
    public int f35313e;

    /* renamed from: f, reason: collision with root package name */
    public long f35314f;

    /* renamed from: g, reason: collision with root package name */
    public long f35315g;

    /* renamed from: h, reason: collision with root package name */
    public long f35316h;

    /* renamed from: i, reason: collision with root package name */
    public long f35317i;

    /* renamed from: m, reason: collision with root package name */
    public long f35318m;

    /* renamed from: n, reason: collision with root package name */
    public long f35319n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f35320o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f35321p;

    /* renamed from: q, reason: collision with root package name */
    public long f35322q;

    /* renamed from: r, reason: collision with root package name */
    public long f35323r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f35324s;

    /* renamed from: t, reason: collision with root package name */
    public long f35325t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f35326u;

    /* renamed from: v, reason: collision with root package name */
    public int f35327v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f35328w;

    /* renamed from: x, reason: collision with root package name */
    public int f35329x;

    /* renamed from: y, reason: collision with root package name */
    public int f35330y;

    /* renamed from: z, reason: collision with root package name */
    public int f35331z;

    static {
        new bw5.y2();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y2)) {
            return false;
        }
        bw5.y2 y2Var = (bw5.y2) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f35312d), java.lang.Long.valueOf(y2Var.f35312d)) && n51.f.a(java.lang.Integer.valueOf(this.f35313e), java.lang.Integer.valueOf(y2Var.f35313e)) && n51.f.a(java.lang.Long.valueOf(this.f35314f), java.lang.Long.valueOf(y2Var.f35314f)) && n51.f.a(java.lang.Long.valueOf(this.f35315g), java.lang.Long.valueOf(y2Var.f35315g)) && n51.f.a(java.lang.Long.valueOf(this.f35316h), java.lang.Long.valueOf(y2Var.f35316h)) && n51.f.a(java.lang.Long.valueOf(this.f35317i), java.lang.Long.valueOf(y2Var.f35317i)) && n51.f.a(java.lang.Long.valueOf(this.f35318m), java.lang.Long.valueOf(y2Var.f35318m)) && n51.f.a(java.lang.Long.valueOf(this.f35319n), java.lang.Long.valueOf(y2Var.f35319n)) && n51.f.a(this.f35320o, y2Var.f35320o) && n51.f.a(this.f35321p, y2Var.f35321p) && n51.f.a(java.lang.Long.valueOf(this.f35322q), java.lang.Long.valueOf(y2Var.f35322q)) && n51.f.a(java.lang.Long.valueOf(this.f35323r), java.lang.Long.valueOf(y2Var.f35323r)) && n51.f.a(this.f35324s, y2Var.f35324s) && n51.f.a(java.lang.Long.valueOf(this.f35325t), java.lang.Long.valueOf(y2Var.f35325t)) && n51.f.a(this.f35326u, y2Var.f35326u) && n51.f.a(java.lang.Integer.valueOf(this.f35327v), java.lang.Integer.valueOf(y2Var.f35327v)) && n51.f.a(this.f35328w, y2Var.f35328w) && n51.f.a(java.lang.Integer.valueOf(this.f35329x), java.lang.Integer.valueOf(y2Var.f35329x)) && n51.f.a(java.lang.Integer.valueOf(this.f35330y), java.lang.Integer.valueOf(y2Var.f35330y)) && n51.f.a(java.lang.Integer.valueOf(this.f35331z), java.lang.Integer.valueOf(y2Var.f35331z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(y2Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(y2Var.B)) && n51.f.a(this.C, y2Var.C) && n51.f.a(this.D, y2Var.D);
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.E.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.y2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (hasFieldNumber(1)) {
                fVar.h(1, this.f35312d);
            }
            if (hasFieldNumber(2)) {
                fVar.e(2, this.f35313e);
            }
            if (hasFieldNumber(3)) {
                fVar.h(3, this.f35314f);
            }
            if (hasFieldNumber(4)) {
                fVar.h(4, this.f35315g);
            }
            if (hasFieldNumber(5)) {
                fVar.h(5, this.f35316h);
            }
            if (hasFieldNumber(6)) {
                fVar.h(6, this.f35317i);
            }
            if (hasFieldNumber(7)) {
                fVar.h(7, this.f35318m);
            }
            if (hasFieldNumber(8)) {
                fVar.h(8, this.f35319n);
            }
            if (this.f35320o != null && hasFieldNumber(63)) {
                fVar.j(63, this.f35320o);
            }
            if (this.f35321p != null && hasFieldNumber(101)) {
                fVar.j(101, this.f35321p);
            }
            if (hasFieldNumber(102)) {
                fVar.h(102, this.f35322q);
            }
            if (hasFieldNumber(201)) {
                fVar.h(201, this.f35323r);
            }
            if (this.f35324s != null && hasFieldNumber(301)) {
                fVar.j(301, this.f35324s);
            }
            if (hasFieldNumber(302)) {
                fVar.h(302, this.f35325t);
            }
            if (this.f35326u != null && hasFieldNumber(303)) {
                fVar.j(303, this.f35326u);
            }
            if (hasFieldNumber(304)) {
                fVar.e(304, this.f35327v);
            }
            if (this.f35328w != null && hasFieldNumber(313)) {
                fVar.j(313, this.f35328w);
            }
            if (hasFieldNumber(qf1.j.CTRL_INDEX)) {
                fVar.e(qf1.j.CTRL_INDEX, this.f35329x);
            }
            if (hasFieldNumber(qf1.f.CTRL_INDEX)) {
                fVar.e(qf1.f.CTRL_INDEX, this.f35330y);
            }
            if (hasFieldNumber(319)) {
                fVar.e(319, this.f35331z);
            }
            if (hasFieldNumber(com.tencent.mapsdk.internal.km.f50100e)) {
                fVar.e(com.tencent.mapsdk.internal.km.f50100e, this.A);
            }
            if (hasFieldNumber(321)) {
                fVar.e(321, this.B);
            }
            if (this.C != null && hasFieldNumber(702)) {
                fVar.j(702, this.C);
            }
            if (this.D != null && hasFieldNumber(807)) {
                fVar.j(807, this.D);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = hasFieldNumber(1) ? b36.f.h(1, this.f35312d) + 0 : 0;
            if (hasFieldNumber(2)) {
                h17 += b36.f.e(2, this.f35313e);
            }
            if (hasFieldNumber(3)) {
                h17 += b36.f.h(3, this.f35314f);
            }
            if (hasFieldNumber(4)) {
                h17 += b36.f.h(4, this.f35315g);
            }
            if (hasFieldNumber(5)) {
                h17 += b36.f.h(5, this.f35316h);
            }
            if (hasFieldNumber(6)) {
                h17 += b36.f.h(6, this.f35317i);
            }
            if (hasFieldNumber(7)) {
                h17 += b36.f.h(7, this.f35318m);
            }
            if (hasFieldNumber(8)) {
                h17 += b36.f.h(8, this.f35319n);
            }
            if (this.f35320o != null && hasFieldNumber(63)) {
                h17 += b36.f.j(63, this.f35320o);
            }
            if (this.f35321p != null && hasFieldNumber(101)) {
                h17 += b36.f.j(101, this.f35321p);
            }
            if (hasFieldNumber(102)) {
                h17 += b36.f.h(102, this.f35322q);
            }
            if (hasFieldNumber(201)) {
                h17 += b36.f.h(201, this.f35323r);
            }
            if (this.f35324s != null && hasFieldNumber(301)) {
                h17 += b36.f.j(301, this.f35324s);
            }
            if (hasFieldNumber(302)) {
                h17 += b36.f.h(302, this.f35325t);
            }
            if (this.f35326u != null && hasFieldNumber(303)) {
                h17 += b36.f.j(303, this.f35326u);
            }
            if (hasFieldNumber(304)) {
                h17 += b36.f.e(304, this.f35327v);
            }
            if (this.f35328w != null && hasFieldNumber(313)) {
                h17 += b36.f.j(313, this.f35328w);
            }
            if (hasFieldNumber(qf1.j.CTRL_INDEX)) {
                h17 += b36.f.e(qf1.j.CTRL_INDEX, this.f35329x);
            }
            if (hasFieldNumber(qf1.f.CTRL_INDEX)) {
                h17 += b36.f.e(qf1.f.CTRL_INDEX, this.f35330y);
            }
            if (hasFieldNumber(319)) {
                h17 += b36.f.e(319, this.f35331z);
            }
            if (hasFieldNumber(com.tencent.mapsdk.internal.km.f50100e)) {
                h17 += b36.f.e(com.tencent.mapsdk.internal.km.f50100e, this.A);
            }
            if (hasFieldNumber(321)) {
                h17 += b36.f.e(321, this.B);
            }
            if (this.C != null && hasFieldNumber(702)) {
                h17 += b36.f.j(702, this.C);
            }
            return (this.D == null || !hasFieldNumber(807)) ? h17 : h17 + b36.f.j(807, this.D);
        }
        if (i17 == 2) {
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
        android.util.ArrayMap arrayMap = this.E;
        if (intValue == 63) {
            this.f35320o = aVar2.k(intValue);
            arrayMap.put(63, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 201) {
            this.f35323r = aVar2.i(intValue);
            arrayMap.put(201, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 313) {
            this.f35328w = aVar2.k(intValue);
            arrayMap.put(313, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 702) {
            this.C = aVar2.k(intValue);
            arrayMap.put(702, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 807) {
            this.D = aVar2.k(intValue);
            arrayMap.put(807, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 101) {
            this.f35321p = aVar2.k(intValue);
            arrayMap.put(101, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 102) {
            this.f35322q = aVar2.i(intValue);
            arrayMap.put(102, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f35312d = aVar2.i(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f35313e = aVar2.g(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f35314f = aVar2.i(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f35315g = aVar2.i(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f35316h = aVar2.i(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f35317i = aVar2.i(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f35318m = aVar2.i(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f35319n = aVar2.i(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            default:
                switch (intValue) {
                    case 301:
                        this.f35324s = aVar2.k(intValue);
                        arrayMap.put(301, java.lang.Boolean.TRUE);
                        return 0;
                    case 302:
                        this.f35325t = aVar2.i(intValue);
                        arrayMap.put(302, java.lang.Boolean.TRUE);
                        return 0;
                    case 303:
                        this.f35326u = aVar2.k(intValue);
                        arrayMap.put(303, java.lang.Boolean.TRUE);
                        return 0;
                    case 304:
                        this.f35327v = aVar2.g(intValue);
                        arrayMap.put(304, java.lang.Boolean.TRUE);
                        return 0;
                    default:
                        switch (intValue) {
                            case qf1.j.CTRL_INDEX /* 317 */:
                                this.f35329x = aVar2.g(intValue);
                                arrayMap.put(java.lang.Integer.valueOf(qf1.j.CTRL_INDEX), java.lang.Boolean.TRUE);
                                return 0;
                            case qf1.f.CTRL_INDEX /* 318 */:
                                this.f35330y = aVar2.g(intValue);
                                arrayMap.put(java.lang.Integer.valueOf(qf1.f.CTRL_INDEX), java.lang.Boolean.TRUE);
                                return 0;
                            case 319:
                                this.f35331z = aVar2.g(intValue);
                                arrayMap.put(319, java.lang.Boolean.TRUE);
                                return 0;
                            case com.tencent.mapsdk.internal.km.f50100e /* 320 */:
                                this.A = aVar2.g(intValue);
                                arrayMap.put(java.lang.Integer.valueOf(com.tencent.mapsdk.internal.km.f50100e), java.lang.Boolean.TRUE);
                                return 0;
                            case 321:
                                this.B = aVar2.g(intValue);
                                arrayMap.put(321, java.lang.Boolean.TRUE);
                                return 0;
                            default:
                                return -1;
                        }
                }
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.y2) super.parseFrom(bArr);
    }
}
