package k91;

/* loaded from: classes7.dex */
public class n {

    /* renamed from: h, reason: collision with root package name */
    public static final k91.n f387215h = new k91.n();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f387216a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f387217b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f387218c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f387219d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f387220e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f387221f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f387222g;

    public n() {
        this.f387222g = new java.util.ArrayList();
        this.f387216a = "";
        this.f387217b = "";
        this.f387218c = "";
        this.f387219d = "";
        this.f387220e = "";
        this.f387221f = false;
    }

    public boolean a(java.lang.String str) {
        java.util.Iterator it = this.f387222g.iterator();
        while (it.hasNext()) {
            if (((k91.o) it.next()).f387230a.equals(nf.z.a(str))) {
                return true;
            }
        }
        return false;
    }

    public n(org.json.JSONObject jSONObject, k91.n nVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f387222g = arrayList;
        nVar = nVar == null ? f387215h : nVar;
        this.f387216a = jSONObject.optString("position", nVar.f387216a);
        this.f387217b = jSONObject.optString("color", nVar.f387217b);
        this.f387218c = jSONObject.optString("selectedColor", nVar.f387218c);
        this.f387219d = jSONObject.optString("backgroundColor", nVar.f387219d);
        this.f387220e = jSONObject.optString("borderStyle", nVar.f387220e);
        this.f387221f = jSONObject.optBoolean("custom", nVar.f387221f);
        arrayList.addAll(nVar.f387222g);
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("list");
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                k91.o oVar = new k91.o(jSONArray.getJSONObject(i17));
                java.util.Iterator it = this.f387222g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (android.text.TextUtils.equals(((k91.o) it.next()).f387230a, oVar.f387230a)) {
                            it.remove();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f387222g.add(oVar);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandAppConfig", e17.getMessage());
        }
    }
}
