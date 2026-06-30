package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes7.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f94123d = bizTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI = this.f94123d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(bizTestUI);
        j0Var.setTitle("Pkg Info");
        ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).getClass();
        java.lang.String str = "";
        for (java.lang.String str2 : he3.e.f280902d) {
            str = str + str2 + " is: " + ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).bj(str2) + "  \t\n";
        }
        j0Var.t(str);
        j0Var.p(3);
        j0Var.C(3);
        j0Var.A(bizTestUI.getString(com.tencent.mm.R.string.f492294fz1), true, null);
        j0Var.show();
        com.tencent.mm.sdk.platformtools.b0.d(bizTestUI.getContext(), null, str, null);
        return jz5.f0.f302826a;
    }
}
