package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f94492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94493e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.sdk.platformtools.o4 o4Var, com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f94492d = o4Var;
        this.f94493e = bizTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f94492d.putBoolean("preload_tmpl_test_noredir", true);
        db5.e1.T(this.f94493e, "disable re-direct");
        return jz5.f0.f302826a;
    }
}
