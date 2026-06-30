package g03;

/* loaded from: classes8.dex */
public class b implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f348975d;

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Flutter.FlutterDataReportPlugin", "onAttachedToEngine FlutterDataReportPlugin CHANNEL%s", "com.tencent.mm.flutter.datareport");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(flutterPluginBinding.m137983x3b5b91dc(), "com.tencent.mm.flutter.datareport");
        this.f348975d = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f348975d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
        str.getClass();
        if (str.equals("android_idkey_report")) {
            jx3.f.INSTANCE.mo68477x336bdfd8(((java.lang.Integer) c28687x4bb242ff.m138433xa13f5ebd(dm.i4.f66865x76d1ec5a)).intValue(), ((java.lang.Integer) c28687x4bb242ff.m138433xa13f5ebd("key")).intValue(), ((java.lang.Integer) c28687x4bb242ff.m138433xa13f5ebd("value")).intValue(), false);
            result.mo65720x90b54003(null);
            return;
        }
        if (str.equals("android_kv_report")) {
            jx3.f.INSTANCE.mo68478xbd3cda5f(((java.lang.Integer) c28687x4bb242ff.m138433xa13f5ebd(dm.i4.f66865x76d1ec5a)).intValue(), (java.lang.String) c28687x4bb242ff.m138433xa13f5ebd("value"));
            result.mo65720x90b54003(null);
        }
    }
}
