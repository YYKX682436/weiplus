package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class yf {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.weapp_core.WeAppDownloader f92429a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f92430b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f92431c = new java.util.HashMap();

    static {
        sk1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.String i17 = com.tencent.mm.vfs.w6.i("wcf://WxaChromiumCronetCache/", true);
        kotlin.jvm.internal.o.d(i17);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.appbrand.wf wfVar = new com.tencent.mm.plugin.appbrand.wf();
        f92429a = wfVar;
        java.lang.String property = java.lang.System.getProperty("http.agent");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (property == null) {
            property = "";
        }
        java.lang.String a17 = ik1.l0.a(context, property, (ik1.k0) nd.f.a(ik1.k0.class));
        kotlin.jvm.internal.o.d(a17);
        wfVar.initialize(a17, i17, false);
    }
}
