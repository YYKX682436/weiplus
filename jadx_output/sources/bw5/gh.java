package bw5;

/* loaded from: classes2.dex */
public class gh extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27843d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27844e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27845f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27846g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f27847h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f27848i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f27849m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f27850n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f27851o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f27852p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f27853q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f27854r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f27855s = new boolean[16];

    static {
        new bw5.gh();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gh parseFrom(byte[] bArr) {
        return (bw5.gh) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gh)) {
            return false;
        }
        bw5.gh ghVar = (bw5.gh) fVar;
        return n51.f.a(this.f27843d, ghVar.f27843d) && n51.f.a(this.f27844e, ghVar.f27844e) && n51.f.a(this.f27845f, ghVar.f27845f) && n51.f.a(this.f27846g, ghVar.f27846g) && n51.f.a(this.f27847h, ghVar.f27847h) && n51.f.a(this.f27848i, ghVar.f27848i) && n51.f.a(this.f27849m, ghVar.f27849m) && n51.f.a(this.f27850n, ghVar.f27850n) && n51.f.a(this.f27851o, ghVar.f27851o) && n51.f.a(this.f27852p, ghVar.f27852p) && n51.f.a(this.f27853q, ghVar.f27853q) && n51.f.a(this.f27854r, ghVar.f27854r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gh();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27855s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27843d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f27844e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f27845f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f27846g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f27847h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f27848i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f27849m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f27850n;
            if (str8 != null && zArr[11]) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f27851o;
            if (str9 != null && zArr[12]) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f27852p;
            if (str10 != null && zArr[13]) {
                fVar.j(13, str10);
            }
            java.lang.String str11 = this.f27853q;
            if (str11 != null && zArr[14]) {
                fVar.j(14, str11);
            }
            java.lang.String str12 = this.f27854r;
            if (str12 == null || !zArr[15]) {
                return 0;
            }
            fVar.j(15, str12);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f27843d;
            int j17 = (str13 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str13);
            java.lang.String str14 = this.f27844e;
            if (str14 != null && zArr[2]) {
                j17 += b36.f.j(2, str14);
            }
            java.lang.String str15 = this.f27845f;
            if (str15 != null && zArr[3]) {
                j17 += b36.f.j(3, str15);
            }
            java.lang.String str16 = this.f27846g;
            if (str16 != null && zArr[4]) {
                j17 += b36.f.j(4, str16);
            }
            java.lang.String str17 = this.f27847h;
            if (str17 != null && zArr[5]) {
                j17 += b36.f.j(5, str17);
            }
            java.lang.String str18 = this.f27848i;
            if (str18 != null && zArr[6]) {
                j17 += b36.f.j(6, str18);
            }
            java.lang.String str19 = this.f27849m;
            if (str19 != null && zArr[7]) {
                j17 += b36.f.j(7, str19);
            }
            java.lang.String str20 = this.f27850n;
            if (str20 != null && zArr[11]) {
                j17 += b36.f.j(11, str20);
            }
            java.lang.String str21 = this.f27851o;
            if (str21 != null && zArr[12]) {
                j17 += b36.f.j(12, str21);
            }
            java.lang.String str22 = this.f27852p;
            if (str22 != null && zArr[13]) {
                j17 += b36.f.j(13, str22);
            }
            java.lang.String str23 = this.f27853q;
            if (str23 != null && zArr[14]) {
                j17 += b36.f.j(14, str23);
            }
            java.lang.String str24 = this.f27854r;
            return (str24 == null || !zArr[15]) ? j17 : j17 + b36.f.j(15, str24);
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
                this.f27843d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27844e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27845f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27846g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27847h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27848i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27849m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
            case 9:
            case 10:
            default:
                return -1;
            case 11:
                this.f27850n = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f27851o = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f27852p = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f27853q = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f27854r = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
        }
    }
}
