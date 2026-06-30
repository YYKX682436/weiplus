package bw5;

/* loaded from: classes2.dex */
public class ef extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26872d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26873e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26874f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26875g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f26876h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26877i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26878m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f26879n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f26880o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f26881p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f26882q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f26883r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f26884s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f26885t = new boolean[14];

    static {
        new bw5.ef();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ef parseFrom(byte[] bArr) {
        return (bw5.ef) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ef)) {
            return false;
        }
        bw5.ef efVar = (bw5.ef) fVar;
        return n51.f.a(this.f26872d, efVar.f26872d) && n51.f.a(this.f26873e, efVar.f26873e) && n51.f.a(this.f26874f, efVar.f26874f) && n51.f.a(this.f26875g, efVar.f26875g) && n51.f.a(this.f26876h, efVar.f26876h) && n51.f.a(java.lang.Boolean.valueOf(this.f26877i), java.lang.Boolean.valueOf(efVar.f26877i)) && n51.f.a(java.lang.Boolean.valueOf(this.f26878m), java.lang.Boolean.valueOf(efVar.f26878m)) && n51.f.a(this.f26879n, efVar.f26879n) && n51.f.a(this.f26880o, efVar.f26880o) && n51.f.a(this.f26881p, efVar.f26881p) && n51.f.a(this.f26882q, efVar.f26882q) && n51.f.a(this.f26883r, efVar.f26883r) && n51.f.a(this.f26884s, efVar.f26884s);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ef();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26885t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26872d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26873e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f26874f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f26875g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f26876h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.a(6, this.f26877i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f26878m);
            }
            java.lang.String str6 = this.f26879n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f26880o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f26881p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f26882q;
            if (str9 != null && zArr[11]) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.f26883r;
            if (str10 != null && zArr[12]) {
                fVar.j(12, str10);
            }
            java.lang.String str11 = this.f26884s;
            if (str11 == null || !zArr[13]) {
                return 0;
            }
            fVar.j(13, str11);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f26872d;
            int j17 = (str12 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str12);
            java.lang.String str13 = this.f26873e;
            if (str13 != null && zArr[2]) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f26874f;
            if (str14 != null && zArr[3]) {
                j17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f26875g;
            if (str15 != null && zArr[4]) {
                j17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f26876h;
            if (str16 != null && zArr[5]) {
                j17 += b36.f.j(5, str16);
            }
            if (zArr[6]) {
                j17 += b36.f.a(6, this.f26877i);
            }
            if (zArr[7]) {
                j17 += b36.f.a(7, this.f26878m);
            }
            java.lang.String str17 = this.f26879n;
            if (str17 != null && zArr[8]) {
                j17 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f26880o;
            if (str18 != null && zArr[9]) {
                j17 += b36.f.j(9, str18);
            }
            java.lang.String str19 = this.f26881p;
            if (str19 != null && zArr[10]) {
                j17 += b36.f.j(10, str19);
            }
            java.lang.String str20 = this.f26882q;
            if (str20 != null && zArr[11]) {
                j17 += b36.f.j(11, str20);
            }
            java.lang.String str21 = this.f26883r;
            if (str21 != null && zArr[12]) {
                j17 += b36.f.j(12, str21);
            }
            java.lang.String str22 = this.f26884s;
            return (str22 == null || !zArr[13]) ? j17 : j17 + b36.f.j(13, str22);
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
                this.f26872d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26873e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26874f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26875g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26876h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26877i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26878m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26879n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f26880o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f26881p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f26882q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f26883r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f26884s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
