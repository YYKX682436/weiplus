package qw5;

/* loaded from: classes8.dex */
public final class b extends qw5.a {

    /* renamed from: a, reason: collision with root package name */
    public final ow5.a f448763a;

    /* renamed from: b, reason: collision with root package name */
    public long f448764b;

    /* renamed from: c, reason: collision with root package name */
    public final p000.m f448765c;

    /* renamed from: d, reason: collision with root package name */
    public vw5.b f448766d;

    public b(ow5.a bizConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizConfig, "bizConfig");
        this.f448763a = bizConfig;
        java.lang.String tag = "WeMagic.MagicCardStarterBiz." + bizConfig.f430963b;
        long j17 = this.f448764b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f448765c = new rw5.a(bizConfig, tag, j17);
    }

    @Override // vw5.a
    public long a() {
        return this.f448764b;
    }
}
