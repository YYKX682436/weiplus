package bw5;

/* loaded from: classes2.dex */
public class y70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35392d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.v70 f35393e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35394f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f35395g = new boolean[4];

    static {
        new bw5.y70();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.y70 parseFrom(byte[] bArr) {
        return (bw5.y70) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y70)) {
            return false;
        }
        bw5.y70 y70Var = (bw5.y70) fVar;
        return n51.f.a(this.f35392d, y70Var.f35392d) && n51.f.a(this.f35393e, y70Var.f35393e) && n51.f.a(java.lang.Boolean.valueOf(this.f35394f), java.lang.Boolean.valueOf(y70Var.f35394f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.y70();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35395g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35392d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.v70 v70Var = this.f35393e;
            if (v70Var != null && zArr[2]) {
                fVar.i(2, v70Var.computeSize());
                this.f35393e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.a(3, this.f35394f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f35392d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.v70 v70Var2 = this.f35393e;
            if (v70Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, v70Var2.computeSize());
            }
            return zArr[3] ? i18 + b36.f.a(3, this.f35394f) : i18;
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
            this.f35392d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f35394f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.v70 v70Var3 = new bw5.v70();
            if (bArr != null && bArr.length > 0) {
                v70Var3.parseFrom(bArr);
            }
            this.f35393e = v70Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
