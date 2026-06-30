package bw5;

/* loaded from: classes2.dex */
public class gw extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f28012d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28013e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f28014f = new boolean[3];

    static {
        new bw5.gw();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gw parseFrom(byte[] bArr) {
        return (bw5.gw) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gw)) {
            return false;
        }
        bw5.gw gwVar = (bw5.gw) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f28012d), java.lang.Long.valueOf(gwVar.f28012d)) && n51.f.a(this.f28013e, gwVar.f28013e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gw();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28014f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f28012d);
            }
            java.lang.String str = this.f28013e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f28012d) : 0;
            java.lang.String str2 = this.f28013e;
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
            this.f28012d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f28013e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
