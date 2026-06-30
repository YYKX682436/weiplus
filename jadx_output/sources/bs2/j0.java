package bs2;

/* loaded from: classes2.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f23869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f23870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23871f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, bs2.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f23870e = baseFinderFeed;
        this.f23871f = n1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        bs2.j0 j0Var = new bs2.j0(this.f23870e, this.f23871f, continuation);
        j0Var.f23869d = obj;
        return j0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bs2.j0 j0Var = (bs2.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        bs2.n1 n1Var = this.f23871f;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f23870e;
        if (baseFinderFeed != null) {
            r45.mb4 first = baseFinderFeed.getFeedObject().getMediaList().getFirst();
            ds2.h hVar = ds2.h.f242866a;
            long itemId = baseFinderFeed.getItemId();
            kotlin.jvm.internal.o.d(first);
            mn2.g4 c17 = hVar.c(itemId, first, true);
            com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed.getFeedObject();
            java.lang.String n17 = c17.n();
            bs2.e0 e0Var = bs2.n1.f23905w;
            n1Var.l(feedObject, n17, "unreadCache");
            com.tencent.mars.xlog.Log.i(n1Var.f23909c, "checkPreloadUnreadFeedVideo: preload unread feed, feedid=".concat(pm0.v.u(baseFinderFeed.getItemId())));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(n1Var.f23909c, "checkPreloadUnreadFeedVideo: do not have unread cache feed");
        }
        return f0Var2;
    }
}
