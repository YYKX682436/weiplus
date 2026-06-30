package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 f91231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 x0Var) {
        super(1);
        this.f91231d = x0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.appbrand.widget.halfscreen.x0 x0Var = this.f91231d;
        if (!booleanValue) {
            return x0Var.f91233a.H2.t(100L);
        }
        if (x0Var.f91233a.H2.r()) {
            return null;
        }
        hl1.h hVar = x0Var.f91233a.H2.f91199e;
        return hVar.d(hVar.h(), 255, 100L);
    }
}
