package bw5;

/* loaded from: classes2.dex */
public class gd0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27816d;

    /* renamed from: e, reason: collision with root package name */
    public int f27817e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27818f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.zc0 f27819g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f27820h = new boolean[5];

    static {
        new bw5.gd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gd0)) {
            return false;
        }
        bw5.gd0 gd0Var = (bw5.gd0) fVar;
        return n51.f.a(this.f27816d, gd0Var.f27816d) && n51.f.a(java.lang.Integer.valueOf(this.f27817e), java.lang.Integer.valueOf(gd0Var.f27817e)) && n51.f.a(this.f27818f, gd0Var.f27818f) && n51.f.a(this.f27819g, gd0Var.f27819g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27820h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27816d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27817e);
            }
            java.lang.String str2 = this.f27818f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.zc0 zc0Var = this.f27819g;
            if (zc0Var != null && zArr[4]) {
                fVar.i(4, zc0Var.computeSize());
                this.f27819g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f27816d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f27817e);
            }
            java.lang.String str4 = this.f27818f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            bw5.zc0 zc0Var2 = this.f27819g;
            return (zc0Var2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, zc0Var2.computeSize());
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
            this.f27816d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27817e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27818f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.zc0 zc0Var3 = new bw5.zc0();
            if (bArr != null && bArr.length > 0) {
                zc0Var3.parseFrom(bArr);
            }
            this.f27819g = zc0Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.gd0) super.parseFrom(bArr);
    }
}
