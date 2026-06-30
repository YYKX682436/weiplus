package j0;

/* loaded from: classes14.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f377801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j17) {
        super(1);
        this.f377801d = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        b1.c drawWithCache = (b1.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawWithCache, "$this$drawWithCache");
        float d17 = d1.k.d(drawWithCache.a()) / 2.0f;
        e1.g0 d18 = k0.i.d(drawWithCache, d17);
        int i17 = android.os.Build.VERSION.SDK_INT;
        long j17 = this.f377801d;
        return drawWithCache.b(new j0.d(d17, d18, new e1.z(i17 >= 29 ? e1.n.f327814a.a(j17, 5) : new android.graphics.PorterDuffColorFilter(e1.a0.h(j17), e1.a.b(5)))));
    }
}
