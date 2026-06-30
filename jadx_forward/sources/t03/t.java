package t03;

/* loaded from: classes11.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f496044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f496045e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j17, t03.k0 k0Var) {
        super(0);
        this.f496044d = j17;
        this.f496045e = k0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("event", "onShowBuffering");
        hashMap.put("playerId", java.lang.Long.valueOf(this.f496044d));
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = ((v03.b) this.f496045e.f495996e).f513836h;
        if (eventSink != null) {
            eventSink.mo138418x90b54003(hashMap);
        }
        return jz5.f0.f384359a;
    }
}
