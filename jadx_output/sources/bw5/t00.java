package bw5;

/* loaded from: classes2.dex */
public class t00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f33206d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f33207e = new boolean[5];

    static {
        new bw5.t00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.t00 parseFrom(byte[] bArr) {
        return (bw5.t00) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof bw5.t00) && n51.f.a(java.lang.Boolean.valueOf(this.f33206d), java.lang.Boolean.valueOf(((bw5.t00) fVar).f33206d));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.t00();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33207e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[4]) {
                fVar.a(4, this.f33206d);
            }
            return 0;
        }
        if (i17 == 1) {
            if (zArr[4]) {
                return 0 + b36.f.a(4, this.f33206d);
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
        if (intValue != 4) {
            return -1;
        }
        this.f33206d = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
