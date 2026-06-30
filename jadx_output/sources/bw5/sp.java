package bw5;

/* loaded from: classes2.dex */
public class sp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f33087d;

    /* renamed from: e, reason: collision with root package name */
    public float f33088e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33089f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33090g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33091h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f33092i;

    /* renamed from: m, reason: collision with root package name */
    public int f33093m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f33094n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f33095o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f33096p;

    /* renamed from: q, reason: collision with root package name */
    public int f33097q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f33098r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f33099s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f33100t;

    /* renamed from: u, reason: collision with root package name */
    public long f33101u;

    /* renamed from: w, reason: collision with root package name */
    public int f33103w;

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f33102v = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f33104x = new boolean[18];

    static {
        new bw5.sp();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sp parseFrom(byte[] bArr) {
        return (bw5.sp) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sp)) {
            return false;
        }
        bw5.sp spVar = (bw5.sp) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f33087d), java.lang.Float.valueOf(spVar.f33087d)) && n51.f.a(java.lang.Float.valueOf(this.f33088e), java.lang.Float.valueOf(spVar.f33088e)) && n51.f.a(this.f33089f, spVar.f33089f) && n51.f.a(this.f33090g, spVar.f33090g) && n51.f.a(this.f33091h, spVar.f33091h) && n51.f.a(this.f33092i, spVar.f33092i) && n51.f.a(java.lang.Integer.valueOf(this.f33093m), java.lang.Integer.valueOf(spVar.f33093m)) && n51.f.a(this.f33094n, spVar.f33094n) && n51.f.a(this.f33095o, spVar.f33095o) && n51.f.a(this.f33096p, spVar.f33096p) && n51.f.a(java.lang.Integer.valueOf(this.f33097q), java.lang.Integer.valueOf(spVar.f33097q)) && n51.f.a(this.f33098r, spVar.f33098r) && n51.f.a(this.f33099s, spVar.f33099s) && n51.f.a(this.f33100t, spVar.f33100t) && n51.f.a(java.lang.Long.valueOf(this.f33101u), java.lang.Long.valueOf(spVar.f33101u)) && n51.f.a(this.f33102v, spVar.f33102v) && n51.f.a(java.lang.Integer.valueOf(this.f33103w), java.lang.Integer.valueOf(spVar.f33103w));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sp();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33104x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f33087d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f33088e);
            }
            java.lang.String str = this.f33089f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f33090g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f33091h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f33092i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.e(7, this.f33093m);
            }
            java.lang.String str5 = this.f33094n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f33095o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f33096p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            if (zArr[11]) {
                fVar.e(11, this.f33097q);
            }
            java.lang.String str8 = this.f33098r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f33099s;
            if (str9 != null && zArr[13]) {
                fVar.j(13, str9);
            }
            java.lang.String str10 = this.f33100t;
            if (str10 != null && zArr[14]) {
                fVar.j(14, str10);
            }
            if (zArr[15]) {
                fVar.h(15, this.f33101u);
            }
            fVar.g(16, 3, this.f33102v);
            if (zArr[17]) {
                fVar.e(17, this.f33103w);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? b36.f.d(1, this.f33087d) + 0 : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f33088e);
            }
            java.lang.String str11 = this.f33089f;
            if (str11 != null && zArr[3]) {
                d17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f33090g;
            if (str12 != null && zArr[4]) {
                d17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f33091h;
            if (str13 != null && zArr[5]) {
                d17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f33092i;
            if (str14 != null && zArr[6]) {
                d17 += b36.f.j(6, str14);
            }
            if (zArr[7]) {
                d17 += b36.f.e(7, this.f33093m);
            }
            java.lang.String str15 = this.f33094n;
            if (str15 != null && zArr[8]) {
                d17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f33095o;
            if (str16 != null && zArr[9]) {
                d17 += b36.f.j(9, str16);
            }
            java.lang.String str17 = this.f33096p;
            if (str17 != null && zArr[10]) {
                d17 += b36.f.j(10, str17);
            }
            if (zArr[11]) {
                d17 += b36.f.e(11, this.f33097q);
            }
            java.lang.String str18 = this.f33098r;
            if (str18 != null && zArr[12]) {
                d17 += b36.f.j(12, str18);
            }
            java.lang.String str19 = this.f33099s;
            if (str19 != null && zArr[13]) {
                d17 += b36.f.j(13, str19);
            }
            java.lang.String str20 = this.f33100t;
            if (str20 != null && zArr[14]) {
                d17 += b36.f.j(14, str20);
            }
            if (zArr[15]) {
                d17 += b36.f.h(15, this.f33101u);
            }
            int g17 = d17 + b36.f.g(16, 3, this.f33102v);
            return zArr[17] ? g17 + b36.f.e(17, this.f33103w) : g17;
        }
        if (i17 == 2) {
            this.f33102v.clear();
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
                this.f33087d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33088e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33089f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33090g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33091h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33092i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33093m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33094n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33095o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f33096p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f33097q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f33098r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f33099s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f33100t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f33101u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f33102v.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                zArr[16] = true;
                return 0;
            case 17:
                this.f33103w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }
}
