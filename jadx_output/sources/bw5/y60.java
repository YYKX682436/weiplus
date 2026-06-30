package bw5;

/* loaded from: classes2.dex */
public class y60 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f35387e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f35386d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35388f = new boolean[3];

    static {
        new bw5.y60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.y60 parseFrom(byte[] bArr) {
        return (bw5.y60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y60)) {
            return false;
        }
        bw5.y60 y60Var = (bw5.y60) fVar;
        return n51.f.a(this.f35386d, y60Var.f35386d) && n51.f.a(java.lang.Integer.valueOf(this.f35387e), java.lang.Integer.valueOf(y60Var.f35387e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.y60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35388f;
        java.util.LinkedList linkedList = this.f35386d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.e(2, this.f35387e);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            return zArr[2] ? g17 + b36.f.e(2, this.f35387e) : g17;
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
            this.f35387e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.x60 x60Var = new bw5.x60();
            if (bArr != null && bArr.length > 0) {
                x60Var.parseFrom(bArr);
            }
            linkedList.add(x60Var);
        }
        zArr[1] = true;
        return 0;
    }
}
