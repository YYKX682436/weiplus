package od1;

/* loaded from: classes7.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f73044x366c91de = -2;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f73045x24728b = "noticePerformanceMetrics";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        if (yVar == null) {
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1.a()) {
            yVar.a(i17, o("ok"));
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("events") : null;
        if (optJSONArray == null) {
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        try {
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7034xfcb6df36 c7034xfcb6df36 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7034xfcb6df36();
                java.lang.String mo48798x74292566 = yVar.mo48798x74292566();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo48798x74292566);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(mo48798x74292566, true);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                c7034xfcb6df36.f143492d = c7034xfcb6df36.b("InstanceId", b17.f169667d, true);
                java.lang.String mo48798x742925662 = yVar.mo48798x74292566();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo48798x742925662);
                c7034xfcb6df36.f143493e = c7034xfcb6df36.b("Appid", mo48798x742925662, true);
                c7034xfcb6df36.f143494f = optJSONObject.optLong("timeStamp");
                c7034xfcb6df36.f143495g = c7034xfcb6df36.b("EventName", optJSONObject.optString("eventName"), true);
                c7034xfcb6df36.f143496h = optJSONObject.optLong("eventType");
                c7034xfcb6df36.f143497i = c7034xfcb6df36.b("Parent", optJSONObject.optString("parent"), true);
                c7034xfcb6df36.f143498j = optJSONObject.optLong("category");
                c7034xfcb6df36.f143499k = optJSONObject.optLong("option");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1.d(c7034xfcb6df36);
            }
            yVar.a(i17, o("ok"));
        } catch (java.lang.Exception e17) {
            yVar.a(i17, o("fail " + e17));
        }
    }
}
