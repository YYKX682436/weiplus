package bw5;

/* loaded from: classes2.dex */
public class ns extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ls f30804d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.os f30805e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ms f30806f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f30807g = new boolean[4];

    static {
        new bw5.ns();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ns parseFrom(byte[] bArr) {
        return (bw5.ns) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ns)) {
            return false;
        }
        bw5.ns nsVar = (bw5.ns) fVar;
        return n51.f.a(this.f30804d, nsVar.f30804d) && n51.f.a(this.f30805e, nsVar.f30805e) && n51.f.a(this.f30806f, nsVar.f30806f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ns();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30807g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ls lsVar = this.f30804d;
            if (lsVar != null && zArr[1]) {
                fVar.i(1, lsVar.computeSize());
                this.f30804d.writeFields(fVar);
            }
            bw5.os osVar = this.f30805e;
            if (osVar != null && zArr[2]) {
                fVar.i(2, osVar.computeSize());
                this.f30805e.writeFields(fVar);
            }
            bw5.ms msVar = this.f30806f;
            if (msVar != null && zArr[3]) {
                fVar.i(3, msVar.computeSize());
                this.f30806f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ls lsVar2 = this.f30804d;
            if (lsVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, lsVar2.computeSize());
            }
            bw5.os osVar2 = this.f30805e;
            if (osVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, osVar2.computeSize());
            }
            bw5.ms msVar2 = this.f30806f;
            return (msVar2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, msVar2.computeSize());
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
                bw5.ls lsVar3 = new bw5.ls();
                if (bArr != null && bArr.length > 0) {
                    lsVar3.parseFrom(bArr);
                }
                this.f30804d = lsVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.os osVar3 = new bw5.os();
                if (bArr2 != null && bArr2.length > 0) {
                    osVar3.parseFrom(bArr2);
                }
                this.f30805e = osVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.ms msVar3 = new bw5.ms();
            if (bArr3 != null && bArr3.length > 0) {
                msVar3.parseFrom(bArr3);
            }
            this.f30806f = msVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
