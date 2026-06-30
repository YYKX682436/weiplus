package a03;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent f469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a03.h0 f470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent onFinderFeedInfoUpdatedEvent, a03.h0 h0Var) {
        super(0);
        this.f469d = onFinderFeedInfoUpdatedEvent;
        this.f470e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        h03.q qVar;
        com.tencent.pigeon.mega_video.MegaVideoFinderCallback megaVideoFinderCallback;
        h03.q qVar2;
        com.tencent.pigeon.mega_video.MegaVideoFinderCallback megaVideoFinderCallback2;
        com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent onFinderFeedInfoUpdatedEvent = this.f469d;
        if (pm0.v.Z(onFinderFeedInfoUpdatedEvent.f54571g.f7718a) != 0) {
            a03.h0 h0Var = this.f470e;
            pi0.l1 l1Var = h0Var.f426n;
            am.qm qmVar = onFinderFeedInfoUpdatedEvent.f54571g;
            if (l1Var != null && (qVar2 = (h03.q) l1Var.j(h03.q.class)) != null && (megaVideoFinderCallback2 = qVar2.f277913g) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoUniversalService", "InteractionUtil home feedUpdateListener event id:" + qmVar.f7718a + ", " + qmVar.f7721d + ", " + qmVar.f7719b);
                java.lang.String localFeedId = qmVar.f7718a;
                kotlin.jvm.internal.o.f(localFeedId, "localFeedId");
                megaVideoFinderCallback2.onThumbFavStatusChanged(localFeedId, qmVar.f7721d, a03.v.f465d);
                java.lang.String localFeedId2 = qmVar.f7718a;
                kotlin.jvm.internal.o.f(localFeedId2, "localFeedId");
                megaVideoFinderCallback2.onHeartLikeStatusChanged(localFeedId2, qmVar.f7719b, a03.w.f466d);
            }
            pi0.l1 l1Var2 = h0Var.f427o;
            if (l1Var2 != null && (qVar = (h03.q) l1Var2.j(h03.q.class)) != null && (megaVideoFinderCallback = qVar.f277913g) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoUniversalService", "InteractionUtil player feedUpdateListener event id:" + qmVar.f7718a + ", " + qmVar.f7721d + ", " + qmVar.f7719b);
                java.lang.String localFeedId3 = qmVar.f7718a;
                kotlin.jvm.internal.o.f(localFeedId3, "localFeedId");
                megaVideoFinderCallback.onThumbFavStatusChanged(localFeedId3, qmVar.f7721d, a03.x.f467d);
                java.lang.String localFeedId4 = qmVar.f7718a;
                kotlin.jvm.internal.o.f(localFeedId4, "localFeedId");
                megaVideoFinderCallback.onHeartLikeStatusChanged(localFeedId4, qmVar.f7719b, a03.y.f468d);
            }
        }
        return jz5.f0.f302826a;
    }
}
