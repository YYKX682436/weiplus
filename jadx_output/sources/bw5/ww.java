package bw5;

/* loaded from: classes2.dex */
public class ww extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f34864d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34865e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f34866f = new boolean[3];

    static {
        new bw5.ww();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ww parseFrom(byte[] bArr) {
        return (bw5.ww) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ww)) {
            return false;
        }
        bw5.ww wwVar = (bw5.ww) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f34864d), java.lang.Long.valueOf(wwVar.f34864d)) && n51.f.a(this.f34865e, wwVar.f34865e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ww();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34866f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f34864d);
            }
            java.lang.String str = this.f34865e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f34864d) : 0;
            java.lang.String str2 = this.f34865e;
            return (str2 == null || !zArr[2]) ? h17 : h17 + b36.f.j(2, str2);
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
            this.f34864d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f34865e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
