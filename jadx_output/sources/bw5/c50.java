package bw5;

/* loaded from: classes2.dex */
public class c50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25928d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25929e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25930f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25931g;

    /* renamed from: h, reason: collision with root package name */
    public long f25932h;

    /* renamed from: i, reason: collision with root package name */
    public int f25933i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f25934m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25935n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f25936o = new boolean[9];

    static {
        new bw5.c50();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.c50 parseFrom(byte[] bArr) {
        return (bw5.c50) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c50)) {
            return false;
        }
        bw5.c50 c50Var = (bw5.c50) fVar;
        return n51.f.a(this.f25928d, c50Var.f25928d) && n51.f.a(this.f25929e, c50Var.f25929e) && n51.f.a(this.f25930f, c50Var.f25930f) && n51.f.a(this.f25931g, c50Var.f25931g) && n51.f.a(java.lang.Long.valueOf(this.f25932h), java.lang.Long.valueOf(c50Var.f25932h)) && n51.f.a(java.lang.Integer.valueOf(this.f25933i), java.lang.Integer.valueOf(c50Var.f25933i)) && n51.f.a(this.f25934m, c50Var.f25934m) && n51.f.a(java.lang.Boolean.valueOf(this.f25935n), java.lang.Boolean.valueOf(c50Var.f25935n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.c50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25936o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25928d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f25929e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f25930f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f25931g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.h(5, this.f25932h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f25933i);
            }
            java.lang.String str5 = this.f25934m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            if (zArr[8]) {
                fVar.a(8, this.f25935n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f25928d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f25929e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f25930f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f25931g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f25932h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f25933i);
            }
            java.lang.String str10 = this.f25934m;
            if (str10 != null && zArr[7]) {
                i18 += b36.f.j(7, str10);
            }
            return zArr[8] ? i18 + b36.f.a(8, this.f25935n) : i18;
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
                this.f25928d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25929e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25930f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25931g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25932h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25933i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25934m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25935n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
