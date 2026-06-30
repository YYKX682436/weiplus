package bw5;

/* loaded from: classes8.dex */
public class a40 extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final bw5.a40 f25007h = new bw5.a40();

    /* renamed from: d, reason: collision with root package name */
    public bw5.bl0 f25008d;

    /* renamed from: e, reason: collision with root package name */
    public int f25009e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25010f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f25011g = new boolean[4];

    public bw5.bl0 b() {
        return this.f25011g[1] ? this.f25008d : new bw5.bl0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a40)) {
            return false;
        }
        bw5.a40 a40Var = (bw5.a40) fVar;
        return n51.f.a(this.f25008d, a40Var.f25008d) && n51.f.a(java.lang.Integer.valueOf(this.f25009e), java.lang.Integer.valueOf(a40Var.f25009e)) && n51.f.a(this.f25010f, a40Var.f25010f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.a40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25011g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.bl0 bl0Var = this.f25008d;
            if (bl0Var != null && zArr[1]) {
                fVar.i(1, bl0Var.computeSize());
                this.f25008d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f25009e);
            }
            java.lang.String str = this.f25010f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.bl0 bl0Var2 = this.f25008d;
            if (bl0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, bl0Var2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f25009e);
            }
            java.lang.String str2 = this.f25010f;
            return (str2 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str2);
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
                this.f25009e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f25010f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.bl0 bl0Var3 = new bw5.bl0();
            if (bArr != null && bArr.length > 0) {
                bl0Var3.parseFrom(bArr);
            }
            this.f25008d = bl0Var3;
        }
        zArr[1] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.a40) super.parseFrom(bArr);
    }
}
