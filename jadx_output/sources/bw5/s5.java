package bw5;

/* loaded from: classes9.dex */
public class s5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32798d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32799e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32800f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32801g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f32802h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f32803i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f32804m;

    /* renamed from: n, reason: collision with root package name */
    public int f32805n;

    /* renamed from: o, reason: collision with root package name */
    public int f32806o;

    /* renamed from: p, reason: collision with root package name */
    public int f32807p;

    /* renamed from: q, reason: collision with root package name */
    public int f32808q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f32809r = new boolean[12];

    static {
        new bw5.s5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.s5 parseFrom(byte[] bArr) {
        return (bw5.s5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s5)) {
            return false;
        }
        bw5.s5 s5Var = (bw5.s5) fVar;
        return n51.f.a(this.f32798d, s5Var.f32798d) && n51.f.a(this.f32799e, s5Var.f32799e) && n51.f.a(this.f32800f, s5Var.f32800f) && n51.f.a(this.f32801g, s5Var.f32801g) && n51.f.a(this.f32802h, s5Var.f32802h) && n51.f.a(this.f32803i, s5Var.f32803i) && n51.f.a(this.f32804m, s5Var.f32804m) && n51.f.a(java.lang.Integer.valueOf(this.f32805n), java.lang.Integer.valueOf(s5Var.f32805n)) && n51.f.a(java.lang.Integer.valueOf(this.f32806o), java.lang.Integer.valueOf(s5Var.f32806o)) && n51.f.a(java.lang.Integer.valueOf(this.f32807p), java.lang.Integer.valueOf(s5Var.f32807p)) && n51.f.a(java.lang.Integer.valueOf(this.f32808q), java.lang.Integer.valueOf(s5Var.f32808q));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.s5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32809r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32798d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f32799e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f32800f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f32801g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f32802h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f32803i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f32804m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            if (zArr[8]) {
                fVar.e(8, this.f32805n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f32806o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f32807p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f32808q);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f32798d;
            if (str8 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str8);
            }
            java.lang.String str9 = this.f32799e;
            if (str9 != null && zArr[2]) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f32800f;
            if (str10 != null && zArr[3]) {
                i18 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f32801g;
            if (str11 != null && zArr[4]) {
                i18 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f32802h;
            if (str12 != null && zArr[5]) {
                i18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f32803i;
            if (str13 != null && zArr[6]) {
                i18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f32804m;
            if (str14 != null && zArr[7]) {
                i18 += b36.f.j(7, str14);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f32805n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f32806o);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f32807p);
            }
            return zArr[11] ? i18 + b36.f.e(11, this.f32808q) : i18;
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
                this.f32798d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32799e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32800f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32801g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32802h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32803i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32804m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f32805n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f32806o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f32807p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f32808q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
