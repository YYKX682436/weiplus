package l44;

/* loaded from: classes4.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f397603a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f397604b;

    public c3(int i17, java.util.List records, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i19 & 1) != 0 ? 0 : i17;
        records = (i19 & 2) != 0 ? kz5.p0.f395529d : records;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(records, "records");
        this.f397603a = i17;
        this.f397604b = records;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toJSON", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdLocalRecordConfig");
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = this.f397604b.iterator();
            while (it.hasNext()) {
                org.json.JSONObject a17 = ((l44.e3) it.next()).a();
                if (a17 != null) {
                    jSONArray.put(a17);
                }
            }
            jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("records", jSONArray);
            jSONObject.putOpt("timeConfig", java.lang.String.valueOf(this.f397603a));
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLocalRecordHelper", "there is exception when create json object when generate ad record json array");
            jSONObject = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toJSON", "com.tencent.mm.plugin.sns.ad.helper.AdLocalRecordHelper$AdLocalRecordConfig");
        return jSONObject;
    }
}
