package bw5;

/* loaded from: classes2.dex */
public class ry extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.iy f32701d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.iy f32702e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f32703f = new boolean[3];

    static {
        new bw5.ry();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ry parseFrom(byte[] bArr) {
        return (bw5.ry) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ry)) {
            return false;
        }
        bw5.ry ryVar = (bw5.ry) fVar;
        return n51.f.a(this.f32701d, ryVar.f32701d) && n51.f.a(this.f32702e, ryVar.f32702e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ry();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32703f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.iy iyVar = this.f32701d;
            if (iyVar != null && zArr[1]) {
                fVar.i(1, iyVar.computeSize());
                this.f32701d.writeFields(fVar);
            }
            bw5.iy iyVar2 = this.f32702e;
            if (iyVar2 != null && zArr[2]) {
                fVar.i(2, iyVar2.computeSize());
                this.f32702e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.iy iyVar3 = this.f32701d;
            if (iyVar3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, iyVar3.computeSize());
            }
            bw5.iy iyVar4 = this.f32702e;
            return (iyVar4 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, iyVar4.computeSize());
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
                bw5.iy iyVar5 = new bw5.iy();
                if (bArr != null && bArr.length > 0) {
                    iyVar5.parseFrom(bArr);
                }
                this.f32701d = iyVar5;
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
            bw5.iy iyVar6 = new bw5.iy();
            if (bArr2 != null && bArr2.length > 0) {
                iyVar6.parseFrom(bArr2);
            }
            this.f32702e = iyVar6;
        }
        zArr[2] = true;
        return 0;
    }
}
