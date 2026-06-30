package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.DeferredComponentChannel */
/* loaded from: classes13.dex */
public class C28654x1f81a365 {
    private static final java.lang.String TAG = "DeferredComponentChannel";

    /* renamed from: channel */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f71290x2c0b7d03;

    /* renamed from: componentNameToResults */
    private java.util.Map<java.lang.String, java.util.List<io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result>> f71291xa05ebcb3;

    /* renamed from: deferredComponentManager */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f f71292xa57111ef;

    /* renamed from: parsingMethodHandler */
    final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71293xf115c659;

    public C28654x1f81a365(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.1
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
            /* renamed from: onMethodCall */
            public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28654x1f81a365.this.f71292xa57111ef == null) {
                    return;
                }
                java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
                java.util.Map map = (java.util.Map) c28687x4bb242ff.m138434x86ac7956();
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28654x1f81a365.TAG, "Received '" + str + "' message.");
                int intValue = ((java.lang.Integer) map.get("loadingUnitId")).intValue();
                java.lang.String str2 = (java.lang.String) map.get("componentName");
                str.getClass();
                char c17 = 65535;
                switch (str.hashCode()) {
                    case -1004447972:
                        if (str.equals("uninstallDeferredComponent")) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case 399701758:
                        if (str.equals("getDeferredComponentInstallState")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case 520962947:
                        if (str.equals("installDeferredComponent")) {
                            c17 = 2;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28654x1f81a365.this.f71292xa57111ef.mo137896xc421571c(intValue, str2);
                        result.mo65720x90b54003(null);
                        return;
                    case 1:
                        result.mo65720x90b54003(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28654x1f81a365.this.f71292xa57111ef.mo137890x17d2f6fe(intValue, str2));
                        return;
                    case 2:
                        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28654x1f81a365.this.f71292xa57111ef.mo137891x1f0d4383(intValue, str2);
                        if (!io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28654x1f81a365.this.f71291xa05ebcb3.containsKey(str2)) {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28654x1f81a365.this.f71291xa05ebcb3.put(str2, new java.util.ArrayList());
                        }
                        ((java.util.List) io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28654x1f81a365.this.f71291xa05ebcb3.get(str2)).add(result);
                        return;
                    default:
                        result.mo65719xbc9fa82f();
                        return;
                }
            }
        };
        this.f71293xf115c659 = methodCallHandler;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28604xeb2eb192, "flutter/deferredcomponent", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98.f71637x4fbc8495);
        this.f71290x2c0b7d03 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(methodCallHandler);
        this.f71292xa57111ef = io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136949xa57111ef();
        this.f71291xa05ebcb3 = new java.util.HashMap();
    }

    /* renamed from: completeInstallError */
    public void m138161x4ddd7d06(java.lang.String str, java.lang.String str2) {
        if (this.f71291xa05ebcb3.containsKey(str)) {
            java.util.Iterator<io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result> it = this.f71291xa05ebcb3.get(str).iterator();
            while (it.hasNext()) {
                it.next().mo65718x5c4d208("DeferredComponent Install failure", str2, null);
            }
            this.f71291xa05ebcb3.get(str).clear();
        }
    }

    /* renamed from: completeInstallSuccess */
    public void m138162x354f2381(java.lang.String str) {
        if (this.f71291xa05ebcb3.containsKey(str)) {
            java.util.Iterator<io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result> it = this.f71291xa05ebcb3.get(str).iterator();
            while (it.hasNext()) {
                it.next().mo65720x90b54003(null);
            }
            this.f71291xa05ebcb3.get(str).clear();
        }
    }

    /* renamed from: setDeferredComponentManager */
    public void m138163x854a6c71(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3289xd28d8035.InterfaceC28611x253f360f interfaceC28611x253f360f) {
        this.f71292xa57111ef = interfaceC28611x253f360f;
    }
}
