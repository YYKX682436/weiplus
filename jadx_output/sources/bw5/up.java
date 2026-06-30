package bw5;

/* loaded from: classes10.dex */
public class up extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34014d;

    /* renamed from: e, reason: collision with root package name */
    public int f34015e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34016f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34017g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f34018h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f34019i;

    /* renamed from: m, reason: collision with root package name */
    public int f34020m;

    /* renamed from: n, reason: collision with root package name */
    public int f34021n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f34022o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f34023p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f34024q;

    /* renamed from: r, reason: collision with root package name */
    public final android.util.ArrayMap f34025r = new android.util.ArrayMap();

    static {
        new bw5.up();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.up parseFrom(byte[] bArr) {
        return (bw5.up) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.up)) {
            return false;
        }
        bw5.up upVar = (bw5.up) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34014d), java.lang.Integer.valueOf(upVar.f34014d)) && n51.f.a(java.lang.Integer.valueOf(this.f34015e), java.lang.Integer.valueOf(upVar.f34015e)) && n51.f.a(this.f34016f, upVar.f34016f) && n51.f.a(this.f34017g, upVar.f34017g) && n51.f.a(this.f34018h, upVar.f34018h) && n51.f.a(this.f34019i, upVar.f34019i) && n51.f.a(java.lang.Integer.valueOf(this.f34020m), java.lang.Integer.valueOf(upVar.f34020m)) && n51.f.a(java.lang.Integer.valueOf(this.f34021n), java.lang.Integer.valueOf(upVar.f34021n)) && n51.f.a(this.f34022o, upVar.f34022o) && n51.f.a(this.f34023p, upVar.f34023p) && n51.f.a(this.f34024q, upVar.f34024q);
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f34025r.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.up();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (hasFieldNumber(1)) {
                fVar.e(1, this.f34014d);
            }
            if (hasFieldNumber(2)) {
                fVar.e(2, this.f34015e);
            }
            if (this.f34016f != null && hasFieldNumber(31)) {
                fVar.j(31, this.f34016f);
            }
            if (this.f34017g != null && hasFieldNumber(32)) {
                fVar.j(32, this.f34017g);
            }
            if (this.f34018h != null && hasFieldNumber(33)) {
                fVar.j(33, this.f34018h);
            }
            if (this.f34019i != null && hasFieldNumber(51)) {
                fVar.j(51, this.f34019i);
            }
            if (hasFieldNumber(52)) {
                fVar.e(52, this.f34020m);
            }
            if (hasFieldNumber(53)) {
                fVar.e(53, this.f34021n);
            }
            if (this.f34022o != null && hasFieldNumber(54)) {
                fVar.j(54, this.f34022o);
            }
            if (this.f34023p != null && hasFieldNumber(55)) {
                fVar.j(55, this.f34023p);
            }
            if (this.f34024q != null && hasFieldNumber(300)) {
                fVar.j(300, this.f34024q);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = hasFieldNumber(1) ? 0 + b36.f.e(1, this.f34014d) : 0;
            if (hasFieldNumber(2)) {
                e17 += b36.f.e(2, this.f34015e);
            }
            if (this.f34016f != null && hasFieldNumber(31)) {
                e17 += b36.f.j(31, this.f34016f);
            }
            if (this.f34017g != null && hasFieldNumber(32)) {
                e17 += b36.f.j(32, this.f34017g);
            }
            if (this.f34018h != null && hasFieldNumber(33)) {
                e17 += b36.f.j(33, this.f34018h);
            }
            if (this.f34019i != null && hasFieldNumber(51)) {
                e17 += b36.f.j(51, this.f34019i);
            }
            if (hasFieldNumber(52)) {
                e17 += b36.f.e(52, this.f34020m);
            }
            if (hasFieldNumber(53)) {
                e17 += b36.f.e(53, this.f34021n);
            }
            if (this.f34022o != null && hasFieldNumber(54)) {
                e17 += b36.f.j(54, this.f34022o);
            }
            if (this.f34023p != null && hasFieldNumber(55)) {
                e17 += b36.f.j(55, this.f34023p);
            }
            return (this.f34024q == null || !hasFieldNumber(300)) ? e17 : e17 + b36.f.j(300, this.f34024q);
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
        android.util.ArrayMap arrayMap = this.f34025r;
        if (intValue == 1) {
            this.f34014d = aVar2.g(intValue);
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            this.f34015e = aVar2.g(intValue);
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 300) {
            this.f34024q = aVar2.k(intValue);
            arrayMap.put(300, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 31:
                this.f34016f = aVar2.k(intValue);
                arrayMap.put(31, java.lang.Boolean.TRUE);
                return 0;
            case 32:
                this.f34017g = aVar2.k(intValue);
                arrayMap.put(32, java.lang.Boolean.TRUE);
                return 0;
            case 33:
                this.f34018h = aVar2.k(intValue);
                arrayMap.put(33, java.lang.Boolean.TRUE);
                return 0;
            default:
                switch (intValue) {
                    case 51:
                        this.f34019i = aVar2.k(intValue);
                        arrayMap.put(51, java.lang.Boolean.TRUE);
                        return 0;
                    case 52:
                        this.f34020m = aVar2.g(intValue);
                        arrayMap.put(52, java.lang.Boolean.TRUE);
                        return 0;
                    case 53:
                        this.f34021n = aVar2.g(intValue);
                        arrayMap.put(53, java.lang.Boolean.TRUE);
                        return 0;
                    case 54:
                        this.f34022o = aVar2.k(intValue);
                        arrayMap.put(54, java.lang.Boolean.TRUE);
                        return 0;
                    case 55:
                        this.f34023p = aVar2.k(intValue);
                        arrayMap.put(55, java.lang.Boolean.TRUE);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
