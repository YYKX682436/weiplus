package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f94170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94171e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.sdk.platformtools.o4 o4Var, com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f94170d = o4Var;
        this.f94171e = bizTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f94170d.putBoolean("preload_tmpl_always_check_tmpl_ver", true);
        db5.e1.T(this.f94171e, "enable tmpl always check");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).u(90);
        return jz5.f0.f302826a;
    }
}
