package fl1;

/* loaded from: classes4.dex */
public class j0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f345329a;

    public j0(fl1.c1 c1Var) {
        this.f345329a = c1Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        fl1.c1 c1Var = this.f345329a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "onReceiveValue, value:%s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("type", "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || !optString.equalsIgnoreCase("ok")) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "onReceiveValue, type:ok");
            c1Var.c(5, 1);
            c1Var.a();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", e17, "launchCommentApplication exception:%s", e17);
        }
    }
}
