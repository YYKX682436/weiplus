package bw5;

/* loaded from: classes8.dex */
public class ue0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33871d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.v5 f33872e;

    /* renamed from: f, reason: collision with root package name */
    public int f33873f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f33874g = new boolean[4];

    static {
        new bw5.ue0();
    }

    public java.lang.String b() {
        return this.f33874g[1] ? this.f33871d : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.ue0 parseFrom(byte[] bArr) {
        return (bw5.ue0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ue0)) {
            return false;
        }
        bw5.ue0 ue0Var = (bw5.ue0) fVar;
        return n51.f.a(this.f33871d, ue0Var.f33871d) && n51.f.a(this.f33872e, ue0Var.f33872e) && n51.f.a(java.lang.Integer.valueOf(this.f33873f), java.lang.Integer.valueOf(ue0Var.f33873f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ue0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33874g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33871d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.v5 v5Var = this.f33872e;
            if (v5Var != null && zArr[2]) {
                fVar.i(2, v5Var.computeSize());
                this.f33872e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33873f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f33871d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.v5 v5Var2 = this.f33872e;
            if (v5Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, v5Var2.computeSize());
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f33873f) : i18;
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
            this.f33871d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f33873f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.v5 v5Var3 = new bw5.v5();
            if (bArr != null && bArr.length > 0) {
                v5Var3.parseFrom(bArr);
            }
            this.f33872e = v5Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
