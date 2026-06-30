package wp;

/* loaded from: classes16.dex */
public abstract class a {
    public static final java.util.concurrent.atomic.AtomicInteger C = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f529863a;

    /* renamed from: b, reason: collision with root package name */
    public final xp.d f529864b;

    /* renamed from: d, reason: collision with root package name */
    public long f529866d;

    /* renamed from: e, reason: collision with root package name */
    public zp.h f529867e;

    /* renamed from: f, reason: collision with root package name */
    public long f529868f;

    /* renamed from: k, reason: collision with root package name */
    public float f529873k;

    /* renamed from: l, reason: collision with root package name */
    public int f529874l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f529875m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f529876n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Canvas f529877o;

    /* renamed from: p, reason: collision with root package name */
    public int f529878p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f529880r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f529881s;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Object f529887y;

    /* renamed from: c, reason: collision with root package name */
    public final int f529865c = C.incrementAndGet();

    /* renamed from: g, reason: collision with root package name */
    public long f529869g = 2000;

    /* renamed from: i, reason: collision with root package name */
    public float f529871i = -1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f529872j = -1.0f;

    /* renamed from: q, reason: collision with root package name */
    public int f529879q = -1;

    /* renamed from: t, reason: collision with root package name */
    public boolean f529882t = false;

    /* renamed from: u, reason: collision with root package name */
    public float f529883u = -1.0f;

    /* renamed from: v, reason: collision with root package name */
    public float f529884v = -1.0f;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f529885w = true;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f529886x = true;

    /* renamed from: z, reason: collision with root package name */
    public int f529888z = 0;
    public boolean A = false;
    public long B = 0;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.PriorityQueue f529870h = new java.util.PriorityQueue();

    public a(xp.d dVar) {
        this.f529863a = "";
        this.f529864b = dVar;
        this.f529863a = dVar.f537374i + "_BaseDanmaku";
        try {
            dVar.d(j());
        } catch (java.lang.Exception unused) {
            if (vp.c.f520270b) {
                throw new java.lang.RuntimeException("IDanmakuUIConfig should been provided by IDanmakuUIConfigCreator in DanmakuContext");
            }
        }
        v();
    }

    public void a() {
    }

    public void b() {
        xp.f fVar;
        wp.f fVar2 = (wp.f) this;
        float f17 = fVar2.D + fVar2.f529871i;
        if (this.f529882t || f17 > h()) {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                m174284x9616526c();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f529863a, "onFirstExposure, danmaku = " + this);
        xp.d dVar = this.f529864b;
        if (dVar != null && (fVar = dVar.f537369d) != null) {
            fVar.a(this);
        }
        this.f529882t = true;
    }

    public abstract void c();

    public abstract float[] d(long j17);

    public float e() {
        return ((wp.f) this).D + xp.d.f().f537381e;
    }

    /* renamed from: equals */
    public boolean m174282xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        java.lang.Object obj2 = this.f529887y;
        java.lang.Object obj3 = ((wp.a) obj).f529887y;
        return obj2 != null ? obj2.equals(obj3) : obj3 == null;
    }

    public float f() {
        return i() + xp.d.f().f537380d;
    }

    public abstract float[] g(long j17);

    public int h() {
        return xp.d.f().f537386j;
    }

    /* renamed from: hashCode */
    public int m174283x8cdac1b() {
        java.lang.Object obj = this.f529887y;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public abstract float i();

    public abstract int j();

    public boolean k(float f17, float f18, float f19, long j17) {
        float[] fArr;
        wp.f fVar = (wp.f) this;
        if (fVar.n()) {
            float y17 = fVar.y(j17);
            if (fVar.F == null) {
                fVar.F = new float[4];
            }
            float[] fArr2 = fVar.F;
            fArr2[0] = y17;
            float f27 = fVar.E;
            fArr2[1] = f27;
            fArr2[2] = y17 + fVar.f529871i;
            fArr2[3] = f27 + fVar.f529872j;
            fArr = fArr2;
        } else {
            fArr = null;
        }
        if (fArr == null) {
            return false;
        }
        return fArr[0] <= f17 && f17 <= fArr[2] + f19 && fArr[1] <= f18 && f18 <= fArr[3];
    }

    public boolean l(long j17) {
        long j18 = this.f529866d;
        return j18 > 0 && j17 - j18 < 0;
    }

    public boolean m(long j17) {
        long j18 = this.f529866d;
        return j18 > 0 && j17 - j18 >= this.f529867e.f556446a;
    }

    public boolean n() {
        return this.f529871i >= 0.0f && this.f529872j >= 0.0f && !this.f529885w;
    }

    public boolean o() {
        return this.f529874l == 1;
    }

    public boolean p(long j17) {
        return !this.f529881s && j17 - this.f529868f >= this.f529867e.f556446a;
    }

    public boolean q(long j17) {
        return !this.f529881s && j17 - this.f529868f >= this.f529869g;
    }

    public zp.d r(zp.m mVar) {
        return new zp.d(-1);
    }

    public abstract void s(float f17, float f18, long j17, long j18);

    public final void t(long j17, long j18) {
        if (this.f529880r) {
            this.f529866d += j17;
        }
        wp.f fVar = (wp.f) this;
        fVar.D = fVar.y(j18);
        java.util.PriorityQueue priorityQueue = this.f529870h;
        if (priorityQueue.isEmpty()) {
            return;
        }
        java.util.Iterator it = priorityQueue.iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
    }

    /* renamed from: toString */
    public java.lang.String m174284x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BaseDanmaku");
        sb6.append(this.f529865c);
        sb6.append("[left:");
        wp.f fVar = (wp.f) this;
        sb6.append(fVar.D);
        sb6.append(",top:");
        sb6.append(i());
        sb6.append(",right:");
        sb6.append(fVar.D + fVar.f529871i);
        sb6.append(",bottom:");
        sb6.append(fVar.E + fVar.f529872j);
        sb6.append(", time:");
        sb6.append(this.f529868f);
        sb6.append(", mFirstDrawTime:");
        sb6.append(this.f529866d);
        sb6.append(", mData=");
        sb6.append(java.lang.String.valueOf(this.f529887y));
        sb6.append("mType=");
        sb6.append(j());
        sb6.append("]");
        return sb6.toString();
    }

    public void u(long j17) {
        wp.f fVar = (wp.f) this;
        this.f529866d = j17 - ((int) ((h() - fVar.D) / (-(-fVar.G))));
    }

    public void v() {
        xp.i f17 = xp.d.f();
        this.f529873k = f17.f537383g;
        this.f529875m = f17.f537385i;
        this.f529870h.clear();
        this.f529871i = -1.0f;
        this.f529872j = -1.0f;
        this.f529874l = 0;
        this.f529876n = null;
        this.f529878p = 0;
        this.f529880r = false;
        this.f529882t = false;
        this.f529885w = true;
        this.f529886x = true;
        this.f529883u = -1.0f;
        this.f529884v = -1.0f;
        this.f529888z = 0;
        c();
    }

    public void w(zp.h hVar) {
        this.f529867e = hVar;
    }

    public void x(boolean z17) {
        if (z17) {
            this.f529874l = 1;
        } else {
            this.f529874l = 0;
        }
    }
}
