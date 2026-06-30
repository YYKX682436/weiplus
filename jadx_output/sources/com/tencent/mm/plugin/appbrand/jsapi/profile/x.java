package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes9.dex */
class x implements com.tencent.mm.ipcinvoker.j {
    private x() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("editText", "");
        ot0.q qVar = new ot0.q();
        qVar.f348654f = bundle.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        qVar.f348666i = bundle.getInt("type");
        qVar.f348673j2 = bundle.getString("appbrandUsername");
        qVar.f348677k2 = bundle.getString("appbrandAppId");
        qVar.f348681l2 = bundle.getInt("appbrandType");
        qVar.L1 = bundle.getString("publisherId");
        qVar.f348734z = bundle.getString("thumburl");
        qVar.f348674k = bundle.getString("url");
        qVar.f348722w = bundle.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        qVar.f348726x = bundle.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        ot0.a aVar = new ot0.a();
        aVar.f348359o = bundle.getInt("appbrandTradingGuaranteeFlag");
        aVar.f348360p = bundle.getInt("showRelievedBuyFlag");
        aVar.f348363s = bundle.getInt("showFinancialLicenseFlag");
        aVar.L = bundle.getInt("wxaTradeCommentScore", 0);
        aVar.M = bundle.getString("registerBody");
        aVar.N = bundle.getInt("certificationImageType", 0);
        qVar.f(aVar);
        java.util.Iterator<java.lang.String> it = bundle.getStringArrayList("toUserList").iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareSpecificWeapp", "sendAppMsg, username=" + next);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                am.mt mtVar = sendMsgEvent.f54752g;
                mtVar.f7362a = next;
                mtVar.f7363b = string;
                mtVar.f7364c = c01.e2.C(next);
                mtVar.f7365d = 0;
                sendMsgEvent.e();
            }
            ot0.k1 a17 = ot0.j1.a();
            java.lang.String string2 = bundle.getString("appbrandAppId");
            java.lang.String string3 = bundle.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            ((ez.w0) a17).getClass();
            com.tencent.mm.pluginsdk.model.app.k0.I(qVar, string2, string3, next, null, null);
        }
    }
}
