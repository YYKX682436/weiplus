package bw5;

/* loaded from: classes2.dex */
public class dp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.xa0 f26582d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f26583e = new boolean[2];

    static {
        new bw5.dp0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dp0 parseFrom(byte[] bArr) {
        return (bw5.dp0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof bw5.dp0) && n51.f.a(this.f26582d, ((bw5.dp0) fVar).f26582d);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.dp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26583e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.xa0 xa0Var = this.f26582d;
            if (xa0Var != null && zArr[1]) {
                fVar.i(1, xa0Var.computeSize());
                this.f26582d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.xa0 xa0Var2 = this.f26582d;
            if (xa0Var2 == null || !zArr[1]) {
                return 0;
            }
            return 0 + b36.f.i(1, xa0Var2.computeSize());
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
            bw5.xa0 xa0Var3 = new bw5.xa0();
            if (bArr != null && bArr.length > 0) {
                xa0Var3.parseFrom(bArr);
            }
            this.f26582d = xa0Var3;
        }
        zArr[1] = true;
        return 0;
    }
}
