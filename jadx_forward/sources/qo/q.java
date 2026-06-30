package qo;

/* loaded from: classes12.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final qo.q f446854a = new qo.q();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f446855b = jz5.h.a(jz5.i.f384362d, qo.n.f446851d);

    public final java.util.concurrent.Executor a(java.lang.String tag, yz5.a aVar) {
        java.util.concurrent.Executor executor;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        if (((java.lang.Boolean) f446855b.mo141623x754a37bb()).booleanValue()) {
            return new qo.p(tag);
        }
        if (aVar != null && (executor = (java.util.concurrent.Executor) aVar.mo152xb9724478()) != null) {
            return executor;
        }
        java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return newSingleThreadExecutor;
    }
}
