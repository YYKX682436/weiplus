package wy5;

/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f532208a;

    /* renamed from: b, reason: collision with root package name */
    public int f532209b;

    /* renamed from: c, reason: collision with root package name */
    public int f532210c;

    /* renamed from: d, reason: collision with root package name */
    public int f532211d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f532212e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f532213f = new java.util.ArrayList();

    public final java.util.HashMap a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f532213f.iterator();
        while (it.hasNext()) {
            arrayList.add(((wy5.e) it.next()).a());
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("left", java.lang.Integer.valueOf(this.f532208a));
        hashMap.put("top", java.lang.Integer.valueOf(this.f532209b));
        hashMap.put("width", java.lang.Integer.valueOf(this.f532210c));
        hashMap.put("height", java.lang.Integer.valueOf(this.f532211d));
        hashMap.put("datas", this.f532212e);
        hashMap.put("childs", arrayList);
        return hashMap;
    }

    public final void b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.f532208a = jSONObject.getInt("left");
            this.f532209b = jSONObject.getInt("top");
            this.f532210c = jSONObject.getInt("width");
            this.f532211d = jSONObject.getInt("height");
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("datas");
            java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                this.f532212e.put(next, jSONObject2.get(next));
            }
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("childs");
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                java.lang.String string = jSONArray.getString(i17);
                wy5.e eVar = new wy5.e();
                eVar.b(string);
                this.f532213f.add(eVar);
            }
        } catch (org.json.JSONException unused) {
        }
    }
}
