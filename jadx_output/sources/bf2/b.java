package bf2;

/* loaded from: classes3.dex */
public abstract class b extends bf2.g {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f19594b;

    /* renamed from: c, reason: collision with root package name */
    public fm2.a f19595c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f19596d;

    /* renamed from: e, reason: collision with root package name */
    public in0.q f19597e;

    public b(androidx.appcompat.app.AppCompatActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f19594b = context;
        this.f19596d = jz5.h.b(new bf2.a(this));
    }

    public fm2.a e() {
        return this.f19595c;
    }

    public final androidx.appcompat.app.AppCompatActivity f() {
        return this.f19594b;
    }

    public dk2.xf g() {
        return dk2.ef.f233372a.j(this.f19595c);
    }

    public in0.q h() {
        return this.f19597e;
    }

    public void i(fm2.a baseRouter) {
        kotlin.jvm.internal.o.g(baseRouter, "baseRouter");
        gk2.e buContext = baseRouter.getBuContext();
        kotlin.jvm.internal.o.g(buContext, "<set-?>");
        this.f19609a = buContext;
        this.f19597e = baseRouter.getLiveCore();
        this.f19595c = baseRouter;
    }
}
