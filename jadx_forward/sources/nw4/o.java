package nw4;

/* loaded from: classes.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f422464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422466f;

    public o(nw4.n nVar, android.os.Bundle bundle, java.lang.String str) {
        this.f422466f = nVar;
        this.f422464d = bundle;
        this.f422465e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.y2 y2Var = new nw4.y2();
        java.util.HashMap hashMap = new java.util.HashMap();
        y2Var.f422323a = hashMap;
        android.os.Bundle bundle = this.f422464d;
        hashMap.put("link", bundle.getString("link"));
        y2Var.f422323a.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, bundle.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
        y2Var.f422323a.put("desc", bundle.getString("desc"));
        y2Var.f422323a.put("appid", bundle.getString("appid"));
        y2Var.f422547d = new org.json.JSONObject();
        y2Var.f422323a.put("img_url", bundle.getString("img_url"));
        y2Var.f422323a.put("use_update_jsapi_data", java.lang.Boolean.valueOf(bundle.getBoolean("use_update_jsapi_data")));
        y2Var.f422545b = "call";
        y2Var.f422546c = "";
        y2Var.f422552i = this.f422465e;
        nw4.n nVar = this.f422466f;
        nVar.f422424e.add(y2Var);
        nVar.l();
    }
}
