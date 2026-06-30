package zl2;

/* loaded from: classes11.dex */
public final class b implements e51.i {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.ConcurrentLinkedQueue f555195a;

    public final e51.j a(android.content.Context context, e51.f generator, e51.k source, g51.a renderStrategy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(generator, "generator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderStrategy, "renderStrategy");
        if (this.f555195a == null) {
            this.f555195a = new java.util.concurrent.ConcurrentLinkedQueue();
        }
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f555195a;
        e51.j jVar = concurrentLinkedQueue != null ? (e51.j) concurrentLinkedQueue.poll() : null;
        if (jVar != null) {
            jVar.c(generator, source, renderStrategy, com.p314xaae8f345.mm.p997x94b162ad.ViewOnLayoutChangeListenerC11317x5d86a76d.a(context));
            jVar.f331124l = 0.001f;
            jVar.f331125m = 999.99994f;
            jVar.f331128p = 0.0f;
            jVar.f331129q = 0.0f;
            jVar.f(-360.0f, 50.0f);
            jVar.D = 1000L;
            jVar.f331122j = 1;
            jVar.H = this;
            return jVar;
        }
        e51.j jVar2 = new e51.j(context, generator, source, renderStrategy);
        jVar2.f331124l = 0.001f;
        jVar2.f331125m = 999.99994f;
        jVar2.f331128p = 0.0f;
        jVar2.f331129q = 0.0f;
        jVar2.f(-360.0f, 50.0f);
        jVar2.D = 1000L;
        jVar2.f331122j = 1;
        jVar2.H = this;
        return jVar2;
    }
}
