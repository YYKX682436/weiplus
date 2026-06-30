package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class v implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public int f133944d;

    /* renamed from: e, reason: collision with root package name */
    public double f133945e;

    /* renamed from: f, reason: collision with root package name */
    public double f133946f;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Rect f133954n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f133955o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk f133956p;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mapsdk.internal.v.d f133958r;

    /* renamed from: g, reason: collision with root package name */
    public double f133947g = 0.0d;

    /* renamed from: h, reason: collision with root package name */
    public double f133948h = 1.0d;

    /* renamed from: i, reason: collision with root package name */
    public double f133949i = 0.0d;

    /* renamed from: j, reason: collision with root package name */
    public double f133950j = 1.0d;

    /* renamed from: k, reason: collision with root package name */
    public double f133951k = 0.0d;

    /* renamed from: l, reason: collision with root package name */
    public double f133952l = 1.0d;

    /* renamed from: s, reason: collision with root package name */
    public boolean f133959s = false;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List<com.tencent.mapsdk.internal.v.a> f133960t = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: a, reason: collision with root package name */
    public int f133941a = 0;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.v.b f133942b = new com.tencent.mapsdk.internal.v.b();

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f133943c = new android.graphics.Rect();

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df f133953m = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df();

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu f133957q = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu();

    /* renamed from: com.tencent.mapsdk.internal.v$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f133961a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gf.a().length];
            f133961a = iArr;
            try {
                iArr[com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gf.f131110c - 1] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public interface a {
        boolean a();

        boolean a(float f17, float f18);

        boolean b();
    }

    /* loaded from: classes13.dex */
    public static class b implements java.lang.Cloneable {

        /* renamed from: a, reason: collision with root package name */
        public static final int f133962a = 22;

        /* renamed from: b, reason: collision with root package name */
        public static final int f133963b = 20;

        /* renamed from: c, reason: collision with root package name */
        public static final int f133964c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f133965d = 19;

        /* renamed from: e, reason: collision with root package name */
        public static final int f133966e = 16;

        /* renamed from: f, reason: collision with root package name */
        public static final float f133967f = 4.0f;

        /* renamed from: g, reason: collision with root package name */
        public static final float f133968g = 3.0517578E-5f;

        /* renamed from: n, reason: collision with root package name */
        public static final int f133969n = 20;

        /* renamed from: o, reason: collision with root package name */
        public static final int f133970o = 1;

        /* renamed from: p, reason: collision with root package name */
        public static final float f133971p = 1.9073486E-6f;

        /* renamed from: l, reason: collision with root package name */
        public float f133976l;

        /* renamed from: m, reason: collision with root package name */
        public int f133977m;

        /* renamed from: i, reason: collision with root package name */
        public float f133973i = 4.0f;

        /* renamed from: h, reason: collision with root package name */
        public float f133972h = 3.0517578E-5f;

        /* renamed from: k, reason: collision with root package name */
        public int f133975k = 20;

        /* renamed from: j, reason: collision with root package name */
        public int f133974j = 3;

        public static float a(int i17) {
            return (1 << (i17 - 1)) * 1.9073486E-6f;
        }

        private int c() {
            return this.f133977m;
        }

        private int d() {
            return this.f133974j;
        }

        private int e() {
            return this.f133975k;
        }

        private static int f() {
            return 20;
        }

        private float g() {
            return this.f133972h;
        }

        /* renamed from: clone */
        public final java.lang.Object m37065x5a5dd5d() {
            return super.clone();
        }

        /* renamed from: equals */
        public final boolean m37066xb2c87fbf(java.lang.Object obj) {
            if (!(obj instanceof com.tencent.mapsdk.internal.v.b)) {
                return false;
            }
            com.tencent.mapsdk.internal.v.b bVar = (com.tencent.mapsdk.internal.v.b) obj;
            return this.f133976l == bVar.f133976l && this.f133977m == bVar.f133977m;
        }

        /* renamed from: hashCode */
        public final int m37067x8cdac1b() {
            return m37068x9616526c().hashCode();
        }

        /* renamed from: toString */
        public final java.lang.String m37068x9616526c() {
            return "scale:" + this.f133976l + ", scaleLevel:" + this.f133977m;
        }

        private void a(float f17) {
            this.f133976l = f17;
        }

        private void b(float f17) {
            com.tencent.mapsdk.internal.v.b bVar = new com.tencent.mapsdk.internal.v.b();
            this.f133974j = bVar.f133977m;
            this.f133972h = f17 / bVar.a();
        }

        private void c(int i17) {
            this.f133974j = i17;
        }

        public final void a(int i17, float f17) {
            this.f133976l = f17;
            this.f133977m = i17;
        }

        private void a(com.tencent.mapsdk.internal.v.b bVar) {
            this.f133972h = bVar.f133972h;
            this.f133973i = bVar.f133973i;
            this.f133974j = bVar.f133974j;
            this.f133975k = bVar.f133975k;
            this.f133976l = bVar.f133976l;
            this.f133977m = bVar.f133977m;
        }

        private float b() {
            return this.f133976l;
        }

        private void b(int i17) {
            this.f133975k = i17;
        }

        public final float a() {
            return this.f133976l / a(this.f133977m);
        }
    }

    /* loaded from: classes13.dex */
    public static class c implements java.lang.Comparable<com.tencent.mapsdk.internal.v.c> {

        /* renamed from: a, reason: collision with root package name */
        public long f133978a;

        /* renamed from: b, reason: collision with root package name */
        public long f133979b;

        /* renamed from: c, reason: collision with root package name */
        public long f133980c;

        public c() {
        }

        private int a(com.tencent.mapsdk.internal.v.c cVar) {
            return (this.f133978a + "," + this.f133979b + "," + this.f133980c).compareTo(cVar.f133978a + "," + cVar.f133979b + "," + cVar.f133980c);
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(com.tencent.mapsdk.internal.v.c cVar) {
            com.tencent.mapsdk.internal.v.c cVar2 = cVar;
            return (this.f133978a + "," + this.f133979b + "," + this.f133980c).compareTo(cVar2.f133978a + "," + cVar2.f133979b + "," + cVar2.f133980c);
        }

        /* renamed from: equals */
        public final boolean m37069xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && com.tencent.mapsdk.internal.v.c.class == obj.getClass()) {
                com.tencent.mapsdk.internal.v.c cVar = (com.tencent.mapsdk.internal.v.c) obj;
                if (this.f133978a == cVar.f133978a && this.f133979b == cVar.f133979b && this.f133980c == cVar.f133980c) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: hashCode */
        public final int m37070x8cdac1b() {
            return java.util.Objects.hash(java.lang.Long.valueOf(this.f133978a), java.lang.Long.valueOf(this.f133979b), java.lang.Long.valueOf(this.f133980c));
        }

        /* renamed from: toString */
        public final java.lang.String m37071x9616526c() {
            return "MapTile{x=" + this.f133978a + ", y=" + this.f133979b + ", z=" + this.f133980c + '}';
        }

        public c(long j17, long j18, long j19) {
            this.f133978a = j17;
            this.f133979b = j18;
            this.f133980c = j19;
        }
    }

    public v(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar) {
        this.f133955o = neVar;
        this.f133956p = neVar.f132039f;
    }

    private com.tencent.mapsdk.internal.v.d A() {
        return this.f133958r;
    }

    private static byte[] B() {
        return null;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v vVar) {
        this.f133941a = vVar.f133941a;
        com.tencent.mapsdk.internal.v.b bVar = this.f133942b;
        com.tencent.mapsdk.internal.v.b bVar2 = vVar.f133942b;
        bVar.f133972h = bVar2.f133972h;
        bVar.f133973i = bVar2.f133973i;
        bVar.f133974j = bVar2.f133974j;
        bVar.f133975k = bVar2.f133975k;
        bVar.f133976l = bVar2.f133976l;
        bVar.f133977m = bVar2.f133977m;
        this.f133943c.set(vVar.f133943c);
        this.f133944d = vVar.f133944d;
        this.f133945e = vVar.f133945e;
        this.f133946f = vVar.f133946f;
        this.f133947g = vVar.f133947g;
        this.f133948h = vVar.f133948h;
        this.f133949i = vVar.f133949i;
        this.f133950j = vVar.f133950j;
        this.f133951k = vVar.f133951k;
        this.f133952l = vVar.f133952l;
        this.f133953m.m35333xe3065f41(vVar.f133953m);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar = this.f133957q;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar2 = vVar.f133957q;
        fuVar.a(fuVar2.f131000a, fuVar2.f131001b);
        this.f133954n = vVar.f133954n;
    }

    public static boolean b(int i17) {
        return i17 == 8 || i17 == 13 || i17 == 10;
    }

    private int c() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f133956p;
        if (tkVar == null) {
            return this.f133941a;
        }
        return tkVar.u();
    }

    private float d() {
        return this.f133956p.s();
    }

    private double e() {
        return this.f133947g;
    }

    public static float f(float f17) {
        if (f17 < 16.0f) {
            return 40.0f;
        }
        if (f17 >= 16.0f && f17 < 17.0f) {
            return ((f17 - 16.0f) * 10.0f) + 40.0f;
        }
        if (f17 >= 17.0f && f17 < 18.0f) {
            return ((f17 - 17.0f) * 10.0f) + 50.0f;
        }
        if (f17 < 18.0f || f17 >= 19.0f) {
            return 75.0f;
        }
        return ((f17 - 18.0f) * 15.0f) + 60.0f;
    }

    private double g() {
        return this.f133949i;
    }

    private double h() {
        return this.f133950j;
    }

    private double i() {
        return this.f133952l;
    }

    private double j() {
        return this.f133951k;
    }

    private float k() {
        return this.f133956p.r();
    }

    private java.util.List<com.tencent.mapsdk.internal.v.a> l() {
        return this.f133960t;
    }

    private void m() {
        this.f133960t.clear();
    }

    private int n() {
        return this.f133944d;
    }

    private double o() {
        return this.f133945e;
    }

    private double p() {
        return this.f133946f;
    }

    private float q() {
        return this.f133942b.f133976l;
    }

    private int r() {
        return this.f133942b.f133977m;
    }

    private float s() {
        return this.f133942b.a();
    }

    private int t() {
        return this.f133942b.f133974j;
    }

    private int u() {
        return this.f133942b.f133975k;
    }

    private static int v() {
        return 20;
    }

    private float w() {
        return this.f133942b.f133972h;
    }

    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df x() {
        return this.f133953m;
    }

    private android.graphics.Rect y() {
        return this.f133954n;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu z() {
        return this.f133957q;
    }

    /* renamed from: clone */
    public final java.lang.Object m37060x5a5dd5d() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v vVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v) super.clone();
        vVar.f133943c = new android.graphics.Rect(this.f133943c);
        vVar.f133942b = (com.tencent.mapsdk.internal.v.b) this.f133942b.m37065x5a5dd5d();
        vVar.f133953m = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(this.f133953m);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar = this.f133957q;
        vVar.f133957q = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(fuVar.f131000a, fuVar.f131001b);
        return vVar;
    }

    /* renamed from: equals */
    public final boolean m37061xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v)) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v vVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v) obj;
        return vVar.f133953m.m35330xb2c87fbf(this.f133953m) && vVar.f133942b.m37066xb2c87fbf(this.f133942b) && vVar.f133941a == this.f133941a;
    }

    /* renamed from: hashCode */
    public final int m37062x8cdac1b() {
        return m37063x9616526c().hashCode();
    }

    /* renamed from: toString */
    public final java.lang.String m37063x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mapParam: ");
        sb6.append("center:" + this.f133953m.mo35338x9616526c() + " ");
        sb6.append("mode:" + this.f133941a + " ");
        sb6.append("mapScale:" + this.f133942b.m37068x9616526c() + " ");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("screenRect:");
        android.graphics.Rect rect = this.f133954n;
        sb7.append(rect != null ? rect.toString() : "null");
        sb7.append(" ");
        sb6.append(sb7.toString());
        return sb6.toString();
    }

    /* loaded from: classes13.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public float f133981a;

        /* renamed from: b, reason: collision with root package name */
        public float f133982b;

        public d(float f17, float f18) {
            this.f133981a = f17;
            this.f133982b = f18;
        }

        private void a(float f17, float f18) {
            this.f133981a = f17;
            this.f133982b = f18;
        }

        private float b() {
            return this.f133982b;
        }

        private float a() {
            return this.f133981a;
        }
    }

    private void b() {
        if (this.f133955o == null) {
            return;
        }
        this.f133953m = this.f133956p.o();
        int q17 = this.f133956p.q();
        float p17 = this.f133956p.p();
        com.tencent.mapsdk.internal.v.b bVar = this.f133942b;
        if (q17 != bVar.f133977m) {
            this.f133955o.f132041h.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gf.f131110c);
        } else if (p17 != bVar.f133976l) {
            this.f133955o.f132041h.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gf.f131109b);
        }
        if (this.f133942b != null) {
            float d17 = d(p17);
            if (d17 < a()) {
                float f17 = f(d17);
                if (this.f133956p.r() > f17) {
                    b(f17);
                }
            }
            this.f133942b.a(q17, p17);
        }
    }

    public static float d(float f17) {
        return ((float) (java.lang.Math.log(f17) / java.lang.Math.log(2.0d))) + 20.0f;
    }

    private double f() {
        return this.f133948h;
    }

    private int g(float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f133956p;
        if (tkVar != null) {
            tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass195(f17));
        }
        this.f133942b.f133976l = f17;
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gf.f131110c;
    }

    private void h(float f17) {
        float d17 = d(f17);
        if (d17 >= a()) {
            return;
        }
        float f18 = f(d17);
        if (this.f133956p.r() <= f18) {
            return;
        }
        b(f18);
    }

    private void i(float f17) {
        if (this.f133959s) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25956x399f079e.f49214xa889cb19 = f(f17);
        } else {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25956x399f079e.f49214xa889cb19 = 40.0f;
        }
    }

    public final void e(int i17) {
        this.f133942b.f133974j = i17;
    }

    private void f(int i17) {
        double d17 = (1 << i17) * 256;
        this.f133944d = (int) d17;
        this.f133945e = d17 / 360.0d;
        this.f133946f = d17 / 6.283185307179586d;
    }

    public final void d(int i17) {
        this.f133942b.f133975k = i17;
    }

    public final int c(float f17) {
        int i17;
        float f18;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        int i18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gf.f131108a;
        com.tencent.mapsdk.internal.v.b bVar = this.f133942b;
        float f19 = bVar.f133976l;
        int i19 = bVar.f133977m;
        java.util.Iterator<com.tencent.mapsdk.internal.v.a> it = this.f133960t.iterator();
        while (it.hasNext()) {
            if (it.next().a(f17, f19)) {
                return i18;
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f133956p;
        if (tkVar != null) {
            double d17 = f17;
            if (0 != tkVar.f133194e && (neVar = tkVar.f133199j) != null) {
                neVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass193(d17));
            }
            f18 = this.f133956p.p();
            i17 = this.f133956p.q();
        } else {
            i17 = i19;
            f18 = f19;
        }
        this.f133942b.a(i17, f18);
        if (i17 != i19) {
            i18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gf.f131110c;
        } else if (f18 != f19) {
            i18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gf.f131109b;
        }
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v.AnonymousClass1.f133961a[i18 - 1] == 1) {
            double d18 = (1 << this.f133942b.f133977m) * 256;
            this.f133944d = (int) d18;
            this.f133945e = d18 / 360.0d;
            this.f133946f = d18 / 6.283185307179586d;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.a(this, this.f133953m);
        this.f133957q.a(a17.f131000a, a17.f131001b);
        return i18;
    }

    public final void e(float f17) {
        com.tencent.mapsdk.internal.v.b bVar = this.f133942b;
        com.tencent.mapsdk.internal.v.b bVar2 = new com.tencent.mapsdk.internal.v.b();
        bVar.f133974j = bVar2.f133977m;
        bVar.f133972h = f17 / bVar2.a();
    }

    private static float g(int i17) {
        return com.tencent.mapsdk.internal.v.b.a(i17);
    }

    private void a(android.graphics.Rect rect, int i17, int i18) {
        this.f133954n = rect;
        this.f133943c = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26022x384048dd.f49450x9b60171d;
        c(13);
        a(0);
        a(i17, i18, false);
    }

    public final float b(float f17) {
        if (this.f133956p.r() == f17) {
            return f17;
        }
        i(a());
        float max = java.lang.Math.max(0.0f, java.lang.Math.min(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25956x399f079e.f49214xa889cb19, f17));
        double radians = java.lang.Math.toRadians(f17);
        this.f133949i = java.lang.Math.sin(radians);
        this.f133950j = java.lang.Math.cos(radians);
        double d17 = 1.5707963267948966d - radians;
        this.f133952l = java.lang.Math.cos(d17);
        this.f133951k = java.lang.Math.sin(d17);
        this.f133956p.b(max);
        return max;
    }

    public final boolean a(int i17) {
        int u17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f133956p;
        if (tkVar == null || (u17 = tkVar.u()) == i17) {
            return false;
        }
        if (u17 == 11) {
            this.f133955o.b(false);
        }
        if (i17 == 11) {
            this.f133955o.b(true);
        }
        this.f133941a = i17;
        this.f133956p.e(i17);
        this.f133956p.e(b(i17));
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, "setMapStyle : styleId[" + i17 + "]");
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f133955o;
        if (neVar.f132050q) {
            neVar.K();
        }
        return true;
    }

    public final boolean c(int i17) {
        return c(com.tencent.mapsdk.internal.v.b.a(i17)) == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gf.f131110c;
    }

    private void b(com.tencent.mapsdk.internal.v.a aVar) {
        if (aVar != null) {
            this.f133960t.remove(aVar);
        }
    }

    private boolean b(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        int i17;
        int i18;
        int m35331xbc3301f3 = c4247x704e24df.m35331xbc3301f3();
        int m35332x962aa94a = c4247x704e24df.m35332x962aa94a();
        int i19 = 1 << (20 - this.f133942b.f133977m);
        if (131072 > i19) {
            i17 = ((this.f133954n.width() * 131072) - (this.f133954n.width() * i19)) / 2;
            i18 = ((this.f133954n.height() * 131072) - (this.f133954n.height() * i19)) / 2;
        } else {
            i17 = 0;
            i18 = 0;
        }
        android.graphics.Rect rect = this.f133943c;
        int i27 = rect.left - i17;
        int i28 = rect.right + i17;
        int i29 = rect.top - i18;
        int i37 = rect.bottom + i18;
        if (m35331xbc3301f3 < i29) {
            m35331xbc3301f3 = i29;
        }
        if (m35331xbc3301f3 <= i37) {
            i37 = m35331xbc3301f3;
        }
        if (m35332x962aa94a < i27) {
            m35332x962aa94a = i27;
        }
        if (m35332x962aa94a <= i28) {
            i28 = m35332x962aa94a;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i37, i28);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f133956p;
        tkVar.f133199j.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass190(c4247x704e24df2));
        return true;
    }

    public final float a(float f17) {
        if (this.f133956p.s() == f17) {
            return f17;
        }
        float f18 = f17 % 360.0f;
        double radians = java.lang.Math.toRadians(f17);
        this.f133947g = java.lang.Math.sin(radians);
        this.f133948h = java.lang.Math.cos(radians);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f133956p;
        tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass15(f18));
        return f18;
    }

    public final void a(com.tencent.mapsdk.internal.v.a aVar) {
        if (this.f133960t.contains(aVar)) {
            return;
        }
        this.f133960t.add(aVar);
    }

    private boolean b(int i17, int i18) {
        int i19;
        int i27;
        int i28 = 1 << (20 - this.f133942b.f133977m);
        if (131072 > i28) {
            i19 = ((this.f133954n.width() * 131072) - (this.f133954n.width() * i28)) / 2;
            i27 = ((this.f133954n.height() * 131072) - (this.f133954n.height() * i28)) / 2;
        } else {
            i19 = 0;
            i27 = 0;
        }
        android.graphics.Rect rect = this.f133943c;
        int i29 = rect.left - i19;
        int i37 = rect.right + i19;
        int i38 = rect.top - i27;
        int i39 = rect.bottom + i27;
        if (i17 < i38) {
            i17 = i38;
        }
        if (i17 <= i39) {
            i39 = i17;
        }
        if (i18 < i29) {
            i18 = i29;
        }
        if (i18 <= i37) {
            i37 = i18;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i39, i37);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f133956p;
        tkVar.f133199j.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass190(c4247x704e24df));
        return true;
    }

    public final float a() {
        return d(this.f133942b.f133976l);
    }

    public final void a(android.graphics.Rect rect) {
        this.f133943c.set(rect);
    }

    private boolean a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        return a(c4247x704e24df.m35331xbc3301f3(), c4247x704e24df.m35332x962aa94a(), true);
    }

    private boolean a(int i17, int i18) {
        return a(i17, i18, false);
    }

    private void a(double d17, double d18) {
        this.f133957q.a(d17, d18);
    }

    public final boolean a(float f17, float f18, boolean z17) {
        com.tencent.mapsdk.internal.v.d dVar = this.f133958r;
        if (dVar == null) {
            this.f133958r = new com.tencent.mapsdk.internal.v.d(f17, f18);
        } else {
            dVar.f133981a = f17;
            dVar.f133982b = f18;
        }
        this.f133955o.a(f17, f18, z17);
        return true;
    }

    private void a(boolean z17) {
        this.f133959s = z17;
    }

    public final boolean a(int i17, int i18, boolean z17) {
        int i19;
        int i27;
        int i28 = this.f133942b.f133977m;
        boolean z18 = true;
        int i29 = (1 << (20 - i28)) < 0 ? 0 : 20 - i28;
        if (131072 > i29) {
            i19 = ((this.f133954n.width() * 131072) - (this.f133954n.width() * i29)) / 2;
            i27 = ((this.f133954n.height() * 131072) - (this.f133954n.height() * i29)) / 2;
        } else {
            i19 = 0;
            i27 = 0;
        }
        android.graphics.Rect rect = this.f133943c;
        int i37 = rect.left - i19;
        int i38 = rect.right + i19;
        int i39 = rect.top - i27;
        int i47 = rect.bottom + i27;
        if (i17 < i39) {
            i17 = i39;
        }
        if (i17 <= i47) {
            i47 = i17;
        }
        if (i18 < i37) {
            i18 = i37;
        }
        if (i18 <= i38) {
            i38 = i18;
        }
        if (i47 == this.f133953m.m35331xbc3301f3() && i38 == this.f133953m.m35332x962aa94a()) {
            z18 = false;
        }
        this.f133953m.m35334xea574fff(i47);
        this.f133953m.m35335x2c901cbe(i38);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.y.a(this, this.f133953m);
        a(a17.f131000a, a17.f131001b);
        this.f133956p.a(this.f133953m, z17);
        return z18;
    }
}
