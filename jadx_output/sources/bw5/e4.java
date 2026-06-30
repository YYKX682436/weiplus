package bw5;

/* loaded from: classes2.dex */
public class e4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f26719d;

    /* renamed from: e, reason: collision with root package name */
    public int f26720e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26721f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26722g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f26723h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26724i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f26725m = new boolean[7];

    static {
        new bw5.e4();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e4)) {
            return false;
        }
        bw5.e4 e4Var = (bw5.e4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f26719d), java.lang.Integer.valueOf(e4Var.f26719d)) && n51.f.a(java.lang.Integer.valueOf(this.f26720e), java.lang.Integer.valueOf(e4Var.f26720e)) && n51.f.a(this.f26721f, e4Var.f26721f) && n51.f.a(this.f26722g, e4Var.f26722g) && n51.f.a(this.f26723h, e4Var.f26723h) && n51.f.a(this.f26724i, e4Var.f26724i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.e4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26725m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f26719d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f26720e);
            }
            java.lang.String str = this.f26721f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f26722g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f26723h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.f26724i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f26719d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f26720e);
            }
            java.lang.String str4 = this.f26721f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f26722g;
            if (str5 != null && zArr[4]) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f26723h;
            if (str6 != null && zArr[5]) {
                e17 += b36.f.j(5, str6);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f26724i;
            return (gVar2 == null || !zArr[6]) ? e17 : e17 + b36.f.b(6, gVar2);
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
        switch (intValue) {
            case 1:
                this.f26719d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26720e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26721f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26722g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26723h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26724i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.e4) super.parseFrom(bArr);
    }
}
