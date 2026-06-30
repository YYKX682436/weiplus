package bw5;

/* loaded from: classes2.dex */
public class k80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29286d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29287e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29288f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f29289g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f29290h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f29291i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f29292m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f29293n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f29294o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f29295p = new boolean[11];

    static {
        new bw5.k80();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.k80 parseFrom(byte[] bArr) {
        return (bw5.k80) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k80)) {
            return false;
        }
        bw5.k80 k80Var = (bw5.k80) fVar;
        return n51.f.a(this.f29286d, k80Var.f29286d) && n51.f.a(this.f29287e, k80Var.f29287e) && n51.f.a(this.f29288f, k80Var.f29288f) && n51.f.a(this.f29289g, k80Var.f29289g) && n51.f.a(this.f29290h, k80Var.f29290h) && n51.f.a(this.f29291i, k80Var.f29291i) && n51.f.a(this.f29292m, k80Var.f29292m) && n51.f.a(java.lang.Boolean.valueOf(this.f29293n), java.lang.Boolean.valueOf(k80Var.f29293n)) && n51.f.a(this.f29294o, k80Var.f29294o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.k80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29295p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29286d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f29287e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f29288f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f29289g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f29290h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f29291i;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f29292m;
            if (str7 != null && zArr[8]) {
                fVar.j(8, str7);
            }
            if (zArr[9]) {
                fVar.a(9, this.f29293n);
            }
            java.lang.String str8 = this.f29294o;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f29286d;
            if (str9 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str9);
            }
            java.lang.String str10 = this.f29287e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f29288f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f29289g;
            if (str12 != null && zArr[4]) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f29290h;
            if (str13 != null && zArr[5]) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f29291i;
            if (str14 != null && zArr[7]) {
                i18 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f29292m;
            if (str15 != null && zArr[8]) {
                i18 += b36.f.j(8, str15);
            }
            if (zArr[9]) {
                i18 += b36.f.a(9, this.f29293n);
            }
            java.lang.String str16 = this.f29294o;
            return (str16 == null || !zArr[10]) ? i18 : i18 + b36.f.j(10, str16);
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
                this.f29286d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29287e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29288f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29289g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29290h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                this.f29291i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f29292m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f29293n = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f29294o = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
        }
    }
}
