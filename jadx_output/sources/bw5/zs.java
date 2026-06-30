package bw5;

/* loaded from: classes2.dex */
public class zs extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f36176d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.st f36177e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f36178f = new boolean[51];

    static {
        new bw5.zs();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zs parseFrom(byte[] bArr) {
        return (bw5.zs) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zs)) {
            return false;
        }
        bw5.zs zsVar = (bw5.zs) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f36176d), java.lang.Integer.valueOf(zsVar.f36176d)) && n51.f.a(this.f36177e, zsVar.f36177e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zs();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f36178f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f36176d);
            }
            bw5.st stVar = this.f36177e;
            if (stVar != null && zArr[50]) {
                fVar.i(50, stVar.computeSize());
                this.f36177e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f36176d) : 0;
            bw5.st stVar2 = this.f36177e;
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
            this.f36176d = aVar2.g(intValue);
            zArr[1] = true;
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
            this.f36177e = stVar3;
        }
        zArr[50] = true;
        return 0;
    }
}
