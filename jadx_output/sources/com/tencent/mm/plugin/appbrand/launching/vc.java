package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class vc implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.g6 f85303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85305f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.xc f85306g;

    public vc(com.tencent.mm.plugin.appbrand.launching.xc xcVar, com.tencent.mm.plugin.appbrand.service.g6 g6Var, java.lang.String str, java.lang.String str2) {
        this.f85306g = xcVar;
        this.f85303d = g6Var;
        this.f85304e = str;
        this.f85305f = str2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.w("MicroMsg.WeAppLauncher", "openBusinessViewByOpenSdk, user canceled");
        this.f85306g.f85420d = true;
        this.f85303d.e();
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.z.b(null, this.f85304e, null, this.f85305f, -2);
    }
}
