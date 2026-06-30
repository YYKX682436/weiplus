package bw5;

/* loaded from: classes2.dex */
public class r2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32368d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32369e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32370f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32371g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f32372h;

    /* renamed from: i, reason: collision with root package name */
    public int f32373i;

    /* renamed from: m, reason: collision with root package name */
    public int f32374m;

    /* renamed from: n, reason: collision with root package name */
    public int f32375n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f32376o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f32377p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f32378q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f32379r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f32380s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f32381t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f32382u = new boolean[15];

    static {
        new bw5.r2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r2 parseFrom(byte[] bArr) {
        return (bw5.r2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r2)) {
            return false;
        }
        bw5.r2 r2Var = (bw5.r2) fVar;
        return n51.f.a(this.f32368d, r2Var.f32368d) && n51.f.a(this.f32369e, r2Var.f32369e) && n51.f.a(this.f32370f, r2Var.f32370f) && n51.f.a(this.f32371g, r2Var.f32371g) && n51.f.a(this.f32372h, r2Var.f32372h) && n51.f.a(java.lang.Integer.valueOf(this.f32373i), java.lang.Integer.valueOf(r2Var.f32373i)) && n51.f.a(java.lang.Integer.valueOf(this.f32374m), java.lang.Integer.valueOf(r2Var.f32374m)) && n51.f.a(java.lang.Integer.valueOf(this.f32375n), java.lang.Integer.valueOf(r2Var.f32375n)) && n51.f.a(this.f32376o, r2Var.f32376o) && n51.f.a(this.f32377p, r2Var.f32377p) && n51.f.a(this.f32378q, r2Var.f32378q) && n51.f.a(this.f32379r, r2Var.f32379r) && n51.f.a(this.f32380s, r2Var.f32380s) && n51.f.a(this.f32381t, r2Var.f32381t);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.r2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32382u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32368d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f32369e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f32370f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f32371g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f32372h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f32373i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f32374m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f32375n);
            }
            java.lang.String str6 = this.f32376o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f32377p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f32378q;
            if (str8 != null && zArr[11]) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f32379r;
            if (str9 != null && zArr[12]) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f32380s;
            if (str10 != null && zArr[13]) {
                fVar.j(13, str10);
            }
            java.lang.String str11 = this.f32381t;
            if (str11 == null || !zArr[14]) {
                return 0;
            }
            fVar.j(14, str11);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f32368d;
            int j17 = (str12 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str12);
            java.lang.String str13 = this.f32369e;
            if (str13 != null && zArr[2]) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f32370f;
            if (str14 != null && zArr[3]) {
                j17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f32371g;
            if (str15 != null && zArr[4]) {
                j17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f32372h;
            if (str16 != null && zArr[5]) {
                j17 += b36.f.j(5, str16);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f32373i);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f32374m);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f32375n);
            }
            java.lang.String str17 = this.f32376o;
            if (str17 != null && zArr[9]) {
                j17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f32377p;
            if (str18 != null && zArr[10]) {
                j17 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.f32378q;
            if (str19 != null && zArr[11]) {
                j17 += b36.f.j(11, str19);
            }
            java.lang.String str20 = this.f32379r;
            if (str20 != null && zArr[12]) {
                j17 += b36.f.j(12, str20);
            }
            java.lang.String str21 = this.f32380s;
            if (str21 != null && zArr[13]) {
                j17 += b36.f.j(13, str21);
            }
            java.lang.String str22 = this.f32381t;
            return (str22 == null || !zArr[14]) ? j17 : j17 + b36.f.j(14, str22);
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
                this.f32368d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32369e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32370f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32371g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32372h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32373i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32374m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f32375n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f32376o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f32377p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f32378q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f32379r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f32380s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f32381t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
