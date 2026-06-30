package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class o9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f86970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w9 f86971e;

    public o9(com.tencent.mm.plugin.appbrand.page.w9 w9Var, java.util.Map map) {
        this.f86971e = w9Var;
        this.f86970d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.xweb.z0 settings;
        settings = super/*com.tencent.xweb.WebView*/.getSettings();
        settings.j(this.f86970d);
    }
}
