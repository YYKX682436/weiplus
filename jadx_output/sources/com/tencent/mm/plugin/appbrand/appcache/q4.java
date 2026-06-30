package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class q4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.r4 f75915e;

    public q4(com.tencent.mm.plugin.appbrand.appcache.r4 r4Var, java.lang.String str) {
        this.f75915e = r4Var;
        this.f75914d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f75914d, 1).show();
        this.f75915e.j();
    }
}
