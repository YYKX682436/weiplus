package a6;

/* loaded from: classes14.dex */
public final class c0 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public p135x2eae8f.p136xbfc2bd01.C1417xbe84059e f83177d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.util.UUID f83178e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f83179f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f83180g = true;

    /* renamed from: h, reason: collision with root package name */
    public final x.n f83181h = new x.n();

    public final java.util.UUID a(p3325xe03a0797.p3326xc267989b.r2 job) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(job, "job");
        java.util.UUID uuid = this.f83178e;
        if (uuid == null || !this.f83179f || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            uuid = java.util.UUID.randomUUID();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "randomUUID()");
        }
        this.f83178e = uuid;
        return uuid;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        if (this.f83180g) {
            this.f83180g = false;
            return;
        }
        p135x2eae8f.p136xbfc2bd01.C1417xbe84059e c1417xbe84059e = this.f83177d;
        if (c1417xbe84059e == null) {
            return;
        }
        this.f83179f = true;
        ((r5.p) c1417xbe84059e.f125440d).b(c1417xbe84059e.f125441e);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        this.f83180g = false;
        p135x2eae8f.p136xbfc2bd01.C1417xbe84059e c1417xbe84059e = this.f83177d;
        if (c1417xbe84059e == null) {
            return;
        }
        c1417xbe84059e.b();
    }
}
