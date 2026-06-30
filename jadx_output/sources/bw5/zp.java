package bw5;

/* loaded from: classes2.dex */
public class zp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f36076d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f36077e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f36078f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f36079g;

    /* renamed from: h, reason: collision with root package name */
    public int f36080h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f36081i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f36082m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f36083n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f36084o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f36085p;

    /* renamed from: q, reason: collision with root package name */
    public int f36086q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f36087r;

    /* renamed from: s, reason: collision with root package name */
    public int f36088s;

    /* renamed from: t, reason: collision with root package name */
    public int f36089t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f36090u;

    /* renamed from: v, reason: collision with root package name */
    public int f36091v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f36092w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f36093x = new boolean[18];

    static {
        new bw5.zp();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zp parseFrom(byte[] bArr) {
        return (bw5.zp) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zp)) {
            return false;
        }
        bw5.zp zpVar = (bw5.zp) fVar;
        return n51.f.a(this.f36076d, zpVar.f36076d) && n51.f.a(this.f36077e, zpVar.f36077e) && n51.f.a(this.f36078f, zpVar.f36078f) && n51.f.a(java.lang.Boolean.valueOf(this.f36079g), java.lang.Boolean.valueOf(zpVar.f36079g)) && n51.f.a(java.lang.Integer.valueOf(this.f36080h), java.lang.Integer.valueOf(zpVar.f36080h)) && n51.f.a(this.f36081i, zpVar.f36081i) && n51.f.a(this.f36082m, zpVar.f36082m) && n51.f.a(this.f36083n, zpVar.f36083n) && n51.f.a(this.f36084o, zpVar.f36084o) && n51.f.a(this.f36085p, zpVar.f36085p) && n51.f.a(java.lang.Integer.valueOf(this.f36086q), java.lang.Integer.valueOf(zpVar.f36086q)) && n51.f.a(java.lang.Boolean.valueOf(this.f36087r), java.lang.Boolean.valueOf(zpVar.f36087r)) && n51.f.a(java.lang.Integer.valueOf(this.f36088s), java.lang.Integer.valueOf(zpVar.f36088s)) && n51.f.a(java.lang.Integer.valueOf(this.f36089t), java.lang.Integer.valueOf(zpVar.f36089t)) && n51.f.a(java.lang.Boolean.valueOf(this.f36090u), java.lang.Boolean.valueOf(zpVar.f36090u)) && n51.f.a(java.lang.Integer.valueOf(this.f36091v), java.lang.Integer.valueOf(zpVar.f36091v)) && n51.f.a(java.lang.Boolean.valueOf(this.f36092w), java.lang.Boolean.valueOf(zpVar.f36092w));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zp();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f36093x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36076d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f36077e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            java.lang.String str2 = this.f36078f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f36079g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f36080h);
            }
            java.lang.String str3 = this.f36081i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f36082m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f36083n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f36084o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f36085p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            if (zArr[11]) {
                fVar.e(11, this.f36086q);
            }
            if (zArr[12]) {
                fVar.a(12, this.f36087r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f36088s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f36089t);
            }
            if (zArr[15]) {
                fVar.a(15, this.f36090u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f36091v);
            }
            if (zArr[17]) {
                fVar.a(17, this.f36092w);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f36076d;
            if (str8 != null && zArr[1]) {
                i18 = b36.f.j(1, str8) + 0;
            }
            com.tencent.mm.protobuf.g gVar2 = this.f36077e;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            java.lang.String str9 = this.f36078f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f36079g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f36080h);
            }
            java.lang.String str10 = this.f36081i;
            if (str10 != null && zArr[6]) {
                i18 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f36082m;
            if (str11 != null && zArr[7]) {
                i18 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f36083n;
            if (str12 != null && zArr[8]) {
                i18 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f36084o;
            if (str13 != null && zArr[9]) {
                i18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f36085p;
            if (str14 != null && zArr[10]) {
                i18 += b36.f.j(10, str14);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f36086q);
            }
            if (zArr[12]) {
                i18 += b36.f.a(12, this.f36087r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f36088s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f36089t);
            }
            if (zArr[15]) {
                i18 += b36.f.a(15, this.f36090u);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f36091v);
            }
            return zArr[17] ? i18 + b36.f.a(17, this.f36092w) : i18;
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
                this.f36076d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f36077e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f36078f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f36079g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f36080h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f36081i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f36082m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f36083n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f36084o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f36085p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f36086q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f36087r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f36088s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f36089t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f36090u = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f36091v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f36092w = aVar2.c(intValue);
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }
}
