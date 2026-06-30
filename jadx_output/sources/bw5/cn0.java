package bw5;

/* loaded from: classes2.dex */
public class cn0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f26173d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f26174e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f26175f = new boolean[3];

    static {
        new bw5.cn0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cn0 parseFrom(byte[] bArr) {
        return (bw5.cn0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cn0)) {
            return false;
        }
        bw5.cn0 cn0Var = (bw5.cn0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f26173d), java.lang.Long.valueOf(cn0Var.f26173d)) && n51.f.a(this.f26174e, cn0Var.f26174e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.cn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f26174e;
        boolean[] zArr = this.f26175f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f26173d);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return (zArr[1] ? 0 + b36.f.h(1, this.f26173d) : 0) + b36.f.g(2, 8, linkedList);
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
            this.f26173d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.dn0 dn0Var = new bw5.dn0();
            if (bArr != null && bArr.length > 0) {
                dn0Var.parseFrom(bArr);
            }
            linkedList.add(dn0Var);
        }
        zArr[2] = true;
        return 0;
    }
}
