package bw5;

/* loaded from: classes7.dex */
public class w7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34597d;

    /* renamed from: e, reason: collision with root package name */
    public int f34598e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f34599f = new boolean[3];

    static {
        new bw5.w7();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.w7 parseFrom(byte[] bArr) {
        return (bw5.w7) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w7)) {
            return false;
        }
        bw5.w7 w7Var = (bw5.w7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34597d), java.lang.Integer.valueOf(w7Var.f34597d)) && n51.f.a(java.lang.Integer.valueOf(this.f34598e), java.lang.Integer.valueOf(w7Var.f34598e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.w7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34599f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34597d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34598e);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f34597d) : 0;
            return zArr[2] ? e17 + b36.f.e(2, this.f34598e) : e17;
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
            this.f34597d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f34598e = aVar2.g(intValue);
        zArr[2] = true;
        return 0;
    }
}
