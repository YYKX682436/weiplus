package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class e implements com.tencent.mm.plugin.appbrand.jsapi.s1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f85947a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f85948b = "";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.s1
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MenuDelegate_CopyPath", "onReturnUrl %s", str);
        com.tencent.mm.plugin.appbrand.report.v0.e(this.f85947a, this.f85948b, 26, "", com.tencent.mm.sdk.platformtools.t8.i1(), str.isEmpty() ? 2 : 1, 0);
        com.tencent.mm.plugin.appbrand.jsapi.vf.f83519a.c(com.tencent.mm.plugin.appbrand.jsapi.d1.f80732e, this);
    }
}
