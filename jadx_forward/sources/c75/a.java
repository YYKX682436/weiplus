package c75;

/* loaded from: classes4.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f121167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(org.json.JSONArray jSONArray) {
        super(1);
        this.f121167d = jSONArray;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17 = obj instanceof org.json.JSONObject;
        org.json.JSONArray jSONArray = this.f121167d;
        if (z17) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object opt = jSONObject.opt(next);
                boolean z18 = opt instanceof org.json.JSONObject;
                c75.c cVar = c75.c.f121170a;
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONArray2, "<this>");
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            c75.c.d(jSONArray2, new c75.a(jSONArray3));
            jSONArray.put(jSONArray3);
        } else {
            jSONArray.put(obj);
        }
        return jz5.f0.f384359a;
    }
}
