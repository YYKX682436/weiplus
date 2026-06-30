package bw5;

/* loaded from: classes2.dex */
public class b80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25565d;

    /* renamed from: e, reason: collision with root package name */
    public long f25566e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f25567f = new boolean[3];

    static {
        new bw5.b80();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b80 parseFrom(byte[] bArr) {
        return (bw5.b80) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b80)) {
            return false;
        }
        bw5.b80 b80Var = (bw5.b80) fVar;
        return n51.f.a(this.f25565d, b80Var.f25565d) && n51.f.a(java.lang.Long.valueOf(this.f25566e), java.lang.Long.valueOf(b80Var.f25566e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.b80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25567f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25565d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f25566e);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f25565d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            return zArr[2] ? i18 + b36.f.h(2, this.f25566e) : i18;
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
            this.f25565d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f25566e = aVar2.i(intValue);
        zArr[2] = true;
        return 0;
    }
}
