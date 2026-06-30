package kf1;

/* loaded from: classes.dex */
public class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72437x366c91de = 469;

    /* renamed from: NAME */
    public static final java.lang.String f72438x24728b = "getAvailableAudioSources";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = jSONObject != null ? jSONObject.toString() : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetAvailableAudioSources", "getAvailableAudioSources data:%s", objArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("auto");
        arrayList.add("mic");
        arrayList.add("camcorder");
        arrayList.add("voice_recognition");
        arrayList.add("voice_communication");
        if (fp.h.c(24)) {
            arrayList.add("unprocessed");
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((java.lang.String) it.next());
        }
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("audioSources", jSONArray);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetAvailableAudioSources", "getAvailableAudioSources ret:%s", hashMap.toString());
        lVar.a(i17, p("ok", hashMap));
    }
}
