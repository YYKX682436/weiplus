package bw5;

/* loaded from: classes2.dex */
public class ny extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30847d;

    /* renamed from: e, reason: collision with root package name */
    public int f30848e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f30849f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f30850g = new boolean[4];

    static {
        new bw5.ny();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ny parseFrom(byte[] bArr) {
        return (bw5.ny) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ny)) {
            return false;
        }
        bw5.ny nyVar = (bw5.ny) fVar;
        return n51.f.a(this.f30847d, nyVar.f30847d) && n51.f.a(java.lang.Integer.valueOf(this.f30848e), java.lang.Integer.valueOf(nyVar.f30848e)) && n51.f.a(this.f30849f, nyVar.f30849f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ny();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30850g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30847d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f30848e);
            }
            com.tencent.mm.protobuf.g gVar = this.f30849f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f30847d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f30848e);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f30849f;
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
        if (intValue == 1) {
            this.f30847d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30848e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f30849f = aVar2.d(intValue);
        zArr[3] = true;
        return 0;
    }
}
