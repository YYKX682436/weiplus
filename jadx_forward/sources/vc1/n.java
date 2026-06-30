package vc1;

/* loaded from: classes13.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f516550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc1.f2 f516551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f516552f;

    public n(vc1.p1 p1Var, boolean z17, vc1.f2 f2Var, java.lang.String str) {
        this.f516550d = z17;
        this.f516551e = f2Var;
        this.f516552f = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        vc1.f2 f2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/map/mapsdk/DefaultTencentMapView$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f516550d && (f2Var = this.f516551e) != null) {
            java.lang.String str = this.f516552f;
            uc1.e eVar = (uc1.e) f2Var;
            eVar.getClass();
            uc1.f fVar = new uc1.f(null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("mapId", eVar.f507842a);
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddMapControls", "put JSON data error : %s", e17);
            }
            fVar.f163907f = jSONObject.toString();
            eVar.f507843b.i(fVar, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/map/mapsdk/DefaultTencentMapView$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
