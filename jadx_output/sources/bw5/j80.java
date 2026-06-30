package bw5;

/* loaded from: classes2.dex */
public class j80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28864d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28865e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28866f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f28867g = new boolean[4];

    static {
        new bw5.j80();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.j80 parseFrom(byte[] bArr) {
        return (bw5.j80) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j80)) {
            return false;
        }
        bw5.j80 j80Var = (bw5.j80) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28864d), java.lang.Integer.valueOf(j80Var.f28864d)) && n51.f.a(this.f28865e, j80Var.f28865e) && n51.f.a(java.lang.Boolean.valueOf(this.f28866f), java.lang.Boolean.valueOf(j80Var.f28866f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.j80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28867g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28864d);
            }
            java.lang.String str = this.f28865e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f28866f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28864d) : 0;
            java.lang.String str2 = this.f28865e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            return zArr[3] ? e17 + b36.f.a(3, this.f28866f) : e17;
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
            this.f28864d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28865e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f28866f = aVar2.c(intValue);
        zArr[3] = true;
        return 0;
    }
}
