package g1;

/* loaded from: classes14.dex */
public final class d implements g1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.g f349043a;

    public d(g1.g gVar) {
        this.f349043a = gVar;
    }

    public void a(float f17, float f18, float f19, float f27, int i17) {
        ((g1.b) this.f349043a).a().d(f17, f18, f19, f27, i17);
    }

    public void b(float f17, float f18, float f19, float f27) {
        g1.g gVar = this.f349043a;
        g1.b bVar = (g1.b) gVar;
        e1.u a17 = bVar.a();
        long a18 = d1.l.a(d1.k.d(((g1.b) gVar).b()) - (f19 + f17), d1.k.b(((g1.b) gVar).b()) - (f27 + f18));
        if (!(d1.k.d(a18) >= 0.0f && d1.k.b(a18) >= 0.0f)) {
            throw new java.lang.IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
        }
        bVar.c(a18);
        a17.e(f17, f18);
    }

    public void c(float f17, long j17) {
        e1.u a17 = ((g1.b) this.f349043a).a();
        a17.e(d1.e.c(j17), d1.e.d(j17));
        a17.o(f17);
        a17.e(-d1.e.c(j17), -d1.e.d(j17));
    }

    public void d(float f17, float f18, long j17) {
        e1.u a17 = ((g1.b) this.f349043a).a();
        a17.e(d1.e.c(j17), d1.e.d(j17));
        a17.h(f17, f18);
        a17.e(-d1.e.c(j17), -d1.e.d(j17));
    }

    public void e(float f17, float f18) {
        ((g1.b) this.f349043a).a().e(f17, f18);
    }
}
