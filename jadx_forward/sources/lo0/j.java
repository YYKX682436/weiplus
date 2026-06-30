package lo0;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f401548a;

    /* renamed from: b, reason: collision with root package name */
    public lo0.k f401549b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f401550c;

    public j(org.json.JSONObject groupJson, java.util.Map beautyItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupJson, "groupJson");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beautyItems, "beautyItems");
        java.lang.String optString = groupJson.optString(dm.i4.f66865x76d1ec5a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (!(optString.length() == 0)) {
            org.json.JSONArray optJSONArray = groupJson.optJSONArray("items");
            if (!(optJSONArray == null) && optJSONArray.length() >= 2) {
                java.util.HashMap hashMap = new java.util.HashMap();
                c75.c.d(optJSONArray, new lo0.i(beautyItems, hashMap));
                if (hashMap.size() >= 2) {
                    this.f401548a = optString;
                    this.f401550c = hashMap;
                    this.f401549b = null;
                    return;
                }
                throw new lo0.u("Exclusive group contains less than 2 valid items. ".concat(optString));
            }
            throw new lo0.u("Exclusive group contains less than 2 items. ".concat(optString));
        }
        throw new lo0.u("Exclusive group ID is empty.");
    }

    public j(lo0.j jVar, java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = jVar.f401550c.entrySet().iterator();
        while (it.hasNext()) {
            lo0.k kVar = (lo0.k) map.get((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
            if (!(kVar == null)) {
                hashMap.put(kVar.f401551a, kVar);
            }
        }
        this.f401548a = jVar.f401548a;
        this.f401550c = hashMap;
        this.f401549b = null;
    }
}
