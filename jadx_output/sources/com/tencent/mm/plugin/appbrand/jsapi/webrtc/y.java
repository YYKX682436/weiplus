package com.tencent.mm.plugin.appbrand.jsapi.webrtc;

/* loaded from: classes7.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.webrtc.e0 f83863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.appbrand.jsapi.webrtc.e0 e0Var) {
        super(0);
        this.f83863d = e0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        com.tencent.mm.plugin.appbrand.jsapi.webrtc.e0 e0Var = this.f83863d;
        if (com.tencent.mm.vfs.w6.j((java.lang.String) ((jz5.n) e0Var.f83815r).getValue())) {
            com.tencent.cso.CsoLoader.g((java.lang.String) ((jz5.n) e0Var.f83815r).getValue());
            z17 = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
