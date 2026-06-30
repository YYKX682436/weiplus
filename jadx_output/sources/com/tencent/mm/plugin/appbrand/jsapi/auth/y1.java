package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes.dex */
public final class y1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 996;
    private static final java.lang.String NAME = "createVestUser";

    /* renamed from: g, reason: collision with root package name */
    public final int f79794g = cf.b.a(this);

    public static final void C(com.tencent.mm.plugin.appbrand.jsapi.auth.y1 y1Var, android.content.Intent intent, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, int i18) {
        if (intent == null) {
            e9Var.a(i17, y1Var.o("fail"));
            return;
        }
        if (i18 == 0) {
            e9Var.a(i17, y1Var.o("fail cancel"));
            return;
        }
        y1Var.getClass();
        int intExtra = intent.getIntExtra(dm.i4.COL_ID, -1);
        java.lang.String stringExtra = intent.getStringExtra("desc");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = intent.getStringExtra("nickname");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        java.lang.String stringExtra3 = intent.getStringExtra("avatarurl");
        java.lang.String str = stringExtra3 != null ? stringExtra3 : "";
        if (!(stringExtra2.length() == 0)) {
            if (!(str.length() == 0)) {
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("headImg", str);
                hashMap2.put("nickname", stringExtra2);
                hashMap2.put(dm.i4.COL_ID, java.lang.Integer.valueOf(intExtra));
                hashMap2.put("desc", stringExtra);
                hashMap.put("userInfo", hashMap2);
                e9Var.a(i17, y1Var.p("ok", hashMap));
                return;
            }
        }
        e9Var.a(i17, y1Var.o("fail"));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null) {
            return;
        }
        if (jSONObject == null) {
            e9Var.a(i17, o("fail:invalid data"));
        }
        kotlin.jvm.internal.o.d(jSONObject);
        if (e9Var.Z0() == null) {
            e9Var.a(i17, o("fail:internal error invalid android context"));
        }
        jSONObject.optInt(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, 0);
        java.lang.String optString = jSONObject.optString("defaultAvatarUrl", "");
        java.lang.String optString2 = jSONObject.optString("defaultAvatarFileId", "");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("editAvatarInfo");
        java.lang.String appId = e9Var.getAppId();
        android.app.Activity Z0 = e9Var.Z0();
        kotlin.jvm.internal.o.f(Z0, "getPageContext(...)");
        kotlin.jvm.internal.o.d(optString);
        kotlin.jvm.internal.o.d(optString2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("0", appId);
        intent.putExtra("extra_call_by_appbrand", true);
        intent.putExtra("default_fileid", optString2);
        if (optJSONObject != null) {
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, e9Var.getContext().getResources().getString(com.tencent.mm.R.string.d4w));
            intent.putExtra("extra_is_edit_page", true);
            intent.putExtra("extra_edit_avatar_id", optJSONObject.optString(dm.i4.COL_ID));
            intent.putExtra("extra_edit_frefill_avatar_name", optJSONObject.optString("nickname"));
            intent.putExtra("extra_edit_frefill_avatar_icon", optJSONObject.optString("avatarUrl"));
        }
        boolean z17 = Z0 instanceof com.tencent.mm.ui.MMActivity;
        int i18 = this.f79794g;
        if (z17) {
            j45.l.w((com.tencent.mm.ui.MMActivity) Z0, ".plugin.webview.ui.tools.CreateAvatarUI", intent, i18, new com.tencent.mm.plugin.appbrand.jsapi.auth.w1(this, e9Var, i17));
        } else if (Z0 instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) {
            nf.g.a(Z0).f(new com.tencent.mm.plugin.appbrand.jsapi.auth.x1(this, e9Var, i17));
            j45.l.v(Z0, ".plugin.webview.ui.tools.CreateAvatarUI", intent, i18);
        }
    }
}
