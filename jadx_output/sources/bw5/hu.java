package bw5;

/* loaded from: classes2.dex */
public class hu extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.gu f28351d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.gu f28352e;

    /* renamed from: f, reason: collision with root package name */
    public long f28353f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.fu f28354g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28355h = new boolean[5];

    static {
        new bw5.hu();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hu parseFrom(byte[] bArr) {
        return (bw5.hu) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hu)) {
            return false;
        }
        bw5.hu huVar = (bw5.hu) fVar;
        return n51.f.a(this.f28351d, huVar.f28351d) && n51.f.a(this.f28352e, huVar.f28352e) && n51.f.a(java.lang.Long.valueOf(this.f28353f), java.lang.Long.valueOf(huVar.f28353f)) && n51.f.a(this.f28354g, huVar.f28354g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hu();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28355h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.gu guVar = this.f28351d;
            if (guVar != null && zArr[1]) {
                fVar.i(1, guVar.computeSize());
                this.f28351d.writeFields(fVar);
            }
            bw5.gu guVar2 = this.f28352e;
            if (guVar2 != null && zArr[2]) {
                fVar.i(2, guVar2.computeSize());
                this.f28352e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.h(3, this.f28353f);
            }
            bw5.fu fuVar = this.f28354g;
            if (fuVar != null && zArr[4]) {
                fVar.i(4, fuVar.computeSize());
                this.f28354g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.gu guVar3 = this.f28351d;
            if (guVar3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, guVar3.computeSize());
            }
            bw5.gu guVar4 = this.f28352e;
            if (guVar4 != null && zArr[2]) {
                i18 += b36.f.i(2, guVar4.computeSize());
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f28353f);
            }
            bw5.fu fuVar2 = this.f28354g;
            return (fuVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, fuVar2.computeSize());
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
                bw5.gu guVar5 = new bw5.gu();
                if (bArr != null && bArr.length > 0) {
                    guVar5.parseFrom(bArr);
                }
                this.f28351d = guVar5;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.gu guVar6 = new bw5.gu();
                if (bArr2 != null && bArr2.length > 0) {
                    guVar6.parseFrom(bArr2);
                }
                this.f28352e = guVar6;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28353f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.fu fuVar3 = new bw5.fu();
            if (bArr3 != null && bArr3.length > 0) {
                fuVar3.parseFrom(bArr3);
            }
            this.f28354g = fuVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
