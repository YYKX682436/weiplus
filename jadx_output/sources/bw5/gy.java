package bw5;

/* loaded from: classes8.dex */
public class gy extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.fy f28017d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.fy f28018e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.fy f28019f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f28020g = new boolean[4];

    static {
        new bw5.gy();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gy parseFrom(byte[] bArr) {
        return (bw5.gy) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gy)) {
            return false;
        }
        bw5.gy gyVar = (bw5.gy) fVar;
        return n51.f.a(this.f28017d, gyVar.f28017d) && n51.f.a(this.f28018e, gyVar.f28018e) && n51.f.a(this.f28019f, gyVar.f28019f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gy();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28020g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.fy fyVar = this.f28017d;
            if (fyVar != null && zArr[1]) {
                fVar.i(1, fyVar.computeSize());
                this.f28017d.writeFields(fVar);
            }
            bw5.fy fyVar2 = this.f28018e;
            if (fyVar2 != null && zArr[2]) {
                fVar.i(2, fyVar2.computeSize());
                this.f28018e.writeFields(fVar);
            }
            bw5.fy fyVar3 = this.f28019f;
            if (fyVar3 != null && zArr[3]) {
                fVar.i(3, fyVar3.computeSize());
                this.f28019f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.fy fyVar4 = this.f28017d;
            if (fyVar4 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, fyVar4.computeSize());
            }
            bw5.fy fyVar5 = this.f28018e;
            if (fyVar5 != null && zArr[2]) {
                i18 += b36.f.i(2, fyVar5.computeSize());
            }
            bw5.fy fyVar6 = this.f28019f;
            return (fyVar6 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, fyVar6.computeSize());
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
                bw5.fy fyVar7 = new bw5.fy();
                if (bArr != null && bArr.length > 0) {
                    fyVar7.parseFrom(bArr);
                }
                this.f28017d = fyVar7;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.fy fyVar8 = new bw5.fy();
                if (bArr2 != null && bArr2.length > 0) {
                    fyVar8.parseFrom(bArr2);
                }
                this.f28018e = fyVar8;
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
            bw5.fy fyVar9 = new bw5.fy();
            if (bArr3 != null && bArr3.length > 0) {
                fyVar9.parseFrom(bArr3);
            }
            this.f28019f = fyVar9;
        }
        zArr[3] = true;
        return 0;
    }
}
