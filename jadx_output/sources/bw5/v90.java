package bw5;

/* loaded from: classes2.dex */
public class v90 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34226d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34227e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34228f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34229g;

    /* renamed from: h, reason: collision with root package name */
    public int f34230h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f34231i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f34232m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f34233n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f34234o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f34235p;

    /* renamed from: q, reason: collision with root package name */
    public long f34236q;

    /* renamed from: r, reason: collision with root package name */
    public long f34237r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f34238s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f34239t;

    /* renamed from: u, reason: collision with root package name */
    public int f34240u;

    /* renamed from: v, reason: collision with root package name */
    public int f34241v;

    /* renamed from: w, reason: collision with root package name */
    public final android.util.ArrayMap f34242w = new android.util.ArrayMap();

    static {
        new bw5.v90();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.v90 parseFrom(byte[] bArr) {
        return (bw5.v90) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v90)) {
            return false;
        }
        bw5.v90 v90Var = (bw5.v90) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34226d), java.lang.Integer.valueOf(v90Var.f34226d)) && n51.f.a(this.f34227e, v90Var.f34227e) && n51.f.a(this.f34228f, v90Var.f34228f) && n51.f.a(this.f34229g, v90Var.f34229g) && n51.f.a(java.lang.Integer.valueOf(this.f34230h), java.lang.Integer.valueOf(v90Var.f34230h)) && n51.f.a(this.f34231i, v90Var.f34231i) && n51.f.a(this.f34232m, v90Var.f34232m) && n51.f.a(this.f34233n, v90Var.f34233n) && n51.f.a(this.f34234o, v90Var.f34234o) && n51.f.a(this.f34235p, v90Var.f34235p) && n51.f.a(java.lang.Long.valueOf(this.f34236q), java.lang.Long.valueOf(v90Var.f34236q)) && n51.f.a(java.lang.Long.valueOf(this.f34237r), java.lang.Long.valueOf(v90Var.f34237r)) && n51.f.a(this.f34238s, v90Var.f34238s) && n51.f.a(this.f34239t, v90Var.f34239t) && n51.f.a(java.lang.Integer.valueOf(this.f34240u), java.lang.Integer.valueOf(v90Var.f34240u)) && n51.f.a(java.lang.Integer.valueOf(this.f34241v), java.lang.Integer.valueOf(v90Var.f34241v));
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f34242w.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.v90();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (hasFieldNumber(1)) {
                fVar.e(1, this.f34226d);
            }
            if (this.f34227e != null && hasFieldNumber(2)) {
                fVar.j(2, this.f34227e);
            }
            if (this.f34228f != null && hasFieldNumber(3)) {
                fVar.j(3, this.f34228f);
            }
            if (this.f34229g != null && hasFieldNumber(4)) {
                fVar.j(4, this.f34229g);
            }
            if (hasFieldNumber(5)) {
                fVar.e(5, this.f34230h);
            }
            if (this.f34231i != null && hasFieldNumber(6)) {
                fVar.j(6, this.f34231i);
            }
            if (this.f34232m != null && hasFieldNumber(7)) {
                fVar.j(7, this.f34232m);
            }
            if (this.f34233n != null && hasFieldNumber(8)) {
                fVar.j(8, this.f34233n);
            }
            if (this.f34234o != null && hasFieldNumber(9)) {
                fVar.j(9, this.f34234o);
            }
            if (this.f34235p != null && hasFieldNumber(10)) {
                fVar.j(10, this.f34235p);
            }
            if (hasFieldNumber(11)) {
                fVar.h(11, this.f34236q);
            }
            if (hasFieldNumber(12)) {
                fVar.h(12, this.f34237r);
            }
            if (this.f34238s != null && hasFieldNumber(13)) {
                fVar.j(13, this.f34238s);
            }
            if (this.f34239t != null && hasFieldNumber(14)) {
                fVar.j(14, this.f34239t);
            }
            if (hasFieldNumber(15)) {
                fVar.e(15, this.f34240u);
            }
            if (hasFieldNumber(1000)) {
                fVar.e(1000, this.f34241v);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = hasFieldNumber(1) ? b36.f.e(1, this.f34226d) + 0 : 0;
            if (this.f34227e != null && hasFieldNumber(2)) {
                e17 += b36.f.j(2, this.f34227e);
            }
            if (this.f34228f != null && hasFieldNumber(3)) {
                e17 += b36.f.j(3, this.f34228f);
            }
            if (this.f34229g != null && hasFieldNumber(4)) {
                e17 += b36.f.j(4, this.f34229g);
            }
            if (hasFieldNumber(5)) {
                e17 += b36.f.e(5, this.f34230h);
            }
            if (this.f34231i != null && hasFieldNumber(6)) {
                e17 += b36.f.j(6, this.f34231i);
            }
            if (this.f34232m != null && hasFieldNumber(7)) {
                e17 += b36.f.j(7, this.f34232m);
            }
            if (this.f34233n != null && hasFieldNumber(8)) {
                e17 += b36.f.j(8, this.f34233n);
            }
            if (this.f34234o != null && hasFieldNumber(9)) {
                e17 += b36.f.j(9, this.f34234o);
            }
            if (this.f34235p != null && hasFieldNumber(10)) {
                e17 += b36.f.j(10, this.f34235p);
            }
            if (hasFieldNumber(11)) {
                e17 += b36.f.h(11, this.f34236q);
            }
            if (hasFieldNumber(12)) {
                e17 += b36.f.h(12, this.f34237r);
            }
            if (this.f34238s != null && hasFieldNumber(13)) {
                e17 += b36.f.j(13, this.f34238s);
            }
            if (this.f34239t != null && hasFieldNumber(14)) {
                e17 += b36.f.j(14, this.f34239t);
            }
            if (hasFieldNumber(15)) {
                e17 += b36.f.e(15, this.f34240u);
            }
            return hasFieldNumber(1000) ? e17 + b36.f.e(1000, this.f34241v) : e17;
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
        android.util.ArrayMap arrayMap = this.f34242w;
        if (intValue == 1000) {
            this.f34241v = aVar2.g(intValue);
            arrayMap.put(1000, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f34226d = aVar2.g(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f34227e = aVar2.k(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f34228f = aVar2.k(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f34229g = aVar2.k(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f34230h = aVar2.g(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f34231i = aVar2.k(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f34232m = aVar2.k(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f34233n = aVar2.k(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            case 9:
                this.f34234o = aVar2.k(intValue);
                arrayMap.put(9, java.lang.Boolean.TRUE);
                return 0;
            case 10:
                this.f34235p = aVar2.k(intValue);
                arrayMap.put(10, java.lang.Boolean.TRUE);
                return 0;
            case 11:
                this.f34236q = aVar2.i(intValue);
                arrayMap.put(11, java.lang.Boolean.TRUE);
                return 0;
            case 12:
                this.f34237r = aVar2.i(intValue);
                arrayMap.put(12, java.lang.Boolean.TRUE);
                return 0;
            case 13:
                this.f34238s = aVar2.k(intValue);
                arrayMap.put(13, java.lang.Boolean.TRUE);
                return 0;
            case 14:
                this.f34239t = aVar2.k(intValue);
                arrayMap.put(14, java.lang.Boolean.TRUE);
                return 0;
            case 15:
                this.f34240u = aVar2.g(intValue);
                arrayMap.put(15, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
