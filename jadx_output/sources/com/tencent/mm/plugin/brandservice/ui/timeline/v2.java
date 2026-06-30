package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes11.dex */
public final class v2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.v2 f94521d = new com.tencent.mm.plugin.brandservice.ui.timeline.v2();

    public v2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.BizRecommandMockCardEvent bizRecommandMockCardEvent = new com.tencent.mm.autogen.events.BizRecommandMockCardEvent();
        java.lang.String str = "ecs_tl_mock_rec_card_" + java.lang.System.currentTimeMillis();
        am.z0 z0Var = bizRecommandMockCardEvent.f54009g;
        z0Var.f8498a = str;
        z0Var.f8499b = "{}";
        bizRecommandMockCardEvent.e();
        return jz5.f0.f302826a;
    }
}
