package bw5;

/* loaded from: classes4.dex */
public class tp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f33570d;

    /* renamed from: e, reason: collision with root package name */
    public double f33571e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33572f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33573g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f33574h = new boolean[5];

    static {
        new bw5.tp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tp0)) {
            return false;
        }
        bw5.tp0 tp0Var = (bw5.tp0) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f33570d), java.lang.Double.valueOf(tp0Var.f33570d)) && n51.f.a(java.lang.Double.valueOf(this.f33571e), java.lang.Double.valueOf(tp0Var.f33571e)) && n51.f.a(this.f33572f, tp0Var.f33572f) && n51.f.a(this.f33573g, tp0Var.f33573g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33574h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.c(1, this.f33570d);
            }
            if (zArr[2]) {
                fVar.c(2, this.f33571e);
            }
            java.lang.String str = this.f33572f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f33573g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = zArr[1] ? 0 + b36.f.c(1, this.f33570d) : 0;
            if (zArr[2]) {
                c17 += b36.f.c(2, this.f33571e);
            }
            java.lang.String str3 = this.f33572f;
            if (str3 != null && zArr[3]) {
                c17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f33573g;
            return (str4 == null || !zArr[4]) ? c17 : c17 + b36.f.j(4, str4);
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
            this.f33570d = aVar2.e(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33571e = aVar2.e(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f33572f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f33573g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.tp0) super.parseFrom(bArr);
    }
}
