package a7;

/* loaded from: classes13.dex */
public class u0 implements u6.e, u6.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f83398d;

    /* renamed from: e, reason: collision with root package name */
    public final m3.e f83399e;

    /* renamed from: f, reason: collision with root package name */
    public int f83400f;

    /* renamed from: g, reason: collision with root package name */
    public com.p147xb1cd08cc.p148x5de23a5.g f83401g;

    /* renamed from: h, reason: collision with root package name */
    public u6.d f83402h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f83403i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f83404m;

    public u0(java.util.List list, m3.e eVar) {
        this.f83399e = eVar;
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Must not be empty.");
        }
        this.f83398d = list;
        this.f83400f = 0;
    }

    @Override // u6.e
    public java.lang.Class a() {
        return ((u6.e) this.f83398d.get(0)).a();
    }

    @Override // u6.e
    public t6.a b() {
        return ((u6.e) this.f83398d.get(0)).b();
    }

    @Override // u6.d
    public void c(java.lang.Object obj) {
        if (obj != null) {
            this.f83402h.c(obj);
        } else {
            f();
        }
    }

    @Override // u6.e
    /* renamed from: cancel */
    public void mo751xae7a2e7a() {
        this.f83404m = true;
        java.util.Iterator it = this.f83398d.iterator();
        while (it.hasNext()) {
            ((u6.e) it.next()).mo751xae7a2e7a();
        }
    }

    @Override // u6.d
    public void d(java.lang.Exception exc) {
        java.util.List list = this.f83403i;
        q7.n.b(list);
        list.add(exc);
        f();
    }

    @Override // u6.e
    public void e(com.p147xb1cd08cc.p148x5de23a5.g gVar, u6.d dVar) {
        this.f83401g = gVar;
        this.f83402h = dVar;
        this.f83403i = (java.util.List) this.f83399e.a();
        ((u6.e) this.f83398d.get(this.f83400f)).e(gVar, this);
        if (this.f83404m) {
            mo751xae7a2e7a();
        }
    }

    public final void f() {
        if (this.f83404m) {
            return;
        }
        if (this.f83400f < this.f83398d.size() - 1) {
            this.f83400f++;
            e(this.f83401g, this.f83402h);
        } else {
            q7.n.b(this.f83403i);
            this.f83402h.d(new w6.t0("Fetch failed", new java.util.ArrayList(this.f83403i)));
        }
    }

    @Override // u6.e
    public void h() {
        java.util.List list = this.f83403i;
        if (list != null) {
            this.f83399e.b(list);
        }
        this.f83403i = null;
        java.util.Iterator it = this.f83398d.iterator();
        while (it.hasNext()) {
            ((u6.e) it.next()).h();
        }
    }
}
