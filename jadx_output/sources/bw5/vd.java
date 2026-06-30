package bw5;

/* loaded from: classes2.dex */
public class vd extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public int D;
    public int E;
    public int F;
    public bw5.ee G;
    public bw5.ae H;
    public bw5.ae I;

    /* renamed from: J, reason: collision with root package name */
    public int f34308J;
    public bw5.s3 K;
    public java.lang.String L;
    public int M;
    public int N;
    public bw5.ih P;
    public java.lang.String R;
    public bw5.td S;
    public int T;
    public java.lang.String U;
    public bw5.y3 V;
    public bw5.a4 X;
    public bw5.zd Y;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34309d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34310e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34311f;

    /* renamed from: g, reason: collision with root package name */
    public long f34312g;

    /* renamed from: h, reason: collision with root package name */
    public long f34313h;

    /* renamed from: i, reason: collision with root package name */
    public int f34314i;

    /* renamed from: l1, reason: collision with root package name */
    public bw5.w3 f34315l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f34316m;

    /* renamed from: o, reason: collision with root package name */
    public long f34318o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f34319p;

    /* renamed from: p0, reason: collision with root package name */
    public bw5.yd f34320p0;

    /* renamed from: p1, reason: collision with root package name */
    public bw5.k2 f34321p1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f34322q;

    /* renamed from: r, reason: collision with root package name */
    public int f34323r;

    /* renamed from: s, reason: collision with root package name */
    public int f34324s;

    /* renamed from: t, reason: collision with root package name */
    public long f34325t;

    /* renamed from: u, reason: collision with root package name */
    public int f34326u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34327v;

    /* renamed from: w, reason: collision with root package name */
    public int f34328w;

    /* renamed from: x, reason: collision with root package name */
    public int f34329x;

    /* renamed from: x0, reason: collision with root package name */
    public int f34330x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f34331x1;

    /* renamed from: y, reason: collision with root package name */
    public int f34332y;

    /* renamed from: y0, reason: collision with root package name */
    public int f34333y0;

    /* renamed from: y1, reason: collision with root package name */
    public bw5.dg f34334y1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f34335z;

    /* renamed from: z1, reason: collision with root package name */
    public bw5.ud f34336z1;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f34317n = new java.util.LinkedList();
    public final java.util.LinkedList Q = new java.util.LinkedList();
    public final java.util.LinkedList W = new java.util.LinkedList();
    public final java.util.LinkedList Z = new java.util.LinkedList();
    public final boolean[] A1 = new boolean[58];

    static {
        new bw5.vd();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vd parseFrom(byte[] bArr) {
        return (bw5.vd) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vd)) {
            return false;
        }
        bw5.vd vdVar = (bw5.vd) fVar;
        return n51.f.a(this.f34309d, vdVar.f34309d) && n51.f.a(this.f34310e, vdVar.f34310e) && n51.f.a(this.f34311f, vdVar.f34311f) && n51.f.a(java.lang.Long.valueOf(this.f34312g), java.lang.Long.valueOf(vdVar.f34312g)) && n51.f.a(java.lang.Long.valueOf(this.f34313h), java.lang.Long.valueOf(vdVar.f34313h)) && n51.f.a(java.lang.Integer.valueOf(this.f34314i), java.lang.Integer.valueOf(vdVar.f34314i)) && n51.f.a(this.f34316m, vdVar.f34316m) && n51.f.a(this.f34317n, vdVar.f34317n) && n51.f.a(java.lang.Long.valueOf(this.f34318o), java.lang.Long.valueOf(vdVar.f34318o)) && n51.f.a(this.f34319p, vdVar.f34319p) && n51.f.a(this.f34322q, vdVar.f34322q) && n51.f.a(java.lang.Integer.valueOf(this.f34323r), java.lang.Integer.valueOf(vdVar.f34323r)) && n51.f.a(java.lang.Integer.valueOf(this.f34324s), java.lang.Integer.valueOf(vdVar.f34324s)) && n51.f.a(java.lang.Long.valueOf(this.f34325t), java.lang.Long.valueOf(vdVar.f34325t)) && n51.f.a(java.lang.Integer.valueOf(this.f34326u), java.lang.Integer.valueOf(vdVar.f34326u)) && n51.f.a(this.f34327v, vdVar.f34327v) && n51.f.a(java.lang.Integer.valueOf(this.f34328w), java.lang.Integer.valueOf(vdVar.f34328w)) && n51.f.a(java.lang.Integer.valueOf(this.f34329x), java.lang.Integer.valueOf(vdVar.f34329x)) && n51.f.a(java.lang.Integer.valueOf(this.f34332y), java.lang.Integer.valueOf(vdVar.f34332y)) && n51.f.a(this.f34335z, vdVar.f34335z) && n51.f.a(this.A, vdVar.A) && n51.f.a(this.B, vdVar.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(vdVar.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(vdVar.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(vdVar.E)) && n51.f.a(java.lang.Integer.valueOf(this.F), java.lang.Integer.valueOf(vdVar.F)) && n51.f.a(this.G, vdVar.G) && n51.f.a(this.H, vdVar.H) && n51.f.a(this.I, vdVar.I) && n51.f.a(java.lang.Integer.valueOf(this.f34308J), java.lang.Integer.valueOf(vdVar.f34308J)) && n51.f.a(this.K, vdVar.K) && n51.f.a(this.L, vdVar.L) && n51.f.a(java.lang.Integer.valueOf(this.M), java.lang.Integer.valueOf(vdVar.M)) && n51.f.a(java.lang.Integer.valueOf(this.N), java.lang.Integer.valueOf(vdVar.N)) && n51.f.a(this.P, vdVar.P) && n51.f.a(this.Q, vdVar.Q) && n51.f.a(this.R, vdVar.R) && n51.f.a(this.S, vdVar.S) && n51.f.a(java.lang.Integer.valueOf(this.T), java.lang.Integer.valueOf(vdVar.T)) && n51.f.a(this.U, vdVar.U) && n51.f.a(this.V, vdVar.V) && n51.f.a(this.W, vdVar.W) && n51.f.a(this.X, vdVar.X) && n51.f.a(this.Y, vdVar.Y) && n51.f.a(this.Z, vdVar.Z) && n51.f.a(this.f34320p0, vdVar.f34320p0) && n51.f.a(java.lang.Integer.valueOf(this.f34330x0), java.lang.Integer.valueOf(vdVar.f34330x0)) && n51.f.a(java.lang.Integer.valueOf(this.f34333y0), java.lang.Integer.valueOf(vdVar.f34333y0)) && n51.f.a(this.f34315l1, vdVar.f34315l1) && n51.f.a(this.f34321p1, vdVar.f34321p1) && n51.f.a(java.lang.Integer.valueOf(this.f34331x1), java.lang.Integer.valueOf(vdVar.f34331x1)) && n51.f.a(this.f34334y1, vdVar.f34334y1) && n51.f.a(this.f34336z1, vdVar.f34336z1);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vd();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.A1;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34309d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f34310e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f34311f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.h(4, this.f34312g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f34313h);
            }
            if (zArr[6]) {
                fVar.f(6, this.f34314i);
            }
            java.lang.String str4 = this.f34316m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            fVar.g(8, 8, this.f34317n);
            if (zArr[9]) {
                fVar.h(9, this.f34318o);
            }
            java.lang.String str5 = this.f34319p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f34322q;
            if (str6 != null && zArr[11]) {
                fVar.j(11, str6);
            }
            if (zArr[12]) {
                fVar.f(12, this.f34323r);
            }
            if (zArr[13]) {
                fVar.f(13, this.f34324s);
            }
            if (zArr[14]) {
                fVar.h(14, this.f34325t);
            }
            if (zArr[15]) {
                fVar.f(15, this.f34326u);
            }
            com.tencent.mm.protobuf.g gVar = this.f34327v;
            if (gVar != null && zArr[16]) {
                fVar.b(16, gVar);
            }
            if (zArr[17]) {
                fVar.f(17, this.f34328w);
            }
            if (zArr[18]) {
                fVar.f(18, this.f34329x);
            }
            if (zArr[19]) {
                fVar.f(19, this.f34332y);
            }
            java.lang.String str7 = this.f34335z;
            if (str7 != null && zArr[20]) {
                fVar.j(20, str7);
            }
            java.lang.String str8 = this.A;
            if (str8 != null && zArr[21]) {
                fVar.j(21, str8);
            }
            java.lang.String str9 = this.B;
            if (str9 != null && zArr[22]) {
                fVar.j(22, str9);
            }
            if (zArr[23]) {
                fVar.f(23, this.C);
            }
            if (zArr[24]) {
                fVar.f(24, this.D);
            }
            if (zArr[25]) {
                fVar.f(25, this.E);
            }
            if (zArr[26]) {
                fVar.f(26, this.F);
            }
            bw5.ee eeVar = this.G;
            if (eeVar != null && zArr[27]) {
                fVar.i(27, eeVar.computeSize());
                this.G.writeFields(fVar);
            }
            bw5.ae aeVar = this.H;
            if (aeVar != null && zArr[28]) {
                fVar.i(28, aeVar.computeSize());
                this.H.writeFields(fVar);
            }
            bw5.ae aeVar2 = this.I;
            if (aeVar2 != null && zArr[29]) {
                fVar.i(29, aeVar2.computeSize());
                this.I.writeFields(fVar);
            }
            if (zArr[30]) {
                fVar.f(30, this.f34308J);
            }
            bw5.s3 s3Var = this.K;
            if (s3Var != null && zArr[31]) {
                fVar.i(31, s3Var.computeSize());
                this.K.writeFields(fVar);
            }
            java.lang.String str10 = this.L;
            if (str10 != null && zArr[32]) {
                fVar.j(32, str10);
            }
            if (zArr[33]) {
                fVar.f(33, this.M);
            }
            if (zArr[34]) {
                fVar.f(34, this.N);
            }
            bw5.ih ihVar = this.P;
            if (ihVar != null && zArr[35]) {
                fVar.i(35, ihVar.computeSize());
                this.P.writeFields(fVar);
            }
            fVar.g(36, 8, this.Q);
            java.lang.String str11 = this.R;
            if (str11 != null && zArr[37]) {
                fVar.j(37, str11);
            }
            bw5.td tdVar = this.S;
            if (tdVar != null && zArr[38]) {
                fVar.i(38, tdVar.computeSize());
                this.S.writeFields(fVar);
            }
            if (zArr[39]) {
                fVar.f(39, this.T);
            }
            java.lang.String str12 = this.U;
            if (str12 != null && zArr[40]) {
                fVar.j(40, str12);
            }
            bw5.y3 y3Var = this.V;
            if (y3Var != null && zArr[41]) {
                fVar.i(41, y3Var.computeSize());
                this.V.writeFields(fVar);
            }
            fVar.g(42, 8, this.W);
            bw5.a4 a4Var = this.X;
            if (a4Var != null && zArr[43]) {
                fVar.i(43, a4Var.computeSize());
                this.X.writeFields(fVar);
            }
            bw5.zd zdVar = this.Y;
            if (zdVar != null && zArr[44]) {
                fVar.i(44, zdVar.computeSize());
                this.Y.writeFields(fVar);
            }
            fVar.g(45, 8, this.Z);
            bw5.yd ydVar = this.f34320p0;
            if (ydVar != null && zArr[46]) {
                fVar.i(46, ydVar.computeSize());
                this.f34320p0.writeFields(fVar);
            }
            if (zArr[47]) {
                fVar.f(47, this.f34330x0);
            }
            if (zArr[48]) {
                fVar.f(48, this.f34333y0);
            }
            bw5.w3 w3Var = this.f34315l1;
            if (w3Var != null && zArr[49]) {
                fVar.i(49, w3Var.computeSize());
                this.f34315l1.writeFields(fVar);
            }
            bw5.k2 k2Var = this.f34321p1;
            if (k2Var != null && zArr[50]) {
                fVar.i(50, k2Var.computeSize());
                this.f34321p1.writeFields(fVar);
            }
            if (zArr[52]) {
                fVar.f(52, this.f34331x1);
            }
            bw5.dg dgVar = this.f34334y1;
            if (dgVar != null && zArr[55]) {
                fVar.i(55, dgVar.computeSize());
                this.f34334y1.writeFields(fVar);
            }
            bw5.ud udVar = this.f34336z1;
            if (udVar != null && zArr[57]) {
                fVar.i(57, udVar.computeSize());
                this.f34336z1.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f34309d;
            if (str13 != null && zArr[1]) {
                i18 = b36.f.j(1, str13) + 0;
            }
            java.lang.String str14 = this.f34310e;
            if (str14 != null && zArr[2]) {
                i18 += b36.f.j(2, str14);
            }
            java.lang.String str15 = this.f34311f;
            if (str15 != null && zArr[3]) {
                i18 += b36.f.j(3, str15);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f34312g);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f34313h);
            }
            if (zArr[6]) {
                i18 += b36.f.f(6, this.f34314i);
            }
            java.lang.String str16 = this.f34316m;
            if (str16 != null && zArr[7]) {
                i18 += b36.f.j(7, str16);
            }
            int g17 = i18 + b36.f.g(8, 8, this.f34317n);
            if (zArr[9]) {
                g17 += b36.f.h(9, this.f34318o);
            }
            java.lang.String str17 = this.f34319p;
            if (str17 != null && zArr[10]) {
                g17 += b36.f.j(10, str17);
            }
            java.lang.String str18 = this.f34322q;
            if (str18 != null && zArr[11]) {
                g17 += b36.f.j(11, str18);
            }
            if (zArr[12]) {
                g17 += b36.f.f(12, this.f34323r);
            }
            if (zArr[13]) {
                g17 += b36.f.f(13, this.f34324s);
            }
            if (zArr[14]) {
                g17 += b36.f.h(14, this.f34325t);
            }
            if (zArr[15]) {
                g17 += b36.f.f(15, this.f34326u);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f34327v;
            if (gVar2 != null && zArr[16]) {
                g17 += b36.f.b(16, gVar2);
            }
            if (zArr[17]) {
                g17 += b36.f.f(17, this.f34328w);
            }
            if (zArr[18]) {
                g17 += b36.f.f(18, this.f34329x);
            }
            if (zArr[19]) {
                g17 += b36.f.f(19, this.f34332y);
            }
            java.lang.String str19 = this.f34335z;
            if (str19 != null && zArr[20]) {
                g17 += b36.f.j(20, str19);
            }
            java.lang.String str20 = this.A;
            if (str20 != null && zArr[21]) {
                g17 += b36.f.j(21, str20);
            }
            java.lang.String str21 = this.B;
            if (str21 != null && zArr[22]) {
                g17 += b36.f.j(22, str21);
            }
            if (zArr[23]) {
                g17 += b36.f.f(23, this.C);
            }
            if (zArr[24]) {
                g17 += b36.f.f(24, this.D);
            }
            if (zArr[25]) {
                g17 += b36.f.f(25, this.E);
            }
            if (zArr[26]) {
                g17 += b36.f.f(26, this.F);
            }
            bw5.ee eeVar2 = this.G;
            if (eeVar2 != null && zArr[27]) {
                g17 += b36.f.i(27, eeVar2.computeSize());
            }
            bw5.ae aeVar3 = this.H;
            if (aeVar3 != null && zArr[28]) {
                g17 += b36.f.i(28, aeVar3.computeSize());
            }
            bw5.ae aeVar4 = this.I;
            if (aeVar4 != null && zArr[29]) {
                g17 += b36.f.i(29, aeVar4.computeSize());
            }
            if (zArr[30]) {
                g17 += b36.f.f(30, this.f34308J);
            }
            bw5.s3 s3Var2 = this.K;
            if (s3Var2 != null && zArr[31]) {
                g17 += b36.f.i(31, s3Var2.computeSize());
            }
            java.lang.String str22 = this.L;
            if (str22 != null && zArr[32]) {
                g17 += b36.f.j(32, str22);
            }
            if (zArr[33]) {
                g17 += b36.f.f(33, this.M);
            }
            if (zArr[34]) {
                g17 += b36.f.f(34, this.N);
            }
            bw5.ih ihVar2 = this.P;
            if (ihVar2 != null && zArr[35]) {
                g17 += b36.f.i(35, ihVar2.computeSize());
            }
            int g18 = g17 + b36.f.g(36, 8, this.Q);
            java.lang.String str23 = this.R;
            if (str23 != null && zArr[37]) {
                g18 += b36.f.j(37, str23);
            }
            bw5.td tdVar2 = this.S;
            if (tdVar2 != null && zArr[38]) {
                g18 += b36.f.i(38, tdVar2.computeSize());
            }
            if (zArr[39]) {
                g18 += b36.f.f(39, this.T);
            }
            java.lang.String str24 = this.U;
            if (str24 != null && zArr[40]) {
                g18 += b36.f.j(40, str24);
            }
            bw5.y3 y3Var2 = this.V;
            if (y3Var2 != null && zArr[41]) {
                g18 += b36.f.i(41, y3Var2.computeSize());
            }
            int g19 = g18 + b36.f.g(42, 8, this.W);
            bw5.a4 a4Var2 = this.X;
            if (a4Var2 != null && zArr[43]) {
                g19 += b36.f.i(43, a4Var2.computeSize());
            }
            bw5.zd zdVar2 = this.Y;
            if (zdVar2 != null && zArr[44]) {
                g19 += b36.f.i(44, zdVar2.computeSize());
            }
            int g27 = g19 + b36.f.g(45, 8, this.Z);
            bw5.yd ydVar2 = this.f34320p0;
            if (ydVar2 != null && zArr[46]) {
                g27 += b36.f.i(46, ydVar2.computeSize());
            }
            if (zArr[47]) {
                g27 += b36.f.f(47, this.f34330x0);
            }
            if (zArr[48]) {
                g27 += b36.f.f(48, this.f34333y0);
            }
            bw5.w3 w3Var2 = this.f34315l1;
            if (w3Var2 != null && zArr[49]) {
                g27 += b36.f.i(49, w3Var2.computeSize());
            }
            bw5.k2 k2Var2 = this.f34321p1;
            if (k2Var2 != null && zArr[50]) {
                g27 += b36.f.i(50, k2Var2.computeSize());
            }
            if (zArr[52]) {
                g27 += b36.f.f(52, this.f34331x1);
            }
            bw5.dg dgVar2 = this.f34334y1;
            if (dgVar2 != null && zArr[55]) {
                g27 += b36.f.i(55, dgVar2.computeSize());
            }
            bw5.ud udVar2 = this.f34336z1;
            return (udVar2 == null || !zArr[57]) ? g27 : g27 + b36.f.i(57, udVar2.computeSize());
        }
        if (i17 == 2) {
            this.f34317n.clear();
            this.Q.clear();
            this.W.clear();
            this.Z.clear();
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
        if (intValue == 52) {
            this.f34331x1 = aVar2.h(intValue);
            zArr[52] = true;
            return 0;
        }
        if (intValue == 55) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.dg dgVar3 = new bw5.dg();
                if (bArr != null && bArr.length > 0) {
                    dgVar3.parseFrom(bArr);
                }
                this.f34334y1 = dgVar3;
            }
            zArr[55] = true;
            return 0;
        }
        if (intValue == 57) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.ud udVar3 = new bw5.ud();
                if (bArr2 != null && bArr2.length > 0) {
                    udVar3.parseFrom(bArr2);
                }
                this.f34336z1 = udVar3;
            }
            zArr[57] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f34309d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34310e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34311f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34312g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34313h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34314i = aVar2.h(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34316m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.vd vdVar = new bw5.vd();
                    if (bArr3 != null && bArr3.length > 0) {
                        vdVar.parseFrom(bArr3);
                    }
                    this.f34317n.add(vdVar);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f34318o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f34319p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f34322q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f34323r = aVar2.h(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f34324s = aVar2.h(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f34325t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f34326u = aVar2.h(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f34327v = aVar2.d(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f34328w = aVar2.h(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f34329x = aVar2.h(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f34332y = aVar2.h(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f34335z = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.k(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.h(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.h(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.h(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.h(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.ee eeVar3 = new bw5.ee();
                    if (bArr4 != null && bArr4.length > 0) {
                        eeVar3.parseFrom(bArr4);
                    }
                    this.G = eeVar3;
                }
                zArr[27] = true;
                return 0;
            case 28:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.ae aeVar5 = new bw5.ae();
                    if (bArr5 != null && bArr5.length > 0) {
                        aeVar5.parseFrom(bArr5);
                    }
                    this.H = aeVar5;
                }
                zArr[28] = true;
                return 0;
            case 29:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.ae aeVar6 = new bw5.ae();
                    if (bArr6 != null && bArr6.length > 0) {
                        aeVar6.parseFrom(bArr6);
                    }
                    this.I = aeVar6;
                }
                zArr[29] = true;
                return 0;
            case 30:
                this.f34308J = aVar2.h(intValue);
                zArr[30] = true;
                return 0;
            case 31:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.s3 s3Var3 = new bw5.s3();
                    if (bArr7 != null && bArr7.length > 0) {
                        s3Var3.parseFrom(bArr7);
                    }
                    this.K = s3Var3;
                }
                zArr[31] = true;
                return 0;
            case 32:
                this.L = aVar2.k(intValue);
                zArr[32] = true;
                return 0;
            case 33:
                this.M = aVar2.h(intValue);
                zArr[33] = true;
                return 0;
            case 34:
                this.N = aVar2.h(intValue);
                zArr[34] = true;
                return 0;
            case 35:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.ih ihVar3 = new bw5.ih();
                    if (bArr8 != null && bArr8.length > 0) {
                        ihVar3.parseFrom(bArr8);
                    }
                    this.P = ihVar3;
                }
                zArr[35] = true;
                return 0;
            case 36:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.wd wdVar = new bw5.wd();
                    if (bArr9 != null && bArr9.length > 0) {
                        wdVar.parseFrom(bArr9);
                    }
                    this.Q.add(wdVar);
                }
                zArr[36] = true;
                return 0;
            case 37:
                this.R = aVar2.k(intValue);
                zArr[37] = true;
                return 0;
            case 38:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.td tdVar3 = new bw5.td();
                    if (bArr10 != null && bArr10.length > 0) {
                        tdVar3.parseFrom(bArr10);
                    }
                    this.S = tdVar3;
                }
                zArr[38] = true;
                return 0;
            case 39:
                this.T = aVar2.h(intValue);
                zArr[39] = true;
                return 0;
            case 40:
                this.U = aVar2.k(intValue);
                zArr[40] = true;
                return 0;
            case 41:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.y3 y3Var3 = new bw5.y3();
                    if (bArr11 != null && bArr11.length > 0) {
                        y3Var3.parseFrom(bArr11);
                    }
                    this.V = y3Var3;
                }
                zArr[41] = true;
                return 0;
            case 42:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.xd xdVar = new bw5.xd();
                    if (bArr12 != null && bArr12.length > 0) {
                        xdVar.parseFrom(bArr12);
                    }
                    this.W.add(xdVar);
                }
                zArr[42] = true;
                return 0;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.a4 a4Var3 = new bw5.a4();
                    if (bArr13 != null && bArr13.length > 0) {
                        a4Var3.parseFrom(bArr13);
                    }
                    this.X = a4Var3;
                }
                zArr[43] = true;
                return 0;
            case 44:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    bw5.zd zdVar3 = new bw5.zd();
                    if (bArr14 != null && bArr14.length > 0) {
                        zdVar3.parseFrom(bArr14);
                    }
                    this.Y = zdVar3;
                }
                zArr[44] = true;
                return 0;
            case 45:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr15 = (byte[]) j59.get(i67);
                    bw5.eh ehVar = new bw5.eh();
                    if (bArr15 != null && bArr15.length > 0) {
                        ehVar.parseFrom(bArr15);
                    }
                    this.Z.add(ehVar);
                }
                zArr[45] = true;
                return 0;
            case 46:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr16 = (byte[]) j66.get(i68);
                    bw5.yd ydVar3 = new bw5.yd();
                    if (bArr16 != null && bArr16.length > 0) {
                        ydVar3.parseFrom(bArr16);
                    }
                    this.f34320p0 = ydVar3;
                }
                zArr[46] = true;
                return 0;
            case 47:
                this.f34330x0 = aVar2.h(intValue);
                zArr[47] = true;
                return 0;
            case 48:
                this.f34333y0 = aVar2.h(intValue);
                zArr[48] = true;
                return 0;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                java.util.LinkedList j67 = aVar2.j(intValue);
                int size17 = j67.size();
                for (int i69 = 0; i69 < size17; i69++) {
                    byte[] bArr17 = (byte[]) j67.get(i69);
                    bw5.w3 w3Var3 = new bw5.w3();
                    if (bArr17 != null && bArr17.length > 0) {
                        w3Var3.parseFrom(bArr17);
                    }
                    this.f34315l1 = w3Var3;
                }
                zArr[49] = true;
                return 0;
            case 50:
                java.util.LinkedList j68 = aVar2.j(intValue);
                int size18 = j68.size();
                for (int i76 = 0; i76 < size18; i76++) {
                    byte[] bArr18 = (byte[]) j68.get(i76);
                    bw5.k2 k2Var3 = new bw5.k2();
                    if (bArr18 != null && bArr18.length > 0) {
                        k2Var3.parseFrom(bArr18);
                    }
                    this.f34321p1 = k2Var3;
                }
                zArr[50] = true;
                return 0;
            default:
                return -1;
        }
    }
}
