package bw5;

/* loaded from: classes2.dex */
public class e90 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26797d;

    /* renamed from: e, reason: collision with root package name */
    public int f26798e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.d90 f26799f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26800g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26801h = new boolean[5];

    static {
        new bw5.e90();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.e90 parseFrom(byte[] bArr) {
        return (bw5.e90) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e90)) {
            return false;
        }
        bw5.e90 e90Var = (bw5.e90) fVar;
        return n51.f.a(this.f26797d, e90Var.f26797d) && n51.f.a(java.lang.Integer.valueOf(this.f26798e), java.lang.Integer.valueOf(e90Var.f26798e)) && n51.f.a(this.f26799f, e90Var.f26799f) && n51.f.a(this.f26800g, e90Var.f26800g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.e90();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26801h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f26797d;
            if (gVar != null && zArr[1]) {
                fVar.b(1, gVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f26798e);
            }
            bw5.d90 d90Var = this.f26799f;
            if (d90Var != null && zArr[3]) {
                fVar.i(3, d90Var.computeSize());
                this.f26799f.writeFields(fVar);
            }
            java.lang.String str = this.f26800g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.f26797d;
            if (gVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.b(1, gVar2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f26798e);
            }
            bw5.d90 d90Var2 = this.f26799f;
            if (d90Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, d90Var2.computeSize());
            }
            java.lang.String str2 = this.f26800g;
            return (str2 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str2);
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
            this.f26797d = aVar2.d(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26798e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f26800g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.d90 d90Var3 = new bw5.d90();
            if (bArr != null && bArr.length > 0) {
                d90Var3.parseFrom(bArr);
            }
            this.f26799f = d90Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
