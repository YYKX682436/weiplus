package bw5;

/* loaded from: classes9.dex */
public class an0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25277d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25278e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f25279f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f25280g = new boolean[4];

    static {
        new bw5.an0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.an0 parseFrom(byte[] bArr) {
        return (bw5.an0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.an0)) {
            return false;
        }
        bw5.an0 an0Var = (bw5.an0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25277d), java.lang.Integer.valueOf(an0Var.f25277d)) && n51.f.a(this.f25278e, an0Var.f25278e) && n51.f.a(this.f25279f, an0Var.f25279f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.an0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25279f;
        boolean[] zArr = this.f25280g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25277d);
            }
            java.lang.String str = this.f25278e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f25277d) : 0;
            java.lang.String str2 = this.f25278e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
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
            this.f25277d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25278e = aVar2.k(intValue);
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
            bw5.bn0 bn0Var = new bw5.bn0();
            if (bArr != null && bArr.length > 0) {
                bn0Var.parseFrom(bArr);
            }
            linkedList.add(bn0Var);
        }
        zArr[3] = true;
        return 0;
    }
}
