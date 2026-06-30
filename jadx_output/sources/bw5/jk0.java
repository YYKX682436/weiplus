package bw5;

/* loaded from: classes2.dex */
public class jk0 extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final bw5.jk0 f29002h = new bw5.jk0();

    /* renamed from: d, reason: collision with root package name */
    public int f29003d;

    /* renamed from: e, reason: collision with root package name */
    public int f29004e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29005f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f29006g = new boolean[4];

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jk0 parseFrom(byte[] bArr) {
        return (bw5.jk0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jk0)) {
            return false;
        }
        bw5.jk0 jk0Var = (bw5.jk0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29003d), java.lang.Integer.valueOf(jk0Var.f29003d)) && n51.f.a(java.lang.Integer.valueOf(this.f29004e), java.lang.Integer.valueOf(jk0Var.f29004e)) && n51.f.a(this.f29005f, jk0Var.f29005f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jk0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29006g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29003d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29004e);
            }
            java.lang.String str = this.f29005f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f29003d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f29004e);
            }
            java.lang.String str2 = this.f29005f;
            return (str2 == null || !zArr[3]) ? e17 : e17 + b36.f.j(3, str2);
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
            this.f29003d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29004e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f29005f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
