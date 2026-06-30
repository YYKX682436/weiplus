package bw5;

/* loaded from: classes2.dex */
public class fv extends com.tencent.mm.protobuf.f {
    public int A;
    public int B;
    public bw5.pj C;
    public int D;
    public int E;
    public bw5.hx F;
    public int G;
    public int H;
    public bw5.w4 I;

    /* renamed from: J, reason: collision with root package name */
    public int f27532J;
    public int K;
    public int L;
    public bw5.ul M;
    public bw5.ho N;
    public java.lang.String P;
    public bw5.gv Q;
    public com.tencent.mm.protobuf.g R;
    public final boolean[] S = new boolean[41];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27533d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27534e;

    /* renamed from: f, reason: collision with root package name */
    public int f27535f;

    /* renamed from: g, reason: collision with root package name */
    public long f27536g;

    /* renamed from: h, reason: collision with root package name */
    public int f27537h;

    /* renamed from: i, reason: collision with root package name */
    public int f27538i;

    /* renamed from: m, reason: collision with root package name */
    public long f27539m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27540n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f27541o;

    /* renamed from: p, reason: collision with root package name */
    public int f27542p;

    /* renamed from: q, reason: collision with root package name */
    public int f27543q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27544r;

    /* renamed from: s, reason: collision with root package name */
    public int f27545s;

    /* renamed from: t, reason: collision with root package name */
    public int f27546t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f27547u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f27548v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f27549w;

    /* renamed from: x, reason: collision with root package name */
    public int f27550x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.jh f27551y;

    /* renamed from: z, reason: collision with root package name */
    public int f27552z;

