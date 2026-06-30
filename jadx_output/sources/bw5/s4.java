package bw5;

/* loaded from: classes2.dex */
public class s4 extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public static final bw5.s4 f32787f = new bw5.s4();

    /* renamed from: d, reason: collision with root package name */
    public boolean f32788d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f32789e = new boolean[2];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof bw5.s4) && n51.f.a(java.lang.Boolean.valueOf(this.f32788d), java.lang.Boolean.valueOf(((bw5.s4) fVar).f32788d));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.s4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32789e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f32788d);
            }
            return 0;
        }
        if (i17 == 1) {
            if (zArr[1]) {
                return 0 + b36.f.a(1, this.f32788d);
            }
            return 0;
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
        if (intValue != 1) {
            return -1;
        }
        this.f32788d = aVar2.c(intValue);
        zArr[1] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.s4) super.parseFrom(bArr);
    }
}
