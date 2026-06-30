package bw5;

/* loaded from: classes2.dex */
public class cj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26115d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26116e;

    /* renamed from: f, reason: collision with root package name */
    public float f26117f;

    /* renamed from: g, reason: collision with root package name */
    public float f26118g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26119h = new boolean[5];

    static {
        new bw5.cj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cj0 parseFrom(byte[] bArr) {
        return (bw5.cj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cj0)) {
            return false;
        }
        bw5.cj0 cj0Var = (bw5.cj0) fVar;
        return n51.f.a(this.f26115d, cj0Var.f26115d) && n51.f.a(java.lang.Boolean.valueOf(this.f26116e), java.lang.Boolean.valueOf(cj0Var.f26116e)) && n51.f.a(java.lang.Float.valueOf(this.f26117f), java.lang.Float.valueOf(cj0Var.f26117f)) && n51.f.a(java.lang.Float.valueOf(this.f26118g), java.lang.Float.valueOf(cj0Var.f26118g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.cj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26119h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26115d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f26116e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f26117f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f26118g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f26115d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f26116e);
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f26117f);
            }
            return zArr[4] ? i18 + b36.f.d(4, this.f26118g) : i18;
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
            this.f26115d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26116e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f26117f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f26118g = aVar2.f(intValue);
        zArr[4] = true;
        return 0;
    }
}
