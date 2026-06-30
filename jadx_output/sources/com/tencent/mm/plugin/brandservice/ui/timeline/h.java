package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes8.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f94135d = bizTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
        boolean z17 = !b0Var.h().i("showLiveBarWhenExpose", false);
        b0Var.h().G("showLiveBarWhenExpose", z17);
        b0Var.b();
        int i17 = com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI.h;
        this.f94135d.W6();
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Success! ShowLiveBarAfterExpose=" + z17 + '.', 1).show();
        return jz5.f0.f302826a;
    }
}
