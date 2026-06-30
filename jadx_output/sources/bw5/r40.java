package bw5;

/* loaded from: classes2.dex */
public class r40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32402d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.v40 f32403e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f32404f = new boolean[3];

    static {
        new bw5.r40();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r40 parseFrom(byte[] bArr) {
        return (bw5.r40) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r40)) {
            return false;
        }
        bw5.r40 r40Var = (bw5.r40) fVar;
        return n51.f.a(this.f32402d, r40Var.f32402d) && n51.f.a(this.f32403e, r40Var.f32403e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.r40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32404f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32402d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.v40 v40Var = this.f32403e;
            if (v40Var != null && zArr[2]) {
                fVar.i(2, v40Var.computeSize());
                this.f32403e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f32402d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.v40 v40Var2 = this.f32403e;
            return (v40Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, v40Var2.computeSize());
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
            this.f32402d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.v40 v40Var3 = new bw5.v40();
            if (bArr != null && bArr.length > 0) {
                v40Var3.parseFrom(bArr);
            }
            this.f32403e = v40Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
