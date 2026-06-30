package bw5;

/* loaded from: classes2.dex */
public class wa0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34629d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34630e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34631f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f34632g = new boolean[4];

    static {
        new bw5.wa0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wa0 parseFrom(byte[] bArr) {
        return (bw5.wa0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wa0)) {
            return false;
        }
        bw5.wa0 wa0Var = (bw5.wa0) fVar;
        return n51.f.a(this.f34629d, wa0Var.f34629d) && n51.f.a(this.f34630e, wa0Var.f34630e) && n51.f.a(this.f34631f, wa0Var.f34631f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wa0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34632g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f34629d;
            if (gVar != null && zArr[1]) {
                fVar.b(1, gVar);
            }
            java.lang.String str = this.f34630e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f34631f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.f34629d;
            if (gVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.b(1, gVar2);
            }
            java.lang.String str3 = this.f34630e;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f34631f;
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
        if (intValue == 1) {
            this.f34629d = aVar2.d(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34630e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f34631f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
