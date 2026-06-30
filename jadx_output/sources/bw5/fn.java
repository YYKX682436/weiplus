package bw5;

/* loaded from: classes2.dex */
public class fn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27375d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27376e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27377f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27378g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f27379h;

    /* renamed from: i, reason: collision with root package name */
    public int f27380i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f27381m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f27382n;

    /* renamed from: o, reason: collision with root package name */
    public int f27383o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f27384p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f27385q = new boolean[14];

    static {
        new bw5.fn();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fn parseFrom(byte[] bArr) {
        return (bw5.fn) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fn)) {
            return false;
        }
        bw5.fn fnVar = (bw5.fn) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27375d), java.lang.Integer.valueOf(fnVar.f27375d)) && n51.f.a(this.f27376e, fnVar.f27376e) && n51.f.a(this.f27377f, fnVar.f27377f) && n51.f.a(this.f27378g, fnVar.f27378g) && n51.f.a(this.f27379h, fnVar.f27379h) && n51.f.a(java.lang.Integer.valueOf(this.f27380i), java.lang.Integer.valueOf(fnVar.f27380i)) && n51.f.a(this.f27381m, fnVar.f27381m) && n51.f.a(this.f27382n, fnVar.f27382n) && n51.f.a(java.lang.Integer.valueOf(this.f27383o), java.lang.Integer.valueOf(fnVar.f27383o)) && n51.f.a(this.f27384p, fnVar.f27384p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fn();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27385q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27375d);
            }
            java.lang.String str = this.f27376e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f27377f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f27378g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f27379h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.e(6, this.f27380i);
            }
            java.lang.String str5 = this.f27381m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f27382n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            if (zArr[10]) {
                fVar.e(10, this.f27383o);
            }
            java.lang.String str7 = this.f27384p;
            if (str7 != null && zArr[13]) {
                fVar.j(13, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f27375d) : 0;
            java.lang.String str8 = this.f27376e;
            if (str8 != null && zArr[2]) {
                e17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f27377f;
            if (str9 != null && zArr[3]) {
                e17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f27378g;
            if (str10 != null && zArr[4]) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f27379h;
            if (str11 != null && zArr[5]) {
                e17 += b36.f.j(5, str11);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f27380i);
            }
            java.lang.String str12 = this.f27381m;
            if (str12 != null && zArr[7]) {
                e17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f27382n;
            if (str13 != null && zArr[8]) {
                e17 += b36.f.j(8, str13);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f27383o);
            }
            java.lang.String str14 = this.f27384p;
            return (str14 == null || !zArr[13]) ? e17 : e17 + b36.f.j(13, str14);
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
        if (intValue == 10) {
            this.f27383o = aVar2.g(intValue);
            zArr[10] = true;
            return 0;
        }
        if (intValue == 13) {
            this.f27384p = aVar2.k(intValue);
            zArr[13] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f27375d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27376e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27377f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27378g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27379h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27380i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27381m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27382n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
