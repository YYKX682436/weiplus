package bw5;

/* loaded from: classes8.dex */
public class tr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f33584d;

    /* renamed from: e, reason: collision with root package name */
    public long f33585e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f33586f = new boolean[3];

    static {
        new bw5.tr();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tr parseFrom(byte[] bArr) {
        return (bw5.tr) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tr)) {
            return false;
        }
        bw5.tr trVar = (bw5.tr) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f33584d), java.lang.Long.valueOf(trVar.f33584d)) && n51.f.a(java.lang.Long.valueOf(this.f33585e), java.lang.Long.valueOf(trVar.f33585e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tr();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33586f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f33584d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f33585e);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f33584d) : 0;
            return zArr[2] ? h17 + b36.f.h(2, this.f33585e) : h17;
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
            this.f33584d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f33585e = aVar2.i(intValue);
        zArr[2] = true;
        return 0;
    }
}
