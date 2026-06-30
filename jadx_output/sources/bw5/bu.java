package bw5;

/* loaded from: classes10.dex */
public class bu extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ae f25845d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25846e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f25847f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f25848g = new boolean[4];

    static {
        new bw5.bu();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bu)) {
            return false;
        }
        bw5.bu buVar = (bw5.bu) fVar;
        return n51.f.a(this.f25845d, buVar.f25845d) && n51.f.a(java.lang.Boolean.valueOf(this.f25846e), java.lang.Boolean.valueOf(buVar.f25846e)) && n51.f.a(this.f25847f, buVar.f25847f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bu();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25847f;
        boolean[] zArr = this.f25848g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ae aeVar = this.f25845d;
            if (aeVar != null && zArr[1]) {
                fVar.i(1, aeVar.computeSize());
                this.f25845d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.a(2, this.f25846e);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.ae aeVar2 = this.f25845d;
            if (aeVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, aeVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f25846e);
            }
            return i18 + b36.f.g(3, 8, linkedList);
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.ae aeVar3 = new bw5.ae();
                if (bArr != null && bArr.length > 0) {
                    aeVar3.parseFrom(bArr);
                }
                this.f25845d = aeVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25846e = aVar2.c(intValue);
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
            bw5.au auVar = new bw5.au();
            if (bArr2 != null && bArr2.length > 0) {
                auVar.parseFrom(bArr2);
            }
            linkedList.add(auVar);
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.bu) super.parseFrom(bArr);
    }
}
