package bw5;

/* loaded from: classes2.dex */
public class vy extends com.tencent.mm.protobuf.f {
    public int A;
    public bw5.ry B;
    public java.lang.String C;
    public bw5.hu E;
    public bw5.ty F;
    public int G;
    public java.lang.String H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f34508J;
    public int K;
    public int L;
    public java.lang.String M;

    /* renamed from: d, reason: collision with root package name */
    public int f34509d;

    /* renamed from: e, reason: collision with root package name */
    public int f34510e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34511f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34512g;

    /* renamed from: h, reason: collision with root package name */
    public int f34513h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f34514i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f34515m;

    /* renamed from: n, reason: collision with root package name */
    public int f34516n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34517o;

    /* renamed from: q, reason: collision with root package name */
    public bw5.o3 f34519q;

    /* renamed from: r, reason: collision with root package name */
    public int f34520r;

    /* renamed from: s, reason: collision with root package name */
    public int f34521s;

    /* renamed from: t, reason: collision with root package name */
    public int f34522t;

    /* renamed from: u, reason: collision with root package name */
    public int f34523u;

    /* renamed from: v, reason: collision with root package name */
    public int f34524v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.sy f34525w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.v1 f34526x;

    /* renamed from: y, reason: collision with root package name */
    public int f34527y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f34528z;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f34518p = new java.util.LinkedList();
    public final java.util.LinkedList D = new java.util.LinkedList();
    public final boolean[] N = new boolean[34];

