package bw5;

/* loaded from: classes9.dex */
public class v7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34183d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34184e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34185f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f34186g = new boolean[4];

    static {
        new bw5.v7();
    }

    public com.tencent.mm.protobuf.g b() {
        return this.f34186g[2] ? this.f34184e : com.tencent.mm.protobuf.g.f192155b;
    }

    public java.lang.String c() {
        return this.f34186g[3] ? this.f34185f : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v7)) {
            return false;
        }
        bw5.v7 v7Var = (bw5.v7) fVar;
        return n51.f.a(this.f34183d, v7Var.f34183d) && n51.f.a(this.f34184e, v7Var.f34184e) && n51.f.a(this.f34185f, v7Var.f34185f);
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.v7 parseFrom(byte[] bArr) {
        return (bw5.v7) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.v7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34186g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34183d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f34184e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            java.lang.String str2 = this.f34185f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f34183d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f34184e;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            java.lang.String str4 = this.f34185f;
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
            this.f34183d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34184e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f34185f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
