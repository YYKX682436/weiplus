package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes7.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f94118d = bizTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ku4.i iVar = ku4.i.f312514a;
        jz5.g gVar = ku4.i.f312517d;
        int i17 = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() == 1 ? 2 : 0;
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI = this.f94118d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(bizTestUI);
        boolean z17 = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() == 1;
        java.lang.String str = "";
        j0Var.setTitle("Pkg Info".concat(z17 ? "(preview)" : ""));
        com.tencent.mm.plugin.appbrand.appcache.n9 a17 = iVar.a("wxfedb0854e2b1820d", i17);
        if (a17 != null) {
            str = "BasePkg:md5=" + a17.field_versionMd5 + "\tversion=" + a17.field_version + '\n';
        }
        com.tencent.mm.plugin.appbrand.appcache.n9 a18 = iVar.a("wxf337cbaa27790d8e", i17);
        if (a18 != null) {
            str = str + "BizPkg:md5=" + a18.field_versionMd5 + " \tversion=" + a18.field_version + '\n';
        }
        com.tencent.mm.plugin.appbrand.appcache.n9 a19 = iVar.a("wx97b7aebac2183fd2", i17);
        if (a19 != null) {
            str = str + "PrefetchBasePkg:md5=" + a19.field_versionMd5 + " \tversion=" + a19.field_version + '\n';
        }
        com.tencent.mm.plugin.appbrand.appcache.n9 a27 = iVar.a("wxa06c02b5c00ff39b", i17);
        if (a27 != null) {
            str = str + "PrefetchBizPkg:md5=" + a27.field_versionMd5 + " \tversion=" + a27.field_version + '\n';
        }
        com.tencent.mm.plugin.appbrand.appcache.n9 a28 = iVar.a("wx4456404b7b80670e", i17);
        if (a28 != null) {
            str = str + "PrefetchBizPkg:md5=" + a28.field_versionMd5 + " \tversion=" + a28.field_version + '\n';
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
