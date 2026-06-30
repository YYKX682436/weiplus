package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f94125d = bizTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList;
        com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
        b0Var.b();
        r45.fm6 a17 = bs1.a.a();
        if (a17 != null && (linkedList = a17.f374454d) != null) {
            b0Var.s(linkedList);
        }
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Success!", 1).show();
        int i17 = com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI.h;
        this.f94125d.W6();
        return jz5.f0.f302826a;
    }
}
