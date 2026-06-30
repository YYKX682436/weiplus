package bw5;

/* loaded from: classes9.dex */
public class l7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29670d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f29671e;

    /* renamed from: f, reason: collision with root package name */
    public int f29672f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f29673g = new boolean[4];

    static {
        new bw5.l7();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.l7 parseFrom(byte[] bArr) {
        return (bw5.l7) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l7)) {
            return false;
        }
        bw5.l7 l7Var = (bw5.l7) fVar;
        return n51.f.a(this.f29670d, l7Var.f29670d) && n51.f.a(this.f29671e, l7Var.f29671e) && n51.f.a(java.lang.Integer.valueOf(this.f29672f), java.lang.Integer.valueOf(l7Var.f29672f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.l7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29673g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29670d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f29671e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f29672f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f29670d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f29671e;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f29672f) : i18;
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
            this.f29670d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29671e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f29672f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
