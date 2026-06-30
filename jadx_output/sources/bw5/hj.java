package bw5;

/* loaded from: classes2.dex */
public class hj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28225d;

    /* renamed from: e, reason: collision with root package name */
    public int f28226e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28227f;

    /* renamed from: g, reason: collision with root package name */
    public long f28228g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28229h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f28230i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f28231m;

    /* renamed from: n, reason: collision with root package name */
    public int f28232n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f28233o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f28234p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f28235q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f28236r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f28237s = new boolean[13];

    static {
        new bw5.hj();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hj parseFrom(byte[] bArr) {
        return (bw5.hj) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hj)) {
            return false;
        }
        bw5.hj hjVar = (bw5.hj) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28225d), java.lang.Integer.valueOf(hjVar.f28225d)) && n51.f.a(java.lang.Integer.valueOf(this.f28226e), java.lang.Integer.valueOf(hjVar.f28226e)) && n51.f.a(this.f28227f, hjVar.f28227f) && n51.f.a(java.lang.Long.valueOf(this.f28228g), java.lang.Long.valueOf(hjVar.f28228g)) && n51.f.a(this.f28229h, hjVar.f28229h) && n51.f.a(this.f28230i, hjVar.f28230i) && n51.f.a(this.f28231m, hjVar.f28231m) && n51.f.a(java.lang.Integer.valueOf(this.f28232n), java.lang.Integer.valueOf(hjVar.f28232n)) && n51.f.a(this.f28233o, hjVar.f28233o) && n51.f.a(this.f28234p, hjVar.f28234p) && n51.f.a(this.f28235q, hjVar.f28235q) && n51.f.a(this.f28236r, hjVar.f28236r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hj();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28237s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28225d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f28226e);
            }
            java.lang.String str = this.f28227f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f28228g);
            }
            java.lang.String str2 = this.f28229h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f28230i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f28231m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            if (zArr[8]) {
                fVar.e(8, this.f28232n);
            }
            java.lang.String str5 = this.f28233o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f28234p;
            if (str6 != null && zArr[10]) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f28235q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f28236r;
            if (str8 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str8);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28225d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f28226e);
            }
            java.lang.String str9 = this.f28227f;
            if (str9 != null && zArr[3]) {
                e17 += b36.f.j(3, str9);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f28228g);
            }
            java.lang.String str10 = this.f28229h;
            if (str10 != null && zArr[5]) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f28230i;
            if (str11 != null && zArr[6]) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f28231m;
            if (str12 != null && zArr[7]) {
                e17 += b36.f.j(7, str12);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f28232n);
            }
            java.lang.String str13 = this.f28233o;
            if (str13 != null && zArr[9]) {
                e17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f28234p;
            if (str14 != null && zArr[10]) {
                e17 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f28235q;
            if (str15 != null && zArr[11]) {
                e17 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f28236r;
            return (str16 == null || !zArr[12]) ? e17 : e17 + b36.f.j(12, str16);
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
                this.f28225d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28226e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28227f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28228g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28229h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28230i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f28231m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f28232n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f28233o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f28234p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f28235q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f28236r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
