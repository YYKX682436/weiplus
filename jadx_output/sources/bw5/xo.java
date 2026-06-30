package bw5;

/* loaded from: classes2.dex */
public class xo extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.rn f35209d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ae f35210e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35211f = new boolean[3];

    static {
        new bw5.xo();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xo parseFrom(byte[] bArr) {
        return (bw5.xo) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xo)) {
            return false;
        }
        bw5.xo xoVar = (bw5.xo) fVar;
        return n51.f.a(this.f35209d, xoVar.f35209d) && n51.f.a(this.f35210e, xoVar.f35210e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35211f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.rn rnVar = this.f35209d;
            if (rnVar != null && zArr[1]) {
                fVar.i(1, rnVar.computeSize());
                this.f35209d.writeFields(fVar);
            }
            bw5.ae aeVar = this.f35210e;
            if (aeVar != null && zArr[2]) {
                fVar.i(2, aeVar.computeSize());
                this.f35210e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.rn rnVar2 = this.f35209d;
            if (rnVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, rnVar2.computeSize());
            }
            bw5.ae aeVar2 = this.f35210e;
            return (aeVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, aeVar2.computeSize());
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
                bw5.rn rnVar3 = new bw5.rn();
                if (bArr != null && bArr.length > 0) {
                    rnVar3.parseFrom(bArr);
                }
                this.f35209d = rnVar3;
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
            bw5.ae aeVar3 = new bw5.ae();
            if (bArr2 != null && bArr2.length > 0) {
                aeVar3.parseFrom(bArr2);
            }
            this.f35210e = aeVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
