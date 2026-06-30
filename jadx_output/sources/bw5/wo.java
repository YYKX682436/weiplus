package bw5;

/* loaded from: classes2.dex */
public class wo extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.hp f34798d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34799e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f34800f = new boolean[3];

    static {
        new bw5.wo();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wo parseFrom(byte[] bArr) {
        return (bw5.wo) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wo)) {
            return false;
        }
        bw5.wo woVar = (bw5.wo) fVar;
        return n51.f.a(this.f34798d, woVar.f34798d) && n51.f.a(this.f34799e, woVar.f34799e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34800f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.hp hpVar = this.f34798d;
            if (hpVar != null && zArr[1]) {
                fVar.i(1, hpVar.computeSize());
                this.f34798d.writeFields(fVar);
            }
            java.lang.String str = this.f34799e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.hp hpVar2 = this.f34798d;
            if (hpVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, hpVar2.computeSize());
            }
            java.lang.String str2 = this.f34799e;
            return (str2 == null || !zArr[2]) ? i18 : i18 + b36.f.j(2, str2);
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
            if (intValue != 2) {
                return -1;
            }
            this.f34799e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.hp hpVar3 = new bw5.hp();
            if (bArr != null && bArr.length > 0) {
                hpVar3.parseFrom(bArr);
            }
            this.f34798d = hpVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
