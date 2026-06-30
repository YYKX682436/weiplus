package p05;

/* loaded from: classes.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f432228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f432229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f432230f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(long j17, long j18, yz5.a aVar) {
        super(0);
        this.f432228d = j17;
        this.f432229e = j18;
        this.f432230f = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", "#glThread overDelay=" + ((java.lang.System.currentTimeMillis() - this.f432228d) - this.f432229e));
        this.f432230f.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
