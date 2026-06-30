package bw5;

/* loaded from: classes2.dex */
public class o90 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.v70 f31021d;

    /* renamed from: e, reason: collision with root package name */
    public long f31022e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31023f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f31024g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f31025h = new boolean[5];

    static {
        new bw5.o90();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o90 parseFrom(byte[] bArr) {
        return (bw5.o90) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o90)) {
            return false;
        }
        bw5.o90 o90Var = (bw5.o90) fVar;
        return n51.f.a(this.f31021d, o90Var.f31021d) && n51.f.a(java.lang.Long.valueOf(this.f31022e), java.lang.Long.valueOf(o90Var.f31022e)) && n51.f.a(java.lang.Boolean.valueOf(this.f31023f), java.lang.Boolean.valueOf(o90Var.f31023f)) && n51.f.a(this.f31024g, o90Var.f31024g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.o90();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f31025h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.v70 v70Var = this.f31021d;
            if (v70Var != null && zArr[1]) {
                fVar.i(1, v70Var.computeSize());
                this.f31021d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f31022e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f31023f);
            }
            java.lang.String str = this.f31024g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.v70 v70Var2 = this.f31021d;
            if (v70Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, v70Var2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f31022e);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f31023f);
            }
            java.lang.String str2 = this.f31024g;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f31022e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f31023f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f31024g = aVar2.k(intValue);
            zArr[4] = true;
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
            this.f31021d = v70Var3;
        }
        zArr[1] = true;
        return 0;
    }
}
