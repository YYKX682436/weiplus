package bw5;

/* loaded from: classes2.dex */
public class y30 extends com.tencent.mm.protobuf.f {
    public bw5.vr0 A;
    public bw5.vr0 B;
    public bw5.vr0 C;
    public int D;
    public int E;
    public int G;
    public int H;

    /* renamed from: d, reason: collision with root package name */
    public int f35342d;

    /* renamed from: e, reason: collision with root package name */
    public int f35343e;

    /* renamed from: f, reason: collision with root package name */
    public int f35344f;

    /* renamed from: g, reason: collision with root package name */
    public int f35345g;

    /* renamed from: h, reason: collision with root package name */
    public int f35346h;

    /* renamed from: i, reason: collision with root package name */
    public int f35347i;

    /* renamed from: m, reason: collision with root package name */
    public int f35348m;

    /* renamed from: n, reason: collision with root package name */
    public int f35349n;

    /* renamed from: o, reason: collision with root package name */
    public int f35350o;

    /* renamed from: p, reason: collision with root package name */
    public int f35351p;

    /* renamed from: q, reason: collision with root package name */
    public int f35352q;

    /* renamed from: r, reason: collision with root package name */
    public int f35353r;

    /* renamed from: s, reason: collision with root package name */
    public int f35354s;

    /* renamed from: t, reason: collision with root package name */
    public int f35355t;

    /* renamed from: u, reason: collision with root package name */
    public int f35356u;

    /* renamed from: v, reason: collision with root package name */
    public int f35357v;

    /* renamed from: w, reason: collision with root package name */
    public int f35358w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f35359x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.vr0 f35360y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.vr0 f35361z;
    public final java.util.LinkedList F = new java.util.LinkedList();
    public final boolean[] I = new boolean[39];

