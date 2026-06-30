package bw5;

/* loaded from: classes2.dex */
public class a60 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public boolean f25034e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f25033d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f25035f = new boolean[3];

    static {
        new bw5.a60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a60 parseFrom(byte[] bArr) {
        return (bw5.a60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a60)) {
            return false;
        }
        bw5.a60 a60Var = (bw5.a60) fVar;
        return n51.f.a(this.f25033d, a60Var.f25033d) && n51.f.a(java.lang.Boolean.valueOf(this.f25034e), java.lang.Boolean.valueOf(a60Var.f25034e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.a60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25035f;
        java.util.LinkedList linkedList = this.f25033d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.a(2, this.f25034e);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            return zArr[2] ? g17 + b36.f.a(2, this.f25034e) : g17;
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
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            this.f25034e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.c70 c70Var = new bw5.c70();
            if (bArr != null && bArr.length > 0) {
                c70Var.parseFrom(bArr);
            }
            linkedList.add(c70Var);
        }
        zArr[1] = true;
        return 0;
    }
}
