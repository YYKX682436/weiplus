package g03;

/* loaded from: classes8.dex */
public class c implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f348976d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f348977e;

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Flutter.FlutterLvCppHandler", "onAttachedToEngine FlutterLvCppHandler CHANNEL%s", "com.tencent.mm.mmflutter.lvcppmethod");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(flutterPluginBinding.m137983x3b5b91dc(), "com.tencent.mm.mmflutter.lvcppmethod");
        this.f348976d = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(this);
        this.f348977e = flutterPluginBinding.m137982x6e669035();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        this.f348976d.m138441xdf757329(null);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        if (!c28687x4bb242ff.f71610xbfc5d0e1.equals("getDisplayParams")) {
            result.mo65719xbc9fa82f();
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            android.util.DisplayMetrics displayMetrics = this.f348977e.getResources().getDisplayMetrics();
            android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(this.f348977e);
            jSONObject.put("screenWidth", h17.x);
            jSONObject.put("screenHeight", h17.y);
            jSONObject.put("densityDpi", displayMetrics.densityDpi);
            jSONObject.put("density", displayMetrics.density);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Flutter.FlutterLvCppHandler", e17, "", new java.lang.Object[0]);
        }
        result.mo65720x90b54003(jSONObject.toString());
    }
}
