package a7;

/* loaded from: classes13.dex */
public class u0 implements u6.e, u6.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f1865d;

    /* renamed from: e, reason: collision with root package name */
    public final m3.e f1866e;

    /* renamed from: f, reason: collision with root package name */
    public int f1867f;

    /* renamed from: g, reason: collision with root package name */
    public com.bumptech.glide.g f1868g;

    /* renamed from: h, reason: collision with root package name */
    public u6.d f1869h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f1870i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1871m;

    public u0(java.util.List list, m3.e eVar) {
        this.f1866e = eVar;
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Must not be empty.");
        }
        this.f1865d = list;
        this.f1867f = 0;
    }

    @Override // u6.e
    public java.lang.Class a() {
        return ((u6.e) this.f1865d.get(0)).a();
    }

    @Override // u6.e
    public t6.a b() {
        return ((u6.e) this.f1865d.get(0)).b();
    }

    @Override // u6.d
    public void c(java.lang.Object obj) {
        if (obj != null) {
            this.f1869h.c(obj);
        } else {
            f();
        }
    }

    @Override // u6.e
    public void cancel() {
        this.f1871m = true;
        java.util.Iterator it = this.f1865d.iterator();
        while (it.hasNext()) {
            ((u6.e) it.next()).cancel();
        }
    }

    @Override // u6.d
    public void d(java.lang.Exception exc) {
        java.util.List list = this.f1870i;
        q7.n.b(list);
        list.add(exc);
        f();
    }

    @Override // u6.e
    public void e(com.bumptech.glide.g gVar, u6.d dVar) {
        this.f1868g = gVar;
        this.f1869h = dVar;
        this.f1870i = (java.util.List) this.f1866e.a();
        ((u6.e) this.f1865d.get(this.f1867f)).e(gVar, this);
        if (this.f1871m) {
            cancel();
        }
    }

    public final void f() {
        if (this.f1871m) {
            return;
        }
        if (this.f1867f < this.f1865d.size() - 1) {
            this.f1867f++;
            e(this.f1868g, this.f1869h);
        } else {
            q7.n.b(this.f1870i);
            this.f1869h.d(new w6.t0("Fetch failed", new java.util.ArrayList(this.f1870i)));
        }
    }

    @Override // u6.e
    public void h() {
        java.util.List list = this.f1870i;
        if (list != null) {
            this.f1866e.b(list);
        }
        this.f1870i = null;
        java.util.Iterator it = this.f1865d.iterator();
        while (it.hasNext()) {
            ((u6.e) it.next()).h();
        }
    }
}
