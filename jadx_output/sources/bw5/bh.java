package bw5;

/* loaded from: classes2.dex */
public class bh extends com.tencent.mm.protobuf.f {
    public final boolean[] A = new boolean[21];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25650d;

    /* renamed from: e, reason: collision with root package name */
    public int f25651e;

    /* renamed from: f, reason: collision with root package name */
    public int f25652f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25653g;

    /* renamed from: h, reason: collision with root package name */
    public int f25654h;

    /* renamed from: i, reason: collision with root package name */
    public float f25655i;

    /* renamed from: m, reason: collision with root package name */
    public int f25656m;

    /* renamed from: n, reason: collision with root package name */
    public int f25657n;

    /* renamed from: o, reason: collision with root package name */
    public int f25658o;

    /* renamed from: p, reason: collision with root package name */
    public int f25659p;

    /* renamed from: q, reason: collision with root package name */
    public int f25660q;

    /* renamed from: r, reason: collision with root package name */
    public int f25661r;

    /* renamed from: s, reason: collision with root package name */
    public int f25662s;

    /* renamed from: t, reason: collision with root package name */
    public int f25663t;

    /* renamed from: u, reason: collision with root package name */
    public int f25664u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f25665v;

    /* renamed from: w, reason: collision with root package name */
    public int f25666w;

    /* renamed from: x, reason: collision with root package name */
    public int f25667x;

    /* renamed from: y, reason: collision with root package name */
    public int f25668y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f25669z;

    static {
        new bw5.bh();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bh parseFrom(byte[] bArr) {
        return (bw5.bh) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bh)) {
            return false;
        }
        bw5.bh bhVar = (bw5.bh) fVar;
        return n51.f.a(this.f25650d, bhVar.f25650d) && n51.f.a(java.lang.Integer.valueOf(this.f25651e), java.lang.Integer.valueOf(bhVar.f25651e)) && n51.f.a(java.lang.Integer.valueOf(this.f25652f), java.lang.Integer.valueOf(bhVar.f25652f)) && n51.f.a(this.f25653g, bhVar.f25653g) && n51.f.a(java.lang.Integer.valueOf(this.f25654h), java.lang.Integer.valueOf(bhVar.f25654h)) && n51.f.a(java.lang.Float.valueOf(this.f25655i), java.lang.Float.valueOf(bhVar.f25655i)) && n51.f.a(java.lang.Integer.valueOf(this.f25656m), java.lang.Integer.valueOf(bhVar.f25656m)) && n51.f.a(java.lang.Integer.valueOf(this.f25657n), java.lang.Integer.valueOf(bhVar.f25657n)) && n51.f.a(java.lang.Integer.valueOf(this.f25658o), java.lang.Integer.valueOf(bhVar.f25658o)) && n51.f.a(java.lang.Integer.valueOf(this.f25659p), java.lang.Integer.valueOf(bhVar.f25659p)) && n51.f.a(java.lang.Integer.valueOf(this.f25660q), java.lang.Integer.valueOf(bhVar.f25660q)) && n51.f.a(java.lang.Integer.valueOf(this.f25661r), java.lang.Integer.valueOf(bhVar.f25661r)) && n51.f.a(java.lang.Integer.valueOf(this.f25662s), java.lang.Integer.valueOf(bhVar.f25662s)) && n51.f.a(java.lang.Integer.valueOf(this.f25663t), java.lang.Integer.valueOf(bhVar.f25663t)) && n51.f.a(java.lang.Integer.valueOf(this.f25664u), java.lang.Integer.valueOf(bhVar.f25664u)) && n51.f.a(this.f25665v, bhVar.f25665v) && n51.f.a(java.lang.Integer.valueOf(this.f25666w), java.lang.Integer.valueOf(bhVar.f25666w)) && n51.f.a(java.lang.Integer.valueOf(this.f25667x), java.lang.Integer.valueOf(bhVar.f25667x)) && n51.f.a(java.lang.Integer.valueOf(this.f25668y), java.lang.Integer.valueOf(bhVar.f25668y)) && n51.f.a(this.f25669z, bhVar.f25669z);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bh();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25650d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f25651e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f25652f);
            }
            java.lang.String str2 = this.f25653g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f25654h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f25655i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f25656m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f25657n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f25658o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f25659p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f25660q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f25661r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f25662s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f25663t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f25664u);
            }
            java.lang.String str3 = this.f25665v;
            if (str3 != null && zArr[16]) {
                fVar.j(16, str3);
            }
            if (zArr[17]) {
                fVar.e(17, this.f25666w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f25667x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f25668y);
            }
            java.lang.String str4 = this.f25669z;
            if (str4 != null && zArr[20]) {
                fVar.j(20, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f25650d;
            if (str5 != null && zArr[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f25651e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f25652f);
            }
            java.lang.String str6 = this.f25653g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f25654h);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f25655i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f25656m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f25657n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f25658o);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f25659p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f25660q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f25661r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f25662s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f25663t);
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f25664u);
            }
            java.lang.String str7 = this.f25665v;
            if (str7 != null && zArr[16]) {
                i18 += b36.f.j(16, str7);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f25666w);
            }
            if (zArr[18]) {
                i18 += b36.f.e(18, this.f25667x);
            }
            if (zArr[19]) {
                i18 += b36.f.e(19, this.f25668y);
            }
            java.lang.String str8 = this.f25669z;
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
                this.f25650d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25651e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25652f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25653g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25654h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25655i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25656m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25657n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f25658o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f25659p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f25660q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f25661r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f25662s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f25663t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f25664u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f25665v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f25666w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f25667x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f25668y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f25669z = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            default:
                return -1;
        }
    }
}
