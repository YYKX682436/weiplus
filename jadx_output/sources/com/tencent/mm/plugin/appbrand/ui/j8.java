package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes.dex */
public class j8 implements com.tencent.mm.plugin.appbrand.ca {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh0.t f89806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUI f89807b;

    public j8(com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI, uh0.t tVar) {
        this.f89807b = appBrandUI;
        this.f89806a = tVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ca
    public void b() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ca
    public void d() {
        final uh0.t tVar = this.f89806a;
        this.f89807b.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.ui.j8$$a
            @Override // java.lang.Runnable
            public final void run() {
                ((th0.y) uh0.t.this).wi(com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
        });
    }
}
