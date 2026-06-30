package bw5;

/* loaded from: classes11.dex */
public class j20 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28771d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.f20 f28772e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28773f;

    /* renamed from: g, reason: collision with root package name */
    public int f28774g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28775h = new boolean[5];

    static {
        new bw5.j20();
    }

    public java.lang.String b() {
        return this.f28775h[3] ? this.f28773f : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j20)) {
            return false;
        }
        bw5.j20 j20Var = (bw5.j20) fVar;
        return n51.f.a(this.f28771d, j20Var.f28771d) && n51.f.a(this.f28772e, j20Var.f28772e) && n51.f.a(this.f28773f, j20Var.f28773f) && n51.f.a(java.lang.Integer.valueOf(this.f28774g), java.lang.Integer.valueOf(j20Var.f28774g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.j20();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28775h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28771d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.f20 f20Var = this.f28772e;
            if (f20Var != null && zArr[2]) {
                fVar.e(2, f20Var.f27128d);
            }
            java.lang.String str2 = this.f28773f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f28774g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f28771d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            bw5.f20 f20Var2 = this.f28772e;
            if (f20Var2 != null && zArr[2]) {
                i18 += b36.f.e(2, f20Var2.f27128d);
            }
            java.lang.String str4 = this.f28773f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f28774g) : i18;
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
            this.f28771d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28772e = bw5.f20.a(aVar2.g(intValue));
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28773f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f28774g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.j20) super.parseFrom(bArr);
    }
}
