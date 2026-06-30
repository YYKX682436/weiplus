package com.tencent.mm.plugin.appbrand.jsapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class JsApiLaunchApplication$LaunchApplicationTask extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.f7();

    /* renamed from: i, reason: collision with root package name */
    public int f78531i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f78532m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f78533n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f78534o;

    /* renamed from: p, reason: collision with root package name */
    public android.os.Bundle f78535p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f78536q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Runnable f78537r;

    public JsApiLaunchApplication$LaunchApplicationTask(android.app.Activity activity) {
        super(activity);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask
    public void b(android.os.Parcel parcel) {
        this.f78531i = parcel.readInt();
        this.f78532m = parcel.readString();
        this.f78533n = parcel.readString();
        this.f78534o = parcel.readString();
        this.f78535p = parcel.readBundle();
        this.f78536q = parcel.readByte() == 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "runInClientProcess");
        if (this.f78537r != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "runInClientProcess asyncCallback != null");
            ((com.tencent.mm.plugin.appbrand.jsapi.b7) this.f78537r).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask
    public void d(final android.content.Context context, final com.tencent.mm.plugin.appbrand.ipc.r rVar) {
        if (android.os.Looper.myLooper() == null) {
            e(context, rVar);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask> creator = com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask.CREATOR;
                com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask.this.e(context, rVar);
            }
        });
    }

    public final void e(android.content.Context context, com.tencent.mm.plugin.appbrand.ipc.r rVar) {
        java.lang.String str;
        if (!android.text.TextUtils.isEmpty(this.f78532m)) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str2 = this.f78532m;
            ((kt.c) i0Var).getClass();
            if (com.tencent.mm.pluginsdk.model.app.w.j(str2, false, false) == null) {
                lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str3 = this.f78532m;
                ((kt.c) i0Var2).getClass();
                com.tencent.mm.pluginsdk.model.app.w.k(str3, true);
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.h7 h7Var = new com.tencent.mm.plugin.appbrand.jsapi.h7(new com.tencent.mm.plugin.appbrand.jsapi.e7(this, rVar));
        com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject();
        wXAppExtendObject.extInfo = this.f78534o;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXAppExtendObject);
        wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
        wXMediaMessage.messageExt = this.f78534o;
        com.tencent.mm.autogen.events.Launch3RdAppEvent launch3RdAppEvent = new com.tencent.mm.autogen.events.Launch3RdAppEvent();
        am.ki kiVar = launch3RdAppEvent.f54461g;
        kiVar.f7149a = wXMediaMessage;
        kiVar.f7150b = this.f78532m;
        kiVar.f7151c = this.f78531i;
        kiVar.f7152d = context;
        kiVar.f7154f = this.f78535p;
        kiVar.f7153e = h7Var;
        launch3RdAppEvent.e();
        boolean z17 = launch3RdAppEvent.f54462h.f7248a;
        if (!z17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f78532m) || com.tencent.mm.sdk.platformtools.t8.K0(this.f78533n)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "launchApplication nil appId or parameter.");
            } else {
                java.lang.String str4 = this.f78532m + "://" + this.f78533n;
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str4));
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "launchApplication by opensdk failed, try to launch by scheme(%s).", str4);
                intent.addFlags(268435456);
                java.util.List w17 = com.tencent.mm.sdk.platformtools.t8.w1(context, intent);
                if ((w17 != null && !w17.isEmpty()) || com.tencent.mm.sdk.platformtools.t8.w0(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    if (android.text.TextUtils.isEmpty(intent.getPackage()) && w17 != null && w17.size() == 1) {
                        lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
                        android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) w17.get(0);
                        ((kt.c) i0Var3).getClass();
                        str = com.tencent.mm.pluginsdk.model.app.w.o(resolveInfo);
                    } else {
                        str = intent.getPackage();
                    }
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.x2.f193072b;
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (!str5.equals(str)) {
                        h7Var.f81277c = false;
                        h7Var.f81276b = false;
                        h7Var.f81278d = false;
                        h7Var.f81275a = false;
                        lt.i0 i0Var4 = (lt.i0) i95.n0.c(lt.i0.class);
                        android.os.Bundle bundle = this.f78535p;
                        ((kt.c) i0Var4).getClass();
                        z17 = com.tencent.mm.pluginsdk.model.app.w.v(context, intent, null, h7Var, bundle);
                    }
                }
            }
        }
        h7Var.b(z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f78531i);
        parcel.writeString(this.f78532m);
        parcel.writeString(this.f78533n);
        parcel.writeString(this.f78534o);
        parcel.writeBundle(this.f78535p);
        parcel.writeByte(this.f78536q ? (byte) 1 : (byte) 0);
    }

    public JsApiLaunchApplication$LaunchApplicationTask(android.os.Parcel parcel, com.tencent.mm.plugin.appbrand.jsapi.d7 d7Var) {
        b(parcel);
    }
}
