package bw5;

/* loaded from: classes9.dex */
public class n5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30488d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30489e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30490f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30491g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30492h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30493i;

    /* renamed from: m, reason: collision with root package name */
    public int f30494m;

    /* renamed from: n, reason: collision with root package name */
    public int f30495n;

    /* renamed from: o, reason: collision with root package name */
    public int f30496o;

    /* renamed from: p, reason: collision with root package name */
    public int f30497p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f30498q = new boolean[13];

    static {
        new bw5.n5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n5 parseFrom(byte[] bArr) {
        return (bw5.n5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n5)) {
            return false;
        }
        bw5.n5 n5Var = (bw5.n5) fVar;
        return n51.f.a(this.f30488d, n5Var.f30488d) && n51.f.a(this.f30489e, n5Var.f30489e) && n51.f.a(this.f30490f, n5Var.f30490f) && n51.f.a(this.f30491g, n5Var.f30491g) && n51.f.a(this.f30492h, n5Var.f30492h) && n51.f.a(this.f30493i, n5Var.f30493i) && n51.f.a(java.lang.Integer.valueOf(this.f30494m), java.lang.Integer.valueOf(n5Var.f30494m)) && n51.f.a(java.lang.Integer.valueOf(this.f30495n), java.lang.Integer.valueOf(n5Var.f30495n)) && n51.f.a(java.lang.Integer.valueOf(this.f30496o), java.lang.Integer.valueOf(n5Var.f30496o)) && n51.f.a(java.lang.Integer.valueOf(this.f30497p), java.lang.Integer.valueOf(n5Var.f30497p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.n5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30498q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30488d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f30489e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f30490f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f30491g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f30492h;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f30493i;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            if (zArr[9]) {
                fVar.e(9, this.f30494m);
            }
            if (zArr[10]) {
                fVar.e(10, this.f30495n);
            }
            if (zArr[11]) {
                fVar.e(11, this.f30496o);
            }
            if (zArr[12]) {
                fVar.e(12, this.f30497p);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f30488d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f30489e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f30490f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f30491g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f30492h;
            if (str11 != null && zArr[7]) {
                i18 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f30493i;
            if (str12 != null && zArr[8]) {
                i18 += b36.f.j(8, str12);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f30494m);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f30495n);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f30496o);
            }
            return zArr[12] ? i18 + b36.f.e(12, this.f30497p) : i18;
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
                this.f30488d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30489e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30490f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30491g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
            case 6:
            default:
                return -1;
            case 7:
                this.f30492h = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30493i = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30494m = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f30495n = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f30496o = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f30497p = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
        }
    }
}
