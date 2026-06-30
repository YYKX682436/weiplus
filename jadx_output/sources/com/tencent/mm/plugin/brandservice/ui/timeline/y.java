package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes11.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f94543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.sdk.platformtools.o4 o4Var, com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f94543d = o4Var;
        this.f94544e = bizTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f94543d.B("BizLastExposeAdTime", 0L);
        r01.q3.wi().y0();
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI.T6(this.f94544e);
        return jz5.f0.f302826a;
    }
}
