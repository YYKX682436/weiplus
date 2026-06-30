package com.tencent.mm.plugin.finder;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/finder/FinderCommonLiveService$getAnchorLastLive$1$2$eventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedUpdateEvent;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderCommonLiveService$getAnchorLastLive$1$2$eventListener$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f101692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderCommonLiveService$getAnchorLastLive$1$2$eventListener$1(androidx.lifecycle.y yVar, com.tencent.mm.protocal.protobuf.FinderObject finderObject, zy2.f5 f5Var) {
        super(yVar);
        this.f101692d = finderObject;
        this.__eventId = 439877283;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
        com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.ia iaVar = event.f54252g;
        if (iaVar != null && iaVar.f6919b == 8) {
            r45.nw1 liveInfo = this.f101692d.getLiveInfo();
            if (liveInfo != null && iaVar.f6918a == liveInfo.getLong(0)) {
                if (iaVar != null && iaVar.f6925h == 2) {
                    throw null;
                }
            }
        }
        return false;
    }
}
