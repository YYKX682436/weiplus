package bw5;

/* loaded from: classes2.dex */
public class o00 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30870e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f30869d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f30871f = new boolean[3];

    static {
        new bw5.o00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o00 parseFrom(byte[] bArr) {
        return (bw5.o00) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o00)) {
            return false;
        }
        bw5.o00 o00Var = (bw5.o00) fVar;
        return n51.f.a(this.f30869d, o00Var.f30869d) && n51.f.a(this.f30870e, o00Var.f30870e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.o00();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30871f;
        java.util.LinkedList linkedList = this.f30869d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList);
            java.lang.String str = this.f30870e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, linkedList) + 0;
            java.lang.String str2 = this.f30870e;
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
            linkedList.add(aVar2.k(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f30870e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
