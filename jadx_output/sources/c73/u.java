package c73;

@j95.b(dependencies = {com.tencent.mm.ipcinvoker.wx_extension.i0.class})
/* loaded from: classes11.dex */
public final class u extends i95.w implements d73.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f39625d = "PluginHandOff";

    /* renamed from: e, reason: collision with root package name */
    public final l90.j f39626e = c73.s.f39623a;

    /* renamed from: f, reason: collision with root package name */
    public final c01.y8 f39627f = new c73.t(this);

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i(this.f39625d, "onAccountInitialized");
        gm0.j1.b().a(this.f39627f);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i(this.f39625d, "onAccountRelease");
        gm0.j1.b().z(this.f39627f);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i(this.f39625d, "execute");
    }
}
