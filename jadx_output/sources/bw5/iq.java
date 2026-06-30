package bw5;

/* loaded from: classes2.dex */
public class iq extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.eq f28669e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.cq f28670f;

    /* renamed from: h, reason: collision with root package name */
    public bw5.hq f28672h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.bq f28673i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f28668d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f28671g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f28674m = new boolean[9];

    static {
        new bw5.iq();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.iq parseFrom(byte[] bArr) {
        return (bw5.iq) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.iq)) {
            return false;
        }
        bw5.iq iqVar = (bw5.iq) fVar;
        return n51.f.a(this.f28668d, iqVar.f28668d) && n51.f.a(this.f28669e, iqVar.f28669e) && n51.f.a(this.f28670f, iqVar.f28670f) && n51.f.a(this.f28671g, iqVar.f28671g) && n51.f.a(this.f28672h, iqVar.f28672h) && n51.f.a(this.f28673i, iqVar.f28673i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.iq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28671g;
        java.util.LinkedList linkedList2 = this.f28668d;
        boolean[] zArr = this.f28674m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            bw5.eq eqVar = this.f28669e;
            if (eqVar != null && zArr[2]) {
                fVar.i(2, eqVar.computeSize());
                this.f28669e.writeFields(fVar);
            }
            bw5.cq cqVar = this.f28670f;
            if (cqVar != null && zArr[3]) {
                fVar.i(3, cqVar.computeSize());
                this.f28670f.writeFields(fVar);
            }
            fVar.g(6, 8, linkedList);
            bw5.hq hqVar = this.f28672h;
            if (hqVar != null && zArr[7]) {
                fVar.e(7, hqVar.f28325d);
            }
            bw5.bq bqVar = this.f28673i;
            if (bqVar != null && zArr[8]) {
                fVar.e(8, bqVar.f25788d);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            bw5.eq eqVar2 = this.f28669e;
            if (eqVar2 != null && zArr[2]) {
                g17 += b36.f.i(2, eqVar2.computeSize());
            }
            bw5.cq cqVar2 = this.f28670f;
            if (cqVar2 != null && zArr[3]) {
                g17 += b36.f.i(3, cqVar2.computeSize());
            }
            int g18 = g17 + b36.f.g(6, 8, linkedList);
            bw5.hq hqVar2 = this.f28672h;
            if (hqVar2 != null && zArr[7]) {
                g18 += b36.f.e(7, hqVar2.f28325d);
            }
            bw5.bq bqVar2 = this.f28673i;
            return (bqVar2 == null || !zArr[8]) ? g18 : g18 + b36.f.e(8, bqVar2.f25788d);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
                bw5.fq fqVar = new bw5.fq();
                if (bArr != null && bArr.length > 0) {
                    fqVar.parseFrom(bArr);
                }
                linkedList2.add(fqVar);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.eq eqVar3 = new bw5.eq();
                if (bArr2 != null && bArr2.length > 0) {
                    eqVar3.parseFrom(bArr2);
                }
                this.f28669e = eqVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                bw5.cq cqVar3 = new bw5.cq();
                if (bArr3 != null && bArr3.length > 0) {
                    cqVar3.parseFrom(bArr3);
                }
                this.f28670f = cqVar3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 6) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i28 = 0; i28 < size4; i28++) {
                byte[] bArr4 = (byte[]) j27.get(i28);
                bw5.fq fqVar2 = new bw5.fq();
                if (bArr4 != null && bArr4.length > 0) {
                    fqVar2.parseFrom(bArr4);
                }
                linkedList.add(fqVar2);
            }
            zArr[6] = true;
            return 0;
        }
        bw5.hq hqVar3 = null;
        bw5.bq bqVar3 = null;
        if (intValue == 7) {
            int g19 = aVar2.g(intValue);
            if (g19 == 0) {
                hqVar3 = bw5.hq.FinderMVType_FixClip;
            } else if (g19 == 1) {
                hqVar3 = bw5.hq.FinderMVType_FlexClip;
            }
            this.f28672h = hqVar3;
            zArr[7] = true;
            return 0;
        }
        if (intValue != 8) {
            return -1;
        }
        int g27 = aVar2.g(intValue);
        if (g27 == 0) {
            bqVar3 = bw5.bq.FinderMVDraftJumpPage_Edit;
        } else if (g27 == 1) {
            bqVar3 = bw5.bq.FinderMVDraftJumpPage_Preview;
        }
        this.f28673i = bqVar3;
        zArr[8] = true;
        return 0;
    }
}
