package bw5;

/* loaded from: classes11.dex */
public class sq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.tq0 f33113d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f33114e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f33115f = new boolean[3];

    static {
        new bw5.sq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sq0)) {
            return false;
        }
        bw5.sq0 sq0Var = (bw5.sq0) fVar;
        return n51.f.a(this.f33113d, sq0Var.f33113d) && n51.f.a(this.f33114e, sq0Var.f33114e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33115f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.tq0 tq0Var = this.f33113d;
            if (tq0Var != null && zArr[1]) {
                fVar.i(1, tq0Var.computeSize());
                this.f33113d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f33114e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.tq0 tq0Var2 = this.f33113d;
            if (tq0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, tq0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f33114e;
            return (gVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.b(2, gVar2);
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
            if (intValue != 2) {
                return -1;
            }
            this.f33114e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.tq0 tq0Var3 = new bw5.tq0();
            if (bArr != null && bArr.length > 0) {
                tq0Var3.parseFrom(bArr);
            }
            this.f33113d = tq0Var3;
        }
        zArr[1] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.sq0) super.parseFrom(bArr);
    }
}
