package bw5;

/* loaded from: classes2.dex */
public class a10 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f24964d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f24965e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.x7 f24966f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f24967g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f24968h = new boolean[5];

    static {
        new bw5.a10();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a10 parseFrom(byte[] bArr) {
        return (bw5.a10) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a10)) {
            return false;
        }
        bw5.a10 a10Var = (bw5.a10) fVar;
        return n51.f.a(this.f24964d, a10Var.f24964d) && n51.f.a(this.f24965e, a10Var.f24965e) && n51.f.a(this.f24966f, a10Var.f24966f) && n51.f.a(this.f24967g, a10Var.f24967g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.a10();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f24968h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f24964d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f24965e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.x7 x7Var = this.f24966f;
            if (x7Var != null && zArr[3]) {
                fVar.i(3, x7Var.computeSize());
                this.f24966f.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f24967g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f24964d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f24965e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            bw5.x7 x7Var2 = this.f24966f;
            if (x7Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, x7Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f24967g;
            return (gVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.b(4, gVar2);
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
            this.f24964d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f24965e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f24967g = aVar2.d(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr != null && bArr.length > 0) {
                x7Var3.parseFrom(bArr);
            }
            this.f24966f = x7Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
