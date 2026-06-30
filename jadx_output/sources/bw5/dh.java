package bw5;

/* loaded from: classes2.dex */
public class dh extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f26489d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.lc f26490e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f26491f = new boolean[3];

    static {
        new bw5.dh();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dh parseFrom(byte[] bArr) {
        return (bw5.dh) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dh)) {
            return false;
        }
        bw5.dh dhVar = (bw5.dh) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f26489d), java.lang.Integer.valueOf(dhVar.f26489d)) && n51.f.a(this.f26490e, dhVar.f26490e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.dh();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26491f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f26489d);
            }
            bw5.lc lcVar = this.f26490e;
            if (lcVar != null && zArr[2]) {
                fVar.i(2, lcVar.computeSize());
                this.f26490e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f26489d) : 0;
            bw5.lc lcVar2 = this.f26490e;
            return (lcVar2 == null || !zArr[2]) ? e17 : e17 + b36.f.i(2, lcVar2.computeSize());
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
            this.f26489d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.lc lcVar3 = new bw5.lc();
            if (bArr != null && bArr.length > 0) {
                lcVar3.parseFrom(bArr);
            }
            this.f26490e = lcVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
