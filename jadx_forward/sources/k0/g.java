package k0;

/* loaded from: classes14.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f384440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f384441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l2.e f384442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f384443g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j17, boolean z17, l2.e eVar, boolean z18) {
        super(1);
        this.f384440d = j17;
        this.f384441e = z17;
        this.f384442f = eVar;
        this.f384443g = z18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        b1.c drawWithCache = (b1.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawWithCache, "$this$drawWithCache");
        e1.g0 d17 = k0.i.d(drawWithCache, d1.k.d(drawWithCache.a()) / 2.0f);
        int i17 = android.os.Build.VERSION.SDK_INT;
        long j17 = this.f384440d;
        return drawWithCache.b(new k0.f(this.f384441e, this.f384442f, this.f384443g, d17, new e1.z(i17 >= 29 ? e1.n.f327814a.a(j17, 5) : new android.graphics.PorterDuffColorFilter(e1.a0.h(j17), e1.a.b(5)))));
    }
}
