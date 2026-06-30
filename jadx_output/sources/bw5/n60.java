package bw5;

/* loaded from: classes2.dex */
public class n60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f30508d;

    /* renamed from: e, reason: collision with root package name */
    public int f30509e;

    /* renamed from: f, reason: collision with root package name */
    public int f30510f;

    /* renamed from: g, reason: collision with root package name */
    public int f30511g;

    /* renamed from: h, reason: collision with root package name */
    public int f30512h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30514m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f30515n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f30516o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30517p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f30518q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f30519r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f30520s;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f30513i = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final android.util.ArrayMap f30521t = new android.util.ArrayMap();

    static {
        new bw5.n60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n60 parseFrom(byte[] bArr) {
        return (bw5.n60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n60)) {
            return false;
        }
        bw5.n60 n60Var = (bw5.n60) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f30508d), java.lang.Integer.valueOf(n60Var.f30508d)) && n51.f.a(java.lang.Integer.valueOf(this.f30509e), java.lang.Integer.valueOf(n60Var.f30509e)) && n51.f.a(java.lang.Integer.valueOf(this.f30510f), java.lang.Integer.valueOf(n60Var.f30510f)) && n51.f.a(java.lang.Integer.valueOf(this.f30511g), java.lang.Integer.valueOf(n60Var.f30511g)) && n51.f.a(java.lang.Integer.valueOf(this.f30512h), java.lang.Integer.valueOf(n60Var.f30512h)) && n51.f.a(this.f30513i, n60Var.f30513i) && n51.f.a(this.f30514m, n60Var.f30514m) && n51.f.a(this.f30515n, n60Var.f30515n) && n51.f.a(java.lang.Boolean.valueOf(this.f30516o), java.lang.Boolean.valueOf(n60Var.f30516o)) && n51.f.a(java.lang.Boolean.valueOf(this.f30517p), java.lang.Boolean.valueOf(n60Var.f30517p)) && n51.f.a(java.lang.Boolean.valueOf(this.f30518q), java.lang.Boolean.valueOf(n60Var.f30518q)) && n51.f.a(this.f30519r, n60Var.f30519r) && n51.f.a(this.f30520s, n60Var.f30520s);
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f30521t.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.n60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30513i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (hasFieldNumber(1)) {
                fVar.e(1, this.f30508d);
            }
            if (hasFieldNumber(2)) {
                fVar.e(2, this.f30509e);
            }
            if (hasFieldNumber(3)) {
                fVar.e(3, this.f30510f);
            }
            if (hasFieldNumber(4)) {
                fVar.e(4, this.f30511g);
            }
            if (hasFieldNumber(5)) {
                fVar.e(5, this.f30512h);
            }
            fVar.g(6, 8, linkedList);
            if (this.f30514m != null && hasFieldNumber(7)) {
                fVar.j(7, this.f30514m);
            }
            if (this.f30515n != null && hasFieldNumber(8)) {
                fVar.j(8, this.f30515n);
            }
            if (hasFieldNumber(9)) {
                fVar.a(9, this.f30516o);
            }
            if (hasFieldNumber(10)) {
                fVar.a(10, this.f30517p);
            }
            if (hasFieldNumber(11)) {
                fVar.a(11, this.f30518q);
            }
            if (this.f30519r != null && hasFieldNumber(101)) {
                fVar.j(101, this.f30519r);
            }
            if (this.f30520s != null && hasFieldNumber(102)) {
                fVar.j(102, this.f30520s);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = hasFieldNumber(1) ? b36.f.e(1, this.f30508d) + 0 : 0;
            if (hasFieldNumber(2)) {
                e17 += b36.f.e(2, this.f30509e);
            }
            if (hasFieldNumber(3)) {
                e17 += b36.f.e(3, this.f30510f);
            }
            if (hasFieldNumber(4)) {
                e17 += b36.f.e(4, this.f30511g);
            }
            if (hasFieldNumber(5)) {
                e17 += b36.f.e(5, this.f30512h);
            }
            int g17 = e17 + b36.f.g(6, 8, linkedList);
            if (this.f30514m != null && hasFieldNumber(7)) {
                g17 += b36.f.j(7, this.f30514m);
            }
            if (this.f30515n != null && hasFieldNumber(8)) {
                g17 += b36.f.j(8, this.f30515n);
            }
            if (hasFieldNumber(9)) {
                g17 += b36.f.a(9, this.f30516o);
            }
            if (hasFieldNumber(10)) {
                g17 += b36.f.a(10, this.f30517p);
            }
            if (hasFieldNumber(11)) {
                g17 += b36.f.a(11, this.f30518q);
            }
            if (this.f30519r != null && hasFieldNumber(101)) {
                g17 += b36.f.j(101, this.f30519r);
            }
            return (this.f30520s == null || !hasFieldNumber(102)) ? g17 : g17 + b36.f.j(102, this.f30520s);
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
        android.util.ArrayMap arrayMap = this.f30521t;
        if (intValue == 101) {
            this.f30519r = aVar2.k(intValue);
            arrayMap.put(101, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 102) {
            this.f30520s = aVar2.k(intValue);
            arrayMap.put(102, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f30508d = aVar2.g(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f30509e = aVar2.g(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f30510f = aVar2.g(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f30511g = aVar2.g(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f30512h = aVar2.g(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.m60 m60Var = new bw5.m60();
                    if (bArr != null && bArr.length > 0) {
                        m60Var.parseFrom(bArr);
                    }
                    linkedList.add(m60Var);
                }
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f30514m = aVar2.k(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f30515n = aVar2.k(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            case 9:
                this.f30516o = aVar2.c(intValue);
                arrayMap.put(9, java.lang.Boolean.TRUE);
                return 0;
            case 10:
                this.f30517p = aVar2.c(intValue);
                arrayMap.put(10, java.lang.Boolean.TRUE);
                return 0;
            case 11:
                this.f30518q = aVar2.c(intValue);
                arrayMap.put(11, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
