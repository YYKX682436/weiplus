package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes7.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f94176d = bizTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI = this.f94176d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(bizTestUI);
        j0Var.setTitle("Pkg Info");
        j0Var.t(is1.l.f294423a.g());
        j0Var.p(3);
        j0Var.C(3);
        j0Var.A(bizTestUI.getString(com.tencent.mm.R.string.f492294fz1), true, null);
        j0Var.show();
        return jz5.f0.f302826a;
    }
}
