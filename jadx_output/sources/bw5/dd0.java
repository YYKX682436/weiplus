package bw5;

/* loaded from: classes2.dex */
public class dd0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f26441d;

    /* renamed from: e, reason: collision with root package name */
    public float f26442e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26443f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26444g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f26445h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f26446i;

    /* renamed from: m, reason: collision with root package name */
    public int f26447m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f26448n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f26449o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f26450p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f26451q = new boolean[11];

    static {
        new bw5.dd0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dd0 parseFrom(byte[] bArr) {
        return (bw5.dd0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dd0)) {
            return false;
        }
        bw5.dd0 dd0Var = (bw5.dd0) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f26441d), java.lang.Float.valueOf(dd0Var.f26441d)) && n51.f.a(java.lang.Float.valueOf(this.f26442e), java.lang.Float.valueOf(dd0Var.f26442e)) && n51.f.a(this.f26443f, dd0Var.f26443f) && n51.f.a(this.f26444g, dd0Var.f26444g) && n51.f.a(this.f26445h, dd0Var.f26445h) && n51.f.a(this.f26446i, dd0Var.f26446i) && n51.f.a(java.lang.Integer.valueOf(this.f26447m), java.lang.Integer.valueOf(dd0Var.f26447m)) && n51.f.a(this.f26448n, dd0Var.f26448n) && n51.f.a(this.f26449o, dd0Var.f26449o) && n51.f.a(this.f26450p, dd0Var.f26450p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.dd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26451q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f26441d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f26442e);
            }
            java.lang.String str = this.f26443f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f26444g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f26445h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f26446i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.e(7, this.f26447m);
            }
            java.lang.String str5 = this.f26448n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f26449o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f26450p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f26441d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f26442e);
            }
            java.lang.String str8 = this.f26443f;
            if (str8 != null && zArr[3]) {
                d17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f26444g;
            if (str9 != null && zArr[4]) {
                d17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f26445h;
            if (str10 != null && zArr[5]) {
                d17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f26446i;
            if (str11 != null && zArr[6]) {
                d17 += b36.f.j(6, str11);
            }
            if (zArr[7]) {
                d17 += b36.f.e(7, this.f26447m);
            }
            java.lang.String str12 = this.f26448n;
            if (str12 != null && zArr[8]) {
                d17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f26449o;
            if (str13 != null && zArr[9]) {
                d17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f26450p;
            return (str14 == null || !zArr[10]) ? d17 : d17 + b36.f.j(10, str14);
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
                this.f26441d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26442e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26443f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26444g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26445h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26446i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26447m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26448n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f26449o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f26450p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
