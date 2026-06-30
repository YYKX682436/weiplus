package n50;

/* loaded from: classes9.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Intent f416636a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f416637b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f416638c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f416639d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f416640e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f416641f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f416642g;

    public i(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        this.f416636a = intent;
        this.f416637b = jz5.h.b(new n50.g(this));
        this.f416638c = jz5.h.b(new n50.c(this));
        this.f416639d = jz5.h.b(new n50.d(this));
        this.f416640e = jz5.h.b(new n50.e(this));
        jz5.h.b(new n50.b(this));
        this.f416641f = jz5.h.b(new n50.f(this));
        this.f416642g = jz5.h.b(new n50.h(this));
        jz5.h.b(new n50.a(this));
    }

    public final void a(co.a model) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        long b17 = b();
        int i17 = model.f125235d;
        model.set(i17 + 0, java.lang.Long.valueOf(b17));
        model.set(i17 + 2, java.lang.Long.valueOf(((java.lang.Number) ((jz5.n) this.f416639d).mo141623x754a37bb()).longValue()));
        java.lang.String str = (java.lang.String) ((jz5.n) this.f416640e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "<get-forwardMsgTalker>(...)");
        model.set(i17 + 1, str);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17 = c();
        model.set(i17 + 3, java.lang.Integer.valueOf(c17 != null ? c17.mo78013xfb85f7b0() : 0));
        java.lang.String str2 = (java.lang.String) ((jz5.n) this.f416641f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "<get-forwardSnsId>(...)");
        model.set(i17 + 4, str2);
    }

    public final long b() {
        return ((java.lang.Number) ((jz5.n) this.f416638c).mo141623x754a37bb()).longValue();
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 c() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 e17 = e();
        if (e17 != null) {
            if (e17.m124847x74d37ac6() > 0) {
                return e17;
            }
        }
        return null;
    }

    public final java.lang.String d() {
        return (java.lang.String) ((jz5.n) this.f416637b).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 e() {
        return (com.p314xaae8f345.mm.p2621x8fb0427b.f9) ((jz5.n) this.f416642g).mo141623x754a37bb();
    }
}
