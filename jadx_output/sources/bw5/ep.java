package bw5;

/* loaded from: classes2.dex */
public class ep extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.dp f26982d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.gp f26983e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f26984f = new boolean[3];

    static {
        new bw5.ep();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ep parseFrom(byte[] bArr) {
        return (bw5.ep) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ep)) {
            return false;
        }
        bw5.ep epVar = (bw5.ep) fVar;
        return n51.f.a(this.f26982d, epVar.f26982d) && n51.f.a(this.f26983e, epVar.f26983e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ep();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26984f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.dp dpVar = this.f26982d;
            if (dpVar != null && zArr[1]) {
                fVar.i(1, dpVar.computeSize());
                this.f26982d.writeFields(fVar);
            }
            bw5.gp gpVar = this.f26983e;
            if (gpVar != null && zArr[2]) {
                fVar.i(2, gpVar.computeSize());
                this.f26983e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.dp dpVar2 = this.f26982d;
            if (dpVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, dpVar2.computeSize());
            }
            bw5.gp gpVar2 = this.f26983e;
            return (gpVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, gpVar2.computeSize());
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
                bw5.dp dpVar3 = new bw5.dp();
                if (bArr != null && bArr.length > 0) {
                    dpVar3.parseFrom(bArr);
                }
                this.f26982d = dpVar3;
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
            bw5.gp gpVar3 = new bw5.gp();
            if (bArr2 != null && bArr2.length > 0) {
                gpVar3.parseFrom(bArr2);
            }
            this.f26983e = gpVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
