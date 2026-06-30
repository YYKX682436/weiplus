package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes7.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f94097d = bizTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bx.r rVar = (bx.r) i95.n0.c(bx.r.class);
        com.tencent.mm.plugin.brandservice.ui.timeline.z zVar = new com.tencent.mm.plugin.brandservice.ui.timeline.z(this.f94097d);
        cx.f0 f0Var = (cx.f0) rVar;
        synchronized (f0Var) {
            f0Var.Di(0);
            cx.w0 w0Var = f0Var.f224422e;
            if (w0Var != null) {
                w0Var.J1("__wxLib__.adTestAction(null,{args:{testAction:'setTestInfo'}})", zVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
