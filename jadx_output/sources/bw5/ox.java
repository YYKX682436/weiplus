package bw5;

/* loaded from: classes4.dex */
public class ox extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.px f31398d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.nx f31399e;

    /* renamed from: f, reason: collision with root package name */
    public float f31400f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31401g = new boolean[4];

    static {
        new bw5.ox();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ox parseFrom(byte[] bArr) {
        return (bw5.ox) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ox)) {
            return false;
        }
        bw5.ox oxVar = (bw5.ox) fVar;
        return n51.f.a(this.f31398d, oxVar.f31398d) && n51.f.a(this.f31399e, oxVar.f31399e) && n51.f.a(java.lang.Float.valueOf(this.f31400f), java.lang.Float.valueOf(oxVar.f31400f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ox();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31401g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.px pxVar = this.f31398d;
            if (pxVar != null && zArr[1]) {
                fVar.i(1, pxVar.computeSize());
                this.f31398d.writeFields(fVar);
            }
            bw5.nx nxVar = this.f31399e;
            if (nxVar != null && zArr[2]) {
                fVar.i(2, nxVar.computeSize());
                this.f31399e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.d(3, this.f31400f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.px pxVar2 = this.f31398d;
            if (pxVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, pxVar2.computeSize());
            }
            bw5.nx nxVar2 = this.f31399e;
            if (nxVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, nxVar2.computeSize());
            }
            return zArr[3] ? i18 + b36.f.d(3, this.f31400f) : i18;
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
                bw5.px pxVar3 = new bw5.px();
                if (bArr != null && bArr.length > 0) {
                    pxVar3.parseFrom(bArr);
                }
                this.f31398d = pxVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f31400f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.nx nxVar3 = new bw5.nx();
            if (bArr2 != null && bArr2.length > 0) {
                nxVar3.parseFrom(bArr2);
            }
            this.f31399e = nxVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
