package bw5;

/* loaded from: classes2.dex */
public class vb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34275d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34276e;

    /* renamed from: g, reason: collision with root package name */
    public int f34278g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f34277f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f34279h = new boolean[5];

    static {
        new bw5.vb0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vb0 parseFrom(byte[] bArr) {
        return (bw5.vb0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vb0)) {
            return false;
        }
        bw5.vb0 vb0Var = (bw5.vb0) fVar;
        return n51.f.a(this.f34275d, vb0Var.f34275d) && n51.f.a(this.f34276e, vb0Var.f34276e) && n51.f.a(this.f34277f, vb0Var.f34277f) && n51.f.a(java.lang.Integer.valueOf(this.f34278g), java.lang.Integer.valueOf(vb0Var.f34278g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34277f;
        boolean[] zArr = this.f34279h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34275d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f34276e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            if (zArr[4]) {
                fVar.e(4, this.f34278g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f34275d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f34276e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            return zArr[4] ? g17 + b36.f.e(4, this.f34278g) : g17;
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
            this.f34275d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34276e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f34278g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ub0 ub0Var = new bw5.ub0();
            if (bArr != null && bArr.length > 0) {
                ub0Var.parseFrom(bArr);
            }
            linkedList.add(ub0Var);
        }
        zArr[3] = true;
        return 0;
    }
}
