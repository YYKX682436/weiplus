package bg2;

/* loaded from: classes2.dex */
public final class f6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f20088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20089e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f20090f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f20091g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(java.lang.String str, android.content.Context context, bg2.q6 q6Var, boolean z17) {
        super(0);
        this.f20088d = str;
        this.f20089e = context;
        this.f20090f = q6Var;
        this.f20091g = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.LiveFeedRemoveEvent liveFeedRemoveEvent = new com.tencent.mm.autogen.events.LiveFeedRemoveEvent(new bg2.e6(this.f20088d, this.f20089e));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f20090f.f417141d.f417148h;
        long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
        am.wi wiVar = liveFeedRemoveEvent.f54473g;
        wiVar.f8286a = itemId;
        wiVar.f8287b = this.f20091g;
        liveFeedRemoveEvent.e();
        return jz5.f0.f302826a;
    }
}
