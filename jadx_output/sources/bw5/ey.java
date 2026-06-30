package bw5;

/* loaded from: classes8.dex */
public class ey extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.cy f27093d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ay f27094e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f27095f = new boolean[3];

    static {
        new bw5.ey();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ey parseFrom(byte[] bArr) {
        return (bw5.ey) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ey)) {
            return false;
        }
        bw5.ey eyVar = (bw5.ey) fVar;
        return n51.f.a(this.f27093d, eyVar.f27093d) && n51.f.a(this.f27094e, eyVar.f27094e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ey();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27095f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.cy cyVar = this.f27093d;
            if (cyVar != null && zArr[1]) {
                fVar.i(1, cyVar.computeSize());
                this.f27093d.writeFields(fVar);
            }
            bw5.ay ayVar = this.f27094e;
            if (ayVar != null && zArr[2]) {
                fVar.i(2, ayVar.computeSize());
                this.f27094e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.cy cyVar2 = this.f27093d;
            if (cyVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, cyVar2.computeSize());
            }
            bw5.ay ayVar2 = this.f27094e;
            return (ayVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, ayVar2.computeSize());
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
                bw5.cy cyVar3 = new bw5.cy();
                if (bArr != null && bArr.length > 0) {
                    cyVar3.parseFrom(bArr);
                }
                this.f27093d = cyVar3;
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
            bw5.ay ayVar3 = new bw5.ay();
            if (bArr2 != null && bArr2.length > 0) {
                ayVar3.parseFrom(bArr2);
            }
            this.f27094e = ayVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
