package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441;

/* loaded from: classes7.dex */
public final class e2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f175656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f175656d = bizTestUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI = this.f175656d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(bizTestUI);
        j0Var.setTitle("Pkg Info");
        ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).getClass();
        java.lang.String str = "";
        for (java.lang.String str2 : he3.e.f362435d) {
            str = str + str2 + " is: " + ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).bj(str2) + "  \t\n";
        }
        j0Var.t(str);
        j0Var.p(3);
        j0Var.C(3);
        j0Var.A(bizTestUI.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1), true, null);
        j0Var.show();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(bizTestUI.mo55332x76847179(), null, str, null);
        return jz5.f0.f384359a;
    }
}
