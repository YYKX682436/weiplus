package j11;

@j95.b
/* loaded from: classes11.dex */
public class q extends i95.w implements ct.z2 {

    /* renamed from: d, reason: collision with root package name */
    public j11.g f378676d;

    /* renamed from: e, reason: collision with root package name */
    public volatile c01.k7 f378677e;

    public static j11.g Ai() {
        gm0.j1.b().c();
        if (((j11.q) i95.n0.c(j11.q.class)).f378676d == null) {
            ((j11.q) i95.n0.c(j11.q.class)).f378676d = new j11.g(c01.d9.b().s());
        }
        return ((j11.q) i95.n0.c(j11.q.class)).f378676d;
    }

    public c01.p8 wi() {
        if (this.f378677e == null) {
            synchronized (this) {
                if (this.f378677e == null) {
                    this.f378677e = new c01.k7(new j11.h());
                }
            }
        }
        return this.f378677e;
    }
}
