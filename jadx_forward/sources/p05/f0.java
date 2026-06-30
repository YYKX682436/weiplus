package p05;

/* loaded from: classes.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f432045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f432046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f432047f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(long j17, long j18, yz5.a aVar) {
        super(0);
        this.f432045d = j17;
        this.f432046e = j18;
        this.f432047f = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLive.FallingGiftEffect", "#glThread overDelay=" + ((java.lang.System.currentTimeMillis() - this.f432045d) - this.f432046e));
        this.f432047f.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
