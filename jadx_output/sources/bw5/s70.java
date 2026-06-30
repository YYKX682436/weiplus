package bw5;

/* loaded from: classes2.dex */
public class s70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f32840d;

    /* renamed from: e, reason: collision with root package name */
    public long f32841e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f32842f = new boolean[3];

    static {
        new bw5.s70();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.s70 parseFrom(byte[] bArr) {
        return (bw5.s70) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s70)) {
            return false;
        }
        bw5.s70 s70Var = (bw5.s70) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f32840d), java.lang.Long.valueOf(s70Var.f32840d)) && n51.f.a(java.lang.Long.valueOf(this.f32841e), java.lang.Long.valueOf(s70Var.f32841e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.s70();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32842f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f32840d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f32841e);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f32840d) : 0;
            return zArr[2] ? h17 + b36.f.h(2, this.f32841e) : h17;
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
            this.f32840d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f32841e = aVar2.i(intValue);
        zArr[2] = true;
        return 0;
    }
}
