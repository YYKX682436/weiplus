package kh;

/* loaded from: classes10.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.m2 f389386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f389388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f389389g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(kh.m2 m2Var, java.lang.String str, int i17, long j17) {
        super(0);
        this.f389386d = m2Var;
        this.f389387e = str;
        this.f389388f = i17;
        this.f389389g = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return "#tracking " + this.f389386d.f389396a + ": " + this.f389387e + '@' + this.f389388f + ", costMs=" + (android.os.SystemClock.currentThreadTimeMillis() - this.f389389g);
    }
}
