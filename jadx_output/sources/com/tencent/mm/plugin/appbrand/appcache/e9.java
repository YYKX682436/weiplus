package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class e9 extends m81.b {
    public e9(java.lang.String str, int i17, int i18, java.lang.String str2) {
        super(java.lang.String.format("WxaPkg_%s_%d", str, java.lang.Integer.valueOf(i18)), f(str, i18), str2, str, i18, i17);
    }

    public static java.lang.String f(java.lang.String str, int i17) {
        return com.tencent.mm.plugin.appbrand.appcache.d9.e(str) + java.lang.String.format("_%d_%d.wxapkg", java.lang.Integer.valueOf(str.hashCode()), java.lang.Integer.valueOf(i17));
    }
}
