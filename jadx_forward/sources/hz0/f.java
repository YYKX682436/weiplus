package hz0;

/* loaded from: classes.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f367790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f367791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, int i17) {
        super(0);
        this.f367790d = j17;
        this.f367791e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String format = java.lang.String.format("%.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(((float) this.f367790d) / 1000.0f)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, r26.b0.b("\n                template video make done!\n                totalCost = [" + format + "s]\n                workType = [" + this.f367791e + "]\n                "), 1).show();
        return jz5.f0.f384359a;
    }
}
