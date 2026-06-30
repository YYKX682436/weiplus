package bw5;

/* loaded from: classes2.dex */
public class ls extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29941d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29942e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29943f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f29944g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f29945h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f29946i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f29947m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f29948n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f29949o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f29950p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f29951q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f29952r = new boolean[25];

    static {
        new bw5.ls();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ls parseFrom(byte[] bArr) {
        return (bw5.ls) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ls)) {
            return false;
        }
        bw5.ls lsVar = (bw5.ls) fVar;
        return n51.f.a(this.f29941d, lsVar.f29941d) && n51.f.a(this.f29942e, lsVar.f29942e) && n51.f.a(this.f29943f, lsVar.f29943f) && n51.f.a(this.f29944g, lsVar.f29944g) && n51.f.a(this.f29945h, lsVar.f29945h) && n51.f.a(this.f29946i, lsVar.f29946i) && n51.f.a(this.f29947m, lsVar.f29947m) && n51.f.a(this.f29948n, lsVar.f29948n) && n51.f.a(this.f29949o, lsVar.f29949o) && n51.f.a(this.f29950p, lsVar.f29950p) && n51.f.a(this.f29951q, lsVar.f29951q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ls();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29952r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29941d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f29942e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f29943f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f29944g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f29945h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f29946i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f29947m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f29948n;
            if (str8 != null && zArr[21]) {
                fVar.j(21, str8);
            }
            java.lang.String str9 = this.f29949o;
            if (str9 != null && zArr[22]) {
                fVar.j(22, str9);
            }
            java.lang.String str10 = this.f29950p;
            if (str10 != null && zArr[23]) {
                fVar.j(23, str10);
            }
            java.lang.String str11 = this.f29951q;
            if (str11 != null && zArr[24]) {
                fVar.j(24, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f29941d;
            if (str12 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str12);
            }
            java.lang.String str13 = this.f29942e;
            if (str13 != null && zArr[2]) {
                i18 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f29943f;
            if (str14 != null && zArr[3]) {
                i18 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f29944g;
            if (str15 != null && zArr[4]) {
                i18 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f29945h;
            if (str16 != null && zArr[5]) {
                i18 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f29946i;
            if (str17 != null && zArr[6]) {
                i18 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f29947m;
            if (str18 != null && zArr[7]) {
                i18 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f29948n;
            if (str19 != null && zArr[21]) {
                i18 += b36.f.j(21, str19);
            }
            java.lang.String str20 = this.f29949o;
            if (str20 != null && zArr[22]) {
                i18 += b36.f.j(22, str20);
            }
            java.lang.String str21 = this.f29950p;
            if (str21 != null && zArr[23]) {
                i18 += b36.f.j(23, str21);
            }
            java.lang.String str22 = this.f29951q;
            return (str22 == null || !zArr[24]) ? i18 : i18 + b36.f.j(24, str22);
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
                this.f29941d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29942e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29943f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29944g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29945h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29946i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29947m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                switch (intValue) {
                    case 21:
                        this.f29948n = aVar2.k(intValue);
                        zArr[21] = true;
                        return 0;
                    case 22:
                        this.f29949o = aVar2.k(intValue);
                        zArr[22] = true;
                        return 0;
                    case 23:
                        this.f29950p = aVar2.k(intValue);
                        zArr[23] = true;
                        return 0;
                    case 24:
                        this.f29951q = aVar2.k(intValue);
                        zArr[24] = true;
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
