package bw5;

/* loaded from: classes2.dex */
public class v20 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ql f34124d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34125e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34126f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f34127g = new boolean[4];

    static {
        new bw5.v20();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.v20 parseFrom(byte[] bArr) {
        return (bw5.v20) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v20)) {
            return false;
        }
        bw5.v20 v20Var = (bw5.v20) fVar;
        return n51.f.a(this.f34124d, v20Var.f34124d) && n51.f.a(this.f34125e, v20Var.f34125e) && n51.f.a(this.f34126f, v20Var.f34126f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.v20();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34127g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ql qlVar = this.f34124d;
            if (qlVar != null && zArr[1]) {
                fVar.i(1, qlVar.computeSize());
                this.f34124d.writeFields(fVar);
            }
            java.lang.String str = this.f34125e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f34126f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ql qlVar2 = this.f34124d;
            if (qlVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, qlVar2.computeSize());
            }
            java.lang.String str3 = this.f34125e;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f34126f;
            return (str4 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str4);
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
            if (intValue == 2) {
                this.f34125e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f34126f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ql qlVar3 = new bw5.ql();
            if (bArr != null && bArr.length > 0) {
                qlVar3.parseFrom(bArr);
            }
            this.f34124d = qlVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
