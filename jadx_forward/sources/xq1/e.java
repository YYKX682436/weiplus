package xq1;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f537559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xq1.f f537560e;

    public e(xq1.f fVar, org.json.JSONObject jSONObject) {
        this.f537560e = fVar;
        this.f537559d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String jSONObject = this.f537559d.toString();
        wq1.d dVar = this.f537560e.f537561a;
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("requestCompleted")) {
                return;
            }
            if (jSONObject == null) {
                jSONObject = "";
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = "requestCompleted";
            objArr[1] = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jSONObject) || jSONObject.length() <= 50) ? jSONObject : jSONObject.substring(0, 50);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.BoxJsEventNotifier", "notifyJsEvent %s %s", objArr);
            dVar.c().mo14660x738236e6(java.lang.String.format("javascript:boxJSApi['%s'] && boxJSApi.%s(%s)", "requestCompleted", "requestCompleted", jSONObject), null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Box.BoxJsEventNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
        }
    }
}
