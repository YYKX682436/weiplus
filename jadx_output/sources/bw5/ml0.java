package bw5;

/* loaded from: classes2.dex */
public class ml0 extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final bw5.ml0 f30280h = new bw5.ml0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f30281d;

    /* renamed from: e, reason: collision with root package name */
    public int f30282e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30283f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f30284g = new boolean[4];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ml0)) {
            return false;
        }
        bw5.ml0 ml0Var = (bw5.ml0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f30281d), java.lang.Boolean.valueOf(ml0Var.f30281d)) && n51.f.a(java.lang.Integer.valueOf(this.f30282e), java.lang.Integer.valueOf(ml0Var.f30282e)) && n51.f.a(this.f30283f, ml0Var.f30283f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ml0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30284g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f30281d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f30282e);
            }
            java.lang.String str = this.f30283f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f30281d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f30282e);
            }
            java.lang.String str2 = this.f30283f;
            return (str2 == null || !zArr[3]) ? a17 : a17 + b36.f.j(3, str2);
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
            this.f30281d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30282e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f30283f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.ml0) super.parseFrom(bArr);
    }
}
