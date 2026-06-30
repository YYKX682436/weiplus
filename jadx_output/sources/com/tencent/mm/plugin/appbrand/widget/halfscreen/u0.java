package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 f91226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f91227e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 x0Var, boolean z17) {
        super(0);
        this.f91226d = x0Var;
        this.f91227e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 x0Var = this.f91226d;
        boolean z17 = this.f91227e;
        x0Var.f91243k = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaHalfScreenGestureControllerImp", "forceForbidDragExpand=%b", java.lang.Boolean.valueOf(z17));
        return jz5.f0.f302826a;
    }
}
