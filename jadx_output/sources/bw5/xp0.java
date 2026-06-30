package bw5;

/* loaded from: classes2.dex */
public class xp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.yp0 f35228d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35229e;

    /* renamed from: f, reason: collision with root package name */
    public long f35230f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35231g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f35232h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f35233i;

    /* renamed from: m, reason: collision with root package name */
    public int f35234m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f35235n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.v60 f35236o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f35237p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f35238q;

    /* renamed from: r, reason: collision with root package name */
    public int f35239r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f35240s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.zp0 f35241t;

    /* renamed from: u, reason: collision with root package name */
    public int f35242u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f35243v = new boolean[16];

    static {
        new bw5.xp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xp0)) {
            return false;
        }
        bw5.xp0 xp0Var = (bw5.xp0) fVar;
        return n51.f.a(this.f35228d, xp0Var.f35228d) && n51.f.a(java.lang.Boolean.valueOf(this.f35229e), java.lang.Boolean.valueOf(xp0Var.f35229e)) && n51.f.a(java.lang.Long.valueOf(this.f35230f), java.lang.Long.valueOf(xp0Var.f35230f)) && n51.f.a(java.lang.Boolean.valueOf(this.f35231g), java.lang.Boolean.valueOf(xp0Var.f35231g)) && n51.f.a(java.lang.Boolean.valueOf(this.f35232h), java.lang.Boolean.valueOf(xp0Var.f35232h)) && n51.f.a(java.lang.Boolean.valueOf(this.f35233i), java.lang.Boolean.valueOf(xp0Var.f35233i)) && n51.f.a(java.lang.Integer.valueOf(this.f35234m), java.lang.Integer.valueOf(xp0Var.f35234m)) && n51.f.a(this.f35235n, xp0Var.f35235n) && n51.f.a(this.f35236o, xp0Var.f35236o) && n51.f.a(this.f35237p, xp0Var.f35237p) && n51.f.a(this.f35238q, xp0Var.f35238q) && n51.f.a(java.lang.Integer.valueOf(this.f35239r), java.lang.Integer.valueOf(xp0Var.f35239r)) && n51.f.a(java.lang.Boolean.valueOf(this.f35240s), java.lang.Boolean.valueOf(xp0Var.f35240s)) && n51.f.a(this.f35241t, xp0Var.f35241t) && n51.f.a(java.lang.Integer.valueOf(this.f35242u), java.lang.Integer.valueOf(xp0Var.f35242u));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35243v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.yp0 yp0Var = this.f35228d;
            if (yp0Var != null && zArr[1]) {
                fVar.e(1, yp0Var.f35607d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f35229e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f35230f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f35231g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f35232h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f35233i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f35234m);
            }
            java.lang.String str = this.f35235n;
            if (str != null && zArr[8]) {
                fVar.j(8, str);
            }
            bw5.v60 v60Var = this.f35236o;
            if (v60Var != null && zArr[9]) {
                fVar.i(9, v60Var.computeSize());
                this.f35236o.writeFields(fVar);
            }
            java.lang.String str2 = this.f35237p;
            if (str2 != null && zArr[10]) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f35238q;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            if (zArr[12]) {
                fVar.e(12, this.f35239r);
            }
            if (zArr[13]) {
                fVar.a(13, this.f35240s);
            }
            bw5.zp0 zp0Var = this.f35241t;
            if (zp0Var != null && zArr[14]) {
                fVar.i(14, zp0Var.computeSize());
                this.f35241t.writeFields(fVar);
            }
            if (zArr[15]) {
                fVar.e(15, this.f35242u);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.yp0 yp0Var2 = this.f35228d;
            if (yp0Var2 != null && zArr[1]) {
                i18 = b36.f.e(1, yp0Var2.f35607d) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f35229e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f35230f);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f35231g);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f35232h);
            }
            if (zArr[6]) {
                i18 += b36.f.a(6, this.f35233i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f35234m);
            }
            java.lang.String str4 = this.f35235n;
            if (str4 != null && zArr[8]) {
                i18 += b36.f.j(8, str4);
            }
            bw5.v60 v60Var2 = this.f35236o;
            if (v60Var2 != null && zArr[9]) {
                i18 += b36.f.i(9, v60Var2.computeSize());
            }
            java.lang.String str5 = this.f35237p;
            if (str5 != null && zArr[10]) {
                i18 += b36.f.j(10, str5);
            }
            java.lang.String str6 = this.f35238q;
            if (str6 != null && zArr[11]) {
                i18 += b36.f.j(11, str6);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f35239r);
            }
            if (zArr[13]) {
                i18 += b36.f.a(13, this.f35240s);
            }
            bw5.zp0 zp0Var2 = this.f35241t;
            if (zp0Var2 != null && zArr[14]) {
                i18 += b36.f.i(14, zp0Var2.computeSize());
            }
            return zArr[15] ? i18 + b36.f.e(15, this.f35242u) : i18;
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
                this.f35228d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? null : bw5.yp0.TingMusicSquareFetchDataReason_ClickErrorTips : bw5.yp0.TingMusicSquareFetchDataReason_PullDown : bw5.yp0.TingMusicSquareFetchDataReason_Reddot : bw5.yp0.TingMusicSquareFetchDataReason_Init : bw5.yp0.TingMusicSquareFetchDataReason_None;
                zArr[1] = true;
                return 0;
            case 2:
                this.f35229e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35230f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35231g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35232h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35233i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f35234m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f35235n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.v60 v60Var3 = new bw5.v60();
                    if (bArr != null && bArr.length > 0) {
                        v60Var3.parseFrom(bArr);
                    }
                    this.f35236o = v60Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f35237p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f35238q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f35239r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f35240s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.zp0 zp0Var3 = new bw5.zp0();
                    if (bArr2 != null && bArr2.length > 0) {
                        zp0Var3.parseFrom(bArr2);
                    }
                    this.f35241t = zp0Var3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f35242u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.xp0) super.parseFrom(bArr);
    }
}
