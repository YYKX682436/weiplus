package bw5;

/* loaded from: classes2.dex */
public class j70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28849d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28850e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f28851f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f28852g = new boolean[4];

    static {
        new bw5.j70();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.j70 parseFrom(byte[] bArr) {
        return (bw5.j70) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j70)) {
            return false;
        }
        bw5.j70 j70Var = (bw5.j70) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28849d), java.lang.Integer.valueOf(j70Var.f28849d)) && n51.f.a(this.f28850e, j70Var.f28850e) && n51.f.a(this.f28851f, j70Var.f28851f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.j70();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28851f;
        boolean[] zArr = this.f28852g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28849d);
            }
            java.lang.String str = this.f28850e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28849d) : 0;
            java.lang.String str2 = this.f28850e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.g(3, 1, linkedList);
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
            this.f28849d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28850e = aVar2.k(intValue);
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
