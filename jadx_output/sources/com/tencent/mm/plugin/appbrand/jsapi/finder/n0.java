package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes9.dex */
public class n0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "shareFinderEndorsementToFriend";

    static {
        ot0.r.f348755a.add(new com.tencent.mm.plugin.appbrand.jsapi.finder.l0());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (!(lVar.getContext() instanceof android.app.Activity) || jSONObject == null) {
            lVar.a(i17, "fail");
            return;
        }
        java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        java.lang.String optString2 = jSONObject.optString("desc", "");
        java.lang.String optString3 = jSONObject.optString("relativePath", "");
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        jSONObject.optString("sceneNote", "");
        java.lang.String optString4 = jSONObject.optString("appid", "");
        ot0.q qVar = new ot0.q();
        zy2.z4 z4Var = new zy2.z4();
        z4Var.f477634b = optString;
        z4Var.f477635c = optString2;
        z4Var.f477636d = optString3;
        z4Var.f477638f = optString4;
        z4Var.f477637e = optInt;
        qVar.f348666i = 81;
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        qVar.f348654f = optString;
        qVar.S1 = optString2;
        qVar.f(z4Var);
        java.lang.String u17 = ot0.q.u(qVar, null, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShareFinderEndorsementToFriend", "msgContent %s", u17);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(lVar.getContext(), "com.tencent.mm.ui.transmit.MsgRetransmitUI");
        intent.putExtra("Retr_Msg_Type", 19);
        intent.putExtra("Retr_Msg_content", u17);
        intent.putExtra("Multi_Retr", false);
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        nf.g.a(lVar.getContext()).j(intent, new com.tencent.mm.plugin.appbrand.jsapi.finder.m0(this, lVar, i17));
    }
}
