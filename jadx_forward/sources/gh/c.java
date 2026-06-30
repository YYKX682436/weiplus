package gh;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: h, reason: collision with root package name */
    public static final gh.a f353333h = new gh.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 f353334d;

    /* renamed from: e, reason: collision with root package name */
    public final ch.g f353335e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f353336f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f353337g;

    public c(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 runtime, ch.g jsThreadHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsThreadHandler, "jsThreadHandler");
        this.f353334d = runtime;
        this.f353335e = jsThreadHandler;
        this.f353336f = new java.lang.Object();
    }

    public final void a() {
        ah.i.b("AnimationFrameHandler", "AnimationFrameHandler[%s] destroy", b().name());
        synchronized (this.f353336f) {
            if (this.f353337g) {
                ah.i.b("AnimationFrameHandler", "AnimationFrameHandler[%s] pause automatically", b().name());
                h();
            }
            e();
        }
    }

    public abstract gh.b b();

    public final void c(double d17) {
        com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f353334d;
        if (abstractC4208x204d5c83.f130110a == 0) {
            return;
        }
        abstractC4208x204d5c83.m34774x282632a9(abstractC4208x204d5c83.f130110a, d17);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public final void h() {
        ah.i.b("AnimationFrameHandler", "AnimationFrameHandler[%s] pause", b().name());
        synchronized (this.f353336f) {
            if (this.f353337g) {
                f();
                this.f353337g = false;
            }
        }
    }

    public final void i() {
        ah.i.b("AnimationFrameHandler", "AnimationFrameHandler[%s] resume", b().name());
        synchronized (this.f353336f) {
            if (this.f353337g) {
                return;
            }
            g();
            this.f353337g = true;
        }
    }
}
