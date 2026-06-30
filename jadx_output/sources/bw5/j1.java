package bw5;

/* loaded from: classes2.dex */
public class j1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28759d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28760e;

    /* renamed from: g, reason: collision with root package name */
    public bw5.pj f28762g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f28761f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28763h = new boolean[5];

    static {
        new bw5.j1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.j1 parseFrom(byte[] bArr) {
        return (bw5.j1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j1)) {
            return false;
        }
        bw5.j1 j1Var = (bw5.j1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28759d), java.lang.Integer.valueOf(j1Var.f28759d)) && n51.f.a(this.f28760e, j1Var.f28760e) && n51.f.a(this.f28761f, j1Var.f28761f) && n51.f.a(this.f28762g, j1Var.f28762g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.j1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28761f;
        boolean[] zArr = this.f28763h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28759d);
            }
            java.lang.String str = this.f28760e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            bw5.pj pjVar = this.f28762g;
            if (pjVar != null && zArr[4]) {
                fVar.i(4, pjVar.computeSize());
                this.f28762g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28759d) : 0;
            java.lang.String str2 = this.f28760e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList);
            bw5.pj pjVar2 = this.f28762g;
            return (pjVar2 == null || !zArr[4]) ? g17 : g17 + b36.f.i(4, pjVar2.computeSize());
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
            this.f28759d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28760e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.i1 i1Var = new bw5.i1();
                if (bArr != null && bArr.length > 0) {
                    i1Var.parseFrom(bArr);
                }
                linkedList.add(i1Var);
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.pj pjVar3 = new bw5.pj();
            if (bArr2 != null && bArr2.length > 0) {
                pjVar3.parseFrom(bArr2);
            }
            this.f28762g = pjVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