    static {
        new bw5.vy();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vy parseFrom(byte[] bArr) {
        return (bw5.vy) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vy)) {
            return false;
        }
        bw5.vy vyVar = (bw5.vy) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34509d), java.lang.Integer.valueOf(vyVar.f34509d)) && n51.f.a(java.lang.Integer.valueOf(this.f34510e), java.lang.Integer.valueOf(vyVar.f34510e)) && n51.f.a(this.f34511f, vyVar.f34511f) && n51.f.a(this.f34512g, vyVar.f34512g) && n51.f.a(java.lang.Integer.valueOf(this.f34513h), java.lang.Integer.valueOf(vyVar.f34513h)) && n51.f.a(this.f34514i, vyVar.f34514i) && n51.f.a(this.f34515m, vyVar.f34515m) && n51.f.a(java.lang.Integer.valueOf(this.f34516n), java.lang.Integer.valueOf(vyVar.f34516n)) && n51.f.a(this.f34517o, vyVar.f34517o) && n51.f.a(this.f34518p, vyVar.f34518p) && n51.f.a(this.f34519q, vyVar.f34519q) && n51.f.a(java.lang.Integer.valueOf(this.f34520r), java.lang.Integer.valueOf(vyVar.f34520r)) && n51.f.a(java.lang.Integer.valueOf(this.f34521s), java.lang.Integer.valueOf(vyVar.f34521s)) && n51.f.a(java.lang.Integer.valueOf(this.f34522t), java.lang.Integer.valueOf(vyVar.f34522t)) && n51.f.a(java.lang.Integer.valueOf(this.f34523u), java.lang.Integer.valueOf(vyVar.f34523u)) && n51.f.a(java.lang.Integer.valueOf(this.f34524v), java.lang.Integer.valueOf(vyVar.f34524v)) && n51.f.a(this.f34525w, vyVar.f34525w) && n51.f.a(this.f34526x, vyVar.f34526x) && n51.f.a(java.lang.Integer.valueOf(this.f34527y), java.lang.Integer.valueOf(vyVar.f34527y)) && n51.f.a(this.f34528z, vyVar.f34528z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(vyVar.A)) && n51.f.a(this.B, vyVar.B) && n51.f.a(this.C, vyVar.C) && n51.f.a(this.D, vyVar.D) && n51.f.a(this.E, vyVar.E) && n51.f.a(this.F, vyVar.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(vyVar.G)) && n51.f.a(this.H, vyVar.H) && n51.f.a(java.lang.Boolean.valueOf(this.I), java.lang.Boolean.valueOf(vyVar.I)) && n51.f.a(java.lang.Integer.valueOf(this.f34508J), java.lang.Integer.valueOf(vyVar.f34508J)) && n51.f.a(java.lang.Integer.valueOf(this.K), java.lang.Integer.valueOf(vyVar.K)) && n51.f.a(java.lang.Integer.valueOf(this.L), java.lang.Integer.valueOf(vyVar.L)) && n51.f.a(this.M, vyVar.M);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vy();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.N;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34509d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34510e);
            }
            java.lang.String str = this.f34511f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f34512g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f34513h);
            }
            java.lang.String str3 = this.f34514i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f34515m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            if (zArr[8]) {
                fVar.e(8, this.f34516n);
            }
            com.tencent.mm.protobuf.g gVar = this.f34517o;
            if (gVar != null && zArr[9]) {
                fVar.b(9, gVar);
            }
            fVar.g(10, 1, this.f34518p);
            bw5.o3 o3Var = this.f34519q;
            if (o3Var != null && zArr[11]) {
                fVar.i(11, o3Var.computeSize());
                this.f34519q.writeFields(fVar);
            }
            if (zArr[12]) {
                fVar.e(12, this.f34520r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f34521s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f34522t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f34523u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f34524v);
            }
            bw5.sy syVar = this.f34525w;
            if (syVar != null && zArr[17]) {
                fVar.i(17, syVar.computeSize());
                this.f34525w.writeFields(fVar);
            }
            bw5.v1 v1Var = this.f34526x;
            if (v1Var != null && zArr[18]) {
                fVar.i(18, v1Var.computeSize());
                this.f34526x.writeFields(fVar);
            }
            if (zArr[19]) {
                fVar.e(19, this.f34527y);
            }
            java.lang.String str5 = this.f34528z;
            if (str5 != null && zArr[20]) {
                fVar.j(20, str5);
            }
            if (zArr[21]) {
                fVar.e(21, this.A);
            }
            bw5.ry ryVar = this.B;
            if (ryVar != null && zArr[22]) {
                fVar.i(22, ryVar.computeSize());
                this.B.writeFields(fVar);
            }
            java.lang.String str6 = this.C;
            if (str6 != null && zArr[23]) {
                fVar.j(23, str6);
            }
            fVar.g(24, 8, this.D);
            bw5.hu huVar = this.E;
            if (huVar != null && zArr[25]) {
                fVar.i(25, huVar.computeSize());
                this.E.writeFields(fVar);
            }
            bw5.ty tyVar = this.F;
            if (tyVar != null && zArr[26]) {
                fVar.i(26, tyVar.computeSize());
                this.F.writeFields(fVar);
            }
            if (zArr[27]) {
                fVar.e(27, this.G);
            }
            java.lang.String str7 = this.H;
            if (str7 != null && zArr[28]) {
                fVar.j(28, str7);
            }
            if (zArr[29]) {
                fVar.a(29, this.I);
            }
            if (zArr[30]) {
                fVar.e(30, this.f34508J);
            }
            if (zArr[31]) {
                fVar.e(31, this.K);
            }
            if (zArr[32]) {
                fVar.e(32, this.L);
            }
            java.lang.String str8 = this.M;
            if (str8 != null && zArr[33]) {
                fVar.j(33, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f34509d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f34510e);
            }
            java.lang.String str9 = this.f34511f;
            if (str9 != null && zArr[3]) {
                e17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f34512g;
            if (str10 != null && zArr[4]) {
                e17 += b36.f.j(4, str10);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f34513h);
            }
            java.lang.String str11 = this.f34514i;
            if (str11 != null && zArr[6]) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f34515m;
            if (str12 != null && zArr[7]) {
                e17 += b36.f.j(7, str12);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f34516n);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f34517o;
            if (gVar2 != null && zArr[9]) {
                e17 += b36.f.b(9, gVar2);
            }
            int g17 = e17 + b36.f.g(10, 1, this.f34518p);
            bw5.o3 o3Var2 = this.f34519q;
            if (o3Var2 != null && zArr[11]) {
                g17 += b36.f.i(11, o3Var2.computeSize());
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f34520r);
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f34521s);
            }
            if (zArr[14]) {
                g17 += b36.f.e(14, this.f34522t);
            }
            if (zArr[15]) {
                g17 += b36.f.e(15, this.f34523u);
            }
            if (zArr[16]) {
                g17 += b36.f.e(16, this.f34524v);
            }
            bw5.sy syVar2 = this.f34525w;
            if (syVar2 != null && zArr[17]) {
                g17 += b36.f.i(17, syVar2.computeSize());
            }
            bw5.v1 v1Var2 = this.f34526x;
            if (v1Var2 != null && zArr[18]) {
                g17 += b36.f.i(18, v1Var2.computeSize());
            }
            if (zArr[19]) {
                g17 += b36.f.e(19, this.f34527y);
            }
            java.lang.String str13 = this.f34528z;
            if (str13 != null && zArr[20]) {
                g17 += b36.f.j(20, str13);
            }
            if (zArr[21]) {
                g17 += b36.f.e(21, this.A);
            }
            bw5.ry ryVar2 = this.B;
            if (ryVar2 != null && zArr[22]) {
                g17 += b36.f.i(22, ryVar2.computeSize());
            }
            java.lang.String str14 = this.C;
            if (str14 != null && zArr[23]) {
                g17 += b36.f.j(23, str14);
            }
            int g18 = g17 + b36.f.g(24, 8, this.D);
            bw5.hu huVar2 = this.E;
            if (huVar2 != null && zArr[25]) {
                g18 += b36.f.i(25, huVar2.computeSize());
            }
            bw5.ty tyVar2 = this.F;
            if (tyVar2 != null && zArr[26]) {
                g18 += b36.f.i(26, tyVar2.computeSize());
            }
            if (zArr[27]) {
                g18 += b36.f.e(27, this.G);
            }
            java.lang.String str15 = this.H;
            if (str15 != null && zArr[28]) {
                g18 += b36.f.j(28, str15);
            }
            if (zArr[29]) {
                g18 += b36.f.a(29, this.I);
            }
            if (zArr[30]) {
                g18 += b36.f.e(30, this.f34508J);
            }
            if (zArr[31]) {
                g18 += b36.f.e(31, this.K);
            }
            if (zArr[32]) {
                g18 += b36.f.e(32, this.L);
            }
            java.lang.String str16 = this.M;
            return (str16 == null || !zArr[33]) ? g18 : g18 + b36.f.j(33, str16);
        }
        if (i17 == 2) {
            this.f34518p.clear();
            this.D.clear();
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
                this.f34509d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34510e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34511f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34512g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34513h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34514i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34515m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f34516n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34517o = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f34518p.add(aVar2.k(intValue));
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.o3 o3Var3 = new bw5.o3();
                    if (bArr != null && bArr.length > 0) {
                        o3Var3.parseFrom(bArr);
                    }
                    this.f34519q = o3Var3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f34520r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f34521s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f34522t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f34523u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f34524v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.sy syVar3 = new bw5.sy();
                    if (bArr2 != null && bArr2.length > 0) {
                        syVar3.parseFrom(bArr2);
                    }
                    this.f34525w = syVar3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.v1 v1Var3 = new bw5.v1();
                    if (bArr3 != null && bArr3.length > 0) {
                        v1Var3.parseFrom(bArr3);
                    }
                    this.f34526x = v1Var3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f34527y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f34528z = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.ry ryVar3 = new bw5.ry();
                    if (bArr4 != null && bArr4.length > 0) {
                        ryVar3.parseFrom(bArr4);
                    }
                    this.B = ryVar3;
                }
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.k(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.uy uyVar = new bw5.uy();
                    if (bArr5 != null && bArr5.length > 0) {
                        uyVar.parseFrom(bArr5);
                    }
                    this.D.add(uyVar);
                }
                zArr[24] = true;
                return 0;
            case 25:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.hu huVar3 = new bw5.hu();
                    if (bArr6 != null && bArr6.length > 0) {
                        huVar3.parseFrom(bArr6);
                    }
                    this.E = huVar3;
                }
                zArr[25] = true;
                return 0;
            case 26:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.ty tyVar3 = new bw5.ty();
                    if (bArr7 != null && bArr7.length > 0) {
                        tyVar3.parseFrom(bArr7);
                    }
                    this.F = tyVar3;
                }
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.g(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.k(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.c(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                this.f34508J = aVar2.g(intValue);
                zArr[30] = true;
                return 0;
            case 31:
                this.K = aVar2.g(intValue);
                zArr[31] = true;
                return 0;
            case 32:
                this.L = aVar2.g(intValue);
                zArr[32] = true;
                return 0;
            case 33:
                this.M = aVar2.k(intValue);
                zArr[33] = true;
                return 0;
            default:
                return -1;
        }
    }
}
