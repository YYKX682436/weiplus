package tc1;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m0 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m0
    public boolean a(android.app.Activity activity, org.json.JSONObject jSONObject, int i17) {
        java.lang.String mo48798x74292566 = this.f163888a.mo48798x74292566();
        java.lang.String optString = jSONObject.optString("redPacketId", null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo48798x74292566) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenRedPacket", "GetLuckMoneyRequest.launch appId = [%s] sendId = [%s]", mo48798x74292566, optString);
            return false;
        }
        ((kb3.j) ((kb3.i) i95.n0.c(kb3.i.class))).getClass();
        android.content.Intent putExtra = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1821x45c4fe06.ui.p1824x408272e3.ActivityC16327xba05db3f.class).putExtra("appId", mo48798x74292566).putExtra("sendId", optString);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/IWxaLuckyMoneyImpl", "launchReceiveLuckyMoney", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m0
    public void b(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenRedPacket", "onError errCode: %d,errMsg: %s", java.lang.Integer.valueOf(i17), str);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        this.f163888a.a(this.f163890c, this.f163891d.p(str, hashMap));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m0
    public void c(int i17, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenRedPacket", "GetLuckMoneyRequest.onResult");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", 0);
        this.f163888a.a(this.f163890c, this.f163891d.p("ok", hashMap));
    }
}
