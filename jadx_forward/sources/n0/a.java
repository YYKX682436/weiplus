package n0;

/* loaded from: classes13.dex */
public abstract class a implements n0.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f414957a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f414958b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f414959c;

    public a(java.lang.Object obj) {
        this.f414957a = obj;
        this.f414959c = obj;
    }

    @Override // n0.e
    public java.lang.Object a() {
        return this.f414959c;
    }

    @Override // n0.e
    public void c() {
    }

    @Override // n0.e
    /* renamed from: clear */
    public final void mo148702x5a5b64d() {
        ((java.util.ArrayList) this.f414958b).clear();
        this.f414959c = this.f414957a;
        j();
    }

    @Override // n0.e
    public void d() {
    }

    @Override // n0.e
    public void h(java.lang.Object obj) {
        ((java.util.ArrayList) this.f414958b).add(this.f414959c);
        this.f414959c = obj;
    }

    @Override // n0.e
    public void i() {
        java.util.List list = this.f414958b;
        if (!(!list.isEmpty())) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.f414959c = ((java.util.ArrayList) list).remove(((java.util.ArrayList) list).size() - 1);
    }

    public abstract void j();
}
