package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public final class eb extends qj1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f75517f = com.tencent.mm.plugin.appbrand.appcache.cb.f75481t;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f75518e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(l75.k0 db6) {
        super(db6, com.tencent.mm.plugin.appbrand.appcache.cb.f75480s, "WxaPluginCodeVersionInfo", dm.ad.f235757h);
        kotlin.jvm.internal.o.g(db6, "db");
        this.f75518e = db6;
    }

    public final java.lang.String y0(java.lang.String id6, int i17) {
        kotlin.jvm.internal.o.g(id6, "id");
        com.tencent.mm.plugin.appbrand.appcache.cb cbVar = new com.tencent.mm.plugin.appbrand.appcache.cb();
        cbVar.field_pluginAppID = id6;
        cbVar.field_pluginAppVersion = i17;
        java.lang.String str = get(cbVar, new java.lang.String[0]) ? cbVar.field_pluginStringVersion : null;
        com.tencent.mars.xlog.Log.i("Luggage.WxaPluginCodeVersionInfoStorage", "getPluginStringVersion with id:" + id6 + " version:" + i17 + ", returns:" + str);
        return str;
    }
}
