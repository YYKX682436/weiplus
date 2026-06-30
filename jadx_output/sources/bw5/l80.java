package bw5;

/* loaded from: classes11.dex */
public class l80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29683d;

    /* renamed from: e, reason: collision with root package name */
    public int f29684e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29685f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f29686g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f29687h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f29688i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f29689m;

    /* renamed from: n, reason: collision with root package name */
    public long f29690n;

    /* renamed from: o, reason: collision with root package name */
    public long f29691o;

    /* renamed from: p, reason: collision with root package name */
    public long f29692p;

    /* renamed from: q, reason: collision with root package name */
    public long f29693q;

    /* renamed from: r, reason: collision with root package name */
    public final android.util.ArrayMap f29694r = new android.util.ArrayMap();

    static {
        new bw5.l80();
    }

    public java.lang.String b() {
        return hasFieldNumber(5) ? this.f29687h : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.l80 parseFrom(byte[] bArr) {
        return (bw5.l80) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l80)) {
            return false;
        }
        bw5.l80 l80Var = (bw5.l80) fVar;
        return n51.f.a(this.f29683d, l80Var.f29683d) && n51.f.a(java.lang.Integer.valueOf(this.f29684e), java.lang.Integer.valueOf(l80Var.f29684e)) && n51.f.a(this.f29685f, l80Var.f29685f) && n51.f.a(this.f29686g, l80Var.f29686g) && n51.f.a(this.f29687h, l80Var.f29687h) && n51.f.a(this.f29688i, l80Var.f29688i) && n51.f.a(this.f29689m, l80Var.f29689m) && n51.f.a(java.lang.Long.valueOf(this.f29690n), java.lang.Long.valueOf(l80Var.f29690n)) && n51.f.a(java.lang.Long.valueOf(this.f29691o), java.lang.Long.valueOf(l80Var.f29691o)) && n51.f.a(java.lang.Long.valueOf(this.f29692p), java.lang.Long.valueOf(l80Var.f29692p)) && n51.f.a(java.lang.Long.valueOf(this.f29693q), java.lang.Long.valueOf(l80Var.f29693q));
    }

    public java.lang.String getFilePath() {
        return hasFieldNumber(1) ? this.f29683d : "";
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f29694r.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.l80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f29683d != null && hasFieldNumber(1)) {
                fVar.j(1, this.f29683d);
            }
            if (hasFieldNumber(2)) {
                fVar.e(2, this.f29684e);
            }
            if (this.f29685f != null && hasFieldNumber(3)) {
                fVar.j(3, this.f29685f);
            }
            if (this.f29686g != null && hasFieldNumber(4)) {
                fVar.j(4, this.f29686g);
            }
            if (this.f29687h != null && hasFieldNumber(5)) {
                fVar.j(5, this.f29687h);
            }
            if (this.f29688i != null && hasFieldNumber(10)) {
                fVar.j(10, this.f29688i);
            }
            if (this.f29689m != null && hasFieldNumber(100)) {
                fVar.j(100, this.f29689m);
            }
            if (hasFieldNumber(101)) {
                fVar.h(101, this.f29690n);
            }
            if (hasFieldNumber(102)) {
                fVar.h(102, this.f29691o);
            }
            if (hasFieldNumber(200)) {
                fVar.h(200, this.f29692p);
            }
            if (hasFieldNumber(201)) {
                fVar.h(201, this.f29693q);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f29683d != null && hasFieldNumber(1)) {
                i18 = 0 + b36.f.j(1, this.f29683d);
            }
            if (hasFieldNumber(2)) {
                i18 += b36.f.e(2, this.f29684e);
            }
            if (this.f29685f != null && hasFieldNumber(3)) {
                i18 += b36.f.j(3, this.f29685f);
            }
            if (this.f29686g != null && hasFieldNumber(4)) {
                i18 += b36.f.j(4, this.f29686g);
            }
            if (this.f29687h != null && hasFieldNumber(5)) {
                i18 += b36.f.j(5, this.f29687h);
            }
            if (this.f29688i != null && hasFieldNumber(10)) {
                i18 += b36.f.j(10, this.f29688i);
            }
            if (this.f29689m != null && hasFieldNumber(100)) {
                i18 += b36.f.j(100, this.f29689m);
            }
            if (hasFieldNumber(101)) {
                i18 += b36.f.h(101, this.f29690n);
            }
            if (hasFieldNumber(102)) {
                i18 += b36.f.h(102, this.f29691o);
            }
            if (hasFieldNumber(200)) {
                i18 += b36.f.h(200, this.f29692p);
            }
            return hasFieldNumber(201) ? i18 + b36.f.h(201, this.f29693q) : i18;
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
        android.util.ArrayMap arrayMap = this.f29694r;
        if (intValue == 1) {
            this.f29683d = aVar2.k(intValue);
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            this.f29684e = aVar2.g(intValue);
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3) {
            this.f29685f = aVar2.k(intValue);
            arrayMap.put(3, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 4) {
            this.f29686g = aVar2.k(intValue);
            arrayMap.put(4, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 5) {
            this.f29687h = aVar2.k(intValue);
            arrayMap.put(5, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 10) {
            this.f29688i = aVar2.k(intValue);
            arrayMap.put(10, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 200) {
            this.f29692p = aVar2.i(intValue);
            arrayMap.put(200, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 201) {
            this.f29693q = aVar2.i(intValue);
            arrayMap.put(201, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 100:
                this.f29689m = aVar2.k(intValue);
                arrayMap.put(100, java.lang.Boolean.TRUE);
                return 0;
            case 101:
                this.f29690n = aVar2.i(intValue);
                arrayMap.put(101, java.lang.Boolean.TRUE);
                return 0;
            case 102:
                this.f29691o = aVar2.i(intValue);
                arrayMap.put(102, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
