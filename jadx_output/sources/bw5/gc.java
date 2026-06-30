package bw5;

/* loaded from: classes2.dex */
public class gc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27784d;

    /* renamed from: e, reason: collision with root package name */
    public int f27785e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27786f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27787g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f27788h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f27789i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f27790m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f27791n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f27792o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f27793p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f27794q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f27795r = new boolean[12];

    static {
        new bw5.gc();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gc parseFrom(byte[] bArr) {
        return (bw5.gc) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gc)) {
            return false;
        }
        bw5.gc gcVar = (bw5.gc) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27784d), java.lang.Integer.valueOf(gcVar.f27784d)) && n51.f.a(java.lang.Integer.valueOf(this.f27785e), java.lang.Integer.valueOf(gcVar.f27785e)) && n51.f.a(this.f27786f, gcVar.f27786f) && n51.f.a(this.f27787g, gcVar.f27787g) && n51.f.a(this.f27788h, gcVar.f27788h) && n51.f.a(this.f27789i, gcVar.f27789i) && n51.f.a(this.f27790m, gcVar.f27790m) && n51.f.a(this.f27791n, gcVar.f27791n) && n51.f.a(this.f27792o, gcVar.f27792o) && n51.f.a(java.lang.Boolean.valueOf(this.f27793p), java.lang.Boolean.valueOf(gcVar.f27793p)) && n51.f.a(this.f27794q, gcVar.f27794q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gc();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27795r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27784d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27785e);
            }
            java.lang.String str = this.f27786f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f27787g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f27788h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f27789i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f27790m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f27791n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f27792o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            if (zArr[10]) {
                fVar.a(10, this.f27793p);
            }
            java.lang.String str8 = this.f27794q;
            if (str8 != null && zArr[11]) {
                fVar.j(11, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f27784d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f27785e);
            }
            java.lang.String str9 = this.f27786f;
            if (str9 != null && zArr[3]) {
                e17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f27787g;
            if (str10 != null && zArr[4]) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f27788h;
            if (str11 != null && zArr[5]) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f27789i;
            if (str12 != null && zArr[6]) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f27790m;
            if (str13 != null && zArr[7]) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f27791n;
            if (str14 != null && zArr[8]) {
                e17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f27792o;
            if (str15 != null && zArr[9]) {
                e17 += b36.f.j(9, str15);
            }
            if (zArr[10]) {
                e17 += b36.f.a(10, this.f27793p);
            }
            java.lang.String str16 = this.f27794q;
            return (str16 == null || !zArr[11]) ? e17 : e17 + b36.f.j(11, str16);
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
                this.f27784d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27785e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27786f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27787g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27788h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27789i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27790m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27791n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f27792o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f27793p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f27794q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
