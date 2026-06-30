package bw5;

/* loaded from: classes2.dex */
public class k1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29199d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29200e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.am f29201f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f29202g = new boolean[4];

    static {
        new bw5.k1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.k1 parseFrom(byte[] bArr) {
        return (bw5.k1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k1)) {
            return false;
        }
        bw5.k1 k1Var = (bw5.k1) fVar;
        return n51.f.a(this.f29199d, k1Var.f29199d) && n51.f.a(this.f29200e, k1Var.f29200e) && n51.f.a(this.f29201f, k1Var.f29201f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.k1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29202g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29199d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f29200e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.am amVar = this.f29201f;
            if (amVar != null && zArr[3]) {
                fVar.i(3, amVar.computeSize());
                this.f29201f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f29199d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f29200e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            bw5.am amVar2 = this.f29201f;
            return (amVar2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, amVar2.computeSize());
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
            this.f29199d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29200e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.am amVar3 = new bw5.am();
            if (bArr != null && bArr.length > 0) {
                amVar3.parseFrom(bArr);
            }
            this.f29201f = amVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
