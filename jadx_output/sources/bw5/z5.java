package bw5;

/* loaded from: classes9.dex */
public class z5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35818d;

    /* renamed from: e, reason: collision with root package name */
    public int f35819e;

    /* renamed from: f, reason: collision with root package name */
    public int f35820f;

    /* renamed from: g, reason: collision with root package name */
    public int f35821g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35822h;

    /* renamed from: i, reason: collision with root package name */
    public int f35823i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f35824m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f35825n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f35826o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f35827p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f35828q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f35829r = new boolean[12];

    static {
        new bw5.z5();
    }

    public java.lang.String b() {
        return this.f35829r[7] ? this.f35824m : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.z5 parseFrom(byte[] bArr) {
        return (bw5.z5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z5)) {
            return false;
        }
        bw5.z5 z5Var = (bw5.z5) fVar;
        return n51.f.a(this.f35818d, z5Var.f35818d) && n51.f.a(java.lang.Integer.valueOf(this.f35819e), java.lang.Integer.valueOf(z5Var.f35819e)) && n51.f.a(java.lang.Integer.valueOf(this.f35820f), java.lang.Integer.valueOf(z5Var.f35820f)) && n51.f.a(java.lang.Integer.valueOf(this.f35821g), java.lang.Integer.valueOf(z5Var.f35821g)) && n51.f.a(this.f35822h, z5Var.f35822h) && n51.f.a(java.lang.Integer.valueOf(this.f35823i), java.lang.Integer.valueOf(z5Var.f35823i)) && n51.f.a(this.f35824m, z5Var.f35824m) && n51.f.a(this.f35825n, z5Var.f35825n) && n51.f.a(this.f35826o, z5Var.f35826o) && n51.f.a(this.f35827p, z5Var.f35827p) && n51.f.a(java.lang.Boolean.valueOf(this.f35828q), java.lang.Boolean.valueOf(z5Var.f35828q));
    }

    public java.lang.String getMsgId() {
        return this.f35829r[1] ? this.f35818d : "";
    }

    public java.lang.String getUrl() {
        return this.f35829r[5] ? this.f35822h : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.z5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35829r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35818d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f35819e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f35820f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35821g);
            }
            java.lang.String str2 = this.f35822h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f35823i);
            }
            java.lang.String str3 = this.f35824m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f35825n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f35826o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f35827p;
            if (str6 != null && zArr[10]) {
                fVar.j(10, str6);
            }
            if (zArr[11]) {
                fVar.a(11, this.f35828q);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f35818d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f35819e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f35820f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f35821g);
            }
            java.lang.String str8 = this.f35822h;
            if (str8 != null && zArr[5]) {
                i18 += b36.f.j(5, str8);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f35823i);
            }
            java.lang.String str9 = this.f35824m;
            if (str9 != null && zArr[7]) {
                i18 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f35825n;
            if (str10 != null && zArr[8]) {
                i18 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f35826o;
            if (str11 != null && zArr[9]) {
                i18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f35827p;
            if (str12 != null && zArr[10]) {
                i18 += b36.f.j(10, str12);
            }
            return zArr[11] ? i18 + b36.f.a(11, this.f35828q) : i18;
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
                this.f35818d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35819e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35820f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35821g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35822h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35823i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f35824m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f35825n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f35826o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f35827p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f35828q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
