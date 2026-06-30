package bw5;

/* loaded from: classes2.dex */
public class he extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ge f28177d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.fe f28178e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f28179f = new boolean[3];

    static {
        new bw5.he();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.he parseFrom(byte[] bArr) {
        return (bw5.he) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.he)) {
            return false;
        }
        bw5.he heVar = (bw5.he) fVar;
        return n51.f.a(this.f28177d, heVar.f28177d) && n51.f.a(this.f28178e, heVar.f28178e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28179f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ge geVar = this.f28177d;
            if (geVar != null && zArr[1]) {
                fVar.i(1, geVar.computeSize());
                this.f28177d.writeFields(fVar);
            }
            bw5.fe feVar = this.f28178e;
            if (feVar != null && zArr[2]) {
                fVar.i(2, feVar.computeSize());
                this.f28178e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ge geVar2 = this.f28177d;
            if (geVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, geVar2.computeSize());
            }
            bw5.fe feVar2 = this.f28178e;
            return (feVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, feVar2.computeSize());
        }
        if (i17 == 2) {
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
                bw5.ge geVar3 = new bw5.ge();
                if (bArr != null && bArr.length > 0) {
                    geVar3.parseFrom(bArr);
                }
                this.f28177d = geVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.fe feVar3 = new bw5.fe();
            if (bArr2 != null && bArr2.length > 0) {
                feVar3.parseFrom(bArr2);
            }
            this.f28178e = feVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
