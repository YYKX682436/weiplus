package bw5;

/* loaded from: classes2.dex */
public class tm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33516d;

    /* renamed from: e, reason: collision with root package name */
    public int f33517e;

    /* renamed from: f, reason: collision with root package name */
    public int f33518f;

    /* renamed from: g, reason: collision with root package name */
    public long f33519g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33520h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f33521i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f33522m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f33523n;

    /* renamed from: o, reason: collision with root package name */
    public int f33524o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f33525p = new boolean[10];

    static {
        new bw5.tm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tm0)) {
            return false;
        }
        bw5.tm0 tm0Var = (bw5.tm0) fVar;
        return n51.f.a(this.f33516d, tm0Var.f33516d) && n51.f.a(java.lang.Integer.valueOf(this.f33517e), java.lang.Integer.valueOf(tm0Var.f33517e)) && n51.f.a(java.lang.Integer.valueOf(this.f33518f), java.lang.Integer.valueOf(tm0Var.f33518f)) && n51.f.a(java.lang.Long.valueOf(this.f33519g), java.lang.Long.valueOf(tm0Var.f33519g)) && n51.f.a(java.lang.Boolean.valueOf(this.f33520h), java.lang.Boolean.valueOf(tm0Var.f33520h)) && n51.f.a(this.f33521i, tm0Var.f33521i) && n51.f.a(this.f33522m, tm0Var.f33522m) && n51.f.a(this.f33523n, tm0Var.f33523n) && n51.f.a(java.lang.Integer.valueOf(this.f33524o), java.lang.Integer.valueOf(tm0Var.f33524o));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33525p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33516d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f33517e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33518f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f33519g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f33520h);
            }
            java.lang.String str2 = this.f33521i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f33522m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f33523n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            if (zArr[9]) {
                fVar.e(9, this.f33524o);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f33516d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f33517e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f33518f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f33519g);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f33520h);
            }
            java.lang.String str6 = this.f33521i;
            if (str6 != null && zArr[6]) {
                i18 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f33522m;
            if (str7 != null && zArr[7]) {
                i18 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f33523n;
            if (str8 != null && zArr[8]) {
                i18 += b36.f.j(8, str8);
            }
            return zArr[9] ? i18 + b36.f.e(9, this.f33524o) : i18;
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
                this.f33516d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33517e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33518f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33519g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33520h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33521i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33522m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33523n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33524o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.tm0) super.parseFrom(bArr);
    }
}
