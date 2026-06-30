package p012xc85e97e9.p125x37c711.p126x316220;

/* renamed from: androidx.work.impl.WorkDatabase_Impl */
/* loaded from: classes13.dex */
public final class C1266x839c9ed3 extends p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f94007s = 0;

    /* renamed from: l, reason: collision with root package name */
    public volatile j5.x f94008l;

    /* renamed from: m, reason: collision with root package name */
    public volatile j5.b f94009m;

    /* renamed from: n, reason: collision with root package name */
    public volatile j5.i0 f94010n;

    /* renamed from: o, reason: collision with root package name */
    public volatile j5.j f94011o;

    /* renamed from: p, reason: collision with root package name */
    public volatile j5.o f94012p;

    /* renamed from: q, reason: collision with root package name */
    public volatile j5.r f94013q;

    /* renamed from: r, reason: collision with root package name */
    public volatile j5.f f94014r;

    @Override // l4.q
    public l4.j d() {
        return new l4.j(this, new java.util.HashMap(0), new java.util.HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // l4.q
    public p4.f e(l4.a aVar) {
        l4.t tVar = new l4.t(aVar, new b5.v(this, 12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        android.content.Context context = aVar.f397237b;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return aVar.f397236a.a(new p4.d(context, aVar.f397238c, tVar, false));
    }

    @Override // p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc
    public j5.b i() {
        j5.b bVar;
        if (this.f94009m != null) {
            return this.f94009m;
        }
        synchronized (this) {
            if (this.f94009m == null) {
                this.f94009m = new j5.d(this);
            }
            bVar = this.f94009m;
        }
        return bVar;
    }

    @Override // p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc
    public j5.f j() {
        j5.f fVar;
        if (this.f94014r != null) {
            return this.f94014r;
        }
        synchronized (this) {
            if (this.f94014r == null) {
                this.f94014r = new j5.h(this);
            }
            fVar = this.f94014r;
        }
        return fVar;
    }

    @Override // p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc
    public j5.j k() {
        j5.j jVar;
        if (this.f94011o != null) {
            return this.f94011o;
        }
        synchronized (this) {
            if (this.f94011o == null) {
                this.f94011o = new j5.m(this);
            }
            jVar = this.f94011o;
        }
        return jVar;
    }

    @Override // p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc
    public j5.o l() {
        j5.o oVar;
        if (this.f94012p != null) {
            return this.f94012p;
        }
        synchronized (this) {
            if (this.f94012p == null) {
                this.f94012p = new j5.q(this);
            }
            oVar = this.f94012p;
        }
        return oVar;
    }

    @Override // p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc
    public j5.r m() {
        j5.r rVar;
        if (this.f94013q != null) {
            return this.f94013q;
        }
        synchronized (this) {
            if (this.f94013q == null) {
                this.f94013q = new j5.u(this);
            }
            rVar = this.f94013q;
        }
        return rVar;
    }

    @Override // p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc
    public j5.x n() {
        j5.x xVar;
        if (this.f94008l != null) {
            return this.f94008l;
        }
        synchronized (this) {
            if (this.f94008l == null) {
                this.f94008l = new j5.g0(this);
            }
            xVar = this.f94008l;
        }
        return xVar;
    }

    @Override // p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc
    public j5.i0 o() {
        j5.i0 i0Var;
        if (this.f94010n != null) {
            return this.f94010n;
        }
        synchronized (this) {
            if (this.f94010n == null) {
                this.f94010n = new j5.k0(this);
            }
            i0Var = this.f94010n;
        }
        return i0Var;
    }
}