    static {
        new bw5.y30();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.y30 parseFrom(byte[] bArr) {
        return (bw5.y30) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y30)) {
            return false;
        }
        bw5.y30 y30Var = (bw5.y30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f35342d), java.lang.Integer.valueOf(y30Var.f35342d)) && n51.f.a(java.lang.Integer.valueOf(this.f35343e), java.lang.Integer.valueOf(y30Var.f35343e)) && n51.f.a(java.lang.Integer.valueOf(this.f35344f), java.lang.Integer.valueOf(y30Var.f35344f)) && n51.f.a(java.lang.Integer.valueOf(this.f35345g), java.lang.Integer.valueOf(y30Var.f35345g)) && n51.f.a(java.lang.Integer.valueOf(this.f35346h), java.lang.Integer.valueOf(y30Var.f35346h)) && n51.f.a(java.lang.Integer.valueOf(this.f35347i), java.lang.Integer.valueOf(y30Var.f35347i)) && n51.f.a(java.lang.Integer.valueOf(this.f35348m), java.lang.Integer.valueOf(y30Var.f35348m)) && n51.f.a(java.lang.Integer.valueOf(this.f35349n), java.lang.Integer.valueOf(y30Var.f35349n)) && n51.f.a(java.lang.Integer.valueOf(this.f35350o), java.lang.Integer.valueOf(y30Var.f35350o)) && n51.f.a(java.lang.Integer.valueOf(this.f35351p), java.lang.Integer.valueOf(y30Var.f35351p)) && n51.f.a(java.lang.Integer.valueOf(this.f35352q), java.lang.Integer.valueOf(y30Var.f35352q)) && n51.f.a(java.lang.Integer.valueOf(this.f35353r), java.lang.Integer.valueOf(y30Var.f35353r)) && n51.f.a(java.lang.Integer.valueOf(this.f35354s), java.lang.Integer.valueOf(y30Var.f35354s)) && n51.f.a(java.lang.Integer.valueOf(this.f35355t), java.lang.Integer.valueOf(y30Var.f35355t)) && n51.f.a(java.lang.Integer.valueOf(this.f35356u), java.lang.Integer.valueOf(y30Var.f35356u)) && n51.f.a(java.lang.Integer.valueOf(this.f35357v), java.lang.Integer.valueOf(y30Var.f35357v)) && n51.f.a(java.lang.Integer.valueOf(this.f35358w), java.lang.Integer.valueOf(y30Var.f35358w)) && n51.f.a(this.f35359x, y30Var.f35359x) && n51.f.a(this.f35360y, y30Var.f35360y) && n51.f.a(this.f35361z, y30Var.f35361z) && n51.f.a(this.A, y30Var.A) && n51.f.a(this.B, y30Var.B) && n51.f.a(this.C, y30Var.C) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(y30Var.D)) && n51.f.a(java.lang.Integer.valueOf(this.E), java.lang.Integer.valueOf(y30Var.E)) && n51.f.a(this.F, y30Var.F) && n51.f.a(java.lang.Integer.valueOf(this.G), java.lang.Integer.valueOf(y30Var.G)) && n51.f.a(java.lang.Integer.valueOf(this.H), java.lang.Integer.valueOf(y30Var.H));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.y30();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.I;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f35342d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f35343e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f35344f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35345g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f35346h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f35347i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f35348m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f35349n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f35350o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f35351p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f35352q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f35353r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f35354s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f35355t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f35356u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f35357v);
            }
            if (zArr[26]) {
                fVar.e(26, this.f35358w);
            }
            java.lang.String str = this.f35359x;
            if (str != null && zArr[28]) {
                fVar.j(28, str);
            }
            bw5.vr0 vr0Var = this.f35360y;
            if (vr0Var != null && zArr[29]) {
                fVar.i(29, vr0Var.computeSize());
                this.f35360y.writeFields(fVar);
            }
            bw5.vr0 vr0Var2 = this.f35361z;
            if (vr0Var2 != null && zArr[30]) {
                fVar.i(30, vr0Var2.computeSize());
                this.f35361z.writeFields(fVar);
            }
            bw5.vr0 vr0Var3 = this.A;
            if (vr0Var3 != null && zArr[31]) {
                fVar.i(31, vr0Var3.computeSize());
                this.A.writeFields(fVar);
            }
            bw5.vr0 vr0Var4 = this.B;
            if (vr0Var4 != null && zArr[32]) {
                fVar.i(32, vr0Var4.computeSize());
                this.B.writeFields(fVar);
            }
            bw5.vr0 vr0Var5 = this.C;
            if (vr0Var5 != null && zArr[33]) {
                fVar.i(33, vr0Var5.computeSize());
                this.C.writeFields(fVar);
            }
            if (zArr[34]) {
                fVar.e(34, this.D);
            }
            if (zArr[35]) {
                fVar.e(35, this.E);
            }
            fVar.g(36, 8, this.F);
            if (zArr[37]) {
                fVar.e(37, this.G);
            }
            if (zArr[38]) {
                fVar.e(38, this.H);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f35342d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f35343e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f35344f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f35345g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f35346h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f35347i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f35348m);
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f35349n);
            }
            if (zArr[9]) {
                e17 += b36.f.e(9, this.f35350o);
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f35351p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f35352q);
            }
            if (zArr[12]) {
                e17 += b36.f.e(12, this.f35353r);
            }
            if (zArr[13]) {
                e17 += b36.f.e(13, this.f35354s);
            }
            if (zArr[14]) {
                e17 += b36.f.e(14, this.f35355t);
            }
            if (zArr[15]) {
                e17 += b36.f.e(15, this.f35356u);
            }
            if (zArr[16]) {
                e17 += b36.f.e(16, this.f35357v);
            }
            if (zArr[26]) {
                e17 += b36.f.e(26, this.f35358w);
            }
            java.lang.String str2 = this.f35359x;
            if (str2 != null && zArr[28]) {
                e17 += b36.f.j(28, str2);
            }
            bw5.vr0 vr0Var6 = this.f35360y;
            if (vr0Var6 != null && zArr[29]) {
                e17 += b36.f.i(29, vr0Var6.computeSize());
            }
            bw5.vr0 vr0Var7 = this.f35361z;
            if (vr0Var7 != null && zArr[30]) {
                e17 += b36.f.i(30, vr0Var7.computeSize());
            }
            bw5.vr0 vr0Var8 = this.A;
            if (vr0Var8 != null && zArr[31]) {
                e17 += b36.f.i(31, vr0Var8.computeSize());
            }
            bw5.vr0 vr0Var9 = this.B;
            if (vr0Var9 != null && zArr[32]) {
                e17 += b36.f.i(32, vr0Var9.computeSize());
            }
            bw5.vr0 vr0Var10 = this.C;
            if (vr0Var10 != null && zArr[33]) {
                e17 += b36.f.i(33, vr0Var10.computeSize());
            }
            if (zArr[34]) {
                e17 += b36.f.e(34, this.D);
            }
            if (zArr[35]) {
                e17 += b36.f.e(35, this.E);
            }
            int g17 = e17 + b36.f.g(36, 8, this.F);
            if (zArr[37]) {
                g17 += b36.f.e(37, this.G);
            }
            return zArr[38] ? g17 + b36.f.e(38, this.H) : g17;
        }
        if (i17 == 2) {
            this.F.clear();
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
        if (intValue == 26) {
            this.f35358w = aVar2.g(intValue);
            zArr[26] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f35342d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35343e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35344f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35345g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35346h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35347i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f35348m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f35349n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f35350o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f35351p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f35352q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f35353r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f35354s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f35355t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f35356u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f35357v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            default:
                switch (intValue) {
                    case 28:
                        this.f35359x = aVar2.k(intValue);
                        zArr[28] = true;
                        return 0;
                    case 29:
                        java.util.LinkedList j17 = aVar2.j(intValue);
                        int size = j17.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            byte[] bArr = (byte[]) j17.get(i18);
                            bw5.vr0 vr0Var11 = new bw5.vr0();
                            if (bArr != null && bArr.length > 0) {
                                vr0Var11.parseFrom(bArr);
                            }
                            this.f35360y = vr0Var11;
                        }
                        zArr[29] = true;
                        return 0;
                    case 30:
                        java.util.LinkedList j18 = aVar2.j(intValue);
                        int size2 = j18.size();
                        for (int i19 = 0; i19 < size2; i19++) {
                            byte[] bArr2 = (byte[]) j18.get(i19);
                            bw5.vr0 vr0Var12 = new bw5.vr0();
                            if (bArr2 != null && bArr2.length > 0) {
                                vr0Var12.parseFrom(bArr2);
                            }
                            this.f35361z = vr0Var12;
                        }
                        zArr[30] = true;
                        return 0;
                    case 31:
                        java.util.LinkedList j19 = aVar2.j(intValue);
                        int size3 = j19.size();
                        for (int i27 = 0; i27 < size3; i27++) {
                            byte[] bArr3 = (byte[]) j19.get(i27);
                            bw5.vr0 vr0Var13 = new bw5.vr0();
                            if (bArr3 != null && bArr3.length > 0) {
                                vr0Var13.parseFrom(bArr3);
                            }
                            this.A = vr0Var13;
                        }
                        zArr[31] = true;
                        return 0;
                    case 32:
                        java.util.LinkedList j27 = aVar2.j(intValue);
                        int size4 = j27.size();
                        for (int i28 = 0; i28 < size4; i28++) {
                            byte[] bArr4 = (byte[]) j27.get(i28);
                            bw5.vr0 vr0Var14 = new bw5.vr0();
                            if (bArr4 != null && bArr4.length > 0) {
                                vr0Var14.parseFrom(bArr4);
                            }
                            this.B = vr0Var14;
                        }
                        zArr[32] = true;
                        return 0;
                    case 33:
                        java.util.LinkedList j28 = aVar2.j(intValue);
                        int size5 = j28.size();
                        for (int i29 = 0; i29 < size5; i29++) {
                            byte[] bArr5 = (byte[]) j28.get(i29);
                            bw5.vr0 vr0Var15 = new bw5.vr0();
                            if (bArr5 != null && bArr5.length > 0) {
                                vr0Var15.parseFrom(bArr5);
                            }
                            this.C = vr0Var15;
                        }
                        zArr[33] = true;
                        return 0;
                    case 34:
                        this.D = aVar2.g(intValue);
                        zArr[34] = true;
                        return 0;
                    case 35:
                        this.E = aVar2.g(intValue);
                        zArr[35] = true;
                        return 0;
                    case 36:
                        java.util.LinkedList j29 = aVar2.j(intValue);
                        int size6 = j29.size();
                        for (int i37 = 0; i37 < size6; i37++) {
                            byte[] bArr6 = (byte[]) j29.get(i37);
                            bw5.wr0 wr0Var = new bw5.wr0();
                            if (bArr6 != null && bArr6.length > 0) {
                                wr0Var.parseFrom(bArr6);
                            }
                            this.F.add(wr0Var);
                        }
                        zArr[36] = true;
                        return 0;
                    case 37:
                        this.G = aVar2.g(intValue);
                        zArr[37] = true;
                        return 0;
                    case 38:
                        this.H = aVar2.g(intValue);
                        zArr[38] = true;
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
