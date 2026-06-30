package bw5;

/* loaded from: classes2.dex */
public class ei extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f26921d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ii f26922e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f26923f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f26924g = new boolean[4];

    static {
        new bw5.ei();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ei parseFrom(byte[] bArr) {
        return (bw5.ei) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ei)) {
            return false;
        }
        bw5.ei eiVar = (bw5.ei) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f26921d), java.lang.Integer.valueOf(eiVar.f26921d)) && n51.f.a(this.f26922e, eiVar.f26922e) && n51.f.a(this.f26923f, eiVar.f26923f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ei();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f26923f;
        boolean[] zArr = this.f26924g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f26921d);
            }
            bw5.ii iiVar = this.f26922e;
            if (iiVar != null && zArr[2]) {
                fVar.i(2, iiVar.computeSize());
                this.f26922e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f26921d) : 0;
            bw5.ii iiVar2 = this.f26922e;
            if (iiVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, iiVar2.computeSize());
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
            this.f26921d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.ii iiVar3 = new bw5.ii();
                if (bArr != null && bArr.length > 0) {
                    iiVar3.parseFrom(bArr);
                }
                this.f26922e = iiVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.gi giVar = new bw5.gi();
            if (bArr2 != null && bArr2.length > 0) {
                giVar.parseFrom(bArr2);
            }
            linkedList.add(giVar);
        }
        zArr[3] = true;
        return 0;
    }
}
