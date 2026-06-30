package bm0;

/* loaded from: classes13.dex */
public class d extends bm0.c {

    /* renamed from: b, reason: collision with root package name */
    public final bm0.c f103274b;

    public d(zl0.a aVar) {
        this.f103273a = aVar;
        if (aVar.c().endsWith(".json")) {
            this.f103274b = new cm0.b(aVar);
        } else {
            this.f103274b = new dm0.d(aVar);
        }
    }

    @Override // bm0.c
    public boolean a() {
        return this.f103274b.a();
    }

    @Override // bm0.c
    public boolean b() {
        return this.f103274b.b();
    }

    @Override // bm0.c
    public bm0.a c(fl0.b bVar) {
        return this.f103274b.c(bVar);
    }

    @Override // bm0.c
    public void d() {
        this.f103274b.d();
    }
}
