package c61;

/* loaded from: classes2.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final c61.n2 f39180d = new c61.n2();

    public n2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.p51 resp = (r45.p51) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
        java.util.LinkedList<r45.le0> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getDiagnosis_items(...)");
        for (r45.le0 le0Var : list) {
            com.tencent.mars.xlog.Log.i("FinderFeedLiveNoticeCache", "text: " + le0Var.getString(1) + ", objectId: " + le0Var.getLong(0) + ", textIndex: " + le0Var.getInteger(2));
            com.tencent.mm.plugin.finder.feed.model.i1.f107934e.put(java.lang.Long.valueOf(le0Var.getLong(0)), le0Var);
            com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
            am.ia iaVar = feedUpdateEvent.f54252g;
            iaVar.f6919b = 32;
            iaVar.f6918a = le0Var.getLong(0);
            feedUpdateEvent.e();
        }
        return jz5.f0.f302826a;
    }
}
