package bw5;

/* loaded from: classes8.dex */
public class oz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31413d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31414e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f31415f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31416g = new boolean[5];

    static {
        new bw5.oz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.oz parseFrom(byte[] bArr) {
        return (bw5.oz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oz)) {
            return false;
        }
        bw5.oz ozVar = (bw5.oz) fVar;
        return n51.f.a(this.f31413d, ozVar.f31413d) && n51.f.a(this.f31414e, ozVar.f31414e) && n51.f.a(this.f31415f, ozVar.f31415f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.oz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f31415f;
        boolean[] zArr = this.f31416g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31413d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f31414e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f31413d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f31414e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            return i18 + b36.f.g(4, 8, linkedList);
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
            this.f31413d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31414e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.qz qzVar = new bw5.qz();
            if (bArr != null && bArr.length > 0) {
                qzVar.parseFrom(bArr);
            }
            linkedList.add(qzVar);
        }
        zArr[4] = true;
        return 0;
    }
}
