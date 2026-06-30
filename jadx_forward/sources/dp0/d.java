package dp0;

/* loaded from: classes15.dex */
public abstract class d implements zo0.k {

    /* renamed from: a, reason: collision with root package name */
    public dp0.d f323647a;

    /* renamed from: b, reason: collision with root package name */
    public final dp0.b f323648b = dp0.b.f323640e;

    /* renamed from: c, reason: collision with root package name */
    public dp0.c f323649c = dp0.c.f323643d;

    public final dp0.d c(dp0.d next) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(next, "next");
        dp0.d dVar = this.f323647a;
        if (dVar == null) {
            this.f323647a = next;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
            dVar.c(next);
        }
        return this;
    }
}
