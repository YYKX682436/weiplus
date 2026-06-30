package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441;

/* loaded from: classes7.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f175651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f175651d = bizTestUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ku4.i iVar = ku4.i.f394047a;
        jz5.g gVar = ku4.i.f394050d;
        int i17 = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() == 1 ? 2 : 0;
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI = this.f175651d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(bizTestUI);
        boolean z17 = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() == 1;
        java.lang.String str = "";
        j0Var.setTitle("Pkg Info".concat(z17 ? "(preview)" : ""));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 a17 = iVar.a("wxfedb0854e2b1820d", i17);
        if (a17 != null) {
            str = "BasePkg:md5=" + a17.f67186x912ff5eb + "\tversion=" + a17.f67185x8987ca93 + '\n';
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 a18 = iVar.a("wxf337cbaa27790d8e", i17);
        if (a18 != null) {
            str = str + "BizPkg:md5=" + a18.f67186x912ff5eb + " \tversion=" + a18.f67185x8987ca93 + '\n';
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 a19 = iVar.a("wx97b7aebac2183fd2", i17);
        if (a19 != null) {
            str = str + "PrefetchBasePkg:md5=" + a19.f67186x912ff5eb + " \tversion=" + a19.f67185x8987ca93 + '\n';
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 a27 = iVar.a("wxa06c02b5c00ff39b", i17);
        if (a27 != null) {
            str = str + "PrefetchBizPkg:md5=" + a27.f67186x912ff5eb + " \tversion=" + a27.f67185x8987ca93 + '\n';
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 a28 = iVar.a("wx4456404b7b80670e", i17);
        if (a28 != null) {
            str = str + "PrefetchBizPkg:md5=" + a28.f67186x912ff5eb + " \tversion=" + a28.f67185x8987ca93 + '\n';
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
