package bw5;

/* loaded from: classes2.dex */
public class om0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31153d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31155f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f31154e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31156g = new boolean[4];

    static {
        new bw5.om0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.om0 parseFrom(byte[] bArr) {
        return (bw5.om0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.om0)) {
            return false;
        }
        bw5.om0 om0Var = (bw5.om0) fVar;
        return n51.f.a(this.f31153d, om0Var.f31153d) && n51.f.a(this.f31154e, om0Var.f31154e) && n51.f.a(this.f31155f, om0Var.f31155f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.om0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f31154e;
        boolean[] zArr = this.f31156g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31153d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str2 = this.f31155f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f31153d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            java.lang.String str4 = this.f31155f;
            return (str4 == null || !zArr[3]) ? g17 : g17 + b36.f.j(3, str4);
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
            this.f31153d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f31155f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.im0 im0Var = new bw5.im0();
            if (bArr != null && bArr.length > 0) {
                im0Var.parseFrom(bArr);
            }
            linkedList.add(im0Var);
        }
        zArr[2] = true;
        return 0;
    }
}
