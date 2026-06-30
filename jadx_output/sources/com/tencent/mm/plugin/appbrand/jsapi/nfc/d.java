package com.tencent.mm.plugin.appbrand.jsapi.nfc;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f82399a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f82400b = true;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v0 f82401c = new com.tencent.mm.plugin.appbrand.jsapi.nfc.b();

    public static void a(java.lang.String str, int i17, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEEventLogic", "HCEEventLogic sendHCEEventToMM appId: %s, eventType: %d", str, java.lang.Integer.valueOf(i17));
        new com.tencent.mm.plugin.appbrand.jsapi.nfc.HCEEventLogic$SendHCEEventToMMTask(str, i17, bundle, null).d();
    }
}
