package com.tencent.mm.plugin.appbrand.jsapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class JsApiLaunchApplicationDirectly$LaunchApplicationTask extends com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.u7();

    /* renamed from: i, reason: collision with root package name */
    public int f78556i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f78557m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f78558n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f78559o;

    /* renamed from: p, reason: collision with root package name */
    public android.os.Bundle f78560p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f78561q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Runnable f78562r;

    public JsApiLaunchApplicationDirectly$LaunchApplicationTask(android.app.Activity activity) {
        super(activity);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask
    public void b(android.os.Parcel parcel) {
        this.f78556i = parcel.readInt();
        this.f78557m = parcel.readString();
        this.f78558n = parcel.readString();
        this.f78559o = parcel.readString();
        this.f78560p = parcel.readBundle();
        this.f78561q = parcel.readByte() == 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "runInClientProcess");
        if (this.f78562r != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "runInClientProcess asyncCallback != null");
            ((com.tencent.mm.plugin.appbrand.jsapi.m7) this.f78562r).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask
    public void d(final android.content.Context context, final com.tencent.mm.plugin.appbrand.ipc.r rVar) {
        if (android.os.Looper.myLooper() == null) {
            e(context, rVar);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask> creator = com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask.CREATOR;
                com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask.this.e(context, rVar);
            }
        });
    }

    public final void e(android.content.Context context, com.tencent.mm.plugin.appbrand.ipc.r rVar) {
        java.lang.String str;
        if (!android.text.TextUtils.isEmpty(this.f78557m)) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str2 = this.f78557m;
            ((kt.c) i0Var).getClass();
            if (com.tencent.mm.pluginsdk.model.app.w.j(str2, false, false) == null) {
                lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str3 = this.f78557m;
                ((kt.c) i0Var2).getClass();
                com.tencent.mm.pluginsdk.model.app.w.k(str3, true);
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.t7 t7Var = new com.tencent.mm.plugin.appbrand.jsapi.t7(this, rVar);
        com.tencent.mm.plugin.appbrand.jsapi.w7 w7Var = new com.tencent.mm.plugin.appbrand.jsapi.w7(t7Var);
        com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject();
        wXAppExtendObject.extInfo = this.f78559o;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXAppExtendObject);
        wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
        wXMediaMessage.messageExt = this.f78559o;
        com.tencent.mm.autogen.events.Launch3RdAppEvent launch3RdAppEvent = new com.tencent.mm.autogen.events.Launch3RdAppEvent();
        am.ki kiVar = launch3RdAppEvent.f54461g;
        kiVar.f7149a = wXMediaMessage;
        kiVar.f7150b = this.f78557m;
        kiVar.f7151c = this.f78556i;
        kiVar.f7152d = context;
        kiVar.f7154f = this.f78560p;
        kiVar.f7153e = w7Var;
        launch3RdAppEvent.e();
        boolean z17 = launch3RdAppEvent.f54462h.f7248a;
        if (!z17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f78557m) || com.tencent.mm.sdk.platformtools.t8.K0(this.f78558n)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication nil appId or parameter.");
            } else {
                java.lang.String str4 = this.f78557m + "://" + this.f78558n;
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str4));
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "launchApplication by opensdk failed, try to launch by scheme(%s).", str4);
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
                        w7Var.f83716c = false;
                        w7Var.f83715b = false;
                        w7Var.f83717d = false;
                        w7Var.f83714a = false;
                        lt.i0 i0Var4 = (lt.i0) i95.n0.c(lt.i0.class);
                        android.os.Bundle bundle = this.f78560p;
                        ((kt.c) i0Var4).getClass();
                        z17 = com.tencent.mm.pluginsdk.model.app.w.v(context, intent, null, w7Var, bundle);
                    }
                }
            }
        }
        w7Var.f83714a = z17;
        w7Var.f83717d = true;
        if (w7Var.f83716c) {
            t7Var.a(z17, w7Var.f83715b);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f78556i);
        parcel.writeString(this.f78557m);
        parcel.writeString(this.f78558n);
        parcel.writeString(this.f78559o);
        parcel.writeBundle(this.f78560p);
        parcel.writeByte(this.f78561q ? (byte) 1 : (byte) 0);
    }

    public JsApiLaunchApplicationDirectly$LaunchApplicationTask(android.os.Parcel parcel, com.tencent.mm.plugin.appbrand.jsapi.o7 o7Var) {
        b(parcel);
    }
}
