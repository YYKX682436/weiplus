package bw5;

/* loaded from: classes2.dex */
public class c0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f25871d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25872e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f25873f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f25874g = new boolean[4];

    static {
        new bw5.c0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c0)) {
            return false;
        }
        bw5.c0 c0Var = (bw5.c0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f25871d), java.lang.Long.valueOf(c0Var.f25871d)) && n51.f.a(this.f25872e, c0Var.f25872e) && n51.f.a(this.f25873f, c0Var.f25873f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.c0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25874g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f25871d);
            }
            java.lang.String str = this.f25872e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f25873f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f25871d) : 0;
            java.lang.String str2 = this.f25872e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f25873f;
            return (gVar2 == null || !zArr[3]) ? h17 : h17 + b36.f.b(3, gVar2);
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
            this.f25871d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25872e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f25873f = aVar2.d(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.c0) super.parseFrom(bArr);
    }
}
