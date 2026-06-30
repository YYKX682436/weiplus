package bw5;

/* loaded from: classes2.dex */
public class a4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25004d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.pj f25005e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f25006f = new boolean[3];

    static {
        new bw5.a4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a4 parseFrom(byte[] bArr) {
        return (bw5.a4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a4)) {
            return false;
        }
        bw5.a4 a4Var = (bw5.a4) fVar;
        return n51.f.a(this.f25004d, a4Var.f25004d) && n51.f.a(this.f25005e, a4Var.f25005e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.a4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25006f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25004d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.pj pjVar = this.f25005e;
            if (pjVar != null && zArr[2]) {
                fVar.i(2, pjVar.computeSize());
                this.f25005e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f25004d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.pj pjVar2 = this.f25005e;
            return (pjVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, pjVar2.computeSize());
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
            this.f25004d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.pj pjVar3 = new bw5.pj();
            if (bArr != null && bArr.length > 0) {
                pjVar3.parseFrom(bArr);
            }
            this.f25005e = pjVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
