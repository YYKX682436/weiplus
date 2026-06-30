package androidx.work.impl;

/* loaded from: classes13.dex */
public final class WorkDatabase_Impl extends androidx.work.impl.WorkDatabase {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f12474s = 0;

    /* renamed from: l, reason: collision with root package name */
    public volatile j5.x f12475l;

    /* renamed from: m, reason: collision with root package name */
    public volatile j5.b f12476m;

    /* renamed from: n, reason: collision with root package name */
    public volatile j5.i0 f12477n;

    /* renamed from: o, reason: collision with root package name */
    public volatile j5.j f12478o;

    /* renamed from: p, reason: collision with root package name */
    public volatile j5.o f12479p;

    /* renamed from: q, reason: collision with root package name */
    public volatile j5.r f12480q;

    /* renamed from: r, reason: collision with root package name */
    public volatile j5.f f12481r;

    @Override // l4.q
    public l4.j d() {
        return new l4.j(this, new java.util.HashMap(0), new java.util.HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // l4.q
    public p4.f e(l4.a aVar) {
        l4.t tVar = new l4.t(aVar, new b5.v(this, 12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        android.content.Context context = aVar.f315704b;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return aVar.f315703a.a(new p4.d(context, aVar.f315705c, tVar, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public j5.b i() {
        j5.b bVar;
        if (this.f12476m != null) {
            return this.f12476m;
        }
        synchronized (this) {
            if (this.f12476m == null) {
                this.f12476m = new j5.d(this);
            }
            bVar = this.f12476m;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public j5.f j() {
        j5.f fVar;
        if (this.f12481r != null) {
            return this.f12481r;
        }
        synchronized (this) {
            if (this.f12481r == null) {
                this.f12481r = new j5.h(this);
            }
            fVar = this.f12481r;
        }
        return fVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public j5.j k() {
        j5.j jVar;
        if (this.f12478o != null) {
            return this.f12478o;
        }
        synchronized (this) {
            if (this.f12478o == null) {
                this.f12478o = new j5.m(this);
            }
            jVar = this.f12478o;
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public j5.o l() {
        j5.o oVar;
        if (this.f12479p != null) {
            return this.f12479p;
        }
        synchronized (this) {
            if (this.f12479p == null) {
                this.f12479p = new j5.q(this);
            }
            oVar = this.f12479p;
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public j5.r m() {
        j5.r rVar;
        if (this.f12480q != null) {
            return this.f12480q;
        }
        synchronized (this) {
            if (this.f12480q == null) {
                this.f12480q = new j5.u(this);
            }
            rVar = this.f12480q;
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public j5.x n() {
        j5.x xVar;
        if (this.f12475l != null) {
            return this.f12475l;
        }
        synchronized (this) {
            if (this.f12475l == null) {
                this.f12475l = new j5.g0(this);
            }
            xVar = this.f12475l;
        }
        return xVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public j5.i0 o() {
        j5.i0 i0Var;
        if (this.f12477n != null) {
            return this.f12477n;
        }
        synchronized (this) {
            if (this.f12477n == null) {
                this.f12477n = new j5.k0(this);
            }
            i0Var = this.f12477n;
        }
        return i0Var;
    }
}
