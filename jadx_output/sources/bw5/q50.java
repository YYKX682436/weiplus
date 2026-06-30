package bw5;

/* loaded from: classes2.dex */
public class q50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31968d;

    /* renamed from: e, reason: collision with root package name */
    public long f31969e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f31970f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31971g = new boolean[4];

    static {
        new bw5.q50();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.q50 parseFrom(byte[] bArr) {
        return (bw5.q50) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q50)) {
            return false;
        }
        bw5.q50 q50Var = (bw5.q50) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31968d), java.lang.Integer.valueOf(q50Var.f31968d)) && n51.f.a(java.lang.Long.valueOf(this.f31969e), java.lang.Long.valueOf(q50Var.f31969e)) && n51.f.a(this.f31970f, q50Var.f31970f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.q50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f31970f;
        boolean[] zArr = this.f31971g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31968d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f31969e);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f31968d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f31969e);
            }
            return e17 + b36.f.g(3, 8, linkedList);
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
            this.f31968d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31969e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.n90 n90Var = new bw5.n90();
            if (bArr != null && bArr.length > 0) {
                n90Var.parseFrom(bArr);
            }
            linkedList.add(n90Var);
        }
        zArr[3] = true;
        return 0;
    }
}
