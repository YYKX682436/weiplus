package bw5;

/* loaded from: classes2.dex */
public class zp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public final boolean[] F = new boolean[26];

    /* renamed from: d, reason: collision with root package name */
    public long f117627d;

    /* renamed from: e, reason: collision with root package name */
    public int f117628e;

    /* renamed from: f, reason: collision with root package name */
    public int f117629f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f117630g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f117631h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f117632i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f117633m;

    /* renamed from: n, reason: collision with root package name */
    public int f117634n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f117635o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f117636p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f117637q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f117638r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f117639s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f117640t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f117641u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f117642v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f117643w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f117644x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f117645y;

    /* renamed from: z, reason: collision with root package name */
    public long f117646z;

    static {
        new bw5.zp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zp0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.zp0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zp0)) {
            return false;
        }
        bw5.zp0 zp0Var = (bw5.zp0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f117627d), java.lang.Long.valueOf(zp0Var.f117627d)) && n51.f.a(java.lang.Integer.valueOf(this.f117628e), java.lang.Integer.valueOf(zp0Var.f117628e)) && n51.f.a(java.lang.Integer.valueOf(this.f117629f), java.lang.Integer.valueOf(zp0Var.f117629f)) && n51.f.a(java.lang.Boolean.valueOf(this.f117630g), java.lang.Boolean.valueOf(zp0Var.f117630g)) && n51.f.a(java.lang.Boolean.valueOf(this.f117631h), java.lang.Boolean.valueOf(zp0Var.f117631h)) && n51.f.a(java.lang.Boolean.valueOf(this.f117632i), java.lang.Boolean.valueOf(zp0Var.f117632i)) && n51.f.a(java.lang.Boolean.valueOf(this.f117633m), java.lang.Boolean.valueOf(zp0Var.f117633m)) && n51.f.a(java.lang.Integer.valueOf(this.f117634n), java.lang.Integer.valueOf(zp0Var.f117634n)) && n51.f.a(java.lang.Boolean.valueOf(this.f117635o), java.lang.Boolean.valueOf(zp0Var.f117635o)) && n51.f.a(java.lang.Boolean.valueOf(this.f117636p), java.lang.Boolean.valueOf(zp0Var.f117636p)) && n51.f.a(java.lang.Boolean.valueOf(this.f117637q), java.lang.Boolean.valueOf(zp0Var.f117637q)) && n51.f.a(java.lang.Boolean.valueOf(this.f117638r), java.lang.Boolean.valueOf(zp0Var.f117638r)) && n51.f.a(java.lang.Boolean.valueOf(this.f117639s), java.lang.Boolean.valueOf(zp0Var.f117639s)) && n51.f.a(java.lang.Boolean.valueOf(this.f117640t), java.lang.Boolean.valueOf(zp0Var.f117640t)) && n51.f.a(java.lang.Boolean.valueOf(this.f117641u), java.lang.Boolean.valueOf(zp0Var.f117641u)) && n51.f.a(java.lang.Boolean.valueOf(this.f117642v), java.lang.Boolean.valueOf(zp0Var.f117642v)) && n51.f.a(java.lang.Boolean.valueOf(this.f117643w), java.lang.Boolean.valueOf(zp0Var.f117643w)) && n51.f.a(java.lang.Boolean.valueOf(this.f117644x), java.lang.Boolean.valueOf(zp0Var.f117644x)) && n51.f.a(this.f117645y, zp0Var.f117645y) && n51.f.a(java.lang.Long.valueOf(this.f117646z), java.lang.Long.valueOf(zp0Var.f117646z)) && n51.f.a(java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(zp0Var.A)) && n51.f.a(java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(zp0Var.B)) && n51.f.a(java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(zp0Var.C)) && n51.f.a(java.lang.Long.valueOf(this.D), java.lang.Long.valueOf(zp0Var.D)) && n51.f.a(java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(zp0Var.E));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.F;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f117627d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f117628e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f117629f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f117630g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f117631h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f117632i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f117633m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f117634n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f117635o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f117636p);
            }
            if (zArr[11]) {
                fVar.a(11, this.f117637q);
            }
            if (zArr[12]) {
                fVar.a(12, this.f117638r);
            }
            if (zArr[13]) {
                fVar.a(13, this.f117639s);
            }
            if (zArr[14]) {
                fVar.a(14, this.f117640t);
            }
            if (zArr[15]) {
                fVar.a(15, this.f117641u);
            }
            if (zArr[16]) {
                fVar.a(16, this.f117642v);
            }
            if (zArr[17]) {
                fVar.a(17, this.f117643w);
            }
            if (zArr[18]) {
                fVar.a(18, this.f117644x);
            }
            java.lang.String str = this.f117645y;
            if (str != null && zArr[19]) {
                fVar.j(19, str);
            }
            if (zArr[20]) {
                fVar.h(20, this.f117646z);
            }
            if (zArr[21]) {
                fVar.h(21, this.A);
            }
            if (zArr[22]) {
                fVar.h(22, this.B);
            }
            if (zArr[23]) {
                fVar.h(23, this.C);
            }
            if (zArr[24]) {
                fVar.h(24, this.D);
            }
            if (zArr[25]) {
                fVar.h(25, this.E);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f117627d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f117628e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f117629f);
            }
            if (zArr[4]) {
                h17 += b36.f.a(4, this.f117630g);
            }
            if (zArr[5]) {
                h17 += b36.f.a(5, this.f117631h);
            }
            if (zArr[6]) {
                h17 += b36.f.a(6, this.f117632i);
            }
            if (zArr[7]) {
                h17 += b36.f.a(7, this.f117633m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f117634n);
            }
            if (zArr[9]) {
                h17 += b36.f.a(9, this.f117635o);
            }
            if (zArr[10]) {
                h17 += b36.f.a(10, this.f117636p);
            }
            if (zArr[11]) {
                h17 += b36.f.a(11, this.f117637q);
            }
            if (zArr[12]) {
                h17 += b36.f.a(12, this.f117638r);
            }
            if (zArr[13]) {
                h17 += b36.f.a(13, this.f117639s);
            }
            if (zArr[14]) {
                h17 += b36.f.a(14, this.f117640t);
            }
            if (zArr[15]) {
                h17 += b36.f.a(15, this.f117641u);
            }
            if (zArr[16]) {
                h17 += b36.f.a(16, this.f117642v);
            }
            if (zArr[17]) {
                h17 += b36.f.a(17, this.f117643w);
            }
            if (zArr[18]) {
                h17 += b36.f.a(18, this.f117644x);
            }
            java.lang.String str2 = this.f117645y;
            if (str2 != null && zArr[19]) {
                h17 += b36.f.j(19, str2);
            }
            if (zArr[20]) {
                h17 += b36.f.h(20, this.f117646z);
            }
            if (zArr[21]) {
                h17 += b36.f.h(21, this.A);
            }
            if (zArr[22]) {
                h17 += b36.f.h(22, this.B);
            }
            if (zArr[23]) {
                h17 += b36.f.h(23, this.C);
            }
            if (zArr[24]) {
                h17 += b36.f.h(24, this.D);
            }
            return zArr[25] ? h17 + b36.f.h(25, this.E) : h17;
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
        switch (intValue) {
            case 1:
                this.f117627d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f117628e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f117629f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f117630g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f117631h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117632i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f117633m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f117634n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f117635o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f117636p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f117637q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f117638r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f117639s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f117640t = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f117641u = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f117642v = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f117643w = aVar2.c(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f117644x = aVar2.c(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f117645y = aVar2.k(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f117646z = aVar2.i(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.i(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.i(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.i(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.i(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.i(intValue);
                zArr[25] = true;
                return 0;
            default:
                return -1;
        }
    }
}
