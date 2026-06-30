package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ad implements com.tencent.mapsdk.internal.fq, com.tencent.mapsdk.internal.it, com.tencent.mapsdk.internal.jp, com.tencent.mapsdk.internal.op, com.tencent.mapsdk.internal.pa {
    private static final int P = 20;
    private static final int Q = 0;
    private static final int R = 1;
    private static final int S = 2;
    private static final int T = 3;
    private static final int U = 4;

    /* renamed from: a, reason: collision with root package name */
    public static final int f48800a = 12;

    /* renamed from: b, reason: collision with root package name */
    public static final int f48801b = 11;

    /* renamed from: c, reason: collision with root package name */
    public static final int f48802c = 10;

    /* renamed from: d, reason: collision with root package name */
    public static final int f48803d = 18;

    /* renamed from: e, reason: collision with root package name */
    public static final int f48804e = 13;

    /* renamed from: f, reason: collision with root package name */
    public static final int f48805f = 15;

    /* renamed from: g, reason: collision with root package name */
    public static final int f48806g = 15;

    /* renamed from: h, reason: collision with root package name */
    public static final int f48807h = 17;

    /* renamed from: i, reason: collision with root package name */
    public static final int f48808i = 18;

    /* renamed from: j, reason: collision with root package name */
    public static final int f48809j = 16;

    /* renamed from: k, reason: collision with root package name */
    public static final int f48810k = 18;

    /* renamed from: l, reason: collision with root package name */
    public static final int f48811l = 12;

    /* renamed from: m, reason: collision with root package name */
    public static int f48812m = 116307503;

    /* renamed from: n, reason: collision with root package name */
    public static int f48813n = 39984186;
    public com.tencent.mapsdk.internal.v A;
    public com.tencent.mapsdk.internal.ey B;
    public android.graphics.Rect C;
    public boolean N;
    private java.util.List<com.tencent.mapsdk.internal.ph> V;
    private java.util.List<com.tencent.mapsdk.internal.fm> W;
    private java.util.List<com.tencent.mapsdk.internal.fq> X;
    private final java.util.List<com.tencent.mapsdk.internal.fr> Y;
    private java.util.List<com.tencent.mapsdk.internal.fo> Z;

    /* renamed from: ab, reason: collision with root package name */
    private android.graphics.Rect f48816ab;

    /* renamed from: ac, reason: collision with root package name */
    private java.lang.Runnable f48817ac;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mapsdk.internal.aa f48818o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mapsdk.internal.qj f48819p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List<com.tencent.mapsdk.internal.fj> f48820q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List<com.tencent.mapsdk.internal.fe> f48821r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List<com.tencent.mapsdk.internal.fg> f48822s;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List<com.tencent.mapsdk.internal.fl> f48824u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List<com.tencent.mapsdk.internal.ba> f48825v;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List<com.tencent.mapsdk.internal.fk> f48827x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mapsdk.internal.az f48828y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mapsdk.internal.bd f48829z;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f48823t = new byte[0];

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f48826w = new byte[0];

    /* renamed from: aa, reason: collision with root package name */
    private java.util.Stack<com.tencent.mapsdk.internal.v> f48815aa = new java.util.Stack<>();
    public com.tencent.mapsdk.internal.ad.a D = null;
    public float E = 0.5f;
    public float F = 0.5f;
    public boolean G = false;
    public int H = 0;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public int f48814J = 0;
    public int K = 0;
    public boolean L = false;
    public boolean M = false;

    /* renamed from: com.tencent.mapsdk.internal.ad$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements com.tencent.mapsdk.internal.ph {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f48830a;

        public AnonymousClass1(boolean z17) {
            this.f48830a = z17;
        }

        @Override // com.tencent.mapsdk.internal.ph
        public final void a() {
            android.graphics.PointF a17 = com.tencent.mapsdk.internal.ad.this.a();
            com.tencent.mapsdk.internal.ad.this.a(a17.x, a17.y, this.f48830a);
            com.tencent.mapsdk.internal.ad.this.b(this);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ad$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass3 extends com.tencent.mapsdk.internal.jm {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f48840a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f48841b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f48842c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f48843d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ double f48844e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ double f48845f = 0.0d;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ double f48846g = 0.0d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(double[] dArr, boolean z17, long j17, float f17, float f18, double d17, double d18) {
            super(102, dArr, z17);
            this.f48840a = j17;
            this.f48841b = f17;
            this.f48842c = f18;
            this.f48843d = d17;
            this.f48844e = d18;
        }

        @Override // com.tencent.mapsdk.internal.jm
        public final boolean a() {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f48840a;
            double a17 = com.tencent.mapsdk.internal.jj.a(elapsedRealtime, this.f48841b);
            double a18 = com.tencent.mapsdk.internal.jj.a(elapsedRealtime, this.f48842c);
            double[] dArr = this.A;
            dArr[2] = dArr[2] + java.lang.Math.abs(a17);
            double[] dArr2 = this.A;
            dArr2[3] = dArr2[3] + java.lang.Math.abs(a18);
            boolean z17 = this.A[2] >= java.lang.Math.abs(this.f48843d);
            boolean z18 = this.A[3] >= java.lang.Math.abs(this.f48844e);
            if (z17) {
                this.A[0] = this.f48845f - com.tencent.mapsdk.internal.ad.this.h();
            } else {
                this.A[0] = a17;
            }
            if (z18) {
                this.A[1] = this.f48846g - com.tencent.mapsdk.internal.ad.this.i();
            } else {
                this.A[1] = a18;
            }
            return z17 && z18;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ad$4, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass4 implements java.lang.Runnable {
        public AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.internal.ad.this.a(0.0d, 0.0d, false);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ad$5, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass5 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ double f48849a;

        public AnonymousClass5(double d17) {
            this.f48849a = d17;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.internal.ad.this.a((360.0d - this.f48849a) % 360.0d, com.tencent.tencentmap.mapsdk.maps.MapParamConstants.MAX_SKEW_ANGLE, false);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ad$6, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass6 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.iv f48851a;

        public AnonymousClass6(com.tencent.mapsdk.internal.iv ivVar) {
            this.f48851a = ivVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ad$7, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass7 implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.GeoPoint f48853a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f48854b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.Runnable f48855c;

        public AnonymousClass7(com.tencent.map.lib.models.GeoPoint geoPoint, float f17, java.lang.Runnable runnable) {
            this.f48853a = geoPoint;
            this.f48854b = f17;
            this.f48855c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.internal.ad.this.b(this.f48853a, this.f48854b, this.f48855c);
        }
    }

    /* loaded from: classes13.dex */
    public interface a {
        void a(com.tencent.mapsdk.internal.jm jmVar);
    }

    public ad(com.tencent.mapsdk.internal.bd bdVar) {
        this.f48829z = bdVar;
        this.f48828y = (com.tencent.mapsdk.internal.az) bdVar.d();
        this.A = bdVar.h();
        this.B = bdVar.f();
        this.C = bdVar.j();
        com.tencent.mapsdk.internal.aa aaVar = new com.tencent.mapsdk.internal.aa(this);
        this.f48818o = aaVar;
        aaVar.f48761i = this;
        a(aaVar);
        this.W = new java.util.concurrent.CopyOnWriteArrayList();
        this.f48824u = new java.util.concurrent.CopyOnWriteArrayList();
        this.f48820q = new java.util.concurrent.CopyOnWriteArrayList();
        this.f48821r = new java.util.concurrent.CopyOnWriteArrayList();
        this.V = new java.util.concurrent.CopyOnWriteArrayList();
        this.Y = new java.util.concurrent.CopyOnWriteArrayList();
        this.f48827x = new java.util.concurrent.CopyOnWriteArrayList();
        this.Z = new java.util.concurrent.CopyOnWriteArrayList();
        this.X = new java.util.concurrent.CopyOnWriteArrayList();
        a(com.tencent.mapsdk.internal.eq.f49377a);
    }

    private void A() {
        com.tencent.mapsdk.internal.aa aaVar = this.f48818o;
        if (aaVar != null) {
            aaVar.a();
        }
    }

    private void B() {
        com.tencent.mapsdk.internal.aa.a aVar;
        com.tencent.mapsdk.internal.aa aaVar = this.f48818o;
        if (aaVar == null || (aVar = aaVar.f48756d) == null) {
            return;
        }
        aVar.destroy();
    }

    private com.tencent.mapsdk.internal.aa C() {
        return this.f48818o;
    }

    private void D() {
        for (com.tencent.mapsdk.internal.fk fkVar : this.f48827x) {
        }
    }

    private void E() {
        com.tencent.mapsdk.core.utils.log.LogUtil.b("skew notifySkew");
        for (com.tencent.mapsdk.internal.fo foVar : this.Z) {
        }
    }

    private void F() {
        com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint(f48813n, f48812m);
        com.tencent.mapsdk.internal.v vVar = this.A;
        android.graphics.Rect j17 = this.f48829z.j();
        int latitudeE6 = geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint.getLongitudeE6();
        vVar.f52421n = j17;
        vVar.f52410c = com.tencent.tencentmap.mapsdk.maps.model.GeometryConstants.BOUNDARY_WORLD;
        vVar.c(13);
        vVar.a(0);
        vVar.a(latitudeE6, longitudeE6, false);
        this.f48829z.i().b(this.G);
    }

    private float G() {
        return this.A.f52409b.f52443l;
    }

    private int H() {
        return this.A.f52409b.f52444m;
    }

    private com.tencent.map.lib.models.GeoPoint I() {
        return this.A.f52420m;
    }

    private float J() {
        return this.A.f52409b.a();
    }

    private void K() {
        this.A.a(0.0f);
        this.A.b(0.0f);
        D();
        E();
        c();
    }

    private void L() {
        o();
        a(h(), com.tencent.tencentmap.mapsdk.maps.MapParamConstants.MAX_SKEW_ANGLE, true);
    }

    private void M() {
        o();
        a(h(), com.tencent.tencentmap.mapsdk.maps.MapParamConstants.MAX_SKEW_ANGLE, true);
    }

    private boolean N() {
        com.tencent.mapsdk.internal.qj qjVar = this.f48819p;
        if (qjVar == null) {
            return false;
        }
        boolean z17 = qjVar.f50958c;
        qjVar.f50958c = false;
        return z17;
    }

    private void O() {
        o();
        j();
    }

    private void P() {
        o();
        this.f48818o.e();
        a(0.0d, 0.0d);
    }

    private void Q() {
        o();
        this.f48818o.e();
        a(h(), com.tencent.tencentmap.mapsdk.maps.MapParamConstants.MAX_SKEW_ANGLE);
    }

    private boolean R() {
        boolean z17;
        loop0: while (true) {
            for (com.tencent.mapsdk.internal.v.a aVar : this.A.f52427t) {
                z17 = z17 && !aVar.b();
            }
        }
        if (z17) {
            com.tencent.mapsdk.internal.v.b bVar = this.A.f52409b;
            if (bVar.f52444m > bVar.f52441j) {
                return true;
            }
        }
        return false;
    }

    private void S() {
        b(0);
    }

    private void T() {
        for (com.tencent.mapsdk.internal.fj fjVar : this.f48820q) {
        }
        c();
    }

    private void U() {
        for (com.tencent.mapsdk.internal.fe feVar : this.f48821r) {
        }
        T();
    }

    private void V() {
        for (com.tencent.mapsdk.internal.fq fqVar : this.X) {
            if (fqVar != null) {
                try {
                    fqVar.u();
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    private android.graphics.Rect W() {
        com.tencent.map.lib.models.GeoPoint s17 = s();
        com.tencent.map.lib.models.GeoPoint t17 = t();
        return new android.graphics.Rect(s17.getLongitudeE6(), s17.getLatitudeE6(), t17.getLongitudeE6(), t17.getLatitudeE6());
    }

    private void X() {
        this.f48818o.e();
    }

    private boolean Y() {
        return this.f48818o.f();
    }

    private boolean Z() {
        return this.f48818o.g();
    }

    private com.tencent.mapsdk.internal.v aa() {
        return this.A;
    }

    private void j(double d17) {
        a((360.0d - d17) % 360.0d, i(), true);
    }

    private void k(double d17) {
        this.f48818o.e();
        b(new com.tencent.mapsdk.internal.jm(100, new double[]{d17}));
    }

    private void l(double d17) {
        a((360.0d - d17) % 360.0d, com.tencent.tencentmap.mapsdk.maps.MapParamConstants.MAX_SKEW_ANGLE, true);
    }

    private static double m(double d17) {
        double d18 = d17 % 360.0d;
        if (d18 > 180.0d) {
            return d18 - 360.0d;
        }
        return d18 < -180.0d ? d18 + 360.0d : d18;
    }

    private void v() {
        this.N = true;
    }

    private boolean w() {
        return this.N;
    }

    private boolean x() {
        android.graphics.Rect rect = this.C;
        return rect != null && rect.width() > 0 && this.C.height() > 0;
    }

    private com.tencent.mapsdk.internal.aa y() {
        com.tencent.mapsdk.internal.aa aaVar = this.f48818o;
        com.tencent.mapsdk.internal.aa.a aVar = aaVar.f48756d;
        if (aVar != null) {
            aVar.destroy();
        }
        com.tencent.mapsdk.internal.aa.a aVar2 = new com.tencent.mapsdk.internal.aa.a(aaVar);
        aaVar.f48756d = aVar2;
        aVar2.start();
        return this.f48818o;
    }

    private void z() {
        com.tencent.mapsdk.internal.aa aaVar = this.f48818o;
        if (aaVar != null) {
            aaVar.b();
        }
    }

    public final android.graphics.Rect b() {
        return new android.graphics.Rect(this.H, this.I, this.f48814J, this.K);
    }

    public final void c() {
        java.util.List<com.tencent.mapsdk.internal.ba> list = this.f48825v;
        if (list == null) {
            return;
        }
        for (com.tencent.mapsdk.internal.ba baVar : list) {
            if (baVar != null) {
                try {
                    baVar.a(this.A);
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.op
    public final void d() {
    }

    public final void e() {
        try {
            com.tencent.mapsdk.internal.v vVar = (com.tencent.mapsdk.internal.v) this.A.clone();
            com.tencent.mapsdk.core.utils.log.LogUtil.b("mapParam stack saveMapParam:" + vVar.toString());
            this.f48815aa.push(vVar);
        } catch (java.lang.CloneNotSupportedException unused) {
        }
    }

    public final void f() {
        try {
            com.tencent.mapsdk.internal.v pop = this.f48815aa.pop();
            com.tencent.mapsdk.internal.v.b bVar = pop.f52409b;
            int i17 = bVar.f52444m;
            com.tencent.mapsdk.internal.v.b bVar2 = this.A.f52409b;
            if (i17 != bVar2.f52444m) {
                c(com.tencent.mapsdk.internal.gf.f49577c);
            } else if (bVar.f52443l != bVar2.f52443l) {
                c(com.tencent.mapsdk.internal.gf.f49576b);
            }
            if (pop.f52423p.s() != this.A.f52423p.s()) {
                pop.f52423p.s();
                D();
            }
            if (pop.f52423p.r() != this.A.f52423p.r()) {
                pop.f52423p.r();
                E();
            }
            com.tencent.mapsdk.internal.v vVar = this.A;
            vVar.f52408a = pop.f52408a;
            com.tencent.mapsdk.internal.v.b bVar3 = vVar.f52409b;
            com.tencent.mapsdk.internal.v.b bVar4 = pop.f52409b;
            bVar3.f52439h = bVar4.f52439h;
            bVar3.f52440i = bVar4.f52440i;
            bVar3.f52441j = bVar4.f52441j;
            bVar3.f52442k = bVar4.f52442k;
            bVar3.f52443l = bVar4.f52443l;
            bVar3.f52444m = bVar4.f52444m;
            vVar.f52410c.set(pop.f52410c);
            vVar.f52411d = pop.f52411d;
            vVar.f52412e = pop.f52412e;
            vVar.f52413f = pop.f52413f;
            vVar.f52414g = pop.f52414g;
            vVar.f52415h = pop.f52415h;
            vVar.f52416i = pop.f52416i;
            vVar.f52417j = pop.f52417j;
            vVar.f52418k = pop.f52418k;
            vVar.f52419l = pop.f52419l;
            vVar.f52420m.setGeoPoint(pop.f52420m);
            com.tencent.mapsdk.internal.fu fuVar = vVar.f52424q;
            com.tencent.mapsdk.internal.fu fuVar2 = pop.f52424q;
            fuVar.a(fuVar2.f49467a, fuVar2.f49468b);
            vVar.f52421n = pop.f52421n;
            c();
        } catch (java.lang.Exception unused) {
        }
    }

    public final com.tencent.mapsdk.internal.v g() {
        try {
            return (com.tencent.mapsdk.internal.v) this.A.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    public final float h() {
        return this.A.f52423p.s();
    }

    public final float i() {
        return this.A.f52423p.r();
    }

    public final void n() {
        b(this.f48816ab);
        for (com.tencent.mapsdk.internal.ph phVar : this.V) {
            if (phVar != null) {
                try {
                    phVar.a();
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    public final void o() {
        if (this.f48822s == null) {
            return;
        }
        k();
        for (com.tencent.mapsdk.internal.fg fgVar : this.f48822s) {
        }
    }

    public final void p() {
        for (com.tencent.mapsdk.internal.fl flVar : this.f48824u) {
        }
    }

    public final android.graphics.Rect q() {
        com.tencent.mapsdk.internal.fu fuVar = new com.tencent.mapsdk.internal.fu(this.f48829z.j().width(), this.f48829z.j().height());
        com.tencent.map.lib.models.GeoPoint a17 = this.B.a(fuVar);
        fuVar.a(0.0d, this.f48829z.j().height());
        com.tencent.map.lib.models.GeoPoint a18 = this.B.a(fuVar);
        fuVar.a(this.f48829z.j().width(), 0.0d);
        com.tencent.map.lib.models.GeoPoint a19 = this.B.a(fuVar);
        fuVar.a(0.0d, 0.0d);
        com.tencent.map.lib.models.GeoPoint a27 = this.B.a(fuVar);
        return new android.graphics.Rect(java.lang.Math.min(java.lang.Math.min(java.lang.Math.min(a27.getLongitudeE6(), a17.getLongitudeE6()), a18.getLongitudeE6()), a19.getLongitudeE6()), java.lang.Math.min(java.lang.Math.min(java.lang.Math.min(a27.getLatitudeE6(), a17.getLatitudeE6()), a18.getLatitudeE6()), a19.getLatitudeE6()), java.lang.Math.max(java.lang.Math.max(java.lang.Math.max(a27.getLongitudeE6(), a17.getLongitudeE6()), a18.getLongitudeE6()), a19.getLongitudeE6()), java.lang.Math.max(java.lang.Math.max(java.lang.Math.max(a27.getLatitudeE6(), a17.getLatitudeE6()), a18.getLatitudeE6()), a19.getLatitudeE6()));
    }

    public final android.graphics.Rect r() {
        if (this.B == null) {
            return null;
        }
        com.tencent.mapsdk.internal.fu fuVar = new com.tencent.mapsdk.internal.fu(this.H, this.I);
        com.tencent.map.lib.models.GeoPoint a17 = this.B.a(fuVar);
        fuVar.a(this.f48829z.j().width() - this.f48814J, this.f48829z.j().height() - this.K);
        com.tencent.map.lib.models.GeoPoint a18 = this.B.a(fuVar);
        return new android.graphics.Rect(java.lang.Math.min(a17.getLongitudeE6(), a18.getLongitudeE6()), java.lang.Math.min(a17.getLatitudeE6(), a18.getLatitudeE6()), java.lang.Math.max(a17.getLongitudeE6(), a18.getLongitudeE6()), java.lang.Math.max(a17.getLatitudeE6(), a18.getLatitudeE6()));
    }

    public final com.tencent.map.lib.models.GeoPoint s() {
        return this.B.a(new com.tencent.mapsdk.internal.fu(0.0d, 0.0d));
    }

    public final com.tencent.map.lib.models.GeoPoint t() {
        return this.B.a(new com.tencent.mapsdk.internal.fu(this.f48829z.j().width(), this.f48829z.j().height()));
    }

    @Override // com.tencent.mapsdk.internal.fq
    public final void u() {
        for (com.tencent.mapsdk.internal.fq fqVar : this.X) {
            if (fqVar != null) {
                try {
                    fqVar.u();
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    private void b(com.tencent.mapsdk.internal.ba baVar) {
        if (this.f48825v == null) {
            return;
        }
        synchronized (this.f48826w) {
            this.f48825v.remove(baVar);
        }
    }

    private void d(double d17) {
        if (d17 == 0.0d) {
            return;
        }
        com.tencent.mapsdk.internal.v vVar = this.A;
        vVar.b(vVar.f52423p.r() + ((float) d17));
        c();
        E();
    }

    private void g(double d17) {
        a((float) d17);
    }

    public final void j() {
        this.f48818o.e();
        a(0.0d, 0.0d, true);
    }

    public final boolean l() {
        boolean z17;
        loop0: while (true) {
            for (com.tencent.mapsdk.internal.v.a aVar : this.A.f52427t) {
                z17 = z17 && !aVar.a();
            }
        }
        if (z17) {
            com.tencent.mapsdk.internal.v.b bVar = this.A.f52409b;
            if (bVar.f52444m < bVar.f52442k) {
                return true;
            }
        }
        return false;
    }

    public final int m() {
        com.tencent.mapsdk.internal.v vVar = this.A;
        com.tencent.mapsdk.internal.tk tkVar = vVar.f52423p;
        if (tkVar == null) {
            return vVar.f52408a;
        }
        return tkVar.u();
    }

    private void h(double d17) {
        this.f48818o.e();
        b(new com.tencent.mapsdk.internal.jm(102, new double[]{0.0d, d17}));
    }

    private void i(double d17) {
        this.f48818o.e();
        b(new com.tencent.mapsdk.internal.jm(102, new double[]{d17, 0.0d}));
    }

    public final boolean k() {
        return ((double) java.lang.Math.abs(i())) > 1.0E-6d || java.lang.Math.abs(h()) > 1.0f;
    }

    private int a(int i17, int i18, int i19, int i27, boolean z17) {
        this.H = i17;
        this.I = i18;
        this.f48814J = i19;
        this.K = i27;
        android.graphics.Rect rect = this.C;
        if (rect != null && rect.width() > 0 && this.C.height() > 0) {
            if (i17 + i19 > this.C.width() || i18 + i27 > this.C.height()) {
                return -1;
            }
            android.graphics.PointF a17 = a();
            a(a17.x, a17.y, z17);
            return 0;
        }
        a(new com.tencent.mapsdk.internal.ad.AnonymousClass1(z17));
        com.tencent.mapsdk.internal.bd bdVar = this.f48829z;
        if (!(bdVar instanceof com.tencent.mapsdk.internal.ne)) {
            return -2;
        }
        android.content.Context context = ((com.tencent.mapsdk.internal.ne) bdVar).getContext();
        return (i17 + i19 > com.tencent.mapsdk.internal.hs.b(context) || i18 + i27 > com.tencent.mapsdk.internal.hs.c(context)) ? -1 : 0;
    }

    private void c(boolean z17) {
        this.G = z17;
        this.f48829z.i().b(this.G);
    }

    private void e(double d17) {
        if (d17 == 0.0d) {
            return;
        }
        com.tencent.mapsdk.internal.v vVar = this.A;
        vVar.a(vVar.f52423p.s() + ((float) d17));
        c();
        D();
    }

    private void b(com.tencent.mapsdk.internal.fk fkVar) {
        synchronized (this.f48827x) {
            this.f48827x.remove(fkVar);
        }
    }

    private void c(float f17) {
        a(f17);
    }

    private void c(double d17, double d18) {
        com.tencent.mapsdk.internal.aa aaVar = this.f48818o;
        synchronized (aaVar.f48755c) {
            while (!aaVar.f48754b.isEmpty()) {
                java.util.ArrayList<com.tencent.mapsdk.internal.jm> arrayList = aaVar.f48754b;
                if (arrayList.get(arrayList.size() - 1).f50040z != 3) {
                    break;
                }
                java.util.ArrayList<com.tencent.mapsdk.internal.jm> arrayList2 = aaVar.f48754b;
                double[] dArr = arrayList2.remove(arrayList2.size() - 1).A;
                d17 += dArr[0];
                d18 += dArr[1];
            }
            aaVar.a(new com.tencent.mapsdk.internal.jm(3, new double[]{d17, d18}));
        }
    }

    private void d(com.tencent.mapsdk.internal.jm jmVar) {
        com.tencent.mapsdk.internal.bu buVar;
        int i17 = jmVar.f50040z;
        if (i17 == 2) {
            com.tencent.mapsdk.internal.az azVar = this.f48828y;
            if (azVar == null || azVar.getMapRenderView() == null || (buVar = this.f48828y.getMapRenderView().get()) == null) {
                return;
            }
            buVar.d();
            return;
        }
        if (i17 == 3) {
            double[] dArr = jmVar.A;
            b(dArr[0], dArr[1]);
            return;
        }
        if (i17 == 4) {
            double[] dArr2 = jmVar.A;
            a((int) dArr2[0], (int) dArr2[1], dArr2.length > 2 ? (int) dArr2[2] : 1);
            return;
        }
        if (i17 == 6) {
            java.lang.Runnable runnable = jmVar.E;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (i17 == 120) {
            a((float) jmVar.A[0]);
            double[] dArr3 = jmVar.A;
            a((int) dArr3[1], (int) dArr3[2], 1);
            return;
        }
        if (i17 != 10000) {
            switch (i17) {
                case 100:
                    f(jmVar.A[0]);
                    return;
                case 101:
                    double[] dArr4 = jmVar.A;
                    if (dArr4[5] == 1.0d) {
                        b(dArr4[3] - dArr4[1], dArr4[4] - dArr4[2]);
                        f(jmVar.A[0]);
                        return;
                    }
                    int width = this.f48829z.j().width();
                    int height = this.f48829z.j().height();
                    int i18 = width / 2;
                    int i19 = height / 2;
                    com.tencent.mapsdk.internal.v.d dVar = this.A.f52425r;
                    if (dVar != null) {
                        i18 = (int) (i18 + (dVar.f52448a * width));
                        i19 = (int) (i19 + (dVar.f52449b * height));
                    }
                    double d17 = i18;
                    double[] dArr5 = jmVar.A;
                    double d18 = d17 - dArr5[1];
                    double d19 = i19;
                    double d27 = d19 - dArr5[2];
                    double d28 = dArr5[3] - d17;
                    double d29 = dArr5[4] - d19;
                    b(d18, d27);
                    f(jmVar.A[0]);
                    b(d28, d29);
                    return;
                case 102:
                    e(jmVar.A[0]);
                    d(jmVar.A[1]);
                    return;
                case 103:
                    double[] dArr6 = jmVar.A;
                    b(dArr6[3] - dArr6[1], dArr6[4] - dArr6[2]);
                    e(jmVar.A[0]);
                    return;
                case 104:
                    this.A.a(0.0f);
                    this.A.b(0.0f);
                    D();
                    E();
                    c();
                    return;
                default:
                    switch (i17) {
                        case 108:
                            a((float) jmVar.A[0]);
                            return;
                        case 109:
                            b(jmVar.A[0]);
                            return;
                        case 110:
                            a(jmVar.A[0]);
                            return;
                        default:
                            return;
                    }
            }
        }
        com.tencent.mapsdk.internal.ad.a aVar = this.D;
        if (aVar != null) {
            aVar.a(jmVar);
        }
    }

    private void e(int i17) {
        a(i17, (java.lang.Runnable) new com.tencent.mapsdk.internal.ad.AnonymousClass4());
    }

    public final void b(com.tencent.mapsdk.internal.fo foVar) {
        synchronized (this.Z) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b("skew addSkewListener");
            this.Z.remove(foVar);
        }
    }

    private void e(boolean z17) {
        this.L = z17;
    }

    private void b(int i17, int i18) {
        a(i17, i18, 1);
    }

    private void b(float f17) {
        b(f17);
    }

    private void b(double d17, double d18) {
        this.f48829z.i().b((float) d17, (float) d18);
        U();
        c();
    }

    public final android.graphics.PointF a() {
        int i17;
        int i18;
        android.graphics.Rect rect = this.C;
        if (rect != null) {
            i17 = rect.width();
            i18 = this.C.height();
        } else {
            i17 = 0;
            i18 = 0;
        }
        int i19 = this.H;
        int i27 = i19 + (((i17 - i19) - this.f48814J) / 2);
        int i28 = this.I;
        int i29 = i28 + (((i18 - i28) - this.K) / 2);
        if (i17 != 0 && i18 != 0) {
            return new android.graphics.PointF((i27 * 1.0f) / i17, (i29 * 1.0f) / i18);
        }
        return new android.graphics.PointF(0.5f, 0.5f);
    }

    public final void c(double d17) {
        this.f48818o.e();
        b(new com.tencent.mapsdk.internal.jm(108, new double[]{d17}));
    }

    private void c(java.lang.Runnable runnable) {
        if (l()) {
            this.f48829z.i().c(this.f48829z.j().width() / 2.0f, this.f48829z.j().height() / 2.0f);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void b(double d17) {
        if (com.tencent.mapsdk.internal.li.a(d17 - this.A.f52423p.s()) == 0.0d) {
            return;
        }
        this.A.a((float) d17);
        c();
        D();
    }

    public final void a(com.tencent.mapsdk.internal.ba baVar) {
        if (baVar == null) {
            return;
        }
        if (this.f48825v == null) {
            this.f48825v = new java.util.concurrent.CopyOnWriteArrayList();
        }
        synchronized (this.f48826w) {
            if (!this.f48825v.contains(baVar)) {
                this.f48825v.add(baVar);
            }
        }
    }

    public final void c(int i17) {
        if (i17 == com.tencent.mapsdk.internal.gf.f49575a) {
            return;
        }
        for (com.tencent.mapsdk.internal.fm fmVar : this.W) {
            if (fmVar != null) {
                fmVar.b(i17);
            }
        }
        c();
    }

    private void b(float f17, float f18, java.lang.Runnable runnable) {
        if (l()) {
            android.graphics.Rect rect = this.A.f52421n;
            int height = rect.height();
            float t17 = this.f48829z.i().t();
            if (f18 >= rect.top && f18 < (r0 + height) - t17) {
                f18 = (r0 + height) - t17;
            }
            this.f48829z.i().c(f17, f18);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void c(com.tencent.map.lib.models.GeoPoint geoPoint) {
        a(geoPoint, (java.lang.Runnable) null);
    }

    public final void c(android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (rect == null) {
            return;
        }
        if (rect.height() > 0 || rect.width() > 0) {
            a(rect, rect2, false);
        }
        U();
    }

    public final void a(android.graphics.Rect rect) {
        if (x()) {
            float a17 = a(rect, this.C);
            this.A.a(rect);
            this.A.e(a17);
        }
    }

    @Override // com.tencent.mapsdk.internal.jp
    public final void c(com.tencent.mapsdk.internal.jm jmVar) {
        if (jmVar != null) {
            d(jmVar);
        }
    }

    private void b(boolean z17, java.lang.Runnable runnable) {
        double m17 = m(0.0d - h());
        double i17 = 0.0d - i();
        if (m17 == 0.0d && i17 == 0.0d) {
            if (runnable != null) {
                com.tencent.mapsdk.internal.jm jmVar = new com.tencent.mapsdk.internal.jm(runnable);
                jmVar.D = true;
                jmVar.B = 0L;
                b(jmVar);
                return;
            }
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b("postRotateAndSkew distance:" + m17 + "," + i17);
        b(new com.tencent.mapsdk.internal.ad.AnonymousClass3(new double[]{0.0d, 0.0d, 0.0d, 0.0d}, z17 ^ true, android.os.SystemClock.elapsedRealtime(), (float) (m17 * 0.10000000149011612d), (float) (0.10000000149011612d * i17), m17, i17));
        if (runnable != null) {
            com.tencent.mapsdk.internal.jm jmVar2 = new com.tencent.mapsdk.internal.jm(runnable);
            jmVar2.D = true;
            jmVar2.B = 0L;
            b(jmVar2);
        }
    }

    private float c(com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.map.lib.models.GeoPoint geoPoint2) {
        int i17;
        int i18;
        android.graphics.Rect rect = this.C;
        if (rect != null) {
            i17 = rect.width();
            i18 = this.C.height();
        } else {
            i17 = 0;
            i18 = 0;
        }
        if (i17 == 0 || i18 == 0 || geoPoint == null || geoPoint2 == null) {
            return 1.0f;
        }
        com.tencent.mapsdk.internal.fu a17 = a(geoPoint);
        com.tencent.mapsdk.internal.fu a18 = a(geoPoint2);
        double d17 = a18.f49467a - a17.f49467a;
        if (d17 < 0.0d) {
            d17 = java.lang.Math.abs(d17);
        }
        double d18 = a18.f49468b - a17.f49468b;
        if (d18 < 0.0d) {
            d18 = java.lang.Math.abs(d18);
        }
        double d19 = d17 * 1.0d;
        double d27 = d18 * 1.0d;
        int i19 = (i17 - this.H) - this.f48814J;
        int i27 = (i18 - this.I) - this.K;
        if (i19 <= 0) {
            i19 = 1;
        }
        if (i27 <= 0) {
            i27 = 1;
        }
        float max = (float) (20.0d - java.lang.Math.max(java.lang.Math.log(d19 / i19) / java.lang.Math.log(2.0d), java.lang.Math.log(d27 / i27) / java.lang.Math.log(2.0d)));
        return this.A != null ? com.tencent.mapsdk.internal.v.b.a((int) max) : max;
    }

    private void a(com.tencent.mapsdk.internal.fk fkVar) {
        if (fkVar == null) {
            return;
        }
        synchronized (this.f48827x) {
            if (!this.f48827x.contains(fkVar)) {
                this.f48827x.add(fkVar);
            }
        }
    }

    public final void a(com.tencent.mapsdk.internal.fo foVar) {
        if (foVar == null) {
            return;
        }
        synchronized (this.Z) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b("skew addSkewListener");
            if (!this.Z.contains(foVar)) {
                this.Z.add(foVar);
            }
        }
    }

    private void a(com.tencent.mapsdk.internal.qm qmVar) {
        if (this.f48819p == null) {
            this.f48819p = this.f48828y.N();
        }
        com.tencent.mapsdk.internal.qj qjVar = this.f48819p;
        qjVar.f50957b = qmVar;
        boolean a17 = qmVar.a();
        com.tencent.mapsdk.internal.az azVar = qjVar.f50959d;
        if (azVar != null) {
            if (a17) {
                azVar.b(qjVar);
            } else {
                azVar.a(qjVar);
            }
        }
    }

    private void f(double d17) {
        a(this.A.f52409b.f52443l * ((float) d17));
    }

    public final void b(int i17) {
        if (this.A.a(i17)) {
            for (com.tencent.mapsdk.internal.fr frVar : this.Y) {
                if (frVar != null) {
                    try {
                        frVar.i(i17);
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            c();
        }
    }

    private void c(com.tencent.map.lib.models.GeoPoint geoPoint, float f17, java.lang.Runnable runnable) {
        int i17;
        if (geoPoint == null) {
            return;
        }
        this.f48818o.e();
        double d17 = this.A.f52409b.f52443l;
        double d18 = f17;
        double d19 = d18 / d17;
        if (d19 > 1.0d) {
            i17 = (int) (d19 / 0.5d);
        } else {
            if (d19 >= 1.0d) {
                b(geoPoint, runnable);
                return;
            }
            i17 = d19 != 1.0d ? (int) (0.5d / d19) : 0;
        }
        int max = java.lang.Math.max(60, java.lang.Math.min(120, (i17 >> 1) << 1));
        double log10 = java.lang.Math.log10(d17) / java.lang.Math.log10(2.0d);
        double log102 = java.lang.Math.log10(d18) / java.lang.Math.log10(2.0d);
        com.tencent.map.lib.models.GeoPoint geoPoint2 = this.A.f52420m;
        int i18 = 0;
        while (i18 < max) {
            long j17 = max;
            i18++;
            long j18 = i18;
            double d27 = log10;
            double pow = java.lang.Math.pow(2.0d, com.tencent.mapsdk.internal.mo.a(log10, log102, j17, j18));
            double a17 = com.tencent.mapsdk.internal.mo.a(geoPoint2.getLatitudeE6(), geoPoint.getLatitudeE6(), j17, j18);
            double d28 = log102;
            double a18 = com.tencent.mapsdk.internal.mo.a(geoPoint2.getLongitudeE6(), geoPoint.getLongitudeE6(), j17, j18);
            com.tencent.mapsdk.core.utils.log.LogUtil.b("debug location anim zoomOut:" + a17 + "," + a18);
            b(new com.tencent.mapsdk.internal.jm(120, new double[]{pow, a17, a18}));
            log10 = d27;
            log102 = d28;
        }
        if (runnable != null) {
            b(new com.tencent.mapsdk.internal.jm(runnable));
        }
    }

    private void f(boolean z17) {
        this.M = z17;
    }

    public final void b(float f17, float f18, boolean z17) {
        this.A.a(f17 - 0.5f, f18 - 0.5f, z17);
        c();
    }

    private void a(int i17, com.tencent.map.lib.models.GeoPoint geoPoint) {
        a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), 1);
        a(i17);
    }

    private void b(float f17, float f18) {
        this.E = f17;
        this.F = f18;
    }

    private void a(com.tencent.map.lib.models.GeoPoint geoPoint, float f17, float f18, float f19) {
        a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), 1);
        a(f17);
        b(f18);
        a(f19);
    }

    public final void b(android.graphics.Rect rect) {
        com.tencent.mapsdk.internal.ne neVar;
        android.graphics.Rect rect2;
        if (this.C == null || rect == null) {
            return;
        }
        this.f48816ab = rect;
        com.tencent.mapsdk.internal.bd bdVar = this.f48829z;
        if ((bdVar instanceof com.tencent.mapsdk.internal.ne) && (rect2 = (neVar = (com.tencent.mapsdk.internal.ne) bdVar).f50515o) != null) {
            neVar.C = rect;
            int width = rect2.width();
            int height = neVar.f50515o.height();
            int i17 = rect.left;
            int i18 = rect.bottom;
            neVar.a(i17, i18, (width - rect.right) - i17, (height - i18) - rect.top, true);
        }
        c();
    }

    private void d(boolean z17) {
        b(z17 ? 12 : 0);
    }

    public final void a(int i17) {
        if (this.A.c(i17)) {
            c(com.tencent.mapsdk.internal.gf.f49577c);
        }
    }

    private void d(int i17) {
        for (com.tencent.mapsdk.internal.fr frVar : this.Y) {
            if (frVar != null) {
                try {
                    frVar.i(i17);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        c();
    }

    public final void a(int i17, int i18, int i19) {
        this.A.a(i17, i18, false);
        if (i19 == 1) {
            U();
            c();
        }
    }

    private void d(android.graphics.Rect rect) {
        b(rect, (android.graphics.Rect) null);
    }

    private void a(float f17, float f18) {
        com.tencent.mapsdk.internal.tk i17;
        com.tencent.mapsdk.internal.bd bdVar = this.f48829z;
        if (bdVar == null || (i17 = bdVar.i()) == null) {
            return;
        }
        i17.b(f17, f18);
        c();
        a(true);
    }

    private float d(android.graphics.Rect rect, android.graphics.Rect rect2) {
        android.graphics.Rect rect3 = new android.graphics.Rect(this.f48829z.j());
        if (rect2 != null) {
            rect3.left += rect2.left;
            rect3.right -= rect2.right;
            rect3.top += rect2.top;
            rect3.bottom -= rect2.bottom;
        }
        return a(rect, rect3);
    }

    private void c(com.tencent.map.lib.models.GeoPoint geoPoint, java.lang.Runnable runnable) {
        if (geoPoint == null) {
            return;
        }
        a(geoPoint, this.A.f52409b.f52444m, runnable);
    }

    private void b(com.tencent.mapsdk.internal.fg fgVar) {
        if (this.f48822s == null) {
            return;
        }
        synchronized (this.f48823t) {
            this.f48822s.remove(fgVar);
        }
    }

    public final void a(boolean z17) {
        this.f48818o.f48762j = z17;
    }

    private boolean d(com.tencent.map.lib.models.GeoPoint geoPoint) {
        boolean z17;
        if (geoPoint == null) {
            return true;
        }
        android.graphics.Rect r17 = r();
        boolean contains = r17 != null ? r17.contains(geoPoint.getLongitudeE6(), geoPoint.getLatitudeE6()) : false;
        com.tencent.mapsdk.internal.fu a17 = this.B.a(this.A.f52420m);
        com.tencent.mapsdk.internal.fu a18 = this.B.a(geoPoint);
        if (this.C != null) {
            double abs = java.lang.Math.abs(a17.f49467a - a18.f49467a);
            double abs2 = java.lang.Math.abs(a17.f49468b - a18.f49468b);
            if (abs > this.C.width() || abs2 > this.C.height()) {
                z17 = false;
                return contains && !z17;
            }
        }
        z17 = true;
        if (contains) {
        }
    }

    private void c(android.graphics.Rect rect) {
        b(rect, (android.graphics.Rect) null);
    }

    public final float a(android.graphics.Rect rect, android.graphics.Rect rect2) {
        com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint(rect.top, rect.left);
        com.tencent.map.lib.models.GeoPoint geoPoint2 = new com.tencent.map.lib.models.GeoPoint(rect.bottom, rect.right);
        android.graphics.Rect rect3 = new android.graphics.Rect();
        rect3.left = java.lang.Math.min(geoPoint.getLongitudeE6(), geoPoint2.getLongitudeE6());
        rect3.right = java.lang.Math.max(geoPoint.getLongitudeE6(), geoPoint2.getLongitudeE6());
        rect3.top = java.lang.Math.min(geoPoint.getLatitudeE6(), geoPoint2.getLatitudeE6());
        rect3.bottom = java.lang.Math.max(geoPoint.getLatitudeE6(), geoPoint2.getLatitudeE6());
        return (float) this.f48829z.i().a(rect3, rect2);
    }

    public final void b(com.tencent.mapsdk.internal.fm fmVar) {
        synchronized (this.W) {
            this.W.remove(fmVar);
        }
    }

    private void b(com.tencent.mapsdk.internal.fl flVar) {
        synchronized (this.f48824u) {
            this.f48824u.remove(flVar);
        }
    }

    public final void b(com.tencent.mapsdk.internal.fq fqVar) {
        synchronized (this.X) {
            this.X.remove(fqVar);
        }
    }

    private void a(android.graphics.Rect rect, android.graphics.Rect rect2, boolean z17) {
        if (x()) {
            android.graphics.Rect rect3 = new android.graphics.Rect(this.C);
            if (rect2 != null) {
                rect3.left += rect2.left;
                rect3.right -= rect2.right;
                rect3.top += rect2.top;
                rect3.bottom -= rect2.bottom;
            }
            com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint(rect.top, rect.left);
            com.tencent.map.lib.models.GeoPoint geoPoint2 = new com.tencent.map.lib.models.GeoPoint(rect.bottom, rect.right);
            android.graphics.Rect rect4 = new android.graphics.Rect();
            rect4.left = java.lang.Math.min(geoPoint.getLongitudeE6(), geoPoint2.getLongitudeE6());
            rect4.right = java.lang.Math.max(geoPoint.getLongitudeE6(), geoPoint2.getLongitudeE6());
            rect4.top = java.lang.Math.min(geoPoint.getLatitudeE6(), geoPoint2.getLatitudeE6());
            rect4.bottom = java.lang.Math.max(geoPoint.getLatitudeE6(), geoPoint2.getLatitudeE6());
            this.f48829z.i().a(rect4, rect3, z17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r0.f52444m > r0.f52441j) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(java.lang.Runnable r6) {
        /*
            r5 = this;
            com.tencent.mapsdk.internal.v r0 = r5.A
            java.util.List<com.tencent.mapsdk.internal.v$a> r0 = r0.f52427t
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
        L9:
            r2 = r1
        La:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto L22
            java.lang.Object r3 = r0.next()
            com.tencent.mapsdk.internal.v$a r3 = (com.tencent.mapsdk.internal.v.a) r3
            if (r2 == 0) goto L20
            boolean r2 = r3.b()
            if (r2 != 0) goto L20
            goto L9
        L20:
            r2 = r4
            goto La
        L22:
            if (r2 == 0) goto L2f
            com.tencent.mapsdk.internal.v r0 = r5.A
            com.tencent.mapsdk.internal.v$b r0 = r0.f52409b
            int r2 = r0.f52444m
            int r0 = r0.f52441j
            if (r2 <= r0) goto L2f
            goto L30
        L2f:
            r1 = r4
        L30:
            if (r1 != 0) goto L33
            return
        L33:
            com.tencent.mapsdk.internal.bd r0 = r5.f48829z
            com.tencent.mapsdk.internal.tk r0 = r0.i()
            long r1 = r0.f51661e
            r3 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L4e
            com.tencent.mapsdk.internal.ne r1 = r0.f51666j
            if (r1 != 0) goto L46
            goto L4e
        L46:
            com.tencent.mapsdk.internal.tk$5 r2 = new com.tencent.mapsdk.internal.tk$5
            r2.<init>()
            r1.a(r2)
        L4e:
            if (r6 == 0) goto L53
            r6.run()
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ad.d(java.lang.Runnable):void");
    }

    private void b(com.tencent.mapsdk.internal.fj fjVar) {
        synchronized (this.f48820q) {
            this.f48820q.remove(fjVar);
        }
    }

    private void b(com.tencent.mapsdk.internal.fe feVar) {
        synchronized (this.f48821r) {
            this.f48821r.remove(feVar);
        }
    }

    public final void b(com.tencent.mapsdk.internal.ph phVar) {
        synchronized (this.V) {
            this.V.remove(phVar);
        }
    }

    public final void b(com.tencent.mapsdk.internal.fr frVar) {
        synchronized (this.Y) {
            this.Y.remove(frVar);
        }
    }

    private void d(com.tencent.map.lib.models.GeoPoint geoPoint, java.lang.Runnable runnable) {
        a(geoPoint, 18, runnable);
    }

    private void b(com.tencent.map.lib.models.GeoPoint geoPoint, android.graphics.Rect rect) {
        com.tencent.mapsdk.internal.ey eyVar = this.B;
        com.tencent.mapsdk.internal.fu a17 = eyVar.a(geoPoint);
        double centerX = rect.centerX() - a17.f49467a;
        double centerY = rect.centerY() - a17.f49468b;
        com.tencent.mapsdk.internal.fu a18 = eyVar.a(this.A.f52420m);
        a18.f49467a -= centerX;
        a18.f49468b -= centerY;
        a(eyVar.a(a18), (java.lang.Runnable) null);
    }

    public final void a(float f17) {
        c(this.A.c(f17));
    }

    private double a(com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.map.lib.models.GeoPoint geoPoint2) {
        com.tencent.mapsdk.internal.fu a17 = this.B.a(geoPoint);
        com.tencent.mapsdk.internal.fu a18 = this.B.a(geoPoint2);
        double d17 = a18.f49467a - a17.f49467a;
        double d18 = a18.f49468b - a17.f49468b;
        return java.lang.Math.sqrt((d17 * d17) + (d18 * d18));
    }

    public final void a(double d17) {
        if (d17 == this.A.f52423p.r()) {
            return;
        }
        this.A.b((float) d17);
        c();
        E();
    }

    private void b(com.tencent.map.lib.models.GeoPoint geoPoint, int i17, java.lang.Runnable runnable) {
        a(geoPoint, i17, runnable);
    }

    private float b(com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.map.lib.models.GeoPoint geoPoint2) {
        if (!x()) {
            return this.A.f52409b.f52443l;
        }
        int latitudeE6 = geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint.getLongitudeE6();
        int latitudeE62 = geoPoint2.getLatitudeE6();
        int longitudeE62 = geoPoint2.getLongitudeE6();
        return a(new android.graphics.Rect(java.lang.Math.min(longitudeE62, longitudeE6), java.lang.Math.min(latitudeE62, latitudeE6), java.lang.Math.max(longitudeE62, longitudeE6), java.lang.Math.max(latitudeE62, latitudeE6)), this.C);
    }

    public final void a(com.tencent.mapsdk.internal.jm jmVar) {
        this.f48818o.e();
        b(jmVar);
    }

    private void a(double d17, double d18, double d19, double d27, double d28) {
        this.f48818o.e();
        float width = this.f48829z.j().width() / 2.0f;
        float height = this.f48829z.j().height() / 2.0f;
        com.tencent.mapsdk.internal.v.d dVar = this.A.f52425r;
        if (this.M) {
            if (dVar != null) {
                d18 = width + (dVar.f52448a * width * 2.0f);
                height += dVar.f52449b * height * 2.0f;
            } else {
                d18 = width;
            }
            d19 = height;
            d27 = d18;
            d28 = d19;
        }
        c(new com.tencent.mapsdk.internal.jm(103, new double[]{d17, d18, d19, d27, d28}));
    }

    public final void a(double d17, double d18, double d19, double d27, double d28, boolean z17, java.lang.Runnable runnable) {
        double d29;
        double d37;
        double d38;
        double d39;
        this.f48818o.e();
        float width = this.f48829z.j().width() / 2.0f;
        float height = this.f48829z.j().height() / 2.0f;
        com.tencent.mapsdk.internal.v.d dVar = this.A.f52425r;
        if (this.L) {
            if (dVar != null) {
                d29 = width + (dVar.f52448a * width * 2.0f);
                d37 = height + (dVar.f52449b * height * 2.0f);
            } else {
                d37 = height;
                d29 = width;
            }
            d39 = d37;
            d38 = d29;
        } else {
            d29 = d18;
            d37 = d19;
            d38 = d27;
            d39 = d28;
        }
        double[] dArr = new double[6];
        dArr[0] = d17;
        dArr[1] = d29;
        dArr[2] = d37;
        dArr[3] = d38;
        dArr[4] = d39;
        dArr[5] = z17 ? 1.0d : 0.0d;
        b(new com.tencent.mapsdk.internal.jm(101, dArr));
        com.tencent.mapsdk.internal.jm jmVar = new com.tencent.mapsdk.internal.jm(runnable);
        jmVar.D = false;
        jmVar.B = 0L;
        b(jmVar);
    }

    public final void b(android.graphics.Rect rect, android.graphics.Rect rect2) {
        if (x()) {
            android.graphics.Rect rect3 = new android.graphics.Rect(this.C);
            if (rect2 != null) {
                rect3.left += rect2.left;
                rect3.right -= rect2.right;
                rect3.top += rect2.top;
                rect3.bottom -= rect2.bottom;
            }
            a(rect, rect2, true);
            U();
        }
    }

    public final void b(com.tencent.mapsdk.internal.jm jmVar) {
        this.f48818o.a(jmVar);
    }

    public final void b(com.tencent.map.lib.models.GeoPoint geoPoint, float f17, java.lang.Runnable runnable) {
        int i17;
        boolean z17;
        if (geoPoint == null) {
            return;
        }
        this.f48818o.e();
        double d17 = this.A.f52409b.f52443l;
        double d18 = f17;
        double d19 = d18 / d17;
        if (d19 > 1.0d) {
            i17 = (int) (d19 / 0.5d);
            z17 = true;
        } else if (d19 >= 1.0d) {
            b(geoPoint, runnable);
            return;
        } else {
            i17 = d19 != 1.0d ? (int) (0.5d / d19) : 0;
            z17 = false;
        }
        int max = java.lang.Math.max(60, java.lang.Math.min(120, (i17 >> 1) << 1));
        double log10 = java.lang.Math.log10(d17) / java.lang.Math.log10(2.0d);
        double log102 = java.lang.Math.log10(d18) / java.lang.Math.log10(2.0d);
        com.tencent.map.lib.models.GeoPoint geoPoint2 = this.A.f52420m;
        if (z17) {
            int i18 = 0;
            while (i18 < max) {
                long j17 = max;
                i18++;
                long j18 = i18;
                double d27 = log102;
                double pow = java.lang.Math.pow(2.0d, com.tencent.mapsdk.internal.mo.c(log10, log102, j17, j18));
                double d28 = log10;
                double e17 = com.tencent.mapsdk.internal.mo.e(geoPoint2.getLatitudeE6(), geoPoint.getLatitudeE6(), j17, j18);
                double e18 = com.tencent.mapsdk.internal.mo.e(geoPoint2.getLongitudeE6(), geoPoint.getLongitudeE6(), j17, j18);
                com.tencent.mapsdk.core.utils.log.LogUtil.b("debug location anim zoomOut:" + e17 + "," + e18);
                b(new com.tencent.mapsdk.internal.jm(120, new double[]{pow, e17, e18}));
                log102 = d27;
                log10 = d28;
                geoPoint2 = geoPoint2;
            }
        } else {
            int i19 = 0;
            while (i19 < max) {
                long j19 = max;
                i19++;
                long j27 = i19;
                double pow2 = java.lang.Math.pow(2.0d, com.tencent.mapsdk.internal.mo.b(log10, log102, j19, j27));
                double d29 = com.tencent.mapsdk.internal.mo.d(geoPoint2.getLatitudeE6(), geoPoint.getLatitudeE6(), j19, j27);
                double d37 = com.tencent.mapsdk.internal.mo.d(geoPoint2.getLongitudeE6(), geoPoint.getLongitudeE6(), j19, j27);
                com.tencent.mapsdk.core.utils.log.LogUtil.b("debug location anim zoomin:" + d29 + "," + d37);
                b(new com.tencent.mapsdk.internal.jm(120, new double[]{pow2, d29, d37}));
            }
        }
        if (runnable != null) {
            b(new com.tencent.mapsdk.internal.jm(runnable));
        }
    }

    private void a(float f17, float f18, java.lang.Runnable runnable) {
        if (this.L) {
            com.tencent.mapsdk.internal.v.d dVar = this.A.f52425r;
            if (dVar != null) {
                float width = this.f48829z.j().width() * (dVar.f52448a + 0.5f);
                f18 = (dVar.f52449b + 0.5f) * this.f48829z.j().height();
                f17 = width;
            } else {
                a(runnable);
                return;
            }
        }
        if (l()) {
            android.graphics.Rect rect = this.A.f52421n;
            int height = rect.height();
            float t17 = this.f48829z.i().t();
            if (f18 >= rect.top && f18 < (r0 + height) - t17) {
                f18 = (r0 + height) - t17;
            }
            this.f48829z.i().c(f17, f18);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void a(boolean z17, java.lang.Runnable runnable) {
        this.f48818o.e();
        double m17 = m(0.0d - h());
        double i17 = 0.0d - i();
        if (m17 == 0.0d && i17 == 0.0d) {
            if (runnable != null) {
                com.tencent.mapsdk.internal.jm jmVar = new com.tencent.mapsdk.internal.jm(runnable);
                jmVar.D = true;
                jmVar.B = 0L;
                b(jmVar);
                return;
            }
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b("postRotateAndSkew distance:" + m17 + "," + i17);
        b(new com.tencent.mapsdk.internal.ad.AnonymousClass3(new double[]{0.0d, 0.0d, 0.0d, 0.0d}, z17 ^ true, android.os.SystemClock.elapsedRealtime(), (float) (m17 * 0.10000000149011612d), (float) (0.10000000149011612d * i17), m17, i17));
        if (runnable != null) {
            com.tencent.mapsdk.internal.jm jmVar2 = new com.tencent.mapsdk.internal.jm(runnable);
            jmVar2.D = true;
            jmVar2.B = 0L;
            b(jmVar2);
        }
    }

    public final void b(com.tencent.map.lib.models.GeoPoint geoPoint, java.lang.Runnable runnable) {
        if (geoPoint == null) {
            return;
        }
        this.f48818o.e();
        com.tencent.map.lib.models.GeoPoint geoPoint2 = this.A.f52420m;
        double[] a17 = com.tencent.mapsdk.internal.iu.a(geoPoint2.getLatitudeE6(), geoPoint.getLatitudeE6() - geoPoint2.getLatitudeE6());
        double[] a18 = com.tencent.mapsdk.internal.iu.a(geoPoint2.getLongitudeE6(), geoPoint.getLongitudeE6() - geoPoint2.getLongitudeE6());
        for (int i17 = 0; i17 < 20; i17++) {
            b(new com.tencent.mapsdk.internal.jm(4, new double[]{a17[i17], a18[i17]}));
        }
        if (runnable != null) {
            b(new com.tencent.mapsdk.internal.jm(runnable));
        }
    }

    public final void a(double d17, double d18) {
        double m17 = m(d17 - h());
        double i17 = d18 - i();
        if (m17 == 0.0d && i17 == 0.0d) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b("rotateAndSkew distance:" + m17 + "," + i17);
        b(new com.tencent.mapsdk.internal.jm(102, new double[]{m17, i17, 0.0d, 0.0d}, true));
    }

    public final void a(final double d17, final double d18, boolean z17) {
        final double m17 = m(d17 - h());
        final double i17 = d18 - i();
        if (m17 == 0.0d && i17 == 0.0d) {
            return;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.b("postRotateAndSkew distance:" + m17 + "," + i17);
        final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        final float f17 = (float) (m17 * 0.10000000149011612d);
        final float f18 = (float) (0.10000000149011612d * i17);
        b(new com.tencent.mapsdk.internal.jm(new double[]{d17, d18, 0.0d, 0.0d}, z17 ^ true) { // from class: com.tencent.mapsdk.internal.ad.2
            @Override // com.tencent.mapsdk.internal.jm
            public final boolean a() {
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                double a17 = com.tencent.mapsdk.internal.jj.a(elapsedRealtime2, f17);
                double a18 = com.tencent.mapsdk.internal.jj.a(elapsedRealtime2, f18);
                double[] dArr = this.A;
                dArr[2] = dArr[2] + java.lang.Math.abs(a17);
                double[] dArr2 = this.A;
                dArr2[3] = dArr2[3] + java.lang.Math.abs(a18);
                boolean z18 = this.A[2] >= java.lang.Math.abs(m17);
                boolean z19 = this.A[3] >= java.lang.Math.abs(i17);
                if (z18) {
                    this.A[0] = d17 - com.tencent.mapsdk.internal.ad.this.h();
                } else {
                    this.A[0] = a17;
                }
                if (z19) {
                    this.A[1] = d18 - com.tencent.mapsdk.internal.ad.this.i();
                } else {
                    this.A[1] = a18;
                }
                return z18 && z19;
            }
        });
    }

    @Override // com.tencent.mapsdk.internal.pa
    public final void b(boolean z17) {
        if (z17) {
            java.lang.Runnable runnable = this.f48817ac;
            if (runnable != null) {
                runnable.run();
                this.f48817ac = null;
            }
            c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r0.f52444m > r0.f52441j) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Runnable r6) {
        /*
            r5 = this;
            com.tencent.mapsdk.internal.v r0 = r5.A
            java.util.List<com.tencent.mapsdk.internal.v$a> r0 = r0.f52427t
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
        L9:
            r2 = r1
        La:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto L22
            java.lang.Object r3 = r0.next()
            com.tencent.mapsdk.internal.v$a r3 = (com.tencent.mapsdk.internal.v.a) r3
            if (r2 == 0) goto L20
            boolean r2 = r3.b()
            if (r2 != 0) goto L20
            goto L9
        L20:
            r2 = r4
            goto La
        L22:
            if (r2 == 0) goto L2f
            com.tencent.mapsdk.internal.v r0 = r5.A
            com.tencent.mapsdk.internal.v$b r0 = r0.f52409b
            int r2 = r0.f52444m
            int r0 = r0.f52441j
            if (r2 <= r0) goto L2f
            goto L30
        L2f:
            r1 = r4
        L30:
            if (r1 == 0) goto L52
            com.tencent.mapsdk.internal.bd r0 = r5.f48829z
            com.tencent.mapsdk.internal.tk r0 = r0.i()
            long r1 = r0.f51661e
            r3 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L4d
            com.tencent.mapsdk.internal.ne r1 = r0.f51666j
            if (r1 != 0) goto L45
            goto L4d
        L45:
            com.tencent.mapsdk.internal.tk$5 r2 = new com.tencent.mapsdk.internal.tk$5
            r2.<init>()
            r1.a(r2)
        L4d:
            if (r6 == 0) goto L52
            r6.run()
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ad.b(java.lang.Runnable):void");
    }

    public final void a(float f17, float f18, boolean z17) {
        this.A.a(f17 - 0.5f, f18 - 0.5f, z17);
        if (z17) {
            c();
        }
    }

    private void a(com.tencent.mapsdk.internal.fg fgVar) {
        if (fgVar == null) {
            return;
        }
        if (this.f48822s == null) {
            this.f48822s = new java.util.ArrayList();
        }
        synchronized (this.f48823t) {
            if (!this.f48822s.contains(fgVar)) {
                this.f48822s.add(fgVar);
            }
        }
    }

    public final void a(com.tencent.mapsdk.internal.fm fmVar) {
        if (fmVar == null) {
            return;
        }
        synchronized (this.W) {
            if (!this.W.contains(fmVar)) {
                this.W.add(fmVar);
            }
        }
    }

    private void b(com.tencent.map.lib.models.GeoPoint geoPoint) {
        a(geoPoint, (java.lang.Runnable) null);
    }

    private void a(com.tencent.mapsdk.internal.fl flVar) {
        if (flVar == null) {
            return;
        }
        synchronized (this.f48824u) {
            if (!this.f48824u.contains(flVar)) {
                this.f48824u.add(flVar);
            }
        }
    }

    public final void a(com.tencent.mapsdk.internal.fq fqVar) {
        if (fqVar == null) {
            return;
        }
        synchronized (this.X) {
            if (!this.X.contains(fqVar)) {
                this.X.add(fqVar);
            }
        }
    }

    private void a(com.tencent.mapsdk.internal.fj fjVar) {
        if (fjVar == null) {
            return;
        }
        synchronized (this.f48820q) {
            if (!this.f48820q.contains(fjVar)) {
                this.f48820q.add(fjVar);
            }
        }
    }

    private void a(com.tencent.mapsdk.internal.fe feVar) {
        if (feVar == null) {
            return;
        }
        synchronized (this.f48821r) {
            if (!this.f48821r.contains(feVar)) {
                this.f48821r.add(feVar);
            }
        }
    }

    public final void a(com.tencent.mapsdk.internal.ph phVar) {
        if (phVar == null || this.V.contains(phVar)) {
            return;
        }
        this.V.add(phVar);
    }

    public final void a(com.tencent.mapsdk.internal.fr frVar) {
        if (frVar == null) {
            return;
        }
        synchronized (this.Y) {
            if (!this.Y.contains(frVar)) {
                this.Y.add(frVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r1 > r10) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.tencent.map.lib.models.GeoPoint r10, android.graphics.Rect r11) {
        /*
            r9 = this;
            com.tencent.mapsdk.internal.ey r0 = r9.B
            com.tencent.mapsdk.internal.fu r10 = r0.a(r10)
            double r1 = r10.f49467a
            int r1 = (int) r1
            double r2 = r10.f49468b
            int r2 = (int) r2
            boolean r1 = r11.contains(r1, r2)
            if (r1 == 0) goto L13
            return
        L13:
            double r1 = r10.f49467a
            int r3 = r11.left
            double r4 = (double) r3
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r5 = 0
            if (r4 >= 0) goto L21
        L1e:
            double r3 = (double) r3
            double r3 = r3 - r1
            goto L2a
        L21:
            int r3 = r11.right
            double r7 = (double) r3
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 <= 0) goto L29
            goto L1e
        L29:
            r3 = r5
        L2a:
            double r1 = r10.f49468b
            int r10 = r11.top
            double r7 = (double) r10
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 >= 0) goto L37
        L33:
            double r10 = (double) r10
            double r5 = r10 - r1
            goto L3f
        L37:
            int r10 = r11.bottom
            double r7 = (double) r10
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 <= 0) goto L3f
            goto L33
        L3f:
            com.tencent.mapsdk.internal.v r10 = r9.A
            com.tencent.map.lib.models.GeoPoint r10 = r10.f52420m
            com.tencent.mapsdk.internal.fu r10 = r0.a(r10)
            double r1 = r10.f49467a
            double r1 = r1 - r3
            r10.f49467a = r1
            double r1 = r10.f49468b
            double r1 = r1 - r5
            r10.f49468b = r1
            com.tencent.map.lib.models.GeoPoint r10 = r0.a(r10)
            r11 = 0
            r9.a(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ad.a(com.tencent.map.lib.models.GeoPoint, android.graphics.Rect):void");
    }

    public final void a(com.tencent.map.lib.models.GeoPoint geoPoint, int i17, java.lang.Runnable runnable) {
        a(geoPoint, i17, runnable);
    }

    public final void a(com.tencent.map.lib.models.GeoPoint geoPoint, float f17, java.lang.Runnable runnable) {
        if (geoPoint == null) {
            return;
        }
        int max = this.f48828y.d().getMinScaleLevel() != -1 ? java.lang.Math.max(this.f48828y.d().getMinScaleLevel(), 3) : 3;
        int min = this.f48828y.d().getMaxScaleLevel() == -1 ? 20 : java.lang.Math.min(this.f48828y.d().getMaxScaleLevel(), 22);
        if (f17 >= max && f17 <= min) {
            this.f48829z.i().a(geoPoint, (int) f17);
        }
        this.f48817ac = runnable;
    }

    public final void a(int i17, java.lang.Runnable runnable) {
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.tk i18 = this.f48829z.i();
        if (0 != i18.f51661e && (neVar = i18.f51666j) != null) {
            neVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass3(i17));
        }
        runnable.run();
    }

    private void a(int i17, double d17) {
        a(i17, (java.lang.Runnable) new com.tencent.mapsdk.internal.ad.AnonymousClass5(d17));
    }

    private com.tencent.mapsdk.internal.iw a(int i17, java.lang.Object obj, java.lang.Object obj2) {
        if (i17 == 0) {
            return com.tencent.mapsdk.internal.jg.a((com.tencent.mapsdk.internal.it) this, 0, 1);
        }
        if (i17 == 1) {
            return com.tencent.mapsdk.internal.jg.a((com.tencent.mapsdk.internal.it) this, (com.tencent.mapsdk.internal.jk) new com.tencent.mapsdk.internal.ik(), new java.lang.Object[]{obj, obj2});
        }
        if (i17 == 2) {
            return com.tencent.mapsdk.internal.jg.a(this, 3, java.lang.Math.log10(((java.lang.Number) obj).doubleValue()) / java.lang.Math.log10(2.0d), java.lang.Math.log10(((java.lang.Number) obj2).doubleValue()) / java.lang.Math.log10(2.0d));
        }
        if (i17 == 3) {
            return com.tencent.mapsdk.internal.jg.a(this, 2, h(), (((java.lang.Number) obj2).doubleValue() - ((java.lang.Number) obj).doubleValue()) + h());
        }
        if (i17 != 4) {
            return null;
        }
        return com.tencent.mapsdk.internal.jg.a(this, 4, i(), (((java.lang.Number) obj2).doubleValue() - ((java.lang.Number) obj).doubleValue()) + i());
    }

    @Override // com.tencent.mapsdk.internal.it
    public final void a(int i17, java.lang.Object obj) {
        if (i17 == 1) {
            com.tencent.map.lib.models.GeoPoint geoPoint = (com.tencent.map.lib.models.GeoPoint) obj;
            a(geoPoint.getLatitudeE6(), geoPoint.getLongitudeE6(), 2);
        } else if (i17 == 2) {
            e(((java.lang.Number) obj).doubleValue() - h());
        } else if (i17 == 3) {
            a((float) java.lang.Math.pow(2.0d, ((java.lang.Number) obj).doubleValue()));
        } else {
            if (i17 != 4) {
                return;
            }
            d(((java.lang.Number) obj).doubleValue() - i());
        }
    }

    public final void a(int i17, int i18) {
        b(i17, i18);
    }

    private void a(com.tencent.mapsdk.internal.ad.a aVar) {
        this.D = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.tencent.map.lib.models.GeoPoint r14, com.tencent.mapsdk.internal.iv r15) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ad.a(com.tencent.map.lib.models.GeoPoint, com.tencent.mapsdk.internal.iv):void");
    }

    public static com.tencent.mapsdk.internal.fu a(com.tencent.map.lib.models.GeoPoint geoPoint) {
        double min = java.lang.Math.min(java.lang.Math.max(java.lang.Math.sin((geoPoint.getLatitudeE6() / 1000000.0d) * 0.017453292519943295d), -0.9999d), 0.9999d);
        double longitudeE6 = ((geoPoint.getLongitudeE6() / 1000000.0d) * 745654.0444444445d) + 1.34217728E8d;
        double log = (java.lang.Math.log((min + 1.0d) / (1.0d - min)) * 4.272282972352698E7d * 0.5d) + 1.34217728E8d;
        com.tencent.mapsdk.internal.fu fuVar = new com.tencent.mapsdk.internal.fu();
        fuVar.a(longitudeE6, log);
        return fuVar;
    }

    public final void a(java.lang.Runnable runnable) {
        if (l()) {
            this.f48829z.i().c(this.f48829z.j().width() / 2.0f, this.f48829z.j().height() / 2.0f);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void a(com.tencent.map.lib.models.GeoPoint geoPoint, java.lang.Runnable runnable) {
        if (geoPoint == null) {
            return;
        }
        a(geoPoint, this.A.f52409b.f52444m, runnable);
    }
}
