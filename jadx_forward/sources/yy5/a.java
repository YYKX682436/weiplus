package yy5;

/* loaded from: classes8.dex */
public class a implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f550016d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f550017e;

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 interfaceC28627xb16524e3) {
        this.f550017e = interfaceC28627xb16524e3.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(flutterPluginBinding.m137983x3b5b91dc(), "github.com/clovisnicolas/flutter_screen");
        this.f550016d = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f550017e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f550017e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f550016d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        if (this.f550017e == null) {
            return;
        }
        java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1135253436:
                if (str.equals("keepOn")) {
                    c17 = 0;
                    break;
                }
                break;
            case -460887769:
                if (str.equals("isKeptOn")) {
                    c17 = 1;
                    break;
                }
                break;
            case 648162385:
                if (str.equals("brightness")) {
                    c17 = 2;
                    break;
                }
                break;
            case 1124545107:
                if (str.equals("setBrightness")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                if (((java.lang.Boolean) c28687x4bb242ff.m138433xa13f5ebd("on")).booleanValue()) {
                    java.lang.System.out.println("Keeping screen on ");
                    this.f550017e.getWindow().addFlags(128);
                } else {
                    java.lang.System.out.println("Not keeping screen on");
                    this.f550017e.getWindow().clearFlags(128);
                }
                result.mo65720x90b54003(null);
                return;
            case 1:
                result.mo65720x90b54003(java.lang.Boolean.valueOf((this.f550017e.getWindow().getAttributes().flags & 128) != 0));
                return;
            case 2:
                android.app.Activity activity = this.f550017e;
                float f17 = 0.0f;
                if (activity != null) {
                    float f18 = activity.getWindow().getAttributes().screenBrightness;
                    if (f18 < 0.0f) {
                        try {
                            f18 = android.provider.Settings.System.getInt(this.f550017e.getContentResolver(), "screen_brightness") / 255.0f;
                        } catch (android.provider.Settings.SettingNotFoundException unused) {
                            f18 = 1.0f;
                        }
                    }
                    f17 = f18;
                }
                result.mo65720x90b54003(java.lang.Float.valueOf(f17));
                return;
            case 3:
                double doubleValue = ((java.lang.Double) c28687x4bb242ff.m138433xa13f5ebd("brightness")).doubleValue();
                android.view.WindowManager.LayoutParams attributes = this.f550017e.getWindow().getAttributes();
                attributes.screenBrightness = (float) doubleValue;
                this.f550017e.getWindow().setAttributes(attributes);
                result.mo65720x90b54003(null);
                return;
            default:
                result.mo65719xbc9fa82f();
                return;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 interfaceC28627xb16524e3) {
        this.f550017e = interfaceC28627xb16524e3.mo137508x19263085();
    }
}
