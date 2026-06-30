package bw5;

/* loaded from: classes9.dex */
public class f4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27142d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f27143e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f27144f = new boolean[3];

    static {
        new bw5.f4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.f4 parseFrom(byte[] bArr) {
        return (bw5.f4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.f4)) {
            return false;
        }
        bw5.f4 f4Var = (bw5.f4) fVar;
        return n51.f.a(this.f27142d, f4Var.f27142d) && n51.f.a(this.f27143e, f4Var.f27143e);
    }

    public java.lang.String getIp() {
        return this.f27144f[1] ? this.f27142d : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.f4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27144f;
        java.util.LinkedList linkedList = this.f27143e;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27142d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f27142d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            return i18 + b36.f.g(2, 2, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
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
            this.f27142d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        zArr[2] = true;
        return 0;
    }
}
