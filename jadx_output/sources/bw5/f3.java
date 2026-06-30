package bw5;

/* loaded from: classes2.dex */
public class f3 extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final bw5.f3 f27129i = new bw5.f3();

    /* renamed from: d, reason: collision with root package name */
    public int f27130d;

    /* renamed from: e, reason: collision with root package name */
    public int f27131e;

    /* renamed from: f, reason: collision with root package name */
    public int f27132f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27133g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f27134h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.f3)) {
            return false;
        }
        bw5.f3 f3Var = (bw5.f3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27130d), java.lang.Integer.valueOf(f3Var.f27130d)) && n51.f.a(java.lang.Integer.valueOf(this.f27131e), java.lang.Integer.valueOf(f3Var.f27131e)) && n51.f.a(java.lang.Integer.valueOf(this.f27132f), java.lang.Integer.valueOf(f3Var.f27132f)) && n51.f.a(this.f27133g, f3Var.f27133g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.f3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27134h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27130d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27131e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27132f);
            }
            java.lang.String str = this.f27133g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f27130d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f27131e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f27132f);
            }
            java.lang.String str2 = this.f27133g;
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
            this.f27130d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27131e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27132f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f27133g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.f3) super.parseFrom(bArr);
    }
}
