package bw5;

/* loaded from: classes11.dex */
public class d0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26262d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26263e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26264f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26265g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26266h = new boolean[5];

    static {
        new bw5.d0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.d0)) {
            return false;
        }
        bw5.d0 d0Var = (bw5.d0) fVar;
        return n51.f.a(this.f26262d, d0Var.f26262d) && n51.f.a(this.f26263e, d0Var.f26263e) && n51.f.a(this.f26264f, d0Var.f26264f) && n51.f.a(java.lang.Boolean.valueOf(this.f26265g), java.lang.Boolean.valueOf(d0Var.f26265g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.d0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26266h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26262d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26263e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f26264f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.a(4, this.f26265g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f26262d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f26263e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f26264f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            return zArr[4] ? i18 + b36.f.a(4, this.f26265g) : i18;
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
            this.f26262d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26263e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f26264f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f26265g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.d0) super.parseFrom(bArr);
    }
}
