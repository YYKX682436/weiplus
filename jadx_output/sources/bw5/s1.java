package bw5;

/* loaded from: classes9.dex */
public class s1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f32745d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32746e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32747f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f32748g = new boolean[4];

    static {
        new bw5.s1();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s1)) {
            return false;
        }
        bw5.s1 s1Var = (bw5.s1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f32745d), java.lang.Long.valueOf(s1Var.f32745d)) && n51.f.a(this.f32746e, s1Var.f32746e) && n51.f.a(this.f32747f, s1Var.f32747f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.s1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32748g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f32745d);
            }
            java.lang.String str = this.f32746e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f32747f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f32745d) : 0;
            java.lang.String str2 = this.f32746e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f32747f;
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
            this.f32745d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32746e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f32747f = aVar2.d(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.s1) super.parseFrom(bArr);
    }
}
