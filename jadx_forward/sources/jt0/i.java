package jt0;

/* loaded from: classes15.dex */
public final class i extends jt0.b {

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f383134j;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383135f;

    /* renamed from: g, reason: collision with root package name */
    public kk.j f383136g;

    /* renamed from: h, reason: collision with root package name */
    public final kk.h f383137h;

    /* renamed from: i, reason: collision with root package name */
    public final kk.i f383138i;

    static {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        f383134j = concurrentHashMap;
        concurrentHashMap.put(android.graphics.Bitmap.class, new jt0.c());
        concurrentHashMap.put(java.lang.ref.WeakReference.class, new jt0.d());
    }

    public i(int i17, kk.h hVar, java.lang.Class cls) {
        this(i17, hVar, lt0.a.f402695c, cls);
        v(cls);
    }

    @Override // lt0.f, kk.j
    public java.lang.Object i(java.lang.Object obj) {
        kk.j jVar;
        java.lang.String str = (java.lang.String) obj;
        java.lang.Object i17 = this.f402700b.i(str);
        if (i17 == null && (jVar = this.f383136g) != null) {
            i17 = ((lt0.f) jVar).get(str);
        }
        lt0.c cVar = this.f402701c;
        if (cVar != null) {
            lt0.i iVar = (lt0.i) cVar;
            lt0.b bVar = (lt0.b) iVar.f402706a.i(iVar.b(this.f383135f, str));
            if (bVar == null) {
                bVar = null;
            }
        }
        lt0.a aVar = lt0.a.f402695c;
        return i17;
    }

    @Override // lt0.f, kk.j
    public void j(java.lang.Object obj, java.lang.Object obj2) {
        kk.j jVar;
        java.lang.String str = (java.lang.String) obj;
        if (!t(obj2) || (jVar = this.f383136g) == null) {
            super.j(str, obj2);
        } else {
            ((lt0.f) jVar).put(str, obj2);
        }
    }

    @Override // kk.j
    public java.util.Map l() {
        return this.f402700b.l();
    }

    @Override // lt0.f
    public java.lang.Object m() {
        return this.f383135f;
    }

    @Override // lt0.f
    public kk.j n() {
        return new kk.l(this.f402702d, new jt0.e(this));
    }

    @Override // lt0.f
    public lt0.c o(lt0.a aVar) {
        return kt0.g.a(aVar);
    }

    @Override // lt0.f
    public void p() {
        super.p();
    }

    @Override // lt0.f
    public java.lang.Object q(java.lang.Object obj, java.lang.Object obj2) {
        return obj2;
    }

    @Override // lt0.f
    public java.lang.Object r(java.lang.Object obj, java.lang.Object obj2) {
        return new kt0.a((java.lang.String) obj, this.f383135f, obj2, y(obj2), this.f383137h, this.f383138i);
    }

    @Override // lt0.f
    public java.lang.Object s(java.lang.Object obj) {
        return obj;
    }

    public final boolean t(java.lang.Object obj) {
        int i17;
        int y17 = y(obj) * 2;
        kt0.g gVar = kt0.g.f393445c;
        lt0.a aVar = this.f402699a;
        if (aVar == null || aVar.m146309xb2c87fbf("")) {
            i17 = Integer.MAX_VALUE;
        } else if (kt0.g.f393446d.m146309xb2c87fbf(aVar)) {
            i17 = ((kt0.e) kt0.g.b().f393447a).f393444c.f402696a;
        } else {
            kt0.g.b().getClass();
            i17 = ((kt0.e) ((kt0.f) kt0.g.b().f393448b.get(aVar.f402697b))).f393444c.f402696a;
        }
        return y17 >= i17;
    }

    @Override // lt0.f, kk.j
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public java.lang.Object get(java.lang.String str) {
        kk.j jVar;
        java.lang.Object obj = this.f402700b.get(str);
        if (obj == null && (jVar = this.f383136g) != null) {
            obj = ((lt0.f) jVar).get(str);
        }
        lt0.c cVar = this.f402701c;
        if (cVar != null) {
            lt0.i iVar = (lt0.i) cVar;
        }
        lt0.a aVar = lt0.a.f402695c;
        return obj;
    }

    public final void v(java.lang.Class cls) {
        lt0.l lVar;
        this.f383135f = cls.getName();
        kt0.g gVar = kt0.g.f393445c;
        lt0.a aVar = this.f402699a;
        if (aVar == null || aVar.m146309xb2c87fbf("")) {
            lVar = null;
        } else if (kt0.g.f393446d.m146309xb2c87fbf(aVar)) {
            lVar = ((kt0.e) kt0.g.b().f393447a).f393443b;
        } else {
            kt0.g.b().getClass();
            lVar = ((kt0.e) ((kt0.f) kt0.g.b().f393448b.get(aVar.f402697b))).f393443b;
        }
        this.f383136g = lVar;
    }

    @Override // kk.j
    /* renamed from: values */
    public java.util.Collection mo141379xcee59d22() {
        return this.f402700b.mo141379xcee59d22();
    }

    @Override // lt0.f, kk.j
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public java.lang.Object put(java.lang.String str, java.lang.Object obj) {
        kk.j jVar;
        if (!t(obj) || (jVar = this.f383136g) == null) {
            return super.put(str, obj);
        }
        ((lt0.f) jVar).put(str, obj);
        return null;
    }

    @Override // lt0.f, kk.j
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public java.lang.Object mo141381xc84af884(java.lang.String str) {
        kk.j jVar = this.f383136g;
        if (jVar != null) {
            ((lt0.f) jVar).mo141381xc84af884(str);
        }
        return super.mo141381xc84af884(str);
    }

    public final int y(java.lang.Object obj) {
        jt0.h hVar;
        return (obj == null || (hVar = (jt0.h) f383134j.get(obj.getClass())) == null) ? this.f402700b.g("", obj) : hVar.a(obj);
    }

    public i(int i17, java.lang.Class cls) {
        this(i17, null, cls);
        v(cls);
    }

    public i(int i17, kk.h hVar, lt0.a aVar, java.lang.Class cls) {
        super(i17, hVar, aVar);
        this.f383135f = "";
        this.f383136g = null;
        this.f383137h = new jt0.f(this);
        this.f383138i = new jt0.g(this);
        v(cls);
    }
}
