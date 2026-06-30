package bw5;

/* loaded from: classes2.dex */
public class g4 extends com.tencent.mm.protobuf.f {
    public bw5.mi0 A;
    public bw5.ip B;
    public bw5.uo0 C;
    public bw5.b5 D;
    public bw5.vv E;
    public bw5.vk0 F;
    public bw5.qv G;
    public bw5.f9 I;

    /* renamed from: J, reason: collision with root package name */
    public bw5.d7 f27655J;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27656d;

    /* renamed from: e, reason: collision with root package name */
    public int f27657e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27658f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27659g;

    /* renamed from: i, reason: collision with root package name */
    public int f27661i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f27662m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.oc0 f27663n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.tv f27664o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.vv f27665p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.r2 f27666q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.pv f27667r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.ro f27668s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.md0 f27669t;

    /* renamed from: u, reason: collision with root package name */
    public int f27670u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.vv f27671v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.sf0 f27672w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.uv f27673x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.ro0 f27674y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.vv f27675z;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f27660h = new java.util.LinkedList();
    public final java.util.LinkedList H = new java.util.LinkedList();
    public final boolean[] K = new boolean[38];

    static {
        new bw5.g4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.g4 parseFrom(byte[] bArr) {
        return (bw5.g4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g4)) {
            return false;
        }
        bw5.g4 g4Var = (bw5.g4) fVar;
        return n51.f.a(this.f27656d, g4Var.f27656d) && n51.f.a(java.lang.Integer.valueOf(this.f27657e), java.lang.Integer.valueOf(g4Var.f27657e)) && n51.f.a(this.f27658f, g4Var.f27658f) && n51.f.a(this.f27659g, g4Var.f27659g) && n51.f.a(this.f27660h, g4Var.f27660h) && n51.f.a(java.lang.Integer.valueOf(this.f27661i), java.lang.Integer.valueOf(g4Var.f27661i)) && n51.f.a(this.f27662m, g4Var.f27662m) && n51.f.a(this.f27663n, g4Var.f27663n) && n51.f.a(this.f27664o, g4Var.f27664o) && n51.f.a(this.f27665p, g4Var.f27665p) && n51.f.a(this.f27666q, g4Var.f27666q) && n51.f.a(this.f27667r, g4Var.f27667r) && n51.f.a(this.f27668s, g4Var.f27668s) && n51.f.a(this.f27669t, g4Var.f27669t) && n51.f.a(java.lang.Integer.valueOf(this.f27670u), java.lang.Integer.valueOf(g4Var.f27670u)) && n51.f.a(this.f27671v, g4Var.f27671v) && n51.f.a(this.f27672w, g4Var.f27672w) && n51.f.a(this.f27673x, g4Var.f27673x) && n51.f.a(this.f27674y, g4Var.f27674y) && n51.f.a(this.f27675z, g4Var.f27675z) && n51.f.a(this.A, g4Var.A) && n51.f.a(this.B, g4Var.B) && n51.f.a(this.C, g4Var.C) && n51.f.a(this.D, g4Var.D) && n51.f.a(this.E, g4Var.E) && n51.f.a(this.F, g4Var.F) && n51.f.a(this.G, g4Var.G) && n51.f.a(this.H, g4Var.H) && n51.f.a(this.I, g4Var.I) && n51.f.a(this.f27655J, g4Var.f27655J);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.g4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.K;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27656d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27657e);
            }
            java.lang.String str2 = this.f27658f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f27659g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            fVar.g(5, 8, this.f27660h);
            if (zArr[6]) {
                fVar.e(6, this.f27661i);
            }
            java.lang.String str4 = this.f27662m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            bw5.oc0 oc0Var = this.f27663n;
            if (oc0Var != null && zArr[8]) {
                fVar.i(8, oc0Var.computeSize());
                this.f27663n.writeFields(fVar);
            }
            bw5.tv tvVar = this.f27664o;
            if (tvVar != null && zArr[9]) {
                fVar.i(9, tvVar.computeSize());
                this.f27664o.writeFields(fVar);
            }
            bw5.vv vvVar = this.f27665p;
            if (vvVar != null && zArr[10]) {
                fVar.i(10, vvVar.computeSize());
                this.f27665p.writeFields(fVar);
            }
            bw5.r2 r2Var = this.f27666q;
            if (r2Var != null && zArr[11]) {
                fVar.i(11, r2Var.computeSize());
                this.f27666q.writeFields(fVar);
            }
            bw5.pv pvVar = this.f27667r;
            if (pvVar != null && zArr[12]) {
                fVar.i(12, pvVar.computeSize());
                this.f27667r.writeFields(fVar);
            }
            bw5.ro roVar = this.f27668s;
            if (roVar != null && zArr[13]) {
                fVar.i(13, roVar.computeSize());
                this.f27668s.writeFields(fVar);
            }
            bw5.md0 md0Var = this.f27669t;
            if (md0Var != null && zArr[14]) {
                fVar.i(14, md0Var.computeSize());
                this.f27669t.writeFields(fVar);
            }
            if (zArr[15]) {
                fVar.e(15, this.f27670u);
            }
            bw5.vv vvVar2 = this.f27671v;
            if (vvVar2 != null && zArr[16]) {
                fVar.i(16, vvVar2.computeSize());
                this.f27671v.writeFields(fVar);
            }
            bw5.sf0 sf0Var = this.f27672w;
            if (sf0Var != null && zArr[17]) {
                fVar.i(17, sf0Var.computeSize());
                this.f27672w.writeFields(fVar);
            }
            bw5.uv uvVar = this.f27673x;
            if (uvVar != null && zArr[18]) {
                fVar.i(18, uvVar.computeSize());
                this.f27673x.writeFields(fVar);
            }
            bw5.ro0 ro0Var = this.f27674y;
            if (ro0Var != null && zArr[19]) {
                fVar.i(19, ro0Var.computeSize());
                this.f27674y.writeFields(fVar);
            }
            bw5.vv vvVar3 = this.f27675z;
            if (vvVar3 != null && zArr[20]) {
                fVar.i(20, vvVar3.computeSize());
                this.f27675z.writeFields(fVar);
            }
            bw5.mi0 mi0Var = this.A;
            if (mi0Var != null && zArr[21]) {
                fVar.i(21, mi0Var.computeSize());
                this.A.writeFields(fVar);
            }
            bw5.ip ipVar = this.B;
            if (ipVar != null && zArr[22]) {
                fVar.i(22, ipVar.computeSize());
                this.B.writeFields(fVar);
            }
            bw5.uo0 uo0Var = this.C;
            if (uo0Var != null && zArr[30]) {
                fVar.i(30, uo0Var.computeSize());
                this.C.writeFields(fVar);
            }
            bw5.b5 b5Var = this.D;
            if (b5Var != null && zArr[31]) {
                fVar.i(31, b5Var.computeSize());
                this.D.writeFields(fVar);
            }
            bw5.vv vvVar4 = this.E;
            if (vvVar4 != null && zArr[32]) {
                fVar.i(32, vvVar4.computeSize());
                this.E.writeFields(fVar);
            }
            bw5.vk0 vk0Var = this.F;
            if (vk0Var != null && zArr[33]) {
                fVar.i(33, vk0Var.computeSize());
                this.F.writeFields(fVar);
            }
            bw5.qv qvVar = this.G;
            if (qvVar != null && zArr[34]) {
                fVar.i(34, qvVar.computeSize());
                this.G.writeFields(fVar);
            }
            fVar.g(35, 1, this.H);
            bw5.f9 f9Var = this.I;
            if (f9Var != null && zArr[36]) {
                fVar.i(36, f9Var.computeSize());
                this.I.writeFields(fVar);
            }
            bw5.d7 d7Var = this.f27655J;
            if (d7Var != null && zArr[37]) {
                fVar.i(37, d7Var.computeSize());
                this.f27655J.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f27656d;
            if (str5 != null && zArr[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f27657e);
            }
            java.lang.String str6 = this.f27658f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f27659g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            int g17 = i18 + b36.f.g(5, 8, this.f27660h);
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f27661i);
            }
            java.lang.String str8 = this.f27662m;
            if (str8 != null && zArr[7]) {
                g17 += b36.f.j(7, str8);
            }
            bw5.oc0 oc0Var2 = this.f27663n;
            if (oc0Var2 != null && zArr[8]) {
                g17 += b36.f.i(8, oc0Var2.computeSize());
            }
            bw5.tv tvVar2 = this.f27664o;
            if (tvVar2 != null && zArr[9]) {
                g17 += b36.f.i(9, tvVar2.computeSize());
            }
            bw5.vv vvVar5 = this.f27665p;
            if (vvVar5 != null && zArr[10]) {
                g17 += b36.f.i(10, vvVar5.computeSize());
            }
            bw5.r2 r2Var2 = this.f27666q;
            if (r2Var2 != null && zArr[11]) {
                g17 += b36.f.i(11, r2Var2.computeSize());
            }
            bw5.pv pvVar2 = this.f27667r;
            if (pvVar2 != null && zArr[12]) {
                g17 += b36.f.i(12, pvVar2.computeSize());
            }
            bw5.ro roVar2 = this.f27668s;
            if (roVar2 != null && zArr[13]) {
                g17 += b36.f.i(13, roVar2.computeSize());
            }
            bw5.md0 md0Var2 = this.f27669t;
            if (md0Var2 != null && zArr[14]) {
                g17 += b36.f.i(14, md0Var2.computeSize());
            }
            if (zArr[15]) {
                g17 += b36.f.e(15, this.f27670u);
            }
            bw5.vv vvVar6 = this.f27671v;
            if (vvVar6 != null && zArr[16]) {
                g17 += b36.f.i(16, vvVar6.computeSize());
            }
            bw5.sf0 sf0Var2 = this.f27672w;
            if (sf0Var2 != null && zArr[17]) {
                g17 += b36.f.i(17, sf0Var2.computeSize());
            }
            bw5.uv uvVar2 = this.f27673x;
            if (uvVar2 != null && zArr[18]) {
                g17 += b36.f.i(18, uvVar2.computeSize());
            }
            bw5.ro0 ro0Var2 = this.f27674y;
            if (ro0Var2 != null && zArr[19]) {
                g17 += b36.f.i(19, ro0Var2.computeSize());
            }
            bw5.vv vvVar7 = this.f27675z;
            if (vvVar7 != null && zArr[20]) {
                g17 += b36.f.i(20, vvVar7.computeSize());
            }
            bw5.mi0 mi0Var2 = this.A;
            if (mi0Var2 != null && zArr[21]) {
                g17 += b36.f.i(21, mi0Var2.computeSize());
            }
            bw5.ip ipVar2 = this.B;
            if (ipVar2 != null && zArr[22]) {
                g17 += b36.f.i(22, ipVar2.computeSize());
            }
            bw5.uo0 uo0Var2 = this.C;
            if (uo0Var2 != null && zArr[30]) {
                g17 += b36.f.i(30, uo0Var2.computeSize());
            }
            bw5.b5 b5Var2 = this.D;
            if (b5Var2 != null && zArr[31]) {
                g17 += b36.f.i(31, b5Var2.computeSize());
            }
            bw5.vv vvVar8 = this.E;
            if (vvVar8 != null && zArr[32]) {
                g17 += b36.f.i(32, vvVar8.computeSize());
            }
            bw5.vk0 vk0Var2 = this.F;
            if (vk0Var2 != null && zArr[33]) {
                g17 += b36.f.i(33, vk0Var2.computeSize());
            }
            bw5.qv qvVar2 = this.G;
            if (qvVar2 != null && zArr[34]) {
                g17 += b36.f.i(34, qvVar2.computeSize());
            }
            int g18 = g17 + b36.f.g(35, 1, this.H);
            bw5.f9 f9Var2 = this.I;
            if (f9Var2 != null && zArr[36]) {
                g18 += b36.f.i(36, f9Var2.computeSize());
            }
            bw5.d7 d7Var2 = this.f27655J;
            return (d7Var2 == null || !zArr[37]) ? g18 : g18 + b36.f.i(37, d7Var2.computeSize());
        }
        if (i17 == 2) {
            this.f27660h.clear();
            this.H.clear();
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
                this.f27656d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27657e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27658f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27659g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.tc0 tc0Var = new bw5.tc0();
                    if (bArr != null && bArr.length > 0) {
                        tc0Var.parseFrom(bArr);
                    }
                    this.f27660h.add(tc0Var);
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f27661i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27662m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.oc0 oc0Var3 = new bw5.oc0();
                    if (bArr2 != null && bArr2.length > 0) {
                        oc0Var3.parseFrom(bArr2);
                    }
                    this.f27663n = oc0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.tv tvVar3 = new bw5.tv();
                    if (bArr3 != null && bArr3.length > 0) {
                        tvVar3.parseFrom(bArr3);
                    }
                    this.f27664o = tvVar3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.vv vvVar9 = new bw5.vv();
                    if (bArr4 != null && bArr4.length > 0) {
                        vvVar9.parseFrom(bArr4);
                    }
                    this.f27665p = vvVar9;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.r2 r2Var3 = new bw5.r2();
                    if (bArr5 != null && bArr5.length > 0) {
                        r2Var3.parseFrom(bArr5);
                    }
                    this.f27666q = r2Var3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.pv pvVar3 = new bw5.pv();
                    if (bArr6 != null && bArr6.length > 0) {
                        pvVar3.parseFrom(bArr6);
                    }
                    this.f27667r = pvVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.ro roVar3 = new bw5.ro();
                    if (bArr7 != null && bArr7.length > 0) {
                        roVar3.parseFrom(bArr7);
                    }
                    this.f27668s = roVar3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.md0 md0Var3 = new bw5.md0();
                    if (bArr8 != null && bArr8.length > 0) {
                        md0Var3.parseFrom(bArr8);
                    }
                    this.f27669t = md0Var3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f27670u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.vv vvVar10 = new bw5.vv();
                    if (bArr9 != null && bArr9.length > 0) {
                        vvVar10.parseFrom(bArr9);
                    }
                    this.f27671v = vvVar10;
                }
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.sf0 sf0Var3 = new bw5.sf0();
                    if (bArr10 != null && bArr10.length > 0) {
                        sf0Var3.parseFrom(bArr10);
                    }
                    this.f27672w = sf0Var3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.uv uvVar3 = new bw5.uv();
                    if (bArr11 != null && bArr11.length > 0) {
                        uvVar3.parseFrom(bArr11);
                    }
                    this.f27673x = uvVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.ro0 ro0Var3 = new bw5.ro0();
                    if (bArr12 != null && bArr12.length > 0) {
                        ro0Var3.parseFrom(bArr12);
                    }
                    this.f27674y = ro0Var3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    bw5.vv vvVar11 = new bw5.vv();
                    if (bArr13 != null && bArr13.length > 0) {
                        vvVar11.parseFrom(bArr13);
                    }
                    this.f27675z = vvVar11;
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i66 = 0; i66 < size14; i66++) {
                    byte[] bArr14 = (byte[]) j58.get(i66);
                    bw5.mi0 mi0Var3 = new bw5.mi0();
                    if (bArr14 != null && bArr14.length > 0) {
                        mi0Var3.parseFrom(bArr14);
                    }
                    this.A = mi0Var3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i67 = 0; i67 < size15; i67++) {
                    byte[] bArr15 = (byte[]) j59.get(i67);
                    bw5.ip ipVar3 = new bw5.ip();
                    if (bArr15 != null && bArr15.length > 0) {
                        ipVar3.parseFrom(bArr15);
                    }
                    this.B = ipVar3;
                }
                zArr[22] = true;
                return 0;
            default:
                switch (intValue) {
                    case 30:
                        java.util.LinkedList j66 = aVar2.j(intValue);
                        int size16 = j66.size();
                        for (int i68 = 0; i68 < size16; i68++) {
                            byte[] bArr16 = (byte[]) j66.get(i68);
                            bw5.uo0 uo0Var3 = new bw5.uo0();
                            if (bArr16 != null && bArr16.length > 0) {
                                uo0Var3.parseFrom(bArr16);
                            }
                            this.C = uo0Var3;
                        }
                        zArr[30] = true;
                        return 0;
                    case 31:
                        java.util.LinkedList j67 = aVar2.j(intValue);
                        int size17 = j67.size();
                        for (int i69 = 0; i69 < size17; i69++) {
                            byte[] bArr17 = (byte[]) j67.get(i69);
                            bw5.b5 b5Var3 = new bw5.b5();
                            if (bArr17 != null && bArr17.length > 0) {
                                b5Var3.parseFrom(bArr17);
                            }
                            this.D = b5Var3;
                        }
                        zArr[31] = true;
                        return 0;
                    case 32:
                        java.util.LinkedList j68 = aVar2.j(intValue);
                        int size18 = j68.size();
                        for (int i76 = 0; i76 < size18; i76++) {
                            byte[] bArr18 = (byte[]) j68.get(i76);
                            bw5.vv vvVar12 = new bw5.vv();
                            if (bArr18 != null && bArr18.length > 0) {
                                vvVar12.parseFrom(bArr18);
                            }
                            this.E = vvVar12;
                        }
                        zArr[32] = true;
                        return 0;
                    case 33:
                        java.util.LinkedList j69 = aVar2.j(intValue);
                        int size19 = j69.size();
                        for (int i77 = 0; i77 < size19; i77++) {
                            byte[] bArr19 = (byte[]) j69.get(i77);
                            bw5.vk0 vk0Var3 = new bw5.vk0();
                            if (bArr19 != null && bArr19.length > 0) {
                                vk0Var3.parseFrom(bArr19);
                            }
                            this.F = vk0Var3;
                        }
                        zArr[33] = true;
                        return 0;
                    case 34:
                        java.util.LinkedList j76 = aVar2.j(intValue);
                        int size20 = j76.size();
                        for (int i78 = 0; i78 < size20; i78++) {
                            byte[] bArr20 = (byte[]) j76.get(i78);
                            bw5.qv qvVar3 = new bw5.qv();
                            if (bArr20 != null && bArr20.length > 0) {
                                qvVar3.parseFrom(bArr20);
                            }
                            this.G = qvVar3;
                        }
                        zArr[34] = true;
                        return 0;
                    case 35:
                        this.H.add(aVar2.k(intValue));
                        zArr[35] = true;
                        return 0;
                    case 36:
                        java.util.LinkedList j77 = aVar2.j(intValue);
                        int size21 = j77.size();
                        for (int i79 = 0; i79 < size21; i79++) {
                            byte[] bArr21 = (byte[]) j77.get(i79);
                            bw5.f9 f9Var3 = new bw5.f9();
                            if (bArr21 != null && bArr21.length > 0) {
                                f9Var3.parseFrom(bArr21);
                            }
                            this.I = f9Var3;
                        }
                        zArr[36] = true;
                        return 0;
                    case 37:
                        java.util.LinkedList j78 = aVar2.j(intValue);
                        int size22 = j78.size();
                        for (int i86 = 0; i86 < size22; i86++) {
                            byte[] bArr22 = (byte[]) j78.get(i86);
                            bw5.d7 d7Var3 = new bw5.d7();
                            if (bArr22 != null && bArr22.length > 0) {
                                d7Var3.parseFrom(bArr22);
                            }
                            this.f27655J = d7Var3;
                        }
                        zArr[37] = true;
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
