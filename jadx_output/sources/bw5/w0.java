package bw5;

/* loaded from: classes11.dex */
public class w0 extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public static final bw5.w0 f34545f = new bw5.w0();

    /* renamed from: d, reason: collision with root package name */
    public bw5.v0 f34546d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f34547e = new java.util.LinkedList();

    public java.util.LinkedList b() {
        return this.f34547e;
    }

    public bw5.v0 c() {
        return this.f34546d;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w0)) {
            return false;
        }
        bw5.w0 w0Var = (bw5.w0) fVar;
        return n51.f.a(this.f34546d, w0Var.f34546d) && n51.f.a(this.f34547e, w0Var.f34547e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.w0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34547e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.v0 v0Var = this.f34546d;
            if (v0Var != null) {
                fVar.i(1, v0Var.computeSize());
                this.f34546d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.v0 v0Var2 = this.f34546d;
            return (v0Var2 != null ? 0 + b36.f.i(1, v0Var2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
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
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.v0 v0Var3 = new bw5.v0();
                if (bArr != null && bArr.length > 0) {
                    v0Var3.parseFrom(bArr);
                }
                this.f34546d = v0Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.t0 t0Var = new bw5.t0();
            if (bArr2 != null && bArr2.length > 0) {
                t0Var.parseFrom(bArr2);
            }
            linkedList.add(t0Var);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.w0) super.parseFrom(bArr);
    }
}
