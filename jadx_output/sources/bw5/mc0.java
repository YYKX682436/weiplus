package bw5;

/* loaded from: classes2.dex */
public class mc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f30165d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30166e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30167f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30168g;

    /* renamed from: h, reason: collision with root package name */
    public int f30169h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30170i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30171m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f30172n;

    /* renamed from: o, reason: collision with root package name */
    public int f30173o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30174p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f30175q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f30176r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f30177s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f30178t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f30179u = new boolean[15];

    static {
        new bw5.mc0();
    }

    public java.lang.String b() {
        return this.f30179u[4] ? this.f30168g : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.mc0 parseFrom(byte[] bArr) {
        return (bw5.mc0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mc0)) {
            return false;
        }
        bw5.mc0 mc0Var = (bw5.mc0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f30165d), java.lang.Long.valueOf(mc0Var.f30165d)) && n51.f.a(this.f30166e, mc0Var.f30166e) && n51.f.a(this.f30167f, mc0Var.f30167f) && n51.f.a(this.f30168g, mc0Var.f30168g) && n51.f.a(java.lang.Integer.valueOf(this.f30169h), java.lang.Integer.valueOf(mc0Var.f30169h)) && n51.f.a(this.f30170i, mc0Var.f30170i) && n51.f.a(this.f30171m, mc0Var.f30171m) && n51.f.a(this.f30172n, mc0Var.f30172n) && n51.f.a(java.lang.Integer.valueOf(this.f30173o), java.lang.Integer.valueOf(mc0Var.f30173o)) && n51.f.a(java.lang.Boolean.valueOf(this.f30174p), java.lang.Boolean.valueOf(mc0Var.f30174p)) && n51.f.a(this.f30175q, mc0Var.f30175q) && n51.f.a(this.f30176r, mc0Var.f30176r) && n51.f.a(this.f30177s, mc0Var.f30177s) && n51.f.a(this.f30178t, mc0Var.f30178t);
    }

    public java.lang.String getNickname() {
        return this.f30179u[3] ? this.f30167f : "";
    }

    public java.lang.String getUsername() {
        return this.f30179u[2] ? this.f30166e : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mc0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30179u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f30165d);
            }
            java.lang.String str = this.f30166e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f30167f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f30168g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f30169h);
            }
            java.lang.String str4 = this.f30170i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f30171m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f30172n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            if (zArr[9]) {
                fVar.e(9, this.f30173o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f30174p);
            }
            java.lang.String str7 = this.f30175q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f30176r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f30177s;
            if (str9 != null && zArr[13]) {
                fVar.j(13, str9);
            }
            com.tencent.mm.protobuf.g gVar = this.f30178t;
            if (gVar != null && zArr[14]) {
                fVar.b(14, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f30165d) : 0;
            java.lang.String str10 = this.f30166e;
            if (str10 != null && zArr[2]) {
                h17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f30167f;
            if (str11 != null && zArr[3]) {
                h17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f30168g;
            if (str12 != null && zArr[4]) {
                h17 += b36.f.j(4, str12);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f30169h);
            }
            java.lang.String str13 = this.f30170i;
            if (str13 != null && zArr[6]) {
                h17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f30171m;
            if (str14 != null && zArr[7]) {
                h17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f30172n;
            if (str15 != null && zArr[8]) {
                h17 += b36.f.j(8, str15);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f30173o);
            }
            if (zArr[10]) {
                h17 += b36.f.a(10, this.f30174p);
            }
            java.lang.String str16 = this.f30175q;
            if (str16 != null && zArr[11]) {
                h17 += b36.f.j(11, str16);
            }
            java.lang.String str17 = this.f30176r;
            if (str17 != null && zArr[12]) {
                h17 += b36.f.j(12, str17);
            }
            java.lang.String str18 = this.f30177s;
            if (str18 != null && zArr[13]) {
                h17 += b36.f.j(13, str18);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f30178t;
            return (gVar2 == null || !zArr[14]) ? h17 : h17 + b36.f.b(14, gVar2);
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
                this.f30165d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30166e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30167f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30168g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30169h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30170i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30171m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30172n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30173o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f30174p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f30175q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f30176r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f30177s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f30178t = aVar2.d(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
