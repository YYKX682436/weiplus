package bw5;

/* loaded from: classes2.dex */
public class xd extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.vq f35066d;

    /* renamed from: e, reason: collision with root package name */
    public int f35067e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f35068f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f35069g = new boolean[4];

    static {
        new bw5.xd();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xd parseFrom(byte[] bArr) {
        return (bw5.xd) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xd)) {
            return false;
        }
        bw5.xd xdVar = (bw5.xd) fVar;
        return n51.f.a(this.f35066d, xdVar.f35066d) && n51.f.a(java.lang.Integer.valueOf(this.f35067e), java.lang.Integer.valueOf(xdVar.f35067e)) && n51.f.a(this.f35068f, xdVar.f35068f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xd();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35069g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.vq vqVar = this.f35066d;
            if (vqVar != null && zArr[1]) {
                fVar.i(1, vqVar.computeSize());
                this.f35066d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f35067e);
            }
            com.tencent.mm.protobuf.g gVar = this.f35068f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.vq vqVar2 = this.f35066d;
            if (vqVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, vqVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f35067e);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f35068f;
            return (gVar2 == null || !zArr[3]) ? i18 : i18 + b36.f.b(3, gVar2);
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f35067e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f35068f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.vq vqVar3 = new bw5.vq();
            if (bArr != null && bArr.length > 0) {
                vqVar3.parseFrom(bArr);
            }
            this.f35066d = vqVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
