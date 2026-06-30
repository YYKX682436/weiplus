package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class k extends com.tencent.mm.plugin.appbrand.jsapi.share.l {
    public static final int CTRL_INDEX = 73;
    public static final java.lang.String NAME = "shareAppMessage";

    public static void N(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18, int i19) {
        com.tencent.mm.plugin.appbrand.report.v0.e(str, str2, i17, str3, com.tencent.mm.sdk.platformtools.t8.i1(), i18, i19);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.l
    public com.tencent.mm.plugin.appbrand.jsapi.share.u C() {
        return new com.tencent.mm.plugin.appbrand.jsapi.share.u();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.l
    public com.tencent.mm.plugin.appbrand.jsapi.share.u F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.share.u F = super.F(c0Var, jSONObject);
        c01.l2 l2Var = F.f83256b.H1(3).f85996d;
        if (!l2Var.g("user_clicked_share_btn")) {
            throw new com.tencent.mm.plugin.appbrand.jsapi.share.t("not allow to share");
        }
        l2Var.j("user_clicked_share_btn", false);
        return F;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.l
    public void I(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar) {
        N(uVar.f83276v, uVar.f83262h, uVar.f83258d ? 16 : 2, "", 2, -1);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.l
    public void J(com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, int i17) {
        N(uVar.f83276v, uVar.f83262h, uVar.f83258d ? 16 : 2, "", 3, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.l
    public void K(boolean z17, com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, java.lang.String str) {
        if (z17) {
            N(uVar.f83276v, uVar.f83262h, str.toLowerCase().endsWith("@chatroom") ? 15 : 16, str + ":", 1, -1);
        } else {
            N(uVar.f83276v, uVar.f83262h, str.toLowerCase().endsWith("@chatroom") ? 9 : 2, "", 1, -1);
        }
        uVar.f83271q.c(uVar, z17);
    }
}
