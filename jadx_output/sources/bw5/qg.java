package bw5;

/* loaded from: classes2.dex */
public class qg extends r45.js5 {
    public bw5.zn0 A;
    public bw5.co0 B;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32096e;

    /* renamed from: f, reason: collision with root package name */
    public int f32097f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32098g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.mu f32099h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f32100i;

    /* renamed from: o, reason: collision with root package name */
    public bw5.yn f32103o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.mw f32104p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.pc f32105q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f32106r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.nw f32107s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.z10 f32108t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f32109u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32110v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.jv f32111w;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32113y;

    /* renamed from: z, reason: collision with root package name */
    public int f32114z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f32095d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f32101m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f32102n = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f32112x = new java.util.LinkedList();
    public final boolean[] C = new boolean[51];

    static {
        new bw5.qg();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qg parseFrom(byte[] bArr) {
        return (bw5.qg) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qg)) {
            return false;
        }
        bw5.qg qgVar = (bw5.qg) fVar;
        return n51.f.a(this.BaseResponse, qgVar.BaseResponse) && n51.f.a(this.f32095d, qgVar.f32095d) && n51.f.a(this.f32096e, qgVar.f32096e) && n51.f.a(java.lang.Integer.valueOf(this.f32097f), java.lang.Integer.valueOf(qgVar.f32097f)) && n51.f.a(this.f32098g, qgVar.f32098g) && n51.f.a(this.f32099h, qgVar.f32099h) && n51.f.a(this.f32100i, qgVar.f32100i) && n51.f.a(this.f32101m, qgVar.f32101m) && n51.f.a(this.f32102n, qgVar.f32102n) && n51.f.a(this.f32103o, qgVar.f32103o) && n51.f.a(this.f32104p, qgVar.f32104p) && n51.f.a(this.f32105q, qgVar.f32105q) && n51.f.a(this.f32106r, qgVar.f32106r) && n51.f.a(this.f32107s, qgVar.f32107s) && n51.f.a(this.f32108t, qgVar.f32108t) && n51.f.a(this.f32109u, qgVar.f32109u) && n51.f.a(this.f32110v, qgVar.f32110v) && n51.f.a(this.f32111w, qgVar.f32111w) && n51.f.a(this.f32112x, qgVar.f32112x) && n51.f.a(this.f32113y, qgVar.f32113y) && n51.f.a(java.lang.Integer.valueOf(this.f32114z), java.lang.Integer.valueOf(qgVar.f32114z)) && n51.f.a(this.A, qgVar.A) && n51.f.a(this.B, qgVar.B);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.C[1] ? this.BaseResponse : new r45.ie();
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qg();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.C;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, this.f32095d);
            com.tencent.mm.protobuf.g gVar = this.f32096e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f32097f);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f32098g;
            if (gVar2 != null && zArr[5]) {
                fVar.b(5, gVar2);
            }
            bw5.mu muVar = this.f32099h;
            if (muVar != null && zArr[6]) {
                fVar.i(6, muVar.computeSize());
                this.f32099h.writeFields(fVar);
            }
            java.lang.String str = this.f32100i;
            if (str != null && zArr[7]) {
                fVar.j(7, str);
            }
            fVar.g(8, 8, this.f32101m);
            fVar.g(9, 8, this.f32102n);
            bw5.yn ynVar = this.f32103o;
            if (ynVar != null && zArr[10]) {
                fVar.i(10, ynVar.computeSize());
                this.f32103o.writeFields(fVar);
            }
            bw5.mw mwVar = this.f32104p;
            if (mwVar != null && zArr[11]) {
                fVar.i(11, mwVar.computeSize());
                this.f32104p.writeFields(fVar);
            }
            bw5.pc pcVar = this.f32105q;
            if (pcVar != null && zArr[12]) {
                fVar.i(12, pcVar.computeSize());
                this.f32105q.writeFields(fVar);
            }
            java.lang.String str2 = this.f32106r;
            if (str2 != null && zArr[13]) {
                fVar.j(13, str2);
            }
            bw5.nw nwVar = this.f32107s;
            if (nwVar != null && zArr[14]) {
                fVar.i(14, nwVar.computeSize());
                this.f32107s.writeFields(fVar);
            }
            bw5.z10 z10Var = this.f32108t;
            if (z10Var != null && zArr[15]) {
                fVar.i(15, z10Var.computeSize());
                this.f32108t.writeFields(fVar);
            }
            java.lang.String str3 = this.f32109u;
            if (str3 != null && zArr[16]) {
                fVar.j(16, str3);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f32110v;
            if (gVar3 != null && zArr[17]) {
                fVar.b(17, gVar3);
            }
            bw5.jv jvVar = this.f32111w;
            if (jvVar != null && zArr[18]) {
                fVar.i(18, jvVar.computeSize());
                this.f32111w.writeFields(fVar);
            }
            fVar.g(19, 8, this.f32112x);
            com.tencent.mm.protobuf.g gVar4 = this.f32113y;
            if (gVar4 != null && zArr[20]) {
                fVar.b(20, gVar4);
            }
            if (zArr[21]) {
                fVar.e(21, this.f32114z);
            }
            bw5.zn0 zn0Var = this.A;
            if (zn0Var != null && zArr[49]) {
                fVar.i(49, zn0Var.computeSize());
                this.A.writeFields(fVar);
            }
            bw5.co0 co0Var = this.B;
            if (co0Var != null && zArr[50]) {
                fVar.i(50, co0Var.computeSize());
                this.B.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            if (ieVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, ieVar2.computeSize()) + 0;
            }
            int g17 = i18 + b36.f.g(2, 8, this.f32095d);
            com.tencent.mm.protobuf.g gVar5 = this.f32096e;
            if (gVar5 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar5);
            }
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f32097f);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f32098g;
            if (gVar6 != null && zArr[5]) {
                g17 += b36.f.b(5, gVar6);
            }
            bw5.mu muVar2 = this.f32099h;
            if (muVar2 != null && zArr[6]) {
                g17 += b36.f.i(6, muVar2.computeSize());
            }
            java.lang.String str4 = this.f32100i;
            if (str4 != null && zArr[7]) {
                g17 += b36.f.j(7, str4);
            }
            int g18 = g17 + b36.f.g(8, 8, this.f32101m) + b36.f.g(9, 8, this.f32102n);
            bw5.yn ynVar2 = this.f32103o;
            if (ynVar2 != null && zArr[10]) {
                g18 += b36.f.i(10, ynVar2.computeSize());
            }
            bw5.mw mwVar2 = this.f32104p;
            if (mwVar2 != null && zArr[11]) {
                g18 += b36.f.i(11, mwVar2.computeSize());
            }
            bw5.pc pcVar2 = this.f32105q;
            if (pcVar2 != null && zArr[12]) {
                g18 += b36.f.i(12, pcVar2.computeSize());
            }
            java.lang.String str5 = this.f32106r;
            if (str5 != null && zArr[13]) {
                g18 += b36.f.j(13, str5);
            }
            bw5.nw nwVar2 = this.f32107s;
            if (nwVar2 != null && zArr[14]) {
                g18 += b36.f.i(14, nwVar2.computeSize());
            }
            bw5.z10 z10Var2 = this.f32108t;
            if (z10Var2 != null && zArr[15]) {
                g18 += b36.f.i(15, z10Var2.computeSize());
            }
            java.lang.String str6 = this.f32109u;
            if (str6 != null && zArr[16]) {
                g18 += b36.f.j(16, str6);
            }
            com.tencent.mm.protobuf.g gVar7 = this.f32110v;
            if (gVar7 != null && zArr[17]) {
                g18 += b36.f.b(17, gVar7);
            }
            bw5.jv jvVar2 = this.f32111w;
            if (jvVar2 != null && zArr[18]) {
                g18 += b36.f.i(18, jvVar2.computeSize());
            }
            int g19 = g18 + b36.f.g(19, 8, this.f32112x);
            com.tencent.mm.protobuf.g gVar8 = this.f32113y;
            if (gVar8 != null && zArr[20]) {
                g19 += b36.f.b(20, gVar8);
            }
            if (zArr[21]) {
                g19 += b36.f.e(21, this.f32114z);
            }
            bw5.zn0 zn0Var2 = this.A;
            if (zn0Var2 != null && zArr[49]) {
                g19 += b36.f.i(49, zn0Var2.computeSize());
            }
            bw5.co0 co0Var2 = this.B;
            return (co0Var2 == null || !zArr[50]) ? g19 : g19 + b36.f.i(50, co0Var2.computeSize());
        }
        if (i17 == 2) {
            this.f32095d.clear();
            this.f32101m.clear();
            this.f32102n.clear();
            this.f32112x.clear();
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
        if (intValue == 49) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.zn0 zn0Var3 = new bw5.zn0();
                if (bArr != null && bArr.length > 0) {
                    zn0Var3.parseFrom(bArr);
                }
                this.A = zn0Var3;
            }
            zArr[49] = true;
            return 0;
        }
        if (intValue == 50) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.co0 co0Var3 = new bw5.co0();
                if (bArr2 != null && bArr2.length > 0) {
                    co0Var3.parseFrom(bArr2);
                }
                this.B = co0Var3;
            }
            zArr[50] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr3 != null && bArr3.length > 0) {
                        ieVar3.parseFrom(bArr3);
                    }
                    this.BaseResponse = ieVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.yr yrVar = new bw5.yr();
                    if (bArr4 != null && bArr4.length > 0) {
                        yrVar.parseFrom(bArr4);
                    }
                    this.f32095d.add(yrVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f32096e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32097f = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32098g = aVar2.d(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.mu muVar3 = new bw5.mu();
                    if (bArr5 != null && bArr5.length > 0) {
                        muVar3.parseFrom(bArr5);
                    }
                    this.f32099h = muVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f32100i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.hw hwVar = new bw5.hw();
                    if (bArr6 != null && bArr6.length > 0) {
                        hwVar.parseFrom(bArr6);
                    }
                    this.f32101m.add(hwVar);
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.yw ywVar = new bw5.yw();
                    if (bArr7 != null && bArr7.length > 0) {
                        ywVar.parseFrom(bArr7);
                    }
                    this.f32102n.add(ywVar);
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.yn ynVar3 = new bw5.yn();
                    if (bArr8 != null && bArr8.length > 0) {
                        ynVar3.parseFrom(bArr8);
                    }
                    this.f32103o = ynVar3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.mw mwVar3 = new bw5.mw();
                    if (bArr9 != null && bArr9.length > 0) {
                        mwVar3.parseFrom(bArr9);
                    }
                    this.f32104p = mwVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.pc pcVar3 = new bw5.pc();
                    if (bArr10 != null && bArr10.length > 0) {
                        pcVar3.parseFrom(bArr10);
                    }
                    this.f32105q = pcVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f32106r = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.nw nwVar3 = new bw5.nw();
                    if (bArr11 != null && bArr11.length > 0) {
                        nwVar3.parseFrom(bArr11);
                    }
                    this.f32107s = nwVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.z10 z10Var3 = new bw5.z10();
                    if (bArr12 != null && bArr12.length > 0) {
                        z10Var3.parseFrom(bArr12);
                    }
                    this.f32108t = z10Var3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                this.f32109u = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f32110v = aVar2.d(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.jv jvVar3 = new bw5.jv();
                    if (bArr13 != null && bArr13.length > 0) {
                        jvVar3.parseFrom(bArr13);
                    }
                    this.f32111w = jvVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    bw5.yr yrVar2 = new bw5.yr();
                    if (bArr14 != null && bArr14.length > 0) {
                        yrVar2.parseFrom(bArr14);
                    }
                    this.f32112x.add(yrVar2);
                }
                zArr[19] = true;
                return 0;
            case 20:
                this.f32113y = aVar2.d(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.f32114z = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        this.C[1] = true;
        return this;
    }
}
