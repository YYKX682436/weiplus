package aw4;

/* loaded from: classes.dex */
public final class z {
    public z(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(aw4.z zVar, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18, int i19, java.lang.String str4) {
        zVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", false);
        intent.putExtra("from_scence", i18);
        intent.putExtra("subtype", i19);
        intent.putExtra("key_h5pay_cookie", str4);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            intent.putExtra("prePublishId", str2);
            intent.putExtra("KPublisherId", str2);
        }
        if (i17 > 0) {
            intent.putExtra("pay_channel", i17);
        }
        intent.putExtra("geta8key_scene", 65);
        intent.putExtra("preChatTYPE", 10);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            intent.putExtra("srcUsername", str3);
        }
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.fts.MMSosWebViewUI", intent, null);
    }

    public final void b(org.json.JSONObject requestObj) {
        kotlin.jvm.internal.o.g(requestObj, "requestObj");
        java.lang.String optString = requestObj.optString("userName", "");
        java.lang.String optString2 = requestObj.optString("nickName", "");
        java.lang.String optString3 = requestObj.optString("headHDImgUrl", "");
        int optInt = requestObj.optInt("verifyFlag", 0);
        java.lang.String optString4 = requestObj.optString("signature", "");
        r45.va0 va0Var = new r45.va0();
        va0Var.f388021d = requestObj.optInt("brandFlag", 0);
        va0Var.f388024g = requestObj.optString("iconUrl", "");
        va0Var.f388023f = requestObj.optString("brandInfo", "");
        va0Var.f388022e = requestObj.optString("externalInfo", "");
        java.lang.String optString5 = requestObj.optString("searchId", "");
        java.lang.String optString6 = requestObj.optString("query", "");
        int optInt2 = requestObj.optInt("position", 0);
        java.lang.String optString7 = requestObj.optString("extraParams", "");
        su4.t2.a(optString);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", optString);
        intent.putExtra("Contact_Nick", optString2);
        intent.putExtra("Contact_BrandIconURL", optString3);
        intent.putExtra("Contact_Signature", optString4);
        intent.putExtra("Contact_VUser_Info_Flag", optInt);
        intent.putExtra("Contact_Scene", 0);
        try {
            intent.putExtra("Contact_customInfo", va0Var.toByteArray());
        } catch (java.io.IOException unused) {
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("Contact_Ext_Args_Search_Id", optString5);
        bundle.putString("Contact_Ext_Args_Query_String", optString6);
        bundle.putInt("Contact_Scene", 0);
        bundle.putInt("Contact_Ext_Args_Index", optInt2);
        bundle.putString("Contact_Ext_Extra_Params", optString7);
        intent.putExtra("preChatTYPE", 10);
        intent.putExtra("Contact_Ext_Args", bundle);
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }
}
