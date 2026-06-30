package bw5;

/* loaded from: classes4.dex */
public class rx extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32697d;

    /* renamed from: f, reason: collision with root package name */
    public bw5.qx f32699f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f32698e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f32700g = new boolean[4];

    static {
        new bw5.rx();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rx parseFrom(byte[] bArr) {
        return (bw5.rx) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rx)) {
            return false;
        }
        bw5.rx rxVar = (bw5.rx) fVar;
        return n51.f.a(this.f32697d, rxVar.f32697d) && n51.f.a(this.f32698e, rxVar.f32698e) && n51.f.a(this.f32699f, rxVar.f32699f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.rx();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32698e;
        boolean[] zArr = this.f32700g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32697d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            bw5.qx qxVar = this.f32699f;
            if (qxVar != null && zArr[3]) {
                fVar.i(3, qxVar.computeSize());
                this.f32699f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f32697d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            bw5.qx qxVar2 = this.f32699f;
            return (qxVar2 == null || !zArr[3]) ? g17 : g17 + b36.f.i(3, qxVar2.computeSize());
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
            this.f32697d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.hy hyVar = new bw5.hy();
                if (bArr != null && bArr.length > 0) {
                    hyVar.parseFrom(bArr);
                }
                linkedList.add(hyVar);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.qx qxVar3 = new bw5.qx();
            if (bArr2 != null && bArr2.length > 0) {
                qxVar3.parseFrom(bArr2);
            }
            this.f32699f = qxVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
