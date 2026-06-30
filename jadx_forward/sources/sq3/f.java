package sq3;

/* loaded from: classes12.dex */
public final class f extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f492894f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f492895g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f492896h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f492897i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f492898m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jm0.o plugin) {
        super(plugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f492895g = "TIME";
        this.f492896h = "Buffer_";
        this.f492897i = "Quota_";
        this.f492898m = "QuotaCost_";
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f492894f = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("PreDownloadCheckMMKV");
    }

    public final long T6(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f492894f;
        if (o4Var == null) {
            return 0L;
        }
        return o4Var.q(this.f492897i + i17, 0L);
    }
}
