package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f94538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94539e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.sdk.platformtools.o4 o4Var, com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f94538d = o4Var;
        this.f94539e = bizTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f94538d;
        o4Var.A("BizTimeLineAdTestMode", 1);
        o4Var.A("BizTimeLineAdMockType", 1);
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI.T6(this.f94539e);
        return jz5.f0.f302826a;
    }
}
