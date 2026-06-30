package bw5;

/* loaded from: classes2.dex */
public class sw extends r45.mr5 {
    public bw5.pl A;
    public java.lang.String B;
    public int C;
    public bw5.gx D;
    public long E;
    public int G;
    public java.lang.String H;
    public bw5.rd I;

    /* renamed from: J, reason: collision with root package name */
    public bw5.uw f33151J;
    public bw5.il K;
    public int L;
    public bw5.rw M;
    public bw5.zw N;
    public bw5.bo0 R;
    public com.tencent.mm.protobuf.g S;
    public int T;
    public long U;
    public java.lang.String V;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f33152d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33153e;

    /* renamed from: f, reason: collision with root package name */
    public int f33154f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.sc f33155g;

    /* renamed from: h, reason: collision with root package name */
    public float f33156h;

    /* renamed from: i, reason: collision with root package name */
    public float f33157i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f33158m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.hd f33159n;

    /* renamed from: p, reason: collision with root package name */
    public int f33161p;

    /* renamed from: q, reason: collision with root package name */
    public int f33162q;

    /* renamed from: r, reason: collision with root package name */
    public long f33163r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f33164s;

    /* renamed from: u, reason: collision with root package name */
    public long f33166u;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f33168w;

    /* renamed from: x, reason: collision with root package name */
    public int f33169x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f33170y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f33171z;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f33160o = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f33165t = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f33167v = new java.util.LinkedList();
    public final java.util.LinkedList F = new java.util.LinkedList();
    public final java.util.LinkedList P = new java.util.LinkedList();
    public final java.util.LinkedList Q = new java.util.LinkedList();
    public final boolean[] W = new boolean[45];

