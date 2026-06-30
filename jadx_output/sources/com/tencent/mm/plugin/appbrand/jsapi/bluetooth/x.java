package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bluetooth.z f80137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f80139f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.z zVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        super(1);
        this.f80137d = zVar;
        this.f80138e = lVar;
        this.f80139f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        if (kotlin.Result.m527isFailureimpl(value)) {
            value = null;
        }
        java.util.List list = (java.util.List) value;
        int i17 = this.f80139f;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80138e;
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.z zVar = this.f80137d;
        if (list == null) {
            zVar.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, zVar.u(str, jSONObject));
        } else {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put((org.json.JSONObject) ((jz5.n) ((com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo) it.next()).f77860z).getValue());
            }
            java.util.HashMap i18 = kz5.c1.i(new jz5.l("devices", jSONArray));
            zVar.getClass();
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            i18.put("errno", 0);
            lVar.a(i17, zVar.t("ok", i18));
        }
        return jz5.f0.f302826a;
    }
}
