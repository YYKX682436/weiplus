package bw5;

/* loaded from: classes4.dex */
public class o10 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30880d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30881e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30882f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30883g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30884h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30885i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30886m;

    /* renamed from: n, reason: collision with root package name */
    public int f30887n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f30888o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f30889p;

    /* renamed from: r, reason: collision with root package name */
    public int f30891r;

    /* renamed from: s, reason: collision with root package name */
    public int f30892s;

    /* renamed from: t, reason: collision with root package name */
    public int f30893t;

    /* renamed from: u, reason: collision with root package name */
    public int f30894u;

    /* renamed from: v, reason: collision with root package name */
    public int f30895v;

    /* renamed from: w, reason: collision with root package name */
    public int f30896w;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f30890q = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final android.util.ArrayMap f30897x = new android.util.ArrayMap();

    static {
        new bw5.o10();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o10)) {
            return false;
        }
        bw5.o10 o10Var = (bw5.o10) fVar;
        return n51.f.a(this.f30880d, o10Var.f30880d) && n51.f.a(this.f30881e, o10Var.f30881e) && n51.f.a(this.f30882f, o10Var.f30882f) && n51.f.a(this.f30883g, o10Var.f30883g) && n51.f.a(this.f30884h, o10Var.f30884h) && n51.f.a(this.f30885i, o10Var.f30885i) && n51.f.a(this.f30886m, o10Var.f30886m) && n51.f.a(java.lang.Integer.valueOf(this.f30887n), java.lang.Integer.valueOf(o10Var.f30887n)) && n51.f.a(this.f30888o, o10Var.f30888o) && n51.f.a(this.f30889p, o10Var.f30889p) && n51.f.a(this.f30890q, o10Var.f30890q) && n51.f.a(java.lang.Integer.valueOf(this.f30891r), java.lang.Integer.valueOf(o10Var.f30891r)) && n51.f.a(java.lang.Integer.valueOf(this.f30892s), java.lang.Integer.valueOf(o10Var.f30892s)) && n51.f.a(java.lang.Integer.valueOf(this.f30893t), java.lang.Integer.valueOf(o10Var.f30893t)) && n51.f.a(java.lang.Integer.valueOf(this.f30894u), java.lang.Integer.valueOf(o10Var.f30894u)) && n51.f.a(java.lang.Integer.valueOf(this.f30895v), java.lang.Integer.valueOf(o10Var.f30895v)) && n51.f.a(java.lang.Integer.valueOf(this.f30896w), java.lang.Integer.valueOf(o10Var.f30896w));
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f30897x.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.o10();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30890q;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f30880d != null && hasFieldNumber(1)) {
                fVar.j(1, this.f30880d);
            }
            if (this.f30881e != null && hasFieldNumber(2)) {
                fVar.j(2, this.f30881e);
            }
            if (this.f30882f != null && hasFieldNumber(3)) {
                fVar.j(3, this.f30882f);
            }
            if (this.f30883g != null && hasFieldNumber(4)) {
                fVar.j(4, this.f30883g);
            }
            if (this.f30884h != null && hasFieldNumber(5)) {
                fVar.j(5, this.f30884h);
            }
            if (this.f30885i != null && hasFieldNumber(6)) {
                fVar.j(6, this.f30885i);
            }
            if (this.f30886m != null && hasFieldNumber(7)) {
                fVar.j(7, this.f30886m);
            }
            if (hasFieldNumber(8)) {
                fVar.e(8, this.f30887n);
            }
            if (this.f30888o != null && hasFieldNumber(9)) {
                fVar.j(9, this.f30888o);
            }
            if (this.f30889p != null && hasFieldNumber(10)) {
                fVar.j(10, this.f30889p);
            }
            fVar.g(11, 8, linkedList);
            if (hasFieldNumber(12)) {
                fVar.e(12, this.f30891r);
            }
            if (hasFieldNumber(14)) {
                fVar.e(14, this.f30892s);
            }
            if (hasFieldNumber(1000)) {
                fVar.e(1000, this.f30893t);
            }
            if (hasFieldNumber(1001)) {
                fVar.e(1001, this.f30894u);
            }
            if (hasFieldNumber(1002)) {
                fVar.e(1002, this.f30895v);
            }
            if (hasFieldNumber(1003)) {
                fVar.e(1003, this.f30896w);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f30880d != null && hasFieldNumber(1)) {
                i18 = b36.f.j(1, this.f30880d) + 0;
            }
            if (this.f30881e != null && hasFieldNumber(2)) {
                i18 += b36.f.j(2, this.f30881e);
            }
            if (this.f30882f != null && hasFieldNumber(3)) {
                i18 += b36.f.j(3, this.f30882f);
            }
            if (this.f30883g != null && hasFieldNumber(4)) {
                i18 += b36.f.j(4, this.f30883g);
            }
            if (this.f30884h != null && hasFieldNumber(5)) {
                i18 += b36.f.j(5, this.f30884h);
            }
            if (this.f30885i != null && hasFieldNumber(6)) {
                i18 += b36.f.j(6, this.f30885i);
            }
            if (this.f30886m != null && hasFieldNumber(7)) {
                i18 += b36.f.j(7, this.f30886m);
            }
            if (hasFieldNumber(8)) {
                i18 += b36.f.e(8, this.f30887n);
            }
            if (this.f30888o != null && hasFieldNumber(9)) {
                i18 += b36.f.j(9, this.f30888o);
            }
            if (this.f30889p != null && hasFieldNumber(10)) {
                i18 += b36.f.j(10, this.f30889p);
            }
            int g17 = i18 + b36.f.g(11, 8, linkedList);
            if (hasFieldNumber(12)) {
                g17 += b36.f.e(12, this.f30891r);
            }
            if (hasFieldNumber(14)) {
                g17 += b36.f.e(14, this.f30892s);
            }
            if (hasFieldNumber(1000)) {
                g17 += b36.f.e(1000, this.f30893t);
            }
            if (hasFieldNumber(1001)) {
                g17 += b36.f.e(1001, this.f30894u);
            }
            if (hasFieldNumber(1002)) {
                g17 += b36.f.e(1002, this.f30895v);
            }
            return hasFieldNumber(1003) ? g17 + b36.f.e(1003, this.f30896w) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
        android.util.ArrayMap arrayMap = this.f30897x;
        if (intValue == 14) {
            this.f30892s = aVar2.g(intValue);
            arrayMap.put(14, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f30880d = aVar2.k(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f30881e = aVar2.k(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f30882f = aVar2.k(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f30883g = aVar2.k(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f30884h = aVar2.k(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f30885i = aVar2.k(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f30886m = aVar2.k(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f30887n = aVar2.g(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            case 9:
                this.f30888o = aVar2.k(intValue);
                arrayMap.put(9, java.lang.Boolean.TRUE);
                return 0;
            case 10:
                this.f30889p = aVar2.k(intValue);
                arrayMap.put(10, java.lang.Boolean.TRUE);
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.n10 n10Var = new bw5.n10();
                    if (bArr != null && bArr.length > 0) {
                        n10Var.parseFrom(bArr);
                    }
                    linkedList.add(n10Var);
                }
                arrayMap.put(11, java.lang.Boolean.TRUE);
                return 0;
            case 12:
                this.f30891r = aVar2.g(intValue);
                arrayMap.put(12, java.lang.Boolean.TRUE);
                return 0;
            default:
                switch (intValue) {
                    case 1000:
                        this.f30893t = aVar2.g(intValue);
                        arrayMap.put(1000, java.lang.Boolean.TRUE);
                        return 0;
                    case 1001:
                        this.f30894u = aVar2.g(intValue);
                        arrayMap.put(1001, java.lang.Boolean.TRUE);
                        return 0;
                    case 1002:
                        this.f30895v = aVar2.g(intValue);
                        arrayMap.put(1002, java.lang.Boolean.TRUE);
                        return 0;
                    case 1003:
                        this.f30896w = aVar2.g(intValue);
                        arrayMap.put(1003, java.lang.Boolean.TRUE);
                        return 0;
                    default:
                        return -1;
                }
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.o10) super.parseFrom(bArr);
    }
}