    static {
        new bw5.sw();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sw parseFrom(byte[] bArr) {
        return (bw5.sw) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sw)) {
            return false;
        }
        bw5.sw swVar = (bw5.sw) fVar;
        return n51.f.a(this.BaseRequest, swVar.BaseRequest) && n51.f.a(this.f33152d, swVar.f33152d) && n51.f.a(this.f33153e, swVar.f33153e) && n51.f.a(java.lang.Integer.valueOf(this.f33154f), java.lang.Integer.valueOf(swVar.f33154f)) && n51.f.a(this.f33155g, swVar.f33155g) && n51.f.a(java.lang.Float.valueOf(this.f33156h), java.lang.Float.valueOf(swVar.f33156h)) && n51.f.a(java.lang.Float.valueOf(this.f33157i), java.lang.Float.valueOf(swVar.f33157i)) && n51.f.a(this.f33158m, swVar.f33158m) && n51.f.a(this.f33159n, swVar.f33159n) && n51.f.a(this.f33160o, swVar.f33160o) && n51.f.a(java.lang.Integer.valueOf(this.f33161p), java.lang.Integer.valueOf(swVar.f33161p)) && n51.f.a(java.lang.Integer.valueOf(this.f33162q), java.lang.Integer.valueOf(swVar.f33162q)) && n51.f.a(java.lang.Long.valueOf(this.f33163r), java.lang.Long.valueOf(swVar.f33163r)) && n51.f.a(this.f33164s, swVar.f33164s) && n51.f.a(this.f33165t, swVar.f33165t) && n51.f.a(java.lang.Long.valueOf(this.f33166u), java.lang.Long.valueOf(swVar.f33166u)) && n51.f.a(this.f33167v, swVar.f33167v) && n51.f.a(this.f33168w, swVar.f33168w) && n51.f.a(java.lang.Integer.valueOf(this.f33169x), java.lang.Integer.valueOf(swVar.f33169x)) && n51.f.a(this.f33170y, swVar.f33170y) && n51.f.a(this.f33171z, swVar.f33171z) && n51.f.a(this.A, swVar.A) && n51.f.a(this.B, swVar.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(swVar.C)) && n51.f.a(this.D, swVar.D) && n51.f.a(java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(swVar.E)) && n51.f.a(this.F, swVar.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(swVar.G)) && n51.f.a(this.H, swVar.H) && n51.f.a(this.I, swVar.I) && n51.f.a(this.f33151J, swVar.f33151J) && n51.f.a(this.K, swVar.K) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(swVar.L)) && n51.f.a(this.M, swVar.M) && n51.f.a(this.N, swVar.N) && n51.f.a(this.P, swVar.P) && n51.f.a(this.Q, swVar.Q) && n51.f.a(this.R, swVar.R) && n51.f.a(this.S, swVar.S) && n51.f.a(java.lang.Integer.valueOf(this.T), java.lang.Integer.valueOf(swVar.T)) && n51.f.a(java.lang.Long.valueOf(this.U), java.lang.Long.valueOf(swVar.U)) && n51.f.a(this.V, swVar.V);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.W[1] ? this.BaseRequest : new r45.he();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sw();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.W;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f33152d;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            java.lang.String str = this.f33153e;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.f(5, this.f33154f);
            }
            bw5.sc scVar = this.f33155g;
            if (scVar != null && zArr[6]) {
                fVar.i(6, scVar.computeSize());
                this.f33155g.writeFields(fVar);
            }
            if (zArr[7]) {
                fVar.d(7, this.f33156h);
            }
            if (zArr[8]) {
                fVar.d(8, this.f33157i);
            }
            java.lang.String str2 = this.f33158m;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            bw5.hd hdVar = this.f33159n;
            if (hdVar != null && zArr[10]) {
                fVar.i(10, hdVar.computeSize());
                this.f33159n.writeFields(fVar);
            }
            fVar.g(11, 8, this.f33160o);
            if (zArr[12]) {
                fVar.f(12, this.f33161p);
            }
            if (zArr[13]) {
                fVar.f(13, this.f33162q);
            }
            if (zArr[14]) {
                fVar.h(14, this.f33163r);
            }
            java.lang.String str3 = this.f33164s;
            if (str3 != null && zArr[15]) {
                fVar.j(15, str3);
            }
            fVar.g(16, 8, this.f33165t);
            if (zArr[17]) {
                fVar.h(17, this.f33166u);
            }
            fVar.g(18, 8, this.f33167v);
            com.tencent.mm.protobuf.g gVar2 = this.f33168w;
            if (gVar2 != null && zArr[19]) {
                fVar.b(19, gVar2);
            }
            if (zArr[20]) {
                fVar.f(20, this.f33169x);
            }
            java.lang.String str4 = this.f33170y;
            if (str4 != null && zArr[21]) {
                fVar.j(21, str4);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f33171z;
            if (gVar3 != null && zArr[22]) {
                fVar.b(22, gVar3);
            }
            bw5.pl plVar = this.A;
            if (plVar != null && zArr[23]) {
                fVar.i(23, plVar.computeSize());
                this.A.writeFields(fVar);
            }
            java.lang.String str5 = this.B;
            if (str5 != null && zArr[24]) {
                fVar.j(24, str5);
            }
            if (zArr[25]) {
                fVar.f(25, this.C);
            }
            bw5.gx gxVar = this.D;
            if (gxVar != null && zArr[26]) {
                fVar.i(26, gxVar.computeSize());
                this.D.writeFields(fVar);
            }
            if (zArr[27]) {
                fVar.h(27, this.E);
            }
            fVar.g(28, 8, this.F);
            if (zArr[29]) {
                fVar.f(29, this.G);
            }
            java.lang.String str6 = this.H;
            if (str6 != null && zArr[30]) {
                fVar.j(30, str6);
            }
            bw5.rd rdVar = this.I;
            if (rdVar != null && zArr[32]) {
                fVar.i(32, rdVar.computeSize());
                this.I.writeFields(fVar);
            }
            bw5.uw uwVar = this.f33151J;
            if (uwVar != null && zArr[33]) {
                fVar.i(33, uwVar.computeSize());
                this.f33151J.writeFields(fVar);
            }
            bw5.il ilVar = this.K;
            if (ilVar != null && zArr[34]) {
                fVar.i(34, ilVar.computeSize());
                this.K.writeFields(fVar);
            }
            if (zArr[35]) {
                fVar.f(35, this.L);
            }
            bw5.rw rwVar = this.M;
            if (rwVar != null && zArr[36]) {
                fVar.i(36, rwVar.computeSize());
                this.M.writeFields(fVar);
            }
            bw5.zw zwVar = this.N;
            if (zwVar != null && zArr[37]) {
                fVar.i(37, zwVar.computeSize());
                this.N.writeFields(fVar);
            }
            fVar.g(38, 8, this.P);
            fVar.g(39, 8, this.Q);
            bw5.bo0 bo0Var = this.R;
            if (bo0Var != null && zArr[40]) {
                fVar.i(40, bo0Var.computeSize());
                this.R.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar4 = this.S;
            if (gVar4 != null && zArr[41]) {
                fVar.b(41, gVar4);
            }
            if (zArr[42]) {
                fVar.f(42, this.T);
            }
            if (zArr[43]) {
                fVar.h(43, this.U);
            }
            java.lang.String str7 = this.V;
            if (str7 != null && zArr[44]) {
                fVar.j(44, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            if (heVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, heVar2.computeSize()) + 0;
            }
            com.tencent.mm.protobuf.g gVar5 = this.f33152d;
            if (gVar5 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar5);
            }
            java.lang.String str8 = this.f33153e;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            if (zArr[5]) {
                i18 += b36.f.f(5, this.f33154f);
            }
            bw5.sc scVar2 = this.f33155g;
            if (scVar2 != null && zArr[6]) {
                i18 += b36.f.i(6, scVar2.computeSize());
            }
            if (zArr[7]) {
                i18 += b36.f.d(7, this.f33156h);
            }
            if (zArr[8]) {
                i18 += b36.f.d(8, this.f33157i);
            }
            java.lang.String str9 = this.f33158m;
            if (str9 != null && zArr[9]) {
                i18 += b36.f.j(9, str9);
            }
            bw5.hd hdVar2 = this.f33159n;
            if (hdVar2 != null && zArr[10]) {
                i18 += b36.f.i(10, hdVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(11, 8, this.f33160o);
            if (zArr[12]) {
                g17 += b36.f.f(12, this.f33161p);
            }
            if (zArr[13]) {
                g17 += b36.f.f(13, this.f33162q);
            }
            if (zArr[14]) {
                g17 += b36.f.h(14, this.f33163r);
            }
            java.lang.String str10 = this.f33164s;
            if (str10 != null && zArr[15]) {
                g17 += b36.f.j(15, str10);
            }
            int g18 = g17 + b36.f.g(16, 8, this.f33165t);
            if (zArr[17]) {
                g18 += b36.f.h(17, this.f33166u);
            }
            int g19 = g18 + b36.f.g(18, 8, this.f33167v);
            com.tencent.mm.protobuf.g gVar6 = this.f33168w;
            if (gVar6 != null && zArr[19]) {
                g19 += b36.f.b(19, gVar6);
            }
            if (zArr[20]) {
                g19 += b36.f.f(20, this.f33169x);
            }
            java.lang.String str11 = this.f33170y;
            if (str11 != null && zArr[21]) {
                g19 += b36.f.j(21, str11);
            }
            com.tencent.mm.protobuf.g gVar7 = this.f33171z;
            if (gVar7 != null && zArr[22]) {
                g19 += b36.f.b(22, gVar7);
            }
            bw5.pl plVar2 = this.A;
            if (plVar2 != null && zArr[23]) {
                g19 += b36.f.i(23, plVar2.computeSize());
            }
            java.lang.String str12 = this.B;
            if (str12 != null && zArr[24]) {
                g19 += b36.f.j(24, str12);
            }
            if (zArr[25]) {
                g19 += b36.f.f(25, this.C);
            }
            bw5.gx gxVar2 = this.D;
            if (gxVar2 != null && zArr[26]) {
                g19 += b36.f.i(26, gxVar2.computeSize());
            }
            if (zArr[27]) {
                g19 += b36.f.h(27, this.E);
            }
            int g27 = g19 + b36.f.g(28, 8, this.F);
            if (zArr[29]) {
                g27 += b36.f.f(29, this.G);
            }
            java.lang.String str13 = this.H;
            if (str13 != null && zArr[30]) {
                g27 += b36.f.j(30, str13);
            }
            bw5.rd rdVar2 = this.I;
            if (rdVar2 != null && zArr[32]) {
                g27 += b36.f.i(32, rdVar2.computeSize());
            }
            bw5.uw uwVar2 = this.f33151J;
            if (uwVar2 != null && zArr[33]) {
                g27 += b36.f.i(33, uwVar2.computeSize());
            }
            bw5.il ilVar2 = this.K;
            if (ilVar2 != null && zArr[34]) {
                g27 += b36.f.i(34, ilVar2.computeSize());
            }
            if (zArr[35]) {
                g27 += b36.f.f(35, this.L);
            }
            bw5.rw rwVar2 = this.M;
            if (rwVar2 != null && zArr[36]) {
                g27 += b36.f.i(36, rwVar2.computeSize());
            }
            bw5.zw zwVar2 = this.N;
            if (zwVar2 != null && zArr[37]) {
                g27 += b36.f.i(37, zwVar2.computeSize());
            }
            int g28 = g27 + b36.f.g(38, 8, this.P) + b36.f.g(39, 8, this.Q);
            bw5.bo0 bo0Var2 = this.R;
            if (bo0Var2 != null && zArr[40]) {
                g28 += b36.f.i(40, bo0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar8 = this.S;
            if (gVar8 != null && zArr[41]) {
                g28 += b36.f.b(41, gVar8);
            }
            if (zArr[42]) {
                g28 += b36.f.f(42, this.T);
            }
            if (zArr[43]) {
                g28 += b36.f.h(43, this.U);
            }
            java.lang.String str14 = this.V;
            return (str14 == null || !zArr[44]) ? g28 : g28 + b36.f.j(44, str14);
        }
        if (i17 == 2) {
            this.f33160o.clear();
            this.f33165t.clear();
            this.f33167v.clear();
            this.F.clear();
            this.P.clear();
            this.Q.clear();
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
            case 31:
            default:
                return -1;
            case 3:
                this.f33152d = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33153e = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33154f = aVar2.h(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.sc scVar3 = new bw5.sc();
                    if (bArr2 != null && bArr2.length > 0) {
                        scVar3.parseFrom(bArr2);
                    }
                    this.f33155g = scVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f33156h = aVar2.f(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33157i = aVar2.f(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33158m = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.hd hdVar3 = new bw5.hd();
                    if (bArr3 != null && bArr3.length > 0) {
                        hdVar3.parseFrom(bArr3);
                    }
                    this.f33159n = hdVar3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.sc0 sc0Var = new bw5.sc0();
                    if (bArr4 != null && bArr4.length > 0) {
                        sc0Var.parseFrom(bArr4);
                    }
                    this.f33160o.add(sc0Var);
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f33161p = aVar2.h(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f33162q = aVar2.h(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f33163r = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f33164s = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.jl0 jl0Var = new bw5.jl0();
                    if (bArr5 != null && bArr5.length > 0) {
                        jl0Var.parseFrom(bArr5);
                    }
                    this.f33165t.add(jl0Var);
                }
                zArr[16] = true;
                return 0;
            case 17:
                this.f33166u = aVar2.i(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.uz uzVar = new bw5.uz();
                    if (bArr6 != null && bArr6.length > 0) {
                        uzVar.parseFrom(bArr6);
                    }
                    this.f33167v.add(uzVar);
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f33168w = aVar2.d(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f33169x = aVar2.h(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.f33170y = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.f33171z = aVar2.d(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.pl plVar3 = new bw5.pl();
                    if (bArr7 != null && bArr7.length > 0) {
                        plVar3.parseFrom(bArr7);
                    }
                    this.A = plVar3;
                }
                zArr[23] = true;
                return 0;
            case 24:
                this.B = aVar2.k(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.C = aVar2.h(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.gx gxVar3 = new bw5.gx();
                    if (bArr8 != null && bArr8.length > 0) {
                        gxVar3.parseFrom(bArr8);
                    }
                    this.D = gxVar3;
                }
                zArr[26] = true;
                return 0;
            case 27:
                this.E = aVar2.i(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.xw xwVar = new bw5.xw();
                    if (bArr9 != null && bArr9.length > 0) {
                        xwVar.parseFrom(bArr9);
                    }
                    this.F.add(xwVar);
                }
                zArr[28] = true;
                return 0;
            case 29:
                this.G = aVar2.h(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                this.H = aVar2.k(intValue);
                zArr[30] = true;
                return 0;
            case 32:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.rd rdVar3 = new bw5.rd();
                    if (bArr10 != null && bArr10.length > 0) {
                        rdVar3.parseFrom(bArr10);
                    }
                    this.I = rdVar3;
                }
                zArr[32] = true;
                return 0;
            case 33:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.uw uwVar3 = new bw5.uw();
                    if (bArr11 != null && bArr11.length > 0) {
                        uwVar3.parseFrom(bArr11);
                    }
                    this.f33151J = uwVar3;
                }
                zArr[33] = true;
                return 0;
            case 34:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.il ilVar3 = new bw5.il();
                    if (bArr12 != null && bArr12.length > 0) {
                        ilVar3.parseFrom(bArr12);
                    }
                    this.K = ilVar3;
                }
                zArr[34] = true;
                return 0;
            case 35:
                this.L = aVar2.h(intValue);
                zArr[35] = true;
                return 0;
            case 36:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.rw rwVar3 = new bw5.rw();
                    if (bArr13 != null && bArr13.length > 0) {
                        rwVar3.parseFrom(bArr13);
                    }
                    this.M = rwVar3;
                }
                zArr[36] = true;
                return 0;
            case 37:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    bw5.zw zwVar3 = new bw5.zw();
                    if (bArr14 != null && bArr14.length > 0) {
                        zwVar3.parseFrom(bArr14);
                    }
                    this.N = zwVar3;
                }
                zArr[37] = true;
                return 0;
            case 38:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr15 = (byte[]) j59.get(i67);
                    bw5.sc0 sc0Var2 = new bw5.sc0();
                    if (bArr15 != null && bArr15.length > 0) {
                        sc0Var2.parseFrom(bArr15);
                    }
                    this.P.add(sc0Var2);
                }
                zArr[38] = true;
                return 0;
            case 39:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr16 = (byte[]) j66.get(i68);
                    bw5.gw gwVar = new bw5.gw();
                    if (bArr16 != null && bArr16.length > 0) {
                        gwVar.parseFrom(bArr16);
                    }
                    this.Q.add(gwVar);
                }
                zArr[39] = true;
                return 0;
            case 40:
                java.util.LinkedList j67 = aVar2.j(intValue);
                int size17 = j67.size();
                for (int i69 = 0; i69 < size17; i69++) {
                    byte[] bArr17 = (byte[]) j67.get(i69);
                    bw5.bo0 bo0Var3 = new bw5.bo0();
                    if (bArr17 != null && bArr17.length > 0) {
                        bo0Var3.parseFrom(bArr17);
                    }
                    this.R = bo0Var3;
                }
                zArr[40] = true;
                return 0;
            case 41:
                this.S = aVar2.d(intValue);
                zArr[41] = true;
                return 0;
            case 42:
                this.T = aVar2.h(intValue);
                zArr[42] = true;
                return 0;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                this.U = aVar2.i(intValue);
                zArr[43] = true;
                return 0;
            case 44:
                this.V = aVar2.k(intValue);
                zArr[44] = true;
                return 0;
        }
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        this.W[1] = true;
        return this;
    }
}
