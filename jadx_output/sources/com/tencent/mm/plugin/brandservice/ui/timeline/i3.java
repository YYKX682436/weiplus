package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes8.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f94144d = bizTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI = this.f94144d;
        androidx.appcompat.app.AppCompatActivity context = bizTestUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var = new com.tencent.mm.plugin.webview.ui.tools.widget.m1(context, bizTestUI.g, null, new com.tencent.mm.plugin.webview.ui.tools.widget.n1(0.0f, 0.0f, null, false, false, -1, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 0, false, false, false, 8388063, null), 4, null);
        bizTestUI.f = m1Var;
        m1Var.show();
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI.U6(bizTestUI);
        pm0.v.V(2000L, new com.tencent.mm.plugin.brandservice.ui.timeline.h3(bizTestUI));
        return jz5.f0.f302826a;
    }
}
