package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t f85667e;

    public r(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t tVar, android.content.Context context) {
        this.f85667e = tVar;
        this.f85666d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f85666d;
        if (context instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI) {
            ((com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI) context).finish();
        }
    }
}
