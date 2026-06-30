package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441;

/* loaded from: classes7.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f175630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f175630d = bizTestUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bx.r rVar = (bx.r) i95.n0.c(bx.r.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.z zVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.z(this.f175630d);
        cx.f0 f0Var = (cx.f0) rVar;
        synchronized (f0Var) {
            f0Var.Di(0);
            cx.w0 w0Var = f0Var.f305955e;
            if (w0Var != null) {
                w0Var.J1("__wxLib__.adTestAction(null,{args:{testAction:'setTestInfo'}})", zVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
