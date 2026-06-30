package bw5;

/* loaded from: classes2.dex */
public class ek0 extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final bw5.ek0 f26942g = new bw5.ek0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.jk0 f26943d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f26944e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f26945f = new boolean[3];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ek0)) {
            return false;
        }
        bw5.ek0 ek0Var = (bw5.ek0) fVar;
        return n51.f.a(this.f26943d, ek0Var.f26943d) && n51.f.a(this.f26944e, ek0Var.f26944e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ek0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26945f;
        java.util.LinkedList linkedList = this.f26944e;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.jk0 jk0Var = this.f26943d;
            if (jk0Var != null && zArr[1]) {
                fVar.i(1, jk0Var.computeSize());
                this.f26943d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.jk0 jk0Var2 = this.f26943d;
            if (jk0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, jk0Var2.computeSize());
            }
            return i18 + b36.f.g(2, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
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
                bw5.jk0 jk0Var3 = new bw5.jk0();
                if (bArr != null && bArr.length > 0) {
                    jk0Var3.parseFrom(bArr);
                }
                this.f26943d = jk0Var3;
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
            bw5.dk0 dk0Var = new bw5.dk0();
            if (bArr2 != null && bArr2.length > 0) {
                dk0Var.parseFrom(bArr2);
            }
            linkedList.add(dk0Var);
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.ek0) super.parseFrom(bArr);
    }
}
