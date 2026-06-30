package ow5;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f430962a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f430963b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f430964c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f430965d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f430966e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Class f430967f;

    /* renamed from: g, reason: collision with root package name */
    public final p000.m f430968g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f430969h;

    /* renamed from: i, reason: collision with root package name */
    public final double f430970i;

    /* renamed from: j, reason: collision with root package name */
    public final vw5.d f430971j;

    public a(android.content.Context context, java.lang.String bizName, java.lang.String instanceId, ow5.b bVar, java.util.Set mbJsApiSet, java.util.Set mbJSApiGroup, java.util.Set set, java.lang.Class cls, p000.m mVar, boolean z17, double d17, vw5.d dVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        mVar = (i17 & 256) != 0 ? null : mVar;
        z17 = (i17 & 512) != 0 ? false : z17;
        d17 = (i17 & 1024) != 0 ? 0.0d : d17;
        dVar = (i17 & 2048) != 0 ? null : dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mbJsApiSet, "mbJsApiSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mbJSApiGroup, "mbJSApiGroup");
        this.f430962a = context;
        this.f430963b = bizName;
        this.f430964c = mbJsApiSet;
        this.f430965d = mbJSApiGroup;
        this.f430966e = set;
        this.f430967f = cls;
        this.f430968g = mVar;
        this.f430969h = z17;
        this.f430970i = d17;
        this.f430971j = dVar;
    }
}
