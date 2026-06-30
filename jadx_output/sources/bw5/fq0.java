package bw5;

/* loaded from: classes2.dex */
public class fq0 extends com.tencent.mm.protobuf.f {
    public boolean A;
    public boolean B;
    public int C;
    public long D;
    public long E;
    public boolean F;
    public boolean G;
    public final boolean[] H = new boolean[31];

    /* renamed from: d, reason: collision with root package name */
    public float f27452d;

    /* renamed from: e, reason: collision with root package name */
    public int f27453e;

    /* renamed from: f, reason: collision with root package name */
    public int f27454f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.gp0 f27455g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27456h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f27457i;

    /* renamed from: m, reason: collision with root package name */
    public int f27458m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f27459n;

    /* renamed from: o, reason: collision with root package name */
    public int f27460o;

    /* renamed from: p, reason: collision with root package name */
    public int f27461p;

    /* renamed from: q, reason: collision with root package name */
    public long f27462q;

    /* renamed from: r, reason: collision with root package name */
    public long f27463r;

    /* renamed from: s, reason: collision with root package name */
    public long f27464s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f27465t;

    /* renamed from: u, reason: collision with root package name */
    public int f27466u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27467v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f27468w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f27469x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f27470y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f27471z;

    static {
        new bw5.fq0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fq0 parseFrom(byte[] bArr) {
        return (bw5.fq0) super.parseFrom(bArr);
    }

    public bw5.fq0 c(float f17) {
        this.f27452d = f17;
        this.H[1] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fq0)) {
            return false;
        }
        bw5.fq0 fq0Var = (bw5.fq0) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f27452d), java.lang.Float.valueOf(fq0Var.f27452d)) && n51.f.a(java.lang.Integer.valueOf(this.f27453e), java.lang.Integer.valueOf(fq0Var.f27453e)) && n51.f.a(java.lang.Integer.valueOf(this.f27454f), java.lang.Integer.valueOf(fq0Var.f27454f)) && n51.f.a(this.f27455g, fq0Var.f27455g) && n51.f.a(java.lang.Boolean.valueOf(this.f27456h), java.lang.Boolean.valueOf(fq0Var.f27456h)) && n51.f.a(java.lang.Boolean.valueOf(this.f27457i), java.lang.Boolean.valueOf(fq0Var.f27457i)) && n51.f.a(java.lang.Integer.valueOf(this.f27458m), java.lang.Integer.valueOf(fq0Var.f27458m)) && n51.f.a(this.f27459n, fq0Var.f27459n) && n51.f.a(java.lang.Integer.valueOf(this.f27460o), java.lang.Integer.valueOf(fq0Var.f27460o)) && n51.f.a(java.lang.Integer.valueOf(this.f27461p), java.lang.Integer.valueOf(fq0Var.f27461p)) && n51.f.a(java.lang.Long.valueOf(this.f27462q), java.lang.Long.valueOf(fq0Var.f27462q)) && n51.f.a(java.lang.Long.valueOf(this.f27463r), java.lang.Long.valueOf(fq0Var.f27463r)) && n51.f.a(java.lang.Long.valueOf(this.f27464s), java.lang.Long.valueOf(fq0Var.f27464s)) && n51.f.a(java.lang.Boolean.valueOf(this.f27465t), java.lang.Boolean.valueOf(fq0Var.f27465t)) && n51.f.a(java.lang.Integer.valueOf(this.f27466u), java.lang.Integer.valueOf(fq0Var.f27466u)) && n51.f.a(this.f27467v, fq0Var.f27467v) && n51.f.a(this.f27468w, fq0Var.f27468w) && n51.f.a(java.lang.Boolean.valueOf(this.f27469x), java.lang.Boolean.valueOf(fq0Var.f27469x)) && n51.f.a(java.lang.Boolean.valueOf(this.f27470y), java.lang.Boolean.valueOf(fq0Var.f27470y)) && n51.f.a(java.lang.Boolean.valueOf(this.f27471z), java.lang.Boolean.valueOf(fq0Var.f27471z)) && n51.f.a(java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(fq0Var.A)) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(fq0Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(fq0Var.C)) && n51.f.a(java.lang.Long.valueOf(this.D), java.lang.Long.valueOf(fq0Var.D)) && n51.f.a(java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(fq0Var.E)) && n51.f.a(java.lang.Boolean.valueOf(this.F), java.lang.Boolean.valueOf(fq0Var.F)) && n51.f.a(java.lang.Boolean.valueOf(this.G), java.lang.Boolean.valueOf(fq0Var.G));
    }

    public bw5.fq0 d(int i17) {
        this.f27453e = i17;
        this.H[2] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.H;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f27452d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27453e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27454f);
            }
            bw5.gp0 gp0Var = this.f27455g;
            if (gp0Var != null && zArr[4]) {
                fVar.i(4, gp0Var.computeSize());
                this.f27455g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.a(5, this.f27456h);
            }
            if (zArr[7]) {
                fVar.a(7, this.f27457i);
            }
            if (zArr[8]) {
                fVar.e(8, this.f27458m);
            }
            java.lang.String str = this.f27459n;
            if (str != null && zArr[9]) {
                fVar.j(9, str);
            }
            if (zArr[10]) {
                fVar.e(10, this.f27460o);
            }
            if (zArr[11]) {
                fVar.e(11, this.f27461p);
            }
            if (zArr[12]) {
                fVar.h(12, this.f27462q);
            }
            if (zArr[13]) {
                fVar.h(13, this.f27463r);
            }
            if (zArr[14]) {
                fVar.h(14, this.f27464s);
            }
            if (zArr[15]) {
                fVar.a(15, this.f27465t);
            }
            if (zArr[16]) {
                fVar.e(16, this.f27466u);
            }
            com.tencent.mm.protobuf.g gVar = this.f27467v;
            if (gVar != null && zArr[17]) {
                fVar.b(17, gVar);
            }
            java.lang.String str2 = this.f27468w;
            if (str2 != null && zArr[18]) {
                fVar.j(18, str2);
            }
            if (zArr[19]) {
                fVar.a(19, this.f27469x);
            }
            if (zArr[20]) {
                fVar.a(20, this.f27470y);
            }
            if (zArr[21]) {
                fVar.a(21, this.f27471z);
            }
            if (zArr[24]) {
                fVar.a(24, this.A);
            }
            if (zArr[25]) {
                fVar.a(25, this.B);
            }
            if (zArr[26]) {
                fVar.e(26, this.C);
            }
            if (zArr[27]) {
                fVar.h(27, this.D);
            }
            if (zArr[28]) {
                fVar.h(28, this.E);
            }
            if (zArr[29]) {
                fVar.a(29, this.F);
            }
            if (zArr[30]) {
                fVar.a(30, this.G);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? b36.f.d(1, this.f27452d) + 0 : 0;
            if (zArr[2]) {
                d17 += b36.f.e(2, this.f27453e);
            }
            if (zArr[3]) {
                d17 += b36.f.e(3, this.f27454f);
            }
            bw5.gp0 gp0Var2 = this.f27455g;
            if (gp0Var2 != null && zArr[4]) {
                d17 += b36.f.i(4, gp0Var2.computeSize());
            }
            if (zArr[5]) {
                d17 += b36.f.a(5, this.f27456h);
            }
            if (zArr[7]) {
                d17 += b36.f.a(7, this.f27457i);
            }
            if (zArr[8]) {
                d17 += b36.f.e(8, this.f27458m);
            }
            java.lang.String str3 = this.f27459n;
            if (str3 != null && zArr[9]) {
                d17 += b36.f.j(9, str3);
            }
            if (zArr[10]) {
                d17 += b36.f.e(10, this.f27460o);
            }
            if (zArr[11]) {
                d17 += b36.f.e(11, this.f27461p);
            }
            if (zArr[12]) {
                d17 += b36.f.h(12, this.f27462q);
            }
            if (zArr[13]) {
                d17 += b36.f.h(13, this.f27463r);
            }
            if (zArr[14]) {
                d17 += b36.f.h(14, this.f27464s);
            }
            if (zArr[15]) {
                d17 += b36.f.a(15, this.f27465t);
            }
            if (zArr[16]) {
                d17 += b36.f.e(16, this.f27466u);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27467v;
            if (gVar2 != null && zArr[17]) {
                d17 += b36.f.b(17, gVar2);
            }
            java.lang.String str4 = this.f27468w;
            if (str4 != null && zArr[18]) {
                d17 += b36.f.j(18, str4);
            }
            if (zArr[19]) {
                d17 += b36.f.a(19, this.f27469x);
            }
            if (zArr[20]) {
                d17 += b36.f.a(20, this.f27470y);
            }
            if (zArr[21]) {
                d17 += b36.f.a(21, this.f27471z);
            }
            if (zArr[24]) {
                d17 += b36.f.a(24, this.A);
            }
            if (zArr[25]) {
                d17 += b36.f.a(25, this.B);
            }
            if (zArr[26]) {
                d17 += b36.f.e(26, this.C);
            }
            if (zArr[27]) {
                d17 += b36.f.h(27, this.D);
            }
            if (zArr[28]) {
                d17 += b36.f.h(28, this.E);
            }
            if (zArr[29]) {
                d17 += b36.f.a(29, this.F);
            }
            return zArr[30] ? d17 + b36.f.a(30, this.G) : d17;
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
                this.f27452d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27453e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27454f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.gp0 gp0Var3 = new bw5.gp0();
                    if (bArr != null && bArr.length > 0) {
                        gp0Var3.parseFrom(bArr);
                    }
                    this.f27455g = gp0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f27456h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
            case 22:
            case 23:
            default:
                return -1;
            case 7:
                this.f27457i = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27458m = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f27459n = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f27460o = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f27461p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f27462q = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f27463r = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f27464s = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f27465t = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f27466u = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f27467v = aVar2.d(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f27468w = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f27469x = aVar2.c(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f27470y = aVar2.c(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.f27471z = aVar2.c(intValue);
                zArr[21] = true;
                return 0;
            case 24:
                this.A = aVar2.c(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.B = aVar2.c(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.C = aVar2.g(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.D = aVar2.i(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.E = aVar2.i(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.F = aVar2.c(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                this.G = aVar2.c(intValue);
                zArr[30] = true;
                return 0;
        }
    }
}
