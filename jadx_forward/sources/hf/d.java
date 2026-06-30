package hf;

/* loaded from: classes11.dex */
public final class d implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f362526d;

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterPluginBinding, "flutterPluginBinding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SkylineCrashReportPlugin", "onAttachedToEngine SkylineCrashReportPlugin CHANNEL%s", "com.tencent.skyline.crashreport");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(flutterPluginBinding.m137983x3b5b91dc(), "com.tencent.skyline.crashreport");
        this.f362526d = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterPluginBinding, "flutterPluginBinding");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f362526d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff methodCall, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(methodCall, "methodCall");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SkylineCrashReportPlugin", "onMethodCall method", methodCall.f71610xbfc5d0e1);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(methodCall.f71610xbfc5d0e1, "crash_report")) {
            java.util.Map map = (java.util.Map) methodCall.m138433xa13f5ebd("crashInfo");
            if (map == null) {
                map = new java.util.HashMap();
            }
            java.lang.Boolean bool = (java.lang.Boolean) methodCall.m138433xa13f5ebd("killSelf");
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            java.lang.String valueOf = java.lang.String.valueOf(map.get("deviceParameters"));
            java.lang.String valueOf2 = java.lang.String.valueOf(map.get("customParameters"));
            java.lang.String valueOf3 = java.lang.String.valueOf(map.get("applicationParameters"));
            java.lang.String valueOf4 = java.lang.String.valueOf(map.get("dateTime"));
            java.lang.String valueOf5 = java.lang.String.valueOf(map.get("context"));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(map.get("error"));
            sb6.append('\n');
            sb6.append(map.get("stackTrace"));
            java.lang.String crashContent = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(crashContent, "crashContent");
            hf.c.f362525a.a(new hf.b(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, crashContent, booleanValue ? 1 : 0));
        }
    }
}
