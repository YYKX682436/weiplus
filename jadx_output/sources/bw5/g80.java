package bw5;

/* loaded from: classes2.dex */
public class g80 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27723d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27724e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27725f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27726g;

    /* renamed from: h, reason: collision with root package name */
    public int f27727h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.i40 f27728i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f27729m;

    /* renamed from: n, reason: collision with root package name */
    public long f27730n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f27731o;

    /* renamed from: p, reason: collision with root package name */
    public int f27732p;

    /* renamed from: q, reason: collision with root package name */
    public int f27733q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.jb0 f27734r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f27735s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.ec0 f27736t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.e90 f27737u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.w60 f27738v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f27739w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f27740x = new boolean[19];

    static {
        new bw5.g80();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g80)) {
            return false;
        }
        bw5.g80 g80Var = (bw5.g80) fVar;
        return n51.f.a(this.BaseRequest, g80Var.BaseRequest) && n51.f.a(this.f27723d, g80Var.f27723d) && n51.f.a(this.f27724e, g80Var.f27724e) && n51.f.a(java.lang.Boolean.valueOf(this.f27725f), java.lang.Boolean.valueOf(g80Var.f27725f)) && n51.f.a(java.lang.Boolean.valueOf(this.f27726g), java.lang.Boolean.valueOf(g80Var.f27726g)) && n51.f.a(java.lang.Integer.valueOf(this.f27727h), java.lang.Integer.valueOf(g80Var.f27727h)) && n51.f.a(this.f27728i, g80Var.f27728i) && n51.f.a(this.f27729m, g80Var.f27729m) && n51.f.a(java.lang.Long.valueOf(this.f27730n), java.lang.Long.valueOf(g80Var.f27730n)) && n51.f.a(this.f27731o, g80Var.f27731o) && n51.f.a(java.lang.Integer.valueOf(this.f27732p), java.lang.Integer.valueOf(g80Var.f27732p)) && n51.f.a(java.lang.Integer.valueOf(this.f27733q), java.lang.Integer.valueOf(g80Var.f27733q)) && n51.f.a(this.f27734r, g80Var.f27734r) && n51.f.a(this.f27735s, g80Var.f27735s) && n51.f.a(this.f27736t, g80Var.f27736t) && n51.f.a(this.f27737u, g80Var.f27737u) && n51.f.a(this.f27738v, g80Var.f27738v) && n51.f.a(this.f27739w, g80Var.f27739w);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.f27740x[1] ? this.BaseRequest : new r45.he();
    }

    public java.lang.String getListenId() {
        return this.f27740x[2] ? this.f27723d : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.g80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27740x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f27723d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f27724e;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[3]) {
                fVar.a(3, this.f27725f);
            }
            if (zArr[5]) {
                fVar.a(5, this.f27726g);
            }
            if (zArr[6]) {
                fVar.e(6, this.f27727h);
            }
            bw5.i40 i40Var = this.f27728i;
            if (i40Var != null && zArr[7]) {
                fVar.i(7, i40Var.computeSize());
                this.f27728i.writeFields(fVar);
            }
            java.lang.String str3 = this.f27729m;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            if (zArr[9]) {
                fVar.h(9, this.f27730n);
            }
            java.lang.String str4 = this.f27731o;
            if (str4 != null && zArr[10]) {
                fVar.j(10, str4);
            }
            if (zArr[11]) {
                fVar.e(11, this.f27732p);
            }
            if (zArr[12]) {
                fVar.e(12, this.f27733q);
            }
            bw5.jb0 jb0Var = this.f27734r;
            if (jb0Var != null && zArr[13]) {
                fVar.i(13, jb0Var.computeSize());
                this.f27734r.writeFields(fVar);
            }
            java.lang.String str5 = this.f27735s;
            if (str5 != null && zArr[14]) {
                fVar.j(14, str5);
            }
            bw5.ec0 ec0Var = this.f27736t;
            if (ec0Var != null && zArr[15]) {
                fVar.i(15, ec0Var.computeSize());
                this.f27736t.writeFields(fVar);
            }
            bw5.e90 e90Var = this.f27737u;
            if (e90Var != null && zArr[16]) {
                fVar.i(16, e90Var.computeSize());
                this.f27737u.writeFields(fVar);
            }
            bw5.w60 w60Var = this.f27738v;
            if (w60Var != null && zArr[17]) {
                fVar.i(17, w60Var.computeSize());
                this.f27738v.writeFields(fVar);
            }
            java.lang.String str6 = this.f27739w;
            if (str6 != null && zArr[18]) {
                fVar.j(18, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, heVar2.computeSize()) + 0;
            }
            java.lang.String str7 = this.f27723d;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f27724e;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f27725f);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f27726g);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f27727h);
            }
            bw5.i40 i40Var2 = this.f27728i;
            if (i40Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, i40Var2.computeSize());
            }
            java.lang.String str9 = this.f27729m;
            if (str9 != null && zArr[8]) {
                i18 += b36.f.j(8, str9);
            }
            if (zArr[9]) {
                i18 += b36.f.h(9, this.f27730n);
            }
            java.lang.String str10 = this.f27731o;
            if (str10 != null && zArr[10]) {
                i18 += b36.f.j(10, str10);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f27732p);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f27733q);
            }
            bw5.jb0 jb0Var2 = this.f27734r;
            if (jb0Var2 != null && zArr[13]) {
                i18 += b36.f.i(13, jb0Var2.computeSize());
            }
            java.lang.String str11 = this.f27735s;
            if (str11 != null && zArr[14]) {
                i18 += b36.f.j(14, str11);
            }
            bw5.ec0 ec0Var2 = this.f27736t;
            if (ec0Var2 != null && zArr[15]) {
                i18 += b36.f.i(15, ec0Var2.computeSize());
            }
            bw5.e90 e90Var2 = this.f27737u;
            if (e90Var2 != null && zArr[16]) {
                i18 += b36.f.i(16, e90Var2.computeSize());
            }
            bw5.w60 w60Var2 = this.f27738v;
            if (w60Var2 != null && zArr[17]) {
                i18 += b36.f.i(17, w60Var2.computeSize());
            }
            java.lang.String str12 = this.f27739w;
            return (str12 == null || !zArr[18]) ? i18 : i18 + b36.f.j(18, str12);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    this.BaseRequest = heVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f27723d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27725f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27724e = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27726g = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27727h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.i40 i40Var3 = new bw5.i40();
                    if (bArr2 != null && bArr2.length > 0) {
                        i40Var3.parseFrom(bArr2);
                    }
                    this.f27728i = i40Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f27729m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f27730n = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f27731o = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f27732p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f27733q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.jb0 jb0Var3 = new bw5.jb0();
                    if (bArr3 != null && bArr3.length > 0) {
                        jb0Var3.parseFrom(bArr3);
                    }
                    this.f27734r = jb0Var3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                this.f27735s = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.ec0 ec0Var3 = new bw5.ec0();
                    if (bArr4 != null && bArr4.length > 0) {
                        ec0Var3.parseFrom(bArr4);
                    }
                    this.f27736t = ec0Var3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.e90 e90Var3 = new bw5.e90();
                    if (bArr5 != null && bArr5.length > 0) {
                        e90Var3.parseFrom(bArr5);
                    }
                    this.f27737u = e90Var3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.w60 w60Var3 = new bw5.w60();
                    if (bArr6 != null && bArr6.length > 0) {
                        w60Var3.parseFrom(bArr6);
                    }
                    this.f27738v = w60Var3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                this.f27739w = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.g80) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.f27740x[1] = true;
        return this;
    }
}
