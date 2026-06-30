package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f94504d = bizTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("_webview_web_prefetcher_test_info");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        M.d();
        db5.e1.T(this.f94504d, "clear prefetch report kv");
        return jz5.f0.f302826a;
    }
}
