package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class m8 extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveCountDownUI f110298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveCountDownUI finderLiveCountDownUI) {
        super(5);
        this.f110298d = finderLiveCountDownUI;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveCountDownUI finderLiveCountDownUI = this.f110298d;
        if (booleanValue) {
            dk2.ef.f233372a.n(true, 0);
        } else {
            int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveCountDownUI.f109353v;
            finderLiveCountDownUI.getClass();
            dk2.ef efVar = dk2.ef.f233372a;
            efVar.b0(null);
            gk2.e.f272471n = null;
            com.tencent.mars.xlog.Log.i("LivingBuContext", "LivingBuContext set value null ");
            efVar.a0(null);
            efVar.n(false, 2);
        }
        int i18 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveCountDownUI.f109353v;
        finderLiveCountDownUI.getClass();
        com.tencent.mm.autogen.events.FinderGamePostEvent finderGamePostEvent = new com.tencent.mm.autogen.events.FinderGamePostEvent();
        am.hb hbVar = finderGamePostEvent.f54277g;
        hbVar.f6829a = true;
        hbVar.f6830b = true;
        finderGamePostEvent.e();
        finderLiveCountDownUI.finish();
        return jz5.f0.f302826a;
    }
}
