package bg2;

/* loaded from: classes2.dex */
public final class s7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f20506d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(bg2.l8 l8Var) {
        super(0);
        this.f20506d = l8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f20506d.f417141d.f417148h;
        return (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? "" : pm0.v.u(feedObject2.getId());
    }
}
