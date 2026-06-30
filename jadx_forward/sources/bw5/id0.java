package bw5;

/* loaded from: classes2.dex */
public class id0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f110072d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110073e;

    /* renamed from: f, reason: collision with root package name */
    public long f110074f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f110075g;

    /* renamed from: h, reason: collision with root package name */
    public int f110076h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f110077i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f110078m;

    /* renamed from: n, reason: collision with root package name */
    public int f110079n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.zc0 f110080o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.ad0 f110081p;

    /* renamed from: q, reason: collision with root package name */
    public int f110082q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.wc0 f110083r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f110084s;

    /* renamed from: t, reason: collision with root package name */
    public int f110085t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f110086u;

    /* renamed from: v, reason: collision with root package name */
    public int f110087v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f110088w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.hd0 f110089x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f110090y;

    /* renamed from: z, reason: collision with root package name */
    public final android.util.ArrayMap f110091z = new android.util.ArrayMap();

    static {
        new bw5.id0();
    }

    public bw5.zc0 b() {
        return m12146x6e095e9(101) ? this.f110080o : new bw5.zc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.id0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.id0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.id0)) {
            return false;
        }
        bw5.id0 id0Var = (bw5.id0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f110072d), java.lang.Integer.valueOf(id0Var.f110072d)) && n51.f.a(this.f110073e, id0Var.f110073e) && n51.f.a(java.lang.Long.valueOf(this.f110074f), java.lang.Long.valueOf(id0Var.f110074f)) && n51.f.a(java.lang.Boolean.valueOf(this.f110075g), java.lang.Boolean.valueOf(id0Var.f110075g)) && n51.f.a(java.lang.Integer.valueOf(this.f110076h), java.lang.Integer.valueOf(id0Var.f110076h)) && n51.f.a(this.f110077i, id0Var.f110077i) && n51.f.a(this.f110078m, id0Var.f110078m) && n51.f.a(java.lang.Integer.valueOf(this.f110079n), java.lang.Integer.valueOf(id0Var.f110079n)) && n51.f.a(this.f110080o, id0Var.f110080o) && n51.f.a(this.f110081p, id0Var.f110081p) && n51.f.a(java.lang.Integer.valueOf(this.f110082q), java.lang.Integer.valueOf(id0Var.f110082q)) && n51.f.a(this.f110083r, id0Var.f110083r) && n51.f.a(java.lang.Boolean.valueOf(this.f110084s), java.lang.Boolean.valueOf(id0Var.f110084s)) && n51.f.a(java.lang.Integer.valueOf(this.f110085t), java.lang.Integer.valueOf(id0Var.f110085t)) && n51.f.a(java.lang.Boolean.valueOf(this.f110086u), java.lang.Boolean.valueOf(id0Var.f110086u)) && n51.f.a(java.lang.Integer.valueOf(this.f110087v), java.lang.Integer.valueOf(id0Var.f110087v)) && n51.f.a(java.lang.Boolean.valueOf(this.f110088w), java.lang.Boolean.valueOf(id0Var.f110088w)) && n51.f.a(this.f110089x, id0Var.f110089x) && n51.f.a(java.lang.Boolean.valueOf(this.f110090y), java.lang.Boolean.valueOf(id0Var.f110090y));
    }

    public bw5.id0 d(int i17) {
        this.f110072d = i17;
        this.f110091z.put(1, java.lang.Boolean.TRUE);
        return this;
    }

    public bw5.id0 e(bw5.zc0 zc0Var) {
        this.f110080o = zc0Var;
        this.f110091z.put(101, java.lang.Boolean.TRUE);
        return this;
    }

    public bw5.id0 f(java.lang.String str) {
        this.f110073e = str;
        this.f110091z.put(2, java.lang.Boolean.TRUE);
        return this;
    }

    public bw5.id0 g(int i17) {
        this.f110085t = i17;
        this.f110091z.put(2001, java.lang.Boolean.TRUE);
        return this;
    }

    /* renamed from: hasFieldNumber */
    public boolean m12146x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f110091z.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.id0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (m12146x6e095e9(1)) {
                fVar.e(1, this.f110072d);
            }
            if (this.f110073e != null && m12146x6e095e9(2)) {
                fVar.j(2, this.f110073e);
            }
            if (m12146x6e095e9(3)) {
                fVar.h(3, this.f110074f);
            }
            if (m12146x6e095e9(4)) {
                fVar.a(4, this.f110075g);
            }
            if (m12146x6e095e9(50)) {
                fVar.e(50, this.f110076h);
            }
            if (this.f110077i != null && m12146x6e095e9(51)) {
                fVar.j(51, this.f110077i);
            }
            if (this.f110078m != null && m12146x6e095e9(99)) {
                fVar.j(99, this.f110078m);
            }
            if (m12146x6e095e9(100)) {
                fVar.e(100, this.f110079n);
            }
            if (this.f110080o != null && m12146x6e095e9(101)) {
                fVar.i(101, this.f110080o.mo75928xcd1e8d8());
                this.f110080o.mo75956x3d5d1f78(fVar);
            }
            if (this.f110081p != null && m12146x6e095e9(102)) {
                fVar.i(102, this.f110081p.mo75928xcd1e8d8());
                this.f110081p.mo75956x3d5d1f78(fVar);
            }
            if (m12146x6e095e9(201)) {
                fVar.e(201, this.f110082q);
            }
            if (this.f110083r != null && m12146x6e095e9(202)) {
                fVar.i(202, this.f110083r.mo75928xcd1e8d8());
                this.f110083r.mo75956x3d5d1f78(fVar);
            }
            if (m12146x6e095e9(2000)) {
                fVar.a(2000, this.f110084s);
            }
            if (m12146x6e095e9(2001)) {
                fVar.e(2001, this.f110085t);
            }
            if (m12146x6e095e9(2002)) {
                fVar.a(2002, this.f110086u);
            }
            if (m12146x6e095e9(2003)) {
                fVar.e(2003, this.f110087v);
            }
            if (m12146x6e095e9(3000)) {
                fVar.a(3000, this.f110088w);
            }
            if (this.f110089x != null && m12146x6e095e9(3001)) {
                fVar.i(3001, this.f110089x.mo75928xcd1e8d8());
                this.f110089x.mo75956x3d5d1f78(fVar);
            }
            if (m12146x6e095e9(3100)) {
                fVar.a(3100, this.f110090y);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = m12146x6e095e9(1) ? b36.f.e(1, this.f110072d) + 0 : 0;
            if (this.f110073e != null && m12146x6e095e9(2)) {
                e17 += b36.f.j(2, this.f110073e);
            }
            if (m12146x6e095e9(3)) {
                e17 += b36.f.h(3, this.f110074f);
            }
            if (m12146x6e095e9(4)) {
                e17 += b36.f.a(4, this.f110075g);
            }
            if (m12146x6e095e9(50)) {
                e17 += b36.f.e(50, this.f110076h);
            }
            if (this.f110077i != null && m12146x6e095e9(51)) {
                e17 += b36.f.j(51, this.f110077i);
            }
            if (this.f110078m != null && m12146x6e095e9(99)) {
                e17 += b36.f.j(99, this.f110078m);
            }
            if (m12146x6e095e9(100)) {
                e17 += b36.f.e(100, this.f110079n);
            }
            if (this.f110080o != null && m12146x6e095e9(101)) {
                e17 += b36.f.i(101, this.f110080o.mo75928xcd1e8d8());
            }
            if (this.f110081p != null && m12146x6e095e9(102)) {
                e17 += b36.f.i(102, this.f110081p.mo75928xcd1e8d8());
            }
            if (m12146x6e095e9(201)) {
                e17 += b36.f.e(201, this.f110082q);
            }
            if (this.f110083r != null && m12146x6e095e9(202)) {
                e17 += b36.f.i(202, this.f110083r.mo75928xcd1e8d8());
            }
            if (m12146x6e095e9(2000)) {
                e17 += b36.f.a(2000, this.f110084s);
            }
            if (m12146x6e095e9(2001)) {
                e17 += b36.f.e(2001, this.f110085t);
            }
            if (m12146x6e095e9(2002)) {
                e17 += b36.f.a(2002, this.f110086u);
            }
            if (m12146x6e095e9(2003)) {
                e17 += b36.f.e(2003, this.f110087v);
            }
            if (m12146x6e095e9(3000)) {
                e17 += b36.f.a(3000, this.f110088w);
            }
            if (this.f110089x != null && m12146x6e095e9(3001)) {
                e17 += b36.f.i(3001, this.f110089x.mo75928xcd1e8d8());
            }
            return m12146x6e095e9(3100) ? e17 + b36.f.a(3100, this.f110090y) : e17;
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
        android.util.ArrayMap arrayMap = this.f110091z;
        if (intValue == 1) {
            this.f110072d = aVar2.g(intValue);
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            this.f110073e = aVar2.k(intValue);
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3) {
            this.f110074f = aVar2.i(intValue);
            arrayMap.put(3, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 4) {
            this.f110075g = aVar2.c(intValue);
            arrayMap.put(4, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 50) {
            this.f110076h = aVar2.g(intValue);
            arrayMap.put(50, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 51) {
            this.f110077i = aVar2.k(intValue);
            arrayMap.put(51, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 201) {
            this.f110082q = aVar2.g(intValue);
            arrayMap.put(201, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 202) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.wc0 wc0Var = new bw5.wc0();
                if (bArr != null && bArr.length > 0) {
                    wc0Var.mo11468x92b714fd(bArr);
                }
                this.f110083r = wc0Var;
            }
            arrayMap.put(202, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3000) {
            this.f110088w = aVar2.c(intValue);
            arrayMap.put(3000, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3001) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.hd0 hd0Var = new bw5.hd0();
                if (bArr2 != null && bArr2.length > 0) {
                    hd0Var.mo11468x92b714fd(bArr2);
                }
                this.f110089x = hd0Var;
            }
            arrayMap.put(3001, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3100) {
            this.f110090y = aVar2.c(intValue);
            arrayMap.put(3100, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 99:
                this.f110078m = aVar2.k(intValue);
                arrayMap.put(99, java.lang.Boolean.TRUE);
                return 0;
            case 100:
                this.f110079n = aVar2.g(intValue);
                arrayMap.put(100, java.lang.Boolean.TRUE);
                return 0;
            case 101:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.zc0 zc0Var = new bw5.zc0();
                    if (bArr3 != null && bArr3.length > 0) {
                        zc0Var.mo11468x92b714fd(bArr3);
                    }
                    this.f110080o = zc0Var;
                }
                arrayMap.put(101, java.lang.Boolean.TRUE);
                return 0;
            case 102:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.ad0 ad0Var = new bw5.ad0();
                    if (bArr4 != null && bArr4.length > 0) {
                        ad0Var.mo11468x92b714fd(bArr4);
                    }
                    this.f110081p = ad0Var;
                }
                arrayMap.put(102, java.lang.Boolean.TRUE);
                return 0;
            default:
                switch (intValue) {
                    case 2000:
                        this.f110084s = aVar2.c(intValue);
                        arrayMap.put(2000, java.lang.Boolean.TRUE);
                        return 0;
                    case 2001:
                        this.f110085t = aVar2.g(intValue);
                        arrayMap.put(2001, java.lang.Boolean.TRUE);
                        return 0;
                    case 2002:
                        this.f110086u = aVar2.c(intValue);
                        arrayMap.put(2002, java.lang.Boolean.TRUE);
                        return 0;
                    case 2003:
                        this.f110087v = aVar2.g(intValue);
                        arrayMap.put(2003, java.lang.Boolean.TRUE);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
