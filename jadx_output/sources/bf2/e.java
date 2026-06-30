package bf2;

/* loaded from: classes3.dex */
public abstract class e extends bf2.g {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f19600b;

    /* renamed from: c, reason: collision with root package name */
    public fm2.b f19601c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f19602d;

    /* renamed from: e, reason: collision with root package name */
    public tn0.w0 f19603e;

    /* renamed from: f, reason: collision with root package name */
    public km2.m f19604f;

    public e(androidx.appcompat.app.AppCompatActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f19600b = context;
        this.f19602d = jz5.h.b(new bf2.d(this));
    }

    public void e(fm2.b baseRouter) {
        kotlin.jvm.internal.o.g(baseRouter, "baseRouter");
        gk2.e buContext = baseRouter.getBuContext();
        kotlin.jvm.internal.o.g(buContext, "<set-?>");
        this.f19609a = buContext;
        this.f19603e = baseRouter.getLiveCore();
        this.f19601c = baseRouter;
        this.f19604f = baseRouter.getData();
    }
}
