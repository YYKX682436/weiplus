package bw5;

/* loaded from: classes9.dex */
public class i5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28460d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28461e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28462f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f28463g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28464h;

    /* renamed from: i, reason: collision with root package name */
    public int f28465i;

    /* renamed from: m, reason: collision with root package name */
    public int f28466m;

    /* renamed from: n, reason: collision with root package name */
    public int f28467n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f28468o = new boolean[9];

    static {
        new bw5.i5();
    }

    public java.lang.String b() {
        return this.f28468o[3] ? this.f28462f : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.i5 parseFrom(byte[] bArr) {
        return (bw5.i5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.i5)) {
            return false;
        }
        bw5.i5 i5Var = (bw5.i5) fVar;
        return n51.f.a(this.f28460d, i5Var.f28460d) && n51.f.a(this.f28461e, i5Var.f28461e) && n51.f.a(this.f28462f, i5Var.f28462f) && n51.f.a(this.f28463g, i5Var.f28463g) && n51.f.a(this.f28464h, i5Var.f28464h) && n51.f.a(java.lang.Integer.valueOf(this.f28465i), java.lang.Integer.valueOf(i5Var.f28465i)) && n51.f.a(java.lang.Integer.valueOf(this.f28466m), java.lang.Integer.valueOf(i5Var.f28466m)) && n51.f.a(java.lang.Integer.valueOf(this.f28467n), java.lang.Integer.valueOf(i5Var.f28467n));
    }

    public java.lang.String getNickname() {
        return this.f28468o[4] ? this.f28463g : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.i5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28468o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28460d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f28461e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f28462f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f28463g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f28464h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f28465i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f28466m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f28467n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f28460d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f28461e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f28462f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f28463g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f28464h;
            if (str10 != null && zArr[5]) {
                i18 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f28465i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f28466m);
            }
            return zArr[8] ? i18 + b36.f.e(8, this.f28467n) : i18;
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
                this.f28460d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28461e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28462f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28463g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28464h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28465i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f28466m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f28467n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
