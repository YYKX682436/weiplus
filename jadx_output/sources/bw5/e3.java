package bw5;

/* loaded from: classes2.dex */
public class e3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.d3 f26696d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26697e;

    /* renamed from: f, reason: collision with root package name */
    public int f26698f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26699g;

    /* renamed from: h, reason: collision with root package name */
    public int f26700h;

    /* renamed from: i, reason: collision with root package name */
    public int f26701i;

    /* renamed from: m, reason: collision with root package name */
    public int f26702m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f26703n;

    /* renamed from: o, reason: collision with root package name */
    public int f26704o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f26705p;

    /* renamed from: q, reason: collision with root package name */
    public int f26706q;

    /* renamed from: r, reason: collision with root package name */
    public int f26707r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f26708s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f26709t = new boolean[15];

    static {
        new bw5.e3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.e3 parseFrom(byte[] bArr) {
        return (bw5.e3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e3)) {
            return false;
        }
        bw5.e3 e3Var = (bw5.e3) fVar;
        return n51.f.a(this.f26696d, e3Var.f26696d) && n51.f.a(this.f26697e, e3Var.f26697e) && n51.f.a(java.lang.Integer.valueOf(this.f26698f), java.lang.Integer.valueOf(e3Var.f26698f)) && n51.f.a(this.f26699g, e3Var.f26699g) && n51.f.a(java.lang.Integer.valueOf(this.f26700h), java.lang.Integer.valueOf(e3Var.f26700h)) && n51.f.a(java.lang.Integer.valueOf(this.f26701i), java.lang.Integer.valueOf(e3Var.f26701i)) && n51.f.a(java.lang.Integer.valueOf(this.f26702m), java.lang.Integer.valueOf(e3Var.f26702m)) && n51.f.a(this.f26703n, e3Var.f26703n) && n51.f.a(java.lang.Integer.valueOf(this.f26704o), java.lang.Integer.valueOf(e3Var.f26704o)) && n51.f.a(this.f26705p, e3Var.f26705p) && n51.f.a(java.lang.Integer.valueOf(this.f26706q), java.lang.Integer.valueOf(e3Var.f26706q)) && n51.f.a(java.lang.Integer.valueOf(this.f26707r), java.lang.Integer.valueOf(e3Var.f26707r)) && n51.f.a(this.f26708s, e3Var.f26708s);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.e3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.d3 d3Var;
        boolean[] zArr = this.f26709t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.d3 d3Var2 = this.f26696d;
            if (d3Var2 != null && zArr[1]) {
                fVar.e(1, d3Var2.f26302d);
            }
            java.lang.String str = this.f26697e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26698f);
            }
            java.lang.String str2 = this.f26699g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26700h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f26701i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f26702m);
            }
            java.lang.String str3 = this.f26703n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            if (zArr[10]) {
                fVar.e(10, this.f26704o);
            }
            java.lang.String str4 = this.f26705p;
            if (str4 != null && zArr[11]) {
                fVar.j(11, str4);
            }
            if (zArr[12]) {
                fVar.e(12, this.f26706q);
            }
            if (zArr[13]) {
                fVar.e(13, this.f26707r);
            }
            java.lang.String str5 = this.f26708s;
            if (str5 == null || !zArr[14]) {
                return 0;
            }
            fVar.j(14, str5);
            return 0;
        }
        if (i17 == 1) {
            bw5.d3 d3Var3 = this.f26696d;
            int e17 = (d3Var3 == null || !zArr[1]) ? 0 : 0 + b36.f.e(1, d3Var3.f26302d);
            java.lang.String str6 = this.f26697e;
            if (str6 != null && zArr[2]) {
                e17 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f26698f);
            }
            java.lang.String str7 = this.f26699g;
            if (str7 != null && zArr[4]) {
                e17 += b36.f.j(4, str7);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f26700h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f26701i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f26702m);
            }
            java.lang.String str8 = this.f26703n;
            if (str8 != null && zArr[8]) {
                e17 += b36.f.j(8, str8);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f26704o);
            }
            java.lang.String str9 = this.f26705p;
            if (str9 != null && zArr[11]) {
                e17 += b36.f.j(11, str9);
            }
            if (zArr[12]) {
                e17 += b36.f.e(12, this.f26706q);
            }
            if (zArr[13]) {
                e17 += b36.f.e(13, this.f26707r);
            }
            java.lang.String str10 = this.f26708s;
            return (str10 == null || !zArr[14]) ? e17 : e17 + b36.f.j(14, str10);
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
                int g17 = aVar2.g(intValue);
                if (g17 == 101) {
                    d3Var = bw5.d3.CDN_QUALITY_AUTO_CLIQOS;
                } else if (g17 != 102) {
                    switch (g17) {
                        case 0:
                            d3Var = bw5.d3.CDN_QUALITY_HD;
                            break;
                        case 1:
                            d3Var = bw5.d3.CDN_QUALITY_SD1;
                            break;
                        case 2:
                            d3Var = bw5.d3.CDN_QUALITY_SD2;
                            break;
                        case 3:
                            d3Var = bw5.d3.CDN_QUALITY_SM;
                            break;
                        case 4:
                            d3Var = bw5.d3.CDN_QUALITY_SB;
                            break;
                        case 5:
                            d3Var = bw5.d3.CDN_QUALITY_HEVC;
                            break;
                        case 6:
                            d3Var = bw5.d3.CDN_QUALITY_UL;
                            break;
                        default:
                            d3Var = null;
                            break;
                    }
                } else {
                    d3Var = bw5.d3.CDN_QUALITY_AUTO_SVRML;
                }
                this.f26696d = d3Var;
                zArr[1] = true;
                return 0;
            case 2:
                this.f26697e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26698f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26699g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26700h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26701i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26702m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26703n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                this.f26704o = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f26705p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f26706q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f26707r = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f26708s = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
        }
    }
}
