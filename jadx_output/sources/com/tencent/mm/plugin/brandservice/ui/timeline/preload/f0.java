package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0 f94231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0 i0Var) {
        super(0);
        this.f94231d = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = (java.lang.String) ((jz5.n) this.f94231d.f94276e).getValue();
        kotlin.jvm.internal.o.g(str, "<this>");
        com.tencent.mm.vfs.r6 c17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.c(com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94439e, str);
        return java.lang.Integer.valueOf(c17 != null ? (int) c17.C() : 0);
    }
}
