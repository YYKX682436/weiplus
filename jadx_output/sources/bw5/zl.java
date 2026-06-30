package bw5;

/* loaded from: classes2.dex */
public class zl extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f36046d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.am f36047e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.am f36048f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f36049g = new boolean[4];

    static {
        new bw5.zl();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zl parseFrom(byte[] bArr) {
        return (bw5.zl) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zl)) {
            return false;
        }
        bw5.zl zlVar = (bw5.zl) fVar;
        return n51.f.a(this.f36046d, zlVar.f36046d) && n51.f.a(this.f36047e, zlVar.f36047e) && n51.f.a(this.f36048f, zlVar.f36048f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zl();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f36049g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36046d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.am amVar = this.f36047e;
            if (amVar != null && zArr[2]) {
                fVar.i(2, amVar.computeSize());
                this.f36047e.writeFields(fVar);
            }
            bw5.am amVar2 = this.f36048f;
            if (amVar2 != null && zArr[3]) {
                fVar.i(3, amVar2.computeSize());
                this.f36048f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f36046d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.am amVar3 = this.f36047e;
            if (amVar3 != null && zArr[2]) {
                i18 += b36.f.i(2, amVar3.computeSize());
            }
            bw5.am amVar4 = this.f36048f;
            return (amVar4 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, amVar4.computeSize());
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
            this.f36046d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.am amVar5 = new bw5.am();
                if (bArr != null && bArr.length > 0) {
                    amVar5.parseFrom(bArr);
                }
                this.f36047e = amVar5;
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
            bw5.am amVar6 = new bw5.am();
            if (bArr2 != null && bArr2.length > 0) {
                amVar6.parseFrom(bArr2);
            }
            this.f36048f = amVar6;
        }
        zArr[3] = true;
        return 0;
    }
}
