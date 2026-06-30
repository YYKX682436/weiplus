package bw5;

/* loaded from: classes9.dex */
public class i8 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.k8 f28492d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28493e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28494f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f28495g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28496h = new boolean[5];

    static {
        new bw5.i8();
    }

    public java.lang.String b() {
        return this.f28496h[3] ? this.f28494f : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.i8)) {
            return false;
        }
        bw5.i8 i8Var = (bw5.i8) fVar;
        return n51.f.a(this.f28492d, i8Var.f28492d) && n51.f.a(this.f28493e, i8Var.f28493e) && n51.f.a(this.f28494f, i8Var.f28494f) && n51.f.a(this.f28495g, i8Var.f28495g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.i8();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28496h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.k8 k8Var = this.f28492d;
            if (k8Var != null && zArr[1]) {
                fVar.e(1, k8Var.f29285d);
            }
            java.lang.String str = this.f28493e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f28494f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f28495g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.k8 k8Var2 = this.f28492d;
            if (k8Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, k8Var2.f29285d);
            }
            java.lang.String str3 = this.f28493e;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f28494f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f28495g;
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
            this.f28492d = bw5.k8.a(aVar2.g(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28493e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28494f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f28495g = aVar2.d(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.i8) super.parseFrom(bArr);
    }
}
