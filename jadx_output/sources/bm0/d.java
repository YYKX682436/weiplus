package bm0;

/* loaded from: classes13.dex */
public class d extends bm0.c {

    /* renamed from: b, reason: collision with root package name */
    public final bm0.c f21741b;

    public d(zl0.a aVar) {
        this.f21740a = aVar;
        if (aVar.c().endsWith(".json")) {
            this.f21741b = new cm0.b(aVar);
        } else {
            this.f21741b = new dm0.d(aVar);
        }
    }

    @Override // bm0.c
    public boolean a() {
        return this.f21741b.a();
    }

    @Override // bm0.c
    public boolean b() {
        return this.f21741b.b();
    }

    @Override // bm0.c
    public bm0.a c(fl0.b bVar) {
        return this.f21741b.c(bVar);
    }

    @Override // bm0.c
    public void d() {
        this.f21741b.d();
    }
}
