package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class JsApiLaunchApplicationForNative$LaunchApplicationTask extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.c1();

    /* renamed from: i, reason: collision with root package name */
    public int f78879i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f78880m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f78881n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f78882o;

    /* renamed from: p, reason: collision with root package name */
    public android.os.Bundle f78883p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f78884q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Runnable f78885r;

    public JsApiLaunchApplicationForNative$LaunchApplicationTask(android.app.Activity activity) {
        super(activity);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask
    public void b(android.os.Parcel parcel) {
        this.f78879i = parcel.readInt();
        this.f78880m = parcel.readString();
        this.f78881n = parcel.readString();
        this.f78882o = parcel.readString();
        this.f78883p = parcel.readBundle();
        this.f78884q = parcel.readByte() == 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "runInClientProcess");
        if (this.f78885r != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "runInClientProcess asyncCallback != null");
            ((com.tencent.mm.plugin.appbrand.jsapi.appdownload.y0) this.f78885r).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask
    public void d(final android.content.Context context, final com.tencent.mm.plugin.appbrand.ipc.r rVar) {
        if (android.os.Looper.myLooper() == null) {
            e(context, rVar);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask> creator = com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask.CREATOR;
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask.this.e(context, rVar);
            }
        });
    }

    public final void e(android.content.Context context, com.tencent.mm.plugin.appbrand.ipc.r rVar) {
        java.lang.String str;
        if (!android.text.TextUtils.isEmpty(this.f78880m)) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str2 = this.f78880m;
            ((kt.c) i0Var).getClass();
            if (com.tencent.mm.pluginsdk.model.app.w.j(str2, false, false) == null) {
                lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str3 = this.f78880m;
                ((kt.c) i0Var2).getClass();
                com.tencent.mm.pluginsdk.model.app.w.k(str3, true);
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.e1 e1Var = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.e1(new com.tencent.mm.plugin.appbrand.jsapi.appdownload.b1(this, rVar));
        com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject();
        wXAppExtendObject.extInfo = this.f78882o;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXAppExtendObject);
        wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
        wXMediaMessage.messageExt = this.f78882o;
        com.tencent.mm.autogen.events.Launch3RdAppEvent launch3RdAppEvent = new com.tencent.mm.autogen.events.Launch3RdAppEvent();
        am.ki kiVar = launch3RdAppEvent.f54461g;
        kiVar.f7149a = wXMediaMessage;
        kiVar.f7150b = this.f78880m;
        kiVar.f7151c = this.f78879i;
        kiVar.f7152d = context;
        kiVar.f7154f = this.f78883p;
        kiVar.f7153e = e1Var;
        launch3RdAppEvent.e();
        boolean z17 = launch3RdAppEvent.f54462h.f7248a;
        if (!z17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f78880m) || com.tencent.mm.sdk.platformtools.t8.K0(this.f78881n)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "launchApplication nil appId or parameter.");
            } else {
                java.lang.String str4 = this.f78880m + "://" + this.f78881n;
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str4));
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "launchApplication by opensdk failed, try to launch by scheme(%s).", str4);
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
                        e1Var.f78953c = false;
                        e1Var.f78952b = false;
                        e1Var.f78954d = false;
                        e1Var.f78951a = false;
                        lt.i0 i0Var4 = (lt.i0) i95.n0.c(lt.i0.class);
                        android.os.Bundle bundle = this.f78883p;
                        ((kt.c) i0Var4).getClass();
                        z17 = com.tencent.mm.pluginsdk.model.app.w.v(context, intent, null, e1Var, bundle);
                    }
                }
            }
        }
        e1Var.b(z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f78879i);
        parcel.writeString(this.f78880m);
        parcel.writeString(this.f78881n);
        parcel.writeString(this.f78882o);
        parcel.writeBundle(this.f78883p);
        parcel.writeByte(this.f78884q ? (byte) 1 : (byte) 0);
    }

    public JsApiLaunchApplicationForNative$LaunchApplicationTask(android.os.Parcel parcel, com.tencent.mm.plugin.appbrand.jsapi.appdownload.a1 a1Var) {
        b(parcel);
    }
}
