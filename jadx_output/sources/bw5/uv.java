package bw5;

/* loaded from: classes2.dex */
public class uv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34052d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34053e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34054f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34055g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f34056h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f34057i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f34058m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f34059n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f34060o = new boolean[9];

    static {
        new bw5.uv();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.uv parseFrom(byte[] bArr) {
        return (bw5.uv) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uv)) {
            return false;
        }
        bw5.uv uvVar = (bw5.uv) fVar;
        return n51.f.a(this.f34052d, uvVar.f34052d) && n51.f.a(this.f34053e, uvVar.f34053e) && n51.f.a(this.f34054f, uvVar.f34054f) && n51.f.a(this.f34055g, uvVar.f34055g) && n51.f.a(this.f34056h, uvVar.f34056h) && n51.f.a(this.f34057i, uvVar.f34057i) && n51.f.a(this.f34058m, uvVar.f34058m) && n51.f.a(this.f34059n, uvVar.f34059n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.uv();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34060o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34052d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f34053e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f34054f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f34055g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f34056h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f34057i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f34058m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f34059n;
            if (str8 != null && zArr[8]) {
                fVar.j(8, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f34052d;
            if (str9 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str9);
            }
            java.lang.String str10 = this.f34053e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f34054f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f34055g;
            if (str12 != null && zArr[4]) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f34056h;
            if (str13 != null && zArr[5]) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f34057i;
            if (str14 != null && zArr[6]) {
                i18 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f34058m;
            if (str15 != null && zArr[7]) {
                i18 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f34059n;
            return (str16 == null || !zArr[8]) ? i18 : i18 + b36.f.j(8, str16);
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
                this.f34052d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34053e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34054f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34055g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34056h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34057i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34058m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f34059n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
