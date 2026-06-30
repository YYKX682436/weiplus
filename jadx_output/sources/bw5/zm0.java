package bw5;

/* loaded from: classes2.dex */
public class zm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final bw5.zm0 f36059i = new bw5.zm0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f36060d;

    /* renamed from: e, reason: collision with root package name */
    public int f36061e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f36062f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.xm0 f36063g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f36064h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zm0)) {
            return false;
        }
        bw5.zm0 zm0Var = (bw5.zm0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f36060d), java.lang.Boolean.valueOf(zm0Var.f36060d)) && n51.f.a(java.lang.Integer.valueOf(this.f36061e), java.lang.Integer.valueOf(zm0Var.f36061e)) && n51.f.a(this.f36062f, zm0Var.f36062f) && n51.f.a(this.f36063g, zm0Var.f36063g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f36064h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f36060d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f36061e);
            }
            java.lang.String str = this.f36062f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.xm0 xm0Var = this.f36063g;
            if (xm0Var != null && zArr[4]) {
                fVar.i(4, xm0Var.computeSize());
                this.f36063g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f36060d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f36061e);
            }
            java.lang.String str2 = this.f36062f;
            if (str2 != null && zArr[3]) {
                a17 += b36.f.j(3, str2);
            }
            bw5.xm0 xm0Var2 = this.f36063g;
            return (xm0Var2 == null || !zArr[4]) ? a17 : a17 + b36.f.i(4, xm0Var2.computeSize());
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
            this.f36060d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f36061e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f36062f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.xm0 xm0Var3 = new bw5.xm0();
            if (bArr != null && bArr.length > 0) {
                xm0Var3.parseFrom(bArr);
            }
            this.f36063g = xm0Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.zm0) super.parseFrom(bArr);
    }
}
