package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class fd extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.kd f110013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(com.tencent.mm.plugin.finder.feed.ui.kd kdVar) {
        super(1);
        this.f110013d = kdVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mars.xlog.Log.i("FinderLiveVisibilityModeConfigPanel", "live charge choose wecoin:" + intValue);
        this.f110013d.h0(intValue);
        return jz5.f0.f302826a;
    }
}
