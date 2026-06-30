package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class n8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveCountDownUI f110331d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveCountDownUI finderLiveCountDownUI) {
        super(1);
        this.f110331d = finderLiveCountDownUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveCountDownUI finderLiveCountDownUI = this.f110331d;
        if (booleanValue) {
            dk2.ef.f233372a.m(new com.tencent.mm.plugin.finder.feed.ui.m8(finderLiveCountDownUI));
        } else {
            dk2.ef efVar = dk2.ef.f233372a;
            dk2.xf xfVar = dk2.ef.A;
            if (xfVar != null) {
                dk2.xf.f(xfVar, 0, dk2.kd.f233702d, 1, null);
            }
            int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveCountDownUI.f109353v;
            finderLiveCountDownUI.getClass();
            efVar.b0(null);
            gk2.e.f272471n = null;
            com.tencent.mars.xlog.Log.i("LivingBuContext", "LivingBuContext set value null ");
            efVar.a0(null);
            efVar.n(false, 1);
            com.tencent.mm.autogen.events.FinderGamePostEvent finderGamePostEvent = new com.tencent.mm.autogen.events.FinderGamePostEvent();
            am.hb hbVar = finderGamePostEvent.f54277g;
            hbVar.f6829a = true;
            hbVar.f6830b = true;
            finderGamePostEvent.e();
            finderLiveCountDownUI.finish();
        }
        return jz5.f0.f302826a;
    }
}
