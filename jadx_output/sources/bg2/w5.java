package bg2;

/* loaded from: classes2.dex */
public final class w5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f20605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(bg2.q6 q6Var) {
        super(0);
        this.f20605d = q6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        r45.nw1 liveInfo;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f20605d.f417141d.f417148h;
        return (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null || (liveInfo = feedObject2.getLiveInfo()) == null) ? "" : pm0.v.u(liveInfo.getLong(0));
    }
}
