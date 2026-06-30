package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public class k0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33801x366c91de = 297;

    /* renamed from: NAME */
    public static final java.lang.String f33802x24728b = "operateAudio";

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.z1 f160772g;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) jh1.a.f381328d;
        if (!(!concurrentHashMap.containsKey(mo48798x74292566) ? false : ((java.lang.Boolean) concurrentHashMap.get(mo48798x74292566)).booleanValue())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiOperateAudio", "can't do operateAudio, App is paused or background");
            lVar.a(i17, o("fail:App is paused or background"));
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiOperateAudio", "operateAudio data is null");
            lVar.a(i17, o("fail:data is null"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiOperateAudio", "operateAudio appId:%s, data:%s", lVar.mo48798x74292566(), jSONObject.toString());
        java.lang.String optString = jSONObject.optString("audioId");
        int optInt = jSONObject.optInt("currentTime", 0);
        java.lang.String optString2 = jSONObject.optString("operationType");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiOperateAudio", "audioId is empty");
            lVar.a(i17, o("fail:audioId is empty"));
            return;
        }
        if (android.text.TextUtils.isEmpty(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiOperateAudio", "operationType is empty");
            lVar.a(i17, o("fail:operationType is empty"));
            return;
        }
        if (this.f160772g == null) {
            this.f160772g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.z1(lVar);
        }
        this.f160772g.f160851e = lVar.mo48798x74292566();
        this.f160772g.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.j0(this, lVar, i17);
        j0Var.f160740g = lVar.mo48798x74292566();
        j0Var.f160741h = optString;
        j0Var.f160743m = optInt;
        j0Var.f160742i = optString2;
        if (optString2.equalsIgnoreCase(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27)) {
            long j17 = 0;
            long optLong = jSONObject.optLong(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (optLong > 0 && optLong < currentTimeMillis) {
                j17 = currentTimeMillis - optLong;
            }
            j0Var.f160748r = j17;
            j0Var.f160749s = currentTimeMillis;
        }
        jh1.b bVar = (jh1.b) ((java.util.concurrent.ConcurrentHashMap) jh1.a.f381325a).get(optString);
        if (bVar != null) {
            j0Var.f160744n = bVar.f381330b;
            j0Var.f160745o = bVar.f381329a;
            j0Var.f160747q = bVar.f381331c;
        }
        j0Var.f160746p = bm5.f1.a();
        j0Var.c();
    }
}
