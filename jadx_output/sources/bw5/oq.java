package bw5;

/* loaded from: classes2.dex */
public class oq extends com.tencent.mm.protobuf.f {
    public final boolean[] A = new boolean[21];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31189d;

    /* renamed from: e, reason: collision with root package name */
    public int f31190e;

    /* renamed from: f, reason: collision with root package name */
    public int f31191f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f31192g;

    /* renamed from: h, reason: collision with root package name */
    public int f31193h;

    /* renamed from: i, reason: collision with root package name */
    public float f31194i;

    /* renamed from: m, reason: collision with root package name */
    public int f31195m;

    /* renamed from: n, reason: collision with root package name */
    public int f31196n;

    /* renamed from: o, reason: collision with root package name */
    public int f31197o;

    /* renamed from: p, reason: collision with root package name */
    public int f31198p;

    /* renamed from: q, reason: collision with root package name */
    public int f31199q;

    /* renamed from: r, reason: collision with root package name */
    public int f31200r;

    /* renamed from: s, reason: collision with root package name */
    public int f31201s;

    /* renamed from: t, reason: collision with root package name */
    public int f31202t;

    /* renamed from: u, reason: collision with root package name */
    public int f31203u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f31204v;

    /* renamed from: w, reason: collision with root package name */
    public int f31205w;

    /* renamed from: x, reason: collision with root package name */
    public int f31206x;

    /* renamed from: y, reason: collision with root package name */
    public int f31207y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f31208z;

    static {
        new bw5.oq();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.oq parseFrom(byte[] bArr) {
        return (bw5.oq) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oq)) {
            return false;
        }
        bw5.oq oqVar = (bw5.oq) fVar;
        return n51.f.a(this.f31189d, oqVar.f31189d) && n51.f.a(java.lang.Integer.valueOf(this.f31190e), java.lang.Integer.valueOf(oqVar.f31190e)) && n51.f.a(java.lang.Integer.valueOf(this.f31191f), java.lang.Integer.valueOf(oqVar.f31191f)) && n51.f.a(this.f31192g, oqVar.f31192g) && n51.f.a(java.lang.Integer.valueOf(this.f31193h), java.lang.Integer.valueOf(oqVar.f31193h)) && n51.f.a(java.lang.Float.valueOf(this.f31194i), java.lang.Float.valueOf(oqVar.f31194i)) && n51.f.a(java.lang.Integer.valueOf(this.f31195m), java.lang.Integer.valueOf(oqVar.f31195m)) && n51.f.a(java.lang.Integer.valueOf(this.f31196n), java.lang.Integer.valueOf(oqVar.f31196n)) && n51.f.a(java.lang.Integer.valueOf(this.f31197o), java.lang.Integer.valueOf(oqVar.f31197o)) && n51.f.a(java.lang.Integer.valueOf(this.f31198p), java.lang.Integer.valueOf(oqVar.f31198p)) && n51.f.a(java.lang.Integer.valueOf(this.f31199q), java.lang.Integer.valueOf(oqVar.f31199q)) && n51.f.a(java.lang.Integer.valueOf(this.f31200r), java.lang.Integer.valueOf(oqVar.f31200r)) && n51.f.a(java.lang.Integer.valueOf(this.f31201s), java.lang.Integer.valueOf(oqVar.f31201s)) && n51.f.a(java.lang.Integer.valueOf(this.f31202t), java.lang.Integer.valueOf(oqVar.f31202t)) && n51.f.a(java.lang.Integer.valueOf(this.f31203u), java.lang.Integer.valueOf(oqVar.f31203u)) && n51.f.a(this.f31204v, oqVar.f31204v) && n51.f.a(java.lang.Integer.valueOf(this.f31205w), java.lang.Integer.valueOf(oqVar.f31205w)) && n51.f.a(java.lang.Integer.valueOf(this.f31206x), java.lang.Integer.valueOf(oqVar.f31206x)) && n51.f.a(java.lang.Integer.valueOf(this.f31207y), java.lang.Integer.valueOf(oqVar.f31207y)) && n51.f.a(this.f31208z, oqVar.f31208z);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.oq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31189d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f31190e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f31191f);
            }
            java.lang.String str2 = this.f31192g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f31193h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f31194i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f31195m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f31196n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f31197o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f31198p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f31199q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f31200r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f31201s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f31202t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f31203u);
            }
            java.lang.String str3 = this.f31204v;
            if (str3 != null && zArr[16]) {
                fVar.j(16, str3);
            }
            if (zArr[17]) {
                fVar.e(17, this.f31205w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f31206x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f31207y);
            }
            java.lang.String str4 = this.f31208z;
            if (str4 != null && zArr[20]) {
                fVar.j(20, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f31189d;
            if (str5 != null && zArr[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f31190e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f31191f);
            }
            java.lang.String str6 = this.f31192g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f31193h);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f31194i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f31195m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f31196n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f31197o);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f31198p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f31199q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f31200r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f31201s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f31202t);
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f31203u);
            }
            java.lang.String str7 = this.f31204v;
            if (str7 != null && zArr[16]) {
                i18 += b36.f.j(16, str7);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f31205w);
            }
            if (zArr[18]) {
                i18 += b36.f.e(18, this.f31206x);
            }
            if (zArr[19]) {
                i18 += b36.f.e(19, this.f31207y);
            }
            java.lang.String str8 = this.f31208z;
            return (str8 == null || !zArr[20]) ? i18 : i18 + b36.f.j(20, str8);
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
                this.f31189d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31190e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31191f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31192g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f31193h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f31194i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f31195m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f31196n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f31197o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f31198p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f31199q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f31200r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f31201s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f31202t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f31203u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f31204v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f31205w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f31206x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f31207y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f31208z = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            default:
                return -1;
        }
    }
}
