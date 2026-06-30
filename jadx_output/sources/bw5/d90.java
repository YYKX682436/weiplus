package bw5;

/* loaded from: classes2.dex */
public class d90 extends com.tencent.mm.protobuf.f {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final boolean[] E = new boolean[32];

    /* renamed from: d, reason: collision with root package name */
    public boolean f26381d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26382e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26383f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26384g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f26385h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26386i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26387m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f26388n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26389o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f26390p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f26391q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f26392r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f26393s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f26394t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f26395u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f26396v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f26397w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f26398x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f26399y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f26400z;

    static {
        new bw5.d90();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.d90 parseFrom(byte[] bArr) {
        return (bw5.d90) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.d90)) {
            return false;
        }
        bw5.d90 d90Var = (bw5.d90) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f26381d), java.lang.Boolean.valueOf(d90Var.f26381d)) && n51.f.a(java.lang.Boolean.valueOf(this.f26382e), java.lang.Boolean.valueOf(d90Var.f26382e)) && n51.f.a(java.lang.Boolean.valueOf(this.f26383f), java.lang.Boolean.valueOf(d90Var.f26383f)) && n51.f.a(java.lang.Boolean.valueOf(this.f26384g), java.lang.Boolean.valueOf(d90Var.f26384g)) && n51.f.a(java.lang.Boolean.valueOf(this.f26385h), java.lang.Boolean.valueOf(d90Var.f26385h)) && n51.f.a(java.lang.Boolean.valueOf(this.f26386i), java.lang.Boolean.valueOf(d90Var.f26386i)) && n51.f.a(java.lang.Boolean.valueOf(this.f26387m), java.lang.Boolean.valueOf(d90Var.f26387m)) && n51.f.a(java.lang.Boolean.valueOf(this.f26388n), java.lang.Boolean.valueOf(d90Var.f26388n)) && n51.f.a(java.lang.Boolean.valueOf(this.f26389o), java.lang.Boolean.valueOf(d90Var.f26389o)) && n51.f.a(java.lang.Boolean.valueOf(this.f26390p), java.lang.Boolean.valueOf(d90Var.f26390p)) && n51.f.a(java.lang.Boolean.valueOf(this.f26391q), java.lang.Boolean.valueOf(d90Var.f26391q)) && n51.f.a(java.lang.Boolean.valueOf(this.f26392r), java.lang.Boolean.valueOf(d90Var.f26392r)) && n51.f.a(java.lang.Boolean.valueOf(this.f26393s), java.lang.Boolean.valueOf(d90Var.f26393s)) && n51.f.a(java.lang.Boolean.valueOf(this.f26394t), java.lang.Boolean.valueOf(d90Var.f26394t)) && n51.f.a(java.lang.Boolean.valueOf(this.f26395u), java.lang.Boolean.valueOf(d90Var.f26395u)) && n51.f.a(java.lang.Boolean.valueOf(this.f26396v), java.lang.Boolean.valueOf(d90Var.f26396v)) && n51.f.a(java.lang.Boolean.valueOf(this.f26397w), java.lang.Boolean.valueOf(d90Var.f26397w)) && n51.f.a(java.lang.Boolean.valueOf(this.f26398x), java.lang.Boolean.valueOf(d90Var.f26398x)) && n51.f.a(java.lang.Boolean.valueOf(this.f26399y), java.lang.Boolean.valueOf(d90Var.f26399y)) && n51.f.a(java.lang.Boolean.valueOf(this.f26400z), java.lang.Boolean.valueOf(d90Var.f26400z)) && n51.f.a(java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(d90Var.A)) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(d90Var.B)) && n51.f.a(java.lang.Boolean.valueOf(this.C), java.lang.Boolean.valueOf(d90Var.C)) && n51.f.a(java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(d90Var.D));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.d90();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f26381d);
            }
            if (zArr[9]) {
                fVar.a(9, this.f26382e);
            }
            if (zArr[10]) {
                fVar.a(10, this.f26383f);
            }
            if (zArr[11]) {
                fVar.a(11, this.f26384g);
            }
            if (zArr[12]) {
                fVar.a(12, this.f26385h);
            }
            if (zArr[13]) {
                fVar.a(13, this.f26386i);
            }
            if (zArr[14]) {
                fVar.a(14, this.f26387m);
            }
            if (zArr[15]) {
                fVar.a(15, this.f26388n);
            }
            if (zArr[16]) {
                fVar.a(16, this.f26389o);
            }
            if (zArr[17]) {
                fVar.a(17, this.f26390p);
            }
            if (zArr[18]) {
                fVar.a(18, this.f26391q);
            }
            if (zArr[19]) {
                fVar.a(19, this.f26392r);
            }
            if (zArr[20]) {
                fVar.a(20, this.f26393s);
            }
            if (zArr[21]) {
                fVar.a(21, this.f26394t);
            }
            if (zArr[22]) {
                fVar.a(22, this.f26395u);
            }
            if (zArr[23]) {
                fVar.a(23, this.f26396v);
            }
            if (zArr[24]) {
                fVar.a(24, this.f26397w);
            }
            if (zArr[25]) {
                fVar.a(25, this.f26398x);
            }
            if (zArr[26]) {
                fVar.a(26, this.f26399y);
            }
            if (zArr[27]) {
                fVar.a(27, this.f26400z);
            }
            if (zArr[28]) {
                fVar.a(28, this.A);
            }
            if (zArr[29]) {
                fVar.a(29, this.B);
            }
            if (zArr[30]) {
                fVar.a(30, this.C);
            }
            if (zArr[31]) {
                fVar.a(31, this.D);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? b36.f.a(1, this.f26381d) + 0 : 0;
            if (zArr[9]) {
                a17 += b36.f.a(9, this.f26382e);
            }
            if (zArr[10]) {
                a17 += b36.f.a(10, this.f26383f);
            }
            if (zArr[11]) {
                a17 += b36.f.a(11, this.f26384g);
            }
            if (zArr[12]) {
                a17 += b36.f.a(12, this.f26385h);
            }
            if (zArr[13]) {
                a17 += b36.f.a(13, this.f26386i);
            }
            if (zArr[14]) {
                a17 += b36.f.a(14, this.f26387m);
            }
            if (zArr[15]) {
                a17 += b36.f.a(15, this.f26388n);
            }
            if (zArr[16]) {
                a17 += b36.f.a(16, this.f26389o);
            }
            if (zArr[17]) {
                a17 += b36.f.a(17, this.f26390p);
            }
            if (zArr[18]) {
                a17 += b36.f.a(18, this.f26391q);
            }
            if (zArr[19]) {
                a17 += b36.f.a(19, this.f26392r);
            }
            if (zArr[20]) {
                a17 += b36.f.a(20, this.f26393s);
            }
            if (zArr[21]) {
                a17 += b36.f.a(21, this.f26394t);
            }
            if (zArr[22]) {
                a17 += b36.f.a(22, this.f26395u);
            }
            if (zArr[23]) {
                a17 += b36.f.a(23, this.f26396v);
            }
            if (zArr[24]) {
                a17 += b36.f.a(24, this.f26397w);
            }
            if (zArr[25]) {
                a17 += b36.f.a(25, this.f26398x);
            }
            if (zArr[26]) {
                a17 += b36.f.a(26, this.f26399y);
            }
            if (zArr[27]) {
                a17 += b36.f.a(27, this.f26400z);
            }
            if (zArr[28]) {
                a17 += b36.f.a(28, this.A);
            }
            if (zArr[29]) {
                a17 += b36.f.a(29, this.B);
            }
            if (zArr[30]) {
                a17 += b36.f.a(30, this.C);
            }
            return zArr[31] ? a17 + b36.f.a(31, this.D) : a17;
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
        if (intValue == 1) {
            this.f26381d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        switch (intValue) {
            case 9:
                this.f26382e = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f26383f = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f26384g = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f26385h = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f26386i = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f26387m = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f26388n = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f26389o = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f26390p = aVar2.c(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f26391q = aVar2.c(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f26392r = aVar2.c(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f26393s = aVar2.c(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.f26394t = aVar2.c(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.f26395u = aVar2.c(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.f26396v = aVar2.c(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.f26397w = aVar2.c(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.f26398x = aVar2.c(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.f26399y = aVar2.c(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.f26400z = aVar2.c(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.A = aVar2.c(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.B = aVar2.c(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                this.C = aVar2.c(intValue);
                zArr[30] = true;
                return 0;
            case 31:
                this.D = aVar2.c(intValue);
                zArr[31] = true;
                return 0;
            default:
                return -1;
        }
    }
}
