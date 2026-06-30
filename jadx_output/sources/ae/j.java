package ae;

/* loaded from: classes7.dex */
public class j implements com.tencent.mm.plugin.appbrand.utils.b3 {
    public j(ae.a aVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("Luggage.AppBrandGameServiceLogicImp", "Inject WAGame Library Script Failed: %s", str);
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void onSuccess(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "Inject WAGame Library Script suc: %s", str);
    }
}
