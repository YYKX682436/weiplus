package e53;

@mk0.a
/* loaded from: classes.dex */
public class f implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.util.Set<java.lang.String> keySet;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null || (keySet = bundle.keySet()) == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            for (java.lang.String str : keySet) {
                jSONObject.put(str, bundle.get(str));
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5571xfff98751 c5571xfff98751 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5571xfff98751();
            am.le leVar = c5571xfff98751.f135891g;
            leVar.f88776a = 4;
            leVar.f88777b = jSONObject.toString();
            c5571xfff98751.e();
        } catch (org.json.JSONException unused) {
        }
    }
}
