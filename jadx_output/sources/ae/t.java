package ae;

/* loaded from: classes7.dex */
public class t implements com.tencent.mm.plugin.appbrand.utils.b3 {
    public t(ae.v vVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.WAGameJsContextInterfaceLU", "Interface port loadJsFiles fail");
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void onSuccess(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsContextInterfaceLU", "Interface port loadJsFiles success");
    }
}
