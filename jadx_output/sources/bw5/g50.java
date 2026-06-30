package bw5;

/* loaded from: classes2.dex */
public class g50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f27691d;

    /* renamed from: e, reason: collision with root package name */
    public long f27692e;

    /* renamed from: f, reason: collision with root package name */
    public int f27693f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27694g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27695h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f27696i = new boolean[6];

    static {
        new bw5.g50();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.g50 parseFrom(byte[] bArr) {
        return (bw5.g50) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g50)) {
            return false;
        }
        bw5.g50 g50Var = (bw5.g50) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f27691d), java.lang.Boolean.valueOf(g50Var.f27691d)) && n51.f.a(java.lang.Long.valueOf(this.f27692e), java.lang.Long.valueOf(g50Var.f27692e)) && n51.f.a(java.lang.Integer.valueOf(this.f27693f), java.lang.Integer.valueOf(g50Var.f27693f)) && n51.f.a(this.f27694g, g50Var.f27694g) && n51.f.a(java.lang.Boolean.valueOf(this.f27695h), java.lang.Boolean.valueOf(g50Var.f27695h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.g50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27696i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f27691d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f27692e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27693f);
            }
            java.lang.String str = this.f27694g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.a(5, this.f27695h);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f27691d) : 0;
            if (zArr[2]) {
                a17 += b36.f.h(2, this.f27692e);
            }
            if (zArr[3]) {
                a17 += b36.f.e(3, this.f27693f);
            }
            java.lang.String str2 = this.f27694g;
            if (str2 != null && zArr[4]) {
                a17 += b36.f.j(4, str2);
            }
            return zArr[5] ? a17 + b36.f.a(5, this.f27695h) : a17;
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
        if (intValue == 1) {
            this.f27691d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27692e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27693f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f27694g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f27695h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }
}
