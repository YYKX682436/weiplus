package bw5;

/* loaded from: classes9.dex */
public class r8 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f32435d;

    /* renamed from: e, reason: collision with root package name */
    public int f32436e;

    /* renamed from: f, reason: collision with root package name */
    public int f32437f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f32438g = new boolean[5];

    static {
        new bw5.r8();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r8 parseFrom(byte[] bArr) {
        return (bw5.r8) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r8)) {
            return false;
        }
        bw5.r8 r8Var = (bw5.r8) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f32435d), java.lang.Integer.valueOf(r8Var.f32435d)) && n51.f.a(java.lang.Integer.valueOf(this.f32436e), java.lang.Integer.valueOf(r8Var.f32436e)) && n51.f.a(java.lang.Integer.valueOf(this.f32437f), java.lang.Integer.valueOf(r8Var.f32437f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.r8();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32438g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[2]) {
                fVar.e(2, this.f32435d);
            }
            if (zArr[3]) {
                fVar.e(3, this.f32436e);
            }
            if (zArr[4]) {
                fVar.e(4, this.f32437f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[2] ? 0 + b36.f.e(2, this.f32435d) : 0;
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f32436e);
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f32437f) : e17;
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
        if (intValue == 2) {
            this.f32435d = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f32436e = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f32437f = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
