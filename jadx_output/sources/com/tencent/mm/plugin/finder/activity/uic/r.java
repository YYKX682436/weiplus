package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC f101942d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC) {
        super(0);
        this.f101942d = finderActivityParticipateUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC = this.f101942d;
        int i17 = finderActivityParticipateUIC.f101821r;
        if (i17 > 0) {
            int i18 = i17 - 1;
            finderActivityParticipateUIC.f101821r = i18;
            finderActivityParticipateUIC.c7(i18);
            com.tencent.mars.xlog.Log.i("FinderActivityParticipateUIC", "activityParticipateCount minus: " + finderActivityParticipateUIC.f101821r);
        }
        return jz5.f0.f302826a;
    }
}
