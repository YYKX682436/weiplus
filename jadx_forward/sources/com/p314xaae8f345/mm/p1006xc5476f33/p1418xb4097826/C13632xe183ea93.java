package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/finder/FinderCommonLiveService$getAnchorLastLive$1$2$eventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedUpdateEvent;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.FinderCommonLiveService$getAnchorLastLive$1$2$eventListener$1 */
/* loaded from: classes2.dex */
public final class C13632xe183ea93 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f183225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13632xe183ea93(p012xc85e97e9.p093xedfae76a.y yVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, zy2.f5 f5Var) {
        super(yVar);
        this.f183225d = c19792x256d2725;
        this.f39173x3fe91575 = 439877283;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 event = c5445x963cab3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.ia iaVar = event.f135785g;
        if (iaVar != null && iaVar.f88452b == 8) {
            r45.nw1 m76794xd0557130 = this.f183225d.m76794xd0557130();
            if (m76794xd0557130 != null && iaVar.f88451a == m76794xd0557130.m75942xfb822ef2(0)) {
                if (iaVar != null && iaVar.f88458h == 2) {
                    throw null;
                }
            }
        }
        return false;
    }
}
