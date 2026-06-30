package bw5;

/* loaded from: classes2.dex */
public class b10 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25480d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f25481e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25482f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f25483g = new boolean[5];

    static {
        new bw5.b10();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b10 parseFrom(byte[] bArr) {
        return (bw5.b10) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b10)) {
            return false;
        }
        bw5.b10 b10Var = (bw5.b10) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25480d), java.lang.Integer.valueOf(b10Var.f25480d)) && n51.f.a(this.f25481e, b10Var.f25481e) && n51.f.a(this.f25482f, b10Var.f25482f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.b10();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25483g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25480d);
            }
            com.tencent.mm.protobuf.g gVar = this.f25481e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f25482f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f25480d) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f25481e;
            if (gVar2 != null && zArr[2]) {
                e17 += b36.f.b(2, gVar2);
            }
            java.lang.String str2 = this.f25482f;
            return (str2 == null || !zArr[4]) ? e17 : e17 + b36.f.j(4, str2);
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
            this.f25480d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25481e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f25482f = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
