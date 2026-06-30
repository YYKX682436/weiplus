package bw5;

/* loaded from: classes2.dex */
public class cj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26099d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26100e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26101f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26102g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f26103h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f26104i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f26105m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.od f26106n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26107o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f26108p;

    /* renamed from: q, reason: collision with root package name */
    public long f26109q;

    /* renamed from: r, reason: collision with root package name */
    public int f26110r;

    /* renamed from: s, reason: collision with root package name */
    public int f26111s;

    /* renamed from: t, reason: collision with root package name */
    public int f26112t;

    /* renamed from: u, reason: collision with root package name */
    public int f26113u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f26114v = new boolean[16];

    static {
        new bw5.cj();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cj parseFrom(byte[] bArr) {
        return (bw5.cj) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cj)) {
            return false;
        }
        bw5.cj cjVar = (bw5.cj) fVar;
        return n51.f.a(this.f26099d, cjVar.f26099d) && n51.f.a(this.f26100e, cjVar.f26100e) && n51.f.a(this.f26101f, cjVar.f26101f) && n51.f.a(this.f26102g, cjVar.f26102g) && n51.f.a(this.f26103h, cjVar.f26103h) && n51.f.a(this.f26104i, cjVar.f26104i) && n51.f.a(this.f26105m, cjVar.f26105m) && n51.f.a(this.f26106n, cjVar.f26106n) && n51.f.a(java.lang.Boolean.valueOf(this.f26107o), java.lang.Boolean.valueOf(cjVar.f26107o)) && n51.f.a(this.f26108p, cjVar.f26108p) && n51.f.a(java.lang.Long.valueOf(this.f26109q), java.lang.Long.valueOf(cjVar.f26109q)) && n51.f.a(java.lang.Integer.valueOf(this.f26110r), java.lang.Integer.valueOf(cjVar.f26110r)) && n51.f.a(java.lang.Integer.valueOf(this.f26111s), java.lang.Integer.valueOf(cjVar.f26111s)) && n51.f.a(java.lang.Integer.valueOf(this.f26112t), java.lang.Integer.valueOf(cjVar.f26112t)) && n51.f.a(java.lang.Integer.valueOf(this.f26113u), java.lang.Integer.valueOf(cjVar.f26113u));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.cj();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26114v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26099d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26100e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f26101f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f26102g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f26103h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f26104i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f26105m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            bw5.od odVar = this.f26106n;
            if (odVar != null && zArr[8]) {
                fVar.i(8, odVar.computeSize());
                this.f26106n.writeFields(fVar);
            }
            if (zArr[9]) {
                fVar.a(9, this.f26107o);
            }
            java.lang.String str8 = this.f26108p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            if (zArr[11]) {
                fVar.h(11, this.f26109q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f26110r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f26111s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f26112t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f26113u);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f26099d;
            if (str9 != null && zArr[1]) {
                i18 = b36.f.j(1, str9) + 0;
            }
            java.lang.String str10 = this.f26100e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f26101f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f26102g;
            if (str12 != null && zArr[4]) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f26103h;
            if (str13 != null && zArr[5]) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f26104i;
            if (str14 != null && zArr[6]) {
                i18 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f26105m;
            if (str15 != null && zArr[7]) {
                i18 += b36.f.j(7, str15);
            }
            bw5.od odVar2 = this.f26106n;
            if (odVar2 != null && zArr[8]) {
                i18 += b36.f.i(8, odVar2.computeSize());
            }
            if (zArr[9]) {
                i18 += b36.f.a(9, this.f26107o);
            }
            java.lang.String str16 = this.f26108p;
            if (str16 != null && zArr[10]) {
                i18 += b36.f.j(10, str16);
            }
            if (zArr[11]) {
                i18 += b36.f.h(11, this.f26109q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f26110r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f26111s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f26112t);
            }
            return zArr[15] ? i18 + b36.f.e(15, this.f26113u) : i18;
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
                this.f26099d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26100e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26101f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26102g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26103h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26104i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26105m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.od odVar3 = new bw5.od();
                    if (bArr != null && bArr.length > 0) {
                        odVar3.parseFrom(bArr);
                    }
                    this.f26106n = odVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f26107o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f26108p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f26109q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f26110r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f26111s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f26112t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f26113u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
