package bw5;

/* loaded from: classes2.dex */
public class sk0 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33034e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f33033d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f33035f = new boolean[3];

    static {
        new bw5.sk0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sk0 parseFrom(byte[] bArr) {
        return (bw5.sk0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sk0)) {
            return false;
        }
        bw5.sk0 sk0Var = (bw5.sk0) fVar;
        return n51.f.a(this.f33033d, sk0Var.f33033d) && n51.f.a(this.f33034e, sk0Var.f33034e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sk0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33035f;
        java.util.LinkedList linkedList = this.f33033d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 3, linkedList);
            java.lang.String str = this.f33034e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 3, linkedList) + 0;
            java.lang.String str2 = this.f33034e;
            return (str2 == null || !zArr[2]) ? g17 : g17 + b36.f.j(2, str2);
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
            linkedList.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f33034e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
