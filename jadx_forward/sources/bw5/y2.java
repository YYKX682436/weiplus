package bw5;

/* loaded from: classes2.dex */
public class y2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public int B;
    public java.lang.String C;
    public java.lang.String D;
    public final android.util.ArrayMap E = new android.util.ArrayMap();

    /* renamed from: d, reason: collision with root package name */
    public long f116845d;

    /* renamed from: e, reason: collision with root package name */
    public int f116846e;

    /* renamed from: f, reason: collision with root package name */
    public long f116847f;

    /* renamed from: g, reason: collision with root package name */
    public long f116848g;

    /* renamed from: h, reason: collision with root package name */
    public long f116849h;

    /* renamed from: i, reason: collision with root package name */
    public long f116850i;

    /* renamed from: m, reason: collision with root package name */
    public long f116851m;

    /* renamed from: n, reason: collision with root package name */
    public long f116852n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f116853o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f116854p;

    /* renamed from: q, reason: collision with root package name */
    public long f116855q;

    /* renamed from: r, reason: collision with root package name */
    public long f116856r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f116857s;

    /* renamed from: t, reason: collision with root package name */
    public long f116858t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f116859u;

    /* renamed from: v, reason: collision with root package name */
    public int f116860v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f116861w;

    /* renamed from: x, reason: collision with root package name */
    public int f116862x;

    /* renamed from: y, reason: collision with root package name */
    public int f116863y;

    /* renamed from: z, reason: collision with root package name */
    public int f116864z;

    static {
        new bw5.y2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y2)) {
            return false;
        }
        bw5.y2 y2Var = (bw5.y2) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f116845d), java.lang.Long.valueOf(y2Var.f116845d)) && n51.f.a(java.lang.Integer.valueOf(this.f116846e), java.lang.Integer.valueOf(y2Var.f116846e)) && n51.f.a(java.lang.Long.valueOf(this.f116847f), java.lang.Long.valueOf(y2Var.f116847f)) && n51.f.a(java.lang.Long.valueOf(this.f116848g), java.lang.Long.valueOf(y2Var.f116848g)) && n51.f.a(java.lang.Long.valueOf(this.f116849h), java.lang.Long.valueOf(y2Var.f116849h)) && n51.f.a(java.lang.Long.valueOf(this.f116850i), java.lang.Long.valueOf(y2Var.f116850i)) && n51.f.a(java.lang.Long.valueOf(this.f116851m), java.lang.Long.valueOf(y2Var.f116851m)) && n51.f.a(java.lang.Long.valueOf(this.f116852n), java.lang.Long.valueOf(y2Var.f116852n)) && n51.f.a(this.f116853o, y2Var.f116853o) && n51.f.a(this.f116854p, y2Var.f116854p) && n51.f.a(java.lang.Long.valueOf(this.f116855q), java.lang.Long.valueOf(y2Var.f116855q)) && n51.f.a(java.lang.Long.valueOf(this.f116856r), java.lang.Long.valueOf(y2Var.f116856r)) && n51.f.a(this.f116857s, y2Var.f116857s) && n51.f.a(java.lang.Long.valueOf(this.f116858t), java.lang.Long.valueOf(y2Var.f116858t)) && n51.f.a(this.f116859u, y2Var.f116859u) && n51.f.a(java.lang.Integer.valueOf(this.f116860v), java.lang.Integer.valueOf(y2Var.f116860v)) && n51.f.a(this.f116861w, y2Var.f116861w) && n51.f.a(java.lang.Integer.valueOf(this.f116862x), java.lang.Integer.valueOf(y2Var.f116862x)) && n51.f.a(java.lang.Integer.valueOf(this.f116863y), java.lang.Integer.valueOf(y2Var.f116863y)) && n51.f.a(java.lang.Integer.valueOf(this.f116864z), java.lang.Integer.valueOf(y2Var.f116864z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(y2Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(y2Var.B)) && n51.f.a(this.C, y2Var.C) && n51.f.a(this.D, y2Var.D);
    }

    /* renamed from: hasFieldNumber */
    public boolean m13379x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.E.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.y2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (m13379x6e095e9(1)) {
                fVar.h(1, this.f116845d);
            }
            if (m13379x6e095e9(2)) {
                fVar.e(2, this.f116846e);
            }
            if (m13379x6e095e9(3)) {
                fVar.h(3, this.f116847f);
            }
            if (m13379x6e095e9(4)) {
                fVar.h(4, this.f116848g);
            }
            if (m13379x6e095e9(5)) {
                fVar.h(5, this.f116849h);
            }
            if (m13379x6e095e9(6)) {
                fVar.h(6, this.f116850i);
            }
            if (m13379x6e095e9(7)) {
                fVar.h(7, this.f116851m);
            }
            if (m13379x6e095e9(8)) {
                fVar.h(8, this.f116852n);
            }
            if (this.f116853o != null && m13379x6e095e9(63)) {
                fVar.j(63, this.f116853o);
            }
            if (this.f116854p != null && m13379x6e095e9(101)) {
                fVar.j(101, this.f116854p);
            }
            if (m13379x6e095e9(102)) {
                fVar.h(102, this.f116855q);
            }
            if (m13379x6e095e9(201)) {
                fVar.h(201, this.f116856r);
            }
            if (this.f116857s != null && m13379x6e095e9(301)) {
                fVar.j(301, this.f116857s);
            }
            if (m13379x6e095e9(302)) {
                fVar.h(302, this.f116858t);
            }
            if (this.f116859u != null && m13379x6e095e9(303)) {
                fVar.j(303, this.f116859u);
            }
            if (m13379x6e095e9(304)) {
                fVar.e(304, this.f116860v);
            }
            if (this.f116861w != null && m13379x6e095e9(313)) {
                fVar.j(313, this.f116861w);
            }
            if (m13379x6e095e9(qf1.j.f76479x366c91de)) {
                fVar.e(qf1.j.f76479x366c91de, this.f116862x);
            }
            if (m13379x6e095e9(qf1.f.f76475x366c91de)) {
                fVar.e(qf1.f.f76475x366c91de, this.f116863y);
            }
            if (m13379x6e095e9(319)) {
                fVar.e(319, this.f116864z);
            }
            if (m13379x6e095e9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e)) {
                fVar.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, this.A);
            }
            if (m13379x6e095e9(321)) {
                fVar.e(321, this.B);
            }
            if (this.C != null && m13379x6e095e9(702)) {
                fVar.j(702, this.C);
            }
            if (this.D != null && m13379x6e095e9(807)) {
                fVar.j(807, this.D);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = m13379x6e095e9(1) ? b36.f.h(1, this.f116845d) + 0 : 0;
            if (m13379x6e095e9(2)) {
                h17 += b36.f.e(2, this.f116846e);
            }
            if (m13379x6e095e9(3)) {
                h17 += b36.f.h(3, this.f116847f);
            }
            if (m13379x6e095e9(4)) {
                h17 += b36.f.h(4, this.f116848g);
            }
            if (m13379x6e095e9(5)) {
                h17 += b36.f.h(5, this.f116849h);
            }
            if (m13379x6e095e9(6)) {
                h17 += b36.f.h(6, this.f116850i);
            }
            if (m13379x6e095e9(7)) {
                h17 += b36.f.h(7, this.f116851m);
            }
            if (m13379x6e095e9(8)) {
                h17 += b36.f.h(8, this.f116852n);
            }
            if (this.f116853o != null && m13379x6e095e9(63)) {
                h17 += b36.f.j(63, this.f116853o);
            }
            if (this.f116854p != null && m13379x6e095e9(101)) {
                h17 += b36.f.j(101, this.f116854p);
            }
            if (m13379x6e095e9(102)) {
                h17 += b36.f.h(102, this.f116855q);
            }
            if (m13379x6e095e9(201)) {
                h17 += b36.f.h(201, this.f116856r);
            }
            if (this.f116857s != null && m13379x6e095e9(301)) {
                h17 += b36.f.j(301, this.f116857s);
            }
            if (m13379x6e095e9(302)) {
                h17 += b36.f.h(302, this.f116858t);
            }
            if (this.f116859u != null && m13379x6e095e9(303)) {
                h17 += b36.f.j(303, this.f116859u);
            }
            if (m13379x6e095e9(304)) {
                h17 += b36.f.e(304, this.f116860v);
            }
            if (this.f116861w != null && m13379x6e095e9(313)) {
                h17 += b36.f.j(313, this.f116861w);
            }
            if (m13379x6e095e9(qf1.j.f76479x366c91de)) {
                h17 += b36.f.e(qf1.j.f76479x366c91de, this.f116862x);
            }
            if (m13379x6e095e9(qf1.f.f76475x366c91de)) {
                h17 += b36.f.e(qf1.f.f76475x366c91de, this.f116863y);
            }
            if (m13379x6e095e9(319)) {
                h17 += b36.f.e(319, this.f116864z);
            }
            if (m13379x6e095e9(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e)) {
                h17 += b36.f.e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, this.A);
            }
            if (m13379x6e095e9(321)) {
                h17 += b36.f.e(321, this.B);
            }
            if (this.C != null && m13379x6e095e9(702)) {
                h17 += b36.f.j(702, this.C);
            }
            return (this.D == null || !m13379x6e095e9(807)) ? h17 : h17 + b36.f.j(807, this.D);
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
        android.util.ArrayMap arrayMap = this.E;
        if (intValue == 63) {
            this.f116853o = aVar2.k(intValue);
            arrayMap.put(63, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 201) {
            this.f116856r = aVar2.i(intValue);
            arrayMap.put(201, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 313) {
            this.f116861w = aVar2.k(intValue);
            arrayMap.put(313, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 702) {
            this.C = aVar2.k(intValue);
            arrayMap.put(702, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 807) {
            this.D = aVar2.k(intValue);
            arrayMap.put(807, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 101) {
            this.f116854p = aVar2.k(intValue);
            arrayMap.put(101, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 102) {
            this.f116855q = aVar2.i(intValue);
            arrayMap.put(102, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f116845d = aVar2.i(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f116846e = aVar2.g(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f116847f = aVar2.i(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                this.f116848g = aVar2.i(intValue);
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f116849h = aVar2.i(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f116850i = aVar2.i(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            case 7:
                this.f116851m = aVar2.i(intValue);
                arrayMap.put(7, java.lang.Boolean.TRUE);
                return 0;
            case 8:
                this.f116852n = aVar2.i(intValue);
                arrayMap.put(8, java.lang.Boolean.TRUE);
                return 0;
            default:
                switch (intValue) {
                    case 301:
                        this.f116857s = aVar2.k(intValue);
                        arrayMap.put(301, java.lang.Boolean.TRUE);
                        return 0;
                    case 302:
                        this.f116858t = aVar2.i(intValue);
                        arrayMap.put(302, java.lang.Boolean.TRUE);
                        return 0;
                    case 303:
                        this.f116859u = aVar2.k(intValue);
                        arrayMap.put(303, java.lang.Boolean.TRUE);
                        return 0;
                    case 304:
                        this.f116860v = aVar2.g(intValue);
                        arrayMap.put(304, java.lang.Boolean.TRUE);
                        return 0;
                    default:
                        switch (intValue) {
                            case qf1.j.f76479x366c91de /* 317 */:
                                this.f116862x = aVar2.g(intValue);
                                arrayMap.put(java.lang.Integer.valueOf(qf1.j.f76479x366c91de), java.lang.Boolean.TRUE);
                                return 0;
                            case qf1.f.f76475x366c91de /* 318 */:
                                this.f116863y = aVar2.g(intValue);
                                arrayMap.put(java.lang.Integer.valueOf(qf1.f.f76475x366c91de), java.lang.Boolean.TRUE);
                                return 0;
                            case 319:
                                this.f116864z = aVar2.g(intValue);
                                arrayMap.put(319, java.lang.Boolean.TRUE);
                                return 0;
                            case com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e /* 320 */:
                                this.A = aVar2.g(intValue);
                                arrayMap.put(java.lang.Integer.valueOf(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e), java.lang.Boolean.TRUE);
                                return 0;
                            case 321:
                                this.B = aVar2.g(intValue);
                                arrayMap.put(321, java.lang.Boolean.TRUE);
                                return 0;
                            default:
                                return -1;
                        }
                }
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.y2) super.mo11468x92b714fd(bArr);
    }
}
