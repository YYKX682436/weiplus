package bw5;

/* loaded from: classes2.dex */
public class ft extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27523d;

    /* renamed from: e, reason: collision with root package name */
    public int f27524e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.st f27525f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f27526g = new boolean[51];

    static {
        new bw5.ft();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ft parseFrom(byte[] bArr) {
        return (bw5.ft) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ft)) {
            return false;
        }
        bw5.ft ftVar = (bw5.ft) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27523d), java.lang.Integer.valueOf(ftVar.f27523d)) && n51.f.a(java.lang.Integer.valueOf(this.f27524e), java.lang.Integer.valueOf(ftVar.f27524e)) && n51.f.a(this.f27525f, ftVar.f27525f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ft();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27526g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27523d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27524e);
            }
            bw5.st stVar = this.f27525f;
            if (stVar != null && zArr[50]) {
                fVar.i(50, stVar.computeSize());
                this.f27525f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f27523d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f27524e);
            }
            bw5.st stVar2 = this.f27525f;
            return (stVar2 == null || !zArr[50]) ? e17 : e17 + b36.f.i(50, stVar2.computeSize());
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
            this.f27523d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27524e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 50) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.st stVar3 = new bw5.st();
            if (bArr != null && bArr.length > 0) {
                stVar3.parseFrom(bArr);
            }
            this.f27525f = stVar3;
        }
        zArr[50] = true;
        return 0;
    }
}
