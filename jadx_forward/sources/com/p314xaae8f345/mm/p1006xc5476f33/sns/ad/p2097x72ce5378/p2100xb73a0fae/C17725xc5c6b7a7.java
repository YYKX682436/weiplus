package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2097x72ce5378.p2100xb73a0fae;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/improve/helper/AdAddStateListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsAdCommonEvent;", "Lu44/b;", "handler", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(Lu44/b;Landroidx/lifecycle/y;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener */
/* loaded from: classes4.dex */
public class C17725xc5c6b7a7 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6031xb51fe4d4> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f244260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17725xc5c6b7a7(u44.b handler, p012xc85e97e9.p093xedfae76a.y lifecycleOwner) {
        super(lifecycleOwner);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        this.f244260d = new java.lang.ref.WeakReference(handler);
        this.f39173x3fe91575 = -1093521692;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6031xb51fe4d4 c6031xb51fe4d4) {
        r44.f c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6031xb51fe4d4 event = c6031xb51fe4d4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        u44.b bVar = (u44.b) this.f244260d.get();
        boolean z17 = false;
        if (bVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463 c17814xa1ba4463 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.p2151xf8ffc37b.C17814xa1ba4463) bVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsId", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = c17814xa1ba4463.f245401r;
            long j17 = c17933xe8d1b226 != null ? c17933xe8d1b226.f68891x29d1292e : -1L;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
            am.wu wuVar = event.f136321g;
            if (j17 != wuVar.f89857a) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
            } else {
                int i17 = wuVar.f89858b;
                if (i17 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdAdded", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonShakeLogic", "onAdAdded, hash=" + c17814xa1ba4463.hashCode());
                    c17814xa1ba4463.f245396m = true;
                    c17814xa1ba4463.f245397n = false;
                    c17814xa1ba4463.f245403t = false;
                    c17814xa1ba4463.f245404u = false;
                    c17814xa1ba4463.f245405v = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdAdded", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
                } else if (i17 != 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommonShakeLogic", "onAdRemoved, hash=" + c17814xa1ba4463.hashCode());
                    if (c17814xa1ba4463.f245393g == 0 && (c17 = c17814xa1ba4463.c()) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShakableAdRemoved", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17.f451099h, c17814xa1ba4463)) {
                            c17.f451099h = null;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShakableAdRemoved", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
                    }
                    c17814xa1ba4463.f245397n = true;
                    c17814xa1ba4463.b();
                    c17814xa1ba4463.a();
                    c17814xa1ba4463.f245403t = false;
                    c17814xa1ba4463.f245404u = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdRemoved", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
                }
                z17 = true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ad.improve.helper.AdAddStateListener");
        return z17;
    }
}
