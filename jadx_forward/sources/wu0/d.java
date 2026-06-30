package wu0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f531187a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f531188b;

    /* renamed from: c, reason: collision with root package name */
    public final wu0.c f531189c;

    public d(yz5.l progressBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(progressBlock, "progressBlock");
        this.f531187a = progressBlock;
        this.f531188b = new java.util.concurrent.ConcurrentHashMap();
        this.f531189c = new wu0.c(this, android.os.Looper.getMainLooper());
    }

    public final void a() {
        java.util.Collection<wu0.b> values = this.f531188b.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        float f17 = 0.0f;
        for (wu0.b bVar : values) {
            f17 = f17 + (bVar.f531183a * 0.4f) + (bVar.f531184b * 0.6f);
        }
        float size = f17 / r0.size();
        if (size > 0.999f) {
            size = 0.999f;
        }
        this.f531187a.mo146xb9724478(java.lang.Float.valueOf(size));
    }
}
