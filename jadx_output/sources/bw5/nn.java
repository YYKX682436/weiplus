package bw5;

/* loaded from: classes2.dex */
public class nn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f30746d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f30747e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f30748f = new boolean[3];

    static {
        new bw5.nn();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nn parseFrom(byte[] bArr) {
        return (bw5.nn) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nn)) {
            return false;
        }
        bw5.nn nnVar = (bw5.nn) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f30746d), java.lang.Integer.valueOf(nnVar.f30746d)) && n51.f.a(this.f30747e, nnVar.f30747e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.nn();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30748f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f30746d);
            }
            com.tencent.mm.protobuf.g gVar = this.f30747e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f30746d) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f30747e;
            return (gVar2 == null || !zArr[2]) ? e17 : e17 + b36.f.b(2, gVar2);
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
            this.f30746d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f30747e = aVar2.d(intValue);
        zArr[2] = true;
        return 0;
    }
}