    static {
        new bw5.fv();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fv parseFrom(byte[] bArr) {
        return (bw5.fv) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fv)) {
            return false;
        }
        bw5.fv fvVar = (bw5.fv) fVar;
        return n51.f.a(this.f27533d, fvVar.f27533d) && n51.f.a(this.f27534e, fvVar.f27534e) && n51.f.a(java.lang.Integer.valueOf(this.f27535f), java.lang.Integer.valueOf(fvVar.f27535f)) && n51.f.a(java.lang.Long.valueOf(this.f27536g), java.lang.Long.valueOf(fvVar.f27536g)) && n51.f.a(java.lang.Integer.valueOf(this.f27537h), java.lang.Integer.valueOf(fvVar.f27537h)) && n51.f.a(java.lang.Integer.valueOf(this.f27538i), java.lang.Integer.valueOf(fvVar.f27538i)) && n51.f.a(java.lang.Long.valueOf(this.f27539m), java.lang.Long.valueOf(fvVar.f27539m)) && n51.f.a(this.f27540n, fvVar.f27540n) && n51.f.a(this.f27541o, fvVar.f27541o) && n51.f.a(java.lang.Integer.valueOf(this.f27542p), java.lang.Integer.valueOf(fvVar.f27542p)) && n51.f.a(java.lang.Integer.valueOf(this.f27543q), java.lang.Integer.valueOf(fvVar.f27543q)) && n51.f.a(this.f27544r, fvVar.f27544r) && n51.f.a(java.lang.Integer.valueOf(this.f27545s), java.lang.Integer.valueOf(fvVar.f27545s)) && n51.f.a(java.lang.Integer.valueOf(this.f27546t), java.lang.Integer.valueOf(fvVar.f27546t)) && n51.f.a(this.f27547u, fvVar.f27547u) && n51.f.a(this.f27548v, fvVar.f27548v) && n51.f.a(this.f27549w, fvVar.f27549w) && n51.f.a(java.lang.Integer.valueOf(this.f27550x), java.lang.Integer.valueOf(fvVar.f27550x)) && n51.f.a(this.f27551y, fvVar.f27551y) && n51.f.a(java.lang.Integer.valueOf(this.f27552z), java.lang.Integer.valueOf(fvVar.f27552z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(fvVar.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(fvVar.B)) && n51.f.a(this.C, fvVar.C) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(fvVar.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(fvVar.E)) && n51.f.a(this.F, fvVar.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(fvVar.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(fvVar.H)) && n51.f.a(this.I, fvVar.I) && n51.f.a(java.lang.Integer.valueOf(this.f27532J), java.lang.Integer.valueOf(fvVar.f27532J)) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(fvVar.K)) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(fvVar.L)) && n51.f.a(this.M, fvVar.M) && n51.f.a(this.N, fvVar.N) && n51.f.a(this.P, fvVar.P) && n51.f.a(this.Q, fvVar.Q) && n51.f.a(this.R, fvVar.R);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fv();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.S;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27533d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f27534e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27535f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f27536g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f27537h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f27538i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f27539m);
            }
            com.tencent.mm.protobuf.g gVar = this.f27540n;
            if (gVar != null && zArr[8]) {
                fVar.b(8, gVar);
            }
            java.lang.String str3 = this.f27541o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.e(10, this.f27542p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f27543q);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27544r;
            if (gVar2 != null && zArr[12]) {
                fVar.b(12, gVar2);
            }
            if (zArr[13]) {
                fVar.e(13, this.f27545s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f27546t);
            }
            java.lang.String str4 = this.f27547u;
            if (str4 != null && zArr[15]) {
                fVar.j(15, str4);
            }
            java.lang.String str5 = this.f27548v;
            if (str5 != null && zArr[16]) {
                fVar.j(16, str5);
            }
            java.lang.String str6 = this.f27549w;
            if (str6 != null && zArr[17]) {
                fVar.j(17, str6);
            }
            if (zArr[18]) {
                fVar.e(18, this.f27550x);
            }
            bw5.jh jhVar = this.f27551y;
            if (jhVar != null && zArr[19]) {
                fVar.i(19, jhVar.computeSize());
                this.f27551y.writeFields(fVar);
            }
            if (zArr[20]) {
                fVar.e(20, this.f27552z);
            }
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            if (zArr[22]) {
                fVar.e(22, this.B);
            }
            bw5.pj pjVar = this.C;
            if (pjVar != null && zArr[23]) {
                fVar.i(23, pjVar.computeSize());
                this.C.writeFields(fVar);
            }
            if (zArr[24]) {
                fVar.e(24, this.D);
            }
            if (zArr[25]) {
                fVar.e(25, this.E);
            }
            bw5.hx hxVar = this.F;
            if (hxVar != null && zArr[26]) {
                fVar.i(26, hxVar.computeSize());
                this.F.writeFields(fVar);
            }
            if (zArr[28]) {
                fVar.e(28, this.G);
            }
            if (zArr[29]) {
                fVar.e(29, this.H);
            }
            bw5.w4 w4Var = this.I;
            if (w4Var != null && zArr[30]) {
                fVar.i(30, w4Var.computeSize());
                this.I.writeFields(fVar);
            }
            if (zArr[31]) {
                fVar.e(31, this.f27532J);
            }
            if (zArr[32]) {
                fVar.e(32, this.K);
            }
            if (zArr[33]) {
                fVar.e(33, this.L);
            }
            bw5.ul ulVar = this.M;
            if (ulVar != null && zArr[34]) {
                fVar.i(34, ulVar.computeSize());
                this.M.writeFields(fVar);
            }
            bw5.ho hoVar = this.N;
            if (hoVar != null && zArr[35]) {
                fVar.i(35, hoVar.computeSize());
                this.N.writeFields(fVar);
            }
            java.lang.String str7 = this.P;
            if (str7 != null && zArr[36]) {
                fVar.j(36, str7);
            }
            bw5.gv gvVar = this.Q;
            if (gvVar != null && zArr[37]) {
                fVar.i(37, gvVar.computeSize());
                this.Q.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar3 = this.R;
            if (gVar3 != null && zArr[40]) {
                fVar.b(40, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f27533d;
            if (str8 != null && zArr[1]) {
                i18 = b36.f.j(1, str8) + 0;
            }
            java.lang.String str9 = this.f27534e;
            if (str9 != null && zArr[2]) {
                i18 += b36.f.j(2, str9);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f27535f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f27536g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f27537h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f27538i);
            }
            if (zArr[7]) {
                i18 += b36.f.h(7, this.f27539m);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f27540n;
            if (gVar4 != null && zArr[8]) {
                i18 += b36.f.b(8, gVar4);
            }
            java.lang.String str10 = this.f27541o;
            if (str10 != null && zArr[9]) {
                i18 += b36.f.j(9, str10);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f27542p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f27543q);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f27544r;
            if (gVar5 != null && zArr[12]) {
                i18 += b36.f.b(12, gVar5);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f27545s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f27546t);
            }
            java.lang.String str11 = this.f27547u;
            if (str11 != null && zArr[15]) {
                i18 += b36.f.j(15, str11);
            }
            java.lang.String str12 = this.f27548v;
            if (str12 != null && zArr[16]) {
                i18 += b36.f.j(16, str12);
            }
            java.lang.String str13 = this.f27549w;
            if (str13 != null && zArr[17]) {
                i18 += b36.f.j(17, str13);
            }
            if (zArr[18]) {
                i18 += b36.f.e(18, this.f27550x);
            }
            bw5.jh jhVar2 = this.f27551y;
            if (jhVar2 != null && zArr[19]) {
                i18 += b36.f.i(19, jhVar2.computeSize());
            }
            if (zArr[20]) {
                i18 += b36.f.e(20, this.f27552z);
            }
            if (zArr[21]) {
                i18 += b36.f.e(21, this.A);
            }
            if (zArr[22]) {
                i18 += b36.f.e(22, this.B);
            }
            bw5.pj pjVar2 = this.C;
            if (pjVar2 != null && zArr[23]) {
                i18 += b36.f.i(23, pjVar2.computeSize());
            }
            if (zArr[24]) {
                i18 += b36.f.e(24, this.D);
            }
            if (zArr[25]) {
                i18 += b36.f.e(25, this.E);
            }
            bw5.hx hxVar2 = this.F;
            if (hxVar2 != null && zArr[26]) {
                i18 += b36.f.i(26, hxVar2.computeSize());
            }
            if (zArr[28]) {
                i18 += b36.f.e(28, this.G);
            }
            if (zArr[29]) {
                i18 += b36.f.e(29, this.H);
            }
            bw5.w4 w4Var2 = this.I;
            if (w4Var2 != null && zArr[30]) {
                i18 += b36.f.i(30, w4Var2.computeSize());
            }
            if (zArr[31]) {
                i18 += b36.f.e(31, this.f27532J);
            }
            if (zArr[32]) {
                i18 += b36.f.e(32, this.K);
            }
            if (zArr[33]) {
                i18 += b36.f.e(33, this.L);
            }
            bw5.ul ulVar2 = this.M;
            if (ulVar2 != null && zArr[34]) {
                i18 += b36.f.i(34, ulVar2.computeSize());
            }
            bw5.ho hoVar2 = this.N;
            if (hoVar2 != null && zArr[35]) {
                i18 += b36.f.i(35, hoVar2.computeSize());
            }
            java.lang.String str14 = this.P;
            if (str14 != null && zArr[36]) {
                i18 += b36.f.j(36, str14);
            }
            bw5.gv gvVar2 = this.Q;
            if (gvVar2 != null && zArr[37]) {
                i18 += b36.f.i(37, gvVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar6 = this.R;
            return (gVar6 == null || !zArr[40]) ? i18 : i18 + b36.f.b(40, gVar6);
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
                this.f27533d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27534e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27535f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27536g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27537h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27538i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27539m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27540n = aVar2.d(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f27541o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f27542p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f27543q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f27544r = aVar2.d(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f27545s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f27546t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f27547u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f27548v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f27549w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f27550x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.jh jhVar3 = new bw5.jh();
                    if (bArr != null && bArr.length > 0) {
                        jhVar3.parseFrom(bArr);
                    }
                    this.f27551y = jhVar3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                this.f27552z = aVar2.g(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.g(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.pj pjVar3 = new bw5.pj();
                    if (bArr2 != null && bArr2.length > 0) {
                        pjVar3.parseFrom(bArr2);
                    }
                    this.C = pjVar3;
                }
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.g(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.g(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.hx hxVar3 = new bw5.hx();
                    if (bArr3 != null && bArr3.length > 0) {
                        hxVar3.parseFrom(bArr3);
                    }
                    this.F = hxVar3;
                }
                zArr[26] = true;
                return 0;
            case 27:
            case 38:
            case 39:
            default:
                return -1;
            case 28:
                this.G = aVar2.g(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.H = aVar2.g(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.w4 w4Var3 = new bw5.w4();
                    if (bArr4 != null && bArr4.length > 0) {
                        w4Var3.parseFrom(bArr4);
                    }
                    this.I = w4Var3;
                }
                zArr[30] = true;
                return 0;
            case 31:
                this.f27532J = aVar2.g(intValue);
                zArr[31] = true;
                return 0;
            case 32:
                this.K = aVar2.g(intValue);
                zArr[32] = true;
                return 0;
            case 33:
                this.L = aVar2.g(intValue);
                zArr[33] = true;
                return 0;
            case 34:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.ul ulVar3 = new bw5.ul();
                    if (bArr5 != null && bArr5.length > 0) {
                        ulVar3.parseFrom(bArr5);
                    }
                    this.M = ulVar3;
                }
                zArr[34] = true;
                return 0;
            case 35:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.ho hoVar3 = new bw5.ho();
                    if (bArr6 != null && bArr6.length > 0) {
                        hoVar3.parseFrom(bArr6);
                    }
                    this.N = hoVar3;
                }
                zArr[35] = true;
                return 0;
            case 36:
                this.P = aVar2.k(intValue);
                zArr[36] = true;
                return 0;
            case 37:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.gv gvVar3 = new bw5.gv();
                    if (bArr7 != null && bArr7.length > 0) {
                        gvVar3.parseFrom(bArr7);
                    }
                    this.Q = gvVar3;
                }
                zArr[37] = true;
                return 0;
            case 40:
                this.R = aVar2.d(intValue);
                zArr[40] = true;
                return 0;
        }
    }
}
