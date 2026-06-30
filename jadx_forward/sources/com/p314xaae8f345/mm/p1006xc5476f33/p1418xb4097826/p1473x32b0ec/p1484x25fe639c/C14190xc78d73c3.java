package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/finder/live/controller/LiveAnchorShopMsgDataController$initReceiveMsgListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderLiveShopMsgEvent;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.controller.LiveAnchorShopMsgDataController$initReceiveMsgListener$1 */
/* loaded from: classes3.dex */
public final class C14190xc78d73c3 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5491xce09ac21> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.bd f193100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14190xc78d73c3(df2.bd bdVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar) {
        super((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar);
        this.f193100d = bdVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(ubVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        this.f39173x3fe91575 = 633350705;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5491xce09ac21 c5491xce09ac21) {
        java.util.ArrayList<so0.c> arrayList;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5491xce09ac21 event = c5491xce09ac21;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        zl2.r4 r4Var = zl2.r4.f555483a;
        df2.bd bdVar = this.f193100d;
        if (!r4Var.y1(bdVar.getStore().getLiveRoomData())) {
            return false;
        }
        java.util.List list = event.f135824g.f89719a;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                so0.c cVar = (so0.c) obj;
                java.lang.Long l17 = cVar.f491741e;
                if (l17 != null && l17.longValue() == ((mm2.e1) bdVar.m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.f491739c, ((mm2.c1) bdVar.m56788xbba4bfc0(mm2.c1.class)).f410385o)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("receive msg size = ");
        sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bdVar.f311329m, sb6.toString());
        if (!(arrayList == null || arrayList.isEmpty())) {
            if (arrayList != null) {
                for (so0.c cVar2 : arrayList) {
                    qo2.e Zj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Zj();
                    java.lang.String clientMsgId = cVar2.f491747k;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(clientMsgId, "clientMsgId");
                    Zj.f(clientMsgId);
                }
            }
            r45.t12 t12Var = new r45.t12();
            t12Var.set(3, java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.f55299x87635d9e));
            t12Var.set(15, java.lang.Boolean.TRUE);
            t12Var.set(16, 1000);
            ((mm2.x4) bdVar.m56788xbba4bfc0(mm2.x4.class)).f411067o.add(new dk2.mf(t12Var));
        }
        return true;
    }
}
