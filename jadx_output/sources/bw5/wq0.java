package bw5;

/* loaded from: classes8.dex */
public class wq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.xq0 f34829d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34830e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34831f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f34832g = new boolean[4];

    static {
        new bw5.wq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wq0)) {
            return false;
        }
        bw5.wq0 wq0Var = (bw5.wq0) fVar;
        return n51.f.a(this.f34829d, wq0Var.f34829d) && n51.f.a(this.f34830e, wq0Var.f34830e) && n51.f.a(this.f34831f, wq0Var.f34831f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34832g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.xq0 xq0Var = this.f34829d;
            if (xq0Var != null && zArr[1]) {
                fVar.i(1, xq0Var.computeSize());
                this.f34829d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f34830e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f34831f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.xq0 xq0Var2 = this.f34829d;
            if (xq0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, xq0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f34830e;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            java.lang.String str2 = this.f34831f;
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
                this.f34830e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f34831f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.xq0 xq0Var3 = new bw5.xq0();
            if (bArr != null && bArr.length > 0) {
                xq0Var3.parseFrom(bArr);
            }
            this.f34829d = xq0Var3;
        }
        zArr[1] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.wq0) super.parseFrom(bArr);
    }
}
