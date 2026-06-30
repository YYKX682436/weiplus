package yf1;

/* loaded from: classes7.dex */
public class l implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pd1.i f543178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yf1.o f543179b;

    public l(yf1.o oVar, pd1.i iVar) {
        this.f543179b = oVar;
        this.f543178a = iVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        pd1.i iVar = this.f543178a;
        yf1.o oVar = this.f543179b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.XWebLivePlayerOriginVideoContainer", "getVideoPositionAsync, value: " + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            wf.b bVar = oVar.f543184a;
            bVar.f526959s = ik1.w.c(jSONObject.optInt("x", bVar.f526959s));
            bVar.f526960t = ik1.w.c(jSONObject.optInt("y", bVar.f526960t));
            bVar.w();
            wf.b bVar2 = oVar.f543184a;
            iVar.a(bVar2.f526959s, bVar2.f526960t);
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.XWebLivePlayerOriginVideoContainer", "getVideoPositionAsync, parse " + str + " failed");
            wf.b bVar3 = oVar.f543184a;
            iVar.a(bVar3.f526959s, bVar3.f526960t);
        }
    }
}
