package bw5;

/* loaded from: classes2.dex */
public class xm extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35186d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35187e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35188f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35189g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35190h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f35191i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f35192m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f35193n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f35194o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f35195p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f35196q = new boolean[11];

    static {
        new bw5.xm();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xm parseFrom(byte[] bArr) {
        return (bw5.xm) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xm)) {
            return false;
        }
        bw5.xm xmVar = (bw5.xm) fVar;
        return n51.f.a(this.f35186d, xmVar.f35186d) && n51.f.a(this.f35187e, xmVar.f35187e) && n51.f.a(this.f35188f, xmVar.f35188f) && n51.f.a(this.f35189g, xmVar.f35189g) && n51.f.a(this.f35190h, xmVar.f35190h) && n51.f.a(this.f35191i, xmVar.f35191i) && n51.f.a(this.f35192m, xmVar.f35192m) && n51.f.a(this.f35193n, xmVar.f35193n) && n51.f.a(this.f35194o, xmVar.f35194o) && n51.f.a(this.f35195p, xmVar.f35195p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xm();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35196q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35186d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f35187e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f35188f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f35189g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f35190h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f35191i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f35192m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f35193n;
            if (str8 != null && zArr[8]) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f35194o;
            if (str9 != null && zArr[9]) {
                fVar.j(9, str9);
            }
            java.lang.String str10 = this.f35195p;
            if (str10 != null && zArr[10]) {
                fVar.j(10, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f35186d;
            if (str11 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str11);
            }
            java.lang.String str12 = this.f35187e;
            if (str12 != null && zArr[2]) {
                i18 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f35188f;
            if (str13 != null && zArr[3]) {
                i18 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f35189g;
            if (str14 != null && zArr[4]) {
                i18 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f35190h;
            if (str15 != null && zArr[5]) {
                i18 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f35191i;
            if (str16 != null && zArr[6]) {
                i18 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f35192m;
            if (str17 != null && zArr[7]) {
                i18 += b36.f.j(7, str17);
            }
            java.lang.String str18 = this.f35193n;
            if (str18 != null && zArr[8]) {
                i18 += b36.f.j(8, str18);
            }
            java.lang.String str19 = this.f35194o;
            if (str19 != null && zArr[9]) {
                i18 += b36.f.j(9, str19);
            }
            java.lang.String str20 = this.f35195p;
            return (str20 == null || !zArr[10]) ? i18 : i18 + b36.f.j(10, str20);
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
                this.f35186d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35187e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35188f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35189g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35190h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35191i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f35192m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f35193n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f35194o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f35195p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
