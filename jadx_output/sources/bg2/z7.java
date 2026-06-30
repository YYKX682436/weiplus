package bg2;

/* loaded from: classes2.dex */
public final class z7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f20713f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f20714g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(java.lang.String str, android.content.Context context, bg2.l8 l8Var, boolean z17) {
        super(0);
        this.f20711d = str;
        this.f20712e = context;
        this.f20713f = l8Var;
        this.f20714g = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.LiveFeedRemoveEvent liveFeedRemoveEvent = new com.tencent.mm.autogen.events.LiveFeedRemoveEvent(new bg2.y7(this.f20711d, this.f20712e));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f20713f.f417141d.f417148h;
        long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
        am.wi wiVar = liveFeedRemoveEvent.f54473g;
        wiVar.f8286a = itemId;
        wiVar.f8287b = this.f20714g;
        liveFeedRemoveEvent.e();
        return jz5.f0.f302826a;
    }
}
