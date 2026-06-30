package bw5;

/* loaded from: classes2.dex */
public class pp0 extends com.tencent.mm.protobuf.f {
    public static final bw5.pp0 F = new bw5.pp0();
    public bw5.uq0 A;
    public bw5.lp0 B;
    public java.lang.String C;
    public bw5.vb0 D;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31782e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f31783f;

    /* renamed from: h, reason: collision with root package name */
    public bw5.xa0 f31785h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f31786i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f31787m;

    /* renamed from: n, reason: collision with root package name */
    public int f31788n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.op0 f31789o;

    /* renamed from: q, reason: collision with root package name */
    public int f31791q;

    /* renamed from: r, reason: collision with root package name */
    public int f31792r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.qq0 f31793s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f31794t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f31795u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f31796v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.p90 f31797w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.a70 f31798x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f31799y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f31800z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f31781d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f31784g = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f31790p = new java.util.LinkedList();
    public final boolean[] E = new boolean[26];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pp0)) {
            return false;
        }
        bw5.pp0 pp0Var = (bw5.pp0) fVar;
        return n51.f.a(this.f31781d, pp0Var.f31781d) && n51.f.a(java.lang.Boolean.valueOf(this.f31782e), java.lang.Boolean.valueOf(pp0Var.f31782e)) && n51.f.a(this.f31783f, pp0Var.f31783f) && n51.f.a(this.f31784g, pp0Var.f31784g) && n51.f.a(this.f31785h, pp0Var.f31785h) && n51.f.a(this.f31786i, pp0Var.f31786i) && n51.f.a(this.f31787m, pp0Var.f31787m) && n51.f.a(java.lang.Integer.valueOf(this.f31788n), java.lang.Integer.valueOf(pp0Var.f31788n)) && n51.f.a(this.f31789o, pp0Var.f31789o) && n51.f.a(this.f31790p, pp0Var.f31790p) && n51.f.a(java.lang.Integer.valueOf(this.f31791q), java.lang.Integer.valueOf(pp0Var.f31791q)) && n51.f.a(java.lang.Integer.valueOf(this.f31792r), java.lang.Integer.valueOf(pp0Var.f31792r)) && n51.f.a(this.f31793s, pp0Var.f31793s) && n51.f.a(java.lang.Boolean.valueOf(this.f31794t), java.lang.Boolean.valueOf(pp0Var.f31794t)) && n51.f.a(this.f31795u, pp0Var.f31795u) && n51.f.a(java.lang.Boolean.valueOf(this.f31796v), java.lang.Boolean.valueOf(pp0Var.f31796v)) && n51.f.a(this.f31797w, pp0Var.f31797w) && n51.f.a(this.f31798x, pp0Var.f31798x) && n51.f.a(java.lang.Boolean.valueOf(this.f31799y), java.lang.Boolean.valueOf(pp0Var.f31799y)) && n51.f.a(java.lang.Boolean.valueOf(this.f31800z), java.lang.Boolean.valueOf(pp0Var.f31800z)) && n51.f.a(this.A, pp0Var.A) && n51.f.a(this.B, pp0Var.B) && n51.f.a(this.C, pp0Var.C) && n51.f.a(this.D, pp0Var.D);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f31781d);
            if (zArr[2]) {
                fVar.a(2, this.f31782e);
            }
            com.tencent.mm.protobuf.g gVar = this.f31783f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            fVar.g(4, 1, this.f31784g);
            bw5.xa0 xa0Var = this.f31785h;
            if (xa0Var != null && zArr[5]) {
                fVar.i(5, xa0Var.computeSize());
                this.f31785h.writeFields(fVar);
            }
            java.lang.String str = this.f31786i;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f31787m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            if (zArr[8]) {
                fVar.e(8, this.f31788n);
            }
            bw5.op0 op0Var = this.f31789o;
            if (op0Var != null && zArr[9]) {
                fVar.i(9, op0Var.computeSize());
                this.f31789o.writeFields(fVar);
            }
            fVar.g(10, 8, this.f31790p);
            if (zArr[11]) {
                fVar.e(11, this.f31791q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f31792r);
            }
            bw5.qq0 qq0Var = this.f31793s;
            if (qq0Var != null && zArr[13]) {
                fVar.e(13, qq0Var.f32229d);
            }
            if (zArr[15]) {
                fVar.a(15, this.f31794t);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f31795u;
            if (gVar2 != null && zArr[16]) {
                fVar.b(16, gVar2);
            }
            if (zArr[17]) {
                fVar.a(17, this.f31796v);
            }
            bw5.p90 p90Var = this.f31797w;
            if (p90Var != null && zArr[18]) {
                fVar.i(18, p90Var.computeSize());
                this.f31797w.writeFields(fVar);
            }
            bw5.a70 a70Var = this.f31798x;
            if (a70Var != null && zArr[19]) {
                fVar.i(19, a70Var.computeSize());
                this.f31798x.writeFields(fVar);
            }
            if (zArr[20]) {
                fVar.a(20, this.f31799y);
            }
            if (zArr[21]) {
                fVar.a(21, this.f31800z);
            }
            bw5.uq0 uq0Var = this.A;
            if (uq0Var != null && zArr[22]) {
                fVar.i(22, uq0Var.computeSize());
                this.A.writeFields(fVar);
            }
            bw5.lp0 lp0Var = this.B;
            if (lp0Var != null && zArr[23]) {
                fVar.i(23, lp0Var.computeSize());
                this.B.writeFields(fVar);
            }
            java.lang.String str3 = this.C;
            if (str3 != null && zArr[24]) {
                fVar.j(24, str3);
            }
            bw5.vb0 vb0Var = this.D;
            if (vb0Var != null && zArr[25]) {
                fVar.i(25, vb0Var.computeSize());
                this.D.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f31781d) + 0;
            if (zArr[2]) {
                g17 += b36.f.a(2, this.f31782e);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f31783f;
            if (gVar3 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar3);
            }
            int g18 = g17 + b36.f.g(4, 1, this.f31784g);
            bw5.xa0 xa0Var2 = this.f31785h;
            if (xa0Var2 != null && zArr[5]) {
                g18 += b36.f.i(5, xa0Var2.computeSize());
            }
            java.lang.String str4 = this.f31786i;
            if (str4 != null && zArr[6]) {
                g18 += b36.f.j(6, str4);
            }
            java.lang.String str5 = this.f31787m;
            if (str5 != null && zArr[7]) {
                g18 += b36.f.j(7, str5);
            }
            if (zArr[8]) {
                g18 += b36.f.e(8, this.f31788n);
            }
            bw5.op0 op0Var2 = this.f31789o;
            if (op0Var2 != null && zArr[9]) {
                g18 += b36.f.i(9, op0Var2.computeSize());
            }
            int g19 = g18 + b36.f.g(10, 8, this.f31790p);
            if (zArr[11]) {
                g19 += b36.f.e(11, this.f31791q);
            }
            if (zArr[12]) {
                g19 += b36.f.e(12, this.f31792r);
            }
            bw5.qq0 qq0Var2 = this.f31793s;
            if (qq0Var2 != null && zArr[13]) {
                g19 += b36.f.e(13, qq0Var2.f32229d);
            }
            if (zArr[15]) {
                g19 += b36.f.a(15, this.f31794t);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f31795u;
            if (gVar4 != null && zArr[16]) {
                g19 += b36.f.b(16, gVar4);
            }
            if (zArr[17]) {
                g19 += b36.f.a(17, this.f31796v);
            }
            bw5.p90 p90Var2 = this.f31797w;
            if (p90Var2 != null && zArr[18]) {
                g19 += b36.f.i(18, p90Var2.computeSize());
            }
            bw5.a70 a70Var2 = this.f31798x;
            if (a70Var2 != null && zArr[19]) {
                g19 += b36.f.i(19, a70Var2.computeSize());
            }
            if (zArr[20]) {
                g19 += b36.f.a(20, this.f31799y);
            }
            if (zArr[21]) {
                g19 += b36.f.a(21, this.f31800z);
            }
            bw5.uq0 uq0Var2 = this.A;
            if (uq0Var2 != null && zArr[22]) {
                g19 += b36.f.i(22, uq0Var2.computeSize());
            }
            bw5.lp0 lp0Var2 = this.B;
            if (lp0Var2 != null && zArr[23]) {
                g19 += b36.f.i(23, lp0Var2.computeSize());
            }
            java.lang.String str6 = this.C;
            if (str6 != null && zArr[24]) {
                g19 += b36.f.j(24, str6);
            }
            bw5.vb0 vb0Var2 = this.D;
            return (vb0Var2 == null || !zArr[25]) ? g19 : g19 + b36.f.i(25, vb0Var2.computeSize());
        }
        if (i17 == 2) {
            this.f31781d.clear();
            this.f31784g.clear();
            this.f31790p.clear();
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
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.lp0 lp0Var3 = new bw5.lp0();
                    if (bArr != null && bArr.length > 0) {
                        lp0Var3.parseFrom(bArr);
                    }
                    this.f31781d.add(lp0Var3);
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f31782e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31783f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31784g.add(aVar2.k(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr2 != null && bArr2.length > 0) {
                        xa0Var3.parseFrom(bArr2);
                    }
                    this.f31785h = xa0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f31786i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f31787m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f31788n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.op0 op0Var3 = new bw5.op0();
                    if (bArr3 != null && bArr3.length > 0) {
                        op0Var3.parseFrom(bArr3);
                    }
                    this.f31789o = op0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.v70 v70Var = new bw5.v70();
                    if (bArr4 != null && bArr4.length > 0) {
                        v70Var.parseFrom(bArr4);
                    }
                    this.f31790p.add(v70Var);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f31791q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f31792r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                int g27 = aVar2.g(intValue);
                this.f31793s = g27 != 0 ? g27 != 1 ? g27 != 2 ? null : bw5.qq0.TingPresetListLoadModeKeepList : bw5.qq0.TingPresetListLoadModeKeepPreset : bw5.qq0.TingPresetListLoadModeDefault;
                zArr[13] = true;
                return 0;
            case 14:
            default:
                return -1;
            case 15:
                this.f31794t = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f31795u = aVar2.d(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f31796v = aVar2.c(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.p90 p90Var3 = new bw5.p90();
                    if (bArr5 != null && bArr5.length > 0) {
                        p90Var3.parseFrom(bArr5);
                    }
                    this.f31797w = p90Var3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.a70 a70Var3 = new bw5.a70();
                    if (bArr6 != null && bArr6.length > 0) {
                        a70Var3.parseFrom(bArr6);
                    }
                    this.f31798x = a70Var3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                this.f31799y = aVar2.c(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.f31800z = aVar2.c(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.uq0 uq0Var3 = new bw5.uq0();
                    if (bArr7 != null && bArr7.length > 0) {
                        uq0Var3.parseFrom(bArr7);
                    }
                    this.A = uq0Var3;
                }
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.lp0 lp0Var4 = new bw5.lp0();
                    if (bArr8 != null && bArr8.length > 0) {
                        lp0Var4.parseFrom(bArr8);
                    }
                    this.B = lp0Var4;
                }
                zArr[23] = true;
                return 0;
            case 24:
                this.C = aVar2.k(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.vb0 vb0Var3 = new bw5.vb0();
                    if (bArr9 != null && bArr9.length > 0) {
                        vb0Var3.parseFrom(bArr9);
                    }
                    this.D = vb0Var3;
                }
                zArr[25] = true;
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.pp0) super.parseFrom(bArr);
    }
}
