package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class k5 implements com.tencent.mm.plugin.appbrand.jsapi.t1 {
    public boolean a() {
        return (com.tencent.mm.sdk.platformtools.a0.f192447j && com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("gprs_alert", true)) ? false : true;
    }
}
