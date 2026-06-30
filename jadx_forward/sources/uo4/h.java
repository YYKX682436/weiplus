package uo4;

/* loaded from: classes10.dex */
public final class h extends t85.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f511238a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f511239b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final uo4.d f511240c = new uo4.d();

    /* renamed from: d, reason: collision with root package name */
    public boolean f511241d = true;

    @Override // t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (this.f511241d) {
            jSONObject.put("status", this.f511240c.b());
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = this.f511238a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((uo4.f) it.next()).b());
        }
        jSONObject.put("mediaList", jSONArray);
        java.util.ArrayList arrayList = this.f511239b;
        if (!arrayList.isEmpty()) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                jSONArray2.put(((uo4.b) it6.next()).b());
            }
            jSONObject.put("editList", jSONArray2);
        }
        return jSONObject;
    }
}
