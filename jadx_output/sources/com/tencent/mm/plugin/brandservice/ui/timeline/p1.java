package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f94177d = bizTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI = this.f94177d;
        boolean z17 = !bizTestUI.e.getBoolean("BizTimeLineKeepPoseEnableForDebug", true);
        com.tencent.mm.sdk.platformtools.o4 o4Var = bizTestUI.e;
        o4Var.G("BizTimeLineKeepPoseEnableForDebug", z17);
        o4Var.getClass();
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI.T6(bizTestUI);
        return jz5.f0.f302826a;
    }
}
