package bw5;

/* loaded from: classes2.dex */
public class sy extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f33174d;

    /* renamed from: e, reason: collision with root package name */
    public int f33175e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f33176f = new boolean[3];

    static {
        new bw5.sy();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sy parseFrom(byte[] bArr) {
        return (bw5.sy) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sy)) {
            return false;
        }
        bw5.sy syVar = (bw5.sy) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f33174d), java.lang.Integer.valueOf(syVar.f33174d)) && n51.f.a(java.lang.Integer.valueOf(this.f33175e), java.lang.Integer.valueOf(syVar.f33175e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sy();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33176f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f33174d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f33175e);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f33174d) : 0;
            return zArr[2] ? e17 + b36.f.e(2, this.f33175e) : e17;
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
            this.f33174d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f33175e = aVar2.g(intValue);
        zArr[2] = true;
        return 0;
    }
}
