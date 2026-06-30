package bw5;

/* loaded from: classes2.dex */
public class d90 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final boolean[] E = new boolean[32];

    /* renamed from: d, reason: collision with root package name */
    public boolean f107914d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f107915e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f107916f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f107917g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f107918h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f107919i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f107920m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f107921n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f107922o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f107923p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f107924q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f107925r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f107926s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f107927t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f107928u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f107929v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f107930w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f107931x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f107932y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f107933z;

    static {
        new bw5.d90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.d90 mo11468x92b714fd(byte[] bArr) {
        return (bw5.d90) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.d90)) {
            return false;
        }
        bw5.d90 d90Var = (bw5.d90) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f107914d), java.lang.Boolean.valueOf(d90Var.f107914d)) && n51.f.a(java.lang.Boolean.valueOf(this.f107915e), java.lang.Boolean.valueOf(d90Var.f107915e)) && n51.f.a(java.lang.Boolean.valueOf(this.f107916f), java.lang.Boolean.valueOf(d90Var.f107916f)) && n51.f.a(java.lang.Boolean.valueOf(this.f107917g), java.lang.Boolean.valueOf(d90Var.f107917g)) && n51.f.a(java.lang.Boolean.valueOf(this.f107918h), java.lang.Boolean.valueOf(d90Var.f107918h)) && n51.f.a(java.lang.Boolean.valueOf(this.f107919i), java.lang.Boolean.valueOf(d90Var.f107919i)) && n51.f.a(java.lang.Boolean.valueOf(this.f107920m), java.lang.Boolean.valueOf(d90Var.f107920m)) && n51.f.a(java.lang.Boolean.valueOf(this.f107921n), java.lang.Boolean.valueOf(d90Var.f107921n)) && n51.f.a(java.lang.Boolean.valueOf(this.f107922o), java.lang.Boolean.valueOf(d90Var.f107922o)) && n51.f.a(java.lang.Boolean.valueOf(this.f107923p), java.lang.Boolean.valueOf(d90Var.f107923p)) && n51.f.a(java.lang.Boolean.valueOf(this.f107924q), java.lang.Boolean.valueOf(d90Var.f107924q)) && n51.f.a(java.lang.Boolean.valueOf(this.f107925r), java.lang.Boolean.valueOf(d90Var.f107925r)) && n51.f.a(java.lang.Boolean.valueOf(this.f107926s), java.lang.Boolean.valueOf(d90Var.f107926s)) && n51.f.a(java.lang.Boolean.valueOf(this.f107927t), java.lang.Boolean.valueOf(d90Var.f107927t)) && n51.f.a(java.lang.Boolean.valueOf(this.f107928u), java.lang.Boolean.valueOf(d90Var.f107928u)) && n51.f.a(java.lang.Boolean.valueOf(this.f107929v), java.lang.Boolean.valueOf(d90Var.f107929v)) && n51.f.a(java.lang.Boolean.valueOf(this.f107930w), java.lang.Boolean.valueOf(d90Var.f107930w)) && n51.f.a(java.lang.Boolean.valueOf(this.f107931x), java.lang.Boolean.valueOf(d90Var.f107931x)) && n51.f.a(java.lang.Boolean.valueOf(this.f107932y), java.lang.Boolean.valueOf(d90Var.f107932y)) && n51.f.a(java.lang.Boolean.valueOf(this.f107933z), java.lang.Boolean.valueOf(d90Var.f107933z)) && n51.f.a(java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(d90Var.A)) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(d90Var.B)) && n51.f.a(java.lang.Boolean.valueOf(this.C), java.lang.Boolean.valueOf(d90Var.C)) && n51.f.a(java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(d90Var.D));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.d90();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.E;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f107914d);
            }
            if (zArr[9]) {
                fVar.a(9, this.f107915e);
            }
            if (zArr[10]) {
                fVar.a(10, this.f107916f);
            }
            if (zArr[11]) {
                fVar.a(11, this.f107917g);
            }
            if (zArr[12]) {
                fVar.a(12, this.f107918h);
            }
            if (zArr[13]) {
                fVar.a(13, this.f107919i);
            }
            if (zArr[14]) {
                fVar.a(14, this.f107920m);
            }
            if (zArr[15]) {
                fVar.a(15, this.f107921n);
            }
            if (zArr[16]) {
                fVar.a(16, this.f107922o);
            }
            if (zArr[17]) {
                fVar.a(17, this.f107923p);
            }
            if (zArr[18]) {
                fVar.a(18, this.f107924q);
            }
            if (zArr[19]) {
                fVar.a(19, this.f107925r);
            }
            if (zArr[20]) {
                fVar.a(20, this.f107926s);
            }
            if (zArr[21]) {
                fVar.a(21, this.f107927t);
            }
            if (zArr[22]) {
                fVar.a(22, this.f107928u);
            }
            if (zArr[23]) {
                fVar.a(23, this.f107929v);
            }
            if (zArr[24]) {
                fVar.a(24, this.f107930w);
            }
            if (zArr[25]) {
                fVar.a(25, this.f107931x);
            }
            if (zArr[26]) {
                fVar.a(26, this.f107932y);
            }
            if (zArr[27]) {
                fVar.a(27, this.f107933z);
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
            int a17 = zArr[1] ? b36.f.a(1, this.f107914d) + 0 : 0;
            if (zArr[9]) {
                a17 += b36.f.a(9, this.f107915e);
            }
            if (zArr[10]) {
                a17 += b36.f.a(10, this.f107916f);
            }
            if (zArr[11]) {
                a17 += b36.f.a(11, this.f107917g);
            }
            if (zArr[12]) {
                a17 += b36.f.a(12, this.f107918h);
            }
            if (zArr[13]) {
                a17 += b36.f.a(13, this.f107919i);
            }
            if (zArr[14]) {
                a17 += b36.f.a(14, this.f107920m);
            }
            if (zArr[15]) {
                a17 += b36.f.a(15, this.f107921n);
            }
            if (zArr[16]) {
                a17 += b36.f.a(16, this.f107922o);
            }
            if (zArr[17]) {
                a17 += b36.f.a(17, this.f107923p);
            }
            if (zArr[18]) {
                a17 += b36.f.a(18, this.f107924q);
            }
            if (zArr[19]) {
                a17 += b36.f.a(19, this.f107925r);
            }
            if (zArr[20]) {
                a17 += b36.f.a(20, this.f107926s);
            }
            if (zArr[21]) {
                a17 += b36.f.a(21, this.f107927t);
            }
            if (zArr[22]) {
                a17 += b36.f.a(22, this.f107928u);
            }
            if (zArr[23]) {
                a17 += b36.f.a(23, this.f107929v);
            }
            if (zArr[24]) {
                a17 += b36.f.a(24, this.f107930w);
            }
            if (zArr[25]) {
                a17 += b36.f.a(25, this.f107931x);
            }
            if (zArr[26]) {
                a17 += b36.f.a(26, this.f107932y);
            }
            if (zArr[27]) {
                a17 += b36.f.a(27, this.f107933z);
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
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
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
            this.f107914d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        switch (intValue) {
            case 9:
                this.f107915e = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f107916f = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f107917g = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f107918h = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f107919i = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f107920m = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f107921n = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f107922o = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f107923p = aVar2.c(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f107924q = aVar2.c(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f107925r = aVar2.c(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f107926s = aVar2.c(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.f107927t = aVar2.c(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.f107928u = aVar2.c(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.f107929v = aVar2.c(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.f107930w = aVar2.c(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.f107931x = aVar2.c(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.f107932y = aVar2.c(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.f107933z = aVar2.c(intValue);
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
