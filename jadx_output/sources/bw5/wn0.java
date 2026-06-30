package bw5;

/* loaded from: classes9.dex */
public class wn0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34794d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f34795e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f34796f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f34797g = new boolean[4];

    static {
        new bw5.wn0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wn0 parseFrom(byte[] bArr) {
        return (bw5.wn0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wn0)) {
            return false;
        }
        bw5.wn0 wn0Var = (bw5.wn0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34794d), java.lang.Integer.valueOf(wn0Var.f34794d)) && n51.f.a(this.f34795e, wn0Var.f34795e) && n51.f.a(this.f34796f, wn0Var.f34796f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34796f;
        java.util.LinkedList linkedList2 = this.f34795e;
        boolean[] zArr = this.f34797g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34794d);
            }
            fVar.g(2, 2, linkedList2);
            fVar.g(3, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return (zArr[1] ? 0 + b36.f.e(1, this.f34794d) : 0) + b36.f.g(2, 2, linkedList2) + b36.f.g(3, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
            this.f34794d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            linkedList2.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        linkedList.add(aVar2.k(intValue));
        zArr[3] = true;
        return 0;
    }
}
