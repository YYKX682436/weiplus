package bw5;

/* loaded from: classes4.dex */
public class iy extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.qx f28723e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.qx f28724f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.sx f28725g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f28722d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28726h = new boolean[5];

    static {
        new bw5.iy();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.iy parseFrom(byte[] bArr) {
        return (bw5.iy) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.iy)) {
            return false;
        }
        bw5.iy iyVar = (bw5.iy) fVar;
        return n51.f.a(this.f28722d, iyVar.f28722d) && n51.f.a(this.f28723e, iyVar.f28723e) && n51.f.a(this.f28724f, iyVar.f28724f) && n51.f.a(this.f28725g, iyVar.f28725g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.iy();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28722d;
        boolean[] zArr = this.f28726h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            bw5.qx qxVar = this.f28723e;
            if (qxVar != null && zArr[2]) {
                fVar.i(2, qxVar.computeSize());
                this.f28723e.writeFields(fVar);
            }
            bw5.qx qxVar2 = this.f28724f;
            if (qxVar2 != null && zArr[3]) {
                fVar.i(3, qxVar2.computeSize());
                this.f28724f.writeFields(fVar);
            }
            bw5.sx sxVar = this.f28725g;
            if (sxVar != null && zArr[4]) {
                fVar.i(4, sxVar.computeSize());
                this.f28725g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            bw5.qx qxVar3 = this.f28723e;
            if (qxVar3 != null && zArr[2]) {
                g17 += b36.f.i(2, qxVar3.computeSize());
            }
            bw5.qx qxVar4 = this.f28724f;
            if (qxVar4 != null && zArr[3]) {
                g17 += b36.f.i(3, qxVar4.computeSize());
            }
            bw5.sx sxVar2 = this.f28725g;
            return (sxVar2 == null || !zArr[4]) ? g17 : g17 + b36.f.i(4, sxVar2.computeSize());
        }
        if (i17 == 2) {
            linkedList.clear();
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
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.hy hyVar = new bw5.hy();
                if (bArr != null && bArr.length > 0) {
                    hyVar.parseFrom(bArr);
                }
                linkedList.add(hyVar);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.qx qxVar5 = new bw5.qx();
                if (bArr2 != null && bArr2.length > 0) {
                    qxVar5.parseFrom(bArr2);
                }
                this.f28723e = qxVar5;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                bw5.qx qxVar6 = new bw5.qx();
                if (bArr3 != null && bArr3.length > 0) {
                    qxVar6.parseFrom(bArr3);
                }
                this.f28724f = qxVar6;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr4 = (byte[]) j27.get(i28);
            bw5.sx sxVar3 = new bw5.sx();
            if (bArr4 != null && bArr4.length > 0) {
                sxVar3.parseFrom(bArr4);
            }
            this.f28725g = sxVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
