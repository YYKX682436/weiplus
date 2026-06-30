package ty2;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f504591a;

    /* renamed from: b, reason: collision with root package name */
    public final ty2.q f504592b;

    /* renamed from: c, reason: collision with root package name */
    public ty2.z f504593c;

    public b(android.content.Context context, ty2.q viewType, ty2.z config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewType, "viewType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f504591a = context;
        this.f504592b = viewType;
        this.f504593c = config;
    }

    public final java.lang.String a() {
        return getClass().toString() + this.f504592b.f504645d;
    }

    public abstract android.view.View b(bw5.q5 q5Var);
}
