package c75;

/* loaded from: classes4.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f39634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(org.json.JSONArray jSONArray) {
        super(1);
        this.f39634d = jSONArray;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17 = obj instanceof org.json.JSONObject;
        org.json.JSONArray jSONArray = this.f39634d;
        if (z17) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
            kotlin.jvm.internal.o.g(jSONObject, "<this>");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object opt = jSONObject.opt(next);
                boolean z18 = opt instanceof org.json.JSONObject;
                c75.c cVar = c75.c.f39637a;
                if (z18) {
                    opt = cVar.c((org.json.JSONObject) opt);
                } else if (opt instanceof org.json.JSONArray) {
                    opt = cVar.b((org.json.JSONArray) opt);
                }
                jSONObject2.put(next, opt);
            }
            jSONArray.put(jSONObject2);
        } else if (obj instanceof org.json.JSONArray) {
            org.json.JSONArray jSONArray2 = (org.json.JSONArray) obj;
            kotlin.jvm.internal.o.g(jSONArray2, "<this>");
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            c75.c.d(jSONArray2, new c75.a(jSONArray3));
            jSONArray.put(jSONArray3);
        } else {
            jSONArray.put(obj);
        }
        return jz5.f0.f302826a;
    }
}
