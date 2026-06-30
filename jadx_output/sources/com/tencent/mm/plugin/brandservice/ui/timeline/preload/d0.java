package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0 f94208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0 i0Var) {
        super(0);
        this.f94208d = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
        java.lang.String url = this.f94208d.f94272c;
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.String l17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.l(url);
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94438d.d(l17);
        return java.lang.Long.valueOf(o4Var != null ? o4Var.getLong(l17, 0L) : 0L);
    }
}
