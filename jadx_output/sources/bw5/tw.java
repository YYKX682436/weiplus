package bw5;

/* loaded from: classes2.dex */
public class tw extends r45.js5 {
    public com.tencent.mm.protobuf.g A;
    public java.lang.String B;
    public int C;
    public bw5.vw D;
    public bw5.jv E;
    public bw5.pw F;
    public bw5.zn0 G;
    public bw5.co0 H;
    public bw5.do0 I;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f33638e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33639f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33640g;

    /* renamed from: h, reason: collision with root package name */
    public int f33641h;

    /* renamed from: i, reason: collision with root package name */
    public int f33642i;

    /* renamed from: m, reason: collision with root package name */
    public int f33643m;

    /* renamed from: n, reason: collision with root package name */
    public int f33644n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.mu f33645o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.ie f33646p;

    /* renamed from: q, reason: collision with root package name */
    public int f33647q;

    /* renamed from: s, reason: collision with root package name */
    public bw5.ez f33649s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.ad f33650t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f33651u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.nv f33652v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.qw f33653w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.mw f33654x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f33655y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.yn f33656z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f33637d = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f33648r = new java.util.LinkedList();

    /* renamed from: J, reason: collision with root package name */
    public final boolean[] f33636J = new boolean[34];

    static {
        new bw5.tw();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tw parseFrom(byte[] bArr) {
        return (bw5.tw) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tw)) {
            return false;
        }
        bw5.tw twVar = (bw5.tw) fVar;
        return n51.f.a(this.BaseResponse, twVar.BaseResponse) && n51.f.a(this.f33637d, twVar.f33637d) && n51.f.a(this.f33638e, twVar.f33638e) && n51.f.a(this.f33639f, twVar.f33639f) && n51.f.a(this.f33640g, twVar.f33640g) && n51.f.a(java.lang.Integer.valueOf(this.f33641h), java.lang.Integer.valueOf(twVar.f33641h)) && n51.f.a(java.lang.Integer.valueOf(this.f33642i), java.lang.Integer.valueOf(twVar.f33642i)) && n51.f.a(java.lang.Integer.valueOf(this.f33643m), java.lang.Integer.valueOf(twVar.f33643m)) && n51.f.a(java.lang.Integer.valueOf(this.f33644n), java.lang.Integer.valueOf(twVar.f33644n)) && n51.f.a(this.f33645o, twVar.f33645o) && n51.f.a(this.f33646p, twVar.f33646p) && n51.f.a(java.lang.Integer.valueOf(this.f33647q), java.lang.Integer.valueOf(twVar.f33647q)) && n51.f.a(this.f33648r, twVar.f33648r) && n51.f.a(this.f33649s, twVar.f33649s) && n51.f.a(this.f33650t, twVar.f33650t) && n51.f.a(this.f33651u, twVar.f33651u) && n51.f.a(this.f33652v, twVar.f33652v) && n51.f.a(this.f33653w, twVar.f33653w) && n51.f.a(this.f33654x, twVar.f33654x) && n51.f.a(this.f33655y, twVar.f33655y) && n51.f.a(this.f33656z, twVar.f33656z) && n51.f.a(this.A, twVar.A) && n51.f.a(this.B, twVar.B) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(twVar.C)) && n51.f.a(this.D, twVar.D) && n51.f.a(this.E, twVar.E) && n51.f.a(this.F, twVar.F) && n51.f.a(this.G, twVar.G) && n51.f.a(this.H, twVar.H) && n51.f.a(this.I, twVar.I);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.f33636J[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tw();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33636J;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, this.f33637d);
            com.tencent.mm.protobuf.g gVar = this.f33638e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            java.lang.String str = this.f33639f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f33640g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f33641h);
            }
            if (zArr[7]) {
                fVar.e(7, this.f33642i);
            }
            if (zArr[8]) {
                fVar.e(8, this.f33643m);
            }
            if (zArr[9]) {
                fVar.e(9, this.f33644n);
            }
            bw5.mu muVar = this.f33645o;
            if (muVar != null && zArr[10]) {
                fVar.i(10, muVar.computeSize());
                this.f33645o.writeFields(fVar);
            }
            bw5.ie ieVar2 = this.f33646p;
            if (ieVar2 != null && zArr[11]) {
                fVar.i(11, ieVar2.computeSize());
                this.f33646p.writeFields(fVar);
            }
            if (zArr[12]) {
                fVar.e(12, this.f33647q);
            }
            fVar.g(13, 8, this.f33648r);
            bw5.ez ezVar = this.f33649s;
            if (ezVar != null && zArr[14]) {
                fVar.i(14, ezVar.computeSize());
                this.f33649s.writeFields(fVar);
            }
            bw5.ad adVar = this.f33650t;
            if (adVar != null && zArr[15]) {
                fVar.i(15, adVar.computeSize());
                this.f33650t.writeFields(fVar);
            }
            java.lang.String str3 = this.f33651u;
            if (str3 != null && zArr[16]) {
                fVar.j(16, str3);
            }
            bw5.nv nvVar = this.f33652v;
            if (nvVar != null && zArr[17]) {
                fVar.i(17, nvVar.computeSize());
                this.f33652v.writeFields(fVar);
            }
            bw5.qw qwVar = this.f33653w;
            if (qwVar != null && zArr[18]) {
                fVar.i(18, qwVar.computeSize());
                this.f33653w.writeFields(fVar);
            }
            bw5.mw mwVar = this.f33654x;
            if (mwVar != null && zArr[19]) {
                fVar.i(19, mwVar.computeSize());
                this.f33654x.writeFields(fVar);
            }
            java.lang.String str4 = this.f33655y;
            if (str4 != null && zArr[20]) {
                fVar.j(20, str4);
            }
            bw5.yn ynVar = this.f33656z;
            if (ynVar != null && zArr[21]) {
                fVar.i(21, ynVar.computeSize());
                this.f33656z.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.A;
            if (gVar2 != null && zArr[22]) {
                fVar.b(22, gVar2);
            }
            java.lang.String str5 = this.B;
            if (str5 != null && zArr[23]) {
                fVar.j(23, str5);
            }
            if (zArr[24]) {
                fVar.e(24, this.C);
            }
            bw5.vw vwVar = this.D;
            if (vwVar != null && zArr[25]) {
                fVar.i(25, vwVar.computeSize());
                this.D.writeFields(fVar);
            }
            bw5.jv jvVar = this.E;
            if (jvVar != null && zArr[28]) {
                fVar.i(28, jvVar.computeSize());
                this.E.writeFields(fVar);
            }
            bw5.pw pwVar = this.F;
            if (pwVar != null && zArr[29]) {
                fVar.i(29, pwVar.computeSize());
                this.F.writeFields(fVar);
            }
            bw5.zn0 zn0Var = this.G;
            if (zn0Var != null && zArr[30]) {
                fVar.i(30, zn0Var.computeSize());
                this.G.writeFields(fVar);
            }
            bw5.co0 co0Var = this.H;
            if (co0Var != null && zArr[31]) {
                fVar.i(31, co0Var.computeSize());
                this.H.writeFields(fVar);
            }
            bw5.do0 do0Var = this.I;
            if (do0Var != null && zArr[33]) {
                fVar.i(33, do0Var.computeSize());
                this.I.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar3 = this.BaseResponse;
            if (ieVar3 != null && zArr[1]) {
                i18 = b36.f.i(1, ieVar3.computeSize()) + 0;
            }
            int g17 = i18 + b36.f.g(2, 8, this.f33637d);
            com.tencent.mm.protobuf.g gVar3 = this.f33638e;
            if (gVar3 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar3);
            }
            java.lang.String str6 = this.f33639f;
            if (str6 != null && zArr[4]) {
                g17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f33640g;
            if (str7 != null && zArr[5]) {
                g17 += b36.f.j(5, str7);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f33641h);
            }
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f33642i);
            }
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f33643m);
            }
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f33644n);
            }
            bw5.mu muVar2 = this.f33645o;
            if (muVar2 != null && zArr[10]) {
                g17 += b36.f.i(10, muVar2.computeSize());
            }
            bw5.ie ieVar4 = this.f33646p;
            if (ieVar4 != null && zArr[11]) {
                g17 += b36.f.i(11, ieVar4.computeSize());
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f33647q);
            }
            int g18 = g17 + b36.f.g(13, 8, this.f33648r);
            bw5.ez ezVar2 = this.f33649s;
            if (ezVar2 != null && zArr[14]) {
                g18 += b36.f.i(14, ezVar2.computeSize());
            }
            bw5.ad adVar2 = this.f33650t;
            if (adVar2 != null && zArr[15]) {
                g18 += b36.f.i(15, adVar2.computeSize());
            }
            java.lang.String str8 = this.f33651u;
            if (str8 != null && zArr[16]) {
                g18 += b36.f.j(16, str8);
            }
            bw5.nv nvVar2 = this.f33652v;
            if (nvVar2 != null && zArr[17]) {
                g18 += b36.f.i(17, nvVar2.computeSize());
            }
            bw5.qw qwVar2 = this.f33653w;
            if (qwVar2 != null && zArr[18]) {
                g18 += b36.f.i(18, qwVar2.computeSize());
            }
            bw5.mw mwVar2 = this.f33654x;
            if (mwVar2 != null && zArr[19]) {
                g18 += b36.f.i(19, mwVar2.computeSize());
            }
            java.lang.String str9 = this.f33655y;
            if (str9 != null && zArr[20]) {
                g18 += b36.f.j(20, str9);
            }
            bw5.yn ynVar2 = this.f33656z;
            if (ynVar2 != null && zArr[21]) {
                g18 += b36.f.i(21, ynVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar4 = this.A;
            if (gVar4 != null && zArr[22]) {
                g18 += b36.f.b(22, gVar4);
            }
            java.lang.String str10 = this.B;
            if (str10 != null && zArr[23]) {
                g18 += b36.f.j(23, str10);
            }
            if (zArr[24]) {
                g18 += b36.f.e(24, this.C);
            }
            bw5.vw vwVar2 = this.D;
            if (vwVar2 != null && zArr[25]) {
                g18 += b36.f.i(25, vwVar2.computeSize());
            }
            bw5.jv jvVar2 = this.E;
            if (jvVar2 != null && zArr[28]) {
                g18 += b36.f.i(28, jvVar2.computeSize());
            }
            bw5.pw pwVar2 = this.F;
            if (pwVar2 != null && zArr[29]) {
                g18 += b36.f.i(29, pwVar2.computeSize());
            }
            bw5.zn0 zn0Var2 = this.G;
            if (zn0Var2 != null && zArr[30]) {
                g18 += b36.f.i(30, zn0Var2.computeSize());
            }
            bw5.co0 co0Var2 = this.H;
            if (co0Var2 != null && zArr[31]) {
                g18 += b36.f.i(31, co0Var2.computeSize());
            }
            bw5.do0 do0Var2 = this.I;
            return (do0Var2 == null || !zArr[33]) ? g18 : g18 + b36.f.i(33, do0Var2.computeSize());
        }
        if (i17 == 2) {
            this.f33637d.clear();
            this.f33648r.clear();
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
                    r45.ie ieVar5 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar5.parseFrom(bArr);
                    }
                    this.BaseResponse = ieVar5;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.yr yrVar = new bw5.yr();
                    if (bArr2 != null && bArr2.length > 0) {
                        yrVar.parseFrom(bArr2);
                    }
                    this.f33637d.add(yrVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f33638e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33639f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33640g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33641h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33642i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33643m = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33644n = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.mu muVar3 = new bw5.mu();
                    if (bArr3 != null && bArr3.length > 0) {
                        muVar3.parseFrom(bArr3);
                    }
                    this.f33645o = muVar3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.ie ieVar6 = new bw5.ie();
                    if (bArr4 != null && bArr4.length > 0) {
                        ieVar6.parseFrom(bArr4);
                    }
                    this.f33646p = ieVar6;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f33647q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.yr yrVar2 = new bw5.yr();
                    if (bArr5 != null && bArr5.length > 0) {
                        yrVar2.parseFrom(bArr5);
                    }
                    this.f33648r.add(yrVar2);
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.ez ezVar3 = new bw5.ez();
                    if (bArr6 != null && bArr6.length > 0) {
                        ezVar3.parseFrom(bArr6);
                    }
                    this.f33649s = ezVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.ad adVar3 = new bw5.ad();
                    if (bArr7 != null && bArr7.length > 0) {
                        adVar3.parseFrom(bArr7);
                    }
                    this.f33650t = adVar3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                this.f33651u = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.nv nvVar3 = new bw5.nv();
                    if (bArr8 != null && bArr8.length > 0) {
                        nvVar3.parseFrom(bArr8);
                    }
                    this.f33652v = nvVar3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.qw qwVar3 = new bw5.qw();
                    if (bArr9 != null && bArr9.length > 0) {
                        qwVar3.parseFrom(bArr9);
                    }
                    this.f33653w = qwVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.mw mwVar3 = new bw5.mw();
                    if (bArr10 != null && bArr10.length > 0) {
                        mwVar3.parseFrom(bArr10);
                    }
                    this.f33654x = mwVar3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                this.f33655y = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.yn ynVar3 = new bw5.yn();
                    if (bArr11 != null && bArr11.length > 0) {
                        ynVar3.parseFrom(bArr11);
                    }
                    this.f33656z = ynVar3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                this.A = aVar2.d(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.B = aVar2.k(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.C = aVar2.g(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.vw vwVar3 = new bw5.vw();
                    if (bArr12 != null && bArr12.length > 0) {
                        vwVar3.parseFrom(bArr12);
                    }
                    this.D = vwVar3;
                }
                zArr[25] = true;
                return 0;
            case 26:
            case 27:
            case 32:
            default:
                return -1;
            case 28:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.jv jvVar3 = new bw5.jv();
                    if (bArr13 != null && bArr13.length > 0) {
                        jvVar3.parseFrom(bArr13);
                    }
                    this.E = jvVar3;
                }
                zArr[28] = true;
                return 0;
            case 29:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    bw5.pw pwVar3 = new bw5.pw();
                    if (bArr14 != null && bArr14.length > 0) {
                        pwVar3.parseFrom(bArr14);
                    }
                    this.F = pwVar3;
                }
                zArr[29] = true;
                return 0;
            case 30:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr15 = (byte[]) j59.get(i67);
                    bw5.zn0 zn0Var3 = new bw5.zn0();
                    if (bArr15 != null && bArr15.length > 0) {
                        zn0Var3.parseFrom(bArr15);
                    }
                    this.G = zn0Var3;
                }
                zArr[30] = true;
                return 0;
            case 31:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i68 = 0; i68 < size16; i68++) {
                    byte[] bArr16 = (byte[]) j66.get(i68);
                    bw5.co0 co0Var3 = new bw5.co0();
                    if (bArr16 != null && bArr16.length > 0) {
                        co0Var3.parseFrom(bArr16);
                    }
                    this.H = co0Var3;
                }
                zArr[31] = true;
                return 0;
            case 33:
                java.util.LinkedList j67 = aVar2.j(intValue);
                int size17 = j67.size();
                for (int i69 = 0; i69 < size17; i69++) {
                    byte[] bArr17 = (byte[]) j67.get(i69);
                    bw5.do0 do0Var3 = new bw5.do0();
                    if (bArr17 != null && bArr17.length > 0) {
                        do0Var3.parseFrom(bArr17);
                    }
                    this.I = do0Var3;
                }
                zArr[33] = true;
                return 0;
        }
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.f33636J[1] = true;
        return this;
    }
}
