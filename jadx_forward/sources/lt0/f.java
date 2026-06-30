package lt0;

/* loaded from: classes15.dex */
public abstract class f implements kk.j {

    /* renamed from: a, reason: collision with root package name */
    public final lt0.a f402699a;

    /* renamed from: b, reason: collision with root package name */
    public kk.j f402700b;

    /* renamed from: c, reason: collision with root package name */
    public lt0.c f402701c;

    /* renamed from: d, reason: collision with root package name */
    public final int f402702d;

    /* renamed from: e, reason: collision with root package name */
    public final kk.h f402703e;

    public f(int i17) {
        this.f402700b = null;
        this.f402701c = null;
        this.f402703e = null;
        this.f402702d = i17;
        p();
    }

    @Override // kk.j
    public int a() {
        int a17 = this.f402700b.a();
        lt0.c cVar = this.f402701c;
        if (cVar != null) {
            ((lt0.i) cVar).f402706a.a();
        }
        return a17;
    }

    @Override // kk.j
    public int b() {
        int b17 = this.f402700b.b();
        lt0.c cVar = this.f402701c;
        if (cVar != null) {
            ((lt0.i) cVar).f402706a.b();
        }
        return b17;
    }

    @Override // kk.j
    public void c(kk.g gVar) {
        this.f402700b.c(new lt0.e(this, gVar));
    }

    @Override // kk.j
    /* renamed from: clear */
    public void mo143584x5a5b64d() {
        this.f402700b.mo143584x5a5b64d();
    }

    @Override // kk.j
    public void d(int i17) {
        this.f402700b.d(i17);
    }

    @Override // kk.j
    public int e() {
        int e17 = this.f402700b.e();
        lt0.c cVar = this.f402701c;
        if (cVar != null) {
            ((lt0.i) cVar).f402706a.e();
        }
        return e17;
    }

    @Override // kk.j
    public int f() {
        int f17 = this.f402700b.f();
        lt0.c cVar = this.f402701c;
        if (cVar != null) {
            ((lt0.i) cVar).f402706a.f();
        }
        return f17;
    }

    @Override // kk.j
    public int g(java.lang.Object obj, java.lang.Object obj2) {
        return this.f402700b.g(obj, q(obj, obj2));
    }

    @Override // kk.j
    public java.lang.Object get(java.lang.Object obj) {
        java.lang.Object s17 = s(this.f402700b.get(obj));
        lt0.c cVar = this.f402701c;
        if (cVar != null) {
            lt0.i iVar = (lt0.i) cVar;
        }
        return s17;
    }

    @Override // kk.j
    public int h() {
        int h17 = this.f402700b.h();
        lt0.c cVar = this.f402701c;
        if (cVar != null) {
            ((lt0.i) cVar).f402706a.h();
        }
        return h17;
    }

    @Override // kk.j
    public java.lang.Object i(java.lang.Object obj) {
        java.lang.Object s17 = s(this.f402700b.i(obj));
        lt0.c cVar = this.f402701c;
        if (cVar != null) {
            lt0.i iVar = (lt0.i) cVar;
        }
        return s17;
    }

    @Override // kk.j
    public void j(java.lang.Object obj, java.lang.Object obj2) {
        this.f402700b.j(obj, q(obj, obj2));
        if (this.f402701c != null) {
            java.lang.Object m17 = m();
            lt0.c cVar = this.f402701c;
            java.lang.Object r17 = r(obj, obj2);
            lt0.i iVar = (lt0.i) cVar;
            iVar.getClass();
            lt0.a aVar = lt0.a.f402695c;
            java.lang.Object b17 = iVar.b(m17, obj);
            iVar.f402706a.j(b17, (lt0.b) r17);
        }
    }

    @Override // kk.j
    public boolean k(java.lang.Object obj) {
        boolean k17 = this.f402700b.k(obj);
        lt0.c cVar = this.f402701c;
        if (cVar != null) {
            lt0.i iVar = (lt0.i) cVar;
            iVar.f402706a.k(iVar.b(m(), obj));
        }
        return k17;
    }

    @Override // kk.j
    /* renamed from: keySet */
    public java.util.Set mo143585xbc5e1583() {
        return this.f402700b.mo143585xbc5e1583();
    }

    public abstract java.lang.Object m();

    public kk.j n() {
        return new kk.l(this.f402702d, new lt0.d(this));
    }

    public lt0.c o(lt0.a aVar) {
        return null;
    }

    public void p() {
        this.f402700b = n();
        this.f402701c = o(this.f402699a);
    }

    @Override // kk.j
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object s17 = s(this.f402700b.put(obj, q(obj, obj2)));
        if (this.f402701c != null) {
            java.lang.Object m17 = m();
            lt0.c cVar = this.f402701c;
            java.lang.Object r17 = r(obj, obj2);
            lt0.i iVar = (lt0.i) cVar;
            iVar.getClass();
            lt0.a aVar = lt0.a.f402695c;
            java.lang.Object b17 = iVar.b(m17, obj);
        }
        return s17;
    }

    public abstract java.lang.Object q(java.lang.Object obj, java.lang.Object obj2);

    public abstract java.lang.Object r(java.lang.Object obj, java.lang.Object obj2);

    @Override // kk.j
    /* renamed from: remove */
    public java.lang.Object mo141381xc84af884(java.lang.Object obj) {
        java.lang.Object s17 = s(this.f402700b.mo141381xc84af884(obj));
        lt0.c cVar = this.f402701c;
        if (cVar != null) {
            lt0.i iVar = (lt0.i) cVar;
        }
        return s17;
    }

    public abstract java.lang.Object s(java.lang.Object obj);

    @Override // kk.j
    /* renamed from: size */
    public int mo143586x35e001() {
        int mo143586x35e001 = this.f402700b.mo143586x35e001();
        lt0.c cVar = this.f402701c;
        if (cVar != null) {
            ((lt0.i) cVar).f402706a.m77804x35e001();
        }
        return mo143586x35e001;
    }

    public f(int i17, kk.h hVar) {
        this.f402700b = null;
        this.f402701c = null;
        this.f402703e = null;
        this.f402703e = hVar;
        this.f402702d = i17;
        p();
    }

    public f(int i17, kk.h hVar, lt0.a aVar) {
        this.f402700b = null;
        this.f402701c = null;
        this.f402703e = null;
        this.f402703e = hVar;
        this.f402702d = i17;
        this.f402699a = aVar;
        p();
    }
}
