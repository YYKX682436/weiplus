package bw5;

/* loaded from: classes2.dex */
public class v1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.t1 f34113d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f34114e = new boolean[2];

    static {
        new bw5.v1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.v1 parseFrom(byte[] bArr) {
        return (bw5.v1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof bw5.v1) && n51.f.a(this.f34113d, ((bw5.v1) fVar).f34113d);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.v1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34114e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.t1 t1Var = this.f34113d;
            if (t1Var != null && zArr[1]) {
                fVar.i(1, t1Var.computeSize());
                this.f34113d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.t1 t1Var2 = this.f34113d;
            if (t1Var2 == null || !zArr[1]) {
                return 0;
            }
            return 0 + b36.f.i(1, t1Var2.computeSize());
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
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.t1 t1Var3 = new bw5.t1();
            if (bArr != null && bArr.length > 0) {
                t1Var3.parseFrom(bArr);
            }
            this.f34113d = t1Var3;
        }
        zArr[1] = true;
        return 0;
    }
}
