package lu4;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f402962a;

    /* renamed from: b, reason: collision with root package name */
    public final lu4.b f402963b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f402964c;

    public a(java.lang.String name, lu4.b context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f402962a = name;
        this.f402963b = context;
        this.f402964c = "MicroMsg.JSAPI." + getClass().getSimpleName() + ':' + context.getClass().getSimpleName();
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t jsRuntime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsRuntime, "jsRuntime");
        jsRuntime.mo14658x74041feb(this, this.f402962a);
    }
}
