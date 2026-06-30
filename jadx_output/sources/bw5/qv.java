package bw5;

/* loaded from: classes2.dex */
public class qv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f32288d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32289e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32290f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32291g;

    /* renamed from: h, reason: collision with root package name */
    public int f32292h;

    /* renamed from: i, reason: collision with root package name */
    public int f32293i;

    /* renamed from: m, reason: collision with root package name */
    public int f32294m;

    /* renamed from: n, reason: collision with root package name */
    public int f32295n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f32296o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f32297p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f32298q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f32299r;

    /* renamed from: s, reason: collision with root package name */
    public int f32300s;

    /* renamed from: t, reason: collision with root package name */
    public int f32301t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f32302u = new boolean[15];

    static {
        new bw5.qv();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qv parseFrom(byte[] bArr) {
        return (bw5.qv) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qv)) {
            return false;
        }
        bw5.qv qvVar = (bw5.qv) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f32288d), java.lang.Long.valueOf(qvVar.f32288d)) && n51.f.a(this.f32289e, qvVar.f32289e) && n51.f.a(this.f32290f, qvVar.f32290f) && n51.f.a(this.f32291g, qvVar.f32291g) && n51.f.a(java.lang.Integer.valueOf(this.f32292h), java.lang.Integer.valueOf(qvVar.f32292h)) && n51.f.a(java.lang.Integer.valueOf(this.f32293i), java.lang.Integer.valueOf(qvVar.f32293i)) && n51.f.a(java.lang.Integer.valueOf(this.f32294m), java.lang.Integer.valueOf(qvVar.f32294m)) && n51.f.a(java.lang.Integer.valueOf(this.f32295n), java.lang.Integer.valueOf(qvVar.f32295n)) && n51.f.a(this.f32296o, qvVar.f32296o) && n51.f.a(this.f32297p, qvVar.f32297p) && n51.f.a(this.f32298q, qvVar.f32298q) && n51.f.a(this.f32299r, qvVar.f32299r) && n51.f.a(java.lang.Integer.valueOf(this.f32300s), java.lang.Integer.valueOf(qvVar.f32300s)) && n51.f.a(java.lang.Integer.valueOf(this.f32301t), java.lang.Integer.valueOf(qvVar.f32301t));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qv();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32302u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f32288d);
            }
            java.lang.String str = this.f32289e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f32290f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f32291g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f32292h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f32293i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f32294m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f32295n);
            }
            java.lang.String str4 = this.f32296o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f32297p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f32298q;
            if (str6 != null && zArr[11]) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f32299r;
            if (str7 != null && zArr[12]) {
                fVar.j(12, str7);
            }
            if (zArr[13]) {
                fVar.e(13, this.f32300s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f32301t);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f32288d) : 0;
            java.lang.String str8 = this.f32289e;
            if (str8 != null && zArr[2]) {
                h17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f32290f;
            if (str9 != null && zArr[3]) {
                h17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f32291g;
            if (str10 != null && zArr[4]) {
                h17 += b36.f.j(4, str10);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f32292h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f32293i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f32294m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f32295n);
            }
            java.lang.String str11 = this.f32296o;
            if (str11 != null && zArr[9]) {
                h17 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f32297p;
            if (str12 != null && zArr[10]) {
                h17 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f32298q;
            if (str13 != null && zArr[11]) {
                h17 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f32299r;
            if (str14 != null && zArr[12]) {
                h17 += b36.f.j(12, str14);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f32300s);
            }
            return zArr[14] ? h17 + b36.f.e(14, this.f32301t) : h17;
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
                this.f32288d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32289e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32290f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32291g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32292h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32293i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32294m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f32295n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f32296o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f32297p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f32298q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f32299r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f32300s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f32301t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
