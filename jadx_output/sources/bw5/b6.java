package bw5;

/* loaded from: classes11.dex */
public class b6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25536d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.a6 f25537e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f25538f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f25539g = new boolean[4];

    static {
        new bw5.b6();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b6 parseFrom(byte[] bArr) {
        return (bw5.b6) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b6)) {
            return false;
        }
        bw5.b6 b6Var = (bw5.b6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25536d), java.lang.Integer.valueOf(b6Var.f25536d)) && n51.f.a(this.f25537e, b6Var.f25537e) && n51.f.a(this.f25538f, b6Var.f25538f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.b6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25538f;
        boolean[] zArr = this.f25539g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25536d);
            }
            bw5.a6 a6Var = this.f25537e;
            if (a6Var != null && zArr[2]) {
                fVar.i(2, a6Var.computeSize());
                this.f25537e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f25536d) : 0;
            bw5.a6 a6Var2 = this.f25537e;
            if (a6Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, a6Var2.computeSize());
            }
            return e17 + b36.f.g(3, 8, linkedList);
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
            this.f25536d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.a6 a6Var3 = new bw5.a6();
                if (bArr != null && bArr.length > 0) {
                    a6Var3.parseFrom(bArr);
                }
                this.f25537e = a6Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.a6 a6Var4 = new bw5.a6();
            if (bArr2 != null && bArr2.length > 0) {
                a6Var4.parseFrom(bArr2);
            }
            linkedList.add(a6Var4);
        }
        zArr[3] = true;
        return 0;
    }
}
