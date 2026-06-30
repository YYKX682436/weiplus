package bw5;

/* loaded from: classes8.dex */
public class t9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.r9 f33315d;

    /* renamed from: e, reason: collision with root package name */
    public long f33316e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f33317f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f33318g = new boolean[5];

    static {
        new bw5.t9();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.t9 parseFrom(byte[] bArr) {
        return (bw5.t9) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t9)) {
            return false;
        }
        bw5.t9 t9Var = (bw5.t9) fVar;
        return n51.f.a(this.f33315d, t9Var.f33315d) && n51.f.a(java.lang.Long.valueOf(this.f33316e), java.lang.Long.valueOf(t9Var.f33316e)) && n51.f.a(this.f33317f, t9Var.f33317f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.t9();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f33317f;
        boolean[] zArr = this.f33318g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.r9 r9Var = this.f33315d;
            if (r9Var != null && zArr[1]) {
                fVar.i(1, r9Var.computeSize());
                this.f33315d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f33316e);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.r9 r9Var2 = this.f33315d;
            if (r9Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, r9Var2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f33316e);
            }
            return i18 + b36.f.g(4, 8, linkedList);
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
                bw5.r9 r9Var3 = new bw5.r9();
                if (bArr != null && bArr.length > 0) {
                    r9Var3.parseFrom(bArr);
                }
                this.f33315d = r9Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33316e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.s9 s9Var = new bw5.s9();
            if (bArr2 != null && bArr2.length > 0) {
                s9Var.parseFrom(bArr2);
            }
            linkedList.add(s9Var);
        }
        zArr[4] = true;
        return 0;
    }
}
