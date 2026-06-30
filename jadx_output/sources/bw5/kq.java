package bw5;

/* loaded from: classes2.dex */
public class kq extends com.tencent.mm.protobuf.f {
    public boolean A;
    public boolean B;
    public boolean C;
    public final boolean[] D = new boolean[29];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29468d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29469e;

    /* renamed from: f, reason: collision with root package name */
    public int f29470f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f29471g;

    /* renamed from: h, reason: collision with root package name */
    public int f29472h;

    /* renamed from: i, reason: collision with root package name */
    public long f29473i;

    /* renamed from: m, reason: collision with root package name */
    public int f29474m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f29475n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f29476o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f29477p;

    /* renamed from: q, reason: collision with root package name */
    public int f29478q;

    /* renamed from: r, reason: collision with root package name */
    public int f29479r;

    /* renamed from: s, reason: collision with root package name */
    public int f29480s;

    /* renamed from: t, reason: collision with root package name */
    public int f29481t;

    /* renamed from: u, reason: collision with root package name */
    public int f29482u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f29483v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f29484w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f29485x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29486y;

    /* renamed from: z, reason: collision with root package name */
    public int f29487z;

    static {
        new bw5.kq();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kq parseFrom(byte[] bArr) {
        return (bw5.kq) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kq)) {
            return false;
        }
        bw5.kq kqVar = (bw5.kq) fVar;
        return n51.f.a(this.f29468d, kqVar.f29468d) && n51.f.a(this.f29469e, kqVar.f29469e) && n51.f.a(java.lang.Integer.valueOf(this.f29470f), java.lang.Integer.valueOf(kqVar.f29470f)) && n51.f.a(this.f29471g, kqVar.f29471g) && n51.f.a(java.lang.Integer.valueOf(this.f29472h), java.lang.Integer.valueOf(kqVar.f29472h)) && n51.f.a(java.lang.Long.valueOf(this.f29473i), java.lang.Long.valueOf(kqVar.f29473i)) && n51.f.a(java.lang.Integer.valueOf(this.f29474m), java.lang.Integer.valueOf(kqVar.f29474m)) && n51.f.a(this.f29475n, kqVar.f29475n) && n51.f.a(this.f29476o, kqVar.f29476o) && n51.f.a(java.lang.Boolean.valueOf(this.f29477p), java.lang.Boolean.valueOf(kqVar.f29477p)) && n51.f.a(java.lang.Integer.valueOf(this.f29478q), java.lang.Integer.valueOf(kqVar.f29478q)) && n51.f.a(java.lang.Integer.valueOf(this.f29479r), java.lang.Integer.valueOf(kqVar.f29479r)) && n51.f.a(java.lang.Integer.valueOf(this.f29480s), java.lang.Integer.valueOf(kqVar.f29480s)) && n51.f.a(java.lang.Integer.valueOf(this.f29481t), java.lang.Integer.valueOf(kqVar.f29481t)) && n51.f.a(java.lang.Integer.valueOf(this.f29482u), java.lang.Integer.valueOf(kqVar.f29482u)) && n51.f.a(java.lang.Boolean.valueOf(this.f29483v), java.lang.Boolean.valueOf(kqVar.f29483v)) && n51.f.a(java.lang.Boolean.valueOf(this.f29484w), java.lang.Boolean.valueOf(kqVar.f29484w)) && n51.f.a(java.lang.Boolean.valueOf(this.f29485x), java.lang.Boolean.valueOf(kqVar.f29485x)) && n51.f.a(java.lang.Boolean.valueOf(this.f29486y), java.lang.Boolean.valueOf(kqVar.f29486y)) && n51.f.a(java.lang.Integer.valueOf(this.f29487z), java.lang.Integer.valueOf(kqVar.f29487z)) && n51.f.a(java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(kqVar.A)) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(kqVar.B)) && n51.f.a(java.lang.Boolean.valueOf(this.C), java.lang.Boolean.valueOf(kqVar.C));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.kq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.D;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29468d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f29469e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f29470f);
            }
            java.lang.String str3 = this.f29471g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f29472h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f29473i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f29474m);
            }
            java.lang.String str4 = this.f29475n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f29476o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            if (zArr[10]) {
                fVar.a(10, this.f29477p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f29478q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f29479r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f29480s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f29481t);
            }
            if (zArr[20]) {
                fVar.e(20, this.f29482u);
            }
            if (zArr[21]) {
                fVar.a(21, this.f29483v);
            }
            if (zArr[22]) {
                fVar.a(22, this.f29484w);
            }
            if (zArr[23]) {
                fVar.a(23, this.f29485x);
            }
            if (zArr[24]) {
                fVar.a(24, this.f29486y);
            }
            if (zArr[25]) {
                fVar.e(25, this.f29487z);
            }
            if (zArr[26]) {
                fVar.a(26, this.A);
            }
            if (zArr[27]) {
                fVar.a(27, this.B);
            }
            if (zArr[28]) {
                fVar.a(28, this.C);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f29468d;
            if (str6 != null && zArr[1]) {
                i18 = b36.f.j(1, str6) + 0;
            }
            java.lang.String str7 = this.f29469e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f29470f);
            }
            java.lang.String str8 = this.f29471g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f29472h);
            }
            if (zArr[6]) {
                i18 += b36.f.h(6, this.f29473i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f29474m);
            }
            java.lang.String str9 = this.f29475n;
            if (str9 != null && zArr[8]) {
                i18 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f29476o;
            if (str10 != null && zArr[9]) {
                i18 += b36.f.j(9, str10);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f29477p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f29478q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f29479r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f29480s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f29481t);
            }
            if (zArr[20]) {
                i18 += b36.f.e(20, this.f29482u);
            }
            if (zArr[21]) {
                i18 += b36.f.a(21, this.f29483v);
            }
            if (zArr[22]) {
                i18 += b36.f.a(22, this.f29484w);
            }
            if (zArr[23]) {
                i18 += b36.f.a(23, this.f29485x);
            }
            if (zArr[24]) {
                i18 += b36.f.a(24, this.f29486y);
            }
            if (zArr[25]) {
                i18 += b36.f.e(25, this.f29487z);
            }
            if (zArr[26]) {
                i18 += b36.f.a(26, this.A);
            }
            if (zArr[27]) {
                i18 += b36.f.a(27, this.B);
            }
            return zArr[28] ? i18 + b36.f.a(28, this.C) : i18;
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
                this.f29468d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29469e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29470f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29471g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29472h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29473i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29474m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f29475n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f29476o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f29477p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f29478q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f29479r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f29480s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f29481t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            default:
                switch (intValue) {
                    case 20:
                        this.f29482u = aVar2.g(intValue);
                        zArr[20] = true;
                        return 0;
                    case 21:
                        this.f29483v = aVar2.c(intValue);
                        zArr[21] = true;
                        return 0;
                    case 22:
                        this.f29484w = aVar2.c(intValue);
                        zArr[22] = true;
                        return 0;
                    case 23:
                        this.f29485x = aVar2.c(intValue);
                        zArr[23] = true;
                        return 0;
                    case 24:
                        this.f29486y = aVar2.c(intValue);
                        zArr[24] = true;
                        return 0;
                    case 25:
                        this.f29487z = aVar2.g(intValue);
                        zArr[25] = true;
                        return 0;
                    case 26:
                        this.A = aVar2.c(intValue);
                        zArr[26] = true;
                        return 0;
                    case 27:
                        this.B = aVar2.c(intValue);
                        zArr[27] = true;
                        return 0;
                    case 28:
                        this.C = aVar2.c(intValue);
                        zArr[28] = true;
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
