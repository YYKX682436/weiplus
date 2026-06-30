package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class sc implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.xc f85152e;

    public sc(com.tencent.mm.plugin.appbrand.launching.xc xcVar, java.lang.String str) {
        this.f85152e = xcVar;
        this.f85151d = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.w("MicroMsg.WeAppLauncher", "openBusinessViewByWebView, user canceled");
        this.f85152e.f85420d = true;
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.e(this.f85151d, null, -3);
    }
}
