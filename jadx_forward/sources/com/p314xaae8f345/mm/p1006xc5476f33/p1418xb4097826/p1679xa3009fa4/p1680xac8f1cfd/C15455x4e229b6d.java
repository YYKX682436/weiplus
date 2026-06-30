package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedSafeCheckNewUIC$registNotifyEventListner$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/BypCommonBizFinderCheckPreFetchNotifyEvent;", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedSafeCheckNewUIC$registNotifyEventListner$1 */
/* loaded from: classes2.dex */
public final class C15455x4e229b6d extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5212x2c470ec7> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ye f215099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15455x4e229b6d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ye yeVar, com.p314xaae8f345.mm.app.a0 a0Var) {
        super(a0Var);
        this.f215099d = yeVar;
        this.f39173x3fe91575 = -1620974377;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5212x2c470ec7 c5212x2c470ec7) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5212x2c470ec7 event = c5212x2c470ec7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedSafeCheckUIC", "on BypCommonBizFinderCheckPreFetchNotifyEvent");
        this.f215099d.T6(true);
        return true;
    }
}
