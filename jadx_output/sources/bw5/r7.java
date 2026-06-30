package bw5;

/* loaded from: classes7.dex */
public class r7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f32425d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32426e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32427f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f32428g = new boolean[4];

    static {
        new bw5.r7();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r7 parseFrom(byte[] bArr) {
        return (bw5.r7) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r7)) {
            return false;
        }
        bw5.r7 r7Var = (bw5.r7) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f32425d), java.lang.Double.valueOf(r7Var.f32425d)) && n51.f.a(java.lang.Boolean.valueOf(this.f32426e), java.lang.Boolean.valueOf(r7Var.f32426e)) && n51.f.a(java.lang.Boolean.valueOf(this.f32427f), java.lang.Boolean.valueOf(r7Var.f32427f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.r7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32428g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.c(1, this.f32425d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f32426e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f32427f);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = zArr[1] ? 0 + b36.f.c(1, this.f32425d) : 0;
            if (zArr[2]) {
                c17 += b36.f.a(2, this.f32426e);
            }
            return zArr[3] ? c17 + b36.f.a(3, this.f32427f) : c17;
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
            this.f32425d = aVar2.e(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32426e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f32427f = aVar2.c(intValue);
        zArr[3] = true;
        return 0;
    }
}
