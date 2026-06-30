package bw5;

/* loaded from: classes9.dex */
public class d1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f26271d;

    /* renamed from: e, reason: collision with root package name */
    public int f26272e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26273f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f26274g = new boolean[4];

    static {
        new bw5.d1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.d1 parseFrom(byte[] bArr) {
        return (bw5.d1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.d1)) {
            return false;
        }
        bw5.d1 d1Var = (bw5.d1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f26271d), java.lang.Integer.valueOf(d1Var.f26271d)) && n51.f.a(java.lang.Integer.valueOf(this.f26272e), java.lang.Integer.valueOf(d1Var.f26272e)) && n51.f.a(java.lang.Boolean.valueOf(this.f26273f), java.lang.Boolean.valueOf(d1Var.f26273f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.d1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26274g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f26271d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f26272e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f26273f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f26271d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f26272e);
            }
            return zArr[3] ? e17 + b36.f.a(3, this.f26273f) : e17;
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
            this.f26271d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26272e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f26273f = aVar2.c(intValue);
        zArr[3] = true;
        return 0;
    }
}
