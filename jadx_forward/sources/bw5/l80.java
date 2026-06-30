package bw5;

/* loaded from: classes11.dex */
public class l80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f111216d;

    /* renamed from: e, reason: collision with root package name */
    public int f111217e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111218f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f111219g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f111220h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f111221i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f111222m;

    /* renamed from: n, reason: collision with root package name */
    public long f111223n;

    /* renamed from: o, reason: collision with root package name */
    public long f111224o;

    /* renamed from: p, reason: collision with root package name */
    public long f111225p;

    /* renamed from: q, reason: collision with root package name */
    public long f111226q;

    /* renamed from: r, reason: collision with root package name */
    public final android.util.ArrayMap f111227r = new android.util.ArrayMap();

    static {
        new bw5.l80();
    }

    public java.lang.String b() {
        return m12387x6e095e9(5) ? this.f111220h : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.l80 mo11468x92b714fd(byte[] bArr) {
        return (bw5.l80) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l80)) {
            return false;
        }
        bw5.l80 l80Var = (bw5.l80) fVar;
        return n51.f.a(this.f111216d, l80Var.f111216d) && n51.f.a(java.lang.Integer.valueOf(this.f111217e), java.lang.Integer.valueOf(l80Var.f111217e)) && n51.f.a(this.f111218f, l80Var.f111218f) && n51.f.a(this.f111219g, l80Var.f111219g) && n51.f.a(this.f111220h, l80Var.f111220h) && n51.f.a(this.f111221i, l80Var.f111221i) && n51.f.a(this.f111222m, l80Var.f111222m) && n51.f.a(java.lang.Long.valueOf(this.f111223n), java.lang.Long.valueOf(l80Var.f111223n)) && n51.f.a(java.lang.Long.valueOf(this.f111224o), java.lang.Long.valueOf(l80Var.f111224o)) && n51.f.a(java.lang.Long.valueOf(this.f111225p), java.lang.Long.valueOf(l80Var.f111225p)) && n51.f.a(java.lang.Long.valueOf(this.f111226q), java.lang.Long.valueOf(l80Var.f111226q));
    }

    /* renamed from: getFilePath */
    public java.lang.String m12386x5000ed37() {
        return m12387x6e095e9(1) ? this.f111216d : "";
    }

    /* renamed from: hasFieldNumber */
    public boolean m12387x6e095e9(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f111227r.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.l80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f111216d != null && m12387x6e095e9(1)) {
                fVar.j(1, this.f111216d);
            }
            if (m12387x6e095e9(2)) {
                fVar.e(2, this.f111217e);
            }
            if (this.f111218f != null && m12387x6e095e9(3)) {
                fVar.j(3, this.f111218f);
            }
            if (this.f111219g != null && m12387x6e095e9(4)) {
                fVar.j(4, this.f111219g);
            }
            if (this.f111220h != null && m12387x6e095e9(5)) {
                fVar.j(5, this.f111220h);
            }
            if (this.f111221i != null && m12387x6e095e9(10)) {
                fVar.j(10, this.f111221i);
            }
            if (this.f111222m != null && m12387x6e095e9(100)) {
                fVar.j(100, this.f111222m);
            }
            if (m12387x6e095e9(101)) {
                fVar.h(101, this.f111223n);
            }
            if (m12387x6e095e9(102)) {
                fVar.h(102, this.f111224o);
            }
            if (m12387x6e095e9(200)) {
                fVar.h(200, this.f111225p);
            }
            if (m12387x6e095e9(201)) {
                fVar.h(201, this.f111226q);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f111216d != null && m12387x6e095e9(1)) {
                i18 = 0 + b36.f.j(1, this.f111216d);
            }
            if (m12387x6e095e9(2)) {
                i18 += b36.f.e(2, this.f111217e);
            }
            if (this.f111218f != null && m12387x6e095e9(3)) {
                i18 += b36.f.j(3, this.f111218f);
            }
            if (this.f111219g != null && m12387x6e095e9(4)) {
                i18 += b36.f.j(4, this.f111219g);
            }
            if (this.f111220h != null && m12387x6e095e9(5)) {
                i18 += b36.f.j(5, this.f111220h);
            }
            if (this.f111221i != null && m12387x6e095e9(10)) {
                i18 += b36.f.j(10, this.f111221i);
            }
            if (this.f111222m != null && m12387x6e095e9(100)) {
                i18 += b36.f.j(100, this.f111222m);
            }
            if (m12387x6e095e9(101)) {
                i18 += b36.f.h(101, this.f111223n);
            }
            if (m12387x6e095e9(102)) {
                i18 += b36.f.h(102, this.f111224o);
            }
            if (m12387x6e095e9(200)) {
                i18 += b36.f.h(200, this.f111225p);
            }
            return m12387x6e095e9(201) ? i18 + b36.f.h(201, this.f111226q) : i18;
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
        android.util.ArrayMap arrayMap = this.f111227r;
        if (intValue == 1) {
            this.f111216d = aVar2.k(intValue);
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            this.f111217e = aVar2.g(intValue);
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3) {
            this.f111218f = aVar2.k(intValue);
            arrayMap.put(3, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 4) {
            this.f111219g = aVar2.k(intValue);
            arrayMap.put(4, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 5) {
            this.f111220h = aVar2.k(intValue);
            arrayMap.put(5, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 10) {
            this.f111221i = aVar2.k(intValue);
            arrayMap.put(10, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 200) {
            this.f111225p = aVar2.i(intValue);
            arrayMap.put(200, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 201) {
            this.f111226q = aVar2.i(intValue);
            arrayMap.put(201, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 100:
                this.f111222m = aVar2.k(intValue);
                arrayMap.put(100, java.lang.Boolean.TRUE);
                return 0;
            case 101:
                this.f111223n = aVar2.i(intValue);
                arrayMap.put(101, java.lang.Boolean.TRUE);
                return 0;
            case 102:
                this.f111224o = aVar2.i(intValue);
                arrayMap.put(102, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
