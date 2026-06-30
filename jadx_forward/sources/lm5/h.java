package lm5;

/* loaded from: classes16.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public volatile lm5.d f401140a;

    /* renamed from: b, reason: collision with root package name */
    public volatile lm5.g f401141b;

    public h(lm5.d dVar, lm5.g gVar) {
        synchronized (this) {
            this.f401140a = dVar;
        }
        this.f401141b = gVar;
    }

    public void a(gm5.a aVar, java.lang.Object obj, boolean z17) {
        synchronized (this) {
            lm5.d dVar = this.f401140a;
            if (aVar instanceof lm5.e) {
                lm5.e eVar = (lm5.e) aVar;
                if (!"Vending.ANY".equals(eVar.a())) {
                    dVar = lm5.i.d(eVar.a());
                }
            }
            if (dVar == null) {
                if (this.f401141b != null) {
                    ((km5.h) this.f401141b).f390855a.j(true);
                }
                return;
            }
            lm5.f fVar = new lm5.f(this, aVar, obj, new java.lang.RuntimeException("object is not right: " + obj));
            if (z17 && lm5.i.a() == dVar) {
                fVar.run();
            } else {
                dVar.a(fVar);
            }
        }
    }
}
