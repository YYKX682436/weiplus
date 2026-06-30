package bw5;

/* loaded from: classes2.dex */
public class sp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ta0 f33105d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.o50 f33106e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f33107f = new boolean[3];

    static {
        new bw5.sp0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sp0 parseFrom(byte[] bArr) {
        return (bw5.sp0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sp0)) {
            return false;
        }
        bw5.sp0 sp0Var = (bw5.sp0) fVar;
        return n51.f.a(this.f33105d, sp0Var.f33105d) && n51.f.a(this.f33106e, sp0Var.f33106e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33107f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ta0 ta0Var = this.f33105d;
            if (ta0Var != null && zArr[1]) {
                fVar.i(1, ta0Var.computeSize());
                this.f33105d.writeFields(fVar);
            }
            bw5.o50 o50Var = this.f33106e;
            if (o50Var != null && zArr[2]) {
                fVar.i(2, o50Var.computeSize());
                this.f33106e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ta0 ta0Var2 = this.f33105d;
            if (ta0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ta0Var2.computeSize());
            }
            bw5.o50 o50Var2 = this.f33106e;
            return (o50Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, o50Var2.computeSize());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.ta0 ta0Var3 = new bw5.ta0();
                if (bArr != null && bArr.length > 0) {
                    ta0Var3.parseFrom(bArr);
                }
                this.f33105d = ta0Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.o50 o50Var3 = new bw5.o50();
            if (bArr2 != null && bArr2.length > 0) {
                o50Var3.parseFrom(bArr2);
            }
            this.f33106e = o50Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
