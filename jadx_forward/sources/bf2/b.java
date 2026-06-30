package bf2;

/* loaded from: classes3.dex */
public abstract class b extends bf2.g {

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f101127b;

    /* renamed from: c, reason: collision with root package name */
    public fm2.a f101128c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f101129d;

    /* renamed from: e, reason: collision with root package name */
    public in0.q f101130e;

    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f101127b = context;
        this.f101129d = jz5.h.b(new bf2.a(this));
    }

    public fm2.a e() {
        return this.f101128c;
    }

    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f() {
        return this.f101127b;
    }

    public dk2.xf g() {
        return dk2.ef.f314905a.j(this.f101128c);
    }

    public in0.q h() {
        return this.f101130e;
    }

    public void i(fm2.a baseRouter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseRouter, "baseRouter");
        gk2.e m57654xd7793f26 = baseRouter.m57654xd7793f26();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m57654xd7793f26, "<set-?>");
        this.f101142a = m57654xd7793f26;
        this.f101130e = baseRouter.m129720xd052bc21();
        this.f101128c = baseRouter;
    }
}
