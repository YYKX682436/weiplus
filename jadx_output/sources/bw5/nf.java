package bw5;

/* loaded from: classes9.dex */
public class nf extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.a9 f30660d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.a9 f30661e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f30662f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f30663g = new boolean[4];

    static {
        new bw5.nf();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nf parseFrom(byte[] bArr) {
        return (bw5.nf) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nf)) {
            return false;
        }
        bw5.nf nfVar = (bw5.nf) fVar;
        return n51.f.a(this.f30660d, nfVar.f30660d) && n51.f.a(this.f30661e, nfVar.f30661e) && n51.f.a(this.f30662f, nfVar.f30662f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.nf();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30662f;
        boolean[] zArr = this.f30663g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.a9 a9Var = this.f30660d;
            if (a9Var != null && zArr[1]) {
                fVar.i(1, a9Var.computeSize());
                this.f30660d.writeFields(fVar);
            }
            bw5.a9 a9Var2 = this.f30661e;
            if (a9Var2 != null && zArr[2]) {
                fVar.i(2, a9Var2.computeSize());
                this.f30661e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.a9 a9Var3 = this.f30660d;
            if (a9Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, a9Var3.computeSize());
            }
            bw5.a9 a9Var4 = this.f30661e;
            if (a9Var4 != null && zArr[2]) {
                i18 += b36.f.i(2, a9Var4.computeSize());
            }
            return i18 + b36.f.g(3, 8, linkedList);
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
                bw5.a9 a9Var5 = new bw5.a9();
                if (bArr != null && bArr.length > 0) {
                    a9Var5.parseFrom(bArr);
                }
                this.f30660d = a9Var5;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.a9 a9Var6 = new bw5.a9();
                if (bArr2 != null && bArr2.length > 0) {
                    a9Var6.parseFrom(bArr2);
                }
                this.f30661e = a9Var6;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.c7 c7Var = new bw5.c7();
            if (bArr3 != null && bArr3.length > 0) {
                c7Var.parseFrom(bArr3);
            }
            linkedList.add(c7Var);
        }
        zArr[3] = true;
        return 0;
    }
}
