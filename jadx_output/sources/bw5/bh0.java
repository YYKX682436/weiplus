package bw5;

/* loaded from: classes9.dex */
public class bh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25670d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25671e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25672f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f25673g = new boolean[4];

    static {
        new bw5.bh0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bh0 parseFrom(byte[] bArr) {
        return (bw5.bh0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bh0)) {
            return false;
        }
        bw5.bh0 bh0Var = (bw5.bh0) fVar;
        return n51.f.a(this.f25670d, bh0Var.f25670d) && n51.f.a(this.f25671e, bh0Var.f25671e) && n51.f.a(this.f25672f, bh0Var.f25672f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bh0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25673g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25670d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f25671e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f25672f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f25670d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f25671e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f25672f;
            return (str6 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str6);
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
            this.f25670d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25671e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f25672f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
